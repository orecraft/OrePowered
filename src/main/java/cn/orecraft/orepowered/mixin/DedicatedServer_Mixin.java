/*
 * Created on 2019/7/16
 * Author: MaHua_A
 * Copyright 2019 by OreCraft Studio
 * DO NOT MODIFY THESE WORDS
 */


package cn.orecraft.orepowered.mixin;

import cn.orecraft.orepowered.bridge.DedicatedServer_bridge;
import net.minecraft.server.dedicated.DedicatedServer;
import net.minecraft.server.dedicated.PropertyManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(DedicatedServer.class)
public abstract class DedicatedServer_Mixin implements DedicatedServer_bridge {
    @Shadow
    private PropertyManager settings;
    @Override
    public PropertyManager getPropertyManager(){
        return this.settings;
    }
}
