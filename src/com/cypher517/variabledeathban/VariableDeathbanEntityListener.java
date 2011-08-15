package com.cypher517.variabledeathban;

import org.bukkit.ChatColor;
//import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityListener;

public class VariableDeathbanEntityListener extends EntityListener {
	
	public static VariableDeathban plugin; 
	
	public VariableDeathbanEntityListener(VariableDeathban instance) {
		plugin = instance;
	}	
	public void onEntityDeath(EntityDeathEvent event) {
		if(event.getEntity() instanceof Player){
			Player player = (Player) event.getEntity();
			plugin.getServer().broadcastMessage("Entity death " + ChatColor.RED + player.getName() + " " + player.getLastDamageCause().getCause());
		}

	}
}
