package com.tenko.cmdexe;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommanderCirno implements CommandExecutor {
	
	public boolean checkPermission(CommandSender cs, String perm) {
		if(cs.isOp()){
			return true;
		}
		return cs.hasPermission(perm);
	}

	@Override
	public boolean onCommand(CommandSender cs, Command c, String l, String[] args) {
		if(c.getName().equalsIgnoreCase("godtool") && checkPermission(cs, "godtools.use")){
			new GodToolCommand(cs, args);
		}
		
		if(c.getName().equalsIgnoreCase("godstick") && checkPermission(cs, "godtools.stick")){
			new GodStickCommand(cs, args);
		}
		
		return false;
	}
}
