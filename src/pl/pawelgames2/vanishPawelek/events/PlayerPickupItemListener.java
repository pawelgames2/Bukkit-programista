package pl.pawelgames2.vanishPawelek.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;

import pl.pawelgames2.vanishPawelek.config.ConfigData;
import pl.pawelgames2.vanishPawelek.data.VanishedPlayer;

public class PlayerPickupItemListener implements Listener{
	@EventHandler
	public void onPlayerPickupListener(PlayerPickupItemEvent e){
		if(VanishedPlayer.getVanish().contains(e.getPlayer())){
			if(ConfigData.getVanishCanPickupItemPlayer()==false){
				e.setCancelled(true);
			}
		}
	}
}
