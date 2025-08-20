package com.neofastftl.sky_orchards_regrew.blocks;

import com.neofastftl.sky_orchards_regrew.SkyOrchards;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> COTTONWOOD_KEY = registerKey("cottonwood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DIRT_KEY = registerKey("dirt");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PETRIFIED_KEY = registerKey("petrified");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CLAY_KEY = registerKey("clay");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SAND_KEY = registerKey("sand");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_KEY = registerKey("gravel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COAL_KEY = registerKey("coal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> IRON_KEY = registerKey("iron");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLD_KEY = registerKey("gold");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LAPIS_KEY = registerKey("lapis");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        register(context, COTTONWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CustomBlocks.COTTONWOOD_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),

                BlockStateProvider.simple(CustomBlocks.COTTONWOOD_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, DIRT_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CustomBlocks.DIRT_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),

                BlockStateProvider.simple(CustomBlocks.DIRT_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, PETRIFIED_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CustomBlocks.DIRT_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),

                BlockStateProvider.simple(CustomBlocks.DIRT_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, CLAY_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CustomBlocks.CLAY_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),

                BlockStateProvider.simple(CustomBlocks.CLAY_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, SAND_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(CustomBlocks.SAND_LOG.get()),
            new StraightTrunkPlacer(5, 4, 3),

                BlockStateProvider.simple(CustomBlocks.SAND_LEAVES.get()),
                        new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),

            new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, GRAVEL_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CustomBlocks.SAND_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),

                BlockStateProvider.simple(CustomBlocks.SAND_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, COAL_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CustomBlocks.COAL_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),

                BlockStateProvider.simple(CustomBlocks.COAL_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, IRON_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CustomBlocks.IRON_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),

                BlockStateProvider.simple(CustomBlocks.IRON_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, GOLD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CustomBlocks.GOLD_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),

                BlockStateProvider.simple(CustomBlocks.GOLD_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, LAPIS_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CustomBlocks.LAPIS_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),

                BlockStateProvider.simple(CustomBlocks.LAPIS_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());
}


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(SkyOrchards.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
