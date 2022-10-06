package me.beppo.dragonset.listeners;

import me.beppo.dragonset.DragonSet;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class WingListener implements Listener {

    @EventHandler
    public void onWingBoost(PlayerToggleSneakEvent e){
        Player p = e.getPlayer();
        if(p.isSneaking())
            if(p.getInventory().getChestplate() != null)
                if(p.getInventory().getChestplate().getItemMeta().hasLore())
                    if(p.getInventory().getChestplate().getItemMeta().getDisplayName().contains("Dragon Wings")){
                        if(DragonSet.wingCooldown.get(p) > System.currentTimeMillis()){
                            long timeLeft = (DragonSet.wingCooldown.get(p) - System.currentTimeMillis()) / 1000;
                            p.sendMessage(ChatColor.RED + "Ability on cooldown for " + timeLeft + " seconds!");
                        }else{
                            p.setVelocity(p.getLocation().getDirection().multiply(2));
                            DragonSet.wingCooldown.put(p, System.currentTimeMillis() + (3 * 1000));
                        }
                    }
    }

}
