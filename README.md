# `spigot` branch information
**The following is specific information to this branch:**

This project utilises the [nms repo](https://repo.codemc.io/#browse/browse:nms) to obtain builds of spigot that
include NMS as well as the API. This build will include the bukkit, spigot and paper APIs as well as NMS.
Please note that first build times might  be longer than expected however everything is cached.

## Gradle commands
```
------------------------------------------------------------
Tasks runnable from root project 'PluginName'
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

Run Paper tasks
---------------
cleanPaperclipCache - Delete all locally cached Paperclips.
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