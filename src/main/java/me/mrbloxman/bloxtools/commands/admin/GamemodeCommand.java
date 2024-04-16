package me.mrbloxman.bloxtools.commands.admin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;

public class GamemodeCommand implements CommandExecutor {

    private GameMode gameMode;

    public GamemodeCommand(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    @Override
    public boolean onCommand(@Nonnull CommandSender sender, @Nonnull Command command, @Nonnull String s, @Nonnull String[] args) {
        if (sender instanceof Player p){
           if (args.length == 0){
               p.setGameMode(gameMode);
               p.sendMessage(ChatColor.YELLOW + "Your gamemode has been set to " + this.gameMode.name().toLowerCase());
           }else{
               String playerName = args[0];
               Player target = Bukkit.getServer().getPlayerExact(playerName);

               if (target == null){
                   p.sendMessage(ChatColor.RED + "The player you specified is not online");
               }else{
                   target.sendMessage(ChatColor.YELLOW + "Your gamemode has been set to " + this.gameMode.name().toLowerCase() + " by another player");
                   p.sendMessage(ChatColor.YELLOW + "Their gamemode has been successfully set");
                   target.setGameMode(this.gameMode);
               }
           }
        }
        return true;
    }
}
