package com.mrbysco.candyworld.block.fluid;

import com.mrbysco.candyworld.CandyWorld;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation LIQUID_CHOCOLATE_OVERLAY_RL = new ResourceLocation("msic/in_soap_water");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CandyWorld.MOD_ID);

    public static final RegistryObject<FluidType> LIQUID_CHOCOLATE_TYPE = register(
            FluidType.Properties.create()
                    .rarity(Rarity.COMMON)
                    .density(1030)
                    .temperature(315)
                    /*.sound(SoundAction.get("drink"),
                            SoundEvents.HONEY_DRINK)*/);

    private static RegistryObject<FluidType> register (FluidType.Properties properties) {
        return FLUID_TYPES.register("liquid_chocolate", () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, LIQUID_CHOCOLATE_OVERLAY_RL, 0xA1E038D0, new Vector3f(244f / 155f, 56f / 255f, 208f  / 255f), properties));
    }
    public static void register(IEventBus eventBus) {

        FLUID_TYPES.register(eventBus);
    }
}
