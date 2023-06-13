package zendesk.messaging;

import zendesk.messaging.components.DateProvider;
/* loaded from: classes8.dex */
public final class MessagingActivityModule_DateProviderFactory implements InterfaceC48812sj1<DateProvider> {

    /* loaded from: classes8.dex */
    public static final class InstanceHolder {
        private static final MessagingActivityModule_DateProviderFactory INSTANCE = new MessagingActivityModule_DateProviderFactory();

        private InstanceHolder() {
        }
    }

    public static MessagingActivityModule_DateProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DateProvider dateProvider() {
        return (DateProvider) C51679xZ3.m5002e(MessagingActivityModule.dateProvider());
    }

    @Override // p000.Y94
    public DateProvider get() {
        return dateProvider();
    }
}
