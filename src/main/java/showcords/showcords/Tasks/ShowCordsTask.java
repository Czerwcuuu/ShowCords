package showcords.showcords.Tasks;

import org.bukkit.scheduler.BukkitRunnable;
import showcords.showcords.ShowCords;

public class ShowCordsTask extends BukkitRunnable {
    ShowCords plugin;

    public ShowCordsTask(ShowCords plugin){
        this.plugin = plugin;
    }

    public void run() {
        System.out.println("ZADANIE RUSZYLO");
    }
}
