# CodecraftLabs tool set

Set of utility classes for generic use.

## Project requirements

In order to build this project what you need is:

- Java 11 SDK (OpenJDK or Oracle)
- Gradle 7.1 or later

## Build instructions

In order to build this project you run the following command:

```
$ gradle clean build
```

This will rebuild the project and creates the final JAR file

## Publish instructions

Since this library is used by other projects, the following command publishes it to your local repository:

```
$ gradle publishToMavenLocal
```