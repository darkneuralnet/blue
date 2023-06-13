package zendesk.messaging;
/* loaded from: classes8.dex */
public final class MessagingConversationLog_Factory implements InterfaceC48812sj1<MessagingConversationLog> {
    private final Y94<MessagingEventSerializer> messagingEventSerializerProvider;

    public MessagingConversationLog_Factory(Y94<MessagingEventSerializer> y94) {
        this.messagingEventSerializerProvider = y94;
    }

    public static MessagingConversationLog_Factory create(Y94<MessagingEventSerializer> y94) {
        return new MessagingConversationLog_Factory(y94);
    }

    public static MessagingConversationLog newInstance(Object obj) {
        return new MessagingConversationLog((MessagingEventSerializer) obj);
    }

    @Override // p000.Y94
    public MessagingConversationLog get() {
        return newInstance(this.messagingEventSerializerProvider.get());
    }
}
