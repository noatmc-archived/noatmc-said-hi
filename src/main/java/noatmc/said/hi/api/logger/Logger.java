package noatmc.said.hi.api.logger;

public class Logger {
    public static void log(Type type, String string) {
        System.out.println("[" + type.name() + "]: " + string);
    }

    public static enum Type {
        DELETE,
        CHANGE,
        SEVERE,
        ERROR
    }
}
