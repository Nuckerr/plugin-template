package wtf.nucker.pluginName

import de.leonhard.storage.Yaml
import de.leonhard.storage.internal.settings.ConfigSettings
import org.bukkit.plugin.java.JavaPlugin

class PluginName: JavaPlugin() {

    private lateinit var config: Yaml
    private lateinit var commandManager: CommandManager

    override fun onEnable() {
        this.config = Yaml("config.yml", this.dataFolder.absolutePath, this.getResource("config.yml"),
            null, ConfigSettings.PRESERVE_COMMENTS, null).addDefaultsFromInputStream()
        this.commandManager = CommandManager(this)
    }
}