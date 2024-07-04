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