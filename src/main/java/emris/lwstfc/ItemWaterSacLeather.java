package emris.lwstfc;

import com.dunk.tfc.Core.TFCTabs;
import com.dunk.tfc.Items.ItemTerra;
import com.dunk.tfc.api.Enums.EnumItemReach;
import com.dunk.tfc.api.Enums.EnumSize;
import com.dunk.tfc.api.Enums.EnumWeight;
import com.dunk.tfc.api.Interfaces.ISize;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemWaterSacLeather extends Item implements ISize
{
  public ItemWaterSacLeather() {
    this.maxStackSize = 16;
    setCreativeTab(TFCTabs.TFC_MATERIALS);
    this.hasSubtypes = false;
    setUnlocalizedName("WaterSacLeather");
  }

  public void getSubItems(Item item, CreativeTabs tabs, List list) { list.add(new ItemStack(this)); }

  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister registerer) { this.itemIcon = registerer.registerIcon("lwstfc:WaterSacLeather"); }

  public void addInformation(ItemStack is, EntityPlayer player, List arraylist, boolean flag) { ItemTerra.addSizeInformation(is, arraylist); }
  public EnumSize getSize(ItemStack is) { return EnumSize.SMALL; }
  public EnumWeight getWeight(ItemStack is) { return EnumWeight.LIGHT; }
  public boolean canStack() { return false; }
  public EnumItemReach getReach(ItemStack is) { return EnumItemReach.SHORT; }
}
