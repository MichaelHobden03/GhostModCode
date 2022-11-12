package com.example.examplemod.events;

import com.example.examplemod.entity.ghost.EntityGhost;
import com.example.examplemod.init.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

public class LootTableEvent {
    @SubscribeEvent
    public void customLootTableDrop(LivingDropsEvent event) {
        Random rand = new Random();
        if(event.getEntityLiving() instanceof EntityGhost) {
            if(rand.nextInt(2) == 0) {
                event.getEntityLiving().entityDropItem(new ItemStack(ItemInit.GHOST_ESSENCE), 0.0f);
            }
        }
    }
}
