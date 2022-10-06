package me.beppo.dragonset.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class DragonShard extends ItemStack {

    public static ItemStack dragonShard(){

        ItemStack shard = new ItemStack(Material.STRUCTURE_VOID);
        ItemMeta meta = shard.getItemMeta();
        List<String> lore = new ArrayList<>();

        lore.add("");
        lore.add(ChatColor.GRAY + "A Fragment used to craft dragon items. Dropped rarely when killing endearman");

        meta.setDisplayName("Dragon Shard");
        meta.addEnchant(Enchantment.DURABILITY, 100, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES);

        meta.setLore(lore);
        shard.setItemMeta(meta);

        return shard;
    }

}
