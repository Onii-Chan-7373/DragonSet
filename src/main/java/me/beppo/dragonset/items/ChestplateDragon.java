package me.beppo.dragonset.items;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

public class ChestplateDragon extends ItemStack {

    public static ItemStack chestplateDragon(){

        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta meta = (LeatherArmorMeta) chestplate.getItemMeta();
        List<String> lore = new ArrayList<>();

        lore.add("");
        lore.add(ChatColor.BOLD + "" + ChatColor.YELLOW + "Full set bonus:");
        lore.add(ChatColor.GRAY + "Reduces the damage you take drastically");

        meta.setDisplayName("Dragon Chestplate");
        meta.setColor(Color.RED);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 20, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 20, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 20, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 20, true);
        meta.addEnchant(Enchantment.THORNS, 5, true);

        meta.setLore(lore);
        chestplate.setItemMeta(meta);

        return chestplate;
    }


}
