package zendesk.messaging;

import android.content.Context;
/* loaded from: classes8.dex */
public final class TimestampFactory_Factory implements InterfaceC48812sj1<TimestampFactory> {
    private final Y94<Context> contextProvider;

    public TimestampFactory_Factory(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static TimestampFactory_Factory create(Y94<Context> y94) {
        return new TimestampFactory_Factory(y94);
    }

    public static TimestampFactory newInstance(Context context) {
        return new TimestampFactory(context);
    }

    @Override // p000.Y94
    public TimestampFactory get() {
        return newInstance(this.contextProvider.get());
    }
}
