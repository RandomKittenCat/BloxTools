package me.mrbloxman.bloxtools.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class suicide implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player p){
            p.setHealth(0.0);
            return true;
        } else {
            sender.sendMessage(ChatColor.RED + "Only players can use this command");
            return false;
        }
    }
}
