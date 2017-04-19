package com.alderoy.mcfirstmod.init;

import com.alderoy.mcfirstmod.item.IItemModelProvider;
import com.alderoy.mcfirstmod.item.ItemBall;
import com.alderoy.mcfirstmod.item.ModItem;
import com.alderoy.mcfirstmod.utility.LogHelper;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static final ModItem ball = new ItemBall();

    public static void init() {
        LogHelper.info("Initializing items");

        GameRegistry.register(ball);
        if (ball instanceof IItemModelProvider) {
            ball.registerItemModel();
        }
    }

    public static void registerItem(Item item) {
        GameRegistry.register(item);
        if (item instanceof IItemModelProvider) {
            ((IItemModelProvider) item).registerItemModel();
        }
    }
}
