package com.newmod;

import net.minecraft.creativetab.CreativeTabs;
import com.newmod.NewModTab;
import net.minecraft.item.Item;

import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ItemRoariteIngot extends Item {

    public ItemRoariteIngot() {
        super();
        this.setCreativeTab(NewMod.ITEM_GROUP);
        this.setUnlocalizedName("roarite_ingot");
    }
}
