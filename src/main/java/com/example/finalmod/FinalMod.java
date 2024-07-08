package com.example.finalmod;

import com.example.finalmod.entity.ModEntities;
import com.example.finalmod.entity.custom.CustomEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(FinalMod.MOD_ID)
public class FinalMod {
    public static final String MOD_ID = "finalmod";
    private static final Logger LOGGER = LogManager.getLogger();

    public FinalMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onEntityAttributeCreation);

        ModEntities.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Здесь можно добавить код для настройки, общего для всех сторон (клиент/сервер)
    }

    private void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
        event.put(ModEntities.CUSTOM_ENTITY.get(), CustomEntity.setAttributes().build());
    }

    @Mod.EventBusSubscriber(modid = FinalMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Здесь можно добавить код для настройки клиента
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Здесь можно добавить код для настройки сервера
    }
}
