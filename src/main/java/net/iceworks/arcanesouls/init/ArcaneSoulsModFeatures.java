
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.iceworks.arcanesouls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.iceworks.arcanesouls.world.features.plants.PurpleViolFeature;
import net.iceworks.arcanesouls.ArcaneSoulsMod;

@Mod.EventBusSubscriber
public class ArcaneSoulsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ArcaneSoulsMod.MODID);
	public static final RegistryObject<Feature<?>> PURPLE_VIOL = REGISTRY.register("purple_viol", PurpleViolFeature::feature);
}
