package zendesk.messaging;

import android.os.Handler;
/* loaded from: classes8.dex */
public final class MessagingActivityModule_HandlerFactory implements InterfaceC48812sj1<Handler> {

    /* loaded from: classes8.dex */
    public static final class InstanceHolder {
        private static final MessagingActivityModule_HandlerFactory INSTANCE = new MessagingActivityModule_HandlerFactory();

        private InstanceHolder() {
        }
    }

    public static MessagingActivityModule_HandlerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Handler handler() {
        return (Handler) C51679xZ3.m5002e(MessagingActivityModule.handler());
    }

    @Override // p000.Y94
    public Handler get() {
        return handler();
    }
}
