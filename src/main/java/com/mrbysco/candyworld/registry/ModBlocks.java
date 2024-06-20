package com.mrbysco.candyworld.registry;

import com.mrbysco.candyworld.CandyWorld;
import com.mrbysco.candyworld.block.ModSoundTypes;
import com.mrbysco.candyworld.block.StackableBlock;
import com.mrbysco.candyworld.block.SugarSandBlock;
import com.mrbysco.candyworld.block.WaferStickBlock;
import com.mrbysco.candyworld.block.candysoil.CandyGrassBlock;
import com.mrbysco.candyworld.block.chocolate.ChocolateBarBlock;
import com.mrbysco.candyworld.block.chocolate.ChocolateLeavesBlock;
import com.mrbysco.candyworld.block.chocolate.ChocolateMushroomBlock;
import com.mrbysco.candyworld.block.chocolate.ChocolateSaplingBlock;
import com.mrbysco.candyworld.block.cottoncandy.CottonCandyBushBlock;
import com.mrbysco.candyworld.block.cottoncandy.CottonCandyLeavesBlock;
import com.mrbysco.candyworld.block.cottoncandy.CottonCandyPlantBlock;
import com.mrbysco.candyworld.block.cottoncandy.CottonCandySaplingBlock;
import com.mrbysco.candyworld.block.fluid.LiquidChocolateBlock;
import com.mrbysco.candyworld.block.fluid.ModFluids;
import com.mrbysco.candyworld.block.gummy.BaseGummyBlock;
import com.mrbysco.candyworld.block.gummy.GummyBlock;
import com.mrbysco.candyworld.block.gummy.GummyWormBlock;
import com.mrbysco.candyworld.block.ore.CookieOreBlock;
import com.mrbysco.candyworld.block.ore.TeleporterOreBlock;
import com.mrbysco.candyworld.block.workbench.CandyCaneWorkbenchBlock;
import com.mrbysco.candyworld.block.workbench.ChocolateWorkbenchBlock;
import com.mrbysco.candyworld.block.workbench.GummyWorkbenchBlock;
import com.mrbysco.candyworld.world.tree.ChocolateTree;
import com.mrbysco.candyworld.world.tree.CottonCandyTree;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CandyWorld.MOD_ID);

    public static final RegistryObject<Block> CHOCOLATE_SAPLING = registerBlock("chocolate_sapling", () ->
            new ChocolateSaplingBlock(new ChocolateTree(), Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));

    public static final RegistryObject<Block> WAFER_STICK_BLOCK = registerBlock("wafer_stick_block", () ->
            new WaferStickBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .strength(0.9F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
            ));


    public static final RegistryObject<Block> MILK_CHOCOLATE_LEAVES = registerBlock("milk_chocolate_leaves", () ->
            new ChocolateLeavesBlock(Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(0.3f)
                    .randomTicks()
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .isValidSpawn((state, world, pos, type) -> false)
                    .isSuffocating((state, world, pos) -> false)
                    .isViewBlocking((state, world, pos) -> false)));


    public static final RegistryObject<Block> WHITE_CHOCOLATE_LEAVES = registerBlock("white_chocolate_leaves", () ->
            new ChocolateLeavesBlock(Properties.of()
                    .mapColor(MapColor.SAND)
                    .strength(0.3f)
                    .randomTicks()
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .isValidSpawn((state, world, pos, type) -> false)
                    .isSuffocating((state, world, pos) -> false)
                    .isViewBlocking((state, world, pos) -> false)));

    public static final RegistryObject<Block> DARK_CHOCOLATE_LEAVES = registerBlock("dark_chocolate_leaves", () ->
            new ChocolateLeavesBlock(Properties.of()
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .strength(0.3f)
                    .randomTicks()
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .isValidSpawn((state, world, pos, type) -> false)
                    .isSuffocating((state, world, pos) -> false)
                    .isViewBlocking((state, world, pos) -> false)));

    public static final RegistryObject<Block> MILK_CHOCOLATE_BAR_BLOCK = registerBlock("milk_chocolate_bar_block", () ->
            new ChocolateBarBlock(Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(0.7F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> WHITE_CHOCOLATE_BAR_BLOCK = registerBlock("white_chocolate_bar_block", () ->
            new ChocolateBarBlock(Properties.of()
                    .mapColor(MapColor.SAND)
                    .strength(0.7F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> DARK_CHOCOLATE_BAR_BLOCK = registerBlock("dark_chocolate_bar_block", () ->
            new ChocolateBarBlock(Properties.of()
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .strength(0.7F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> MILK_CHOCOLATE_MUSHROOM = registerBlock("milk_chocolate_mushroom", () ->
            new ChocolateMushroomBlock(Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .noCollission()
                    .instabreak()
                    .sound(SoundType.GRASS)));

    public static final RegistryObject<Block> WHITE_CHOCOLATE_MUSHROOM = registerBlock("white_chocolate_mushroom", () ->
            new ChocolateMushroomBlock(Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .noCollission()
                    .instabreak()
                    .sound(SoundType.GRASS)));

    public static final RegistryObject<Block> DARK_CHOCOLATE_MUSHROOM = registerBlock("dark_chocolate_mushroom", () ->
            new ChocolateMushroomBlock(Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .noCollission()
                    .instabreak()
                    .sound(SoundType.GRASS)));

    public static final RegistryObject<Block> MILK_CHOCOLATE_BLOCK = registerBlock("milk_chocolate_block", () ->
            new Block(Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(0.7F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> WHITE_CHOCOLATE_BLOCK = registerBlock("white_chocolate_block", () ->
            new Block(Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(0.7F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> DARK_CHOCOLATE_BLOCK = registerBlock("dark_chocolate_block", () ->
            new Block(Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(0.7F)
                    .sound(SoundType.STONE)));


    public static final RegistryObject<Block> MILK_CHOCOLATE_BRICK = registerBlock("milk_chocolate_brick", () ->
            new Block(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(0.7F)
                    .sound(SoundType.STONE)));


    public static final RegistryObject<Block> WHITE_CHOCOLATE_BRICK = registerBlock("white_chocolate_brick", () ->
            new Block(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(0.7F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> DARK_CHOCOLATE_BRICK = registerBlock("dark_chocolate_brick", () ->
            new Block(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(0.7F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> MILK_CHOCOLATE_WORKBENCH = registerBlock("milk_chocolate_workbench", () ->
            new ChocolateWorkbenchBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(0.9F)
                    .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> WHITE_CHOCOLATE_WORKBENCH = registerBlock("white_chocolate_workbench", () ->
            new ChocolateWorkbenchBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(0.9F)
                    .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> DARK_CHOCOLATE_WORKBENCH = registerBlock("dark_chocolate_workbench", () ->
            new ChocolateWorkbenchBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(0.9F)
                    .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> COTTON_CANDY_SAPLING = registerBlock("cotton_candy_sapling", () ->
            new CottonCandySaplingBlock(new CottonCandyTree(), BlockBehaviour
                    .Properties.of()
                    .noCollission()
                    .randomTicks()
                    .instabreak()
                    .sound(ModSoundTypes.COTTON_CANDY)));

    public static final RegistryObject<Block> COTTON_CANDY_LEAVES = registerBlock("cotton_candy_leaves", () ->
            new CottonCandyLeavesBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(0.2F)
                    .randomTicks()
                    .sound(ModSoundTypes.COTTON_CANDY)
                    .noOcclusion()
                    .isValidSpawn((state, getter, pos, entityType) -> entityType == EntityType.OCELOT || entityType == EntityType.PARROT)
                    .isSuffocating((state, getter, pos) -> false)
                    .isViewBlocking((state, getter, pos) -> false)));

    public static final RegistryObject<Block> COTTON_CANDY_PLANT = registerBlock("cotton_candy_plant", () ->
            new CottonCandyPlantBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .noCollission()
                    .instabreak()
                    .sound(ModSoundTypes.COTTON_CANDY)));

    public static final RegistryObject<Block> COTTON_CANDY_BUSH = registerBlock("cotton_candy_bush", () ->
            new CottonCandyBushBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .noCollission()
                    .instabreak()
                    .sound(ModSoundTypes.COTTON_CANDY)));


    public static final RegistryObject<Block> WHITE_CANDY_CANE_BLOCK = registerBlock("white_candy_cane_block", () ->
            new StackableBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(1.2F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> RED_CANDY_CANE_BLOCK = registerBlock("red_candy_cane_block", () ->
            new StackableBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(1.2F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> GREEN_CANDY_CANE_BLOCK = registerBlock("green_candy_cane_block", () ->
            new StackableBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(1.2F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> WHITE_RED_CANDY_CANE_BLOCK = registerBlock("white_red_candy_cane_block", () ->
            new StackableBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(1.2F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> WHITE_GREEN_CANDY_CANE_BLOCK = registerBlock("white_green_candy_cane_block", () ->
            new StackableBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(1.2F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> RED_GREEN_CANDY_CANE_BLOCK = registerBlock("red_green_candy_cane_block", () ->
            new StackableBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(1.2F)
                    .sound(SoundType.STONE)));
    public static final RegistryObject<Block> WHITE_CANDY_CANE_WORKBENCH = registerBlock("white_candy_cane_workbench", () ->
            new CandyCaneWorkbenchBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(1.2F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> RED_CANDY_CANE_WORKBENCH = registerBlock("red_candy_cane_workbench", () ->
            new CandyCaneWorkbenchBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(1.2F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> GREEN_CANDY_CANE_WORKBENCH = registerBlock("green_candy_cane_workbench", () ->
            new CandyCaneWorkbenchBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(1.2F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> WHITE_RED_CANDY_CANE_WORKBENCH = registerBlock("white_red_candy_cane_workbench", () ->
            new CandyCaneWorkbenchBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(1.2F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> WHITE_GREEN_CANDY_CANE_WORKBENCH = registerBlock("white_green_candy_cane_workbench", () ->
            new CandyCaneWorkbenchBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(1.2F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> RED_GREEN_CANDY_CANE_WORKBENCH = registerBlock("red_green_candy_cane_workbench", () ->
            new CandyCaneWorkbenchBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(1.2F)
                    .sound(SoundType.STONE)));


    public static final RegistryObject<Block> CRYSTALLIZED_SUGAR = registerBlock("crystallized_sugar", () ->
            new Block(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(1.5F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> LICORICE_BLOCK = registerBlock("licorice_block", () ->
            new Block(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(1.5F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> SUGAR_SAND = registerBlock("sugar_sand", () ->
            new SugarSandBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(0.5F)
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> CANDY_GRASS_BLOCK = registerBlock("candy_grass_block", () ->
            new CandyGrassBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.DIRT)
                    .randomTicks()
                    .strength(0.6F)
                    .sound(ModSoundTypes.CANDY_GRASS)));

    public static final RegistryObject<Block> MILK_BROWNIE_BLOCK = registerBlock("milk_brownie_block", () ->
            new Block(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.DIRT)
                    .strength(0.6F)
                    .sound(ModSoundTypes.CANDY_DIRT)));

    public static final RegistryObject<Block> CHOCOLATE_COVERED_WHITE_BROWNIE = registerBlock("chocolate_covered_white_brownie", () ->
            new CandyGrassBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.SAND)
                    .randomTicks()
                    .strength(0.6F)
                    .sound(ModSoundTypes.CANDY_DIRT)));

    public static final RegistryObject<Block> WHITE_BROWNIE_BLOCK = registerBlock("white_brownie_block", () ->
            new Block(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.SAND)
                    .strength(0.6F)
                    .sound(ModSoundTypes.CANDY_DIRT)));

    public static final RegistryObject<Block> DARK_CANDY_GRASS = registerBlock("dark_candy_grass_block", () ->
            new CandyGrassBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.DIRT)
                    .randomTicks()
                    .strength(0.6F)
                    .sound(ModSoundTypes.CANDY_GRASS)));

    public static final RegistryObject<Block> DARK_BROWNIE_BLOCK = registerBlock("dark_brownie_block", () ->
            new Block(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.DIRT)
                    .strength(0.6F)
                    .sound(ModSoundTypes.CANDY_DIRT)));

    public static final RegistryObject<Block> CRYSTALLIZED_SUGAR_COOKIE_ORE = registerBlock("crystallized_sugar_cookie_ore", () ->
            new CookieOreBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(1.5F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COOKIE_ORE = registerBlock("cookie_ore", () ->
            new CookieOreBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(1.5F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> TELEPORTER_ORE = registerBlock("teleporter_ore", () ->
            new TeleporterOreBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(1.5F)
                    .sound(SoundType.STONE)));


    public static final RegistryObject<Block> RED_GUMMY_BLOCK = registerBlock("red_gummy_block", () ->
            new GummyBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.FIRE)
                    .strength(0.4F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)
                    .noOcclusion()));

    public static final RegistryObject<Block> ORANGE_GUMMY_BLOCK = registerBlock("orange_gummy_block", () ->
            new GummyBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .strength(0.4F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)
                    .noOcclusion()));

    public static final RegistryObject<Block> YELLOW_GUMMY_BLOCK = registerBlock("yellow_gummy_block", () ->
            new GummyBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(0.4F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)
                    .noOcclusion()));

    public static final RegistryObject<Block> WHITE_GUMMY_BLOCK = registerBlock("white_gummy_block", () ->
            new GummyBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.SAND)
                    .strength(0.4F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)
                    .noOcclusion()));

    public static final RegistryObject<Block> GREEN_GUMMY_BLOCK = registerBlock("green_gummy_block", () ->
            new GummyBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .strength(0.4F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)
                    .noOcclusion()));

    public static final RegistryObject<Block> RED_HARDENED_GUMMY_BLOCK = registerBlock("red_hardened_gummy_block", () ->
            new BaseGummyBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.FIRE)
                    .strength(0.5F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)));

    public static final RegistryObject<Block> ORANGE_HARDENED_GUMMY_BLOCK = registerBlock("orange_hardened_gummy_block", () ->
            new BaseGummyBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .strength(0.5F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)));

    public static final RegistryObject<Block> YELLOW_HARDENED_GUMMY_BLOCK = registerBlock("yellow_hardened_gummy_block", () ->
            new BaseGummyBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(0.5F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)));

    public static final RegistryObject<Block> WHITE_HARDENED_GUMMY_BLOCK = registerBlock("white_hardened_gummy_block", () ->
            new BaseGummyBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.SAND)
                    .strength(0.5F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)));

    public static final RegistryObject<Block> GREEN_HARDENED_GUMMY_BLOCK = registerBlock("green_hardened_gummy_block", () ->
            new BaseGummyBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .strength(0.5F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)));

    public static final RegistryObject<Block> RED_GUMMY_WORM_BLOCK = registerBlock("red_gummy_worm_block", () ->
            new GummyWormBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.FIRE)
                    .strength(0.5F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)));

    public static final RegistryObject<Block> ORANGE_GUMMY_WORM_BLOCK = registerBlock("orange_gummy_worm_block", () ->
            new GummyWormBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .strength(0.5F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)));

    public static final RegistryObject<Block> YELLOW_GUMMY_WORM_BLOCK = registerBlock("yellow_gummy_worm_block", () ->
            new GummyWormBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(0.5F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)));

    public static final RegistryObject<Block> WHITE_GUMMY_WORM_BLOCK = registerBlock("white_gummy_worm_block", () ->
            new GummyWormBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.SAND)
                    .strength(0.5F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)));

    public static final RegistryObject<Block> GREEN_GUMMY_WORM_BLOCK = registerBlock("green_gummy_worm_block", () ->
            new GummyWormBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .strength(0.5F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)));

    public static final RegistryObject<Block> RED_GUMMY_WORKBENCH = registerBlock("red_gummy_workbench", () ->
            new GummyWorkbenchBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.FIRE)
                    .strength(0.5F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)));

    public static final RegistryObject<Block> ORANGE_GUMMY_WORKBENCH = registerBlock("orange_gummy_workbench", () ->
            new GummyWorkbenchBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .strength(0.5F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)));

    public static final RegistryObject<Block> YELLOW_GUMMY_WORKBENCH = registerBlock("yellow_gummy_workbench", () ->
            new GummyWorkbenchBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(0.5F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)));

    public static final RegistryObject<Block> WHITE_GUMMY_WORKBENCH = registerBlock("white_gummy_workbench", () ->
            new GummyWorkbenchBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.SAND)
                    .strength(0.5F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)));

    public static final RegistryObject<Block> GREEN_GUMMY_WORKBENCH = registerBlock("green_gummy_workbench", () ->
            new GummyWorkbenchBlock(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .strength(0.5F)
                    .friction(0.6F)
                    .sound(ModSoundTypes.GUMMY)));

    // fluids
    public static final RegistryObject<Block> LIQUID_CHOCOLATE_BLOCK = BLOCKS.register("liquid_chocolate", () ->
            new LiquidChocolateBlock(() -> ModFluids.LIQUID_CHOCOLATE_SOURCE.get(), BlockBehaviour
                    .Properties.of()
                    .noCollission()
                    .strength(100.0F)));

    public static final RegistryObject<Block> LIQUID_CANDY_BLOCK = BLOCKS.register("liquid_candy", () ->
            new LiquidBlock(() -> ModFluids.LIQUID_CANDY_SOURCE.get(), BlockBehaviour
                    .Properties.of()
                    .noCollission()
                    .strength(100.0F)
                    .lightLevel((state) -> 12)));

    // registerBlock method
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<Block> block) {
        RegistryObject<? extends Block> ret = BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties()));
        return (RegistryObject<T>) ret;
    }


}
