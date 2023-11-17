package com.newmod;

import com.newmod.block.RoariteBlock;
import com.newmod.block.RoariteOreBlock;
import com.newmod.item.IronRod;
import com.newmod.tools.RoaritePickaxe;
import com.newmod.tools.RoariteShovel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;




@Mod(modid = "newmod",
     name = "New Mod",
     version ="1.0.2",
     acceptedMinecraftVersions = "[1.12]")
@EventBusSubscriber(modid = "newmod")
public class NewMod {
    public static final String MOD_ID = "newmod";

    public static final CreativeTabs ITEM_GROUP = new NewModTab("NewMod");
   public static final Logger LOGGER = LogManager.getLogger();
    public static final Item ROARITE_INGOT = new ItemRoariteIngot();
    public static final Block ROARITE_ORE_BLOCK = new RoariteOreBlock();
    public static final Block ROARITE_BLOCK=new RoariteBlock();
    public static final Item IRON_ROD=new IronRod();
    public static final Item ROARITE_PICKAXE=new RoaritePickaxe();
    public static final Item ROARITE_SHOVEL=new RoariteShovel();
public NewMod(){
    MinecraftForge.EVENT_BUS.register(this);

}


    //
    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event){
        event.getRegistry().register(ROARITE_INGOT.setRegistryName(MOD_ID,"roarite_ingot"));
        event.getRegistry().register(new ItemBlock(ROARITE_ORE_BLOCK).setRegistryName(MOD_ID,"roarite_ore_block"));
        event.getRegistry().register(new ItemBlock(ROARITE_BLOCK).setRegistryName(MOD_ID,"roarite_block"));
        event.getRegistry().register(IRON_ROD.setRegistryName(MOD_ID,"iron_rod"));
        event.getRegistry().register(ROARITE_PICKAXE);
        event.getRegistry().register(ROARITE_SHOVEL);
    }
    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().register(ROARITE_ORE_BLOCK.setRegistryName(MOD_ID,"roarite_ore_block"));
        event.getRegistry().register(ROARITE_BLOCK.setRegistryName(MOD_ID,"roarite_block"));
    }

    @GameRegistry.ObjectHolder(MOD_ID)
    public static class ITEMS{
        public static final Item sample_item =null;
    }
    @GameRegistry.ObjectHolder(MOD_ID)
    public static class BLOCKS{
    public static final Block sample_block=null;
    }
    @SubscribeEvent
    protected static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
                new Item()
                        .setRegistryName(MOD_ID,"sample_item")
                        .setCreativeTab(ITEM_GROUP)
                        .setUnlocalizedName("sample")
        );

        event.getRegistry().registerAll(
                new ItemBlock(BLOCKS.sample_block).setRegistryName(MOD_ID,"sample_block")
        );
    }
    @SubscribeEvent
    protected static void registerBlocks(RegistryEvent.Register<Block> event){
    event.getRegistry().registerAll(
    new Block(Material.ROCK)
            .setRegistryName(MOD_ID,"sample_block")
            .setCreativeTab(ITEM_GROUP)
            .setUnlocalizedName("sample_block")
            .setHardness(1.5f)
            .setResistance(1.0f)
    );
    }
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event){
        ModelLoader.setCustomModelResourceLocation(ITEMS.sample_item,0,
                new ModelResourceLocation(ITEMS.sample_item.getRegistryName(),"invntory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BLOCKS.sample_block),0,
                new ModelResourceLocation(BLOCKS.sample_block.getRegistryName(),"inventry"));
        ModelLoader.setCustomModelResourceLocation(IRON_ROD,0,
                new ModelResourceLocation(IRON_ROD.getRegistryName(),"inventry"));
        ModelLoader.setCustomModelResourceLocation(ROARITE_INGOT,0,
                new ModelResourceLocation(ROARITE_INGOT.getRegistryName(),"inventry"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ROARITE_ORE_BLOCK),0,
                new ModelResourceLocation(ROARITE_ORE_BLOCK.getRegistryName(),"inventry"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ROARITE_BLOCK),0,
                new ModelResourceLocation(ROARITE_BLOCK.getRegistryName(),"inventry"));
        ModelLoader.setCustomModelResourceLocation(ROARITE_PICKAXE, 0,
                new ModelResourceLocation(ROARITE_PICKAXE.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ROARITE_SHOVEL,0,
                new ModelResourceLocation(ROARITE_SHOVEL.getRegistryName(),"inventry"));
    }
}
