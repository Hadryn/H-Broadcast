package com.h_dev.hbroadcast.comandos;

import com.h_dev.hbroadcast.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class ComandoBroadcast implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

            Player p = (Player) sender;
            String broadcastTag =(Main.config.getString("server_nametag").replace("&","§"));

            if(p.hasPermission("h_dev.hbroadcast.use")){

                String broadcastMsg = "";
                for (String a : args){
                    broadcastMsg += a+" ";
                }
                Bukkit.broadcastMessage(broadcastTag +" "+ broadcastMsg.replace("&","§"));

            }else{
                p.sendMessage("§cCOMANDO NEGADO PELO ADMINISTRADOR!");
            }
        return false;
    }
}
