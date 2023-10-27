package team.dovecotmc.tacticalgraphicscard.tacticalgraphicscard.block;

import net.minecraft.block.*;
import net.minecraft.block.enums.BlockFace;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;

/**
 * @author Arrokoth
 * @project Tactical-Graphics-Card
 * @copyright Copyright © 2023 Arrokoth All Rights Reserved.
 */
public class BlockGraphicsCard extends WallMountedBlock {
    public BlockGraphicsCard() {
        super(AbstractBlock.Settings.create().nonOpaque());
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(FACE, BlockFace.WALL));
    }

    // TODO: Block


    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACE, FACING);
    }
}
