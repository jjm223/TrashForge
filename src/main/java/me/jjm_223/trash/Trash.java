package me.jjm_223.trash;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import me.jjm_223.trash.command.CommandTrash;
import net.minecraft.inventory.InventoryBasic;

@Mod(modid = Trash.MODID, version = Trash.VERSION)
@NetworkMod()
public class Trash
{
    public static final String MODID = "Trash";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void serverLoad(FMLServerStartingEvent e) {
        e.registerServerCommand(new CommandTrash());
    }
}
