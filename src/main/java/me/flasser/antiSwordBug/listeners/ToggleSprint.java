package me.flasser.antiSwordBug.listeners;

import me.flasser.antiSwordBug.utils.FixSwordBug;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSprintEvent;

public class ToggleSprint implements Listener {

    @EventHandler
    public void onPlayerToggleSprint(PlayerToggleSprintEvent e) {
        if (e.isSprinting()) {
            FixSwordBug.fixSwordBug((CraftPlayer) e.getPlayer());
        }
    }
}
