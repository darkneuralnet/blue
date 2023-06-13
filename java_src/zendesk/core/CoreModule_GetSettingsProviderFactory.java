package zendesk.core;
/* loaded from: classes8.dex */
public final class CoreModule_GetSettingsProviderFactory implements InterfaceC48812sj1<SettingsProvider> {
    private final CoreModule module;

    public CoreModule_GetSettingsProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetSettingsProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetSettingsProviderFactory(coreModule);
    }

    public static SettingsProvider getSettingsProvider(CoreModule coreModule) {
        return (SettingsProvider) C51679xZ3.m5002e(coreModule.getSettingsProvider());
    }

    @Override // p000.Y94
    public SettingsProvider get() {
        return getSettingsProvider(this.module);
    }
}
