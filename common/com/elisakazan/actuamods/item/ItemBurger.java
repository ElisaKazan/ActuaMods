package com.elisakazan.actuamods.item;

import com.elisakazan.actuamods.ActuaMods;
import com.elisakazan.actuamods.lib.Names;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemBurger extends Item {

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		if (!world.isRemote)
			player.sendMessage(new TextComponentString("You used a burger!!"));
		return super.onItemRightClick(world, player, hand);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item." + ActuaMods.RESOURCE_PREFIX + Names.BURGER_ITEM; //item.actua_mods:burger_item
	}
}
