
package net.iceworks.arcanesouls.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.iceworks.arcanesouls.entity.model.CollectibleSoulBaseModel;
import net.iceworks.arcanesouls.entity.CollectibleSoulBaseEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CollectibleSoulBaseRenderer extends GeoEntityRenderer<CollectibleSoulBaseEntity> {
	public CollectibleSoulBaseRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new CollectibleSoulBaseModel());
		this.shadowRadius = 0f;
	}

	@Override
	public RenderType getRenderType(CollectibleSoulBaseEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(0.5f, 0.5f, 0.5f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

	@Override
	protected float getDeathMaxRotation(CollectibleSoulBaseEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
