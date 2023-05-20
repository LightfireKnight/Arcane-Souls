package net.iceworks.arcanesouls.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.iceworks.arcanesouls.entity.CollectibleSoulBaseEntity;

public class CollectibleSoulBaseModel extends AnimatedGeoModel<CollectibleSoulBaseEntity> {
	@Override
	public ResourceLocation getAnimationResource(CollectibleSoulBaseEntity entity) {
		return new ResourceLocation("arcane_souls", "animations/collectiblesoul.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CollectibleSoulBaseEntity entity) {
		return new ResourceLocation("arcane_souls", "geo/collectiblesoul.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CollectibleSoulBaseEntity entity) {
		return new ResourceLocation("arcane_souls", "textures/entities/" + entity.getTexture() + ".png");
	}

}
