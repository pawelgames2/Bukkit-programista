package pl.pawelgames2.vanishPawelek.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.pawelgames2.vanishPawelek.data.VanishedPlayer;
import pl.pawelgames2.vanishPawelek.messages.MessagesData;
import pl.pawelgames2.vanishPawelek.util.EffectVanish;

public class VanishCommand implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player){
			if(sender.hasPermission("vanishpawelek.commands")){
				if((args.length>=1)&&(sender.hasPermission("vanishpawelek.admin"))){
					if(Bukkit.getPlayer(args[0]) != null){
						Player cel = Bukkit.getPlayer(args[0]);
						EffectVanish.transPlayer(cel);
						
						if(VanishedPlayer.getVanish().contains(cel)){
							sender.sendMessage(MessagesData.getMessageAdminVanishToPlayerON().replace("{PLAYER}", sender.getName()));
							cel.sendMessage(MessagesData.getMessageVanishOtherON().replace("{PLAYER}", sender.getName()));
						}else{
							sender.sendMessage(MessagesData.getMessageAdminVanishToPlayerOFF().replace("{PLAYER}", sender.getName()));
							cel.sendMessage(MessagesData.getMessageVanishOtherOFF().replace("{PLAYER}", sender.getName()));
						}					
					}else{
						sender.sendMessage(MessagesData.getMessageOfflinePlayer());
					}
				}else{
					Player p = (Player) sender;
					EffectVanish.transPlayer(p);
					
					if(VanishedPlayer.getVanish().contains(p)){
						sender.sendMessage(MessagesData.getMessageVanishON());
					}else{
						sender.sendMessage(MessagesData.getMessageVanishOFF());
					}
				}
			}else{
				sender.sendMessage(MessagesData.getMessageNoPermissions());
			}
		}else{
			sender.sendMessage(MessagesData.getMessageUseConsole());
		}
		return false;
	}

}
