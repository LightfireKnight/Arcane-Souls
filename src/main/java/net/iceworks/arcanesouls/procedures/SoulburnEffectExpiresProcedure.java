package net.iceworks.arcanesouls.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.iceworks.arcanesouls.init.ArcaneSoulsModMobEffects;

public class SoulburnEffectExpiresProcedure {
	public static void execute(Entity entity, double amplifier) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(ArcaneSoulsModMobEffects.SOULBURN.get(), 100, (int) (amplifier - 1)));
	}
}
