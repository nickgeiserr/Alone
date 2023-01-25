package me.xplore.alone;

import me.xplore.alone.Events.OnPlayerChat;
import me.xplore.alone.Events.OnPlayerJoin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Alone extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new OnPlayerChat(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerJoin(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
