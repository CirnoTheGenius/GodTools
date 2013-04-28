package com.tenko.cmdexe;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GodStickCommand implements CommandExe {

	public GodStickCommand(CommandSender cs, String[] args) {
		Execute(cs, args);
	}

	@Override
	public void Execute(CommandSender cs, String[] args){
		Player plyr = Bukkit.getServer().getPlayer(cs.getName());
		ItemStack stick = new ItemStack(Material.STICK);
		
		for(Enchantment e : Enchantment.values()){
			stick.addUnsafeEnchantment(e, 98765);
		}
		
		if(plyr.getItemInHand().getType() == Material.AIR){
			plyr.setItemInHand(stick);
		} else {
			plyr.getInventory().addItem(plyr.getItemInHand());
			plyr.setItemInHand(stick);
		}
		
		cs.sendMessage(ChatColor.GOLD + "[GodTools] A mighty wooden stick has been bestowed upon you!");
	}

}
