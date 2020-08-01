package com.kingrealzyt.swords.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SilverBlock extends Block {

    public SilverBlock() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(5.0F, 6.0F)
                .sound(SoundType.METAL)
                .setRequiresTool()
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE));
    }
}
