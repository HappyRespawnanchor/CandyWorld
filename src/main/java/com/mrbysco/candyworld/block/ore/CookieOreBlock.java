package com.mrbysco.candyworld.block.ore;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class CookieOreBlock extends Block {
    public CookieOreBlock(Properties properties) {
        super(properties);
    }
    @Override
    public int getExpDrop(BlockState state, LevelReader world, RandomSource randomSource, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? randomSource.nextInt(3) : 0;
    }
}
