package com.alderoy.mcfirstmod.handler;

import com.alderoy.mcfirstmod.reference.ModReference;
import com.alderoy.mcfirstmod.utility.LogHelper;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigurationHandler {

    private Configuration configuration;
    private boolean configVal = false;

    public void init(File file) {
       if (configuration == null) {
           configuration = new Configuration(file);
           loadConfiguration();
       }
    }

    private void loadConfiguration() {
        LogHelper.info("Loading configuration...");

        configVal = configuration.getBoolean("configVal", Configuration.CATEGORY_GENERAL, true, "Test configuration value");

        if (configuration.hasChanged()) {
            LogHelper.info("Saving configuration...");
            configuration.save();
        }
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.getModID().equalsIgnoreCase(ModReference.MOD_ID))
        {
            loadConfiguration();
        }
    }
}
