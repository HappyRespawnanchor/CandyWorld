package com.mrbysco.candyworld.block.fluid;

import com.mrbysco.candyworld.CandyWorld;
import com.mrbysco.candyworld.registry.ModBlocks;
import com.mrbysco.candyworld.registry.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/*
public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, CandyWorld.MOD_ID);

    public static RegistryObject<FlowingFluid> LIQUID_CHOCOLATE_SOURCE;
    public static RegistryObject<FlowingFluid> LIQUID_CHOCOLATE_FLOWING;
    public static RegistryObject<FlowingFluid> LIQUID_CANDY_SOURCE;
    public static RegistryObject<FlowingFluid> LIQUID_CANDY_FLOWING;

    public static ForgeFlowingFluid.Properties FLUID_CHOCOLATE_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> LIQUID_CHOCOLATE_SOURCE.get(),
            () -> LIQUID_CHOCOLATE_FLOWING.get(),
            FluidAttributes.builder(
                            new ResourceLocation(CandyWorld.MOD_ID, "fluid/liquid_chocolate_still"),
                            new ResourceLocation(CandyWorld.MOD_ID, "fluid/liquid_chocolate_flow")
                    )
                    .rarity(Rarity.COMMON)
                    .density(1030)
                    .temperature(315)
    ).bucket(ModItems.LIQUID_CHOCOLATE_BUCKET).block(() -> (LiquidBlock) ModBlocks.LIQUID_CHOCOLATE_BLOCK.get());

    public static ForgeFlowingFluid.Properties FLUID_CANDY_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> LIQUID_CANDY_SOURCE.get(),
            () -> LIQUID_CANDY_FLOWING.get(),
            FluidAttributes.builder(
                            new ResourceLocation(CandyWorld.MOD_ID, "fluid/liquid_candy_still"),
                            new ResourceLocation(CandyWorld.MOD_ID, "fluid/liquid_candy_flow")
                    )
                    .rarity(Rarity.COMMON)
                    .luminosity(12)
                    .density(2000)
                    .viscosity(3000)
                    .temperature(1000)
    ).bucket(ModItems.LIQUID_CANDY_BUCKET).block(() -> (LiquidBlock) ModBlocks.LIQUID_CANDY_BLOCK.get());

    public static void registerFluids() {
        LIQUID_CHOCOLATE_SOURCE = FLUIDS.register("fluid_chocolate_source", () -> new ForgeFlowingFluid.Source(FLUID_CHOCOLATE_PROPERTIES));
        LIQUID_CHOCOLATE_FLOWING = FLUIDS.register("fluid_chocolate_flowing", () -> new ForgeFlowingFluid.Flowing(FLUID_CHOCOLATE_PROPERTIES));
        LIQUID_CANDY_SOURCE = FLUIDS.register("fluid_candy_source", () -> new ForgeFlowingFluid.Source(FLUID_CANDY_PROPERTIES));
        LIQUID_CANDY_FLOWING = FLUIDS.register("fluid_candy_flowing", () -> new ForgeFlowingFluid.Flowing(FLUID_CANDY_PROPERTIES));
    }
}
*/
public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, CandyWorld.MOD_ID);

    public static final RegistryObject<FlowingFluid> LIQUID_CANDY_SOURCE = FLUIDS.register("liquid_candy_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.LIQUID_CANDY_PROPERTIES));
    public static final RegistryObject<FlowingFluid> LIQUID_CANDY_FLOWING = FLUIDS.register("flowing_liquid_candy",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.LIQUID_CANDY_PROPERTIES));

    public static final RegistryObject<FlowingFluid> LIQUID_CHOCOLATE_SOURCE = FLUIDS.register("liquid_chocolate_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.LIQUID_CHOCOLATE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> LIQUID_CHOCOLATE_FLOWING = FLUIDS.register("flowing_liquid_chocolate",
            () -> new ForgeFlowingFluid.Source(ModFluids.LIQUID_CHOCOLATE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties LIQUID_CANDY_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.LIQUID_CANDY_TYPE, LIQUID_CANDY_SOURCE, LIQUID_CANDY_FLOWING)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.LIQUID_CANDY_BLOCK)
            .bucket(ModItems.LIQUID_CANDY_BUCKET);


    public static final ForgeFlowingFluid.Properties LIQUID_CHOCOLATE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.LIQUID_CHOCOLATE_TYPE, LIQUID_CHOCOLATE_SOURCE, LIQUID_CHOCOLATE_FLOWING)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.LIQUID_CHOCOLATE_BLOCK)
            .bucket(ModItems.LIQUID_CHOCOLATE_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}