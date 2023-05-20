package net.iceworks.arcanesouls.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class CollectibleSoulBasePlayerCollidesWithThisEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player _player)
			_player.giveExperienceLevels(10);
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
