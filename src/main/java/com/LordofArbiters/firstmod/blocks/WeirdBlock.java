package com.LordofArbiters.firstmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class WeirdBlock extends Block {
    public WeirdBlock(){

        super(Properties.create(Material.IRON).sound(SoundType.GROUND).hardnessAndResistance(2.0f).lightValue(5));
        System.out.println("testing !");
        setRegistryName("weird_block");


    }


}
