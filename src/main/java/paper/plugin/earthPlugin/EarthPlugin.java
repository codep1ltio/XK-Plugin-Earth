package paper.plugin.earthPlugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import paper.plugin.earthPlugin.handler.PlayerJoinEventHandle;
import paper.plugin.earthPlugin.helper.console;

public final class EarthPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // this is needed so thr @eventhandler/listener works
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // ...
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        console.print(event.getPlayer().getName() + " has joined");
        PlayerJoinEventHandle.onJoin(event.getPlayer());
    }
}
