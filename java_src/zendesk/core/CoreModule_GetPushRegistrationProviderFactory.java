package zendesk.core;
/* loaded from: classes8.dex */
public final class CoreModule_GetPushRegistrationProviderFactory implements InterfaceC48812sj1<PushRegistrationProvider> {
    private final CoreModule module;

    public CoreModule_GetPushRegistrationProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetPushRegistrationProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetPushRegistrationProviderFactory(coreModule);
    }

    public static PushRegistrationProvider getPushRegistrationProvider(CoreModule coreModule) {
        return (PushRegistrationProvider) C51679xZ3.m5002e(coreModule.getPushRegistrationProvider());
    }

    @Override // p000.Y94
    public PushRegistrationProvider get() {
        return getPushRegistrationProvider(this.module);
    }
}
