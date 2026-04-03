package paper.plugin.earthPlugin.helper;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class console extends JavaPlugin {
    public static void print(String text) {
        Bukkit.getServer().getLogger().info("Earth(C): " + text);
    }
}
