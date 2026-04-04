package paper.plugin.earthPlugin.handler;

import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
import paper.plugin.earthPlugin.helper.chat;

public class ChatSystemHandle {
    public static void playerChat(AsyncChatEvent event) {
        chat.broadcast(
               event.getPlayer().getName()
                       + " > "
                       + PlainTextComponentSerializer.plainText().serialize(event.message())
                        // idk why paper wanted us to suffer like this
        );
    }
}
