/*
 * Created on 2019/7/15
 * Author: MaHua_A
 * Copyright 2019 by OreCraft Studio
 * DO NOT MODIFY THESE WORDS
 */


package cn.orecraft.orepowered.coremod;



import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.apache.logging.log4j.LogManager;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

import javax.annotation.Nullable;
import java.util.Map;



public class OreCoreMod implements IFMLLoadingPlugin {
    public OreCoreMod(){
        //Thanks for sponge powered
        LogManager.getLogger("OrePowered").info("The author is lonely;-(");
        MixinBootstrap.init();
        Mixins.addConfiguration("mixin/minxin.orepowered.mc.json");

    }

    @Override
    public String[] getASMTransformerClass() {
        return new String[0];
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Nullable
    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
