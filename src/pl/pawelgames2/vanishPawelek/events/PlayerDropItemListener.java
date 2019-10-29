package pl.pawelgames2.vanishPawelek.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

import pl.pawelgames2.vanishPawelek.config.ConfigData;
import pl.pawelgames2.vanishPawelek.data.VanishedPlayer;
import pl.pawelgames2.vanishPawelek.messages.MessagesData;

public class PlayerDropItemListener implements Listener{
	@EventHandler
	public void onPlayerDropItemListener(PlayerDropItemEvent e){
		if(VanishedPlayer.getVanish().contains(e.getPlayer())){
			if(ConfigData.getVanishCanDropPlayer()==false){
				e.setCancelled(true);
				e.getPlayer().sendMessage(MessagesData.getMessageDropItemFromVanish());
			}
		}
	}
}
