package me.mrbloxman.bloxtools.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class clearinv implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (args.length == 0){
            if (sender instanceof Player p) {
                p.getInventory().clear();
                p.sendMessage(ChatColor.YELLOW + "Your inventory has been cleared.");
            }
        } else {
            if (sender.hasPermission("bloxtools.clearinv.others")) {
                String playerName = args[0];
                Player target = Bukkit.getPlayerExact(playerName);

                if (target == null) {
                    sender.sendMessage(ChatColor.RED + "The player you specified is not online");
                } else {
                    target.getInventory().clear();
                }
            } else {
                sender.sendMessage(ChatColor.RED + "You don't have permission to use this command! (on others)");
            }
        }
        return true;
    }
}
