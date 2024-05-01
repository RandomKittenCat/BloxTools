package me.mrbloxman.bloxtools.commands;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;

public class checktime implements CommandExecutor {
    @Override
    public boolean onCommand(@Nonnull CommandSender sender,@Nonnull Command command,@Nonnull String s,@Nonnull String[] args) {
        if (sender.hasPermission("bloxtools.checktime")) {
            if (sender instanceof Player p) {
                World world = p.getWorld();
                long time = world.getTime();

                int hours = (int) ((time / 1000 + 6) % 24);
                int minutes = (int) ((time % 1000) * 60 / 1000);
                String period = hours < 12 ? "AM" : "PM";

                // Convert hours to 12-hour format
                if (hours > 12) {
                    hours -= 12;
                } else if (hours == 0) {
                    hours = 12;
                }

                String formattedTime = String.format("%02d:%02d %s", hours, minutes, period);
                p.sendMessage(ChatColor.YELLOW + "The current time in-game is: " + ChatColor.WHITE + formattedTime);
            }
        }else{
            sender.sendMessage(ChatColor.RED + "You don't have permission to use this command!");
        }
        return true;
    }
}
