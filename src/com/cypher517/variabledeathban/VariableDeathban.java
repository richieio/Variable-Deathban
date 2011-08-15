package com.cypher517.variabledeathban;

import java.util.logging.Logger;

import org.bukkit.event.Event;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginDescriptionFile;

import java.util.logging.Level;


public class VariableDeathban extends JavaPlugin {
	private final VariableDeathbanPlayerListener playerListener = new VariableDeathbanPlayerListener(this);
	private final VariableDeathbanEntityListener entityListener = new VariableDeathbanEntityListener(this);

	Logger log = Logger.getLogger("Minecraft");
	
	public void log(String text)
	{
		log.log(Level.INFO, text);
	}	

	public void logWarning(String text)
	{
		log.log(Level.WARNING, text);
	}

	
	public void onEnable(){ 
		log.info("Cypher's Variable Deathban Enabled");
		PluginManager pm = this.getServer().getPluginManager();
		
		pm.registerEvent(Event.Type.PLAYER_INTERACT, playerListener, Event.Priority.Normal, this);
		pm.registerEvent(Event.Type.PLAYER_MOVE, playerListener, Event.Priority.Normal, this);
		pm.registerEvent(Event.Type.PLAYER_JOIN, playerListener, Event.Priority.Normal, this);
		pm.registerEvent(Event.Type.ENTITY_DEATH, entityListener, Event.Priority.Normal, this);
		//pm.registerEvent(Event.Type.BLOCK_PLACE, blockListener, Event.Priority.Normal, this);
        //pm.registerEvent(Event.Type.ENTITY_DAMAGE, entityListener, Event.Priority.Normal, this);	
	}
	 
	public void onDisable(){ 
		log.info("Cypher's Variable Deathban Disabled");
	}

}
