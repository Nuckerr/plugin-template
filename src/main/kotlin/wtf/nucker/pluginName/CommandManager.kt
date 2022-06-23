package wtf.nucker.pluginName

import cloud.commandframework.bukkit.CloudBukkitCapabilities
import cloud.commandframework.execution.AsynchronousCommandExecutionCoordinator
import cloud.commandframework.execution.postprocessor.CommandPostprocessingContext
import cloud.commandframework.extra.confirmation.CommandConfirmationManager
import cloud.commandframework.paper.PaperCommandManager
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.command.CommandSender
import java.util.concurrent.TimeUnit

class CommandManager(plugin: PluginName): PaperCommandManager<CommandSender>(
    plugin,
    AsynchronousCommandExecutionCoordinator.newBuilder<CommandSender>().build(),
    java.util.function.Function.identity(),
    java.util.function.Function.identity()
) {

    init {
        if(this.queryCapability(CloudBukkitCapabilities.BRIGADIER)) {
            this.registerBrigadier()
        }
        if(this.queryCapability(CloudBukkitCapabilities.ASYNCHRONOUS_COMPLETION)) {
            this.registerAsynchronousCompletions()
        }

        val confirmationManager: CommandConfirmationManager<CommandSender> = CommandConfirmationManager(
            30L,
            TimeUnit.SECONDS,
            {context: CommandPostprocessingContext<CommandSender> -> context.commandContext.sender.sendMessage(
                Component.text("Confirmation required. Confirm using /example confirm").color(NamedTextColor.RED))},
            {sender: CommandSender -> sender.sendMessage(Component.text("You don't have any pending confirmations").color(NamedTextColor.RED))}
        )
        confirmationManager.registerConfirmationProcessor(this)
    }
}