package pl.pawelgames2.vanishPawelek.events;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

import pl.pawelgames2.vanishPawelek.config.ConfigData;
import pl.pawelgames2.vanishPawelek.data.VanishedPlayer;
import pl.pawelgames2.vanishPawelek.messages.MessagesData;

public class PlayerDamageListener implements Listener{
	@EventHandler
	public void onPlayerDamageListener(EntityDamageEvent e){
		if(e.getEntity().getType() == EntityType.PLAYER){
			Player ofiara = (Player) e.getEntity();
			
			if(VanishedPlayer.getVanish().contains(ofiara)){
				if(ConfigData.getVanishCanGodMode()==false){
					e.setCancelled(true);
				}
			}
		}
	}
	
	@EventHandler
	public void onPlayerDamageByEntityListener(EntityDamageByEntityEvent e){
		if((e.getDamager().getType() == EntityType.PLAYER)&&(e.getEntityType() == EntityType.PLAYER)){
			Player atakujacy = (Player) e.getDamager();
			Player ofiara = (Player) e.getEntity();
			
			if(VanishedPlayer.getVanish().contains(atakujacy)){
				if(ConfigData.getVanishCanAttackPlayer()==false){
					atakujacy.sendMessage(MessagesData.getMessageAttackPlayerFromVanish().replace("{PLAYER}", ofiara.getName()));
					e.setCancelled(true);
				}
			}
		}
	}
}
