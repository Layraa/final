package com.example.finalmod.entity;

import com.example.finalmod.FinalMod;
import com.example.finalmod.entity.custom.CustomEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.resources.ResourceLocation;

@Mod.EventBusSubscriber(modid = FinalMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, FinalMod.MOD_ID);

    public static final RegistryObject<EntityType<CustomEntity>> CUSTOM_ENTITY = ENTITIES.register("custom_entity",
            () -> EntityType.Builder.of(CustomEntity::new, MobCategory.CREATURE)
                    .sized(0.6F, 1.95F)
                    .build(new ResourceLocation(FinalMod.MOD_ID, "custom_entity").toString()));

    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(CUSTOM_ENTITY.get(), AttributeSupplier.builder()
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D)
                .add(Attributes.ATTACK_DAMAGE, 3.0D)
                .add(Attributes.ATTACK_SPEED, 2.0D)
                .build());
    }

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
