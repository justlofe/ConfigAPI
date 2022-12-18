package pb.lofe.configl;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ConfigL extends JavaPlugin {


    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§aConfigL§a§nAPI§r §aloaded.");
    }

    @Override
    public void onLoad() {
        Bukkit.getConsoleSender().sendMessage("§eConfigL§e§nAPI§r §eloading...");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§cConfigL§c§nAPI§r §cdisabled.");
    }
}
