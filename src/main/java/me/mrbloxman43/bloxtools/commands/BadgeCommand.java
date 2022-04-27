package me.mrbloxman43.bloxtools.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;
import java.util.ArrayList;

public class BadgeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@Nonnull CommandSender sender, @Nonnull Command command, @Nonnull String label, @Nonnull String[] args) {
        if (label.equalsIgnoreCase("flowerbadge")){
            if (sender instanceof Player player) {

                // Give player sunflower badge
                ItemStack sunflower = new ItemStack(Material.SUNFLOWER);
                // Meta
                ItemMeta im = sunflower.getItemMeta();
                // Set name
                assert im != null;
                im.setDisplayName(ChatColor.GREEN + "Badge");
                // Creating lore arraylist
                ArrayList<String> lore = new ArrayList<>();
                // Split String
                String[] arrOfStr = sender.toString().split("=");
                // Remove last char
                String newstr = arrOfStr[1].substring(0, arrOfStr[1].length() - 1);
                // Add lore
                lore.add(ChatColor.GREEN + "" + "Special badge from " + ChatColor.RESET + "" + ChatColor.YELLOW + "" + ChatColor.BOLD + newstr);
                // Set the lore
                im.setLore(lore);
                //Set item meta
                sunflower.setItemMeta(im);
                // Amount
                sunflower.setAmount(1);
                // Give the player the items
                player.getInventory().addItem(sunflower);
                // test
                System.out.println(newstr);

                //flowerbadge MrBloxMan43

        }

        }
        return true;
    }

}
