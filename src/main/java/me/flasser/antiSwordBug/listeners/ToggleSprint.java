package me.flasser.antiSwordBug.listeners;

import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSprintEvent;

import me.flasser.antiSwordBug.utils.FixSwordBug;

public class ToggleSprint implements Listener {

    @EventHandler
    public void onToggleSpring(PlayerToggleSprintEvent e) {

        FixSwordBug.fixSwordBug((CraftPlayer) e.getPlayer());
    }
}
