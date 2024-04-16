package me.mrbloxman.bloxtools.commands.admin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;
import java.util.Locale;

public class time implements CommandExecutor {
    @Override
    public boolean onCommand(@Nonnull CommandSender sender,@Nonnull Command command,@Nonnull String s,@Nonnull String[] args) {
        if (sender instanceof Player p) {
            if (args.length == 0) {
                p.sendMessage(ChatColor.RED + "Please specify the time you would like the world to be set to");
                return true;
            }

            String timeArg = args[0].toLowerCase();

            long timeValue = -1;
            String timeDescription = null;

            switch (timeArg) {
                case "sunrise" -> {
                    timeValue = 0;
                    timeDescription = "sunrise";
                }
                case "sunset" -> {
                    timeValue = 12000;
                    timeDescription = "sunset";
                }
                case "day" -> {
                    timeValue = 1000;
                    timeDescription = "day";
                }
                case "night" -> {
                    timeValue = 13000;
                    timeDescription = "night";
                }
                case "noon" -> {
                    timeValue = 6000;
                    timeDescription = "noon";
                }
                case "midnight" -> {
                    timeValue = 18000;
                    timeDescription = "midnight";
                }
                default -> {
                    try {
                        timeValue = Long.parseLong(timeArg);
                    } catch (NumberFormatException e) {
                        p.sendMessage(ChatColor.RED + "Invalid time format, please specify a number or a time keyword (day, night, etc)");
                        return true;
                    }
                }
            }
            p.getWorld().setTime(timeValue);
            if (timeDescription != null) {
                p.sendMessage(ChatColor.YELLOW + "Time set to " + timeDescription);
            } else {
                p.sendMessage(ChatColor.YELLOW + "Time set to " + timeValue);
            }
        }
        return true;
    }
}
