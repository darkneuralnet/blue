package zendesk.support;
/* loaded from: classes8.dex */
public final class SupportModule_ProvidesRequestProviderFactory implements InterfaceC48812sj1<RequestProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesRequestProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesRequestProviderFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesRequestProviderFactory(supportModule);
    }

    public static RequestProvider providesRequestProvider(SupportModule supportModule) {
        return (RequestProvider) C51679xZ3.m5002e(supportModule.providesRequestProvider());
    }

    @Override // p000.Y94
    public RequestProvider get() {
        return providesRequestProvider(this.module);
    }
}
