package noatmc.said.hi;

import noatmc.said.hi.impl.listener.MainListener;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Cope {
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static void main(String[] args) throws LoginException, InterruptedException {
        System.out.println(BLUE + "                k)                 f)FFF                                         \n" +
                "                k)                f)                                             \n" +
                "n)NNNN  u)   UU k)  KK e)EEEEE    f)FFF  u)   UU n)NNNN   g)GGG  u)   UU  s)SSSS \n" +
                "n)   NN u)   UU k)KK   e)EEEE     f)     u)   UU n)   NN g)   GG u)   UU s)SSSS  \n" +
                "n)   NN u)   UU k) KK  e)         f)     u)   UU n)   NN g)   GG u)   UU      s) \n" +
                "n)   NN  u)UUU  k)  KK  e)EEEE    f)      u)UUU  n)   NN  g)GGGG  u)UUU  s)SSSS  \n" +
                "                                                              GG                 \n" +
                "                                                         g)GGGG                  ");
         JDABuilder.createDefault("token")
                 .addEventListeners(new MainListener())
                .setActivity(Activity.watching(":heart:"))
                .build().awaitReady();
    }

}
