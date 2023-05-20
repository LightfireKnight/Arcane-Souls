
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.iceworks.arcanesouls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.iceworks.arcanesouls.fluid.SoulLavaFluid;
import net.iceworks.arcanesouls.ArcaneSoulsMod;

public class ArcaneSoulsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, ArcaneSoulsMod.MODID);
	public static final RegistryObject<FlowingFluid> SOUL_LAVA = REGISTRY.register("soul_lava", () -> new SoulLavaFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_SOUL_LAVA = REGISTRY.register("flowing_soul_lava", () -> new SoulLavaFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SOUL_LAVA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SOUL_LAVA.get(), RenderType.translucent());
		}
	}
}
