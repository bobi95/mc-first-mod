package com.alderoy.mcfirstmod;

import com.alderoy.mcfirstmod.proxy.IProxy;
import com.alderoy.mcfirstmod.reference.ModReference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModReference.MOD_ID, name = ModReference.MOD_NAME, version = ModReference.MOD_VER)
public class McFirstMod {

    @Mod.Instance(ModReference.MOD_ID)
    public static McFirstMod instance;

    @SidedProxy(clientSide = "com.alderoy.mcfirstmod.proxy.ClientProxy", serverSide = "com.alderoy.mcfirstmod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
