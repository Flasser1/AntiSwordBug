package me.flasser.antiSwordBug;

import me.flasser.antiSwordBug.listeners.EntityDamage;
import me.flasser.antiSwordBug.listeners.InventoryOpen;
import me.flasser.antiSwordBug.listeners.ToggleSprint;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiSwordBug extends JavaPlugin {

    public static AntiSwordBug instance;

    @Override
    public void onEnable() {

        instance = this;

        int pluginId = 24433;
        Metrics metrics = new Metrics(this, pluginId);

        getServer().getPluginManager().registerEvents(new EntityDamage(), this);
        getServer().getPluginManager().registerEvents(new InventoryOpen(), this);
        getServer().getPluginManager().registerEvents(new ToggleSprint(), this);
    }

    @Override
    public void onDisable() {
    }
}
