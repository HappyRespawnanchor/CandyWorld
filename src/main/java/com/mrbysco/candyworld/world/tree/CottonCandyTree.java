package com.mrbysco.candyworld.world.tree;

import com.mrbysco.candyworld.world.ModConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;

public class CottonCandyTree extends AbstractTreeGrower {
	@Nullable
	@Override
	protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean hasFlowers) {
		return (ResourceKey<ConfiguredFeature<?, ?>>) ModConfiguredFeatures.COTTON_CANDY_TREE.getHolder().orElse(null);
	}
}
	