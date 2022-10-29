package com.canner.myst2.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;

public class GooLightBlock extends Block{
	
	public static final BooleanProperty LIT = BooleanProperty.create("lit");

	public GooLightBlock(Properties properties) {
		super(properties.lightLevel(state -> {
			return state.getValue(LIT) ? 15 : 0;
		}));
		this.registerDefaultState(this.defaultBlockState().setValue(LIT, false));
	}
	
	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		builder.add(LIT);
		super.createBlockStateDefinition(builder);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player,
			InteractionHand hand, BlockHitResult result) {
		
		if (!world.isClientSide()) {
			if (player.getItemInHand(hand).getItem().equals(Items.IRON_INGOT)) {
				
				world.setBlock(pos, state.setValue(LIT, !state.getValue(LIT)), UPDATE_INVISIBLE);
				
				return InteractionResult.CONSUME;
			}
		}
		
		return super.use(state, world, pos, player, hand, result);
	}
	
}