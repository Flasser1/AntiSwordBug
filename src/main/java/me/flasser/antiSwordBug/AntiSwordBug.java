package me.flasser.antiSwordBug;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiSwordBug extends JavaPlugin {

    @Override
    public void onEnable() {
        int pluginId = 24433;
        Metrics metrics = new Metrics(this, pluginId);
    }

    @Override
    public void onDisable() {
    }
}
