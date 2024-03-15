package me.mrbloxman.bloxtools.commands;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.Locale;

public class weather implements CommandExecutor {
    @Override
    public boolean onCommand(@Nonnull CommandSender sender,@Nonnull Command command,@Nonnull String s,@Nonnull String[] args) {
        if (sender instanceof Player p) {
            if (args.length == 0) {
                p.sendMessage(ChatColor.RED + "Please specify the type of weather (clear, rain, or thunder)");
            }

            World world = p.getWorld();
            String weatherType = args[0].toLowerCase();

            switch (weatherType) {
                case "sun":
                case "clear":
                    world.setStorm(false); // Clear any existing weather
                    world.setThundering(false);
                    p.sendMessage(ChatColor.YELLOW + "The weather has been set to clear/sun");
                    break;
                case "rain":
                    world.setStorm(true);
                    p.sendMessage(ChatColor.YELLOW + "The weather has been set to rain");
                    break;
                case "storm":
                case "thunder":
                    world.setStorm(true);
                    world.setThundering(true);
                    p.sendMessage(ChatColor.YELLOW + "The weather has been set to thunder/storm");
            }
        }
        return true;
    }
}
