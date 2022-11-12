package com.example.examplemod.proxy;


import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class CommonProxy
{
    public void registerItemRenderer(Item item, int meta, String id)
    {
    }

    public void render()
    {

    }



    public EntityPlayer getClientPlayer()
    {
        throw new IllegalStateException("This should only be called from client side");
    }
}