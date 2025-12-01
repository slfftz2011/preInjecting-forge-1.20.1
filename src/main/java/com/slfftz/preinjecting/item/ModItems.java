package com.slfftz.preinjecting.item;

import com.slfftz.preinjecting.PreInjecting;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PreInjecting.MOD_ID);

    public static final RegistryObject<Item> BANKNOTE = ITEMS.register("banknote", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETEASE = ITEMS.register("netease", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
