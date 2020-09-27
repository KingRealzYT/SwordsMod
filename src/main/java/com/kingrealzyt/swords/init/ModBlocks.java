package com.kingrealzyt.swords.init;

import com.kingrealzyt.swords.Swords;
import com.kingrealzyt.swords.blocks.*;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {



    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Swords.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> BLACK_IRON_BLOCK = BLOCKS.register("black_iron_block", BlackIronBlock::new);
    public static final RegistryObject<Block> BLACK_IRON_ORE = BLOCKS.register("black_iron_ore", BlackIronOre::new);
    public static final RegistryObject<Block> BLOOD_IRON_BLOCK = BLOCKS.register("blood_iron_block", BloodIronBlock::new);
    public static final RegistryObject<Block> BLOOD_IRON_ORE = BLOCKS.register("blood_iron_ore", BloodIronOre::new);
    public static final RegistryObject<Block> FIRE_BLOCK = BLOCKS.register("fire_block", FireBlock::new);
    public static final RegistryObject<Block> FIRE_ORE = BLOCKS.register("fire_ore", FireOre::new);
    public static final RegistryObject<Block> CRIMSON_BLOCK = BLOCKS.register("crimson_block", CrimsonBlock::new);
    public static final RegistryObject<Block> CRIMSON_ORE = BLOCKS.register("crimson_ore", CrimsonOre::new);
    public static final RegistryObject<Block> COBALT_BLOCK = BLOCKS.register("cobalt_block", CobaltBlock::new);
    public static final RegistryObject<Block> COBALT_ORE = BLOCKS.register("cobalt_ore", CobaltOre::new);
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", SilverBlock::new);
    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", SilverOre::new);
    public static final RegistryObject<Block> BRUH_BLOCK = BLOCKS.register("bruh_block", BruhBlock::new);
    public static final RegistryObject<Block> BRUH_ORE = BLOCKS.register("bruh_ore", BruhOre::new);

}
