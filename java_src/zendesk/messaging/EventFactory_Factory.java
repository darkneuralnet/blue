package zendesk.messaging;

import zendesk.messaging.components.DateProvider;
/* loaded from: classes8.dex */
public final class EventFactory_Factory implements InterfaceC48812sj1<EventFactory> {
    private final Y94<DateProvider> dateProvider;

    public EventFactory_Factory(Y94<DateProvider> y94) {
        this.dateProvider = y94;
    }

    public static EventFactory_Factory create(Y94<DateProvider> y94) {
        return new EventFactory_Factory(y94);
    }

    public static EventFactory newInstance(DateProvider dateProvider) {
        return new EventFactory(dateProvider);
    }

    @Override // p000.Y94
    public EventFactory get() {
        return newInstance(this.dateProvider.get());
    }
}
