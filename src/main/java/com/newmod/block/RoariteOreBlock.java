package com.newmod.block;

import com.newmod.NewMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class RoariteOreBlock extends Block {
public RoariteOreBlock(){
    super(Material.ROCK);
    this.setCreativeTab(NewMod.ITEM_GROUP);
    this.setHardness(12.5f);
    this.setResistance(4000.0f);
    this.setSoundType(SoundType.STONE);
    this.setUnlocalizedName("roarite_ore_block");
}
}
