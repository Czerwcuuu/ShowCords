package showcords.showcords;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;
import showcords.showcords.Tasks.ShowCordsTask;

public final class ShowCords extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        BukkitTask ShowCordsTask = new ShowCordsTask(this).runTaskTimer(this,20L,20L);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
