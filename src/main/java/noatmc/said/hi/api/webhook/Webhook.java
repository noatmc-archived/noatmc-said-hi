package noatmc.said.hi.api.webhook;

import org.json.JSONObject;
import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;

public
class Webhook {
    public static void sendMessage(String url) {
        try {
            JSONObject json = new JSONObject();
            json.put("content", "@everyone");
            HttpsURLConnection connection = (HttpsURLConnection) new URL(url).openConnection();
            connection.addRequestProperty("Content-Type", "application/json");
            connection.addRequestProperty("User-Agent", "awa");
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.getOutputStream().write(json.toString().getBytes());
            connection.getOutputStream().flush();
            connection.getOutputStream().close();
            connection.getInputStream().close();
            connection.disconnect();
        } catch (IOException ignored) {
        }
    }
}