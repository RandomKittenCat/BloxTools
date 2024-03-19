package me.mrbloxman.bloxtools.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;

public class heal implements CommandExecutor {
    @Override
    public boolean onCommand(@Nonnull CommandSender sender,@Nonnull Command command,@Nonnull String s,@Nonnull String[] args) {
        if (sender instanceof Player p) {
            if (args.length == 0){
                p.setHealth(20);
                p.sendMessage(ChatColor.YELLOW + "You have healed yourself.");
            }else{

                String playerName = args[0];
                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if(target == null) {
                    p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "The player you specified is not online");
                }else{
                    target.setHealth(20);
                    target.sendMessage(ChatColor.YELLOW + "You have been healed by another player.");
                    p.sendMessage(ChatColor.YELLOW + "" + "You have successfully healed " + target.getDisplayName() + ".");
                }
            }
        }
        return true;
    }
}
