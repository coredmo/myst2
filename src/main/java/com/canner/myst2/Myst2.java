package com.canner.myst2;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;

import com.canner.myst2.init.BlockEntityInit;
import com.canner.myst2.init.blockinit;
import com.canner.myst2.init.iteminit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("myst2")
public class Myst2 {
	
	public static final String MOD_ID = "myst2";
	
	public static final CreativeModeTab MYST_TAB = new CreativeModeTab(MOD_ID) {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(iteminit.DOGABO.get());
		}
	};
	
	public static final CreativeModeTab MYST_BLOCKS = new CreativeModeTab(MOD_ID + "_blocks") {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(blockinit.HIM_BLOCK.get());
		}
	};
	
	public Myst2() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		iteminit.ITEMS.register(bus);
		blockinit.BLOCKS.register(bus);
//		BlockEntityInit.BLOCK_ENTITIES.register(bus);
		
	     MinecraftForge.EVENT_BUS.register(this); 
	}
}
