package com.wampi.aq.datagen;

import com.wampi.aq.AquaticAdditions;
import com.wampi.aq.block.AQBlocks;
import com.wampi.aq.item.AQItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class AQBlockTagProvider extends BlockTagsProvider {
    public AQBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AquaticAdditions.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(AQBlocks.TURTLE_BLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(AQBlocks.TURTLE_BLOCK.get());

    }
}
