package com.example.examplemod.Util;

import com.example.examplemod.Util.interfaces.IHasModel;
import com.example.examplemod.init.EntityInit;
import com.example.examplemod.init.ItemInit;
import com.example.examplemod.recipes.CraftingRecipes;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {


    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event)
    {
        for(Item item : ItemInit.ITEMS)
        {
            if(item instanceof IHasModel)
            {
                ((IHasModel)item).registerModels();
            }
        }
    }


    public static void preInitRegistries()
    {
        EntityInit.registerEntities();
        RenderHandler.registerEntityRenders();
        SoundsHandler.registerSounds();
        EventHandler.registerEvents();
    }


    public static void initRegistries()
    {
        CraftingRecipes.init();
    }

}
