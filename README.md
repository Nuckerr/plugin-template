# Plugin Template
This repository has a few basic base spigot plugin templates which you can use for your plugins. They all use
gradle and utilise the run-paper plugin and the bukkit plugin-yml plugin for gradle.

It also has Simplix Storage pre-implemented for easy advanceed config files.

## Branches
- paper - Regular paper project (>=1.17)
- paper-legacy - For paper projects with legacy version (<=1.16.4)
- spigot - Regular spigot project (All versions)

## Setup
1. Clone the desired branch for your project
2. Refactor the name and group id
3. Change out the plugin information in the build.gradle.kts file
4. Finally, build to check if everything has worked, commit and push

## Weird directories
You might notice that the .idea and run folder are in here. They do not contain anything other than
some configurations in the idea folder for running the dev server/building and the eula.txt & ops.json in the
run folder.

# GitHub Workflows
There is a nice little workflow that will run on commit/pr to check if your plugin still builds. This is also
useful if you implement testing

## Java versions
Please make sure to change the java version if you are using 1.17+ (Check your IDE, the build file and the
GitHub workflow)

# `paper` branch information
**The following is specific information to this branch:**

This project utilises the paperweight-userdev plugin for gradle to build the version of your version's jar. This
build will include the bukkit, spigot and paper APIs as well as NMS. Please note that first build times might
be longer than expected however everything is cached.

## Gradle commands
```
------------------------------------------------------------
Tasks runnable from root project 'PluginName' - Plugin description
------------------------------------------------------------

Build tasks
-----------
assemble - Assembles the outputs of this project.
build - Assembles and tests this project.
buildDependents - Assembles and tests this project and all projects that depend on it.
buildNeeded - Assembles and tests this project and all projects it depends on.
classes - Assembles main classes.
clean - Deletes the build directory.
jar - Assembles a jar archive containing the main classes.
testClasses - Assembles test classes.

Build Setup tasks
-----------------
init - Initializes a new Gradle build.
wrapper - Generates Gradle wrapper files.

Documentation tasks
-------------------
javadoc - Generates Javadoc API documentation for the main source code.

Help tasks
----------
buildEnvironment - Displays all buildscript dependencies declared in root project 'PluginName'.
dependencies - Displays all dependencies declared in root project 'PluginName'.
dependencyInsight - Displays the insight into a specific dependency in root project 'PluginName'.
help - Displays a help message.
javaToolchains - Displays the detected java toolchains.
kotlinDslAccessorsReport - Prints the Kotlin code for accessing the currently available project extensions and conventions.
outgoingVariants - Displays the outgoing variants of root project 'PluginName'.
projects - Displays the sub-projects of root project 'PluginName'.
properties - Displays the properties of root project 'PluginName'.
tasks - Displays the tasks runnable from root project 'PluginName'.

Paperweight tasks
-----------------
cleanCache - Delete the project setup cache and task outputs.
reobfJar - Remap the compiled plugin jar to Spigot's obfuscated runtime names.

Run Paper tasks
---------------
cleanPaperclipCache - Delete all locally cached Paperclips.
runMojangMappedServer - Run a Mojang mapped Paper server for plugin testing, by integrating with paperweight.
runServer - Run a Paper server for plugin testing.

Shadow tasks
------------
knows - Do you know who knows?
shadowJar - Create a combined JAR of project and runtime dependencies

Verification tasks
------------------
check - Runs all checks.
test - Runs the unit tests.
```

### Building
`./gradlew build`

### Dev Server
`./gradlew runServer`
