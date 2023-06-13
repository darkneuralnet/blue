package zendesk.core;

import java.util.concurrent.Executor;
/* loaded from: classes8.dex */
public final class CoreModule_GetExecutorFactory implements InterfaceC48812sj1<Executor> {
    private final CoreModule module;

    public CoreModule_GetExecutorFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetExecutorFactory create(CoreModule coreModule) {
        return new CoreModule_GetExecutorFactory(coreModule);
    }

    public static Executor getExecutor(CoreModule coreModule) {
        return (Executor) C51679xZ3.m5002e(coreModule.getExecutor());
    }

    @Override // p000.Y94
    public Executor get() {
        return getExecutor(this.module);
    }
}
