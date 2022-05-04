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

public class KillCommand implements CommandExecutor {

    Plugin plugin = BloxTools.getPlugin(BloxTools.class);

    @Override
    public boolean onCommand(@Nonnull CommandSender sender,@Nonnull Command command,@Nonnull String label,@Nonnull String[] args) {


        if(sender instanceof Player player){
            if(args.length == 0){
                player.sendMessage(ChatColor.RED + "You need to specify which player to kill, /kill {player}");
            }else{
                String playerName = args[0];
                Player target = Bukkit.getServer().getPlayerExact(playerName);
                if(target == null){
                    player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "That player is not online.");
                }else{
                    target.setHealth(0.0);
                    player.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "Successfully killed " + target.getDisplayName() + ChatColor.YELLOW + "" + ChatColor.BOLD + ".");
                }
            }

        }

        return true;
    }
}
