import net.minecrell.pluginyml.bukkit.BukkitPluginDescription

plugins {
    java
    id("xyz.jpenilla.run-paper") version "1.0.6"
    id("net.minecrell.plugin-yml.bukkit") version "0.5.1"
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "wtf.nucker"
version = "1.0"
description = "Plugin description"

repositories {
    mavenCentral()
    maven(url = "https://repo.codemc.io/repository/nms/")
    maven(url = "https://jitpack.io")
}

dependencies {
    compileOnly("org.spigotmc:spigot:1.8.8-R0.1-SNAPSHOT")
    implementation("com.github.simplix-softworks:simplixstorage:3.2.4")
}

tasks {
    build {
        dependsOn(shadowJar)
    }

    runServer {
        minecraftVersion("1.8.8")
    }
}


bukkit {
    load = BukkitPluginDescription.PluginLoadOrder.STARTUP
    main = "wtf.nucker.pluginname.PluginName"
    apiVersion = "1.8"

    name = getName()
    description = getDescription()
    version = getVersion().toString()
    authors = listOf("Nucker")
    website = "nucker.me"
    prefix = getName()
}