package org.extraslow.mod_1;

import net.fabricmc.api.ModInitializer;
import org.extraslow.mod_1.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Mod_1 implements ModInitializer {
    public static final String MOD_ID="mod_1";
    public static final Logger LOGGER= LoggerFactory.getLogger("mod_1");

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
