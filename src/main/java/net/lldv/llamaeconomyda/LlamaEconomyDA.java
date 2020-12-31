package net.lldv.llamaeconomyda;

import cn.nukkit.plugin.PluginBase;
import net.lldv.llamaeconomyda.components.language.Language;
import net.lldv.llamaeconomyda.listeners.EventListener;

public class LlamaEconomyDA extends PluginBase {

    @Override
    public void onEnable() {
        try {
            this.saveDefaultConfig();
            Language.init(this);
            this.loadPlugin();
            this.getLogger().info("§aLlamaEconomy-DA successfully started.");
        } catch (Exception e) {
            e.printStackTrace();
            this.getLogger().error("§4Failed to load LlamaEconomy-DA.");
        }
    }

    private void loadPlugin() {
        this.getServer().getPluginManager().registerEvents(new EventListener(this.getConfig().getString("webhook.url")), this);
    }

}
