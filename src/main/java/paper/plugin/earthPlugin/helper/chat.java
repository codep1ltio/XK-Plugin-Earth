package paper.plugin.earthPlugin.helper;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class chat extends JavaPlugin {
    // Java doesn't support default arguments so this was my only option
    public static void message(Player p, String txt) {
        p.sendMessage(Component.text(txt));
    }
    public static void message(Player p, String txt, NamedTextColor color) {
        p.sendMessage(Component.text(txt).color(color));
    }

    // broadcasting is aura
    public static void broadcast(String txt) {
        Bukkit.getServer().broadcast(Component.text(txt));
    }
    public static void broadcast(String txt, NamedTextColor c) {
        Bukkit.getServer().broadcast(Component.text(txt).color(c));
    }
    // titled broadcast
    public static void broadcast(String title, String txt) {
        Bukkit.getServer().broadcast(Component.text(title));
        Bukkit.getServer().broadcast(Component.text(txt));
    }
    public static void broadcast(String title, String txt, NamedTextColor c) {
        Bukkit.getServer().broadcast(Component.text(title).color(c));
        Bukkit.getServer().broadcast(Component.text(txt));
    }
}
