package paper.plugin.earthPlugin.helper;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class player extends JavaPlugin {
    public static boolean isNewPlayer(Player p) {
        return p.hasPlayedBefore();
    }
}
