# ConfigAPI
A simple Plugin API for plugin developers that allows you to create additional configs.

# How to use
1. Add .jar as a library to your project
2. Create config file: ```ConfigAPI.FastConfig cfg = new ConfigAPI.FastConfig("name.yml", plugin.getDataFolder());```
3. Input: ```cfg.getConfig.set("Player." + player.getName() + ".Score", value);```

Config after changes:
```
Player:
    Steve:
        Score: 15
```
4. Output: ```int score = cfg.getConfig.getInt("player." + player.getName() + ".score");```

[My telegram channel](https://t.me/+jdEGFkoI-_dlYjZi)
