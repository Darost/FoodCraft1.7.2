package com.cfyifei.item;



import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ITemFood extends ItemFood{
public boolean e;

		public ITemFood(int amount, float saturation, boolean isWolfFood, String name) {
			super((int)saturation, saturation, isWolfFood);
			this.setUnlocalizedName(name);

		}
		public ITemFood(int amount, float saturation, boolean isWolfFood, String name, boolean is) {
			super(amount, saturation, isWolfFood);
			this.setUnlocalizedName(name);
           e = is;
		}
	    public boolean hasEffect(ItemStack par1ItemStack)
	    {
	        return e;
	    }

	}

