package pl.pawelgames2.vanishPawelek.events;

import org.bukkit.Bukkit;

import pl.pawelgames2.vanishPawelek.VanishPawelek;

public class EventManager {
	public static void register(){
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerJoinListener(), VanishPawelek.getInstance());
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerLeaveListener(), VanishPawelek.getInstance());
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerDamageListener(), VanishPawelek.getInstance());
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerPickupItemListener(), VanishPawelek.getInstance());
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerMineListener(), VanishPawelek.getInstance());
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerPlaceListener(), VanishPawelek.getInstance());
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerDropItemListener(), VanishPawelek.getInstance());
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerInteractListener(), VanishPawelek.getInstance());
	}
}
