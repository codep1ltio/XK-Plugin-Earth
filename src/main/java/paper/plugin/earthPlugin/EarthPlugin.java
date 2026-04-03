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

    /*
     * pan to get u started, helpers have the like, functions to make stuff easier, for example console.print()
     * and you can make ur own helpers, I will refactor them later if it sucks, but it shouldn't be that hard
     * handlers are the things that do the events, so PlayerJoinEventHandle is where you code stuff that
     * happens after player joins, we of course have to make another file if it gets off-topic to like mechanics
     * I will help u with that, dw and also this file is for only event handlers, and basic stuff, don't code
     * literal mechanics here, just @EventHandlers like onPlayerJoin event under this comment
     * also bro u can text me on discord anytime, don't use gpt, only use it to learn or ask something u don't know
     * don't make it code for u, please I beg u I love human code more (Intelli forced me to fix my grammar)
     */

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        console.print(event.getPlayer().getName() + " has joined");
        PlayerJoinEventHandle.onJoin(event.getPlayer());
    }
}
