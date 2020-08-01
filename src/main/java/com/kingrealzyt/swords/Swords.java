package com.kingrealzyt.swords;

import com.kingrealzyt.swords.entities.ShrekEntity;
import com.kingrealzyt.swords.init.ModBlocks;
import com.kingrealzyt.swords.init.ModEntityTypes;
import com.kingrealzyt.swords.init.ModItems;
import jdk.nashorn.internal.objects.Global;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("rswords")
public class Swords
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "rswords";

    public Swords() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        DeferredWorkQueue.runLater(() -> {
            GlobalEntityTypeAttributes.put(ModEntityTypes.SHREK.get(), ShrekEntity.setCustomAttributes().create());
        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) { }

public static final ItemGroup TAB = new ItemGroup("swordstab") {

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.VAMPIRIC_SWORD.get());
    }
};

}
