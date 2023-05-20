
package net.iceworks.arcanesouls.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.iceworks.arcanesouls.procedures.RadiantBurnsOnEffectActiveTickProcedure;
import net.iceworks.arcanesouls.procedures.RadiantBurnsEffectStartedappliedProcedure;

public class RadiantBurnsMobEffect extends MobEffect {
	public RadiantBurnsMobEffect() {
		super(MobEffectCategory.HARMFUL, -798);
	}

	@Override
	public String getDescriptionId() {
		return "effect.arcane_souls.radiant_burns";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		RadiantBurnsEffectStartedappliedProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RadiantBurnsOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
