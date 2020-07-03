package showcords.showcords;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;
import showcords.showcords.Events.ShowCordsEvent;
import showcords.showcords.Tasks.ShowCordsTask;

public final class ShowCords extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new ShowCordsEvent(this),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
