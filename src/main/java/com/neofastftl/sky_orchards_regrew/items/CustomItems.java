package com.neofastftl.sky_orchards_regrew.items;

import com.neofastftl.sky_orchards_regrew.SkyOrchards;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CustomItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SkyOrchards.MOD_ID);

    public static final RegistryObject<Item> COTTONWOOD_ACORN = ITEMS.register("cottonwood_acorn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COTTONWOOD_RESIN = ITEMS.register("cottonwood_resin",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> DIRT_ACORN = ITEMS.register("dirt_acorn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRT_RESIN = ITEMS.register("dirt_resin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PETRIFIED_ACORN = ITEMS.register("petrified_acorn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PETRIFIED_RESIN = ITEMS.register("petrified_resin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CLAY_ACORN = ITEMS.register("clay_acorn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLAY_RESIN = ITEMS.register("clay_resin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAND_ACORN = ITEMS.register("sand_acorn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAND_RESIN = ITEMS.register("sand_resin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GRAVEL_ACORN = ITEMS.register("gravel_acorn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAVEL_RESIN = ITEMS.register("gravel_resin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COAL_ACORN = ITEMS.register("coal_acorn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COAL_RESIN = ITEMS.register("coal_resin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRON_ACORN = ITEMS.register("iron_acorn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_RESIN = ITEMS.register("iron_resin",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
