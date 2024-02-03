package me.mrbloxman.bloxtools.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gmc implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player p){
           if (args.length == 0){
               p.setGameMode(GameMode.CREATIVE);
               p.sendMessage(ChatColor.YELLOW + "Your gamemode has been set to creative");
           }else{
               String playerName = args[0];
               Player target = Bukkit.getServer().getPlayerExact(playerName);

               if (target == null){
                   p.sendMessage(ChatColor.RED + "This player is not online.");
               }else{
                   target.sendMessage(ChatColor.YELLOW + "Your gamemode has been set to creative by another player.");
                   p.sendMessage(ChatColor.YELLOW + "Their gamemode has been sucessfully set.");
                   target.setGameMode(GameMode.CREATIVE);
               }

           }
        }
        return true;
    }
}
