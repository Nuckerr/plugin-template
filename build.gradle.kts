import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.0"
    id("io.papermc.paperweight.userdev") version "1.3.5"
    id("xyz.jpenilla.run-paper") version "1.0.6"
    id("net.minecrell.plugin-yml.bukkit") version "0.5.1"
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "wtf.nucker"
version = "1.0"
description = "Plugin Description"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
    maven(url = "https://repo.codemc.org/repository/maven-public/")
    maven(url = "https://repo.incendo.org/content/repositories/snapshots/")
}

dependencies {
    paperDevBundle("1.19-R0.1-SNAPSHOT")
    implementation("com.github.simplix-softworks:simplixstorage:3.2.4")
    implementation("cloud.commandframework:cloud-core:1.6.2")
    implementation("cloud.commandframework:cloud-paper:1.6.2")
    implementation("cloud.commandframework:cloud-brigadier:1.6.2")
    implementation("cloud.commandframework:cloud-kotlin-extensions:1.6.2")
    implementation("org.incendo.interfaces:interfaces-kotlin:1.0.0-SNAPSHOT")
    implementation("org.incendo.interfaces:interfaces-paper:1.0.0-SNAPSHOT")
}


tasks {
    build {
        dependsOn(shadowJar)
    }

    assemble {
        dependsOn(reobfJar)
    }
    compileKotlin {
        kotlinOptions.jvmTarget = "17"
    }
    javadoc {
        options.encoding = Charsets.UTF_8.name()
    }
    processResources {
        filteringCharset = Charsets.UTF_8.name()
    }
}
bukkit {
    load = net.minecrell.pluginyml.bukkit.BukkitPluginDescription.PluginLoadOrder.STARTUP
    main = "wtf.nucker.pluginname.PluginName"
    apiVersion = "1.19"

    name = getName()
    description = getDescription()
    version = getVersion().toString()
    authors = listOf("Nucker")
    website = "nucker.me"
    prefix = getName()
}
