import net.minecrell.pluginyml.bukkit.BukkitPluginDescription

plugins {
    java
    id("io.papermc.paperweight.userdev") version "1.5.5"
    id("xyz.jpenilla.run-paper") version "2.1.0"
    id("net.minecrell.plugin-yml.bukkit") version "0.6.0"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "wtf.nucker"
version = "1.0"
description = "Plugin description"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
}

dependencies {
    paperweight.paperDevBundle("1.20.1-R0.1-SNAPSHOT")
}

tasks {
    build {
        dependsOn(shadowJar)
    }

    assemble {
        dependsOn(reobfJar)
    }
    compileJava {
        options.encoding = Charsets.UTF_8.name()
        options.release.set(17)
    }
    javadoc {
        options.encoding = Charsets.UTF_8.name()
    }
    processResources {
        filteringCharset = Charsets.UTF_8.name()
    }
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

bukkit {
    load = BukkitPluginDescription.PluginLoadOrder.STARTUP
    main = "wtf.nucker.pluginname.PluginName"
    apiVersion = "1.18"

    name = getName()
    description = getDescription()
    version = getVersion().toString()
    authors = listOf("Nucker")
    website = "nucker.me"
    prefix = getName()
}
