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


    //Hier blöcke registrieren
    public static final DeferredBlock<Block> SCUTE_BLOCK = registerBlock("scute_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.BAMBOO)
                    ));

    public static final DeferredBlock<Block> TURTLE_BLOCK = registerBlock("turtle_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops()
                    .sound(SoundType.ANCIENT_DEBRIS)
                    ));
    //---------------------------


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
