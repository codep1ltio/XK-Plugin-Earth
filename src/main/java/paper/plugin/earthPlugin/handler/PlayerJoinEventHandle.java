package paper.plugin.earthPlugin.handler;

import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import paper.plugin.earthPlugin.helper.chat;

import java.util.UUID;

public class PlayerJoinEventHandle extends JavaPlugin {
    public static void onJoin(Player player) {
        UUID PlayerUUID = player.getUniqueId();

        chat.broadcast("A Player Has Joined!",
                player.getName() + " is welcome to the server!", NamedTextColor.YELLOW);
        chat.message(player, PlayerUUID + " tuff UUID");
    }
}
