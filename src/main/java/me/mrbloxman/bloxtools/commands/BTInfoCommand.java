package me.mrbloxman.bloxtools.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;

public class BTInfoCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@Nonnull CommandSender sender, @Nonnull Command command, String label, @Nonnull String[] args){
        sender.sendMessage(ChatColor.RED + "The BloxTools plugin is made and maintained by MrBloxMan, you can find support for the plugin at: https://github.com/RandomKittenCat/BloxTools");
        return true;
    }
}