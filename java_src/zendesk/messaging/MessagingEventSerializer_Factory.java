package zendesk.messaging;

import android.content.Context;
/* loaded from: classes8.dex */
public final class MessagingEventSerializer_Factory implements InterfaceC48812sj1<MessagingEventSerializer> {
    private final Y94<Context> contextProvider;
    private final Y94<TimestampFactory> timestampFactoryProvider;

    public MessagingEventSerializer_Factory(Y94<Context> y94, Y94<TimestampFactory> y942) {
        this.contextProvider = y94;
        this.timestampFactoryProvider = y942;
    }

    public static MessagingEventSerializer_Factory create(Y94<Context> y94, Y94<TimestampFactory> y942) {
        return new MessagingEventSerializer_Factory(y94, y942);
    }

    public static MessagingEventSerializer newInstance(Context context, Object obj) {
        return new MessagingEventSerializer(context, (TimestampFactory) obj);
    }

    @Override // p000.Y94
    public MessagingEventSerializer get() {
        return newInstance(this.contextProvider.get(), this.timestampFactoryProvider.get());
    }
}
