package zendesk.support;
/* loaded from: classes8.dex */
public final class SupportModule_ProvidesSettingsProviderFactory implements InterfaceC48812sj1<SupportSettingsProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesSettingsProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesSettingsProviderFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesSettingsProviderFactory(supportModule);
    }

    public static SupportSettingsProvider providesSettingsProvider(SupportModule supportModule) {
        return (SupportSettingsProvider) C51679xZ3.m5002e(supportModule.providesSettingsProvider());
    }

    @Override // p000.Y94
    public SupportSettingsProvider get() {
        return providesSettingsProvider(this.module);
    }
}
