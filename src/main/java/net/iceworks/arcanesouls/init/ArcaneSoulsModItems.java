
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.iceworks.arcanesouls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.iceworks.arcanesouls.item.ThornProjectileItem;
import net.iceworks.arcanesouls.item.ThornItem;
import net.iceworks.arcanesouls.item.SummonGileadItem;
import net.iceworks.arcanesouls.item.SoulLavaItem;
import net.iceworks.arcanesouls.item.FlechetteProjectileItem;
import net.iceworks.arcanesouls.item.FlechetteItem;
import net.iceworks.arcanesouls.ArcaneSoulsMod;

public class ArcaneSoulsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ArcaneSoulsMod.MODID);
	public static final RegistryObject<Item> SOUL_AIR = block(ArcaneSoulsModBlocks.SOUL_AIR, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> MAGIC_GRASS = block(ArcaneSoulsModBlocks.MAGIC_GRASS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GHOSTWOOD_LOG = block(ArcaneSoulsModBlocks.GHOSTWOOD_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GHOSTWOOD_LEAVES = block(ArcaneSoulsModBlocks.GHOSTWOOD_LEAVES, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PURPLE_VIOL = block(ArcaneSoulsModBlocks.PURPLE_VIOL, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DEAD_DIRT = block(ArcaneSoulsModBlocks.DEAD_DIRT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SERULIUM_STONE = block(ArcaneSoulsModBlocks.SERULIUM_STONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> EMPTINESS_OF_THE_SOUL_REALM = block(ArcaneSoulsModBlocks.EMPTINESS_OF_THE_SOUL_REALM, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SERULIUM_STONE_CRUST = block(ArcaneSoulsModBlocks.SERULIUM_STONE_CRUST, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SOUL_LAVA_BUCKET = REGISTRY.register("soul_lava_bucket", () -> new SoulLavaItem());
	public static final RegistryObject<Item> TEMPLATESPACE_BLOCK = block(ArcaneSoulsModBlocks.TEMPLATESPACE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ADORITE = block(ArcaneSoulsModBlocks.ADORITE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LIGHTFLAME = block(ArcaneSoulsModBlocks.LIGHTFLAME, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> COLLECTIBLE_SOUL_BASE_SPAWN_EGG = REGISTRY.register("collectible_soul_base_spawn_egg",
			() -> new ForgeSpawnEggItem(ArcaneSoulsModEntities.COLLECTIBLE_SOUL_BASE, -7995615, -5570782, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> THORN = REGISTRY.register("thorn", () -> new ThornItem());
	public static final RegistryObject<Item> THORN_PROJECTILE = REGISTRY.register("thorn_projectile", () -> new ThornProjectileItem());
	public static final RegistryObject<Item> FLECHETTE_PROJECTILE = REGISTRY.register("flechette_projectile", () -> new FlechetteProjectileItem());
	public static final RegistryObject<Item> FLECHETTE = REGISTRY.register("flechette", () -> new FlechetteItem());
	public static final RegistryObject<Item> SUMMON_GILEAD = REGISTRY.register("summon_gilead", () -> new SummonGileadItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
