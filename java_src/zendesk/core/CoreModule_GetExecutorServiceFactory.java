package zendesk.core;

import java.util.concurrent.ExecutorService;
/* loaded from: classes8.dex */
public final class CoreModule_GetExecutorServiceFactory implements InterfaceC48812sj1<ExecutorService> {
    private final CoreModule module;

    public CoreModule_GetExecutorServiceFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetExecutorServiceFactory create(CoreModule coreModule) {
        return new CoreModule_GetExecutorServiceFactory(coreModule);
    }

    public static ExecutorService getExecutorService(CoreModule coreModule) {
        return (ExecutorService) C51679xZ3.m5002e(coreModule.getExecutorService());
    }

    @Override // p000.Y94
    public ExecutorService get() {
        return getExecutorService(this.module);
    }
}
