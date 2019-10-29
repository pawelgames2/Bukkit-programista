package pl.pawelgames2.vanishPawelek.data;

import java.util.ArrayList;

import org.bukkit.entity.Player;

public class VanishedPlayer{
	private static ArrayList<Player> vanish = new ArrayList<>();
	
	public static ArrayList<Player> getVanish(){
		return vanish;
	}
	
	public static void addVanish(Player p){
		vanish.add(p);
	}
	
	public static void removeVanish(Player p){
		vanish.remove(p);
	}
	
	public static void clearVanish(){
		vanish.clear();
	}
}
