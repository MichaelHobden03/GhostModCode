package com.example.examplemod.init;

import com.example.examplemod.Reference;
import com.example.examplemod.objects.items.ArmorBase;
import com.example.examplemod.objects.items.ItemBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import scala.tools.nsc.backend.icode.TypeKinds;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final ItemArmor.ArmorMaterial ARMOR_GHOST = EnumHelper.addArmorMaterial("armor_ghost", Reference.MOD_ID + ":ghost_essence", 3200, new int[] {4,7,9,5}, 17, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0f);

    public static final Item GHOST_ESSENCE = new ItemBase("ghost_essence");

    public static final Item HELMET_GHOST = new ArmorBase("helmet_ghost", ARMOR_GHOST, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHESTPLATE_GHOST = new ArmorBase("chestplate_ghost", ARMOR_GHOST, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_GHOST = new ArmorBase("leggings_ghost", ARMOR_GHOST, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_GHOST = new ArmorBase("boots_ghost", ARMOR_GHOST, 1, EntityEquipmentSlot.FEET);
}
