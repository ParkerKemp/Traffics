package com.spinalcraft.traffics;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.spinalcraft.spinalpack.Co;
import com.spinalcraft.spinalpack.Spinalpack;

public class Traffics extends JavaPlugin implements Listener{
	
	ConsoleCommandSender console;
	
	@Override
	public void onEnable(){
		console = Bukkit.getConsoleSender();
		console.sendMessage(Spinalpack.code(Co.BLUE) + "Slipdisk online!");
		getServer().getPluginManager().registerEvents((Listener)this,  this);
		
	}
	
	@Override
	public void onDisable(){
		
	}
}
