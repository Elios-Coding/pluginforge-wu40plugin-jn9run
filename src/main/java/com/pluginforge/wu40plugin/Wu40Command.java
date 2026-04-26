package com.pluginforge.wu40plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Wu40Command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("§eUsage: /wu40");
            return true;
        }
        String arg = args[0].toLowerCase();
        switch (arg) {
            case "on":
                sender.sendMessage("§awu40 enabled.");
                return true;
            case "off":
                sender.sendMessage("§cwu40 disabled.");
                return true;
            default:
                try {
                    int value = Integer.parseInt(arg);
                    sender.sendMessage("§awu40 set to " + value + ".");
                    return true;
                } catch (NumberFormatException ex) {
                    sender.sendMessage("§eUsage: /wu40");
                    return true;
                }
        }
    }
}
