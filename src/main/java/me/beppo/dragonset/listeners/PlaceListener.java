package me.beppo.dragonset.listeners;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlaceListener implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e){
        if(!e.getPlayer().getGameMode().equals(GameMode.CREATIVE) && e.getBlockPlaced().getType().equals(Material.STRUCTURE_VOID))
            e.setCancelled(true);
    }

}
