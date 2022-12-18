package pb.lofe.configl;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ConfigL extends JavaPlugin {


    @Override
    public void onEnable() {
        saveDefaultConfig();
        if(getConfig().getBoolean("showLoadedMessage"))
            Bukkit.getConsoleSender().sendMessage("§aConfigL§a§nAPI§r §aloaded.");
    }

    @Override
    public void onLoad() {
        if(getConfig().getBoolean("showLoadMessage"))
            Bukkit.getConsoleSender().sendMessage("§eConfigL§e§nAPI§r §eloading...");
    }

    @Override
    public void onDisable() {
        if(getConfig().getBoolean("showDisabledMessage"))
            Bukkit.getConsoleSender().sendMessage("§cConfigL§c§nAPI§r §cdisabled.");
    }
}
