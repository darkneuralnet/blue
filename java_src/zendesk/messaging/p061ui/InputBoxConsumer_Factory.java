package zendesk.messaging.p061ui;

import zendesk.belvedere.C31096a;
import zendesk.belvedere.C31098b;
import zendesk.messaging.BelvedereMediaHolder;
import zendesk.messaging.BelvedereMediaResolverCallback;
import zendesk.messaging.EventFactory;
import zendesk.messaging.EventListener;
/* renamed from: zendesk.messaging.ui.InputBoxConsumer_Factory */
/* loaded from: classes8.dex */
public final class InputBoxConsumer_Factory implements InterfaceC48812sj1<InputBoxConsumer> {
    private final Y94<BelvedereMediaHolder> belvedereMediaHolderProvider;
    private final Y94<BelvedereMediaResolverCallback> belvedereMediaResolverCallbackProvider;
    private final Y94<C31096a> belvedereProvider;
    private final Y94<EventFactory> eventFactoryProvider;
    private final Y94<EventListener> eventListenerProvider;
    private final Y94<C31098b> imageStreamProvider;

    public InputBoxConsumer_Factory(Y94<EventListener> y94, Y94<EventFactory> y942, Y94<C31098b> y943, Y94<C31096a> y944, Y94<BelvedereMediaHolder> y945, Y94<BelvedereMediaResolverCallback> y946) {
        this.eventListenerProvider = y94;
        this.eventFactoryProvider = y942;
        this.imageStreamProvider = y943;
        this.belvedereProvider = y944;
        this.belvedereMediaHolderProvider = y945;
        this.belvedereMediaResolverCallbackProvider = y946;
    }

    public static InputBoxConsumer_Factory create(Y94<EventListener> y94, Y94<EventFactory> y942, Y94<C31098b> y943, Y94<C31096a> y944, Y94<BelvedereMediaHolder> y945, Y94<BelvedereMediaResolverCallback> y946) {
        return new InputBoxConsumer_Factory(y94, y942, y943, y944, y945, y946);
    }

    public static InputBoxConsumer newInstance(EventListener eventListener, EventFactory eventFactory, C31098b c31098b, C31096a c31096a, BelvedereMediaHolder belvedereMediaHolder, BelvedereMediaResolverCallback belvedereMediaResolverCallback) {
        return new InputBoxConsumer(eventListener, eventFactory, c31098b, c31096a, belvedereMediaHolder, belvedereMediaResolverCallback);
    }

    @Override // p000.Y94
    public InputBoxConsumer get() {
        return newInstance(this.eventListenerProvider.get(), this.eventFactoryProvider.get(), this.imageStreamProvider.get(), this.belvedereProvider.get(), this.belvedereMediaHolderProvider.get(), this.belvedereMediaResolverCallbackProvider.get());
    }
}
