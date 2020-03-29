package com.LordofArbiters.firstmod.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy{
    @Override
    public World getClientWorld(){
        throw new IllegalStateException("Only run on client");


    }
}
