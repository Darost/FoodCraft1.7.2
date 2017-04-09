package net.infstudio.foodcraftreloaded.client;

import net.infstudio.foodcraftreloaded.FoodCraftReloaded;
import net.infstudio.foodcraftreloaded.block.tileentity.TileEntityDrinkMachine;
import net.infstudio.foodcraftreloaded.common.container.ContainerDrinkMachine;
import net.infstudio.foodcraftreloaded.client.gui.GuiContainerDrinkMachine;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import javax.annotation.Nullable;

public class GuiHandler implements IGuiHandler {
    public GuiHandler() {
        NetworkRegistry.INSTANCE.registerGuiHandler(FoodCraftReloaded.INSTANCE, this);
    }

    @Nullable
    @Override
    public Container getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case GuiID.DRINK_MACHINE:
                return new ContainerDrinkMachine(player.inventory, (TileEntityDrinkMachine) world.getTileEntity(new BlockPos(x, y, z)));
        }
        return null;
    }

    @Nullable
    @Override
    public Gui getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case GuiID.DRINK_MACHINE:
                return new GuiContainerDrinkMachine(player.inventory, (TileEntityDrinkMachine) world.getTileEntity(new BlockPos(x, y, z)));
        }
        return null;
    }
}
