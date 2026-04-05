package paper.plugin.earthPlugin.handler;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.ItemStack;
import paper.plugin.earthPlugin.helper.random;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

// fucking deletes ur stuff if u die lol :3

class Armor {
    ItemStack helmet;
    ItemStack chestplate;
    ItemStack leggings;
    ItemStack boots;

    public Armor(ItemStack helmet, ItemStack chestplate, ItemStack leggings, ItemStack boots) {
        this.helmet = helmet;
        this.chestplate = chestplate;
        this.leggings = leggings;
        this.boots = boots;
    }
}

public class PlayerDeathEventHandle {
    public static void playerDeath(PlayerDeathEvent event) {
        // if nothing held nothing will happen, if smth is held that shit gone
        Player player = event.getEntity();

        ItemStack mainHandItem = player.getInventory().getItemInMainHand();
        ItemStack offhandItem = player.getInventory().getItemInOffHand();
        ItemStack droppedCloneMain = mainHandItem.clone();
        ItemStack droppedCloneOff = offhandItem.clone();


        // random number between 1 or 2, 1 will mean mainhand and 2 = offhand
        int chosenHand = random.randomInt(0, 2);

        if (chosenHand == 1 && mainHandItem.getType() != Material.AIR) {
            player.getInventory().setItemInMainHand(null);
            player.getWorld().dropItemNaturally(player.getLocation(), droppedCloneMain);

        } else if (offhandItem.getType() != Material.AIR) {
            player.getInventory().setItemInOffHand(null);
            player.getWorld().dropItemNaturally(player.getLocation(), droppedCloneOff);
        }
        // HOLY SHIT FINALLY IM DONE, i started ts at like 19:10 btw and rn its 22:50

        Armor ar = new Armor(
                player.getInventory().getHelmet(),
                player.getInventory().getChestplate(),
                player.getInventory().getLeggings(),
                player.getInventory().getBoots()
        );

        int chosenArmor = random.randomInt(0, 4);

        switch (chosenArmor) {
            case 0 -> {
                if (ar.helmet != null && ar.helmet.getType() != Material.AIR) {
                    player.getInventory().setHelmet(null);
                } else {
                    assert ar.helmet != null;
                    ItemStack Clone = ar.helmet.clone();
                    player.getInventory().setHelmet(null);
                    player.getWorld().dropItemNaturally(player.getLocation(), Clone);
                }
            }
            case 1 -> {
                if (ar.chestplate != null && ar.chestplate.getType() != Material.AIR) {
                    player.getInventory().setHelmet(null);
                } else {
                    assert ar.chestplate != null;
                    ItemStack Clone = ar.chestplate.clone();
                    player.getInventory().setHelmet(null);
                    player.getWorld().dropItemNaturally(player.getLocation(), Clone);
                }
            }
            case 2 -> {
                if (ar.leggings != null && ar.leggings.getType() != Material.AIR) {
                    player.getInventory().setHelmet(null);
                } else {
                    assert ar.leggings != null;
                    ItemStack Clone = ar.leggings.clone();
                    player.getInventory().setHelmet(null);
                    player.getWorld().dropItemNaturally(player.getLocation(), Clone);
                }
            }
            case 3 -> {
                if (ar.boots != null && ar.boots.getType() != Material.AIR) {
                    player.getInventory().setHelmet(null);
                } else {
                    assert ar.boots != null;
                    ItemStack Clone = ar.boots.clone();
                    player.getInventory().setHelmet(null);
                    player.getWorld().dropItemNaturally(player.getLocation(), Clone);
                }
            }
        }
    }
}