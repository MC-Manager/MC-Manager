package me.jozo.me.manager.Me;

import me.jozo.me.manager.Me.event.Join;
import me.jozo.me.manager.Me.event.Leave;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents((Listener) new Join(), (Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener) new Leave(), (Plugin)this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
