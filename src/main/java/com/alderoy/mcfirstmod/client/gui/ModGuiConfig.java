package com.alderoy.mcfirstmod.client.gui;

import com.alderoy.mcfirstmod.McFirstMod;
import com.alderoy.mcfirstmod.handler.ConfigurationHandler;
import com.alderoy.mcfirstmod.reference.ModReference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

public class ModGuiConfig extends GuiConfig {
    public ModGuiConfig(
            GuiScreen parentScreen) {
        super(
                parentScreen,
                new ConfigElement(
                        ConfigurationHandler.instance.getConfiguration()
                                .getCategory(Configuration.CATEGORY_GENERAL)
                ).getChildElements(),
                ModReference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.instance.getConfiguration().toString()));
    }
}
