package me.mrbloxman.bloxtools;

import me.mrbloxman.bloxtools.commands.btinfo;
import me.mrbloxman.bloxtools.commands.heal;
import org.bukkit.plugin.java.JavaPlugin;

public final class BloxTools extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("BloxTools has started (V2)");


        getCommand("btinfo").setExecutor(new btinfo());
        getCommand("heal").setExecutor(new heal());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("BloxTools has shutdown (V2)");
    }
}
