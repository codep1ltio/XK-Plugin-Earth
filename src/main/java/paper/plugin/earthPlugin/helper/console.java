package paper.plugin.earthPlugin.helper;

import org.bukkit.Bukkit;

public class console {
    public static void print(String text) {
        Bukkit.getServer().getLogger().info("Earth(C): " + text);
    }
}
