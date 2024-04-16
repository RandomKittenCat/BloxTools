package me.mrbloxman.bloxtools;

import me.mrbloxman.bloxtools.commands.*;
import me.mrbloxman.bloxtools.commands.admin.*;
import me.mrbloxman.bloxtools.commands.player.CheckTimeCommand;
import me.mrbloxman.bloxtools.commands.player.CoordsCommand;
import me.mrbloxman.bloxtools.commands.player.ForecastCommand;
import org.bukkit.GameMode;
import org.bukkit.plugin.java.JavaPlugin;

public final class BloxToolsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("BloxTools has started (V2)");

        getCommand("btinfo").setExecutor(new BTInfoCommand());
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("gmc").setExecutor(new GamemodeCommand(GameMode.CREATIVE));
        getCommand("gms").setExecutor(new GamemodeCommand(GameMode.SURVIVAL));
        getCommand("gmsp").setExecutor(new GamemodeCommand(GameMode.SPECTATOR));
        getCommand("gma").setExecutor(new GamemodeCommand(GameMode.ADVENTURE));
        getCommand("kill").setExecutor(new KillCommand());
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("weather").setExecutor(new WeatherCommand());
        getCommand("time").setExecutor(new TimeCommand());
        getCommand("coords").setExecutor(new CoordsCommand());
        getCommand("forecast").setExecutor(new ForecastCommand());
        getCommand("checktime").setExecutor(new CheckTimeCommand());
        getCommand("spawn").setExecutor(new SpawnCommand());
        getCommand("spawnmob").setExecutor(new SpawnMobCommand());
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
