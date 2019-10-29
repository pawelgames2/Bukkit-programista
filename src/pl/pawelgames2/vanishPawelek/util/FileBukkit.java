package pl.pawelgames2.vanishPawelek.util;

import java.io.File; 
import java.io.IOException;
import java.util.ArrayList;

import org.bukkit.configuration.file.YamlConfiguration;

public class FileBukkit{	
	
	private File file;
	private YamlConfiguration yaml;
	
	public FileBukkit(String path){
		file = new File(path);
		yaml = YamlConfiguration.loadConfiguration(file);
	}
	public void setPatch(String path){
		file = new File(path);
		yaml = YamlConfiguration.loadConfiguration(file);
	}
	public boolean getFileBoolean(){
		if(file != null){
			if(file.isFile()){
				return true;
			}
		}
		
		return false;
	}
	public File[] getFileAll(){
		if(file != null){
			if(file.listFiles() != null){
				if(file.listFiles().length > 0){
					return file.listFiles();
				}
			}
		}
		
		return null;
	}
	public void setOptions(String options, String value){
		yaml.set(options, value);
        
        try{
        	yaml.save(file);
        }catch(IOException ex){}
	}
	public void setOptions(String options, boolean value){
		yaml.set(options, value);
        
        try{
        	yaml.save(file);
        }catch(IOException ex){}
	}
	public void setOptions(String options, int value){
		yaml.set(options, value);
        
        try{
        	yaml.save(file);
        }catch(IOException ex){}
	}
	public String getOptionsString(String options){
		if(file != null){
			if(file.isFile()){
				if(yaml.getString(options) != null){
					return yaml.getString(options);
				}
			}
		}
		return null;
	}
	public Boolean getOptionsBoolean(String options){
		if(file != null){
			if(file.isFile()){
				return yaml.getBoolean(options);
			}
		}
		return false;
	}
	public int getOptionsInteger(String options){
		if(file != null){
			if(file.isFile()){
				return yaml.getInt(options);
			}
		}
		return 0;		
	}
}
