package me.GamingCuber.AFKCommand.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import me.GamingCuber.AFKCommand.Main;

public class AFKAttack implements Listener {
	private Main plugin;
	
		public AFKAttack(Main plugin) {
			this.plugin = plugin;
			Bukkit.getPluginManager().registerEvents(this, plugin);
		}
		
		
		@EventHandler
		public void onAttack(PlayerMoveEvent e) {
			if (this.plugin.end == true) {
				Player p = (Player) e.getPlayer();
				if (p.equals(plugin.sender)) {
					e.setCancelled(true);
				}
				p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "You must stay here until you are not afk");
				
			} else {
				e.setCancelled(false);
			}
		}
	}

		
