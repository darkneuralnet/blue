.class final Lzendesk/support/guide/DaggerGuideSdkComponent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/support/guide/GuideSdkComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/support/guide/DaggerGuideSdkComponent$Builder;
    }
.end annotation


# instance fields
.field private final coreModule:Lzendesk/core/CoreModule;

.field private final guideModule:Lzendesk/support/GuideModule;

.field private final guideSdkComponent:Lzendesk/support/guide/DaggerGuideSdkComponent;

.field private final guideSdkModule:Lzendesk/support/guide/GuideSdkModule;

.field private viewArticleActionHandlerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/ActionHandler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lzendesk/core/CoreModule;Lzendesk/support/GuideModule;Lzendesk/support/guide/GuideSdkModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->guideSdkComponent:Lzendesk/support/guide/DaggerGuideSdkComponent;

    iput-object p1, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->coreModule:Lzendesk/core/CoreModule;

    iput-object p2, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->guideModule:Lzendesk/support/GuideModule;

    iput-object p3, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->guideSdkModule:Lzendesk/support/guide/GuideSdkModule;

    invoke-direct {p0, p1, p2, p3}, Lzendesk/support/guide/DaggerGuideSdkComponent;->initialize(Lzendesk/core/CoreModule;Lzendesk/support/GuideModule;Lzendesk/support/guide/GuideSdkModule;)V

    return-void
.end method

.method public synthetic constructor <init>(Lzendesk/core/CoreModule;Lzendesk/support/GuideModule;Lzendesk/support/guide/GuideSdkModule;Lzendesk/support/guide/DaggerGuideSdkComponent$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lzendesk/support/guide/DaggerGuideSdkComponent;-><init>(Lzendesk/core/CoreModule;Lzendesk/support/GuideModule;Lzendesk/support/guide/GuideSdkModule;)V

    return-void
.end method

.method public static builder()Lzendesk/support/guide/DaggerGuideSdkComponent$Builder;
    .locals 2

    new-instance v0, Lzendesk/support/guide/DaggerGuideSdkComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzendesk/support/guide/DaggerGuideSdkComponent$Builder;-><init>(Lzendesk/support/guide/DaggerGuideSdkComponent$1;)V

    return-object v0
.end method

.method private initialize(Lzendesk/core/CoreModule;Lzendesk/support/GuideModule;Lzendesk/support/guide/GuideSdkModule;)V
    .locals 0

    invoke-static {}, Lzendesk/support/guide/GuideSdkModule_ViewArticleActionHandlerFactory;->create()Lzendesk/support/guide/GuideSdkModule_ViewArticleActionHandlerFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->viewArticleActionHandlerProvider:LY94;

    return-void
.end method

.method private injectGuideSdkDependencyProvider(Lzendesk/support/guide/GuideSdkDependencyProvider;)Lzendesk/support/guide/GuideSdkDependencyProvider;
    .locals 1

    iget-object v0, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->coreModule:Lzendesk/core/CoreModule;

    invoke-static {v0}, Lzendesk/core/CoreModule_ActionHandlerRegistryFactory;->actionHandlerRegistry(Lzendesk/core/CoreModule;)Lzendesk/core/ActionHandlerRegistry;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/guide/GuideSdkDependencyProvider_MembersInjector;->injectRegistry(Ljava/lang/Object;Lzendesk/core/ActionHandlerRegistry;)V

    iget-object v0, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->viewArticleActionHandlerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/core/ActionHandler;

    invoke-static {p1, v0}, Lzendesk/support/guide/GuideSdkDependencyProvider_MembersInjector;->injectActionHandler(Ljava/lang/Object;Lzendesk/core/ActionHandler;)V

    return-object p1
.end method

.method private injectHelpCenterActivity(Lzendesk/support/guide/HelpCenterActivity;)Lzendesk/support/guide/HelpCenterActivity;
    .locals 1

    iget-object v0, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->guideModule:Lzendesk/support/GuideModule;

    invoke-static {v0}, Lzendesk/support/GuideModule_ProvidesHelpCenterProviderFactory;->providesHelpCenterProvider(Lzendesk/support/GuideModule;)Lzendesk/support/HelpCenterProvider;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->injectHelpCenterProvider(Lzendesk/support/guide/HelpCenterActivity;Lzendesk/support/HelpCenterProvider;)V

    iget-object v0, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->guideModule:Lzendesk/support/GuideModule;

    invoke-static {v0}, Lzendesk/support/GuideModule_ProvidesSettingsProviderFactory;->providesSettingsProvider(Lzendesk/support/GuideModule;)Lzendesk/support/HelpCenterSettingsProvider;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->injectSettingsProvider(Lzendesk/support/guide/HelpCenterActivity;Lzendesk/support/HelpCenterSettingsProvider;)V

    iget-object v0, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->coreModule:Lzendesk/core/CoreModule;

    invoke-static {v0}, Lzendesk/core/CoreModule_GetNetworkInfoProviderFactory;->getNetworkInfoProvider(Lzendesk/core/CoreModule;)Lzendesk/core/NetworkInfoProvider;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->injectNetworkInfoProvider(Lzendesk/support/guide/HelpCenterActivity;Lzendesk/core/NetworkInfoProvider;)V

    iget-object v0, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->coreModule:Lzendesk/core/CoreModule;

    invoke-static {v0}, Lzendesk/core/CoreModule_ActionHandlerRegistryFactory;->actionHandlerRegistry(Lzendesk/core/CoreModule;)Lzendesk/core/ActionHandlerRegistry;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->injectActionHandlerRegistry(Lzendesk/support/guide/HelpCenterActivity;Lzendesk/core/ActionHandlerRegistry;)V

    iget-object v0, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->guideSdkModule:Lzendesk/support/guide/GuideSdkModule;

    invoke-static {v0}, Lzendesk/support/guide/GuideSdkModule_ConfigurationHelperFactory;->configurationHelper(Lzendesk/support/guide/GuideSdkModule;)LBx0;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->injectConfigurationHelper(Lzendesk/support/guide/HelpCenterActivity;LBx0;)V

    return-object p1
.end method

.method private injectHelpCenterFragment(Lzendesk/support/guide/HelpCenterFragment;)Lzendesk/support/guide/HelpCenterFragment;
    .locals 1

    iget-object v0, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->guideModule:Lzendesk/support/GuideModule;

    invoke-static {v0}, Lzendesk/support/GuideModule_ProvidesHelpCenterProviderFactory;->providesHelpCenterProvider(Lzendesk/support/GuideModule;)Lzendesk/support/HelpCenterProvider;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/guide/HelpCenterFragment_MembersInjector;->injectHelpCenterProvider(Lzendesk/support/guide/HelpCenterFragment;Lzendesk/support/HelpCenterProvider;)V

    iget-object v0, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->coreModule:Lzendesk/core/CoreModule;

    invoke-static {v0}, Lzendesk/core/CoreModule_GetNetworkInfoProviderFactory;->getNetworkInfoProvider(Lzendesk/core/CoreModule;)Lzendesk/core/NetworkInfoProvider;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/guide/HelpCenterFragment_MembersInjector;->injectNetworkInfoProvider(Lzendesk/support/guide/HelpCenterFragment;Lzendesk/core/NetworkInfoProvider;)V

    return-object p1
.end method

.method private injectViewArticleActivity(Lzendesk/support/guide/ViewArticleActivity;)Lzendesk/support/guide/ViewArticleActivity;
    .locals 1

    iget-object v0, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->guideModule:Lzendesk/support/GuideModule;

    invoke-static {v0}, Lzendesk/support/GuideModule_ProvidesOkHttpClientFactory;->providesOkHttpClient(Lzendesk/support/GuideModule;)Lokhttp3/OkHttpClient;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/guide/ViewArticleActivity_MembersInjector;->injectOkHttpClient(Lzendesk/support/guide/ViewArticleActivity;Lokhttp3/OkHttpClient;)V

    iget-object v0, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->coreModule:Lzendesk/core/CoreModule;

    invoke-static {v0}, Lzendesk/core/CoreModule_GetApplicationConfigurationFactory;->getApplicationConfiguration(Lzendesk/core/CoreModule;)Lzendesk/core/ApplicationConfiguration;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/guide/ViewArticleActivity_MembersInjector;->injectApplicationConfiguration(Lzendesk/support/guide/ViewArticleActivity;Lzendesk/core/ApplicationConfiguration;)V

    iget-object v0, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->guideModule:Lzendesk/support/GuideModule;

    invoke-static {v0}, Lzendesk/support/GuideModule_ProvidesHelpCenterProviderFactory;->providesHelpCenterProvider(Lzendesk/support/GuideModule;)Lzendesk/support/HelpCenterProvider;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/guide/ViewArticleActivity_MembersInjector;->injectHelpCenterProvider(Lzendesk/support/guide/ViewArticleActivity;Lzendesk/support/HelpCenterProvider;)V

    iget-object v0, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->guideModule:Lzendesk/support/GuideModule;

    invoke-static {v0}, Lzendesk/support/GuideModule_ProvidesArticleVoteStorageFactory;->providesArticleVoteStorage(Lzendesk/support/GuideModule;)Lzendesk/support/ArticleVoteStorage;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/guide/ViewArticleActivity_MembersInjector;->injectArticleVoteStorage(Lzendesk/support/guide/ViewArticleActivity;Lzendesk/support/ArticleVoteStorage;)V

    iget-object v0, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->coreModule:Lzendesk/core/CoreModule;

    invoke-static {v0}, Lzendesk/core/CoreModule_GetNetworkInfoProviderFactory;->getNetworkInfoProvider(Lzendesk/core/CoreModule;)Lzendesk/core/NetworkInfoProvider;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/guide/ViewArticleActivity_MembersInjector;->injectNetworkInfoProvider(Lzendesk/support/guide/ViewArticleActivity;Lzendesk/core/NetworkInfoProvider;)V

    iget-object v0, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->guideModule:Lzendesk/support/GuideModule;

    invoke-static {v0}, Lzendesk/support/GuideModule_ProvidesSettingsProviderFactory;->providesSettingsProvider(Lzendesk/support/GuideModule;)Lzendesk/support/HelpCenterSettingsProvider;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/guide/ViewArticleActivity_MembersInjector;->injectSettingsProvider(Lzendesk/support/guide/ViewArticleActivity;Lzendesk/support/HelpCenterSettingsProvider;)V

    iget-object v0, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->coreModule:Lzendesk/core/CoreModule;

    invoke-static {v0}, Lzendesk/core/CoreModule_ActionHandlerRegistryFactory;->actionHandlerRegistry(Lzendesk/core/CoreModule;)Lzendesk/core/ActionHandlerRegistry;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/guide/ViewArticleActivity_MembersInjector;->injectActionHandlerRegistry(Lzendesk/support/guide/ViewArticleActivity;Lzendesk/core/ActionHandlerRegistry;)V

    iget-object v0, p0, Lzendesk/support/guide/DaggerGuideSdkComponent;->guideSdkModule:Lzendesk/support/guide/GuideSdkModule;

    invoke-static {v0}, Lzendesk/support/guide/GuideSdkModule_ConfigurationHelperFactory;->configurationHelper(Lzendesk/support/guide/GuideSdkModule;)LBx0;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/guide/ViewArticleActivity_MembersInjector;->injectConfigurationHelper(Lzendesk/support/guide/ViewArticleActivity;LBx0;)V

    return-object p1
.end method


# virtual methods
.method public inject(Lzendesk/support/guide/GuideSdkDependencyProvider;)V
    .locals 0

    invoke-direct {p0, p1}, Lzendesk/support/guide/DaggerGuideSdkComponent;->injectGuideSdkDependencyProvider(Lzendesk/support/guide/GuideSdkDependencyProvider;)Lzendesk/support/guide/GuideSdkDependencyProvider;

    return-void
.end method

.method public inject(Lzendesk/support/guide/HelpCenterActivity;)V
    .locals 0

    invoke-direct {p0, p1}, Lzendesk/support/guide/DaggerGuideSdkComponent;->injectHelpCenterActivity(Lzendesk/support/guide/HelpCenterActivity;)Lzendesk/support/guide/HelpCenterActivity;

    return-void
.end method

.method public inject(Lzendesk/support/guide/HelpCenterFragment;)V
    .locals 0

    invoke-direct {p0, p1}, Lzendesk/support/guide/DaggerGuideSdkComponent;->injectHelpCenterFragment(Lzendesk/support/guide/HelpCenterFragment;)Lzendesk/support/guide/HelpCenterFragment;

    return-void
.end method

.method public inject(Lzendesk/support/guide/ViewArticleActivity;)V
    .locals 0

    invoke-direct {p0, p1}, Lzendesk/support/guide/DaggerGuideSdkComponent;->injectViewArticleActivity(Lzendesk/support/guide/ViewArticleActivity;)Lzendesk/support/guide/ViewArticleActivity;

    return-void
.end method
