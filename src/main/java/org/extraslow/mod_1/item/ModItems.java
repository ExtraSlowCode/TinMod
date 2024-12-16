package org.extraslow.mod_1.item;

import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.extraslow.mod_1.Mod_1;

public class ModItems {
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Mod_1.MOD_ID, name), item);
    }
    //ITEMS:_______________________________________________________________________________________
    public static final Item TIN_NUGGET=registerItem("tin_nugget",
            new Item(new FabricItemSettings()));

    public static final Item TIN_INGOT=registerItem("tin_ingot",
            new Item(new FabricItemSettings()));

    public static final Item TIN_BLOCK=registerItem("tin_block",
            new Item(new FabricItemSettings()));

    public static final Item BRONZE_NUGGET=registerItem("bronze_nugget",
            new Item(new FabricItemSettings()));

    public static final Item BRONZE_INGOT=registerItem("bronze_ingot",
            new Item(new FabricItemSettings()));

    public static final Item BRONZE_BLOCK=registerItem("bronze_block",
            new Item(new FabricItemSettings()));


    //FUNCTIONS:_________________________________________________________________
    public static void addItemsToItemGroup(){
        addToItemGroup(ItemGroups.INGREDIENTS, TIN_NUGGET);
        addToItemGroup(ItemGroups.INGREDIENTS, TIN_INGOT);
        addToItemGroup(ItemGroups.INGREDIENTS, TIN_BLOCK);
        addToItemGroup(ItemGroups.INGREDIENTS, BRONZE_NUGGET);
        addToItemGroup(ItemGroups.INGREDIENTS, BRONZE_INGOT);
        addToItemGroup(ItemGroups.INGREDIENTS, BRONZE_BLOCK);
    }

    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems(){
        Mod_1.LOGGER.info("Registering Mod Items for "+Mod_1.MOD_ID);

        addItemsToItemGroup();
    }
}
