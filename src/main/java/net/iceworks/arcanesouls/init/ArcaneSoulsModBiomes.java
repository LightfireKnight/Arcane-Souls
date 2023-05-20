
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.iceworks.arcanesouls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.iceworks.arcanesouls.world.biome.SoulWoodsBiome;
import net.iceworks.arcanesouls.world.biome.SoulPlainsBiome;
import net.iceworks.arcanesouls.world.biome.SoulDeadzoneBiome;
import net.iceworks.arcanesouls.ArcaneSoulsMod;

public class ArcaneSoulsModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, ArcaneSoulsMod.MODID);
	public static final RegistryObject<Biome> SOUL_WOODS = REGISTRY.register("soul_woods", SoulWoodsBiome::createBiome);
	public static final RegistryObject<Biome> SOUL_PLAINS = REGISTRY.register("soul_plains", SoulPlainsBiome::createBiome);
	public static final RegistryObject<Biome> SOUL_DEADZONE = REGISTRY.register("soul_deadzone", SoulDeadzoneBiome::createBiome);
}
