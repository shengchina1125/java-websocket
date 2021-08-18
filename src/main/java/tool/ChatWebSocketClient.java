package tool;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;

/**
 * @PackageName：tool
 * @ClassName：ChatWebSocketClient
 * @Description：//TODO
 * @Author：xulp
 * @Date：2021/8/17 20:10
 */
public class ChatWebSocketClient extends WebSocketClient {
    public ChatWebSocketClient(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {

    }

    @Override
    public void onMessage(String message) {

    }

    @Override
    public void onClose(int code, String reason, boolean remote) {

    }

    @Override
    public void onError(Exception ex) {

    }
}
