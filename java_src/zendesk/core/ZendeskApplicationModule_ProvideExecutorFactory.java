package zendesk.core;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes8.dex */
public final class ZendeskApplicationModule_ProvideExecutorFactory implements InterfaceC48812sj1<ScheduledExecutorService> {

    /* loaded from: classes8.dex */
    public static final class InstanceHolder {
        private static final ZendeskApplicationModule_ProvideExecutorFactory INSTANCE = new ZendeskApplicationModule_ProvideExecutorFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskApplicationModule_ProvideExecutorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ScheduledExecutorService provideExecutor() {
        return (ScheduledExecutorService) C51679xZ3.m5002e(ZendeskApplicationModule.provideExecutor());
    }

    @Override // p000.Y94
    public ScheduledExecutorService get() {
        return provideExecutor();
    }
}
