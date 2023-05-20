
package net.iceworks.arcanesouls.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.iceworks.arcanesouls.init.ArcaneSoulsModItems;
import net.iceworks.arcanesouls.init.ArcaneSoulsModFluids;
import net.iceworks.arcanesouls.init.ArcaneSoulsModFluidTypes;
import net.iceworks.arcanesouls.init.ArcaneSoulsModBlocks;

public abstract class SoulLavaFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ArcaneSoulsModFluidTypes.SOUL_LAVA_TYPE.get(), () -> ArcaneSoulsModFluids.SOUL_LAVA.get(), () -> ArcaneSoulsModFluids.FLOWING_SOUL_LAVA.get())
			.explosionResistance(100f).levelDecreasePerBlock(2).slopeFindDistance(3).bucket(() -> ArcaneSoulsModItems.SOUL_LAVA_BUCKET.get()).block(() -> (LiquidBlock) ArcaneSoulsModBlocks.SOUL_LAVA.get());

	private SoulLavaFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SoulLavaFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SoulLavaFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
