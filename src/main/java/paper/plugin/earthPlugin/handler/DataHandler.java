package paper.plugin.earthPlugin.handler;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class DataHandler {

    private static JavaPlugin plugin;
    private static File dataFile;
    private static YamlConfiguration dataConfig;

    public static void init(JavaPlugin pluginInstance) {
        plugin = pluginInstance;

        if (!plugin.getDataFolder().exists()) {
            plugin.getDataFolder().mkdirs();
        }

        dataFile = new File(plugin.getDataFolder(), "playerdata.yml");

        if (!dataFile.exists()) {
            try {
                dataFile.createNewFile();
            } catch (IOException e) {
                plugin.getLogger().severe("Could not create playerdata.yml: " + e.getMessage());
            }
        }

        dataConfig = YamlConfiguration.loadConfiguration(dataFile);
    }

    public static long readExperience(UUID playerUUID) {
        return dataConfig.getLong(playerUUID + ".experience", 0L);
    }

    public static void saveExperience(UUID playerUUID, float experience) {
        dataConfig.set(playerUUID + ".experience", experience);
        saveData();
    }

    public static long readLong(UUID playerUUID, String key, long defaultValue) {
        return dataConfig.getLong(playerUUID + "." + key, defaultValue);
    }

    public static void saveLong(UUID playerUUID, String key, long value) {
        dataConfig.set(playerUUID + "." + key, value);
        saveData();
    }

    public static String readString(UUID playerUUID, String key, String defaultValue) {
        return dataConfig.getString(playerUUID + "." + key, defaultValue);
    }

    public static void saveString(UUID playerUUID, String key, String value) {
        dataConfig.set(playerUUID + "." + key, value);
        saveData();
    }

    public static boolean hasData(UUID playerUUID) {
        return dataConfig.contains(playerUUID.toString());
    }

    public static void deletePlayerData(UUID playerUUID) {
        dataConfig.set(playerUUID.toString(), null);
        saveData();
    }

    public static void saveData() {
        try {
            dataConfig.save(dataFile);
        } catch (IOException e) {
            plugin.getLogger().severe("Could not save playerdata.yml: " + e.getMessage());
        }
    }

    public static void reloadData() {
        YamlConfiguration fresh = YamlConfiguration.loadConfiguration(dataFile);
        for (String key : fresh.getKeys(true)) {
            dataConfig.set(key, fresh.get(key));
        }
    }
}
