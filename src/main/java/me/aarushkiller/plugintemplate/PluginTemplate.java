package me.aarushkiller.plugintemplate;

import org.bukkit.plugin.java.JavaPlugin;

public final class PluginTemplate extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getLogger().info("This is a plugin template by AarushKiller");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
