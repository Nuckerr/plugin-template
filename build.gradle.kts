import net.minecrell.pluginyml.bukkit.BukkitPluginDescription

plugins {
    java
    id("io.papermc.paperweight.userdev") version "1.3.5"
    id("xyz.jpenilla.run-paper") version "1.0.6"
    id("net.minecrell.plugin-yml.bukkit") version "0.5.1"
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "wtf.nucker"
version = "1.0"
description = "Plugin description"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
}

dependencies {
    paperDevBundle("1.18.2-R0.1-SNAPSHOT")
    implementation("com.github.simplix-softworks:simplixstorage:3.2.4")
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