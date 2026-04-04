package paper.plugin.earthPlugin.handler;

import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import paper.plugin.earthPlugin.helper.chat;
import paper.plugin.earthPlugin.helper.console;
import paper.plugin.earthPlugin.helper.player;
import paper.plugin.earthPlugin.helper.timer;

import java.util.UUID;

/*
* for future me and pan if ur reading this and ur helper for some reason
* decides to not work, check if the variable name is the same as the helper
* else if it is change it cus then obv u gotta change it duh
*/

public class PlayerJoinEventHandle {
    public static void onJoin(Player p) {

        timer.wait(3000, () -> {
            chat.broadcast("Hey!",
                    p.getName() + ": I am in this biome: " + player.getPlayerBiome(p));
        });
    }
}
