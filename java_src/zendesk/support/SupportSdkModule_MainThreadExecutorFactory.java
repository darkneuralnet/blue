package zendesk.support;

import java.util.concurrent.Executor;
/* loaded from: classes8.dex */
public final class SupportSdkModule_MainThreadExecutorFactory implements InterfaceC48812sj1<Executor> {
    private final SupportSdkModule module;

    public SupportSdkModule_MainThreadExecutorFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public static SupportSdkModule_MainThreadExecutorFactory create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_MainThreadExecutorFactory(supportSdkModule);
    }

    public static Executor mainThreadExecutor(SupportSdkModule supportSdkModule) {
        return (Executor) C51679xZ3.m5002e(supportSdkModule.mainThreadExecutor());
    }

    @Override // p000.Y94
    public Executor get() {
        return mainThreadExecutor(this.module);
    }
}
