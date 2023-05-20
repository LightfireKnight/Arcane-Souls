
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.iceworks.arcanesouls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.iceworks.arcanesouls.fluid.types.SoulLavaFluidType;
import net.iceworks.arcanesouls.ArcaneSoulsMod;

public class ArcaneSoulsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ArcaneSoulsMod.MODID);
	public static final RegistryObject<FluidType> SOUL_LAVA_TYPE = REGISTRY.register("soul_lava", () -> new SoulLavaFluidType());
}
