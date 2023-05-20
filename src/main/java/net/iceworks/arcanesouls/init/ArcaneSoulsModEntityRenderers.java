
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.iceworks.arcanesouls.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.iceworks.arcanesouls.client.renderer.CollectibleSoulBaseRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ArcaneSoulsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ArcaneSoulsModEntities.COLLECTIBLE_SOUL_BASE.get(), CollectibleSoulBaseRenderer::new);
		event.registerEntityRenderer(ArcaneSoulsModEntities.THORN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArcaneSoulsModEntities.FLECHETTE_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
