package paper.plugin.earthPlugin.handler;

import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import paper.plugin.earthPlugin.helper.chat;
import paper.plugin.earthPlugin.helper.console;
import paper.plugin.earthPlugin.helper.player;

import java.util.UUID;

/*
* for future me and pan if ur reading this and ur helper for some reason
* decides to not work, check if the variable name is the same as the helper
* else if it is change it cus then obv u gotta change it duh
*/

public class PlayerJoinEventHandle extends JavaPlugin {
    public static void onJoin(Player p) {

        console.print(p.getName() + " has joined"); // <-- now this is the correct way

        chat.broadcast("Hey!",
                p.getName() + (!player.isNewPlayer(p) // <-- example on how to use isNewPlayer
                        ? " Welcome Back!"
                        : " Newbie ahh"),
                NamedTextColor.YELLOW);
    }
}
