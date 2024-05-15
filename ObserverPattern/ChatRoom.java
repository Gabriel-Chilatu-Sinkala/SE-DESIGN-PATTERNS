package ObserverPatternTwo;

interface ChatRoom {
    void registerObserver(ChatClient observer);
    void unregisterObserver(ChatClient observer);
    void notifyObservers(String message);
}

