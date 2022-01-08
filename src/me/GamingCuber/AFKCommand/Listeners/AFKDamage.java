package me.GamingCuber.AFKCommand.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import me.GamingCuber.AFKCommand.Main;

public class AFKDamage implements Listener {
	private Main plugin;
	
		public AFKDamage(Main plugin) {
			this.plugin = plugin;
			Bukkit.getPluginManager().registerEvents(this, plugin);
		}
		@EventHandler
		public void onAttack(EntityDamageByEntityEvent e) {
			if (this.plugin.end == true) {
			Player Attacker = (Player) e.getDamager();
			
			if (Attacker.equals(plugin.sender)) {
				e.setCancelled(true);
			} 
		} else {
			e.setCancelled(false);
		}
	}
}
		
