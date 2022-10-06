package me.beppo.dragonset.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class DragonWings extends ItemStack {

    public static ItemStack dragonWings(){

        ItemStack wings = new ItemStack(Material.ELYTRA);
        ItemMeta meta = wings.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();

        meta.setDisplayName("Dragon Wings");
        meta.setUnbreakable(true);
        meta.addEnchant(Enchantment.ARROW_FIRE, 100, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        lore.add(ChatColor.BOLD + "" + ChatColor.GOLD + "ABILITY FLY:");
        lore.add(ChatColor.GRAY + "While in the air sneak to launch \n you in your direction. \n Has a 5 second cooldown.");

        meta.setLore(lore);
        wings.setItemMeta(meta);

        return wings;
    }

}
