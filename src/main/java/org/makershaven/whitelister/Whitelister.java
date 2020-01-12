package org.makershaven.whitelister;

import org.bukkit.OfflinePlayer;
import org.bukkit.plugin.java.JavaPlugin;

public class Whitelister extends JavaPlugin {

    @Override
    public void onEnable() {
        OfflinePlayer[] offlinePlayers = getServer().getOfflinePlayers();

        getServer().setWhitelist(true);
        getLogger().info("Whitelist enabled.");

        for (OfflinePlayer oP : offlinePlayers) {
            oP.setWhitelisted(true);
            getLogger().info(oP.getName()+ ", is now whitelisted.");
        }
    }

}
