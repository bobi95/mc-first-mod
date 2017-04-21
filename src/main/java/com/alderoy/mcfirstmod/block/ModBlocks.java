package com.alderoy.mcfirstmod.block;

import com.alderoy.mcfirstmod.common.IItemModelProvider;
import com.alderoy.mcfirstmod.reference.ModReference;
import com.alderoy.mcfirstmod.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(ModReference.MOD_ID)
public class ModBlocks {
    public static final ModBlock square = new BlockSquare();

    public static void init() {
        LogHelper.info("Initializing blocks");

        registerBlock(square, square.getItemBlock());
    }

    public static void registerBlock(Block block, Item itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        if (block instanceof IItemModelProvider) {
            ((IItemModelProvider) block).registerItemModel();
        }
    }
}
