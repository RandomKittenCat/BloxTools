package me.mrbloxman.bloxtools.commands.admin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import javax.annotation.Nonnull;

public class BroadcastCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@Nonnull CommandSender sender,@Nonnull Command command,@Nonnull String s,@Nonnull String[] args) {
        if (sender.hasPermission("bloxtools.broadcast")) {
            if (args.length >= 1){
                String bcmessage = ChatColor.translateAlternateColorCodes('&', String.join(" ", args));
                Bukkit.broadcastMessage(ChatColor.YELLOW + "[Broadcast] " + ChatColor.WHITE + bcmessage);
                return true;
            } else{
                sender.sendMessage(ChatColor.RED + "Usage: /broadcast <message>");
            }
        }else{
            sender.sendMessage(ChatColor.RED + "You don't have permission to use this command!");
        }
        return true;
    }
}
