package net.iceworks.arcanesouls.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.iceworks.arcanesouls.item.ThornItem;

public class ThornItemModel extends AnimatedGeoModel<ThornItem> {
	@Override
	public ResourceLocation getAnimationResource(ThornItem animatable) {
		return new ResourceLocation("arcane_souls", "animations/thorngun.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ThornItem animatable) {
		return new ResourceLocation("arcane_souls", "geo/thorngun.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ThornItem animatable) {
		return new ResourceLocation("arcane_souls", "textures/items/thornguntexture.png");
	}
}
