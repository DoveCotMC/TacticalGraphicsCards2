package team.dovecotmc.tacticalgraphicscard.tacticalgraphicscard.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import team.dovecotmc.tacticalgraphicscard.tacticalgraphicscard.TacticalGraphicsCard;
import team.dovecotmc.tacticalgraphicscard.tacticalgraphicscard.block.TGCBlocks;

/**
 * @author Arrokoth
 * @project Tactical-Graphics-Card
 * @copyright Copyright © 2023 Arrokoth All Rights Reserved.
 */
public class TGCItems {
    public static final Item GTX_690 = registerItem("gtx_690", new BlockItem(TGCBlocks.GTX_690, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TacticalGraphicsCard.MOD_ID, name), item);
    }

    public static void register() {
        TacticalGraphicsCard.LOGGER.info("Register Mod Items");
    }
}
