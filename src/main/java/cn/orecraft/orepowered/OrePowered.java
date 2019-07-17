/*
 * Created on 2019/7/9
 * Author: MaHua_A
 * Copyright 2019 by OreCraft Studio
 * DO NOT MODIFY THESE WORDS
 */


package cn.orecraft.orepowered;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SideOnly(Side.SERVER)
@Mod(modid = "orepowered", version = "1.12.2")
public class OrePowered {
    private static Logger logger = LogManager.getLogger("OrePowered");

    @Mod.EventHandler
    public void serverStarting(FMLServerAboutToStartEvent event) {
        logger.info("Loading OrePowered");
        //Redirect logging


    }


}
