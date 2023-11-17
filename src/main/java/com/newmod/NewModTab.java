package com.newmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class NewModTab extends CreativeTabs {

    public NewModTab(String name) {
        super(name);
    }
@Override
    public ItemStack getTabIconItem() {
        return new ItemStack(NewMod.ROARITE_INGOT);
    }
}
