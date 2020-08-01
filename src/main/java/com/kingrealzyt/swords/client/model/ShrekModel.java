package com.kingrealzyt.swords.client.model;

import com.kingrealzyt.swords.entities.ShrekEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ShrekModel<T extends ShrekEntity> extends EntityModel {

    private final ModelRenderer RightLeg;
    private final ModelRenderer bone3;
    private final ModelRenderer bone2;
    private final ModelRenderer Torso;
    private final ModelRenderer LeftLeg;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer RightArm;
    private final ModelRenderer LeftArm;
    private final ModelRenderer Head;

    public ShrekModel() {
        textureWidth = 16;
        textureHeight = 16;

        RightLeg = new ModelRenderer(this);
        RightLeg.setRotationPoint(-4.0F, 20.0F, 0.0F);


        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(0.0F, -7.0F, 0.0F);
        RightLeg.addChild(bone3);
        bone3.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -1.0F, 5.0F, 11.0F, 3.0F, 0.0F, false);

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, -7.0F, 0.0F);
        RightLeg.addChild(bone2);
        bone2.setTextureOffset(0, 0).addBox(-3.0F, 0.0F, -2.0F, 7.0F, 6.0F, 5.0F, 0.0F, false);

        Torso = new ModelRenderer(this);
        Torso.setRotationPoint(0.0F, 9.5F, 0.5F);
        Torso.setTextureOffset(0, 0).addBox(-9.0F, -18.5F, -5.5F, 18.0F, 22.0F, 11.0F, 0.0F, false);

        LeftLeg = new ModelRenderer(this);
        LeftLeg.setRotationPoint(3.0F, 20.0F, 0.0F);


        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(0.0F, -7.0F, 0.0F);
        LeftLeg.addChild(bone7);
        bone7.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -1.0F, 5.0F, 11.0F, 3.0F, 0.0F, false);

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.0F, -7.0F, 0.0F);
        LeftLeg.addChild(bone8);
        bone8.setTextureOffset(0, 0).addBox(-3.0F, 0.0F, -2.0F, 7.0F, 6.0F, 5.0F, 0.0F, false);

        RightArm = new ModelRenderer(this);
        RightArm.setRotationPoint(12.0F, -3.0F, 0.0F);
        RightArm.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 16.0F, 6.0F, 0.0F, false);
        RightArm.setTextureOffset(0, 0).addBox(-4.0F, -5.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.0F, false);

        LeftArm = new ModelRenderer(this);
        LeftArm.setRotationPoint(-12.0F, -3.0F, 0.0F);
        LeftArm.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 16.0F, 6.0F, 0.0F, false);
        LeftArm.setTextureOffset(0, 0).addBox(-4.0F, -5.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.0F, false);

        Head = new ModelRenderer(this);
        Head.setRotationPoint(0.0F, 24.0F, 0.0F);
        Head.setTextureOffset(0, 0).addBox(-6.0F, -45.0F, -6.0F, 12.0F, 12.0F, 13.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.Head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.RightArm.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.LeftArm.rotateAngleX = ((float)Math.PI / 2F);
        this.bone2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.bone3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.RightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.bone7.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.bone8.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        Torso.render(matrixStack, buffer, packedLight, packedOverlay);
        LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
        LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
        Head.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
