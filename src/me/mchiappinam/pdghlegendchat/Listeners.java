package me.mchiappinam.pdghlegendchat;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import br.com.devpaulo.legendchat.api.events.ChatMessageEvent;

public class Listeners implements Listener {

	private Main plugin;
	public Listeners(Main main) {
		plugin=main;
	}
	
	@EventHandler
	public void quandoMencionar(ChatMessageEvent e) {
		Player p = e.getSender();
		String msg = e.getMessage();
		String chat = e.getChannel().getName();
		for (Player ps : plugin.getServer().getOnlinePlayers()) {
			if (chat.equalsIgnoreCase("global")) {
				if (msg.toLowerCase().contains("@" + ps.getName().toLowerCase())) {
					if (ps == p) {
						return;
					}
					//ps.sendMessage("§a[Chat] O jogador "+p.getName()+" te mencionou no chat global.");
					//p.sendMessage("§a[Chat] Você mencionou o jogador "+ps.getName()+" no chat global.");
	            	p.playSound(p.getLocation(), Sound.ORB_PICKUP, 1.0F, 1.0F);
	            	ps.playSound(ps.getLocation(), Sound.ORB_PICKUP, 1.0F, 1.0F);
					e.setMessage(msg.toLowerCase().replace("@" + ps.getName().toLowerCase(),"§a@" + ps.getName() + e.getChannel().getColor()));
				}
			}
		}
	}
}
