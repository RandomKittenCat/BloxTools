package me.mrbloxman.bloxtools.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;

public class kill implements CommandExecutor {

    @Override
    public boolean onCommand(@Nonnull CommandSender sender, @Nonnull Command command, @Nonnull String s, @Nonnull String[] args) {
        if (sender.hasPermission("bloxtools.kill")) {
            if (sender instanceof Player p) {
                if (args.length == 0) {
                    p.sendMessage(ChatColor.YELLOW + "Successfully killed " + p.getDisplayName());
                    p.setHealth(0);
                } else {
                    String playerName = args[0];
                    Player target = Bukkit.getServer().getPlayerExact(playerName);

                    if (target == null) {
                        p.sendMessage(ChatColor.RED + "The player you specified is not online");
                    } else {
                        target.setHealth(0);
                        p.sendMessage(ChatColor.YELLOW + "Successfully killed " + target.getDisplayName());
                    }
                }
            }
        }else{
            sender.sendMessage(ChatColor.RED + "You don't have permission to use this command!");
        }
        return true;
    }
}
