package com.example.finalmod.entity.model;

import com.example.finalmod.entity.custom.CustomEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CustomEntityModel extends AnimatedGeoModel<CustomEntity> {

    @Override
    public ResourceLocation getModelLocation(CustomEntity object) {
        return new ResourceLocation("finalmod", "geo/mob.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CustomEntity object) {
        return new ResourceLocation("finalmod", "textures/entity/mob.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CustomEntity animatable) {
        return new ResourceLocation("finalmod", "animations/mob.animation.json");
    }
}
