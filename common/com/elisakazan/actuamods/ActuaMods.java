package com.elisakazan.actuamods;

import java.util.Random;

import com.elisakazan.actuamods.init.ModItems;
import com.elisakazan.actuamods.lib.Names;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAppleGold;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ActuaMods.MOD_ID, name = ActuaMods.MOD_NAME, version = ActuaMods.VERSION, dependencies = ActuaMods.DEPENDENCIES)
public class ActuaMods {

	// Constants
	public static final String MOD_ID = "actua_mods";
	public static final String MOD_NAME = "Burger Tree";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "required-after:forge@[13.19.1.2189,)";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":"; //actua_mods:
	
	// Variables
	public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static ActuaMods instance;
	
	@SidedProxy(clientSide = "com.elisakazan.actuamods.ClientProxy", serverSide = "com.elisakazan.actuamods.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		
		System.out.println("BURGER MOD >> "+ "item." + ActuaMods.RESOURCE_PREFIX + Names.BURGER_ITEM);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
	
}
