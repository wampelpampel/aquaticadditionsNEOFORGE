package com.wampi.aq.block;

import com.wampi.aq.AquaticAdditions;
import com.wampi.aq.item.AQItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class AQBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AquaticAdditions.MODID);

    public static final DeferredBlock<Block> SCUTE_BLOCK = registerBlock("scute_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BAMBOO)
                    ));





    //Helpermethods
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        AQItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    //Registrieren
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
