package com.alderoy.mcfirstmod.init;

import com.alderoy.mcfirstmod.common.IItemModelProvider;
import com.alderoy.mcfirstmod.item.ItemBall;
import com.alderoy.mcfirstmod.item.ItemPhilosopherStone;
import com.alderoy.mcfirstmod.item.ModItem;
import com.alderoy.mcfirstmod.reference.ModReference;
import com.alderoy.mcfirstmod.utility.LogHelper;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(ModReference.MOD_ID)
public class ModItems {

    public static final ModItem ball = new ItemBall();
    public static final ModItem philosopherStone = new ItemPhilosopherStone();

    public static void init() {
        LogHelper.info("Initializing items");

        registerItem(ball);
        registerItem(philosopherStone);
    }

    public static void registerItem(Item item) {
        GameRegistry.register(item);
        if (item instanceof IItemModelProvider) {
            ((IItemModelProvider) item).registerItemModel();
        }
    }
}
