# ConfigAPI
A simple Plugin API for plugin developers that allows you to create additional configs.

# How to use
1. Add .jar as a library to your project
2. Create config file: ```CAPI.Config cfg = new CAPI.Config("name.yml", plugin.getDataFolder());```
3. Write: ```cfg.getConfig.set("Player." + player.getName() + ".Score", value);```
4. Save: ```cfg.save;```

Config after changes:
```
Player:
    just_lofe:
        Score: 15
```
5. Read: ```int score = cfg.getConfig.getInt("player." + player.getName() + ".score");```

*Also you can copy CAPI.java to your project and use it there.*

[My telegram channel](https://t.me/+jdEGFkoI-_dlYjZi)
