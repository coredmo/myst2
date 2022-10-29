//package com.canner.myst2.block;
//
//import org.jetbrains.annotations.Nullable;
//
//import net.minecraft.core.BlockPos;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.EntityBlock;
//import net.minecraft.world.level.block.entity.BlockEntity;
//import net.minecraft.world.level.block.entity.BlockEntityTicker;
//import net.minecraft.world.level.block.entity.BlockEntityType;
//import net.minecraft.world.level.block.state.BlockState;
//
//public class Crusha extends Block implements EntityBlock{
//	
//	public Crusha(Properties properties) { super(properties); }
//	
//	@Nullable
//	@Override
//	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
//		return null;
//	}
//	
//	@Nullable
//	@Override
//	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
//		return EntityBlock.super.getTicker(p_153212_, p_153213_, p_153214_);
//	}
//}
