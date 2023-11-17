package com.newmod.tools;

import com.newmod.NewMod;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class RoariteShovel extends ItemSpade {
    public static ToolMaterial ROARITE_SHOVEL_MATERIAL = EnumHelper.addToolMaterial("roarite_shovel_material",3,
            1500,12.0f,3.0f,5 );
    public RoariteShovel(){
        super(ROARITE_SHOVEL_MATERIAL);
        this.setRegistryName("roarite_shovel");
        this.setUnlocalizedName("roarite_shovel");
        this.setCreativeTab(NewMod.ITEM_GROUP);
    }
}
