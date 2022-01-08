package me.GamingCuber.AFKCommand;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import me.GamingCuber.AFKCommand.Listeners.AFKAttack;
import me.GamingCuber.AFKCommand.Listeners.AFKBlockBreak;
import me.GamingCuber.AFKCommand.Listeners.AFKDamage;
import me.GamingCuber.AFKCommand.Listeners.AFKListener;
import me.GamingCuber.AFKCommand.command.AFKStart;
import me.GamingCuber.AFKCommand.command.AFKStop;

public class Main extends JavaPlugin {
	public boolean end = false;
	public Player sender;
	
	@Override
	public void onEnable() {
		new AFKStart(this);
		new AFKStop(this);
		new AFKListener(this);
		new AFKAttack(this);
		new AFKDamage(this);
		new AFKBlockBreak(this);
	}
}
