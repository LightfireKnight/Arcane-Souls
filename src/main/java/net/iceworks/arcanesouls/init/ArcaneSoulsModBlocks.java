
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.iceworks.arcanesouls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.iceworks.arcanesouls.block.TemplatespaceBlockBlock;
import net.iceworks.arcanesouls.block.SoulLavaBlock;
import net.iceworks.arcanesouls.block.SoulAirBlock;
import net.iceworks.arcanesouls.block.SeruliumStoneCrustBlock;
import net.iceworks.arcanesouls.block.SeruliumStoneBlock;
import net.iceworks.arcanesouls.block.PurpleViolBlock;
import net.iceworks.arcanesouls.block.MagicGrassBlock;
import net.iceworks.arcanesouls.block.LightflameBlock;
import net.iceworks.arcanesouls.block.GhostwoodLogBlock;
import net.iceworks.arcanesouls.block.GhostwoodLeavesBlock;
import net.iceworks.arcanesouls.block.EmptinessOfTheSoulRealmBlock;
import net.iceworks.arcanesouls.block.DeadDirtBlock;
import net.iceworks.arcanesouls.block.AdoriteBlock;
import net.iceworks.arcanesouls.ArcaneSoulsMod;

public class ArcaneSoulsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ArcaneSoulsMod.MODID);
	public static final RegistryObject<Block> SOUL_AIR = REGISTRY.register("soul_air", () -> new SoulAirBlock());
	public static final RegistryObject<Block> MAGIC_GRASS = REGISTRY.register("magic_grass", () -> new MagicGrassBlock());
	public static final RegistryObject<Block> GHOSTWOOD_LOG = REGISTRY.register("ghostwood_log", () -> new GhostwoodLogBlock());
	public static final RegistryObject<Block> GHOSTWOOD_LEAVES = REGISTRY.register("ghostwood_leaves", () -> new GhostwoodLeavesBlock());
	public static final RegistryObject<Block> PURPLE_VIOL = REGISTRY.register("purple_viol", () -> new PurpleViolBlock());
	public static final RegistryObject<Block> DEAD_DIRT = REGISTRY.register("dead_dirt", () -> new DeadDirtBlock());
	public static final RegistryObject<Block> SERULIUM_STONE = REGISTRY.register("serulium_stone", () -> new SeruliumStoneBlock());
	public static final RegistryObject<Block> EMPTINESS_OF_THE_SOUL_REALM = REGISTRY.register("emptiness_of_the_soul_realm", () -> new EmptinessOfTheSoulRealmBlock());
	public static final RegistryObject<Block> SERULIUM_STONE_CRUST = REGISTRY.register("serulium_stone_crust", () -> new SeruliumStoneCrustBlock());
	public static final RegistryObject<Block> SOUL_LAVA = REGISTRY.register("soul_lava", () -> new SoulLavaBlock());
	public static final RegistryObject<Block> TEMPLATESPACE_BLOCK = REGISTRY.register("templatespace_block", () -> new TemplatespaceBlockBlock());
	public static final RegistryObject<Block> ADORITE = REGISTRY.register("adorite", () -> new AdoriteBlock());
	public static final RegistryObject<Block> LIGHTFLAME = REGISTRY.register("lightflame", () -> new LightflameBlock());
}
