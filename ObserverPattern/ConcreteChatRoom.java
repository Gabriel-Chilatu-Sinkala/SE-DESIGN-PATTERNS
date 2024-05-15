package ObserverPatternTwo;
import java.util.ArrayList;
import java.util.List;

public class ConcreteChatRoom implements ChatRoom {
    private List<ChatClient> observers = new ArrayList<>();

    @Override
    public void registerObserver(ChatClient observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(ChatClient observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (ChatClient observer : observers) {
            observer.receiveMessage(message);
        }
    }

    public void sendMessage(String message) {
        notifyObservers(message);
    }
}

