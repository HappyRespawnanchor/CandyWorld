package com.mrbysco.candyworld.block.cottoncandy;

import com.mrbysco.candyworld.registry.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.IForgeShearable;

public class CottonCandyBushBlock extends BushBlock implements IForgeShearable {
    protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);

    public CottonCandyBushBlock(Properties properties) {
        super(properties.offsetType(OffsetType.XYZ));
    }

    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return state.is(ModBlocks.CANDY_GRASS_BLOCK.get()) || state.is(ModBlocks.MILK_BROWNIE_BLOCK.get()) ||
                state.is(ModBlocks.CHOCOLATE_COVERED_WHITE_BROWNIE.get()) || state.is(ModBlocks.WHITE_BROWNIE_BLOCK.get()) ||
                state.is(ModBlocks.DARK_CANDY_GRASS.get()) || state.is(ModBlocks.DARK_BROWNIE_BLOCK.get()) ||
                super.mayPlaceOn(state, worldIn, pos);
    }

    @Override
    public boolean canBeReplaced(BlockState state, Fluid fluid) {
        return true;
    }

//    @Nonnull
//    @Override
//    public BlockBehaviour.OffsetType getOffsetType() {
//        return BlockBehaviour.OffsetType.XYZ;
//    }
}
