package me.mrbloxman.bloxtools.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ping implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
            if (sender instanceof Player p) {
                int player_ping = p.getPing();
                p.sendMessage(ChatColor.YELLOW + "Pong! " + player_ping + "ms");
            }
        return true;
    }
}
