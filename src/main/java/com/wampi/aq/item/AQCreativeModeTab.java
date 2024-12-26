package com.wampi.aq.item;

import com.wampi.aq.AquaticAdditions;
import com.wampi.aq.block.AQBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class AQCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AquaticAdditions.MODID);

    public static final Supplier<CreativeModeTab> AQ_ITEMS_TAB = CREATIVE_MODE_TABS.register("aq_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(AQItems.TURTLE_MASTER_CHESTPLATE.get()))
                    .title(Component.translatable("creativetab.aq.aq_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(AQItems.TURTLE_INGOT);
                        output.accept(AQBlocks.TURTLE_BLOCK);
                        output.accept(AQBlocks.SCUTE_BLOCK);
                        output.accept(AQItems.TURTLE_MASTER_HELMET);
                        output.accept(AQItems.TURTLE_MASTER_CHESTPLATE);
                        output.accept(AQItems.TURTLE_MASTER_LEGGINGS);
                        output.accept(AQItems.TURTLE_MASTER_BOOTS);
                        output.accept(AQItems.TURTLE_CHESTPLATE);
                        output.accept(AQItems.TURTLE_LEGGINGS);
                        output.accept(AQItems.TURTLE_BOOTS);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
