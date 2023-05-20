package net.iceworks.arcanesouls.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.iceworks.arcanesouls.init.ArcaneSoulsModBlocks;

public class AdoriteEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.UNDEAD : false) {
			if (Blocks.FIRE.defaultBlockState().canSurvive(world, new BlockPos(x, y + 1, z))) {
				world.setBlock(new BlockPos(x, y + 1, z), ArcaneSoulsModBlocks.LIGHTFLAME.get().defaultBlockState(), 3);
			}
		}
	}
}
