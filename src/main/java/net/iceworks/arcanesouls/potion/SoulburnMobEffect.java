
package net.iceworks.arcanesouls.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.iceworks.arcanesouls.procedures.SoulburnOnEffectActiveTickProcedure;
import net.iceworks.arcanesouls.procedures.SoulburnEffectStartedappliedProcedure;
import net.iceworks.arcanesouls.procedures.SoulburnEffectExpiresProcedure;

public class SoulburnMobEffect extends MobEffect {
	public SoulburnMobEffect() {
		super(MobEffectCategory.HARMFUL, -13382401);
	}

	@Override
	public String getDescriptionId() {
		return "effect.arcane_souls.soulburn";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		SoulburnEffectStartedappliedProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity, amplifier);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SoulburnOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		SoulburnEffectExpiresProcedure.execute(entity, amplifier);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
