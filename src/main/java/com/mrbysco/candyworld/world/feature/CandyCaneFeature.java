package com.mrbysco.candyworld.world.feature;

import com.mojang.serialization.Codec;
import com.mrbysco.candyworld.registry.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;

public class CandyCaneFeature extends Feature<RandomPatchConfiguration> {
	public CandyCaneFeature(Codec<RandomPatchConfiguration> configCodec) {
		super(configCodec);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> placeContext) {
		RandomPatchConfiguration clusterFeatureConfig = placeContext.config();
		WorldGenLevel reader = placeContext.level();
		RandomSource randomSource = placeContext.random();
		ChunkGenerator generator = placeContext.chunkGenerator();
		BlockPos blockpos = placeContext.origin();
		int xzSpread = clusterFeatureConfig.xzSpread() + 1;
		BlockState testState = ModBlocks.GREEN_CANDY_CANE_BLOCK.get().defaultBlockState();

		int i = 1;

		BlockPos.MutableBlockPos blockpos$mutable = new BlockPos.MutableBlockPos();
		for (int j = 0; j < clusterFeatureConfig.tries(); ++j) {
			int yOffset = 0;
			if (blockpos.getY() > generator.getSeaLevel() - 2) {
				BlockPos newPos = new BlockPos(blockpos);
				for (int offset = 0; offset < blockpos.getY(); offset++) {
					newPos = newPos.below();
					if (testState.canSurvive(reader, newPos) && newPos.getY() < generator.getSeaLevel() - 2) {
						yOffset = offset;
						continue;
					}
				}
				if (yOffset == 0) {
					return false;
				}
			}

			if (j == 0) {
				j = 1;
			}

			blockpos$mutable.setWithOffset(blockpos, randomSource.nextInt(xzSpread) - randomSource.nextInt(xzSpread), -yOffset, randomSource.nextInt(j) - randomSource.nextInt(j));
			if (clusterFeatureConfig.feature().value().place(reader, generator, randomSource, blockpos$mutable)) {
				++i;
			}
		}

		return i > 0;
	}
}