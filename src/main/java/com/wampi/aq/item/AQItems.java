package com.wampi.aq.item;

import com.wampi.aq.AquaticAdditions;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AQItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AquaticAdditions.MODID);

    public static final DeferredItem<Item> TURTLE_INGOT = ITEMS.register("turtle_ingot",
            () -> new Item(new Item.Properties()));

    //Turtle master armor
    public static final DeferredItem<ArmorItem> TURTLE_MASTER_HELMET = ITEMS.register("turtle_master_helmet",
            () -> new TurtleMasterArmorItem(AQArmorMaterials.TURTLE_MASTER_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(407)));

    public static final DeferredItem<ArmorItem> TURTLE_MASTER_CHESTPLATE = ITEMS.register("turtle_master_chestplate",
            () -> new TurtleMasterArmorItem(AQArmorMaterials.TURTLE_MASTER_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(592)));

    public static final DeferredItem<ArmorItem> TURTLE_MASTER_LEGGINGS = ITEMS.register("turtle_master_leggings",
            () -> new TurtleMasterArmorItem(AQArmorMaterials.TURTLE_MASTER_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(555)));

    public static final DeferredItem<ArmorItem> TURTLE_MASTER_BOOTS = ITEMS.register("turtle_master_boots",
            () -> new TurtleMasterArmorItem(AQArmorMaterials.TURTLE_MASTER_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                    .durability(481)));
//-----------------------
// Turtle armor
public static final DeferredItem<ArmorItem> TURTLE_HELMET = ITEMS.register("turtle_helmet",
        () -> new TurtleArmorItem(AQArmorMaterials.TURTLE_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                .durability(10)));

    public static final DeferredItem<ArmorItem> TURTLE_CHESTPLATE = ITEMS.register("turtle_chestplate",
            () -> new TurtleArmorItem(AQArmorMaterials.TURTLE_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(321)));

    public static final DeferredItem<ArmorItem> TURTLE_LEGGINGS = ITEMS.register("turtle_leggings",
            () -> new TurtleArmorItem(AQArmorMaterials.TURTLE_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(289)));

    public static final DeferredItem<ArmorItem> TURTLE_BOOTS = ITEMS.register("turtle_boots",
            () -> new TurtleArmorItem(AQArmorMaterials.TURTLE_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                    .durability(289)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
