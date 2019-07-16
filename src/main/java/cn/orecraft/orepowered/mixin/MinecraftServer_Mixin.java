/*
 * Created on 2019/7/16
 * Author: MaHua_A
 * Copyright 2019 by OreCraft Studio
 * DO NOT MODIFY THESE WORDS
 */


package cn.orecraft.orepowered.mixin;

import cn.orecraft.orepowered.bridge.MinecraftServer_bridge;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.dedicated.PropertyManager;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(MinecraftServer.class)
public abstract class MinecraftServer_Mixin implements MinecraftServer_bridge {
    public abstract PropertyManager getPropertyManager();
}
