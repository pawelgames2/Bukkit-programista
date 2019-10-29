package pl.pawelgames2.vanishPawelek.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import pl.pawelgames2.vanishPawelek.data.VanishedPlayer;

public class PlayerLeaveListener implements Listener{
	@EventHandler
	public void onPlayerLeaveListener(PlayerQuitEvent e){
		VanishedPlayer.removeVanish(e.getPlayer());
	}
}
