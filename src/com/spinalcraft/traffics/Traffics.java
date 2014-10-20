package com.spinalcraft.traffics;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import com.spinalcraft.spinalpack.Co;
import com.spinalcraft.spinalpack.Spinalpack;

public class Traffics extends JavaPlugin implements Listener{
	
	ConsoleCommandSender console;
	
	@Override
	public void onEnable(){
		console = Bukkit.getConsoleSender();
		console.sendMessage(Spinalpack.code(Co.BLUE) + "Traffics online!");
		getServer().getPluginManager().registerEvents((Listener)this,  this);
		
	}
	
	@Override
	public void onDisable(){
		
	}
	
	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerJoin(PlayerJoinEvent event){
		Player player = event.getPlayer();
		String date = new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance());
		Spinalpack.updateTrafficRecord(date, Spinalpack.checkUniqueTraffic(player.getName()));
	}
}
