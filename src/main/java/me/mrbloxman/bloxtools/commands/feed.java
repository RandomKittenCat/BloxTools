package me.mrbloxman.bloxtools.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;

public class feed implements CommandExecutor {

    @Override
    public boolean onCommand(@Nonnull CommandSender sender, @Nonnull Command command, @Nonnull String s, @Nonnull String[] args) {
        if (sender instanceof Player p){
            if (args.length == 0){
                p.setFoodLevel(20);
                p.sendMessage(ChatColor.YELLOW + "You have restored your hunger bar");
            }else{
                String playerName = args[0];
                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if (target == null){
                    p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "That player is not online.");
                }else{
                    target.setFoodLevel(20);
                    target.sendMessage(ChatColor.YELLOW + "Your hunger has been restored by another player");
                    p.sendMessage(ChatColor.YELLOW + "Sucessfully restored " + target.getDisplayName() + "'s hunger level");
                }
            }
        }
        return true;
    }
}
