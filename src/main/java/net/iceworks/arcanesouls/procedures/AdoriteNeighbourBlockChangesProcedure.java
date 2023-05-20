package net.iceworks.arcanesouls.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.iceworks.arcanesouls.init.ArcaneSoulsModBlocks;

public class AdoriteNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.FIRE) {
			world.setBlock(new BlockPos(x, y + 1, z), ArcaneSoulsModBlocks.LIGHTFLAME.get().defaultBlockState(), 3);
		}
	}
}
