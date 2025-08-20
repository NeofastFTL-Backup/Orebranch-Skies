package com.neofastftl.sky_orchards_regrew;

import com.mojang.logging.LogUtils;
import com.neofastftl.sky_orchards_regrew.blocks.CustomBlocks;
import com.neofastftl.sky_orchards_regrew.blocks.ModWoodTypes;
import com.neofastftl.sky_orchards_regrew.items.CustomItems;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.function.Supplier;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SkyOrchards.MOD_ID)
public class SkyOrchards {
    public static final String MOD_ID = "sky_orchards";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SkyOrchards() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CustomBlocks.register(modEventBus);
        CustomItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(CustomItems.COTTONWOOD_ACORN);
            event.accept(CustomItems.COTTONWOOD_RESIN);
            event.accept(CustomBlocks.COTTONWOOD_LEAVES);
            event.accept(CustomBlocks.COTTONWOOD_LOG);
            event.accept(CustomBlocks.COTTONWOOD_SAPLING);
            event.accept(CustomBlocks.COTTONWOOD_AMBER);

            event.accept(CustomItems.DIRT_ACORN);
            event.accept(CustomItems.DIRT_RESIN);
            event.accept(CustomBlocks.DIRT_LEAVES);
            event.accept(CustomBlocks.DIRT_LOG);
            event.accept(CustomBlocks.DIRT_SAPLING);
            event.accept(CustomBlocks.DIRT_AMBER);

            event.accept(CustomItems.PETRIFIED_ACORN);
            event.accept(CustomItems.PETRIFIED_RESIN);
            event.accept(CustomBlocks.PETRIFIED_LEAVES);
            event.accept(CustomBlocks.PETRIFIED_LOG);
            event.accept(CustomBlocks.PETRIFIED_SAPLING);
            event.accept(CustomBlocks.PETRIFIED_AMBER);

            event.accept(CustomItems.CLAY_ACORN);
            event.accept(CustomItems.CLAY_RESIN);
            event.accept(CustomBlocks.CLAY_LEAVES);
            event.accept(CustomBlocks.CLAY_LOG);
            event.accept(CustomBlocks.CLAY_SAPLING);
            event.accept(CustomBlocks.CLAY_AMBER);

            event.accept(CustomItems.SAND_ACORN);
            event.accept(CustomItems.SAND_RESIN);
            event.accept(CustomBlocks.SAND_LEAVES);
            event.accept(CustomBlocks.SAND_LOG);
            event.accept(CustomBlocks.SAND_SAPLING);
            event.accept(CustomBlocks.SAND_AMBER);

            event.accept(CustomItems.GRAVEL_ACORN);
            event.accept(CustomItems.GRAVEL_RESIN);
            event.accept(CustomBlocks.GRAVEL_LEAVES);
            event.accept(CustomBlocks.GRAVEL_LOG);
            event.accept(CustomBlocks.GRAVEL_SAPLING);
            event.accept(CustomBlocks.GRAVEL_AMBER);

            event.accept(CustomItems.COAL_ACORN);
            event.accept(CustomItems.COAL_RESIN);
            event.accept(CustomBlocks.COAL_LEAVES);
            event.accept(CustomBlocks.COAL_LOG);
            event.accept(CustomBlocks.COAL_SAPLING);
            event.accept(CustomBlocks.COAL_AMBER);

            event.accept(CustomItems.IRON_ACORN);
            event.accept(CustomItems.IRON_RESIN);
            event.accept(CustomBlocks.IRON_LEAVES);
            event.accept(CustomBlocks.IRON_LOG);
            event.accept(CustomBlocks.IRON_SAPLING);
            event.accept(CustomBlocks.IRON_AMBER);
        }
    }
    private static void setRenderLayer(Supplier<? extends Block> supplier, RenderType type) {
        ItemBlockRenderTypes.setRenderLayer((Block)supplier.get(), type);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            Sheets.addWoodType(ModWoodTypes.COTTONWOOD);
            SkyOrchards.setRenderLayer(CustomBlocks.COTTONWOOD_SAPLING, RenderType.cutout());

            Sheets.addWoodType(ModWoodTypes.DIRT);
            SkyOrchards.setRenderLayer(CustomBlocks.DIRT_SAPLING, RenderType.cutout());

            Sheets.addWoodType(ModWoodTypes.PETRIFIED);
            SkyOrchards.setRenderLayer(CustomBlocks.PETRIFIED_SAPLING, RenderType.cutout());

            Sheets.addWoodType(ModWoodTypes.CLAY);
            SkyOrchards.setRenderLayer(CustomBlocks.CLAY_SAPLING, RenderType.cutout());

            Sheets.addWoodType(ModWoodTypes.SAND);
            SkyOrchards.setRenderLayer(CustomBlocks.SAND_SAPLING, RenderType.cutout());

            Sheets.addWoodType(ModWoodTypes.GRAVEL);
            SkyOrchards.setRenderLayer(CustomBlocks.GRAVEL_SAPLING, RenderType.cutout());

            Sheets.addWoodType(ModWoodTypes.COAL);
            SkyOrchards.setRenderLayer(CustomBlocks.COAL_SAPLING, RenderType.cutout());

            Sheets.addWoodType(ModWoodTypes.IRON);
            SkyOrchards.setRenderLayer(CustomBlocks.IRON_SAPLING, RenderType.cutout());
        }
    }
}
