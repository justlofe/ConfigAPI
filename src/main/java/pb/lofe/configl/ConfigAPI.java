package pb.lofe.configl;

/*
    TG: @just_lofe
*/

import java.io.File;
import java.io.IOException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class ConfigAPI {
    // Creates a simple config, before save instance of config, call 'saveDefaultConfig();' for creating plugin folder.
    public static class FastConfig {
        private File file;

        private FileConfiguration config;

        public FastConfig(String name, File dataFolder, JavaPlugin plugin) {
            this.file = new File(dataFolder, name);
            try {
                if (!this.file.exists() && !this.file.createNewFile())
                    throw new IOException();
            } catch (IOException e) {
                throw new RuntimeException("Failed to create " + name, e);
            }
            this.config = (FileConfiguration)YamlConfiguration.loadConfiguration(this.file);
        }

        public FileConfiguration getConfig() {
            return this.config;
        }

        public void save() {
            try {
                this.config.save(this.file);
            } catch (IOException e) {
                throw new RuntimeException("Failed to save " + this.file.getName(), e);
            }
        }
    }
}
