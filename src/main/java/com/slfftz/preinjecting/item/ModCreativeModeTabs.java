package com.slfftz.preinjecting.item;

import com.slfftz.preinjecting.PreInjecting;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PreInjecting.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NETEASE_ASSISTANCE__NORMAL =
            CREATIVE_MODE_TABS.register("netease_assistance__normal",() -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.NETEASE.get()))
                    .title(Component.translatable("itemGroup.netease_assistance__normal"))
                    .displayItems((Parameters, pOutput) -> {
                        pOutput.accept((ModItems.BANKNOTE.get()));
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
