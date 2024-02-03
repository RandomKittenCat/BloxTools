package me.mrbloxman.bloxtools.commands;

import me.mrbloxman.bloxtools.BloxTools;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class heal implements CommandExecutor {
    Plugin plugin = BloxTools.getPlugin(BloxTools.class);
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player p) {

            if (args.length == 0){
                p.setHealth(20);
                p.sendMessage(ChatColor.YELLOW + "You have healed yourself.");
            }else{

                String playerName = args[0];
                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if(target == null) {
                    p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "That player is not online.");
                }else{
                    target.setHealth(20);
                    target.sendMessage(ChatColor.YELLOW + "You have been healed by another player.");
                    p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "You have successfully healed " + target.getDisplayName() + ".");
                }
            }
        }
        return true;
    }
}
