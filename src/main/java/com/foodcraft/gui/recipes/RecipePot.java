package com.foodcraft.gui.recipes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.foodcraft.init.FoodcraftItems;
import com.foodcraft.itemstack.CookingOutput;
import com.foodcraft.itemstack.PotCooking;

public class RecipePot {
	
	private static final RecipePot smeltingBase = new RecipePot();
	private  Map<PotCooking, CookingOutput> stack1 = new HashMap();
    
	public static RecipePot smelting() {
        return smeltingBase;
    }
	 
	private RecipePot(){
		addrecipeItem(Items.egg, FoodcraftItems.ItemTomato, FoodcraftItems.ItemCookedRice, FoodcraftItems.ItemNull,FoodcraftItems.ItemPeanutOil, FoodcraftItems.ItemSalt, Items.sugar, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemFanqiechaojidanfan), 400, 500);
		addrecipeItem(FoodcraftItems.ItemPotatoesWire, FoodcraftItems.ItemScallion, FoodcraftItems.ItemCookedRice, FoodcraftItems.ItemNull,FoodcraftItems.ItemPeanutOil, FoodcraftItems.ItemSalt, FoodcraftItems.ItemSoySauce, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemChaotudousifan), 450, 500);
		addrecipeItem(Items.cooked_fish, FoodcraftItems.ItemChili, FoodcraftItems.ItemCookedRice, FoodcraftItems.ItemNull,FoodcraftItems.ItemPeanutOil, FoodcraftItems.ItemSalt, FoodcraftItems.ItemSoySauce, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemDuojiaoyutou),350,450);
		addrecipeItem(FoodcraftItems.ItemTofu, FoodcraftItems.ItemWatercress, FoodcraftItems.ItemCookedRice, FoodcraftItems.ItemNull,FoodcraftItems.ItemPeanutOil, FoodcraftItems.ItemSalt, FoodcraftItems.ItemStarches, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemMapodoufufan), 400, 500);
		addrecipeItem(FoodcraftItems.ItemQingjiao, Items.potato, FoodcraftItems.ItemEggplant, FoodcraftItems.ItemCookedRice,FoodcraftItems.ItemPeanutOil, FoodcraftItems.ItemSalt, Items.sugar, FoodcraftItems.ItemSoySauce, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemDisanxian), 450, 500);
		addrecipeItem(Items.cooked_porkchop, FoodcraftItems.ItemChili, Items.carrot, FoodcraftItems.ItemCookedRice,FoodcraftItems.ItemPeanutOil, FoodcraftItems.ItemSalt, Items.sugar, FoodcraftItems.ItemVinegar, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemYuxiangrousi),350,450);
		addrecipeItem(Items.cooked_chicken, FoodcraftItems.ItemPeanut, FoodcraftItems.ItemChili, FoodcraftItems.ItemCookedRice,FoodcraftItems.ItemPeanutOil, FoodcraftItems.ItemSalt, Items.sugar, FoodcraftItems.ItemVinegar, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemGongbaojiding), 400, 500);
		addrecipeItem(Items.cooked_porkchop, FoodcraftItems.ItemCookedRice, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull,FoodcraftItems.ItemPeanutOil, FoodcraftItems.ItemSalt, Items.sugar, FoodcraftItems.ItemSoySauce, FoodcraftItems.ItemVinegar, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemHongshaoroufan), 450, 500);
		addrecipeItem(Items.cooked_porkchop, FoodcraftItems.ItemChili, FoodcraftItems.ItemCookedRice, FoodcraftItems.ItemNull,FoodcraftItems.ItemPeanutOil, FoodcraftItems.ItemSalt, Items.sugar, FoodcraftItems.ItemWatercress, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemHuiguoroufan),350,450);
		addrecipeItem(FoodcraftItems.ItemStickyRiceDough, FoodcraftItems.ItemPeanutTangyuanStuffing, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull,FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemTangyuan), 400, 500);
		addrecipeItem(FoodcraftItems.ItemStickyRiceDough, FoodcraftItems.ItemDousha, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull,FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemTangyuan), 400, 500);
		addrecipeItem(Items.cooked_chicken, FoodcraftItems.ItemScallion, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull,Items.sugar, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemBaiqiuji), 450, 500);
		addrecipeItem(Items.cooked_chicken, FoodcraftItems.ItemChili, FoodcraftItems.ItemScallion, FoodcraftItems.ItemNull,FoodcraftItems.ItemPeanutOil, FoodcraftItems.ItemSalt, Items.sugar, FoodcraftItems.ItemWatercress, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemKoushuiji), 450, 500);
		addrecipeItem(Items.cooked_chicken, FoodcraftItems.ItemChili, FoodcraftItems.ItemPeanut, FoodcraftItems.ItemNull,FoodcraftItems.ItemPeanutOil, FoodcraftItems.ItemSalt, Items.sugar, FoodcraftItems.ItemSoySauce, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemLaziji),350,450);
		addrecipeItem(Items.cooked_chicken, FoodcraftItems.ItemQingjiao, FoodcraftItems.ItemVegetable, FoodcraftItems.ItemNull,FoodcraftItems.ItemPeanutOil, FoodcraftItems.ItemSalt, FoodcraftItems.ItemSoySauce, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemCongyouji), 400, 500);
		addrecipeItem(FoodcraftItems.ItemChickenWing, FoodcraftItems.ItemCoke, FoodcraftItems.ItemCookedRice, FoodcraftItems.ItemNull,FoodcraftItems.ItemPeanutOil, FoodcraftItems.ItemSalt, FoodcraftItems.ItemSoySauce, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemKelejichifan), 450, 500);
		addrecipeItem(Items.cooked_fish, FoodcraftItems.ItemChili, FoodcraftItems.ItemScallion, FoodcraftItems.ItemNull,FoodcraftItems.ItemPeanutOil, FoodcraftItems.ItemSalt, FoodcraftItems.ItemSoySauce, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemMalayu),350,450);
		addrecipeItem(Items.cooked_fish, FoodcraftItems.ItemChili, FoodcraftItems.ItemScallion, FoodcraftItems.ItemVegetable,FoodcraftItems.ItemPeanutOil, FoodcraftItems.ItemSalt, FoodcraftItems.ItemSoySauce, FoodcraftItems.ItemStarches, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemSuancaiyu), 450, 500);
		addrecipeItem(Items.cooked_chicken, FoodcraftItems.ItemBlockCurry, Items.potato, FoodcraftItems.ItemCookedRice,FoodcraftItems.ItemPeanutOil, FoodcraftItems.ItemSalt, FoodcraftItems.ItemSoySauce, FoodcraftItems.ItemStarches, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemGalijiroufan), 400, 500);
		addrecipeItem(Items.cooked_beef, FoodcraftItems.ItemChili, FoodcraftItems.ItemVegetable, FoodcraftItems.ItemNull,FoodcraftItems.ItemPeanutOil, FoodcraftItems.ItemSalt, FoodcraftItems.ItemStarches, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemShuizhuniurou),350,450);
		addrecipeItem(Items.egg, FoodcraftItems.ItemScallion, FoodcraftItems.ItemChili, FoodcraftItems.ItemCookedRice,FoodcraftItems.ItemPeanutOil, FoodcraftItems.ItemSalt, FoodcraftItems.ItemSoySauce, FoodcraftItems.ItemStarches, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemRibendoufu),350,450);
	}
	
	public void addrecipeItem(Item StapleInput1,Item StapleInput2,Item StapleInput3,
			Item StapleInput4,Item ingredients1,Item ingredients2,Item ingredients3
			,Item ingredients4,Item ingredients5,Item ingredients6,Item ingredients7
			,Item ingredients8,ItemStack Output, int min, int max) {
		stack1.put(new PotCooking(StapleInput1, StapleInput2, StapleInput3, StapleInput4, ingredients1, 
				ingredients2, ingredients3, ingredients4, ingredients5, ingredients6, ingredients7, ingredients8), new CookingOutput(Output,min,max));		
	}

	 private boolean GG(PotCooking ItemStack1, PotCooking ItemStack2) {
		return 
ItemStack1.StapleInput1 == ItemStack2.StapleInput1 && ItemStack1.StapleInput2 == ItemStack2.StapleInput2 &&
ItemStack1.StapleInput3 == ItemStack2.StapleInput3 && ItemStack1.StapleInput4 == ItemStack2.StapleInput4 &&
ItemStack1.ingredients1 == ItemStack2.ingredients1 && ItemStack1.ingredients2 == ItemStack2.ingredients2 &&
ItemStack1.ingredients3 == ItemStack2.ingredients3 && ItemStack1.ingredients4 == ItemStack2.ingredients4 &&
ItemStack1.ingredients5 == ItemStack2.ingredients5 && ItemStack1.ingredients6 == ItemStack2.ingredients6 &&
ItemStack1.ingredients7 == ItemStack2.ingredients7 && ItemStack1.ingredients8 == ItemStack2.ingredients8;
	 } 
		public Item IStapleInput1;
		public Item IStapleInput2;
		public Item IStapleInput3;
		public Item IStapleInput4;
		public Item Iingredients1;
		public Item Iingredients2;
		public Item Iingredients3;
		public Item Iingredients4;
		public Item Iingredients5;
		public Item Iingredients6;
		public Item Iingredients7;
		public Item Iingredients8;
		
	public CookingOutput getOutput(ItemStack StapleInput1,ItemStack StapleInput2,ItemStack StapleInput3,
			ItemStack StapleInput4,ItemStack ingredients1,ItemStack ingredients2,ItemStack ingredients3
			,ItemStack ingredients4,ItemStack ingredients5,ItemStack ingredients6,ItemStack ingredients7
			,ItemStack ingredients8
		) {
		if(ingredients1 != null){Iingredients1 = ingredients1.getItem();}else{Iingredients1 = FoodcraftItems.ItemNull;}
		if(ingredients2 != null){Iingredients2 = ingredients2.getItem();}else{Iingredients2 = FoodcraftItems.ItemNull;}
		if(ingredients3 != null){Iingredients3 = ingredients3.getItem();}else{Iingredients3 = FoodcraftItems.ItemNull;}
		if(ingredients4 != null){Iingredients4 = ingredients4.getItem();}else{Iingredients4 = FoodcraftItems.ItemNull;}
		if(ingredients5 != null){Iingredients5 = ingredients5.getItem();}else{Iingredients5 = FoodcraftItems.ItemNull;}
		if(ingredients6 != null){Iingredients6 = ingredients6.getItem();}else{Iingredients6 = FoodcraftItems.ItemNull;}
		if(ingredients7 != null){Iingredients7 = ingredients7.getItem();}else{Iingredients7 = FoodcraftItems.ItemNull;}
		if(ingredients8 != null){Iingredients8 = ingredients8.getItem();}else{Iingredients8 = FoodcraftItems.ItemNull;}
		if(StapleInput1 != null){IStapleInput1 = StapleInput1.getItem();}else{IStapleInput1 = FoodcraftItems.ItemNull;}
		if(StapleInput2 != null){IStapleInput2 = StapleInput2.getItem();}else{IStapleInput2 = FoodcraftItems.ItemNull;}
		if(StapleInput3 != null){IStapleInput3 = StapleInput3.getItem();}else{IStapleInput3 = FoodcraftItems.ItemNull;}
		if(StapleInput4 != null){IStapleInput4 = StapleInput4.getItem();}else{IStapleInput4 = FoodcraftItems.ItemNull;}
		PotCooking fis = new PotCooking(IStapleInput1, IStapleInput2, IStapleInput3, IStapleInput4, Iingredients1, 
					Iingredients2, Iingredients3, Iingredients4, Iingredients5, Iingredients6, Iingredients7, Iingredients8);
		Iterator iterator1 = stack1.entrySet().iterator();
	    Entry entry1;	
	    do {
	        if (!iterator1.hasNext()) {
	            return null;
	        }
	        entry1 = (Entry)iterator1.next();
	    }
	    while (!GG(fis, (PotCooking)entry1.getKey()));
	    CookingOutput is1 = (CookingOutput)entry1.getValue();  
	    return is1;	    	    
	}

	public Map<PotCooking, CookingOutput> getSmeltingList() {
		return this.stack1;
	}
}
