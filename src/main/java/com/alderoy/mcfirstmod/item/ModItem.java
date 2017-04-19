package com.alderoy.mcfirstmod.item;

import com.alderoy.mcfirstmod.McFirstMod;
import com.alderoy.mcfirstmod.reference.ModReference;
import com.alderoy.mcfirstmod.reference.Textures;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public abstract class ModItem extends Item implements IItemModelProvider {
    private final String unlocalizedName;

    public ModItem(String registryName) {
        this(registryName, registryName);
    }

    public ModItem(String registryName, String unlocalizedName) {
        super();
        this.unlocalizedName = formatUnlocalizedName(unlocalizedName);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(ModReference.MOD_ID, registryName);
        this.maxStackSize = 1;
        //this.setCreativeTab()
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
