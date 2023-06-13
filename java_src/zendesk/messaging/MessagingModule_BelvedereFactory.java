package zendesk.messaging;

import android.content.Context;
import zendesk.belvedere.C31096a;
/* loaded from: classes8.dex */
public final class MessagingModule_BelvedereFactory implements InterfaceC48812sj1<C31096a> {
    private final Y94<Context> contextProvider;

    public MessagingModule_BelvedereFactory(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static C31096a belvedere(Context context) {
        return (C31096a) C51679xZ3.m5002e(MessagingModule.belvedere(context));
    }

    public static MessagingModule_BelvedereFactory create(Y94<Context> y94) {
        return new MessagingModule_BelvedereFactory(y94);
    }

    @Override // p000.Y94
    public C31096a get() {
        return belvedere(this.contextProvider.get());
    }
}
