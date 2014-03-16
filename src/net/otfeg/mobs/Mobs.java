package net.otfeg.mobs;

import org.bukkit.plugin.java.JavaPlugin;

public class Mobs extends JavaPlugin{
	@Override
	public void onEnable() {
		new MobSpawnListener(this);
	}
}
