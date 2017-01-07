package com.elisakazan.actuamods.init;

import com.elisakazan.actuamods.ActuaMods;
import com.elisakazan.actuamods.item.ItemBurger;
import com.elisakazan.actuamods.lib.Names;

import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

	public static ItemBurger burgerItem;
	
	public static void init() {
		burgerItem = new ItemBurger();
		burgerItem.setRegistryName(new ResourceLocation(ActuaMods.MOD_ID, Names.BURGER_ITEM));
		GameRegistry.register(burgerItem);
	}
	
	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {
		ModelResourceLocation model = new ModelResourceLocation(ActuaMods.RESOURCE_PREFIX + Names.BURGER_ITEM, "inventory");
		ModelLoader.registerItemVariants(burgerItem, model);
		mesher.register(burgerItem, 0, model);
	}
}
