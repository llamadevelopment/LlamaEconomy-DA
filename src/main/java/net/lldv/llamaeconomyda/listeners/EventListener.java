package net.lldv.llamaeconomyda.listeners;

import club.minnced.discord.webhook.WebhookClient;
import club.minnced.discord.webhook.send.WebhookEmbed;
import club.minnced.discord.webhook.send.WebhookEmbedBuilder;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import net.lldv.llamaeconomy.LlamaEconomy;
import net.lldv.llamaeconomy.components.event.*;
import net.lldv.llamaeconomyda.LlamaEconomyDA;
import net.lldv.llamaeconomyda.components.language.Language;

import java.awt.*;
import java.time.Instant;
import java.time.temporal.TemporalAccessor;

public class EventListener implements Listener {

    private final String url;

    public EventListener(LlamaEconomyDA instance) {
        this.url = instance.getConfig().getString("webhook.url");
    }

    @EventHandler
    public void on(AddMoneyEvent event) {
        try (WebhookClient client = WebhookClient.withUrl(this.url)) {
            TemporalAccessor accessor = Instant.ofEpochMilli(System.currentTimeMillis());
            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(new WebhookEmbed.EmbedTitle(Language.getNP("addmoney-title"), ""))
                    .setDescription(Language.getNP("addmoney-description", event.getPlayer(),
                            LlamaEconomy.getAPI().getMoneyFormat().format(event.getAmount()), LlamaEconomy.getAPI().getMonetaryUnit()))
                    .setColor(Color.decode(Language.getNP("addmoney-color")).getRGB())
                    .setTimestamp(accessor)
                    .build();
            client.send(embed).thenAccept(readonlyMessage -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @EventHandler
    public void on(PlayerAddMoneyEvent event) {
        try (WebhookClient client = WebhookClient.withUrl(this.url)) {
            TemporalAccessor accessor = Instant.ofEpochMilli(System.currentTimeMillis());
            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(new WebhookEmbed.EmbedTitle(Language.getNP("playeraddmoney-title"), ""))
                    .setDescription(Language.getNP("playeraddmoney-description", event.getTarget(),
                            event.getPlayer().getName(), LlamaEconomy.getAPI().getMoneyFormat().format(event.getAmount()), LlamaEconomy.getAPI().getMonetaryUnit()))
                    .setColor(Color.decode(Language.getNP("playeraddmoney-color")).getRGB())
                    .setTimestamp(accessor)
                    .build();
            client.send(embed).thenAccept(readonlyMessage -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @EventHandler
    public void on(PlayerPayMoneyEvent event) {
        try (WebhookClient client = WebhookClient.withUrl(this.url)) {
            TemporalAccessor accessor = Instant.ofEpochMilli(System.currentTimeMillis());
            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(new WebhookEmbed.EmbedTitle(Language.getNP("playerpay-title"), ""))
                    .setDescription(Language.getNP("playerpay-description", event.getTarget(),
                            event.getPlayer().getName(), LlamaEconomy.getAPI().getMoneyFormat().format(event.getAmount()), LlamaEconomy.getAPI().getMonetaryUnit()))
                    .setColor(Color.decode(Language.getNP("playerpay-color")).getRGB())
                    .setTimestamp(accessor)
                    .build();
            client.send(embed).thenAccept(readonlyMessage -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @EventHandler
    public void on(PlayerReduceMoneyEvent event) {
        try (WebhookClient client = WebhookClient.withUrl(this.url)) {
            TemporalAccessor accessor = Instant.ofEpochMilli(System.currentTimeMillis());
            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(new WebhookEmbed.EmbedTitle(Language.getNP("playerreduce-title"), ""))
                    .setDescription(Language.getNP("playerreduce-description", event.getTarget(),
                            event.getPlayer().getName(), LlamaEconomy.getAPI().getMoneyFormat().format(event.getAmount()), LlamaEconomy.getAPI().getMonetaryUnit()))
                    .setColor(Color.decode(Language.getNP("playerreduce-color")).getRGB())
                    .setTimestamp(accessor)
                    .build();
            client.send(embed).thenAccept(readonlyMessage -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @EventHandler
    public void on(PlayerSetMoneyEvent event) {
        try (WebhookClient client = WebhookClient.withUrl(this.url)) {
            TemporalAccessor accessor = Instant.ofEpochMilli(System.currentTimeMillis());
            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(new WebhookEmbed.EmbedTitle(Language.getNP("playerset-title"), ""))
                    .setDescription(Language.getNP("playerset-description", event.getTarget(),
                            event.getPlayer().getName(), LlamaEconomy.getAPI().getMoneyFormat().format(event.getAmount()), LlamaEconomy.getAPI().getMonetaryUnit()))
                    .setColor(Color.decode(Language.getNP("playerset-color")).getRGB())
                    .setTimestamp(accessor)
                    .build();
            client.send(embed).thenAccept(readonlyMessage -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @EventHandler
    public void on(ReduceMoneyEvent event) {
        try (WebhookClient client = WebhookClient.withUrl(this.url)) {
            TemporalAccessor accessor = Instant.ofEpochMilli(System.currentTimeMillis());
            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(new WebhookEmbed.EmbedTitle(Language.getNP("reducemoney-title"), ""))
                    .setDescription(Language.getNP("reducemoney-description", event.getPlayer(),
                            LlamaEconomy.getAPI().getMoneyFormat().format(event.getAmount()), LlamaEconomy.getAPI().getMonetaryUnit()))
                    .setColor(Color.decode(Language.getNP("reducemoney-color")).getRGB())
                    .setTimestamp(accessor)
                    .build();
            client.send(embed).thenAccept(readonlyMessage -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @EventHandler
    public void on(SetMoneyEvent event) {
        try (WebhookClient client = WebhookClient.withUrl(this.url)) {
            TemporalAccessor accessor = Instant.ofEpochMilli(System.currentTimeMillis());
            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(new WebhookEmbed.EmbedTitle(Language.getNP("setmoney-title"), ""))
                    .setDescription(Language.getNP("setmoney-description", event.getPlayer(),
                            LlamaEconomy.getAPI().getMoneyFormat().format(event.getAmount()), LlamaEconomy.getAPI().getMonetaryUnit()))
                    .setColor(Color.decode(Language.getNP("setmoney-color")).getRGB())
                    .setTimestamp(accessor)
                    .build();
            client.send(embed).thenAccept(readonlyMessage -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
