package team.dovecotmc.tacticalgraphicscard.tacticalgraphicscard;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import team.dovecotmc.tacticalgraphicscard.tacticalgraphicscard.block.TGCBlocks;
import team.dovecotmc.tacticalgraphicscard.tacticalgraphicscard.item.TGCItems;

/**
 * @author Arrokoth
 * @project Tactical-Graphics-Card
 * @copyright Copyright © 2023 Arrokoth All Rights Reserved.
 */
public class TacticalGraphicsCard implements ModInitializer {
    public static final String MOD_ID = "tactical_graphics_card";
    public static final Logger LOGGER = LogManager.getLogger("Tactical Graphics Card");

    @Override
    public void onInitialize() {
        TGCBlocks.register();
        TGCItems.register();
        LOGGER.info("Initializing Mod!");
    }
}
