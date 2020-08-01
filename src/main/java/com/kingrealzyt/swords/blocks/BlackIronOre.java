package com.kingrealzyt.swords.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlackIronOre extends OreBlock {

    public BlackIronOre() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(5.0F, 6.0F)
                .sound(SoundType.METAL)
                .setRequiresTool()
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE));
    }
}
