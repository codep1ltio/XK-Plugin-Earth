package paper.plugin.earthPlugin.helper;

import org.bukkit.Bukkit;
import paper.plugin.earthPlugin.EarthPlugin;

public class timer {

    // example on how to use timer is in PlayerJoinEventHandle
    public static void wait(long ms, Runnable task) {
        System.out.println(EarthPlugin.getInstance());
        Bukkit.getScheduler().runTaskLater(EarthPlugin.getInstance(), task, ms / 50);
    }
}
