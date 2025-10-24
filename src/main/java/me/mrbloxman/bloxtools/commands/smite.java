package me.mrbloxman.bloxtools.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class smite implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (args.length == 0){
            sender.sendMessage(ChatColor.RED + "Please specify a player to smite");
        } else {
            String playerName = args[0];
            Player target = Bukkit.getPlayerExact(playerName);

            if (target == null){
                sender.sendMessage(ChatColor.RED + "The player you specified is not online");
                return true;
            }

            Location targetLocation = target.getLocation();
            target.getWorld().strikeLightning(targetLocation);

            sender.sendMessage(ChatColor.YELLOW + "Smited " + playerName);
            return true;
        }
        return true;
    }
}
