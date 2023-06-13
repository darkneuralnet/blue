package zendesk.support;
/* loaded from: classes8.dex */
public final class SupportSdkModule_ConfigurationHelperFactory implements InterfaceC48812sj1<C32054Bx0> {
    private final SupportSdkModule module;

    public SupportSdkModule_ConfigurationHelperFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public static C32054Bx0 configurationHelper(SupportSdkModule supportSdkModule) {
        return (C32054Bx0) C51679xZ3.m5002e(supportSdkModule.configurationHelper());
    }

    public static SupportSdkModule_ConfigurationHelperFactory create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_ConfigurationHelperFactory(supportSdkModule);
    }

    @Override // p000.Y94
    public C32054Bx0 get() {
        return configurationHelper(this.module);
    }
}
