package com.foodcraft.gui.blocks;

import java.util.Random;

import com.foodcraft.FoodCraft;
import com.foodcraft.GuiIDs;
import com.foodcraft.gui.tileentities.TileEntityChoppingBoard;
import com.foodcraft.init.FoodcraftGuiBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockChoppingBoard extends GUIBlockFoodcraft {
	private final Random Random = new Random();
	public BlockChoppingBoard() {
		this.setHardness(3.0f);
		this.setBlockBounds(0F, 0F, 0F, 1F, 0.15F, 1F);
		this.setUnlocalizedName("Caiban");
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(Block.soundTypeWood);
		this.setCreativeTab(FoodCraft.FcTabMachine);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		GameRegistry.registerBlock(this,"Caiban");
	}
		@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityChoppingBoard();
	}
		
	public int getRenderType() {
	    return 3;
	}
	    
	public boolean isOpaqueCube() {
		return false;
	}
		
	public boolean isFullCube() {
	    return false;
	}
	        

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return Item.getItemFromBlock(FoodcraftGuiBlocks.Caiban);
	}
	
	@SideOnly(Side.CLIENT)
	public Item getItem(World w, int x, int y, int z) {
		return Item.getItemFromBlock(FoodcraftGuiBlocks.Caiban);
	}
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
		ItemStack stack = playerIn.inventory.mainInventory[playerIn.inventory.currentItem];
		playerIn.openGui(FoodCraft.instance, GuiIDs.GUI_Caiban, worldIn,pos.getX(), pos.getY(), pos.getZ());
		return true;
	}
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		TileEntity tileentity = worldIn.getTileEntity(pos);
		if (tileentity instanceof TileEntityChoppingBoard) {
				InventoryHelper.dropInventoryItems(worldIn, pos, (TileEntityChoppingBoard)tileentity);
				worldIn.updateComparatorOutputLevel(pos, this);
		}
		super.breakBlock(worldIn, pos, state);
	}
}