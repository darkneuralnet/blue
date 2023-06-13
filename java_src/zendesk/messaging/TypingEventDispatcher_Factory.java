package zendesk.messaging;

import android.os.Handler;
/* loaded from: classes8.dex */
public final class TypingEventDispatcher_Factory implements InterfaceC48812sj1<TypingEventDispatcher> {
    private final Y94<EventFactory> eventFactoryProvider;
    private final Y94<EventListener> eventListenerProvider;
    private final Y94<Handler> handlerProvider;

    public TypingEventDispatcher_Factory(Y94<EventListener> y94, Y94<Handler> y942, Y94<EventFactory> y943) {
        this.eventListenerProvider = y94;
        this.handlerProvider = y942;
        this.eventFactoryProvider = y943;
    }

    public static TypingEventDispatcher_Factory create(Y94<EventListener> y94, Y94<Handler> y942, Y94<EventFactory> y943) {
        return new TypingEventDispatcher_Factory(y94, y942, y943);
    }

    public static TypingEventDispatcher newInstance(EventListener eventListener, Handler handler, EventFactory eventFactory) {
        return new TypingEventDispatcher(eventListener, handler, eventFactory);
    }

    @Override // p000.Y94
    public TypingEventDispatcher get() {
        return newInstance(this.eventListenerProvider.get(), this.handlerProvider.get(), this.eventFactoryProvider.get());
    }
}
