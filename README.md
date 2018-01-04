# What this does
It modifies forge to convert the old method of recipe-registering from 1.11 into the new JSON-format in an easy and (hopefully) painless way.

# What this doesn't do
- It doesn't update your mod to 1.11, that would be very hard to do. It just automatically generates the recipe JSON files
- It doesn't "support" configurable recipes. It *does* generate the JSON files (as long as they're enabled when converting [see 'How to use this']), but they won't be made configurable. To update this behavior you'll have to use the `IConditionFactory`. [This](http://www.minecraftforge.net/forum/topic/60413-112how-to-make-recipes-configurable/#elComment_281664) helpful forum post by [Choonster](https://github.com/Choonster) is a good start.

# Why would I want this
To make your life easier while updating your mod to 1.12. Especially if you have a lot of recipes.

# How it works
It's actually very simple. Only 2 files have been modified:
[GameRegistry](https://github.com/HoldYourWaffle/MinecraftForge-1.12-RecipeConvertingAssistance/blob/recipe-assistance/src/main/java/net/minecraftforge/fml/common/registry/GameRegistry.java) now extends [GameRegistryExtension](https://github.com/HoldYourWaffle/MinecraftForge-1.12-RecipeConvertingAssistance/blob/recipe-assistance/src/main/java/info/zthings/mcmods/recipeconverter/GameRegistryExtension.java) (who'd have guessed?)
This extension class provides the old recipe-registering methods so your old 1.11-compatible recipe-registering code compiles perfectly. The implementation of this methods if different though, it generates the JSON for the recipe specified with the parameters and places them *in a folder*.

# How to use this
I haven't quite figured this out yet (as I'm only on v0.0.0 and there isn't any *actual* implementation yet). It'll probably involve using a gradle plugin in addition to [ForgeGradle](https://github.com/MinecraftForge/ForgeGradle) with a task running your mod with this modified version of gradle.
