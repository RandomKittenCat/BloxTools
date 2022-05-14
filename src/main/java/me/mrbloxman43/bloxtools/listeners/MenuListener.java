package me.mrbloxman43.bloxtools.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;


public class MenuListener implements Listener{

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){

        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "BloxTools Menu")){
            if(e.getCurrentItem() == null){
                return;
            }
            if(e.getCurrentItem().getType() == Material.PLAYER_HEAD){
                System.out.println("someone clicked view players, it doesn't work yet!");
            }
            // make it so players cannot move items around
            e.setCancelled(true);

        }



    }
}
