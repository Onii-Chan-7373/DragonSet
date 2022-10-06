package me.beppo.dragonset.items;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.List;

public class HelmetDragon extends ItemStack {

    public static ItemStack dragonHelmet() {

        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta meta = (LeatherArmorMeta) helmet.getItemMeta();
        List<String> lore = new ArrayList<>();

        lore.add("");
        lore.add(ChatColor.BOLD + "" + ChatColor.YELLOW + "Full set bonus:");
        lore.add(ChatColor.GRAY + "Reduces the damage you take drastically");

        meta.setDisplayName("Dragon Helmet");
        meta.setColor(Color.RED);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 20, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 20, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 20, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 20, true);
        meta.addEnchant(Enchantment.THORNS, 5, true);

        meta.setLore(lore);
        helmet.setItemMeta(meta);

        return helmet;

    }

}
