package com.wampi.aq.datagen;

import com.wampi.aq.AquaticAdditions;
import com.wampi.aq.block.AQBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class AQBlockStateProvider extends BlockStateProvider {
    public AQBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AquaticAdditions.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(AQBlocks.SCUTE_BLOCK);
        blockWithItem(AQBlocks.TURTLE_BLOCK);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
