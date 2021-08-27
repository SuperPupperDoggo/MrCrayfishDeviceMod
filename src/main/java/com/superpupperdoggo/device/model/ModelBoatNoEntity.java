package com.superpupperdoggo.device.model;

import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.model.ModelBoat;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelBoatNoEntity extends ModelBoat implements IMultipassModel
{

@Override
public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
{
    GlStateManager.rotate(90.0F, 0.0F, 1.0F, 0.0F);
    //EntityBoat entityboat = (EntityBoat)entityIn;
    //this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);

    for (int i = 0; i < 5; ++i)
    {
        this.boatSides[i].render(scale);
    }
}
}
