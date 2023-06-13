.class final Lzendesk/support/DaggerGuideSdkProvidersComponent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/support/GuideSdkProvidersComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/support/DaggerGuideSdkProvidersComponent$Builder;
    }
.end annotation


# instance fields
.field private getBlipsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/BlipsProvider;",
            ">;"
        }
    .end annotation
.end field

.field private getRestServiceProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/RestServiceProvider;",
            ">;"
        }
    .end annotation
.end field

.field private getSessionStorageProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/SessionStorage;",
            ">;"
        }
    .end annotation
.end field

.field private getSettingsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/SettingsProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final guideSdkProvidersComponent:Lzendesk/support/DaggerGuideSdkProvidersComponent;

.field private provideArticleVoteStorageProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/ArticleVoteStorage;",
            ">;"
        }
    .end annotation
.end field

.field private provideCustomNetworkConfigProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/HelpCenterCachingNetworkConfig;",
            ">;"
        }
    .end annotation
.end field

.field private provideDeviceLocaleProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation
.end field

.field private provideGuideModuleProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/GuideModule;",
            ">;"
        }
    .end annotation
.end field

.field private provideHelpCenterCachingInterceptorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/HelpCenterCachingInterceptor;",
            ">;"
        }
    .end annotation
.end field

.field private provideHelpCenterProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/HelpCenterProvider;",
            ">;"
        }
    .end annotation
.end field

.field private provideHelpCenterSessionCacheProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/HelpCenterSessionCache;",
            ">;"
        }
    .end annotation
.end field

.field private provideSettingsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/HelpCenterSettingsProvider;",
            ">;"
        }
    .end annotation
.end field

.field private provideZendeskHelpCenterServiceProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/ZendeskHelpCenterService;",
            ">;"
        }
    .end annotation
.end field

.field private provideZendeskLocaleConverterProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/ZendeskLocaleConverter;",
            ">;"
        }
    .end annotation
.end field

.field private providesHelpCenterBlipsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/HelpCenterBlipsProvider;",
            ">;"
        }
    .end annotation
.end field

.field private providesHelpCenterServiceProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/HelpCenterService;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lzendesk/core/CoreModule;Lzendesk/support/GuideProviderModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->guideSdkProvidersComponent:Lzendesk/support/DaggerGuideSdkProvidersComponent;

    invoke-direct {p0, p1, p2}, Lzendesk/support/DaggerGuideSdkProvidersComponent;->initialize(Lzendesk/core/CoreModule;Lzendesk/support/GuideProviderModule;)V

    return-void
.end method

.method public synthetic constructor <init>(Lzendesk/core/CoreModule;Lzendesk/support/GuideProviderModule;Lzendesk/support/DaggerGuideSdkProvidersComponent$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lzendesk/support/DaggerGuideSdkProvidersComponent;-><init>(Lzendesk/core/CoreModule;Lzendesk/support/GuideProviderModule;)V

    return-void
.end method

.method public static builder()Lzendesk/support/DaggerGuideSdkProvidersComponent$Builder;
    .locals 2

    new-instance v0, Lzendesk/support/DaggerGuideSdkProvidersComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzendesk/support/DaggerGuideSdkProvidersComponent$Builder;-><init>(Lzendesk/support/DaggerGuideSdkProvidersComponent$1;)V

    return-object v0
.end method

.method private initialize(Lzendesk/core/CoreModule;Lzendesk/support/GuideProviderModule;)V
    .locals 6

    invoke-static {p1}, Lzendesk/core/CoreModule_GetSettingsProviderFactory;->create(Lzendesk/core/CoreModule;)Lzendesk/core/CoreModule_GetSettingsProviderFactory;

    move-result-object v0

    iput-object v0, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->getSettingsProvider:LY94;

    invoke-static {}, Lzendesk/support/GuideProviderModule_ProvideZendeskLocaleConverterFactory;->create()Lzendesk/support/GuideProviderModule_ProvideZendeskLocaleConverterFactory;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->provideZendeskLocaleConverterProvider:LY94;

    invoke-static {p2}, Lzendesk/support/GuideProviderModule_ProvideDeviceLocaleFactory;->create(Lzendesk/support/GuideProviderModule;)Lzendesk/support/GuideProviderModule_ProvideDeviceLocaleFactory;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->provideDeviceLocaleProvider:LY94;

    iget-object v1, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->getSettingsProvider:LY94;

    iget-object v2, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->provideZendeskLocaleConverterProvider:LY94;

    invoke-static {p2, v1, v2, v0}, Lzendesk/support/GuideProviderModule_ProvideSettingsProviderFactory;->create(Lzendesk/support/GuideProviderModule;LY94;LY94;LY94;)Lzendesk/support/GuideProviderModule_ProvideSettingsProviderFactory;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->provideSettingsProvider:LY94;

    invoke-static {p1}, Lzendesk/core/CoreModule_GetBlipsProviderFactory;->create(Lzendesk/core/CoreModule;)Lzendesk/core/CoreModule_GetBlipsProviderFactory;

    move-result-object v0

    iput-object v0, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->getBlipsProvider:LY94;

    iget-object v1, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->provideDeviceLocaleProvider:LY94;

    invoke-static {p2, v0, v1}, Lzendesk/support/GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory;->create(Lzendesk/support/GuideProviderModule;LY94;LY94;)Lzendesk/support/GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->providesHelpCenterBlipsProvider:LY94;

    invoke-static {p1}, Lzendesk/core/CoreModule_GetRestServiceProviderFactory;->create(Lzendesk/core/CoreModule;)Lzendesk/core/CoreModule_GetRestServiceProviderFactory;

    move-result-object v0

    iput-object v0, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->getRestServiceProvider:LY94;

    invoke-static {}, Lzendesk/support/GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory;->create()Lzendesk/support/GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory;

    move-result-object v0

    invoke-static {v0}, LiB5;->a(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->provideHelpCenterCachingInterceptorProvider:LY94;

    invoke-static {v0}, Lzendesk/support/GuideProviderModule_ProvideCustomNetworkConfigFactory;->create(LY94;)Lzendesk/support/GuideProviderModule_ProvideCustomNetworkConfigFactory;

    move-result-object v0

    invoke-static {v0}, LiB5;->a(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->provideCustomNetworkConfigProvider:LY94;

    iget-object v1, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->getRestServiceProvider:LY94;

    invoke-static {v1, v0}, Lzendesk/support/GuideProviderModule_ProvidesHelpCenterServiceFactory;->create(LY94;LY94;)Lzendesk/support/GuideProviderModule_ProvidesHelpCenterServiceFactory;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->providesHelpCenterServiceProvider:LY94;

    iget-object v1, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->provideZendeskLocaleConverterProvider:LY94;

    invoke-static {v0, v1}, Lzendesk/support/GuideProviderModule_ProvideZendeskHelpCenterServiceFactory;->create(LY94;LY94;)Lzendesk/support/GuideProviderModule_ProvideZendeskHelpCenterServiceFactory;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->provideZendeskHelpCenterServiceProvider:LY94;

    invoke-static {}, Lzendesk/support/GuideProviderModule_ProvideHelpCenterSessionCacheFactory;->create()Lzendesk/support/GuideProviderModule_ProvideHelpCenterSessionCacheFactory;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->provideHelpCenterSessionCacheProvider:LY94;

    iget-object v1, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->provideSettingsProvider:LY94;

    iget-object v2, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->providesHelpCenterBlipsProvider:LY94;

    iget-object v3, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->provideZendeskHelpCenterServiceProvider:LY94;

    invoke-static {p2, v1, v2, v3, v0}, Lzendesk/support/GuideProviderModule_ProvideHelpCenterProviderFactory;->create(Lzendesk/support/GuideProviderModule;LY94;LY94;LY94;LY94;)Lzendesk/support/GuideProviderModule_ProvideHelpCenterProviderFactory;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->provideHelpCenterProvider:LY94;

    invoke-static {p1}, Lzendesk/core/CoreModule_GetSessionStorageFactory;->create(Lzendesk/core/CoreModule;)Lzendesk/core/CoreModule_GetSessionStorageFactory;

    move-result-object p1

    iput-object p1, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->getSessionStorageProvider:LY94;

    invoke-static {p1}, Lzendesk/support/GuideProviderModule_ProvideArticleVoteStorageFactory;->create(LY94;)Lzendesk/support/GuideProviderModule_ProvideArticleVoteStorageFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object v4

    iput-object v4, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->provideArticleVoteStorageProvider:LY94;

    iget-object v1, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->provideHelpCenterProvider:LY94;

    iget-object v2, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->provideSettingsProvider:LY94;

    iget-object v3, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->providesHelpCenterBlipsProvider:LY94;

    iget-object v5, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->getRestServiceProvider:LY94;

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lzendesk/support/GuideProviderModule_ProvideGuideModuleFactory;->create(Lzendesk/support/GuideProviderModule;LY94;LY94;LY94;LY94;LY94;)Lzendesk/support/GuideProviderModule_ProvideGuideModuleFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->provideGuideModuleProvider:LY94;

    return-void
.end method

.method private injectGuide(Lzendesk/support/Guide;)Lzendesk/support/Guide;
    .locals 1

    iget-object v0, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->provideGuideModuleProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/support/GuideModule;

    invoke-static {p1, v0}, Lzendesk/support/Guide_MembersInjector;->injectGuideModule(Lzendesk/support/Guide;Lzendesk/support/GuideModule;)V

    iget-object v0, p0, Lzendesk/support/DaggerGuideSdkProvidersComponent;->providesHelpCenterBlipsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/support/HelpCenterBlipsProvider;

    invoke-static {p1, v0}, Lzendesk/support/Guide_MembersInjector;->injectBlipsProvider(Lzendesk/support/Guide;Lzendesk/support/HelpCenterBlipsProvider;)V

    return-object p1
.end method


# virtual methods
.method public inject(Lzendesk/support/Guide;)Lzendesk/support/Guide;
    .locals 0

    invoke-direct {p0, p1}, Lzendesk/support/DaggerGuideSdkProvidersComponent;->injectGuide(Lzendesk/support/Guide;)Lzendesk/support/Guide;

    move-result-object p1

    return-object p1
.end method
