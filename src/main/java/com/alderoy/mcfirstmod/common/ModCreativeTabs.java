package com.alderoy.mcfirstmod.common;

import com.alderoy.mcfirstmod.init.ModItems;
import com.alderoy.mcfirstmod.reference.ModReference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModCreativeTabs {
    public static final CreativeTabs MOD_TAB = new CreativeTabs(ModReference.MOD_ID) {

        @Override
        public Item getTabIconItem() {
            return ModItems.philosopherStone;
        }

        @Override
        public String getTranslatedTabLabel() {
            return ModReference.MOD_NAME;
        }
    };
}
