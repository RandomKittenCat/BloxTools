package me.mrbloxman43.bloxtools.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinLeaveListener implements Listener {

    //When doing an event handler you can either say "event" or "e"


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        System.out.println("A player joined the server!");
    }


}
