package com.alderoy.mcfirstmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModStatics.MOD_ID, name = ModStatics.MOD_NAME, version = ModStatics.MOD_VER)
public class McFirstMod {

    @Mod.Instance(ModStatics.MOD_ID)
    public static McFirstMod instance;

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent event) {

    }
}
