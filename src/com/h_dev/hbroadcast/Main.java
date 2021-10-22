package com.h_dev.hbroadcast;

import com.h_dev.hbroadcast.comandos.ComandoBroadcast;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Timer;
import java.util.TimerTask;

public class Main extends JavaPlugin {

    public static FileConfiguration config;

        public void onEnable() {
            saveDefaultConfig();
            config = getConfig();
            Bukkit.getConsoleSender().sendMessage("§aO PLUGIN FOI INICIADO COM SUCESSO");
            Bukkit.getConsoleSender().sendMessage("§aPlugin criado por Hadryn");
            Bukkit.getConsoleSender().sendMessage("§aSolicite seu plugin no discord Hadryn#8324");
            getCommand("broadcast").setExecutor(new ComandoBroadcast());

            Timer timer = new Timer();

            int timer_firstmessage = 1000 * config.getInt("timer-firstmessage");
            int timer_secondmessage = 1000 * config.getInt("timer-secondmessage");
            int timer_thirdmessage = 1000 * config.getInt("timer-thirdmessage");
            int timer_fourthmessage = 1000 * config.getInt("timer-fourthmessage");

            TimerTask firstmessage = new TimerTask() {

                @Override
                public void run() {
                    Bukkit.broadcastMessage(config.getString("server_nametag").replace("&", "§") + config.getString("firstmessage").replace("&", "§"));
                }
            };
            TimerTask secondmessage = new TimerTask() {

                @Override
                public void run() {
                    Bukkit.broadcastMessage(config.getString("server_nametag").replace("&", "§") + config.getString("secondmessage").replace("&", "§"));
                }
            };
            TimerTask thirdmessage = new TimerTask() {

                @Override
                public void run() {
                    Bukkit.broadcastMessage(config.getString("server_nametag").replace("&", "§") + config.getString("thirdmessage").replace("&", "§"));
                }
            };
            TimerTask fourthmessage = new TimerTask() {

                @Override
                public void run() {
                    Bukkit.broadcastMessage(config.getString("server_nametag").replace("&", "§") + config.getString("fourthmessage").replace("&", "§"));
                }
            };
            if(config.getString("enable-firstmessage").equals("true")){
                timer.scheduleAtFixedRate(firstmessage, 0, timer_firstmessage );
            }
            if(config.getString("enable-secondmessage").equals("true")){
                timer.scheduleAtFixedRate(secondmessage, 0, timer_secondmessage );
            }
            if(config.getString("enable-thirdmessage").equals("true")){
                timer.scheduleAtFixedRate(thirdmessage, 0, timer_thirdmessage );
            }
            if(config.getString("enable-fourthmessage").equals("true")){
                timer.scheduleAtFixedRate(fourthmessage, 0, timer_fourthmessage );
            }
        }

    @Override
    public void onDisable() {

    }
}

