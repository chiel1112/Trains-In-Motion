package trains.registry;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.FluidContainerRegistry;
import trains.TrainsInMotion;
import trains.items.BucketHandler;
import trains.items.ItemFirstTrain;

import static trains.TrainsInMotion.MODID;

public class ItemRegistry {

    //initialize the item
    public static Item testCart = new ItemFirstTrain().setUnlocalizedName("itemTest").setTextureName(MODID + ":itemTests");
    public ItemRegistry(){}

    public void RegisterItems(){
        //register the item we initialized
        GameRegistry.registerItem(testCart, testCart.getUnlocalizedName().substring(5));
    }
}
