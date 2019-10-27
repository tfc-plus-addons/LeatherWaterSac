package emris.lwstfc;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;


@Mod(modid = "lwstfc", name = "Leather Water Sac", version = "3.9", dependencies = "after:TerraFirmaCraftPlus")
public class LeatherWaterSac
{
  @Instance("LeatherWaterSac")
  public static LeatherWaterSac instance;
  
  @EventHandler
  public void preInit(FMLPreInitializationEvent event) { LWSItems.Setup(); }


  
  @EventHandler
  public void load(FMLInitializationEvent event) {
    LWSRecipes.registerRecipes();
    FMLCommonHandler.instance().bus().register(new CraftingHandler());
    MinecraftForge.EVENT_BUS.register(new TFCAnimalDropEvent());
  }
}