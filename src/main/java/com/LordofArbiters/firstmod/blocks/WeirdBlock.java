package com.LordofArbiters.firstmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class WeirdBlock extends Block {
    public WeirdBlock(){
        super(Properties.create(Material.IRON).sound(SoundType.ANVIL).hardnessAndResistance(2.0f).lightValue(20));
        setRegistryName("weird_wlock");

    }
}
