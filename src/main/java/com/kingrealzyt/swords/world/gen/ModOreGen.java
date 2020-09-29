package com.kingrealzyt.swords.world.gen;

import com.kingrealzyt.swords.Swords;
import com.kingrealzyt.swords.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Swords.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModOreGen {

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {
            genOre(biome, 8, 8, 5, 30, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.BLACK_IRON_ORE.get().getDefaultState(), 6);
            genOre(biome, 8, 8, 5, 30, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.BLOOD_IRON_ORE.get().getDefaultState(), 6);
            genOre(biome, 8, 8, 5, 30, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.FIRE_ORE.get().getDefaultState(), 6);
            genOre(biome, 8, 8, 5, 30, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.CRIMSON_ORE.get().getDefaultState(), 6);
            genOre(biome, 8, 8, 5, 30, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.COBALT_ORE.get().getDefaultState(), 6);
            genOre(biome, 8, 8, 5, 30, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.SILVER_ORE.get().getDefaultState(), 6);
            genOre(biome, 8, 8, 5, 30, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.BRUH_ORE.get().getDefaultState(), 6);
        }

    }

    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockState, int size) {
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockState, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
}
