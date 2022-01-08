package me.GamingCuber.AFKCommand.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import me.GamingCuber.AFKCommand.Main;
import me.GamingCuber.AFKCommand.command.AFKStart;

public class AFKListener implements Listener
{
	private Main plugin;
	
		public AFKListener(Main plugin) {
			this.plugin = plugin;
			Bukkit.getPluginManager().registerEvents(this, plugin);
		}

		public AFKListener(AFKStart afkStart) {
			// TODO Auto-generated constructor stub
		}
		@EventHandler
		public void onPlayerDamage(EntityDamageEvent e) {
			Player PlayerDamage = (Player) e.getEntity();
			
			if (this.plugin.end == true) {
			if (PlayerDamage.equals(plugin.sender)) {
				e.setCancelled(true);
			} else {
				e.setCancelled(false);
			}
			
		}	
	}
}
