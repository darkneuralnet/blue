package zendesk.messaging;

import android.content.Context;
/* loaded from: classes8.dex */
public final class MessagingModule_PicassoFactory implements InterfaceC48812sj1<C42732iT3> {
    private final Y94<Context> contextProvider;

    public MessagingModule_PicassoFactory(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static MessagingModule_PicassoFactory create(Y94<Context> y94) {
        return new MessagingModule_PicassoFactory(y94);
    }

    public static C42732iT3 picasso(Context context) {
        return (C42732iT3) C51679xZ3.m5002e(MessagingModule.picasso(context));
    }

    @Override // p000.Y94
    public C42732iT3 get() {
        return picasso(this.contextProvider.get());
    }
}
