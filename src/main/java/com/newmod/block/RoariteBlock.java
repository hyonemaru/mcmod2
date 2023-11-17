package com.newmod.block;

import com.newmod.NewMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RoariteBlock extends Block {
    public RoariteBlock(){
        super(Material.IRON);
        this.setCreativeTab(NewMod.ITEM_GROUP);
        this.setHardness(10.0f);
        this.setResistance(4000.0f);
        this.setSoundType(SoundType.METAL);
        this.setUnlocalizedName("roarite_block");
    }
}
