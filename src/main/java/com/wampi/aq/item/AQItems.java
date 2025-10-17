package com.wampi.aq.item;

import com.wampi.aq.AquaticAdditions;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SmithingTemplateItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class AQItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AquaticAdditions.MODID);

    public static final DeferredItem<Item> TURTLE_INGOT = ITEMS.register("turtle_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TURTLE_MASTER_CRAFTING_UPGRADE =
            ITEMS.register("turtle_master_crafting_upgrade", () -> new SmithingTemplateItem(
                            Component.translatable("upgrade.turtle_master.applies_to").withStyle(ChatFormatting.BLUE),
                            Component.translatable("upgrade.turtle_master.ingredients").withStyle(ChatFormatting.BLUE),

                            Component.translatable("upgrade.turtle_master.title").withStyle(ChatFormatting.BLUE),

                            Component.translatable("upgrade.turtle_master.base_slot"),
                            Component.translatable("upgrade.turtle_master.additions_slot"),

                            List.of(ResourceLocation.withDefaultNamespace("item/empty_armor_slot_helmet"),
                                    ResourceLocation.withDefaultNamespace("item/empty_armor_slot_chestplate"),
                                    ResourceLocation.withDefaultNamespace("item/empty_armor_slot_leggings"),
                                    ResourceLocation.withDefaultNamespace("item/empty_armor_slot_boots")),


                            List.of(ResourceLocation.withDefaultNamespace("item/empty_slot_ingot"))
                    )
            );


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
