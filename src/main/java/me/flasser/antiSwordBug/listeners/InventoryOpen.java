package me.flasser.antiSwordBug.listeners;

import me.flasser.antiSwordBug.AntiSwordBug;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;

import me.flasser.antiSwordBug.utils.FixSwordBug;

public class InventoryOpen implements Listener {

    @EventHandler
    public void onInventoryOpen(InventoryOpenEvent e) {
        Bukkit.getScheduler().runTaskLater(AntiSwordBug.instance, () -> {
            FixSwordBug.fixSwordBug((CraftPlayer) e.getPlayer());
        }, 1);
    }
}
