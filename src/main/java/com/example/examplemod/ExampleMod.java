package com.example.examplemod;

import com.example.examplemod.Util.RegistryHandler;
import com.example.examplemod.proxy.CommonProxy;
import com.example.examplemod.recipes.CraftingRecipes;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static SimpleNetworkWrapper network;

    public static final String MODID = Reference.MOD_ID;
    public static final String NAME = "ExampleMod";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Instance
    public static ExampleMod instance;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        RegistryHandler.preInitRegistries();
        network = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MOD_ID);

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        RegistryHandler.initRegistries();
        CraftingRecipes.init();
    }
}
