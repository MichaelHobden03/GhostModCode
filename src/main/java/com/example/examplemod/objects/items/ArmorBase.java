package com.example.examplemod.objects.items;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.Util.interfaces.IHasModel;
import com.example.examplemod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel {
    public ArmorBase(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot) {
        super(material, renderIndex, equipmentSlot);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        ExampleMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
