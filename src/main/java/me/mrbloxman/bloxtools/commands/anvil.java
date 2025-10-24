package me.mrbloxman.bloxtools.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class anvil implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player p){
            Inventory anvil = p.getServer().createInventory(null, InventoryType.ANVIL);
            p.openInventory(anvil);
            return true;
        } else {
            sender.sendMessage(ChatColor.RED + "Only players can use this command");
            return true;
        }
    }
}
