package zendesk.messaging;

import android.content.Context;
import android.content.res.Resources;
/* loaded from: classes8.dex */
public final class MessagingModule_ResourcesFactory implements InterfaceC48812sj1<Resources> {
    private final Y94<Context> contextProvider;

    public MessagingModule_ResourcesFactory(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static MessagingModule_ResourcesFactory create(Y94<Context> y94) {
        return new MessagingModule_ResourcesFactory(y94);
    }

    public static Resources resources(Context context) {
        return (Resources) C51679xZ3.m5002e(MessagingModule.resources(context));
    }

    @Override // p000.Y94
    public Resources get() {
        return resources(this.contextProvider.get());
    }
}
