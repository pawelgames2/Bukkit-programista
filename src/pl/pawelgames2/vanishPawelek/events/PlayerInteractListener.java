package pl.pawelgames2.vanishPawelek.events;



import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import pl.pawelgames2.vanishPawelek.config.ConfigData;
import pl.pawelgames2.vanishPawelek.data.VanishedPlayer;
import pl.pawelgames2.vanishPawelek.messages.MessagesData;

public class PlayerInteractListener implements Listener{
	@EventHandler
	public void onPlayerInteractListener(PlayerInteractEvent e){
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK){
			if((e.getClickedBlock().getType() == Material.CHEST)||(e.getClickedBlock().getType() == Material.TRAPPED_CHEST)||
			(e.getClickedBlock().getType() == Material.FURNACE)||(e.getClickedBlock().getType() == Material.ANVIL)||
			(e.getClickedBlock().getType() == Material.BED_BLOCK)||(e.getClickedBlock().getType() == Material.JUKEBOX)||
			(e.getClickedBlock().getType() == Material.HOPPER)||(e.getClickedBlock().getType() == Material.DISPENSER)||
			(e.getClickedBlock().getType() == Material.DROPPER)){
				if(VanishedPlayer.getVanish().contains(e.getPlayer())){
					if(ConfigData.getVanishCanUseOpenBlock()==false){
						e.setCancelled(true);
						e.getPlayer().sendMessage(MessagesData.getMessageUseBlockFromVanish());
					}
				}
			}
			else if((e.getClickedBlock().getType() == Material.STONE_BUTTON)||(e.getClickedBlock().getType() == Material.WOOD_BUTTON)||
			(e.getClickedBlock().getType() == Material.LEVER)||(e.getClickedBlock().getType() == Material.REDSTONE_COMPARATOR)||
			(e.getClickedBlock().getType() == Material.REDSTONE_WIRE)){
				if(VanishedPlayer.getVanish().contains(e.getPlayer())){
					if(ConfigData.getVanishCanActiveRedstonePlayer()==false){
						e.setCancelled(true);
						e.getPlayer().sendMessage(MessagesData.getMessageActiveRedstoneFromVanish());
					}
				}
			}
		}else if(e.getAction() == Action.PHYSICAL){
			if((e.getClickedBlock().getType() == Material.STONE_PLATE)||(e.getClickedBlock().getType() == Material.WOOD_PLATE)||
			(e.getClickedBlock().getType() == Material.IRON_PLATE)||(e.getClickedBlock().getType() == Material.GOLD_PLATE)){
				if(VanishedPlayer.getVanish().contains(e.getPlayer())){
					if(ConfigData.getVanishCanActiveRedstonePlayer()==false){
						e.setCancelled(true);
					}
				}
			}
		}
	}
}
