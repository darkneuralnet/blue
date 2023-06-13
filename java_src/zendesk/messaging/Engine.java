package zendesk.messaging;
/* loaded from: classes8.dex */
public interface Engine {

    /* loaded from: classes8.dex */
    public interface ConversationOnGoingCallback {
    }

    /* loaded from: classes8.dex */
    public static class TransferOptionDescription {
        private final String displayName;
        private final String engineId;

        public String getDisplayName() {
            return this.displayName;
        }

        public String getEngineId() {
            return this.engineId;
        }
    }

    /* loaded from: classes8.dex */
    public interface UpdateObserver {
    }

    String getId();

    void isConversationOngoing(ConversationOnGoingCallback conversationOnGoingCallback);

    void onEvent(Event event);

    boolean registerObserver(UpdateObserver updateObserver);

    void start(MessagingApi messagingApi);

    void stop();

    boolean unregisterObserver(UpdateObserver updateObserver);
}
