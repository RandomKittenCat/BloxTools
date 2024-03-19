package me.mrbloxman.bloxtools.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;

public class time implements CommandExecutor {
    @Override
    public boolean onCommand(@Nonnull CommandSender sender,@Nonnull Command command,@Nonnull String s,@Nonnull String[] args) {
        if (sender instanceof Player p) {
            if (args.length == 0) {
                p.sendMessage(ChatColor.RED + "Please specify the time");
            }

            String timeArg = args[0];

            long timeValue = -1;

            switch (timeArg) {
                case "sunrise" -> timeValue = 0;
                case "sunset" -> timeValue = 12000;
                case "day" -> timeValue = 1000;
                case "night" -> timeValue = 13000;
                case "noon" -> timeValue = 6000;
                case "midnight" -> timeValue = 18000;
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
            p.sendMessage(ChatColor.YELLOW + "Time set to " + timeValue);
        }
        return true;
    }
}
