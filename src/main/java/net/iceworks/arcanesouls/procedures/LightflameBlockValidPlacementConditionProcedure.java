package net.iceworks.arcanesouls.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class LightflameBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (Blocks.FIRE.defaultBlockState().canSurvive(world, new BlockPos(x, y, z))) {
			return true;
		}
		return false;
	}
}
