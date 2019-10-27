package emris.lwstfc;

import com.dunk.tfc.Core.Recipes;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CraftingHandler
{
  @SubscribeEvent
  public void onCrafting(PlayerEvent.ItemCraftedEvent e) {
    Item item = e.crafting.getItem();
    IInventory craftMatrix = e.craftMatrix;
    
    if (craftMatrix != null)
    {
      if (item == LWSItems.itemLeatherWaterSac) {
        
        if (e.player.capabilities.isCreativeMode) {
          e.crafting.setItemDamage(0);
        }
        for (int i = 0; i < craftMatrix.getSizeInventory(); i++) {
          
          if (craftMatrix.getStackInSlot(i) != null)
          {
            
            for (int j = 0; j < Recipes.knives.length; j++) {
              
              if (craftMatrix.getStackInSlot(i).getItem() == Recipes.knives[j]) {
                
                ItemStack tfcKnife = craftMatrix.getStackInSlot(i).copy();
                if (tfcKnife != null) {
                  
                  tfcKnife.damageItem(1, e.player);
                  if (tfcKnife.getItemDamage() != 0 || e.player.capabilities.isCreativeMode) {
                    
                    craftMatrix.setInventorySlotContents(i, tfcKnife);
                    (craftMatrix.getStackInSlot(i)).stackSize = 2;
                  } 
                } 
              } 
            } 
          }
        } 
      } 
    }
  }
}