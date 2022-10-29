package com.canner.myst2.init;


import com.canner.myst2.Myst2;
import com.canner.myst2.world.BaseArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public final class ArmorMaterialInit {

	public static final ArmorMaterial BOZGAB = new BaseArmorMaterial(100, new int[] { 950, 1400, 1800, 1000 },
			new int[] { 20, 35, 50, 32 }, 3.2f, 1.85f, Myst2.MOD_ID + ":bozgab", SoundEvents.BOAT_PADDLE_WATER, () -> Ingredient.of(iteminit.DOGABO.get()));
	
	private ArmorMaterialInit() {
		
	}	
	
}
