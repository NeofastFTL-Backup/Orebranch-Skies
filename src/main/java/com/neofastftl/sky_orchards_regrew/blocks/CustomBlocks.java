package com.neofastftl.sky_orchards_regrew.blocks;

import com.neofastftl.sky_orchards_regrew.SkyOrchards;
import com.neofastftl.sky_orchards_regrew.items.CustomItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class CustomBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SkyOrchards.MOD_ID);

    public static final RegistryObject<Block> COTTONWOOD_LOG = registerBlock("cottonwood_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(1f)));
    public static final RegistryObject<Block> COTTONWOOD_LEAVES = registerBlock("cottonwood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> COTTONWOOD_SAPLING = registerBlock("cottonwood_sapling",
            () -> new SaplingBlock(new CottonwoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> COTTONWOOD_AMBER = registerBlock("cottonwood_amber",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> DIRT_LOG = registerBlock("dirt_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(1f)));
    public static final RegistryObject<Block> DIRT_LEAVES = registerBlock("dirt_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> DIRT_SAPLING = registerBlock("dirt_sapling",
            () -> new SaplingBlock(new DirtTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> DIRT_AMBER = registerBlock("dirt_amber",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> PETRIFIED_LOG = registerBlock("petrified_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(1f)));
    public static final RegistryObject<Block> PETRIFIED_LEAVES = registerBlock("petrified_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> PETRIFIED_SAPLING = registerBlock("petrified_sapling",
            () -> new SaplingBlock(new PetrifiedTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> PETRIFIED_AMBER = registerBlock("petrified_amber",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> CLAY_LOG = registerBlock("clay_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(1f)));
    public static final RegistryObject<Block> CLAY_LEAVES = registerBlock("clay_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> CLAY_SAPLING = registerBlock("clay_sapling",
            () -> new SaplingBlock(new ClayTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> CLAY_AMBER = registerBlock("clay_amber",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> SAND_LOG = registerBlock("sand_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(1f)));
    public static final RegistryObject<Block> SAND_LEAVES = registerBlock("sand_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> SAND_SAPLING = registerBlock("sand_sapling",
            () -> new SaplingBlock(new SandTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> SAND_AMBER = registerBlock("sand_amber",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> GRAVEL_LOG = registerBlock("gravel_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(1f)));
    public static final RegistryObject<Block> GRAVEL_LEAVES = registerBlock("gravel_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> GRAVEL_SAPLING = registerBlock("gravel_sapling",
            () -> new SaplingBlock(new GravelTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> GRAVEL_AMBER = registerBlock("gravel_amber",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));






    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return CustomItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
