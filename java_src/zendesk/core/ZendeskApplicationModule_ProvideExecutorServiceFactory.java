package zendesk.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes8.dex */
public final class ZendeskApplicationModule_ProvideExecutorServiceFactory implements InterfaceC48812sj1<ExecutorService> {
    private final Y94<ScheduledExecutorService> scheduledExecutorServiceProvider;

    public ZendeskApplicationModule_ProvideExecutorServiceFactory(Y94<ScheduledExecutorService> y94) {
        this.scheduledExecutorServiceProvider = y94;
    }

    public static ZendeskApplicationModule_ProvideExecutorServiceFactory create(Y94<ScheduledExecutorService> y94) {
        return new ZendeskApplicationModule_ProvideExecutorServiceFactory(y94);
    }

    public static ExecutorService provideExecutorService(ScheduledExecutorService scheduledExecutorService) {
        return (ExecutorService) C51679xZ3.m5002e(ZendeskApplicationModule.provideExecutorService(scheduledExecutorService));
    }

    @Override // p000.Y94
    public ExecutorService get() {
        return provideExecutorService(this.scheduledExecutorServiceProvider.get());
    }
}
