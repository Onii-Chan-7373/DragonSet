package me.beppo.dragonset.items;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.List;

public class SwordDragon extends ItemStack{

    public static ItemStack dragonSword(){

        ItemStack sword = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta meta = sword.getItemMeta();
        List<String> lore = new ArrayList<>();

        lore.add("");
        lore.add(ChatColor.BOLD + "" + ChatColor.YELLOW + "Right Click:");
        lore.add(ChatColor.GRAY + "Teleport 8 blocks ahead of you");

        meta.setDisplayName("Dragon Sword");
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 20, true);
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 20, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 20, true);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
        meta.addEnchant(Enchantment.KNOCKBACK, 3, true);

        meta.setLore(lore);
        sword.setItemMeta(meta);

        return sword;
    }

}
