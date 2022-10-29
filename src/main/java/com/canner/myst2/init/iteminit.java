package com.canner.myst2.init;

import com.canner.myst2.Myst2;
import com.canner.myst2.item.LinkingBook;
import com.canner.myst2.item.Myst2Item;
//import com.canner.myst2.item.Myst2Item;
import com.google.common.base.Supplier;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class iteminit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Myst2.MOD_ID);
	
	//Main Item VVV
	public static final RegistryObject<Item> DOGABO = register("dogabo", 
			() -> new Item(new Item.Properties().tab(Myst2.MYST_TAB).stacksTo(64)
					.food(new FoodProperties.Builder().nutrition(5).saturationMod(4.5f).alwaysEat()
					.effect(() -> new MobEffectInstance(MobEffects.JUMP, 180, 5), 1.0f)
					.build())));
	
	public static final RegistryObject<Item> BOZGAB = register("bozgab", 
			() -> new Item(new Item.Properties().tab(Myst2.MYST_TAB).stacksTo(64)
					.food(new FoodProperties.Builder().nutrition(5).saturationMod(4.5f).alwaysEat()
					.effect(() -> new MobEffectInstance(MobEffects.BAD_OMEN, 180, 10), 1.0f)
					.build())));
	
	//Myst Items VVV Descriptive & Linking Books
	public static final RegistryObject<Item> DBOOK = register("dbook", 
			() -> new Myst2Item(new Item.Properties().tab(Myst2.MYST_TAB).stacksTo(1)));
	
	public static final RegistryObject<Item> LBOOKU = register("lbooku", 
			() -> new LinkingBook(new Item.Properties().tab(Myst2.MYST_TAB).stacksTo(1)));
	
	public static final RegistryObject<Item> LBOOKA = register("lbooka", 
			() -> new Myst2Item(new Item.Properties().tab(Myst2.MYST_TAB).stacksTo(1)));
	
	//public static final RegistryObject<Item> FUTURE = register("future", 
			//() -> new Item(new Item.Properties().tab(Myst2.THE_TAB).stacksTo(1)));
	
	//Armor VVV
	public static final RegistryObject<ArmorItem> CANNER_MASK = ITEMS.register("canner_mask", 
			() -> new ArmorItem(ArmorMaterialInit.BOZGAB, EquipmentSlot.HEAD, 
					new Item.Properties().tab(Myst2.MYST_TAB)));
	
	public static final RegistryObject<ArmorItem> COAT = ITEMS.register("coat", 
			() -> new ArmorItem(ArmorMaterialInit.BOZGAB, EquipmentSlot.CHEST, 
					new Item.Properties().tab(Myst2.MYST_TAB)));
	
	public static final RegistryObject<ArmorItem> PANTS = ITEMS.register("pants", 
			() -> new ArmorItem(ArmorMaterialInit.BOZGAB, EquipmentSlot.LEGS, 
					new Item.Properties().tab(Myst2.MYST_TAB)));
	
	public static final RegistryObject<ArmorItem> BOOTS = ITEMS.register("boots", 
			() -> new ArmorItem(ArmorMaterialInit.BOZGAB, EquipmentSlot.FEET, 
					new Item.Properties().tab(Myst2.MYST_TAB)));
	
	//Tools VVV PICKAXE | SHOVEL | AXE
	public static final RegistryObject<PickaxeItem> PICKAXE = ITEMS.register("pickaxe", 
			() -> new PickaxeItem(ToolMaterialInit.BOZGAB, 20, 5f, 
					new Item.Properties().tab(Myst2.MYST_TAB)));
	
	public static final RegistryObject<AxeItem> AXE = ITEMS.register("axe", 
			() -> new AxeItem(ToolMaterialInit.BOZGAB, 20, 5f, 
					new Item.Properties().tab(Myst2.MYST_TAB)));
	
	public static final RegistryObject<ShovelItem> SPADE = ITEMS.register("spade", 
			() -> new ShovelItem(ToolMaterialInit.BOZGAB, 20, 5f, 
					new Item.Properties().tab(Myst2.MYST_TAB)));
	
	public static final RegistryObject<SwordItem> SWORD = ITEMS.register("sword", 
			() -> new SwordItem(ToolMaterialInit.BOZGAB, 20, 5f, 
					new Item.Properties().tab(Myst2.MYST_TAB)));
	
	public static final RegistryObject<HoeItem> HOE = ITEMS.register("hoe", 
			() -> new HoeItem(ToolMaterialInit.BOZGAB, 20, 5f, 
					new Item.Properties().tab(Myst2.MYST_TAB)));
	

	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}
}
