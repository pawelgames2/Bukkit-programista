package pl.pawelgames2.vanishPawelek.commands;

import pl.pawelgames2.vanishPawelek.VanishPawelek;

public class Commands {
	
	public static void register(){
		VanishPawelek.getInstance().getCommand("vanish").setExecutor(new VanishCommand());
	}
}
