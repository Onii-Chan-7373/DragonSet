package me.beppo.dragonset;

import me.beppo.dragonset.commands.CommandDragon;
import me.beppo.dragonset.items.*;
import me.beppo.dragonset.listeners.EntityDieListener;
import me.beppo.dragonset.listeners.PlaceListener;
import me.beppo.dragonset.listeners.SwordLsiterners;
import me.beppo.dragonset.listeners.WingListener;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class DragonSet extends JavaPlugin {

    public static HashMap<Player, Long> wingCooldown = new HashMap<Player, Long>();

    @Override
    public void onEnable() {
        // Plugin startup logic
        startupRegister();
    }

    public void startupRegister(){
        getCommand("dragonset").setExecutor(new CommandDragon());

        this.getServer().getPluginManager().registerEvents(new SwordLsiterners(), this);
        this.getServer().getPluginManager().registerEvents(new PlaceListener(), this);
        this.getServer().getPluginManager().registerEvents(new EntityDieListener(), this);
        this.getServer().getPluginManager().registerEvents(new WingListener(), this);

        Bukkit.addRecipe(craftDragonChestplate());
        Bukkit.addRecipe(craftDragonLeggings());
        Bukkit.addRecipe(craftDragonBoots());
        Bukkit.addRecipe(craftDragonHelmet());
        Bukkit.addRecipe(craftDragonWings());
    }

    public ShapedRecipe craftDragonWings() {

        ItemStack item = DragonWings.dragonWings();
        NamespacedKey key = new NamespacedKey(this,"Dragon_Wings");
        ShapedRecipe recipe = new ShapedRecipe(key, item);

        recipe.shape("sss", "sss", "sss");
        recipe.setIngredient('s', Material.STRUCTURE_VOID);

        return recipe;
    }

    public ShapedRecipe craftDragonChestplate() {

        ItemStack item = ChestplateDragon.chestplateDragon();
        NamespacedKey key = new NamespacedKey(this,"Dragon_Chesplate");
        ShapedRecipe recipe = new ShapedRecipe(key, item);

        recipe.shape("s s", "sss", "sss");
        recipe.setIngredient('s', Material.STRUCTURE_VOID);

        return recipe;
    }

    public ShapedRecipe craftDragonBoots() {

        ItemStack item = BootsDragon.dragonBoots();
        NamespacedKey key = new NamespacedKey(this,"Dragon_Boots");
        ShapedRecipe recipe = new ShapedRecipe(key, item);

        recipe.shape("   ", "s s", "s s");
        recipe.setIngredient('s', Material.STRUCTURE_VOID);

        return recipe;
    }

    public ShapedRecipe craftDragonLeggings() {

        ItemStack item = LeggingsDragon.dragonLeggings();
        NamespacedKey key = new NamespacedKey(this,"Dragon_Leggings");
        ShapedRecipe recipe = new ShapedRecipe(key, item);

        recipe.shape("sss", "s s", "s s");
        recipe.setIngredient('s', Material.STRUCTURE_VOID);

        return recipe;
    }

    public ShapedRecipe craftDragonHelmet() {

        ItemStack item = HelmetDragon.dragonHelmet();
        NamespacedKey key = new NamespacedKey(this,"Dragon_Helmet");
        ShapedRecipe recipe = new ShapedRecipe(key, item);

        recipe.shape("sss", "s s", "   ");
        recipe.setIngredient('s', Material.STRUCTURE_VOID);

        return recipe;
    }

}
