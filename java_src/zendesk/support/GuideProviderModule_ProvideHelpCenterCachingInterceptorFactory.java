package zendesk.support;
/* loaded from: classes8.dex */
public final class GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory implements InterfaceC48812sj1<HelpCenterCachingInterceptor> {

    /* loaded from: classes8.dex */
    public static final class InstanceHolder {
        private static final GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory INSTANCE = new GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory();

        private InstanceHolder() {
        }
    }

    public static GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static HelpCenterCachingInterceptor provideHelpCenterCachingInterceptor() {
        return (HelpCenterCachingInterceptor) C51679xZ3.m5002e(GuideProviderModule.provideHelpCenterCachingInterceptor());
    }

    @Override // p000.Y94
    public HelpCenterCachingInterceptor get() {
        return provideHelpCenterCachingInterceptor();
    }
}
