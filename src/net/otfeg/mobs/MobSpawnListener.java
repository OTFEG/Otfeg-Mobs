package net.otfeg.mobs;


import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class MobSpawnListener implements Listener{
	public MobSpawnListener(Mobs plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void onCreatureSpawnEvent(CreatureSpawnEvent event){
		World w2 = event.getEntity().getWorld();
		w2.setMonsterSpawnLimit(350);
		EntityType type = event.getEntity().getType();
		if(type == EntityType.CAVE_SPIDER ||
			type == EntityType.ZOMBIE ||
			type == EntityType.SKELETON ||
			type == EntityType.SPIDER ||
			type == EntityType.GIANT ||
			type == EntityType.SILVERFISH){
			Location loc = event.getEntity().getLocation();
			event.getEntity().remove();
			World w = loc.getWorld();
			w.spawnEntity(loc, EntityType.GIANT);
		}
	}
	
}
