package net.iceworks.arcanesouls.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.iceworks.arcanesouls.init.ArcaneSoulsModMobEffects;

public class SoulburnOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ArcaneSoulsModMobEffects.SOULBURN.get()) ? _livEnt.getEffect(ArcaneSoulsModMobEffects.SOULBURN.get()).getDuration() : 0) % 20 == 0) {
			entity.hurt((new DamageSource("onFire")), 1);
		}
	}
}
