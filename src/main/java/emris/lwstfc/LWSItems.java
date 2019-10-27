package emris.lwstfc;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class LWSItems
{
  public static Item itemLeatherWaterSac;
  public static Item itemWaterSacLeather;
  public static Item itemBladder;
  
  public static void Setup() {
    itemLeatherWaterSac = new ItemLeatherWaterSac();
    itemWaterSacLeather = new ItemWaterSacLeather();
    itemBladder = new ItemBladder();

    GameRegistry.registerItem(itemLeatherWaterSac, itemLeatherWaterSac.getUnlocalizedName());
    GameRegistry.registerItem(itemWaterSacLeather, itemWaterSacLeather.getUnlocalizedName());
    GameRegistry.registerItem(itemBladder, itemBladder.getUnlocalizedName());

  }
}