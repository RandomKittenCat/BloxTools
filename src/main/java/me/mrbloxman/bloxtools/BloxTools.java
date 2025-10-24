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
        Objects.requireNonNull(getCommand("coords")).setExecutor(new coords());
        Objects.requireNonNull(getCommand("forecast")).setExecutor(new forecast());
        Objects.requireNonNull(getCommand("checktime")).setExecutor(new checktime());
        Objects.requireNonNull(getCommand("spawn")).setExecutor(new spawn());
        Objects.requireNonNull(getCommand("spawnmob")).setExecutor(new spawnmob());
        Objects.requireNonNull(getCommand("repair")).setExecutor(new repair());
        Objects.requireNonNull(getCommand("killall")).setExecutor(new killall());
        Objects.requireNonNull(getCommand("broadcast")).setExecutor(new broadcast());
        Objects.requireNonNull(getCommand("whisper")).setExecutor(new whisper());
        Objects.requireNonNull(getCommand("ping")).setExecutor(new ping());
        Objects.requireNonNull(getCommand("hat")).setExecutor(new hat());
        Objects.requireNonNull(getCommand("clearinv")).setExecutor(new clearinv());
        Objects.requireNonNull(getCommand("smite")).setExecutor(new smite());
        Objects.requireNonNull(getCommand("workbench")).setExecutor(new workbench());
        Objects.requireNonNull(getCommand("anvil")).setExecutor(new anvil());
        Objects.requireNonNull(getCommand("suicide")).setExecutor(new suicide());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("BloxTools has shutdown (V2)");
    }
}
