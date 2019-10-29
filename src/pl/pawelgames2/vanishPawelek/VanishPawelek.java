package pl.pawelgames2.vanishPawelek;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import pl.pawelgames2.vanishPawelek.commands.Commands;
import pl.pawelgames2.vanishPawelek.config.ConfigManager;
import pl.pawelgames2.vanishPawelek.data.VanishedPlayer;
import pl.pawelgames2.vanishPawelek.events.EventManager;
import pl.pawelgames2.vanishPawelek.messages.MessagesManager;
import pl.pawelgames2.vanishPawelek.util.FileBukkit;


public class VanishPawelek extends JavaPlugin{
	private static VanishPawelek instance;
	private static Commands commands;

	public void onEnable(){
		instance = this;
		Commands.register();
		EventManager.register();

		MessagesManager.load();
		ConfigManager.load();

		FileBukkit fileBukkit = new FileBukkit("plugins/"+instance.getName()+"/data/");

		if(fileBukkit.getFileAll() != null){
			for(File f: fileBukkit.getFileAll()){
				FileBukkit fileCut = new FileBukkit(f.getPath());
				String nick = fileCut.getOptionsString("nick");
				if(!(nick.equalsIgnoreCase(""))){
					if(Bukkit.getPlayer(nick) != null){
						Player p = Bukkit.getPlayer(nick);
						VanishedPlayer.addVanish(p);
					}
				}
			}
		}
	}

	public void onDisable(){
		FileBukkit fileBukkit = new FileBukkit("plugins/"+instance.getName()+"/data/");

		if(fileBukkit.getFileAll() != null){
			for(File f: fileBukkit.getFileAll()){
				f.delete();
			}
		}

		for(Player p: VanishedPlayer.getVanish()){
			fileBukkit.setPatch("plugins/"+instance.getName()+"/data/"+p.getName()+".yml");
			fileBukkit.setOptions("nick", p.getName());
		}
	}

	public static VanishPawelek getInstance(){
		return instance;
	}

	public static Commands getCommands(){
		return commands;
	}
}
