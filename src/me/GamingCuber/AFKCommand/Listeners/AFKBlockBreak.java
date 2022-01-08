package me.GamingCuber.AFKCommand.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import me.GamingCuber.AFKCommand.Main;

public class AFKBlockBreak implements Listener {
	private Main plugin;
	
		public AFKBlockBreak(Main plugin) {
			this.plugin = plugin;
			Bukkit.getPluginManager().registerEvents(this, plugin);
		}
		
		@EventHandler
		public void onBreak(BlockBreakEvent e) {
			if (this.plugin.end == true) {
				Player player = (Player) e.getPlayer();
				player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "You're not allowed to break blocks until you are back in the game");
				if (player.equals(plugin.sender)) {
					e.setCancelled(true);
				}
				else {
					e.setCancelled(false);
				}
			}
			
		}
}
