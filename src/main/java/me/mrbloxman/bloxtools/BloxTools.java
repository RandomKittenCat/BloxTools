package me.mrbloxman.bloxtools;

import me.mrbloxman.bloxtools.commands.btinfo;
import me.mrbloxman.bloxtools.commands.gmc;
import me.mrbloxman.bloxtools.commands.heal;
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
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("BloxTools has shutdown (V2)");
    }
}
