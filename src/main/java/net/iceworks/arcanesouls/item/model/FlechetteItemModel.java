package net.iceworks.arcanesouls.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.iceworks.arcanesouls.item.FlechetteItem;

public class FlechetteItemModel extends AnimatedGeoModel<FlechetteItem> {
	@Override
	public ResourceLocation getAnimationResource(FlechetteItem animatable) {
		return new ResourceLocation("arcane_souls", "animations/thorngun.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlechetteItem animatable) {
		return new ResourceLocation("arcane_souls", "geo/thorngun.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlechetteItem animatable) {
		return new ResourceLocation("arcane_souls", "textures/items/thornguntexture.png");
	}
}
