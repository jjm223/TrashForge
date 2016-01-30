package me.jjm_223.trash.command;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.InventoryBasic;

import java.util.ArrayList;
import java.util.List;

public class CommandTrash implements ICommand {
    @Override
    public String getCommandName() {
        return "trash";
    }

    @Override
    public String getCommandUsage(ICommandSender iCommandSender) {
        return "trash";
    }

    @Override
    public List getCommandAliases() {
        return new ArrayList();
    }

    @Override
    public void processCommand(ICommandSender iCommandSender, String[] strings) {
        EntityPlayerMP player = ((EntityPlayerMP) iCommandSender);
        player.displayGUIChest(new InventoryBasic("Trash", true, 9));
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender iCommandSender) {
        return iCommandSender instanceof EntityPlayerMP;
    }

    @Override
    public List addTabCompletionOptions(ICommandSender iCommandSender, String[] strings) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] strings, int i) {
        return false;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
