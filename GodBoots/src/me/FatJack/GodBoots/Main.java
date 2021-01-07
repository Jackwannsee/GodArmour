package me.FatJack.GodBoots;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin implements Listener{ //https://hub.spigotmc.org/javadocs/spigot/index.html 

	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this); //this will listen to all events
		
	}
	public void onDisable() {
		
	}
	
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		//command for this will be /godboots
    	if(label.equalsIgnoreCase("godboots")){ //this is the activation command
    		if(!(sender instanceof Player)){ //makes sure the sender is a player
    			sender.sendMessage("You are not allowed to do this from the console");
    			
    			return true;
    		}
    		
    		Player player = (Player) sender;
    		if(player.getInventory().firstEmpty()==-1) {
    			//inventory is full
    			Location loc = player.getLocation();
    			World world = player.getWorld();
    			
    			world.dropItemNaturally(loc, getItem()); //this will drop the item there 
        		player.sendMessage(ChatColor.GOLD + "Notch Has chosen you to take these" + ChatColor.BOLD + " God Boots");
        		return true;
    		}
    		
    		player.getInventory().addItem(getItem());
    		player.sendMessage(ChatColor.GOLD + "Notch Has chosen you to take these" + ChatColor.BOLD + " God Boots");
    		return true;
    	}
    	
    	//this next command will be for the god helmet 
    	if(label.equalsIgnoreCase("godhelmet")){ //this is the activation command
    		if(!(sender instanceof Player)){ //makes sure the sender is a player
    			sender.sendMessage("You are not allowed to do this from the console");
    			
    			return true;
    		}
    		
    		Player player = (Player) sender;
    		if(player.getInventory().firstEmpty()==-1) {
    			//inventory is full
    			Location loc = player.getLocation();
    			World world = player.getWorld();
    			
    			world.dropItemNaturally(loc, getHelmet()); //this will drop the item there 
        		player.sendMessage(ChatColor.GOLD + "Notch Has chosen you to take this" + ChatColor.BOLD + " Pig Crown");
        		return true;
    		}
    		
    		player.getInventory().addItem(getHelmet());
    		player.sendMessage(ChatColor.GOLD + "Notch Has chosen you to take this" + ChatColor.BOLD + " Pig Crown");
    		return true;
    	}
    	
    	//this next command will be for the god Chestplate 
    	if(label.equalsIgnoreCase("GodChestplate")){ //this is the activation command
    		if(!(sender instanceof Player)){ //makes sure the sender is a player
    			sender.sendMessage("You are not allowed to do this from the console");
    			
    			return true;
    		}
    		
    		Player player = (Player) sender;
    		if(player.getInventory().firstEmpty()==-1) {
    			//inventory is full
    			Location loc = player.getLocation();
    			World world = player.getWorld();
    			
    			world.dropItemNaturally(loc, getChestplate()); //this will drop the item there 
        		player.sendMessage(ChatColor.GOLD + "Notch Has chosen you to take this" + ChatColor.BOLD + " godly shirt");
        		return true;
    		}
    		
    		player.getInventory().addItem(getChestplate());
    		player.sendMessage(ChatColor.GOLD + "Notch Has chosen you to take this" + ChatColor.BOLD + " godly shirt");
    		return true;
    	}
    	
    	//this next command will be for the god Chestplate 
    	if(label.equalsIgnoreCase("godleggings")){ //this is the activation command
    		if(!(sender instanceof Player)){ //makes sure the sender is a player
    			sender.sendMessage("You are not allowed to do this from the console");
    			
    			return true;
    		}
    		
    		Player player = (Player) sender;
    		if(player.getInventory().firstEmpty()==-1) {
    			//inventory is full
    			Location loc = player.getLocation();
    			World world = player.getWorld();
    			
    			world.dropItemNaturally(loc, getLeggings()); //this will drop the item there 
        		player.sendMessage(ChatColor.GOLD + "Notch Has chosen you to take this" + ChatColor.BOLD + " godly pair of pants");
        		return true;
    		}
    		
    		player.getInventory().addItem(getLeggings());
    		player.sendMessage(ChatColor.GOLD + "Notch Has chosen you to take this" + ChatColor.BOLD + " godly pair of pants");
    		return true;
    	}
    	return false;
    }
    
    
    
    
    
    public ItemStack getItem() {
    	
    	ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
    	ItemMeta meta = boots.getItemMeta(); //item meta is basically what you can do with the boots the name the enchantments etc...
    	
    	meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Boots of Leaping");
    	
    	List<String> lore = new ArrayList<String>(); //list of strings
    	lore.add(""); //adds a space to the lore
    	lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "Boots made for only the best");
    	meta.setLore(lore); //takes the list of strings as the lore 
    	
    	meta.addEnchant(Enchantment.PROTECTION_FALL, 99999, true); //for now it doesn't matter as there is a listener that will make it fall infinity
    	meta.addEnchant(Enchantment.DEPTH_STRIDER, 50, true);
    	
    	//these two lines make the boots look better in game
    	meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    	meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
    	meta.setUnbreakable(true);
    	
    	boots.setItemMeta(meta);
    	
    	return boots;
    }
    
    public ItemStack getHelmet() {
    	
    	ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
    	ItemMeta meta = helmet.getItemMeta(); //item meta is basically what you can do with the boots the name the enchantments etc...
    	
    	meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + ChatColor.ITALIC+ "PIG" + ChatColor.GOLD + "" + ChatColor.BOLD + " Crown ♛");
    	
    	List<String> lore = new ArrayList<String>(); //list of strings
    	lore.add(""); //adds a space to the lore
    	lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "A helmet made for only the greatest of PIG gods");
    	meta.setLore(lore); //takes the list of strings as the lore 
    	
    	meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 50, true); 
    	meta.addEnchant(Enchantment.PROTECTION_FALL, 50, true);
    	meta.addEnchant(Enchantment.PROTECTION_FIRE, 50, true);
    	meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 50, true);
    	meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 50, true);
    	meta.addEnchant(Enchantment.THORNS, 50, true);
    	
    	//these two lines make the boots look better in game
    	meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    	meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
    	meta.setUnbreakable(true);
    	
    	helmet.setItemMeta(meta);
    	
    	return helmet;
    }
    
   public ItemStack getChestplate() {
    	
    	ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
    	ItemMeta meta = chestplate.getItemMeta(); //item meta is basically what you can do with the boots the name the enchantments etc...
    	
    	meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + ChatColor.ITALIC+ "PIG" + ChatColor.GOLD + "" + ChatColor.BOLD + " bodyarmour ♜");
    	
    	List<String> lore = new ArrayList<String>(); //list of strings
    	lore.add(""); //adds a space to the lore
    	lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "A chestplate made for only the greatest of PIG gods");
    	meta.setLore(lore); //takes the list of strings as the lore 
    	
    	meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 50, true); 
    	meta.addEnchant(Enchantment.PROTECTION_FALL, 50, true);
    	meta.addEnchant(Enchantment.PROTECTION_FIRE, 50, true);
    	meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 50, true);
    	meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 50, true);
    	meta.addEnchant(Enchantment.THORNS, 50, true);
    	
    	//these two lines make the boots look better in game
    	meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    	meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
    	meta.setUnbreakable(true);
    	
    	chestplate.setItemMeta(meta);
    	
    	return chestplate;
    }
   
   public ItemStack getLeggings() {
   	
   	ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
   	ItemMeta meta = leggings.getItemMeta(); //item meta is basically what you can do with the boots the name the enchantments etc...
   	
   	meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + ChatColor.ITALIC+ "PIG" + ChatColor.GOLD + "" + ChatColor.BOLD + " pants ♞");
   	
   	List<String> lore = new ArrayList<String>(); //list of strings
   	lore.add(""); //adds a space to the lore
   	lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "A pair of pants made for only the greatest of PIG gods");
   	meta.setLore(lore); //takes the list of strings as the lore 
   	
   	meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 50, true); 
   	meta.addEnchant(Enchantment.PROTECTION_FALL, 50, true);
   	meta.addEnchant(Enchantment.PROTECTION_FIRE, 50, true);
   	meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 50, true);
   	meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 50, true);
   	meta.addEnchant(Enchantment.THORNS, 50, true);
   	
   	//these two lines make the boots look better in game
   	meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
   	meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
   	meta.setUnbreakable(true);
   	
   	leggings.setItemMeta(meta);
   	
   	return leggings;
   }
    
    
    @EventHandler
    public void onJump(PlayerMoveEvent event) {
    	//the spigot api has no jump event which is a pain in the 
    	
    	Player player = (Player) event.getPlayer();
    	if(player.getInventory().getBoots() !=  null) //if they are not wearing boots this will stop
    		if(player.getInventory().getBoots().getItemMeta().getDisplayName().contains("Boots of Leaping")) //contains instead of equals because there are the chatcolor tags
    			if(player.getInventory().getBoots().getItemMeta().hasLore()) //otherwise you can rename it to Boots of leaping with an anvil 
    				if(event.getFrom().getY()< event.getTo().getY() && player.getLocation().subtract(0,1,0).getBlock().getType() != Material.AIR
    				&& player.getLocation().subtract(0,1,0).getBlock().getType()!= Material.WATER && player.getLocation().subtract(0,0,0).getBlock().getType()!= Material.WATER
    				&& player.getLocation().subtract(0,1,0).getBlock().getType()!= Material.SEAGRASS && player.getLocation().subtract(0,1,0).getBlock().getType()!= Material.KELP
    				&& player.getLocation().subtract(0,1,0).getBlock().getType()!= Material.KELP_PLANT) { //these are to make sure they can sneaky sneaky the jump effect 
    					
    					//now you can make the player fly 
    					player.setVelocity(player.getLocation().getDirection().multiply(2).setY(2));
    				}
    }
    
}
