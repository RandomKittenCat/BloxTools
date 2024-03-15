package me.mrbloxman.bloxtools.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;
import java.util.Arrays;

public class time implements CommandExecutor {
    @Override
    public boolean onCommand(@Nonnull CommandSender sender,@Nonnull Command command,@Nonnull String s,@Nonnull String[] args) {
        if (sender instanceof Player p) {
            if (args.length == 0) {
                p.sendMessage(ChatColor.RED + "Please specify the time");
<<<<<<< HEAD
            }

            String timeArg = args[0];

            try{
                long timeValue = Long.parseLong(timeArg);
                p.getWorld().setTime(timeValue);
                p.sendMessage(ChatColor.YELLOW + "Time set to " + timeValue);
            } catch (NumberFormatException e) {
                p.sendMessage(ChatColor.RED + "Invalid time format, please specify a number");
=======
            }else{
                p.performCommand("time set " + Arrays.toString(args));
                p.sendMessage(ChatColor.YELLOW + "The time has been set to " + Arrays.toString(args));
>>>>>>> 008c0e21386f70ef87434fa7356c96b679fbad17
            }
        }
        return true;
    }
}
