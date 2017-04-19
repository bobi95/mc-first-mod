package com.alderoy.mcfirstmod.block;

import com.alderoy.mcfirstmod.McFirstMod;
import com.alderoy.mcfirstmod.common.IItemModelProvider;
import com.alderoy.mcfirstmod.reference.ModReference;
import com.alderoy.mcfirstmod.reference.Textures;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import javax.annotation.Nonnull;

public abstract class ModBlock extends Block implements IItemModelProvider {

    private String unlocalizedName;
    private ItemBlock itemBlock = null;

    public ModBlock(String name) {
        this(name, Material.ROCK);
    }

    public ModBlock(String name, Material materialIn) {
        this(name, materialIn, materialIn.getMaterialMapColor());
    }

    public ModBlock(String name, Material blockMaterialIn, MapColor blockMapColorIn) {
        super(blockMaterialIn, blockMapColorIn);
        this.setRegistryName(ModReference.MOD_ID, name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.MISC);
        this.setHardness(0.5F);
        this.setResistance(5F);
        this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe", 0);
    }

    @Override
    @Nonnull
    public String getUnlocalizedName() {
        return unlocalizedName;
    }

    @Override
    @Nonnull
    public Block setUnlocalizedName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name is null");
        }

        this.unlocalizedName = formatUnlocalizedName(name);
        return super.setUnlocalizedName(name);
    }

    private String formatUnlocalizedName(String unlocalizedName) {
        return "tile." + Textures.RESOURCE_PREFIX + unlocalizedName;
    }

    public Item getItemBlock() {
        if (itemBlock == null) {
            itemBlock = (ItemBlock) new ItemBlock(this)
                    .setUnlocalizedName(getUnlocalizedName())
                    .setRegistryName(getRegistryName());
        }

        return itemBlock;
    }

    @Override
    public void registerItemModel() {
        McFirstMod.proxy.registerItemRenderer(getItemBlock(), 0);
    }
}
