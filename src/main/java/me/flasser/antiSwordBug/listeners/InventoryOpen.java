package me.flasser.antiSwordBug.listeners;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.plugin.Plugin;

import me.flasser.antiSwordBug.utils.FixSwordBug;

public class InventoryOpen implements Listener {

    @EventHandler
    public void onInventoryOpen(InventoryOpenEvent e) {
        Bukkit.getScheduler().runTaskLater((Plugin) this, () -> {
            FixSwordBug.fixSwordBug((CraftPlayer) e.getPlayer());
        }, 1);
    }
}
