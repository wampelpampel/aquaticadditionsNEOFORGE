package com.wampi.aq.datagen;

import com.wampi.aq.AquaticAdditions;
import com.wampi.aq.item.AQItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class AQItemTagProvider extends ItemTagsProvider {
    public AQItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                             CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, AquaticAdditions.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(AQItems.TURTLE_MASTER_HELMET.get())
                .add(AQItems.TURTLE_MASTER_CHESTPLATE.get())
                .add(AQItems.TURTLE_MASTER_LEGGINGS.get())
                .add(AQItems.TURTLE_MASTER_BOOTS.get())
                .add(AQItems.TURTLE_HELMET.get())
                .add(AQItems.TURTLE_CHESTPLATE.get())
                .add(AQItems.TURTLE_LEGGINGS.get())
                .add(AQItems.TURTLE_BOOTS.get());
    }
}
