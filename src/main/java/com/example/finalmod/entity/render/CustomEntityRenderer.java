package com.example.finalmod.entity.render;

import com.example.finalmod.entity.custom.CustomEntity;
import com.example.finalmod.entity.model.CustomEntityModel;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CustomEntityRenderer extends GeoEntityRenderer<CustomEntity> {
    public CustomEntityRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CustomEntityModel());
        this.shadowRadius = 0.7F; // Устанавливаем радиус тени для сущности
    }

    @Override
    public ResourceLocation getTextureLocation(CustomEntity instance) {
        return new ResourceLocation("finalmod", "textures/entity/mob.png");
    }

    @Override
    protected void applyRotations(CustomEntity entityLiving, PoseStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    public Vec3 getRenderOffset(CustomEntity entity, float partialTicks) {
        return super.getRenderOffset(entity, partialTicks);
    }
}
