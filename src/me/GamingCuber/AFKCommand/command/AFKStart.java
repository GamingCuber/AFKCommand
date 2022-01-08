package me.GamingCuber.AFKCommand.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.GamingCuber.AFKCommand.Main;

public class AFKStart implements CommandExecutor {
	private Main plugin;
	
		public AFKStart(Main plugin) {
			this.plugin = plugin;
			plugin.getCommand("afkstart").setExecutor(this);
		}
		@Override
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			this.plugin.end = true;
			Player p = (Player) sender;
			p.sendMessage(ChatColor.GREEN + "You are now AFK");
			p = plugin.sender;
			
			return false;
		}
		
}
