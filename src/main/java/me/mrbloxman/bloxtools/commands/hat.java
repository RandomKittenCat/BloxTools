package me.mrbloxman.bloxtools.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class hat implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player p){
            ItemStack item = p.getInventory().getItemInMainHand();

            if(item.getType() == Material.AIR) {
                p.sendMessage(ChatColor.RED + "You aren't holding an item.");
                return true;
            } else {
                ItemStack previousHelmet = p.getInventory().getHelmet();
                p.getInventory().setHelmet(item);
                p.getInventory().setItemInMainHand(previousHelmet);
                return true;
            }
        } else {
            sender.sendMessage(ChatColor.RED + "Only players can use this command");
        }
        return true;
    }
}
