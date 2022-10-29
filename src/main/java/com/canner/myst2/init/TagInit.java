//package com.canner.myst2.init;
//
//import com.canner.myst2.Myst2;
//
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.tags.BlockTags;
//import net.minecraft.tags.ItemTags;
//import net.minecraft.tags.Tag;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.level.block.Block;
//import net.minecraftforge.common.Tags;
//
//public final class TagInit {
//	public static final class Blocks {
//		
//		public static final Tag.Blocks<Block> ACTION_BLOCK = mod("action_block");
//		
//		private static Tags.Named<Block> createTag(String name) {
//			return BlockTags.createOptional(new ResourceLocation(Myst2.MOD_ID, name).toString());
//		}
//	}
//
//public static final class Items {
//	
//		private static  Tag.Named<Item> mod(String path) {
//			return ItemTags.bind(new ResourceLocation(Myst2.MOD_ID, path).toString());
//		}
//	}
//}