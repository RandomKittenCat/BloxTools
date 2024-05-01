package me.mrbloxman.bloxtools.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;

public class coords implements CommandExecutor {
    @Override
    public boolean onCommand(@Nonnull CommandSender sender,@Nonnull Command command,@Nonnull String s,@Nonnull String[] args) {
        if (sender.hasPermission("bloxtools.coords")) {
            if (sender instanceof Player p) {
                int x = (int) Math.round(p.getLocation().getX());
                int y = (int) Math.round(p.getLocation().getY());
                int z = (int) Math.round(p.getLocation().getZ());
                String worldName = p.getWorld().getName();

                p.sendMessage(ChatColor.YELLOW + "Your current coordinates in this world are:");
                p.sendMessage(ChatColor.YELLOW + "X: " + ChatColor.WHITE + x + " " + ChatColor.YELLOW + "Y: " + ChatColor.WHITE + y + " " + ChatColor.YELLOW + "Z: " + ChatColor.WHITE + z);
            } else {
                sender.sendMessage("The /coords command can only be executed by a player");
            }
        }else{
            sender.sendMessage(ChatColor.RED + "You don't have permission to use this command!");
        }
        return true;
    }
}
