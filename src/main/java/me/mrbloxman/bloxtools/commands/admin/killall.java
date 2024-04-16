package me.mrbloxman.bloxtools.commands.admin;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;

public class killall implements CommandExecutor {
    @Override
    public boolean onCommand(@Nonnull CommandSender sender,@Nonnull Command command,@Nonnull String s,@Nonnull String[] args) {
            if (sender.hasPermission("bloxtools.killall")) {
                for (World world : sender.getServer().getWorlds()){
                    for (Entity entity : world.getEntities()) {
                        if(!(entity instanceof Player)) {
                            entity.remove();
                        }
                    }
                }
            sender.sendMessage(ChatColor.YELLOW + "All entities have been removed successfully.");
            }else{
                sender.sendMessage(ChatColor.RED + "You don't have permission to use this command!");
                return true;
            }
        return true;
    }
}
