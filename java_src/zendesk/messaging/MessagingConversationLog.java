package zendesk.messaging;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes8.dex */
class MessagingConversationLog {
    private static final Comparator<MessagingEvent> TIMESTAMP_COMPARATOR = new Comparator<MessagingEvent>() { // from class: zendesk.messaging.MessagingConversationLog.1
        @Override // java.util.Comparator
        public int compare(MessagingEvent messagingEvent, MessagingEvent messagingEvent2) {
            return messagingEvent.getTimestamp().compareTo(messagingEvent2.getTimestamp());
        }
    };
    private final MessagingEventSerializer messagingEventSerializer;
    private final List<MessagingItem> messagingItems = new ArrayList();
    private final List<Event> events = new ArrayList();

    public MessagingConversationLog(MessagingEventSerializer messagingEventSerializer) {
        this.messagingEventSerializer = messagingEventSerializer;
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }

    public void setMessagingItems(List<MessagingItem> list) {
        this.messagingItems.clear();
        if (C43505jm0.m29948i(list)) {
            this.messagingItems.addAll(list);
        }
    }
}
