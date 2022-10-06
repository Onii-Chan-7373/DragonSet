package me.beppo.dragonset.listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

public class SwordLsiterners implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent e){
        Player p = e.getPlayer();
        if(e.getAction() == Action.RIGHT_CLICK_AIR){
            if(p.getItemInHand().getItemMeta().getDisplayName().contains("Dragon Sword")){
                if(p.getItemInHand().getItemMeta().hasLore()){
                    Location playerLocation = p.getLocation();
                    Vector playerDirection = p.getLocation().getDirection();
                    playerDirection.multiply(8);
                    Location targetLocation = playerLocation.add(playerDirection);
                    if(targetLocation.getBlock().getType() == Material.AIR || targetLocation.getBlock().getType() == Material.WATER){
                        p.teleport(targetLocation);
                    }else{
                        while (targetLocation.getBlock().getType() != Material.AIR){
                            targetLocation.add(0, 1, 0);
                        }
                        p.teleport(targetLocation);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent e){
        if(e.getDamager() instanceof Player){
            Player p = (Player) e.getDamager();
            if(p.getItemInHand().getItemMeta().getDisplayName().contains("Dragon Sword"))
                if(p.getItemInHand().getItemMeta().hasLore()){
                    e.setDamage(e.getDamage() * 2);
                }
        }
    }

}
