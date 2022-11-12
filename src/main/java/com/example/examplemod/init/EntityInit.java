package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.Reference;
import com.example.examplemod.entity.ghost.EntityGhost;
import net.minecraft.entity.Entity;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit
{
    public static void registerEntities()
    {
        registerEntity("Ghost", EntityGhost.class, Reference.ENTITY_TEST, 50, 5923, 6096);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
    {
       EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name) , entity, name, id, ExampleMod.instance, range, 1, true, color1, color2);
    }

    private static void registerNonMobEntity()
    {

    }
}
