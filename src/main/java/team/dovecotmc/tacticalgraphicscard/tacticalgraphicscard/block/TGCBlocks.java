package team.dovecotmc.tacticalgraphicscard.tacticalgraphicscard.block;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import team.dovecotmc.tacticalgraphicscard.tacticalgraphicscard.TacticalGraphicsCard;

/**
 * @author Arrokoth
 * @project Tactical-Graphics-Card
 * @copyright Copyright © 2023 Arrokoth All Rights Reserved.
 */
public class TGCBlocks {
    public static final Block GTX_690 = registerBlock("gtx_690", new BlockGraphicsCard());

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(TacticalGraphicsCard.MOD_ID, name), block);
    }

    public static void register() {
        TacticalGraphicsCard.LOGGER.info("Register Mod Blocks");
    }
}
