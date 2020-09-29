package com.kingrealzyt.swords.init;

import com.kingrealzyt.swords.Swords;
import com.kingrealzyt.swords.blocks.BlockItemBase;
import com.kingrealzyt.swords.items.ItemBase;
import com.kingrealzyt.swords.util.enums.ModItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Swords.MOD_ID);

    // Items
    public static final RegistryObject<Item> BLACK_IRON_INGOT = ITEMS.register("black_iron_ingot", ItemBase::new);
    public static final RegistryObject<Item> BLOOD_IRON_INGOT = ITEMS.register("blood_iron_ingot", ItemBase::new);
    public static final RegistryObject<Item> FIRE_INGOT = ITEMS.register("fire_ingot", ItemBase::new);
    public static final RegistryObject<Item> CRIMSON_INGOT = ITEMS.register("crimson_ingot", ItemBase::new);
    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot", ItemBase::new);
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", ItemBase::new);
    public static final RegistryObject<Item> BRUH_INGOT = ITEMS.register("bruh_ingot", ItemBase::new);

    // Swords
    public static final RegistryObject<SwordItem> BLACK_IRON_SWORD = ITEMS.register("black_iron_sword", () ->
            new SwordItem(ModItemTier.BLACK_IRON, 1, -2.4F, new Item.Properties().group(Swords.TAB)));
    public static final RegistryObject<SwordItem> BLOOD_IRON_SWORD = ITEMS.register("blood_iron_sword", () ->
            new SwordItem(ModItemTier.BLOOD_IRON, 1, -2.4F, new Item.Properties().group(Swords.TAB)));
    public static final RegistryObject<SwordItem> FIRE_SWORD = ITEMS.register("fire_sword", () ->
            new SwordItem(ModItemTier.FIRE, 1, -2.4F, new Item.Properties().group(Swords.TAB)));
    public static final RegistryObject<SwordItem> CRIMSON_SWORD = ITEMS.register("crimson_sword", () ->
            new SwordItem(ModItemTier.CRIMSON, 1, -2.4F, new Item.Properties().group(Swords.TAB)));
    public static final RegistryObject<SwordItem> COBALT_SWORD = ITEMS.register("cobalt_sword", () ->
            new SwordItem(ModItemTier.COBALT, 1, -2.4F, new Item.Properties().group(Swords.TAB)));
    public static final RegistryObject<SwordItem> SILVER_SWORD = ITEMS.register("silver_sword", () ->
            new SwordItem(ModItemTier.SILVER, 1, -2.4F, new Item.Properties().group(Swords.TAB)));
    public static final RegistryObject<SwordItem> BRUH_SWORD = ITEMS.register("bruh_sword", () ->
            new SwordItem(ModItemTier.BRUH, 2, -2.4F, new Item.Properties().group(Swords.TAB)));

    // Combined Swords
    public static final RegistryObject<SwordItem> VAMPIRIC_SWORD = ITEMS.register("vampiric_sword", () ->
            new SwordItem(ModItemTier.VAMPRIC, 1, -2.4F, new Item.Properties().group(Swords.TAB)));
    public static final RegistryObject<SwordItem> INFESTED_SWORD = ITEMS.register("infested_sword", () ->
            new SwordItem(ModItemTier.INFESTED, 1, -2.4F, new Item.Properties().group(Swords.TAB)));

    // Block Items
    public static final RegistryObject<Item> BLACK_IRON_BLOCK_ITEM = ITEMS.register("black_iron_block",
            () -> new BlockItemBase(ModBlocks.BLACK_IRON_BLOCK.get()));

    public static final RegistryObject<Item> BLACK_IRON_ORE_ITEM = ITEMS.register("black_iron_ore",
            () -> new BlockItemBase(ModBlocks.BLACK_IRON_ORE.get()));

    public static final RegistryObject<Item> BLOOD_IRON_BLOCK_ITEM = ITEMS.register("blood_iron_block",
            () -> new BlockItemBase(ModBlocks.BLOOD_IRON_BLOCK.get()));

    public static final RegistryObject<Item> BLOOD_IRON_ORE_ITEM = ITEMS.register("blood_iron_ore",
            () -> new BlockItemBase(ModBlocks.BLOOD_IRON_ORE.get()));

    public static final RegistryObject<Item> FIRE_BLOCK_ITEM = ITEMS.register("fire_block",
            () -> new BlockItemBase(ModBlocks.FIRE_BLOCK.get()));

    public static final RegistryObject<Item> FIRE_ORE_ITEM = ITEMS.register("fire_ore",
            () -> new BlockItemBase(ModBlocks.FIRE_ORE.get()));

    public static final RegistryObject<Item> CRIMSON_BLOCK_ITEM = ITEMS.register("crimson_block",
            () -> new BlockItemBase(ModBlocks.CRIMSON_BLOCK.get()));

    public static final RegistryObject<Item> CRIMSON_ORE_ITEM = ITEMS.register("crimson_ore",
            () -> new BlockItemBase(ModBlocks.CRIMSON_ORE.get()));

    public static final RegistryObject<Item> COBALT_BLOCK_ITEM = ITEMS.register("cobalt_block",
            () -> new BlockItemBase(ModBlocks.COBALT_BLOCK.get()));

    public static final RegistryObject<Item> COBALT_ORE_ITEM = ITEMS.register("cobalt_ore",
            () -> new BlockItemBase(ModBlocks.COBALT_ORE.get()));

    public static final RegistryObject<Item> SILVER_BLOCK_ITEM = ITEMS.register("silver_block",
            () -> new BlockItemBase(ModBlocks.SILVER_BLOCK.get()));

    public static final RegistryObject<Item> SILVER_ORE_ITEM = ITEMS.register("silver_ore",
            () -> new BlockItemBase(ModBlocks.SILVER_ORE.get()));

    public static final RegistryObject<Item> BRUH_ORE_ITEM = ITEMS.register("bruh_ore",
            () -> new BlockItemBase(ModBlocks.BRUH_ORE.get()));

    public static final RegistryObject<Item> BRUH_BLOCK_ITEM = ITEMS.register("bruh_block",
            () -> new BlockItemBase(ModBlocks.BRUH_BLOCK.get()));
}
