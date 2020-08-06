package com.kingrealzyt.swords.client.model;

import com.kingrealzyt.swords.entities.ShrekEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class ShrekModel<T extends ShrekEntity> extends EntityModel<T> {

    private final ModelRenderer Waist;
    private final ModelRenderer RightLeg;
    private final ModelRenderer LeftLeg;
    private final ModelRenderer Chest;
    private final ModelRenderer LeftHand;
    private final ModelRenderer RightHand;
    private final ModelRenderer Head;
    private final ModelRenderer RightEar;
    private final ModelRenderer LeftEar;

    public ShrekModel() {
        textureWidth = 60;
        textureHeight = 60;

        Waist = new ModelRenderer(this);
        Waist.setRotationPoint(4.0F, 24.0F, 0.0F);
        Waist.setTextureOffset(28, 44).addBox(-11.0F, -12.0F, -1.0F, 12.0F, 2.0F, 3.0F, 0.0F, false);

        RightLeg = new ModelRenderer(this);
        RightLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
        RightLeg.setTextureOffset(0, 47).addBox(-7.0F, -10.0F, -1.0F, 3.0F, 10.0F, 3.0F, 0.0F, false);

        LeftLeg = new ModelRenderer(this);
        LeftLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
        LeftLeg.setTextureOffset(16, 49).addBox(2.0F, -10.0F, 0.0F, 3.0F, 10.0F, 2.0F, 0.0F, false);

        Chest = new ModelRenderer(this);
        Chest.setRotationPoint(0.0F, 24.0F, 0.0F);
        setRotationAngle(Chest, 0.0F, 0.0F, 0.0F);
        Chest.setTextureOffset(1, 16).addBox(-7.0F, -24.0F, -1.0F, 12.0F, 12.0F, 3.0F, 0.0F, false);

        LeftHand = new ModelRenderer(this);
        LeftHand.setRotationPoint(0.0F, -12.0F, 0.0F);
        Chest.addChild(LeftHand);
        LeftHand.setTextureOffset(14, 32).addBox(5.0F, -12.0F, -1.0F, 3.0F, 10.0F, 3.0F, 0.0F, false);

        RightHand = new ModelRenderer(this);
        RightHand.setRotationPoint(0.0F, 12.0F, 0.0F);
        setRotationAngle(RightHand, 0.0F, 0.0F, 0.0F);
        RightHand.setTextureOffset(0, 32).addBox(-10.0F, -12.0F, -1.0F, 3.0F, 10.0F, 3.0F, 0.0F, false);

        Head = new ModelRenderer(this);
        Head.setRotationPoint(-8.0F, -11.0F, 0.0F);
        RightHand.addChild(Head);
        Head.setTextureOffset(1, 1).addBox(3.0F, -8.0F, -3.0F, 8.0F, 7.0F, 7.0F, 0.0F, false);

        RightEar = new ModelRenderer(this);
        RightEar.setRotationPoint(0.0F, 24.0F, 0.0F);
        RightEar.setTextureOffset(30, 3).addBox(-7.0F, -31.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        RightEar.setTextureOffset(37, 2).addBox(-9.0F, -32.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);

        LeftEar = new ModelRenderer(this);
        LeftEar.setRotationPoint(24.0F, 24.0F, 0.0F);
        setRotationAngle(LeftEar, 0.0F, 3.1416F, 0.0F);
        LeftEar.setTextureOffset(32, 8).addBox(19.0F, -31.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        LeftEar.setTextureOffset(38, 8).addBox(17.0F, -32.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.Head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.Head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.Chest.rotateAngleX = ((float)Math.PI / 2F);
        this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.RightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.RightHand.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.LeftHand.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Waist.render(matrixStack, buffer, packedLight, packedOverlay);
        RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        Chest.render(matrixStack, buffer, packedLight, packedOverlay);
        RightHand.render(matrixStack, buffer, packedLight, packedOverlay);
        RightEar.render(matrixStack, buffer, packedLight, packedOverlay);
        LeftEar.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
