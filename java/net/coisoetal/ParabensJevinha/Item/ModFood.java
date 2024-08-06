package net.coisoetal.ParabensJevinha.Item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFood {
    public static final FoodProperties ROBALO_ITEM = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.1f).effect(new MobEffectInstance(MobEffects.POISON, 100),0.2f).build();

    public static final FoodProperties DOURADA_ITEM = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.1f).effect(new MobEffectInstance(MobEffects.HUNGER, 100),0.2f).build();

    public static final FoodProperties COOKED_ROBALO = new FoodProperties.Builder().nutrition(4)
            .saturationMod(0.2f).build();

    public static final FoodProperties COOKED_DOURADA = new FoodProperties.Builder().nutrition(4)
            .saturationMod(0.2f).build();

    public static final FoodProperties CEVADA_BREAD = new FoodProperties.Builder().nutrition(10)
            .saturationMod(0.6f).build();









    public static final FoodProperties OPIO = new FoodProperties.Builder().nutrition(0)
            .saturationMod(0.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.BAD_OMEN, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.BLINDNESS, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.DARKNESS, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.HARM, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.INVISIBILITY, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.JUMP, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.LEVITATION, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.UNLUCK, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.WEAKNESS, 10000),1.0f)
            .effect(new MobEffectInstance(MobEffects.WITHER, 10000),1.0f)
            .fast().build();


}
