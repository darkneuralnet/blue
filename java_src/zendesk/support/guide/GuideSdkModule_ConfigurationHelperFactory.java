package zendesk.support.guide;
/* loaded from: classes8.dex */
public final class GuideSdkModule_ConfigurationHelperFactory implements InterfaceC48812sj1<C32054Bx0> {
    private final GuideSdkModule module;

    public GuideSdkModule_ConfigurationHelperFactory(GuideSdkModule guideSdkModule) {
        this.module = guideSdkModule;
    }

    public static C32054Bx0 configurationHelper(GuideSdkModule guideSdkModule) {
        return (C32054Bx0) C51679xZ3.m5002e(guideSdkModule.configurationHelper());
    }

    public static GuideSdkModule_ConfigurationHelperFactory create(GuideSdkModule guideSdkModule) {
        return new GuideSdkModule_ConfigurationHelperFactory(guideSdkModule);
    }

    @Override // p000.Y94
    public C32054Bx0 get() {
        return configurationHelper(this.module);
    }
}
