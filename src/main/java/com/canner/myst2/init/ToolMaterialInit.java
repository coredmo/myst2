package com.canner.myst2.init;

import com.canner.myst2.world.BaseToolMaterial;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public final class ToolMaterialInit {
	
	protected static final Tier BOZGAB = new BaseToolMaterial(15.5f, 500, 5, 25f, 2500, () -> Ingredient.of(iteminit.BOZGAB.get()));
	
	private ToolMaterialInit() {
		
	}
}
