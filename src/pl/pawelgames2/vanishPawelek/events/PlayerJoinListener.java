package pl.pawelgames2.vanishPawelek.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import pl.pawelgames2.vanishPawelek.util.EffectVanish;

public class PlayerJoinListener implements Listener{
	@EventHandler
	public void onPlayerJoinListener(PlayerJoinEvent e){
		EffectVanish.joinTransPlayer(e.getPlayer());
	}
}
