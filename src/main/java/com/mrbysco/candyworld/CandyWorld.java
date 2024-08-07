package com.mrbysco.candyworld;

import com.mrbysco.candyworld.block.fluid.ModFluids;
import com.mrbysco.candyworld.client.ClientHandler;
import com.mrbysco.candyworld.config.CandyConfig;
import com.mrbysco.candyworld.entity.ModLootTables;
import com.mrbysco.candyworld.registry.ModBiomes;
import com.mrbysco.candyworld.registry.ModBlocks;
import com.mrbysco.candyworld.registry.ModEntities;
import com.mrbysco.candyworld.registry.ModItems;
import com.mrbysco.candyworld.world.*;
import com.mrbysco.candyworld.world.biomemods.ModBiomeModifiers;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CandyWorld.MOD_ID)
public class CandyWorld {
	public static final String MOD_ID = "candyworld";
	public static final Logger LOGGER = LogManager.getLogger();

	public CandyWorld() {
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CandyConfig.commonSpec);
		eventBus.register(CandyConfig.class);

		eventBus.addListener(this::setup);
		ModFluids.register(eventBus);
		//ModFluids.registerFluids();
		ModLootTables.init();

		ModItems.ITEMS.register(eventBus);
		ModBlocks.BLOCKS.register(eventBus);
		ModFeatures.FEATURES.register(eventBus);
		//ModFluids.FLUIDS.register(eventBus);
		ModEntities.ENTITIES.register(eventBus);
		ModBiomes.BIOMES.register(eventBus);
		ModBiomeModifiers.BIOME_MODIFIERS.register(eventBus);
		ModConfiguredFeatures.CONFIGURED_FEATURES.register(eventBus);
		//ModPlacedFeatures.PLACED_FEATURES.register(eventBus);
		ModPlacedFeatures.register(eventBus);
		ModSurfaceRules.RULE_REGISTRY.register(eventBus);

//		ModSurfaceBuilders.SURFACE_BUILDERS.register(eventBus);
//		ModWorldCarvers.WORLD_CARVERS.register(eventBus);
		ModFoliagePlacer.FOLIAGE_PLACERS.register(eventBus);
		ModFeatures.FEATURES.register(eventBus);
		CandyTrunkPlacers.TRUNK_PLACERS.register(eventBus);

		MinecraftForge.EVENT_BUS.addListener(ModEntities::addSpawns);
		MinecraftForge.EVENT_BUS.register(new WorldgenHandler());
		eventBus.addListener(ModEntities::registerEntityAttributes);

		DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
			eventBus.addListener(ClientHandler::onClientSetup);
			eventBus.addListener(ClientHandler::registerEntityRenders);
			eventBus.addListener(ClientHandler::registerLayerDefinitions);
			eventBus.addListener(ClientHandler::registerBlockColors);
			eventBus.addListener(ClientHandler::registerItemColors);
		});
	}

	private void setup(final FMLCommonSetupEvent event) {
		ModEntities.registerSpawnPlacement();
		ModBiomes.addBiomeTypes();
		ModBiomes.addBiomes();
//		ModDimension.registerStuff();
	}
	@Mod.EventBusSubscriber(modid = CandyWorld.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class ClientModEvents{
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(ModFluids.LIQUID_CANDY_SOURCE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ModFluids.LIQUID_CANDY_FLOWING.get(), RenderType.translucent());
		}
	}
}