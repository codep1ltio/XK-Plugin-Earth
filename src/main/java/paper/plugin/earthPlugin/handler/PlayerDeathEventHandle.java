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

public class PlayerDeathEventHandle implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        // if nothing held nothing will happen, if smth is held that shit gone
        Player player = event.getEntity();

        // makes a true or false for if death cause was by a player or not
        boolean killedByPlayer = event.getDamageSource().getCausingEntity() instanceof Player;

        ItemStack mainHandItem = player.getInventory().getItemInMainHand();
        ItemStack offhandItem = player.getInventory().getItemInOffHand();
        ItemStack droppedCloneMain = mainHandItem.clone();
        ItemStack droppedCloneOff = offhandItem.clone();


        // random number between 1 or 2, 1 will mean mainhand and 2 = offhand
        int chosenHand = random.randomInt(1, 3);

        if (killedByPlayer == false) {
            if (chosenHand == 1) {
                if (mainHandItem.getType() == Material.AIR) {
                }
                else {
                    player.getInventory().setItemInMainHand(null);
                }
            }
            else {
                if (offhandItem.getType() == Material.AIR) {
                }
                else {
                    player.getInventory().setItemInOffHand(null);
                }
            }
        }
        if (killedByPlayer == true) {
            if (chosenHand == 1) {
                if (mainHandItem.getType() == Material.AIR) {
                }
                else {
                    player.getInventory().setItemInMainHand(null);
                    player.getWorld().dropItemNaturally(player.getLocation(), droppedCloneMain);
                }
            }
            else {
                if (offhandItem.getType() == Material.AIR) {
                }
                else {
                    player.getInventory().setItemInOffHand(null);
                    player.getWorld().dropItemNaturally(player.getLocation(), droppedCloneOff);
                }
            }
        }
        // HOLY SHIT FINALLY IM DONE, i started ts at like 19:10 btw and rn its 22:50

        ItemStack helmet = player.getInventory().getHelmet();
        ItemStack chestplate = player.getInventory().getChestplate();
        ItemStack leggings = player.getInventory().getLeggings();
        ItemStack boots = player.getInventory().getBoots();

        // for helmet
        if (helmet == null || helmet.getType() == Material.AIR) {
        }
        else {
            if (random.chanceOneInThree()) {
                if (killedByPlayer == false) {
                    player.getInventory().setHelmet(null);
                }
                else {
                    ItemStack droppedCloneHelmet = helmet.clone();
                    player.getInventory().setHelmet(null);
                    player.getWorld().dropItemNaturally(player.getLocation(), droppedCloneHelmet);
                }
            }
        }

        // for chestplate
        if (chestplate == null || chestplate.getType() == Material.AIR) {
        }
        else {
            if (random.chanceOneInThree()) {
                if (killedByPlayer == false) {
                    player.getInventory().setChestplate(null);
                }
                else {
                    ItemStack droppedCloneChestplate = chestplate.clone();
                    player.getInventory().setChestplate(null);
                    player.getWorld().dropItemNaturally(player.getLocation(), droppedCloneChestplate);
                }
            }
        }

        // for leggings
        if (leggings == null || leggings.getType() == Material.AIR) {
        }
        else {
            if (random.chanceOneInThree()) {
                if (killedByPlayer == false) {
                    player.getInventory().setLeggings(null);
                }
                else {
                    ItemStack droppedCloneLeggings = leggings.clone();
                    player.getInventory().setLeggings(null);
                    player.getWorld().dropItemNaturally(player.getLocation(), droppedCloneLeggings);
                }
            }
        }

        // for boots
        if (boots == null || boots.getType() == Material.AIR) {
        }
        else {
            if (random.chanceOneInThree()) {
                if (killedByPlayer == false) {
                    player.getInventory().setBoots(null);
                }
                else {
                    ItemStack droppedCloneBoots = boots.clone();
                    player.getInventory().setBoots(null);
                    player.getWorld().dropItemNaturally(player.getLocation(), droppedCloneBoots);
                }
            }
        }
    }
}