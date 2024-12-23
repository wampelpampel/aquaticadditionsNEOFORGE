package com.wampi.aq.item;

import com.wampi.aq.AquaticAdditions;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AQItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AquaticAdditions.MODID);

    public static final DeferredItem<Item> TURTLE_INGOT = ITEMS.register("turtle_ingot",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
