package com.kingrealzyt.swords.init;

import com.kingrealzyt.swords.Swords;
import com.kingrealzyt.swords.entities.ShrekEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.http.client.entity.EntityBuilder;

public class ModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Swords.MOD_ID);

    // Entity Types
    public static final RegistryObject<EntityType<ShrekEntity>> SHREK = ENTITY_TYPES.register("shrek",
            () -> EntityType.Builder.create(ShrekEntity::new, EntityClassification.CREATURE)
                    .size(1.0F,2.0F)
                    .build(new ResourceLocation(Swords.MOD_ID, "shrek").toString()));
}
