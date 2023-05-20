package net.iceworks.arcanesouls.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.iceworks.arcanesouls.init.ArcaneSoulsModBlocks;

public class AdoriteOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction, Entity entity) {
		if (direction == null || entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.FLINT_AND_STEEL
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.FLINT_AND_STEEL) {
			if (direction.getAxis() == Direction.Axis.Y) {
				if (Blocks.FIRE.defaultBlockState().canSurvive(world, new BlockPos(x, y + 1, z))) {
					world.setBlock(new BlockPos(x, y + 1, z), ArcaneSoulsModBlocks.LIGHTFLAME.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
