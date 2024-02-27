package me.mrbloxman.bloxtools;

import me.mrbloxman.bloxtools.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class BloxTools extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("BloxTools has started (V2)");


        Objects.requireNonNull(getCommand("btinfo")).setExecutor(new btinfo());
        Objects.requireNonNull(getCommand("heal")).setExecutor(new heal());
        Objects.requireNonNull(getCommand("gmc")).setExecutor(new gmc());
        Objects.requireNonNull(getCommand("gms")).setExecutor(new gms());
        Objects.requireNonNull(getCommand("gmsp")).setExecutor(new gmsp());
        Objects.requireNonNull(getCommand("kill")).setExecutor(new kill());
        Objects.requireNonNull(getCommand("feed")).setExecutor(new feed());
        Objects.requireNonNull(getCommand("weather")).setExecutor(new weather());
        Objects.requireNonNull(getCommand("time")).setExecutor(new time());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("BloxTools has shutdown (V2)");
    }
}
