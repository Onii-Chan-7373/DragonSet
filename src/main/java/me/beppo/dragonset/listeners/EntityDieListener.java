package me.beppo.dragonset.listeners;

import me.beppo.dragonset.items.DragonShard;
import me.beppo.dragonset.items.SwordDragon;
import org.bukkit.World;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Enderman;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Random;

public class EntityDieListener implements Listener {

    @EventHandler
    public void onDeath(EntityDeathEvent e){
            if(e.getEntity() instanceof Enderman){
                Random rand = new Random();
                if(rand.nextInt(100) <= 10){
                    World w = e.getEntity().getWorld();
                    w.dropItemNaturally(e.getEntity().getLocation(), DragonShard.dragonShard());
                }
            }else if(e.getEntity() instanceof EnderDragon){
                Random rand = new Random();
                if(rand.nextInt(100) <= 50){
                    World w = e.getEntity().getWorld();
                    w.dropItemNaturally(e.getEntity().getLocation(), SwordDragon.dragonSword());
                }
            }
    }

}
