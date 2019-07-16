/*
 * Created on 2019/7/9
 * Author: MaHua_A
 * Copyright 2019 by OreCraft Studio
 * DO NOT MODIFY THESE WORDS
 */


package cn.orecraft.orepowered;

import cn.orecraft.orepowered.util.LogRedirectHandler;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bukkit.Bukkit;

import java.io.PrintStream;
import java.util.logging.Handler;
import java.util.logging.Level;

@SideOnly(Side.SERVER)
@Mod(modid = "orepowered", version = "1.12.2")
public class OrePowered {
    private static Logger logger = LogManager.getLogger("OrePowered");

    @Mod.EventHandler
    public void serverStarting(FMLServerAboutToStartEvent event) {

        logger.info("Loading OrePowered");
        //Redirect logging
        java.util.logging.Logger go = java.util.logging.Logger.getLogger("");
        go.setUseParentHandlers(false);

        for (Handler handler : go.getHandlers()) {
            go.removeHandler(handler);
        }
        go.addHandler(new LogRedirectHandler());
        final org.apache.logging.log4j.core.Logger logger = ((org.apache.logging.log4j.core.Logger) LogManager.getRootLogger());
        for (org.apache.logging.log4j.core.Appender appender : logger.getAppenders().values()) {
            if (appender instanceof org.apache.logging.log4j.core.appender.ConsoleAppender) {
                logger.removeAppender(appender);
            }
        }

        //Run test code.
        Bukkit.setServer(new OreServer(event.getServer()));
        //Bukkit.getServer().getViewDistance();
    }


}
