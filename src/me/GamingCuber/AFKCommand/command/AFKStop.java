package me.GamingCuber.AFKCommand.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.GamingCuber.AFKCommand.Main;

public class AFKStop implements CommandExecutor {
	private Main plugin;
	
		public AFKStop(Main plugin) {
			this.plugin = plugin;
			plugin.getCommand("afkstop").setExecutor(this);
		}
		@Override
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			this.plugin.end = false;
			Player p = (Player) sender;
			plugin.sender = null;
			p.sendMessage(ChatColor.GREEN + "You are now in the game.");
			return false;
		}
}
