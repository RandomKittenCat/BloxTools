package me.mrbloxman.bloxtools.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;

public class spawn implements CommandExecutor {
    @Override
    public boolean onCommand(@Nonnull CommandSender sender,@Nonnull Command command,@Nonnull String s,@Nonnull String[] args) {
        if (sender instanceof Player p) {
            if (args.length == 0) {
                if (p.hasPermission("bloxtools.spawn")){
                    p.teleport(p.getWorld().getSpawnLocation());
                    p.sendMessage(ChatColor.YELLOW + "You have been teleported to the world spawn");
                }
            } else {
                Player target = Bukkit.getPlayer(args[0]);
                if (p.hasPermission("bloxtools.spawn.others")) {
                    if (target != null){
                        target.teleport(target.getWorld().getSpawnLocation());
                        p.sendMessage(ChatColor.YELLOW + "Teleported " + target.getName() + " to world spawn");
                    }else{
                        p.sendMessage(ChatColor.RED + "Player " + args[0] + " not found");
                    }
                } else {
                    p.sendMessage(ChatColor.RED + "You don't have permission to use this command!");
                }
            }
        }else{
            sender.sendMessage(ChatColor.RED + "Only players can use this command.");
            return true;
        }
        return true;
    }
}
