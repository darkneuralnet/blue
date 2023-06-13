package zendesk.support.guide;

import zendesk.core.ActionHandler;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_ActionHandlerRegistryFactory;
import zendesk.core.CoreModule_GetApplicationConfigurationFactory;
import zendesk.core.CoreModule_GetNetworkInfoProviderFactory;
import zendesk.support.GuideModule;
import zendesk.support.GuideModule_ProvidesArticleVoteStorageFactory;
import zendesk.support.GuideModule_ProvidesHelpCenterProviderFactory;
import zendesk.support.GuideModule_ProvidesOkHttpClientFactory;
import zendesk.support.GuideModule_ProvidesSettingsProviderFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class DaggerGuideSdkComponent implements GuideSdkComponent {
    private final CoreModule coreModule;
    private final GuideModule guideModule;
    private final DaggerGuideSdkComponent guideSdkComponent;
    private final GuideSdkModule guideSdkModule;
    private Y94<ActionHandler> viewArticleActionHandlerProvider;

    /* loaded from: classes8.dex */
    public static final class Builder {
        private CoreModule coreModule;
        private GuideModule guideModule;
        private GuideSdkModule guideSdkModule;

        public GuideSdkComponent build() {
            C51679xZ3.m5006a(this.coreModule, CoreModule.class);
            C51679xZ3.m5006a(this.guideModule, GuideModule.class);
            if (this.guideSdkModule == null) {
                this.guideSdkModule = new GuideSdkModule();
            }
            return new DaggerGuideSdkComponent(this.coreModule, this.guideModule, this.guideSdkModule);
        }

        public Builder coreModule(CoreModule coreModule) {
            this.coreModule = (CoreModule) C51679xZ3.m5005b(coreModule);
            return this;
        }

        public Builder guideModule(GuideModule guideModule) {
            this.guideModule = (GuideModule) C51679xZ3.m5005b(guideModule);
            return this;
        }

        public Builder guideSdkModule(GuideSdkModule guideSdkModule) {
            this.guideSdkModule = (GuideSdkModule) C51679xZ3.m5005b(guideSdkModule);
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(CoreModule coreModule, GuideModule guideModule, GuideSdkModule guideSdkModule) {
        this.viewArticleActionHandlerProvider = V51.m80429b(GuideSdkModule_ViewArticleActionHandlerFactory.create());
    }

    private GuideSdkDependencyProvider injectGuideSdkDependencyProvider(GuideSdkDependencyProvider guideSdkDependencyProvider) {
        GuideSdkDependencyProvider_MembersInjector.injectRegistry(guideSdkDependencyProvider, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.coreModule));
        GuideSdkDependencyProvider_MembersInjector.injectActionHandler(guideSdkDependencyProvider, this.viewArticleActionHandlerProvider.get());
        return guideSdkDependencyProvider;
    }

    private HelpCenterActivity injectHelpCenterActivity(HelpCenterActivity helpCenterActivity) {
        HelpCenterActivity_MembersInjector.injectHelpCenterProvider(helpCenterActivity, GuideModule_ProvidesHelpCenterProviderFactory.providesHelpCenterProvider(this.guideModule));
        HelpCenterActivity_MembersInjector.injectSettingsProvider(helpCenterActivity, GuideModule_ProvidesSettingsProviderFactory.providesSettingsProvider(this.guideModule));
        HelpCenterActivity_MembersInjector.injectNetworkInfoProvider(helpCenterActivity, CoreModule_GetNetworkInfoProviderFactory.getNetworkInfoProvider(this.coreModule));
        HelpCenterActivity_MembersInjector.injectActionHandlerRegistry(helpCenterActivity, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.coreModule));
        HelpCenterActivity_MembersInjector.injectConfigurationHelper(helpCenterActivity, GuideSdkModule_ConfigurationHelperFactory.configurationHelper(this.guideSdkModule));
        return helpCenterActivity;
    }

    private HelpCenterFragment injectHelpCenterFragment(HelpCenterFragment helpCenterFragment) {
        HelpCenterFragment_MembersInjector.injectHelpCenterProvider(helpCenterFragment, GuideModule_ProvidesHelpCenterProviderFactory.providesHelpCenterProvider(this.guideModule));
        HelpCenterFragment_MembersInjector.injectNetworkInfoProvider(helpCenterFragment, CoreModule_GetNetworkInfoProviderFactory.getNetworkInfoProvider(this.coreModule));
        return helpCenterFragment;
    }

    private ViewArticleActivity injectViewArticleActivity(ViewArticleActivity viewArticleActivity) {
        ViewArticleActivity_MembersInjector.injectOkHttpClient(viewArticleActivity, GuideModule_ProvidesOkHttpClientFactory.providesOkHttpClient(this.guideModule));
        ViewArticleActivity_MembersInjector.injectApplicationConfiguration(viewArticleActivity, CoreModule_GetApplicationConfigurationFactory.getApplicationConfiguration(this.coreModule));
        ViewArticleActivity_MembersInjector.injectHelpCenterProvider(viewArticleActivity, GuideModule_ProvidesHelpCenterProviderFactory.providesHelpCenterProvider(this.guideModule));
        ViewArticleActivity_MembersInjector.injectArticleVoteStorage(viewArticleActivity, GuideModule_ProvidesArticleVoteStorageFactory.providesArticleVoteStorage(this.guideModule));
        ViewArticleActivity_MembersInjector.injectNetworkInfoProvider(viewArticleActivity, CoreModule_GetNetworkInfoProviderFactory.getNetworkInfoProvider(this.coreModule));
        ViewArticleActivity_MembersInjector.injectSettingsProvider(viewArticleActivity, GuideModule_ProvidesSettingsProviderFactory.providesSettingsProvider(this.guideModule));
        ViewArticleActivity_MembersInjector.injectActionHandlerRegistry(viewArticleActivity, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.coreModule));
        ViewArticleActivity_MembersInjector.injectConfigurationHelper(viewArticleActivity, GuideSdkModule_ConfigurationHelperFactory.configurationHelper(this.guideSdkModule));
        return viewArticleActivity;
    }

    @Override // zendesk.support.guide.GuideSdkComponent
    public void inject(GuideSdkDependencyProvider guideSdkDependencyProvider) {
        injectGuideSdkDependencyProvider(guideSdkDependencyProvider);
    }

    private DaggerGuideSdkComponent(CoreModule coreModule, GuideModule guideModule, GuideSdkModule guideSdkModule) {
        this.guideSdkComponent = this;
        this.coreModule = coreModule;
        this.guideModule = guideModule;
        this.guideSdkModule = guideSdkModule;
        initialize(coreModule, guideModule, guideSdkModule);
    }

    @Override // zendesk.support.guide.GuideSdkComponent
    public void inject(ViewArticleActivity viewArticleActivity) {
        injectViewArticleActivity(viewArticleActivity);
    }

    @Override // zendesk.support.guide.GuideSdkComponent
    public void inject(HelpCenterActivity helpCenterActivity) {
        injectHelpCenterActivity(helpCenterActivity);
    }

    @Override // zendesk.support.guide.GuideSdkComponent
    public void inject(HelpCenterFragment helpCenterFragment) {
        injectHelpCenterFragment(helpCenterFragment);
    }
}
