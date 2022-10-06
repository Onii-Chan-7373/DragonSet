package me.beppo.dragonset.commands;

import me.beppo.dragonset.items.*;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandDragon implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(label.equalsIgnoreCase("dragonset")){
            if(sender.hasPermission("dragon.fullset")){
                if(sender instanceof Player){
                    Player p = (Player) sender;
                    World w = p.getWorld();
                    Location loc = p.getLocation();

                    w.dropItemNaturally(loc,ChestplateDragon.chestplateDragon());
                    w.dropItemNaturally(loc, LeggingsDragon.dragonLeggings());
                    w.dropItemNaturally(loc, BootsDragon.dragonBoots());
                    w.dropItemNaturally(loc, HelmetDragon.dragonHelmet());
                    w.dropItemNaturally(loc, SwordDragon.dragonSword());
                    w.dropItemNaturally(loc, DragonShard.dragonShard());
                    w.dropItemNaturally(loc, DragonWings.dragonWings());
                }else {
                    sender.sendMessage("This command is not usable as console");
                }
            }else{
                sender.sendMessage(ChatColor.RED + "You are not allowed to use this command");
            }
        }
        return false;
    }
}
