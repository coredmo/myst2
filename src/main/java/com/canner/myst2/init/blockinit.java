package com.canner.myst2.init;

import java.util.function.Function;

import com.canner.myst2.Myst2;
import com.canner.myst2.block.GooLightBlock;
import com.canner.myst2.block.Myst2Block;
import com.canner.myst2.block.RotBlock;
import com.google.common.base.Supplier;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class blockinit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Myst2.MOD_ID);
	
	public static final DeferredRegister<Item> ITEMS = iteminit.ITEMS;
	
	//Blocks VVV
	public static final RegistryObject<Block> BOZGAB = register("bozgab_ore", 
			() -> new Myst2Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).dynamicShape().sound(SoundType.STONE)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Myst2.MYST_BLOCKS)));
	
	public static final RegistryObject<Block> ROT_BLOCK = register("rot_block", 
			() -> new RotBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD).dynamicShape().sound(SoundType.WOOD)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Myst2.MYST_BLOCKS)));
	
	public static final RegistryObject<Block> HIM_BLOCK = register("him_block", 
			() -> new Myst2Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(9.0f, 12.0f).requiresCorrectToolForDrops().sound(SoundType.METAL) 
			.emissiveRendering((state, getter, pos) -> {
				return pos.getX() == 50; }).lightLevel(state -> 15).noCollission().jumpFactor(-1)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Myst2.MYST_BLOCKS)));
	
	//public static final RegistryObject<Crusha> CRUSHA = register("crusher", 
	//		() -> new Crusha(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD).dynamicShape().sound(SoundType.WOOD)),
	//		object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Myst2.MYST_BLOCKS)));
	
	//TREE	VVV
	public static final RegistryObject<Block> ROOT = register("root", 
			() -> new GooLightBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).strength(0.9f).sound(SoundType.WART_BLOCK)), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Myst2.MYST_BLOCKS)));
	
	public static final RegistryObject<Block> BREAD = register("bread", 
			() -> new GooLightBlock(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.COLOR_GREEN).strength(0.4f).requiresCorrectToolForDrops().sound(SoundType.BIG_DRIPLEAF)), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Myst2.MYST_BLOCKS)));
	
	//BIOME VVV
	public static final RegistryObject<Block> GGRASS = register("ggrass", 
			() -> new Myst2Block(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.COLOR_GREEN).strength(0.1f).sound(SoundType.GRASS)), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Myst2.MYST_BLOCKS)));
	
	public static final RegistryObject<Block> GDIRT = register("gdirt", 
			() -> new Myst2Block(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_BROWN).strength(0.1f).sound(SoundType.ROOTED_DIRT)), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Myst2.MYST_BLOCKS)));
	
	public static final RegistryObject<Block> GSTONE = register("gstone", 
			() -> new Myst2Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN).strength(0.4f).requiresCorrectToolForDrops().sound(SoundType.STONE)), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Myst2.MYST_BLOCKS)));
	
	//CRYSTAL VVV
	public static final RegistryObject<Block> DOGTHYST = register("dogthyst", 
			() -> new Myst2Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_RED).strength(0.3f).sound(SoundType.AMETHYST)), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Myst2.MYST_BLOCKS)));
	//come on.. add some more why don't you
	
	private static <T extends Block> RegistryObject<T> registerBlock(final String name, 
			final Supplier<? extends T> block) { return BLOCKS.register(name, block);
	}
	
	private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block,
			Function<RegistryObject<T>, Supplier<? extends Item>> item) {
		RegistryObject<T> obj = registerBlock(name, block);
		ITEMS.register(name, item.apply(obj));
		return obj;
	}
}
