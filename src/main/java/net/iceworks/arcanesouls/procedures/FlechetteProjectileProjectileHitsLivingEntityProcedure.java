package net.iceworks.arcanesouls.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.iceworks.arcanesouls.init.ArcaneSoulsModMobEffects;

public class FlechetteProjectileProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(ArcaneSoulsModMobEffects.SOULBURN.get()) : false) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(ArcaneSoulsModMobEffects.SOULBURN.get(),
						(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ArcaneSoulsModMobEffects.SOULBURN.get()) ? _livEnt.getEffect(ArcaneSoulsModMobEffects.SOULBURN.get()).getDuration() : 0) + 200),
						(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ArcaneSoulsModMobEffects.SOULBURN.get()) ? _livEnt.getEffect(ArcaneSoulsModMobEffects.SOULBURN.get()).getAmplifier() : 0) + 1)));
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(ArcaneSoulsModMobEffects.SOULBURN.get(), 200, 0));
		}
	}
}
