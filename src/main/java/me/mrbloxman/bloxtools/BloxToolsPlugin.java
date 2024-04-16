package me.mrbloxman.bloxtools;

import me.mrbloxman.bloxtools.commands.*;
import me.mrbloxman.bloxtools.commands.admin.*;
import me.mrbloxman.bloxtools.commands.player.checktime;
import me.mrbloxman.bloxtools.commands.player.coords;
import me.mrbloxman.bloxtools.commands.player.forecast;
import org.bukkit.plugin.java.JavaPlugin;

public final class BloxToolsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("BloxTools has started (V2)");

        getCommand("btinfo").setExecutor(new btinfo());
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("gmc").setExecutor(new gmc());
        getCommand("gms").setExecutor(new gms());
        getCommand("gmsp").setExecutor(new gmsp());
        getCommand("kill").setExecutor(new KillCommand());
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("weather").setExecutor(new weather());
        getCommand("time").setExecutor(new time());
        getCommand("coords").setExecutor(new coords());
        getCommand("forecast").setExecutor(new forecast());
        getCommand("checktime").setExecutor(new checktime());
        getCommand("spawn").setExecutor(new SpawnCommand());
        getCommand("spawnmob").setExecutor(new spawnmob());
        getCommand("repair").setExecutor(new RepairCommand());
        getCommand("killall").setExecutor(new KillAllCommand());
        getCommand("broadcast").setExecutor(new BroadcastCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("BloxTools has shutdown (V2)");
    }
}
