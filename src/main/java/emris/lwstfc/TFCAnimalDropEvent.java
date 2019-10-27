package emris.lwstfc;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;


public class TFCAnimalDropEvent
{
  @SubscribeEvent
  public void onTFCAnimalDrop(LivingDropsEvent e) {
    if (e.entityLiving instanceof com.dunk.tfc.Entities.Mobs.EntitySheepTFC) {
      addDrops(e, new ItemStack(LWSItems.itemBladder, 1, 0));
    } else if (e.entityLiving instanceof com.dunk.tfc.Entities.Mobs.EntityCowTFC) {
      addDrops(e, new ItemStack(LWSItems.itemBladder, 1, 1));
    } else if (e.entityLiving instanceof com.dunk.tfc.Entities.Mobs.EntityDeer) {
      addDrops(e, new ItemStack(LWSItems.itemBladder, 1, 2));
    } 
  }
  
  void addDrops(LivingDropsEvent event, ItemStack dropStack) {
    EntityItem entityitem = new EntityItem(event.entityLiving.worldObj, event.entityLiving.posX, event.entityLiving.posY, event.entityLiving.posZ, dropStack);
    entityitem.delayBeforeCanPickup = 10;
    event.drops.add(entityitem);
  }
}
