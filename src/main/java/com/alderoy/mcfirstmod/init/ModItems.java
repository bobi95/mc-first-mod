package com.alderoy.mcfirstmod.init;

import com.alderoy.mcfirstmod.common.IItemModelProvider;
import com.alderoy.mcfirstmod.item.ItemBall;
import com.alderoy.mcfirstmod.item.ModItem;
import com.alderoy.mcfirstmod.utility.LogHelper;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static final ModItem ball = new ItemBall();

    public static void init() {
        LogHelper.info("Initializing items");

        registerItem(ball);
    }

    public static void registerItem(Item item) {
        GameRegistry.register(item);
        if (item instanceof IItemModelProvider) {
            ((IItemModelProvider) item).registerItemModel();
        }
    }
}
