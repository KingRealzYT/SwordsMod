package com.kingrealzyt.swords.client.render;

import com.kingrealzyt.swords.Swords;
import com.kingrealzyt.swords.client.model.ShrekModel;
import com.kingrealzyt.swords.entities.ShrekEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ShrekRenderer extends MobRenderer<ShrekEntity, ShrekModel<ShrekEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Swords.MOD_ID, "textures/entity/ShrekEntity.png");

    public ShrekRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ShrekModel<>(), 1.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(ShrekEntity entity) {
        return null;
    }


}
