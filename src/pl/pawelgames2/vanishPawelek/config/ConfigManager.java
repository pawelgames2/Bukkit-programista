package pl.pawelgames2.vanishPawelek.config;

import pl.pawelgames2.vanishPawelek.VanishPawelek;
import pl.pawelgames2.vanishPawelek.util.FileBukkit;

public class ConfigManager {
	public static void load(){
		FileBukkit fileBukkit = new FileBukkit("plugins/"+VanishPawelek.getInstance().getName()+"/config.yml");
		
		if(fileBukkit.getFileBoolean() == false){
			fileBukkit.setOptions("vanishCanPlaceBlock", false);
			fileBukkit.setOptions("vanishCanMineBlock", false);
			fileBukkit.setOptions("vanishCanAttackPlayer", false);
			fileBukkit.setOptions("vanishCanGodMode", false);
			fileBukkit.setOptions("vanishCanDropPlayer", false);
			fileBukkit.setOptions("vanishCanPickupItemPlayer", false);
			fileBukkit.setOptions("vanishCanUseOpenBlock", false);
			fileBukkit.setOptions("vanishCanActiveRedstonePlayer", false);
		}
		
		ConfigData.setVanishCanPlaceBlock(fileBukkit.getOptionsBoolean("vanishCanPlaceBlock"));
		ConfigData.setVanishCanMineBlock(fileBukkit.getOptionsBoolean("vanishCanMineBlock"));
		ConfigData.setVanishCanAttackPlayer(fileBukkit.getOptionsBoolean("vanishCanAttackPlayer"));
		ConfigData.setVanishCanGodMode(fileBukkit.getOptionsBoolean("vanishCanGodMode"));
		ConfigData.setVanishCanDropPlayer(fileBukkit.getOptionsBoolean("vanishCanDropPlayer"));
		ConfigData.setVanishCanPickupItemPlayer(fileBukkit.getOptionsBoolean("vanishCanPickupItemPlayer"));
		ConfigData.setVanishCanUseOpenBlock(fileBukkit.getOptionsBoolean("vanishCanUseOpenBlock"));
		ConfigData.setVanishCanActiveRedstonePlayer(fileBukkit.getOptionsBoolean("vanishCanActiveRedstonePlayer"));
	}
}
