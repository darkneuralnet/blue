package zendesk.support;
/* loaded from: classes8.dex */
public final class GuideProviderModule_ProvideHelpCenterSessionCacheFactory implements InterfaceC48812sj1<HelpCenterSessionCache> {

    /* loaded from: classes8.dex */
    public static final class InstanceHolder {
        private static final GuideProviderModule_ProvideHelpCenterSessionCacheFactory INSTANCE = new GuideProviderModule_ProvideHelpCenterSessionCacheFactory();

        private InstanceHolder() {
        }
    }

    public static GuideProviderModule_ProvideHelpCenterSessionCacheFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static HelpCenterSessionCache provideHelpCenterSessionCache() {
        return (HelpCenterSessionCache) C51679xZ3.m5002e(GuideProviderModule.provideHelpCenterSessionCache());
    }

    @Override // p000.Y94
    public HelpCenterSessionCache get() {
        return provideHelpCenterSessionCache();
    }
}
