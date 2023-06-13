package zendesk.messaging;
/* loaded from: classes8.dex */
public final class BelvedereMediaResolverCallback_Factory implements InterfaceC48812sj1<BelvedereMediaResolverCallback> {
    private final Y94<EventFactory> eventFactoryProvider;
    private final Y94<EventListener> eventListenerProvider;

    public BelvedereMediaResolverCallback_Factory(Y94<EventListener> y94, Y94<EventFactory> y942) {
        this.eventListenerProvider = y94;
        this.eventFactoryProvider = y942;
    }

    public static BelvedereMediaResolverCallback_Factory create(Y94<EventListener> y94, Y94<EventFactory> y942) {
        return new BelvedereMediaResolverCallback_Factory(y94, y942);
    }

    public static BelvedereMediaResolverCallback newInstance(EventListener eventListener, EventFactory eventFactory) {
        return new BelvedereMediaResolverCallback(eventListener, eventFactory);
    }

    @Override // p000.Y94
    public BelvedereMediaResolverCallback get() {
        return newInstance(this.eventListenerProvider.get(), this.eventFactoryProvider.get());
    }
}
