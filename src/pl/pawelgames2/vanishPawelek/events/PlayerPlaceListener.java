package pl.pawelgames2.vanishPawelek.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import pl.pawelgames2.vanishPawelek.config.ConfigData;
import pl.pawelgames2.vanishPawelek.data.VanishedPlayer;
import pl.pawelgames2.vanishPawelek.messages.MessagesData;

public class PlayerPlaceListener implements Listener{
	@EventHandler
	public void onPlayerPlaceListener(BlockPlaceEvent e){
		if(VanishedPlayer.getVanish().contains(e.getPlayer())){
			if(ConfigData.getVanishCanPlaceBlock()==false){
				e.setCancelled(true);
				e.getPlayer().sendMessage(MessagesData.getMessagePlaceBlockFromVanish());
			}
		}		
	}
}
