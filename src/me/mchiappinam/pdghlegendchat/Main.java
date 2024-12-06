package me.mchiappinam.pdghlegendchat;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHLegendChat] §2iniciando...");
		
		if (getServer().getPluginManager().getPlugin("Legendchat") == null) {
			getLogger().warning("ERRO: Legendchat nao encontrado!");
		}else{
			getServer().getConsoleSender().sendMessage("§3[PDGHLegendChat] §2Sucesso: Legendchat encontrado.");
			getServer().getConsoleSender().sendMessage("§3[PDGHLegendChat] §2registrando eventos...");
			getServer().getPluginManager().registerEvents(new Listeners(this), this);
		}
		getServer().getConsoleSender().sendMessage("§3[PDGHLegendChat] §2eventos registrados");
		getServer().getConsoleSender().sendMessage("§3[PDGHLegendChat] §2ativado - Developed by mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHLegendChat] §2Acesse: http://pdgh.com.br/");
		getServer().getConsoleSender().sendMessage("§3[PDGHLegendChat] §2Acesse: https://hostload.com.br/");
	}
	    
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHLegendChat] §2desativado - Developed by mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHLegendChat] §2Acesse: http://pdgh.com.br/");
		getServer().getConsoleSender().sendMessage("§3[PDGHLegendChat] §2Acesse: https://hostload.com.br/");
	}
}
