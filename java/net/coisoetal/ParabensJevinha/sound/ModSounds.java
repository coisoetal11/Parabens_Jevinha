package net.coisoetal.ParabensJevinha.sound;

import net.coisoetal.ParabensJevinha.ParabensJevinha;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ParabensJevinha.MOD_ID);


    public static final RegistryObject<SoundEvent> SOUND_BLOCK_BREAK = registerSoundEvents("sound_block_break");
    public static final RegistryObject<SoundEvent> SOUND_BLOCK_STEP = registerSoundEvents("sound_block_step");
    public static final RegistryObject<SoundEvent> SOUND_BLOCK_FALL = registerSoundEvents("sound_block_fall");
    public static final RegistryObject<SoundEvent> SOUND_BLOCK_PLACE = registerSoundEvents("sound_block_place");
    public static final RegistryObject<SoundEvent> SOUND_BLOCK_HIT = registerSoundEvents("sound_block_hit");
    public static final RegistryObject<SoundEvent> PLUH = registerSoundEvents("pluh");
    public static final RegistryObject<SoundEvent> LONELY_ANDRE = registerSoundEvents("lonely_andre_version");
    public static final RegistryObject<SoundEvent> WINTER = registerSoundEvents("winter");
    public static final RegistryObject<SoundEvent> ART = registerSoundEvents("505");
    public static final RegistryObject<SoundEvent> ERIKA = registerSoundEvents("erika");
    public static final RegistryObject<SoundEvent> BAGATATA = registerSoundEvents("funk_do_bagatata");
    public static final RegistryObject<SoundEvent> MONTAGEM_MYSTERIOUS_GAME = registerSoundEvents("montagem_mysterious_game");
    public static final RegistryObject<SoundEvent> ONE_KISS = registerSoundEvents("one_kiss");
    public static final RegistryObject<SoundEvent> URSS = registerSoundEvents("urss");
    public static final RegistryObject<SoundEvent> WANNA_BE_YOURS = registerSoundEvents("wanna_be_yours");


    public static final ForgeSoundType SOUND_BLOCK_SOUNDS = new ForgeSoundType(1f, 1f,
            ModSounds.SOUND_BLOCK_BREAK, ModSounds.SOUND_BLOCK_STEP, ModSounds.SOUND_BLOCK_PLACE,
            ModSounds.SOUND_BLOCK_HIT, ModSounds.SOUND_BLOCK_FALL);


    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(ParabensJevinha.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
