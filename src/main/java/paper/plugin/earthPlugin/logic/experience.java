package paper.plugin.earthPlugin.logic;

import org.bukkit.entity.Player;
import paper.plugin.earthPlugin.handler.DataHandler;

/**
 * xp points thingie file to handle that
 */

public class experience {
    public static long getExperience(Player p) {
        return DataHandler.readExperience(p.getUniqueId());
    }
}
