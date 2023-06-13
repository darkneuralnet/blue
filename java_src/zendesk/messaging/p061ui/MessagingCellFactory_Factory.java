package zendesk.messaging.p061ui;

import zendesk.messaging.EventFactory;
import zendesk.messaging.EventListener;
import zendesk.messaging.components.DateProvider;
/* renamed from: zendesk.messaging.ui.MessagingCellFactory_Factory */
/* loaded from: classes8.dex */
public final class MessagingCellFactory_Factory implements InterfaceC48812sj1<MessagingCellFactory> {
    private final Y94<AvatarStateFactory> avatarStateFactoryProvider;
    private final Y94<AvatarStateRenderer> avatarStateRendererProvider;
    private final Y94<MessagingCellPropsFactory> cellPropsFactoryProvider;
    private final Y94<DateProvider> dateProvider;
    private final Y94<EventFactory> eventFactoryProvider;
    private final Y94<EventListener> eventListenerProvider;
    private final Y94<Boolean> multilineResponseOptionsEnabledProvider;

    public MessagingCellFactory_Factory(Y94<MessagingCellPropsFactory> y94, Y94<DateProvider> y942, Y94<EventListener> y943, Y94<EventFactory> y944, Y94<AvatarStateRenderer> y945, Y94<AvatarStateFactory> y946, Y94<Boolean> y947) {
        this.cellPropsFactoryProvider = y94;
        this.dateProvider = y942;
        this.eventListenerProvider = y943;
        this.eventFactoryProvider = y944;
        this.avatarStateRendererProvider = y945;
        this.avatarStateFactoryProvider = y946;
        this.multilineResponseOptionsEnabledProvider = y947;
    }

    public static MessagingCellFactory_Factory create(Y94<MessagingCellPropsFactory> y94, Y94<DateProvider> y942, Y94<EventListener> y943, Y94<EventFactory> y944, Y94<AvatarStateRenderer> y945, Y94<AvatarStateFactory> y946, Y94<Boolean> y947) {
        return new MessagingCellFactory_Factory(y94, y942, y943, y944, y945, y946, y947);
    }

    public static MessagingCellFactory newInstance(MessagingCellPropsFactory messagingCellPropsFactory, DateProvider dateProvider, EventListener eventListener, EventFactory eventFactory, Object obj, Object obj2, boolean z) {
        return new MessagingCellFactory(messagingCellPropsFactory, dateProvider, eventListener, eventFactory, (AvatarStateRenderer) obj, (AvatarStateFactory) obj2, z);
    }

    @Override // p000.Y94
    public MessagingCellFactory get() {
        return newInstance(this.cellPropsFactoryProvider.get(), this.dateProvider.get(), this.eventListenerProvider.get(), this.eventFactoryProvider.get(), this.avatarStateRendererProvider.get(), this.avatarStateFactoryProvider.get(), this.multilineResponseOptionsEnabledProvider.get().booleanValue());
    }
}
