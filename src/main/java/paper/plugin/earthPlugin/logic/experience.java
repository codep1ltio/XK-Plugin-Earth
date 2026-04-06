package paper.plugin.earthPlugin.logic;

import net.kyori.adventure.text.format.NamedTextColor;

import org.bukkit.entity.Player;
import paper.plugin.earthPlugin.handler.DataHandler;
import paper.plugin.earthPlugin.helper.chat;
import paper.plugin.earthPlugin.helper.random;

/**
 * xp points thingie file to handle that
 */

public class experience {
    public static long getExperience(Player p) {
        return DataHandler.readExperience(p.getUniqueId());
    }

    public static void addExperience(Player p, int points) {
        float Xpoints = random.randomFloat(2.0f, 20.0f) + points;
        chat.sendActionBar(p, "+" + Xpoints + " XP", NamedTextColor.YELLOW);
        
        DataHandler.saveExperience(p.getUniqueId(), getExperience(p) + Xpoints);
    }
}
