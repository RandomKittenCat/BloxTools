package me.mrbloxman.bloxtools.commands.admin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;

public class KillCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@Nonnull CommandSender sender, @Nonnull Command command, @Nonnull String s, @Nonnull String[] args) {
        if (sender instanceof Player p){
            if (args.length == 0){
                p.sendMessage(ChatColor.YELLOW + "Successfully killed " + p.getDisplayName());
                p.setHealth(0);
            }else{
                String playerName = args[0];
                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if (target == null){
                    p.sendMessage(ChatColor.RED + "The player you specified is not online");
                }else {
                    target.setHealth(0);
                    p.sendMessage(ChatColor.YELLOW + "Successfully killed " + target.getDisplayName());
                }
            }
        }
        return true;
    }
}
