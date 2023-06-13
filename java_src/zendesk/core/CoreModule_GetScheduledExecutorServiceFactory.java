package zendesk.core;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes8.dex */
public final class CoreModule_GetScheduledExecutorServiceFactory implements InterfaceC48812sj1<ScheduledExecutorService> {
    private final CoreModule module;

    public CoreModule_GetScheduledExecutorServiceFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetScheduledExecutorServiceFactory create(CoreModule coreModule) {
        return new CoreModule_GetScheduledExecutorServiceFactory(coreModule);
    }

    public static ScheduledExecutorService getScheduledExecutorService(CoreModule coreModule) {
        return (ScheduledExecutorService) C51679xZ3.m5002e(coreModule.getScheduledExecutorService());
    }

    @Override // p000.Y94
    public ScheduledExecutorService get() {
        return getScheduledExecutorService(this.module);
    }
}
