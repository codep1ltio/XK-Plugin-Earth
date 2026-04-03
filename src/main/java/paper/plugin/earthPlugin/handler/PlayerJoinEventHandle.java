package paper.plugin.earthPlugin.handler;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

public class PlayerJoinEventHandle extends JavaPlugin {
    public static void onJoin(Player player) {
        UUID PlayerUUID = player.getUniqueId();

        player.sendMessage(Component.text("Welcome to the server, " + player.getName(), NamedTextColor.GREEN));
    }
}
