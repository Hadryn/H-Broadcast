package com.h_dev.hbroadcast;

import com.h_dev.hbroadcast.comandos.ComandoBroadcast;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static FileConfiguration config;

        public void onEnable() {
            saveDefaultConfig();
            config = getConfig();
            Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE+"Plugin Criado por H_Dev");
            Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN+"Peça seu plugin através do discord:");
            Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN+"Hadryn#8324");
            getCommand("broadcast").setExecutor(new ComandoBroadcast());
        }

    @Override
    public void onDisable() {

    }
}

