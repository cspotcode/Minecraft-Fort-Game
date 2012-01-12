package fun.MinecraftFortGame;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * TODO write some javadoc?
 * 
 */
public class MinecraftFortGame extends JavaPlugin {

    Logger log = Logger.getLogger("Minecraft");
    
    @Override
    public void onDisable() {
        log.info("Fort Game has been disabled.");
    }

    @Override
    public void onEnable() {
        log.info("Fort Game has been enabled.");
    }
    
}
