package net.fabricmc.effcts;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;

public class loot extends InstantStatusEffect {
    public loot() {
        super(StatusEffectCategory.BENEFICIAL, 0x0b6138);
    }

    @Override
    public boolean isInstant() {
        return false;
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean applyUpdateEffect(ServerWorld world, LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity player)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN));

        return super.applyUpdateEffect(world, entity, amplifier);
    }
}
