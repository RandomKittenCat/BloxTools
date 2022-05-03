package me.mrbloxman43.bloxtools.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;

public class InfoCommand implements CommandExecutor {


    @Override
    public boolean onCommand(@Nonnull CommandSender sender, @Nonnull Command command, String label, @Nonnull String[] args) {
        if (label.equalsIgnoreCase("btinfo")){

            if (sender instanceof Player p){

                p.sendMessage(ChatColor.RED + "The BloxTools plugin is made and maintained by MrBloxMan43, you can view the source of the code here: https://github.com/RandomKittenCat/BloxTools");

            }

        }

        return true;
    }




}
