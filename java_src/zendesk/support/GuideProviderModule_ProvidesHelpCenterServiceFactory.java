package zendesk.support;

import zendesk.core.RestServiceProvider;
/* loaded from: classes8.dex */
public final class GuideProviderModule_ProvidesHelpCenterServiceFactory implements InterfaceC48812sj1<HelpCenterService> {
    private final Y94<HelpCenterCachingNetworkConfig> helpCenterCachingNetworkConfigProvider;
    private final Y94<RestServiceProvider> restServiceProvider;

    public GuideProviderModule_ProvidesHelpCenterServiceFactory(Y94<RestServiceProvider> y94, Y94<HelpCenterCachingNetworkConfig> y942) {
        this.restServiceProvider = y94;
        this.helpCenterCachingNetworkConfigProvider = y942;
    }

    public static GuideProviderModule_ProvidesHelpCenterServiceFactory create(Y94<RestServiceProvider> y94, Y94<HelpCenterCachingNetworkConfig> y942) {
        return new GuideProviderModule_ProvidesHelpCenterServiceFactory(y94, y942);
    }

    public static HelpCenterService providesHelpCenterService(RestServiceProvider restServiceProvider, Object obj) {
        return (HelpCenterService) C51679xZ3.m5002e(GuideProviderModule.providesHelpCenterService(restServiceProvider, (HelpCenterCachingNetworkConfig) obj));
    }

    @Override // p000.Y94
    public HelpCenterService get() {
        return providesHelpCenterService(this.restServiceProvider.get(), this.helpCenterCachingNetworkConfigProvider.get());
    }
}
