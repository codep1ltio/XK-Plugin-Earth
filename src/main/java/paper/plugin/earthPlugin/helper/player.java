package paper.plugin.earthPlugin.helper;

import org.bukkit.Location;
import org.bukkit.block.Biome;
import org.bukkit.entity.Player;

public class player {
    public static String getPlayerBiome(Player p) {
        Location loc = p.getLocation();
        Biome biome = loc.getWorld().getBiome(loc.getBlockX(), loc.getBlockY(), loc.getBlockZ());
        return biome.getKey().toString();
    }
}
