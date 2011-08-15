package com.cypher517.variabledeathban;
import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;

public class VariableDeathbanPlayerListener extends PlayerListener{ 
	public static VariableDeathban plugin; 
	Logger log = Logger.getLogger("Minecraft");

	public VariableDeathbanPlayerListener(VariableDeathban instance) {
		plugin = instance;
	}
	
	public void onPlayerJoin(PlayerJoinEvent event){
		Player player = event.getPlayer();
		player.sendMessage("What up " + event.getPlayer().getDisplayName());
	}
	
	@Override
	public void onPlayerInteract(PlayerInteractEvent event) {
		if (event.getMaterial() == Material.STICK) {
			Player player = event.getPlayer();
			player.sendMessage("STICK CLICK");

		}
	}

	public void onPlayerMove(PlayerMoveEvent event){
		
		Player player = event.getPlayer();
		Location playerLoc = player.getLocation();
		
		//player.sendMessage("Your X Coordinates : " + playerLoc.getX());
		//player.sendMessage("Your Y Coordinates : " + playerLoc.getY());
		//player.sendMessage("Your Z Coordinates : " + playerLoc.getZ());
	}


}