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

public class HealCommand implements CommandExecutor {

    Plugin plugin = BloxTools.getPlugin(BloxTools.class);

    @Override
    public boolean onCommand(@Nonnull CommandSender sender, @Nonnull Command command, @Nonnull String label, @Nonnull String[] args) {

        String HealYourselfMsg = plugin.getConfig().getString("HealYourselfMessage");
        String PlayerWasHealedMsg = plugin.getConfig().getString("PlayerWasHealedMessage");
        if(sender instanceof Player player){


            if(args.length == 0) {

                player.setHealth(20);
                player.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + HealYourselfMsg);
            }else{

                String playerName = args[0];

                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if(target == null) {
                    player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "That player is not online.");
                }else{

                    target.setHealth(20);
                    target.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + PlayerWasHealedMsg);
                    player.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "You have successfully healed " + target.getDisplayName() + ".");


                }




            }


        }


        return true;
    }
}


