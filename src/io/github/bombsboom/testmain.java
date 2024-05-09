package io.github.bombsboom;

import org.bukkit.plugin.java.JavaPlugin;

public class testmain extends JavaPlugin{

	@Override
	public void onEnable() {
		getServer().getLogger().info("Loaded!");
		getServer().getLogger().info("git push");
	}
	
}
