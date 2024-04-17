package me.mrbloxman.bloxtools.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;

public class whisper implements CommandExecutor {
    @Override
    public boolean onCommand(@Nonnull CommandSender sender,@Nonnull Command command,@Nonnull String s,@Nonnull String[] args) {
        if (sender instanceof Player p) {
            if (args.length >= 2){
                Player target = Bukkit.getPlayerExact(args[0]);
                if (target == null){
                    sender.sendMessage(ChatColor.RED + "Player not found or not online.");
                }else {
                    StringBuilder messageBuilder = new StringBuilder();
                    for (int i = 1; i < args.length; i++) {
                        messageBuilder.append(args[i]).append(" ");
                    }
                    String message = messageBuilder.toString().trim();

                    // Send message to user
                    sender.sendMessage(ChatColor.GRAY + "[To " + target.getName() + "] " + ChatColor.WHITE + message);
                    target.sendMessage(ChatColor.GRAY + "[From " + sender.getName() + "] " + ChatColor.WHITE + message);
                }
            }else{
                p.sendMessage(ChatColor.RED + "Usage: /whisper <player> <message>");
                return true;
            }
        }else{
            sender.sendMessage(ChatColor.RED + "This command can only be used by players.");
            return true;
        }
        return true;
    }
}
