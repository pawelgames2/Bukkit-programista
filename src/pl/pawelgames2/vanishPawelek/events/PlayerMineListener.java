package pl.pawelgames2.vanishPawelek.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import pl.pawelgames2.vanishPawelek.config.ConfigData;
import pl.pawelgames2.vanishPawelek.data.VanishedPlayer;
import pl.pawelgames2.vanishPawelek.messages.MessagesData;

public class PlayerMineListener implements Listener{
	@EventHandler
	public void onPlayerMineListener(BlockBreakEvent e){
		if(VanishedPlayer.getVanish().contains(e.getPlayer())){
			if(ConfigData.getVanishCanMineBlock()==false){
				e.setCancelled(true);
				e.getPlayer().sendMessage(MessagesData.getMessageBreakBlockFromVanish());
			}
		}
	}
}
