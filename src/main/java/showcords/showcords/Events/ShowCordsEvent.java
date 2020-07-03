package showcords.showcords.Events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import showcords.showcords.ShowCords;

public class ShowCordsEvent implements Listener {

    static ShowCords plugin;

    public ShowCordsEvent(ShowCords plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void WhenPlayerMoves(PlayerMoveEvent e){
        timer(e.getPlayer());
    }

    public void timer(Player player){
        new BukkitRunnable(){
            @Override
            public void run() {
                Bukkit.broadcastMessage("Cordinates: x:"+player.getLocation().getX()+" z:"+player.getLocation().getZ());
            }
        }.runTaskTimer(plugin,100,100);
    }
}


