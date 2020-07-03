package showcords.showcords.Events;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.Plugin;

public class ShowCordsEvent implements Listener {

    public void PlayerMoveEvent(PlayerMoveEvent e){
        Bukkit.getServer().getScheduler().runTaskTimer((Plugin) this, new Runnable() {
            @Override
            public void run() {
                Bukkit.broadcastMessage("Cordinates: x:"+e.getPlayer().getLocation().getX()+" z:"+e.getPlayer().getLocation().getZ());
            }
        },0L,100L);

    }

}
