package me.xplore.alone.Events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class OnPlayerChat implements Listener {
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event){
        Player sender = event.getPlayer();
        Location senderLocation = sender.getLocation();
        String message = event.getMessage();
        for (Player p : Bukkit.getServer().getOnlinePlayers()) {
            Location receiverLocation = p.getLocation();
            if (senderLocation.distance(receiverLocation) <= 5) {
                p.sendMessage(message);
            }
        }
        event.setCancelled(true);
    }
}
