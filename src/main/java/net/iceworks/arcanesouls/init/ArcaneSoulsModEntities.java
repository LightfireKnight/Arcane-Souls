
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.iceworks.arcanesouls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.iceworks.arcanesouls.entity.ThornProjectileEntity;
import net.iceworks.arcanesouls.entity.FlechetteProjectileEntity;
import net.iceworks.arcanesouls.entity.CollectibleSoulBaseEntity;
import net.iceworks.arcanesouls.ArcaneSoulsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArcaneSoulsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ArcaneSoulsMod.MODID);
	public static final RegistryObject<EntityType<CollectibleSoulBaseEntity>> COLLECTIBLE_SOUL_BASE = register("collectible_soul_base", EntityType.Builder.<CollectibleSoulBaseEntity>of(CollectibleSoulBaseEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CollectibleSoulBaseEntity::new).fireImmune().sized(0.6f, 0.9f));
	public static final RegistryObject<EntityType<ThornProjectileEntity>> THORN_PROJECTILE = register("projectile_thorn_projectile", EntityType.Builder.<ThornProjectileEntity>of(ThornProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ThornProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlechetteProjectileEntity>> FLECHETTE_PROJECTILE = register("projectile_flechette_projectile", EntityType.Builder.<FlechetteProjectileEntity>of(FlechetteProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FlechetteProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CollectibleSoulBaseEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(COLLECTIBLE_SOUL_BASE.get(), CollectibleSoulBaseEntity.createAttributes().build());
	}
}
