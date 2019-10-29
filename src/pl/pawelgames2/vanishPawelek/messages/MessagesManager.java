package pl.pawelgames2.vanishPawelek.messages;

import pl.pawelgames2.vanishPawelek.VanishPawelek;
import pl.pawelgames2.vanishPawelek.util.FileBukkit;

public class MessagesManager {
	public static void load() {
		FileBukkit fileBukkit = new FileBukkit("plugins/" + VanishPawelek.getInstance().getName() + "/message.yml");
    
		if (!fileBukkit.getFileBoolean()) {
			fileBukkit.setOptions("messageNoPermissions", MessagesDefault.getDefaultMessageNoPermissions());
			fileBukkit.setOptions("messageUseConsole", MessagesDefault.getDefaultMessageUseConsole());
			fileBukkit.setOptions("messageOfflinePlayer", MessagesDefault.getDefaultMessageOfflinePlayer());
			fileBukkit.setOptions("messageVanishON", MessagesDefault.getDefaultMessageVanishON());
			fileBukkit.setOptions("messageVanishOFF", MessagesDefault.getDefaultMessageVanishOFF());
			fileBukkit.setOptions("messageVanishOtherON", MessagesDefault.getDefaultMessageVanishOtherON());
			fileBukkit.setOptions("messageVanishOtherOFF", MessagesDefault.getDefaultMessageVanishOtherOFF());
			fileBukkit.setOptions("messageAdminVanishToPlayerON", MessagesDefault.getDefaultMessageVanishToPlayerON());
			fileBukkit.setOptions("messageAdminVanishToPlayerOFF", MessagesDefault.getDefaultMessageVanishToPlayerOFF());
			fileBukkit.setOptions("messageAttackPlayerFromVanish", MessagesDefault.getDefaultMessageAttackPlayerFromVanish());
			fileBukkit.setOptions("messageBreakBlockFromVanish", MessagesDefault.getDefaultMessageBreakBlockFromVanish());
			fileBukkit.setOptions("messagePlaceBlockFromVanish", MessagesDefault.getDefaultMessagePlaceBlockFromVanish());
			fileBukkit.setOptions("messageDropItemFromVanish", MessagesDefault.getDefaultMessageDropItemFromVanish());
			fileBukkit.setOptions("messageUseBlockFromVanish", MessagesDefault.getDefaultMessageUseOpenBlockFromVanish());
			fileBukkit.setOptions("messageActiveRedstoneFromVanish", MessagesDefault.getDefaultMessageActiveRedstoneFromVanish());
		} else {
			if (fileBukkit.getOptionsString("messageNoPermissions") == null) {
				fileBukkit.setOptions("messageNoPermissions", MessagesDefault.getDefaultMessageNoPermissions());
			}
			if (fileBukkit.getOptionsString("messageUseConsole") == null) {
				fileBukkit.setOptions("messageUseConsole", MessagesDefault.getDefaultMessageUseConsole());
			}
			if (fileBukkit.getOptionsString("messageOfflinePlayer") == null) {
				fileBukkit.setOptions("messageOfflinePlayer", MessagesDefault.getDefaultMessageOfflinePlayer());
			}
			if (fileBukkit.getOptionsString("messageVanishON") == null) {
				fileBukkit.setOptions("messageVanishON", MessagesDefault.getDefaultMessageVanishON());
			}
			if (fileBukkit.getOptionsString("messageVanishOFF") == null) {
				fileBukkit.setOptions("messageVanishOFF", MessagesDefault.getDefaultMessageVanishOFF());
			}
			if (fileBukkit.getOptionsString("messageVanishOtherON") == null) {
				fileBukkit.setOptions("messageVanishOtherON", MessagesDefault.getDefaultMessageVanishOtherON());
			}
			if (fileBukkit.getOptionsString("messageVanishOtherOFF") == null) {
				fileBukkit.setOptions("messageVanishOtherOFF", MessagesDefault.getDefaultMessageVanishOtherOFF());
			}
			if (fileBukkit.getOptionsString("messageAdminVanishToPlayerON") == null) {
				fileBukkit.setOptions("messageAdminVanishToPlayerON", MessagesDefault.getDefaultMessageVanishToPlayerON());
			}
			if (fileBukkit.getOptionsString("messageAdminVanishToPlayerOFF") == null) {
				fileBukkit.setOptions("messageAdminVanishToPlayerOFF", MessagesDefault.getDefaultMessageVanishToPlayerOFF());
			}
			if (fileBukkit.getOptionsString("messageAttackPlayerFromVanish") == null) {
				fileBukkit.setOptions("messageAttackPlayerFromVanish", MessagesDefault.getDefaultMessageAttackPlayerFromVanish());
			}
			if (fileBukkit.getOptionsString("messageBreakBlockFromVanish") == null) {
				fileBukkit.setOptions("messageBreakBlockFromVanish", MessagesDefault.getDefaultMessageBreakBlockFromVanish());
			}
			if (fileBukkit.getOptionsString("messagePlaceBlockFromVanish") == null) {
				fileBukkit.setOptions("messagePlaceBlockFromVanish", MessagesDefault.getDefaultMessagePlaceBlockFromVanish());
			}
			if (fileBukkit.getOptionsString("messageDropItemFromVanish") == null) {
				fileBukkit.setOptions("messageDropItemFromVanish", MessagesDefault.getDefaultMessageDropItemFromVanish());
			}
			if (fileBukkit.getOptionsString("messageUseBlockFromVanish") == null) {
				fileBukkit.setOptions("messageUseBlockFromVanish",  MessagesDefault.getDefaultMessageUseOpenBlockFromVanish());
			}
			if (fileBukkit.getOptionsString("messageActiveRedstoneFromVanish") == null) {
				fileBukkit.setOptions("messageActiveRedstoneFromVanish", MessagesDefault.getDefaultMessageActiveRedstoneFromVanish());
			}
		} 
    
		getOptionsAll(fileBukkit);
  	}
  
  	private static void getOptionsAll(FileBukkit fileBukkit) {
	  	MessagesData.setMessageNoPermissions(fileBukkit.getOptionsString("messageNoPermissions").replace("&", "§"));
	  	MessagesData.setMessageUseConsole(fileBukkit.getOptionsString("messageUseConsole").replace("&", "§"));
	  	MessagesData.setMessageOfflinePlayer(fileBukkit.getOptionsString("messageOfflinePlayer").replace("&", "§"));
    	MessagesData.setMessageVanishON(fileBukkit.getOptionsString("messageVanishON").replace("&", "§"));
    	MessagesData.setMessageVanishOFF(fileBukkit.getOptionsString("messageVanishOFF").replace("&", "§"));
    	MessagesData.setMessageVanishOtherON(fileBukkit.getOptionsString("messageVanishOtherON").replace("&", "§"));
    	MessagesData.setMessageVanishOtherOFF(fileBukkit.getOptionsString("messageVanishOtherOFF").replace("&", "§"));
    	MessagesData.setMessageAdminVanishToPlayerON(fileBukkit.getOptionsString("messageAdminVanishToPlayerON").replace("&", "§"));
    	MessagesData.setMessageAdminVanishToPlayerOFF(fileBukkit.getOptionsString("messageAdminVanishToPlayerOFF").replace("&", "§"));
    	MessagesData.setMessageAttackPlayerFromVanish(fileBukkit.getOptionsString("messageAttackPlayerFromVanish").replace("&", "§"));
    	MessagesData.setMessageBreakBlockFromVanish(fileBukkit.getOptionsString("messageBreakBlockFromVanish").replace("&", "§"));
    	MessagesData.setMessagePlaceFromVanish(fileBukkit.getOptionsString("messagePlaceBlockFromVanish").replace("&", "§"));
    	MessagesData.setMessageDropItemFromVanish(fileBukkit.getOptionsString("messageDropItemFromVanish").replace("&", "§"));
    	MessagesData.setMessageUseBlockFromVanish(fileBukkit.getOptionsString("messageUseBlockFromVanish").replace("&", "§"));
    	MessagesData.setMessageActiveRedstoneFromVanish(fileBukkit.getOptionsString("messageActiveRedstoneFromVanish").replace("&", "§"));
  	}
}
