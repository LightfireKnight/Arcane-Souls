
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.iceworks.arcanesouls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.iceworks.arcanesouls.potion.SoulburnMobEffect;
import net.iceworks.arcanesouls.potion.RadiantBurnsMobEffect;
import net.iceworks.arcanesouls.ArcaneSoulsMod;

public class ArcaneSoulsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ArcaneSoulsMod.MODID);
	public static final RegistryObject<MobEffect> SOULBURN = REGISTRY.register("soulburn", () -> new SoulburnMobEffect());
	public static final RegistryObject<MobEffect> RADIANT_BURNS = REGISTRY.register("radiant_burns", () -> new RadiantBurnsMobEffect());
}
