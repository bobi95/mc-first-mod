package com.alderoy.mcfirstmod.utility;

import com.alderoy.mcfirstmod.reference.ModReference;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;


public class LogHelper {

    public static boolean isLevel(Level level) {
        return FMLLog.getLogger().isEnabled(level);
    }

    public static void log(Level level, String message) {
        FMLLog.log(ModReference.MOD_NAME, level, message);
    }

    public static void log(Level level, String message, Object... args) {
        FMLLog.log(ModReference.MOD_NAME, level, message, args);
    }

    public static void log(Level level, String message, Throwable throwable) {
        FMLLog.log(ModReference.MOD_NAME, level, message, throwable);
    }

    public static void log(Level level, String message, Throwable throwable, Object... data) {
        FMLLog.log(ModReference.MOD_NAME, level, message, throwable, data);
    }

    public static void fatal(String message) {
        log(Level.FATAL, message);
    }

    public static void fatal(String message, Object... args) {
        log(Level.FATAL, message, args);
    }

    public static void fatal(String message, Throwable throwable) {
        log(Level.FATAL, message, throwable);
    }

    public static void fatal(String message, Throwable throwable, Object... data) {
        log(Level.FATAL, message, throwable, data);
    }

    public static void error(String message) {
        log(Level.ERROR, message);
    }

    public static void error(String message, Object... args) {
        log(Level.ERROR, message, args);
    }

    public static void error(String message, Throwable throwable) {
        log(Level.ERROR, message, throwable);
    }

    public static void error(String message, Throwable throwable, Object... data) {
        log(Level.ERROR, message, throwable, data);
    }

    public static void warn(String message) {
        log(Level.WARN, message);
    }

    public static void warn(String message, Object... args) {
        log(Level.WARN, message, args);
    }

    public static void warn(String message, Throwable throwable) {
        log(Level.WARN, message, throwable);
    }

    public static void warn(String message, Throwable throwable, Object... data) {
        log(Level.WARN, message, throwable, data);
    }

    public static void info(String message) {
        log(Level.INFO, message);
    }

    public static void info(String message, Object... args) {
        log(Level.INFO, message, args);
    }

    public static void info(String message, Throwable throwable) {
        log(Level.INFO, message, throwable);
    }

    public static void info(String message, Throwable throwable, Object... data) {
        log(Level.INFO, message, throwable, data);
    }

    public static void debug(String message) {
        log(Level.DEBUG, message);
    }

    public static void debug(String message, Object... args) {
        log(Level.DEBUG, message, args);
    }

    public static void debug(String message, Throwable throwable) {
        log(Level.DEBUG, message, throwable);
    }

    public static void debug(String message, Throwable throwable, Object... data) {
        log(Level.DEBUG, message, throwable, data);
    }

    public static void trace(String message) {
        log(Level.TRACE, message);
    }

    public static void trace(String message, Object... args) {
        log(Level.TRACE, message, args);
    }

    public static void trace(String message, Throwable throwable) {
        log(Level.TRACE, message, throwable);
    }

    public static void trace(String message, Throwable throwable, Object... data) {
        log(Level.TRACE, message, throwable, data);
    }
}
