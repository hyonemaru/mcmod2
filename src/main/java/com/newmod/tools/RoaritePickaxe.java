package com.newmod.tools;

import com.newmod.NewMod;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class RoaritePickaxe extends ItemPickaxe {
    public static final ToolMaterial ROARITE_MATERIAL = EnumHelper.addToolMaterial("roarite_pickaxe_material",3,
            1500,12.0f,5.0f,5);
    public RoaritePickaxe(){
        super(ROARITE_MATERIAL);
                this.setRegistryName("roarite_pickaxe");
                this.setUnlocalizedName("roarite_pickaxe");
                this.setCreativeTab(NewMod.ITEM_GROUP);
    }
}
