package me.mrbloxman43.bloxtools;

import me.mrbloxman43.bloxtools.commands.InfoCommand;
import me.mrbloxman43.bloxtools.listeners.PlayerJoinLeaveListener;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import java.util.Objects;

public final class BloxTools extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("BloxTools has started.");

        getServer().getPluginManager().registerEvents(new PlayerJoinLeaveListener(), this);
        Objects.requireNonNull(getCommand("btinfo")).setExecutor(new InfoCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("BloxTools has stopped.");
    }

}
