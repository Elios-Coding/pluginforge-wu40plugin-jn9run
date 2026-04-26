package com.pluginforge.wu40plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Wu40Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Wu40Plugin v1.0 enabled.");
        getCommand("wu40").setExecutor(new Wu40Command());

    }

    @Override
    public void onDisable() {
        getLogger().info("Wu40Plugin disabled.");
    }
}
