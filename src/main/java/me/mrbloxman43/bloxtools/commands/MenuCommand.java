package me.mrbloxman43.bloxtools.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;

import java.util.Collections;

public class MenuCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@Nonnull CommandSender sender,@Nonnull Command command,@Nonnull String label,@Nonnull String[] args) {

            Player p = (Player) sender;
            Inventory inventory = Bukkit.createInventory(p,9, ChatColor.RED + "" + ChatColor.BOLD + "BloxTools Menu");
            ItemStack PlayerHead = new ItemStack(Material.PLAYER_HEAD);
            ItemMeta headitemMeta = PlayerHead.getItemMeta();
            assert headitemMeta != null;
            headitemMeta.setDisplayName(ChatColor.GREEN + "Online Players");
            headitemMeta.setLore(Collections.singletonList(ChatColor.GREEN + "Click to view online players!"));
            PlayerHead.setItemMeta(headitemMeta);

            inventory.setItem(4, PlayerHead);
            p.openInventory(inventory);

        return true;
    }
}
