package com.mrbysco.candyworld.datagen;

import com.mrbysco.candyworld.datagen.assets.CandyItemModelProvider;
import com.mrbysco.candyworld.datagen.assets.CandyLanguageProvider;
import com.mrbysco.candyworld.datagen.assets.CandyStateProvider;
import com.mrbysco.candyworld.datagen.data.CandyLoot;
import com.mrbysco.candyworld.datagen.data.CandyRecipes;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDatagen {
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		PackOutput output = event.getGenerator().getPackOutput();
		ExistingFileHelper helper = event.getExistingFileHelper();

		if (event.includeServer()) {
			generator.addProvider(true,new CandyLoot(output));
			generator.addProvider(true,new CandyRecipes(output));
		}
		if (event.includeClient()) {
			generator.addProvider(true,new CandyStateProvider(output, helper));
			generator.addProvider(true,new CandyItemModelProvider(output, helper));
			generator.addProvider(true,new CandyLanguageProvider(output));
		}
	}
}
