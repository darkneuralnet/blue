package zendesk.support;
/* loaded from: classes8.dex */
public final class SupportSdkModule_ProvidesFactory implements InterfaceC48812sj1<C46153oE1> {
    private final SupportSdkModule module;

    public SupportSdkModule_ProvidesFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public static SupportSdkModule_ProvidesFactory create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_ProvidesFactory(supportSdkModule);
    }

    public static C46153oE1 provides(SupportSdkModule supportSdkModule) {
        return (C46153oE1) C51679xZ3.m5002e(supportSdkModule.provides());
    }

    @Override // p000.Y94
    public C46153oE1 get() {
        return provides(this.module);
    }
}
