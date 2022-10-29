//package com.canner.myst2.init;
//
//import com.canner.myst2.Myst2;
//import net.minecraft.world.level.block.entity.BlockEntityType;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.RegistryObject;
//
//public class BlockEntityInit {
//	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES_, Myst2.MODID);
//	
//	public static final RegistryObject<BlockEntityType<CrushaBlockEntity>> CRUSHA = BLOCK_ENTITIES.register(name: "crusha", () -> BlockEntityType.Builder.of(CrushaBlockEntity::new, BlockInit.CRUSHA.get()).build(null));
//}
