package paper.plugin.earthPlugin.handler;

import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
import org.bukkit.plugin.java.JavaPlugin;
import paper.plugin.earthPlugin.helper.chat;

public class ChatSystem extends JavaPlugin {
    public static void playerChat(AsyncChatEvent event) {
        chat.broadcast(
               event.getPlayer().getName()
                       + " > "
                       + PlainTextComponentSerializer.plainText().serialize(event.message())
                        // idk why paper wanted us to suffer like this
        );
    }
}
