package com.canner.myst2.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class Myst2Block extends Block{
	
	public Myst2Block(Properties properties) {
		super(properties);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player,
			InteractionHand hand, BlockHitResult result) {
		
		if (world.isClientSide()) {
			if (player.getItemInHand(hand).getItem().equals(Items.DIAMOND)) {
				System.out.println(player.getName().getString() + " interacted with that shit at pos " + pos.toShortString()
				+ " using a diamond.");
				return InteractionResult.CONSUME;
			}
		}
		
		return super.use(state, world, pos, player, hand, result);
	}
	
}