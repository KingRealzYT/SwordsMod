package com.kingrealzyt.swords.util.enums;

import com.kingrealzyt.swords.init.ModBlocks;
import com.kingrealzyt.swords.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    BLACK_IRON(3, 1571, 7.0F, 7.0F, 12, () -> {
        return Ingredient.fromItems(ModItems.BLACK_IRON_INGOT.get());
    }),
    BLOOD_IRON(3, 1571, 7.0F, 7.0F, 12, () -> {
        return Ingredient.fromItems(ModItems.BLOOD_IRON_INGOT.get());
    }),
    FIRE(3, 1571, 7.0F, 7.0F, 12, () -> {
        return Ingredient.fromItems(ModItems.FIRE_INGOT.get());
    }),
    CRIMSON(3, 1571, 7.0F, 7.0F, 12, () -> {
        return Ingredient.fromItems(ModItems.CRIMSON_INGOT.get());
    }),
    COBALT(3, 1571, 7.0F, 7.0F, 12, () -> {
        return Ingredient.fromItems(ModItems.COBALT_INGOT.get());
    }),
    SILVER(3, 1571, 7.0F, 7.0F, 12, () -> {
        return Ingredient.fromItems(ModItems.SILVER_INGOT.get());
    }),
    BRUH(3, 1600, 7.0F, 7.0F, 12, () -> {
        return Ingredient.fromItems(ModItems.BRUH_SWORD.get());
    }),
    VAMPRIC(3, 1571, 7.0F, 9.0F, 12, () -> {
        return Ingredient.fromItems(ModItems.VAMPIRIC_SWORD.get());
    }),
    INFESTED(3, 1571, 7.0F, 9.0F, 12, () -> {
        return Ingredient.fromItems(ModItems.INFESTED_SWORD.get());
    });


    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
