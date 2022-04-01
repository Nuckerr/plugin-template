package wtf.nucker.pluginname;

import de.leonhard.storage.Yaml;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginName extends JavaPlugin  {

    private Yaml config;

    @Override
    public void onEnable() {
        this.config = new Yaml("config.yml", this.getDataFolder().getAbsolutePath(), this.getResource("config.yml"));
    }

    public Yaml getConfigFile() {
        return config;
    }
}
