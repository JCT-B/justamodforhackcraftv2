//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.jctb.justamodforhackcraftv2.item;

import net.jctb.justamodforhackcraftv2.item.custom.DrillItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.jctb.justamodforhackcraftv2.craftthisthing;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, craftthisthing.MOD_ID);


//Adding the  item to the minecraft inventory

    public static final RegistryObject<Item> STEEL = ITEMS.register("steel_ingot" ,
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_DRILL = ITEMS.register("steel_drill",
            () -> new DrillItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.STEEL, 7, -3.5f))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}

