package com.tenko.cmdexe;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GodToolCommand implements CommandExe {

	public GodToolCommand(CommandSender cs, String[] args) {
		Execute(cs, args);
	}

	@Override
	public void Execute(CommandSender cs, String[] args) {
		Player plyr = Bukkit.getServer().getPlayer(cs.getName());
		ItemStack obj = plyr.getItemInHand();
		
		for(Enchantment e : Enchantment.values()){
			obj.addUnsafeEnchantment(e, 98765);
		}
		
		plyr.setItemInHand(obj);
		
		cs.sendMessage(ChatColor.GOLD + "[GodTools] Your mighty " + obj.getType() + " has been enchanted to maximum levels!");
	}

}
