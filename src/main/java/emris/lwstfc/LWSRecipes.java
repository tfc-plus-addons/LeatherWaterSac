package emris.lwstfc;

import com.dunk.tfc.Core.Recipes;
import com.dunk.tfc.api.Crafting.CraftingManagerTFC;
import com.dunk.tfc.api.TFCItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraft.item.ItemStack;

public class LWSRecipes
{
  public static void registerRecipes() {
    ItemStack lwSac = new ItemStack(LWSItems.itemLeatherWaterSac, 1, LWSItems.itemLeatherWaterSac.getMaxDamage());
    ItemStack leather = new ItemStack(LWSItems.itemWaterSacLeather);
    
    ItemStack bladderSheep = new ItemStack(LWSItems.itemBladder, 1, 0);
    ItemStack bladderCow   = new ItemStack(LWSItems.itemBladder, 1, 1);
    ItemStack bladderDeer  = new ItemStack(LWSItems.itemBladder, 1, 2);

	OreDictionary.registerOre("materialBladder", bladderSheep );
	OreDictionary.registerOre("materialBladder", bladderCow);
	OreDictionary.registerOre("materialBladder", bladderDeer);
    
	GameRegistry.addRecipe(new ShapedOreRecipe(lwSac, 
		" L ", 
		"#B#", 
		" LK", 
		'#', "materialString", 
		'L', leather, 
		'B', "materialBladder", 
		'K', "itemKnife"
	)); 

	GameRegistry.addRecipe(new ShapedOreRecipe(lwSac, 
		" # ", 
		"LBL", 
		" #K", 
		'#', "materialString", 
		'L', leather, 
		'B', "materialBladder", 
		'K', "itemKnife"
	));

	GameRegistry.addRecipe(new ShapedOreRecipe(lwSac, 
		" L ", 
		"#B#", 
		"KL ", 
		'#', "materialString", 
		'L', leather, 
		'B', "materialBladder", 
		'K', "itemKnife"
	)); 

	GameRegistry.addRecipe(new ShapedOreRecipe(lwSac, 
		" # ", 
		"LBL", 
		"K# ", 
		'#', "materialString", 
		'L', leather, 
		'B', "materialBladder", 
		'K', "itemKnife"
	));
    
    CraftingManagerTFC.getInstance().addRecipe(new ItemStack(LWSItems.itemWaterSacLeather), new Object[] { 
    		"   ##", 
    		" # ##", 
    		"#####", 
    		"#####", 
    		" ### ", 
          Character.valueOf('#'), TFCItems.flatLeather });
  }
}
