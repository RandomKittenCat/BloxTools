package me.mrbloxman43.bloxtools.commands;

import me.mrbloxman43.bloxtools.BloxTools;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import javax.annotation.Nonnull;

public class FeedCommand implements CommandExecutor {

    Plugin plugin = BloxTools.getPlugin(BloxTools.class);

    @Override
    public boolean onCommand(@Nonnull CommandSender sender,@Nonnull Command command,@Nonnull String label,@Nonnull String[] args) {

        String FeedYourselfMsg = plugin.getConfig().getString("FeedYourselfMessage");
        String PlayerWasFedMsg = plugin.getConfig().getString("PlayerWasFedMessage");
        if(sender instanceof Player player){

            if(args.length == 0) {

                player.setFoodLevel(20);
                player.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + FeedYourselfMsg);
            }else{
                String playerName = args[0];
                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if(target == null) {
                    player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "That player is not online.");
                }else{
                    target.setFoodLevel(20);
                    target.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + PlayerWasFedMsg);
                    player.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "You have successfully fed " + target.getDisplayName() + ChatColor.YELLOW + "" + ChatColor.BOLD + ".");
                }
            }
        }
        return true;
    }
}
