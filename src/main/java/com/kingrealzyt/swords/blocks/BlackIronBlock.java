package com.kingrealzyt.swords.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlackIronBlock extends Block {

    public BlackIronBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5.0F, 6.0F)
                .sound(SoundType.METAL)
                .setRequiresTool()
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE));
    }
}
