package me.mrbloxman.bloxtools.commands;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;

import javax.annotation.Nonnull;

public class killall implements CommandExecutor {
    @Override
    public boolean onCommand(@Nonnull CommandSender sender,@Nonnull Command command,@Nonnull String s,@Nonnull String[] args) {
        if (args.length == 1 && args[0].equalsIgnoreCase("confirm")) {
            for (World world : sender.getServer().getWorlds()){
                for (Entity entity : world.getEntities()) {
                    if(!(entity instanceof Player || entity instanceof Minecart || entity instanceof Item || entity instanceof Boat
                    || entity instanceof ExperienceOrb || entity instanceof Trident || entity instanceof Snowball || entity instanceof LlamaSpit
                    || entity instanceof EnderPearl || entity instanceof TNTPrimed || entity instanceof FallingBlock || entity instanceof Arrow
                    || entity instanceof Firework || entity instanceof ArmorStand || entity instanceof ItemFrame || entity instanceof Painting
                    || entity instanceof LightningStrike || entity instanceof FishHook || entity instanceof Fireball | entity instanceof ShulkerBullet
                    || entity instanceof EnderCrystal || entity instanceof EvokerFangs || entity instanceof LeashHitch || entity instanceof AreaEffectCloud)) {
                            entity.remove();

                    }
                }
            }
            sender.sendMessage(ChatColor.YELLOW + "All mobs and monsters have been removed successfully.");
        }else{
            sender.sendMessage(ChatColor.RED + "Are you 100% sure you want to kill ALL mobs and monsters? This INCLUDES pets and name tagged animals but does not include things like paintings, armor stands, and item frames. (VERY DANGEROUS, NOT RECOMMENDED)");
            sender.sendMessage(ChatColor.RED + "Type '" + ChatColor.GREEN + "/killall confirm" + ChatColor.RED + "' to confirm this command.");
        }
        return true;
    }
}
