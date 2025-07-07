package fr.wonderquest.BackItemClass;

import org.bukkit.Bukkit;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BackItemClass extends JavaPlugin {

    private final Map<UUID, ArmorStand> armorStandMap = new HashMap<>();
    private final Map<UUID, String> currentClassMap = new HashMap<>();

    @Override
    public void onEnable() {
        getLogger().info("WonderQuestBackItemClass actif.");

        new BukkitRunnable() {
            @Override
            public void run() {
                for (Player player : Bukkit.getOnlinePlayers()) {
                    UUID uuid = player.getUniqueId();
                    String newClass = getClassForPlayer(player);

                    if (!newClass.equals(currentClassMap.get(uuid))) {
                        removeArmorStand(player);

                        if (newClass != null) {
                            ArmorStand stand = ArmorStandFactory.spawnArmorStand(player, newClass);
                            armorStandMap.put(uuid, stand);
                            currentClassMap.put(uuid, newClass);
                        } else {
                            currentClassMap.remove(uuid);
                        }
                    }

                    ArmorStand stand = armorStandMap.get(uuid);
                    if (stand != null && !stand.isDead()) {
                        stand.teleport(player.getLocation()
                                .add(player.getLocation().getDirection().multiply(-0.5))
                                .add(0, 1.2, 0));
                    }
                }
            }
        }.runTaskTimer(this, 0L, 10L);
    }

    @Override
    public void onDisable() {
        armorStandMap.values().forEach(stand -> {
            if (stand != null && !stand.isDead()) {
                stand.remove();
            }
        });
        armorStandMap.clear();
        currentClassMap.clear();
    }

    public void removeArmorStand(Player player) {
        ArmorStand stand = armorStandMap.remove(player.getUniqueId());
        if (stand != null && !stand.isDead()) {
            stand.remove();
        }
    }

    private String getClassForPlayer(Player player) {
        if (player.hasPermission("wonderquest.class.combattant")) {
            return "combattant";
        } else if (player.hasPermission("wonderquest.class.constructeur")) {
            return "constructeur";
        } else if (player.hasPermission("wonderquest.class.explorateur")) {
            return "explorateur";
        } else if (player.hasPermission("wonderquest.class.survivant")) {
            return "survivant";
        } else {
            return null;
        }
    }
}
