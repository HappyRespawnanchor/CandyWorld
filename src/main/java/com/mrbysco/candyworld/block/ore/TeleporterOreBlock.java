package com.mrbysco.candyworld.block.ore;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class TeleporterOreBlock extends Block {

    public TeleporterOreBlock(Properties properties) {
        super(properties);
    }
    @Override
    public int getExpDrop(BlockState state, LevelReader world, RandomSource randomSource, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? randomSource.nextIntBetweenInclusive(3, 7) : 0;
    }

}
