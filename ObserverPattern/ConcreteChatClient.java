package ObserverPatternTwo;

public class ConcreteChatClient implements ChatClient {
    private String username;

    public ConcreteChatClient(String username) {
        this.username = username;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(username + " received message: " + message);
    }
}

