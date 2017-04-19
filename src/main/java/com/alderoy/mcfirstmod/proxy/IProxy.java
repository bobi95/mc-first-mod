package com.alderoy.mcfirstmod.proxy;

import net.minecraft.item.Item;

public interface IProxy {
    void registerItemRenderer(Item item, int meta);
}
