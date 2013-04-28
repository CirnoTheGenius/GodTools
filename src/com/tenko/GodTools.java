package com.tenko;

import java.util.Arrays;
import org.bukkit.plugin.java.JavaPlugin;

import com.tenko.cmdexe.CommanderCirno;

public class GodTools extends JavaPlugin {
	
	private final CommanderCirno cc = new CommanderCirno();
	
	@Override
	public void onEnable(){
		getCommand("godtool").setExecutor(this.cc);
		getCommand("godstick").setExecutor(this.cc);
		
		getCommand("godtool").setPermission("godtools.use");
		getCommand("godstick").setPermission("godtools.stick");
		
		getCommand("godtool").setAliases(Arrays.asList(new String[]{"gtool", "gt"}));
		getCommand("godstick").setAliases(Arrays.asList(new String[]{"gstick", "gs"}));
	}
	
	
}
