package fr.wonderquest.BackItemClass;

import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ArmorStandFactory {

    public static ArmorStand spawnArmorStand(Player player, String classe) {
        Material material = null;

        switch (classe) {
            case "combattant":
                material = Material.IRON_SWORD;
                break;
            case "constructeur":
                material = Material.IRON_PICKAXE;
                break;
            case "explorateur":
                material = Material.FILLED_MAP;
                break;
            case "survivant":
                material = Material.GOLDEN_APPLE;
                break;
        }

        if (material == null) {
            return null;
        }

        ArmorStand stand = (ArmorStand) player.getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
        stand.setVisible(false);
        stand.setMarker(true);
        stand.setGravity(false);
        stand.setSmall(true);
        stand.setHelmet(new ItemStack(material));
        stand.setCustomNameVisible(false);

        return stand;
    }
}
