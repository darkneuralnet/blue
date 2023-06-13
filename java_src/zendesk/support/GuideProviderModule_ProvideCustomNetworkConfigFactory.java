package zendesk.support;
/* loaded from: classes8.dex */
public final class GuideProviderModule_ProvideCustomNetworkConfigFactory implements InterfaceC48812sj1<HelpCenterCachingNetworkConfig> {
    private final Y94<HelpCenterCachingInterceptor> helpCenterCachingInterceptorProvider;

    public GuideProviderModule_ProvideCustomNetworkConfigFactory(Y94<HelpCenterCachingInterceptor> y94) {
        this.helpCenterCachingInterceptorProvider = y94;
    }

    public static GuideProviderModule_ProvideCustomNetworkConfigFactory create(Y94<HelpCenterCachingInterceptor> y94) {
        return new GuideProviderModule_ProvideCustomNetworkConfigFactory(y94);
    }

    public static HelpCenterCachingNetworkConfig provideCustomNetworkConfig(Object obj) {
        return (HelpCenterCachingNetworkConfig) C51679xZ3.m5002e(GuideProviderModule.provideCustomNetworkConfig((HelpCenterCachingInterceptor) obj));
    }

    @Override // p000.Y94
    public HelpCenterCachingNetworkConfig get() {
        return provideCustomNetworkConfig(this.helpCenterCachingInterceptorProvider.get());
    }
}
