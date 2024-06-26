package com.mrbysco.candyworld.events;

import com.mrbysco.candyworld.CandyWorld;
import com.mrbysco.candyworld.registry.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraftforge.event.entity.living.MobSpawnEvent;
import net.minecraftforge.eventbus.api.Event.Result;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CandyWorld.MOD_ID)
public class EventHandler {

	@SubscribeEvent
	public static void onCheckSpawn(MobSpawnEvent event) {
		LivingEntity livingEntity = event.getEntity();
		// prevent water mobs such as squid from spawning in chocolate
		BlockPos pos = new BlockPos((int) event.getX(), (int) event.getY(), (int) event.getZ());
		if (event.getEntity().getSpawnType() == MobSpawnType.NATURAL || event.getEntity().getSpawnType() == MobSpawnType.CHUNK_GENERATION || event.getEntity().getSpawnType() == MobSpawnType.STRUCTURE) {
			if (livingEntity instanceof WaterAnimal && event.getLevel().getBlockState(pos).getBlock() == ModBlocks.LIQUID_CHOCOLATE_BLOCK.get()) {
				event.setResult(Result.DENY);
			}
//			if (CandyConfig.COMMON.preventModdedMobSpawn.get() && livingEntity.level.dimension().location().equals(ModDimension.candy_world.location())) {
//				if (!livingEntity.getType().getRegistryName().getNamespace().equals(CandyWorld.MOD_ID)) {
//					event.setResult(Result.DENY);
//				}
//			}
		}
	}
}
