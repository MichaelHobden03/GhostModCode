package com.example.examplemod.Util;

import com.example.examplemod.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

public class SoundsHandler {

    public static SoundEvent Ghost_Ambient;
    public static SoundEvent Ghost_Hurt;
    public static SoundEvent Ghost_Death;

    public static void registerSounds() {
        Ghost_Ambient = registerSound("entity.ghost.ghost_ambient");
        Ghost_Hurt = registerSound("entity.ghost.ghost_hurt");
        Ghost_Death = registerSound("entity.ghost.ghost_death");
    }

    private static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
