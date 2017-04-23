package com.alderoy.mcfirstmod.item;

import com.alderoy.mcfirstmod.McFirstMod;
import com.alderoy.mcfirstmod.common.IItemModelProvider;
import com.alderoy.mcfirstmod.common.ModCreativeTabs;
import com.alderoy.mcfirstmod.reference.ModReference;
import com.alderoy.mcfirstmod.reference.Textures;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public abstract class ModItem extends Item implements IItemModelProvider {
    private final String unlocalizedName;

    public ModItem(String name) {
        super();
        this.unlocalizedName = formatUnlocalizedName(name);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(ModReference.MOD_ID, name);
        this.maxStackSize = 1;
        this.setCreativeTab(ModCreativeTabs.MOD_TAB);
        this.setNoRepair();
    }

    @Override
    public String getUnlocalizedName() {
        return unlocalizedName;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return unlocalizedName;
    }

    private String formatUnlocalizedName(String unlocalizedName) {
        return "item." + Textures.RESOURCE_PREFIX + unlocalizedName;
    }

    @Override
    public void registerItemModel() {
        McFirstMod.proxy.registerItemRenderer(this, 0);
    }
}
