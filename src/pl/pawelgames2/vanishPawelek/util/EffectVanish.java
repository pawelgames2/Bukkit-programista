package pl.pawelgames2.vanishPawelek.util;

import org.bukkit.Bukkit; 
import org.bukkit.entity.Player;

import pl.pawelgames2.vanishPawelek.data.VanishedPlayer;

public class EffectVanish{
	public static void transPlayer(Player p){
		if(!(VanishedPlayer.getVanish().contains(p))){
			for(Player pOnline: Bukkit.getOnlinePlayers()){
				if(!(pOnline.hasPermission("vanishpawelek.bypass"))){
					pOnline.hidePlayer(p);
				}
			}
			VanishedPlayer.addVanish(p);
		}else{
			for(Player pOnline: Bukkit.getOnlinePlayers()){
				pOnline.showPlayer(p);
			}
			VanishedPlayer.removeVanish(p);
		}
	}
	
	public static void joinTransPlayer(Player p){
		for(Player pOnline: Bukkit.getOnlinePlayers()){
			if(VanishedPlayer.getVanish().contains(pOnline)){
				p.hidePlayer(pOnline);
			}
		}
	}
}
