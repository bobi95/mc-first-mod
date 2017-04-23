package com.alderoy.mcfirstmod;

import com.alderoy.mcfirstmod.init.ModBlocks;
import com.alderoy.mcfirstmod.handler.ConfigurationHandler;
import com.alderoy.mcfirstmod.init.ModItems;
import com.alderoy.mcfirstmod.proxy.IProxy;
import com.alderoy.mcfirstmod.reference.ModReference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.springframework.context.annotation.Configuration;

@Mod(
        modid = ModReference.MOD_ID,
        name = ModReference.MOD_NAME,
        version = ModReference.MOD_VER,
        guiFactory = ModReference.GUI_FACTORY_CLASS
)
@Configuration
public class McFirstMod {

    @Mod.Instance(ModReference.MOD_ID)
    public static McFirstMod instance;

    @SidedProxy(clientSide = ModReference.CLIENT_PROXY, serverSide = ModReference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        initConfigurationHandler(event);

        ModItems.init();
        ModBlocks.init();
    }

    private void initConfigurationHandler(FMLPreInitializationEvent event) {
        ConfigurationHandler configurationHandler = ConfigurationHandler.instance;
        configurationHandler.init(event.getSuggestedConfigurationFile());
        MinecraftForge.EVENT_BUS.register(configurationHandler);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
