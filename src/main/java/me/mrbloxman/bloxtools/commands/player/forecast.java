package me.mrbloxman.bloxtools.commands.player;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;

public class forecast implements CommandExecutor {
    @Override
    public boolean onCommand(@Nonnull CommandSender sender,@Nonnull Command command,@Nonnull String s,@Nonnull String[] args) {
        if (sender instanceof Player p) {
            World world = p.getWorld();

            String weatherForecast;
            if (world.hasStorm()) {
                if (world.isThundering()) {
                    weatherForecast = ChatColor.RED + "thunderstorm";
                } else {
                    weatherForecast = ChatColor.BLUE + "rain";
                }
            } else {
                weatherForecast = ChatColor.GREEN + "clear";
            }

            p.sendMessage(ChatColor.YELLOW + "The current weather forecast in this world is: " + weatherForecast);
        } else {
            sender.sendMessage(ChatColor.RED + "This command can only be executed by a player.");
        }
        return true;
    }
}
