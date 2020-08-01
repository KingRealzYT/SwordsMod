package com.kingrealzyt.swords.items;

import com.kingrealzyt.swords.Swords;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(Swords.TAB));
    }
}
