package showcords.showcords;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;

public final class ShowCords extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        runnable();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void runnable(){
        new BukkitRunnable(){

            @Override
            public void run() {

                List<Player> players = getServer().getWorld("world").getPlayers();
                for(Player p : players){
                    //Bukkit.broadcastMessage("Player:"+p.getName());
                    if(p.getName().equals("Stylowy")){
                        Bukkit.broadcastMessage("Cordinates: x:"+p.getLocation().getX()+" z:"+p.getLocation().getZ());
                    }
                }
            }
        }.runTaskTimer(this,0,3000L);
    }
}
