package net.iceworks.arcanesouls.procedures;

import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.iceworks.arcanesouls.init.ArcaneSoulsModMobEffects;

public class LightflameEntityCollidesInTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.UNDEAD : false) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(ArcaneSoulsModMobEffects.RADIANT_BURNS.get(), 180, 0, (false), (true)));
		}
	}
}
