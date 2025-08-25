package me.flasser.antiSwordBug.utils;

import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;

public class FixSwordBug {

    public static void fixSwordBug(CraftPlayer player) {
        player.getHandle().bU();
    }
}
