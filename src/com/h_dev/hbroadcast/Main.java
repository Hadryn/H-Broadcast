package com.h_dev.hbroadcast;

import com.h_dev.hbroadcast.comandos.ComandoBroadcast;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static FileConfiguration config;

        public void onEnable() {
            saveDefaultConfig();
            config = getConfig();
            Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE+"O PLUGIN FOI INICIADO COM SUCESSO");
            Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN+"Plugin criado por Hadryn");
            Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN+"Solicite seu plugin no discord Hadryn#8324");
            getCommand("broadcast").setExecutor(new ComandoBroadcast());

        }

    @Override
    public void onDisable() {

    }
}

