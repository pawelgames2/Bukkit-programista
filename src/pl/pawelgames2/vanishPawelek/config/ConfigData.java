package pl.pawelgames2.vanishPawelek.config;

public class ConfigData {
	private static boolean vanishCanPickupItemPlayer;
	private static boolean vanishCanActiveRedstonePlayer;
	private static boolean vanishCanUseOpenBlock;
	private static boolean vanishCanDropPlayer;
	private static boolean vanishCanGodMode;
	private static boolean vanishCanAttackPlayer;
	private static boolean vanishCanPlaceBlock;
	private static boolean vanishCanMineBlock;

	public static boolean getVanishCanPickupItemPlayer(){
		return vanishCanPickupItemPlayer;
	}
	public static void setVanishCanPickupItemPlayer(boolean b){
		vanishCanPickupItemPlayer = b;
	}	
	public static boolean getVanishCanActiveRedstonePlayer(){
		return vanishCanActiveRedstonePlayer;
	}
	public static void setVanishCanActiveRedstonePlayer(boolean b){
		vanishCanActiveRedstonePlayer = b;
	}
	public static boolean getVanishCanUseOpenBlock(){
		return vanishCanUseOpenBlock;
	}
	public static void setVanishCanUseOpenBlock(boolean b){
		vanishCanUseOpenBlock = b;
	}
	public static boolean getVanishCanDropPlayer(){
		return vanishCanDropPlayer;
	}
	public static void setVanishCanDropPlayer(boolean b){
		vanishCanDropPlayer = b;
	}
	public static boolean getVanishCanGodMode(){
		return vanishCanGodMode;
	}
	public static void setVanishCanGodMode(boolean b){
		vanishCanGodMode = b;
	}
	public static boolean getVanishCanAttackPlayer(){
		return vanishCanAttackPlayer;
	}
	public static void setVanishCanAttackPlayer(boolean b){
		vanishCanAttackPlayer = b;
	}
	public static boolean getVanishCanPlaceBlock(){
		return vanishCanPlaceBlock;
	}
	public static void setVanishCanPlaceBlock(boolean b){
		vanishCanPlaceBlock = b;
	}
	public static boolean getVanishCanMineBlock(){
		return vanishCanMineBlock;
	}
	public static void setVanishCanMineBlock(boolean b){
		vanishCanMineBlock = b;
	}
}
