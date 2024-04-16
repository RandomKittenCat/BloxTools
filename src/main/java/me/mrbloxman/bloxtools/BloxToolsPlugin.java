package me.mrbloxman.bloxtools;

import me.mrbloxman.bloxtools.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class BloxToolsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("BloxTools has started (V2)");

        getCommand("btinfo").setExecutor(new btinfo());
        getCommand("heal").setExecutor(new heal());
        getCommand("gmc").setExecutor(new gmc());
        getCommand("gms").setExecutor(new gms());
        getCommand("gmsp").setExecutor(new gmsp());
        getCommand("kill").setExecutor(new kill());
        getCommand("feed").setExecutor(new feed());
        getCommand("weather").setExecutor(new weather());
        getCommand("time").setExecutor(new time());
        getCommand("coords").setExecutor(new coords());
        getCommand("forecast").setExecutor(new forecast());
        getCommand("checktime").setExecutor(new checktime());
        getCommand("spawn").setExecutor(new spawn());
        getCommand("spawnmob").setExecutor(new spawnmob());
        getCommand("repair").setExecutor(new repair());
        getCommand("killall").setExecutor(new killall());
        getCommand("broadcast").setExecutor(new broadcast());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("BloxTools has shutdown (V2)");
    }
}
