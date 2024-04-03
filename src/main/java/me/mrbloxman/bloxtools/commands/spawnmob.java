package me.mrbloxman.bloxtools.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;
import java.util.Locale;

public class spawnmob implements CommandExecutor {
    @Override
    public boolean onCommand(@Nonnull CommandSender sender,@Nonnull Command command,@Nonnull String s,@Nonnull String[] args) {
        if (sender instanceof Player p){
            if (p.hasPermission("bloxtools.spawnmob")){
                if  (args.length < 1 || args.length > 2){
                    p.sendMessage(ChatColor.RED + "Usage: /spawnmob <mobtype> [amount]");
                }else{
                    EntityType entityType = null;
                    try {
                        entityType = EntityType.valueOf(args[0].toUpperCase());
                    } catch (IllegalArgumentException e) {
                        p.sendMessage(ChatColor.RED + "The mob you specified is invalid.");
                        return false;
                    }

                    int amount = 1;
                    if (args.length == 2){
                        try {
                            amount = Integer.parseInt(args[1]);
                            if (amount <= 0) {
                                p.sendMessage(ChatColor.RED + "The amount specified must be a positive number.");
                                return true;
                            }
                            if (amount > 2000) {
                                p.sendMessage(ChatColor.RED + "This command will not executed due to possible server crash and corruption.");
                                return true;
                            }
                        } catch (NumberFormatException e) {
                            p.sendMessage(ChatColor.RED + "Invalid amount, make sure you are putting a number.");
                            return true;
                        }
                    }

                    Location spawnLocation = p.getLocation();
                    for (int i = 0; i < amount; i++) {
                        p.getWorld().spawnEntity(spawnLocation, EntityType.valueOf(args[0].toUpperCase()));
                    }
                    p.sendMessage(ChatColor.YELLOW + "Spawned " + amount + " "+ args[0].toLowerCase() + "(s) at your location.");
                    return true;
                }
            }else{
                p.sendMessage(ChatColor.RED + "You don't have permission to use this command!");
                return true;
            }
        }else{
            sender.sendMessage(ChatColor.RED + "Only players can use this command");
            return true;
        }
        return true;
    }
}
