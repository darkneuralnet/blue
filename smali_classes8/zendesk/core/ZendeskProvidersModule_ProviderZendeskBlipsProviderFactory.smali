.class public final Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/core/ZendeskBlipsProvider;",
        ">;"
    }
.end annotation


# instance fields
.field private final applicationConfigurationProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/ApplicationConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final blipsServiceProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/BlipsService;",
            ">;"
        }
    .end annotation
.end field

.field private final coreSettingsStorageProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/CoreSettingsStorage;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceInfoProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/DeviceInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final executorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field private final identityManagerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/IdentityManager;",
            ">;"
        }
    .end annotation
.end field

.field private final serializerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/Serializer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/BlipsService;",
            ">;",
            "LY94<",
            "Lzendesk/core/DeviceInfo;",
            ">;",
            "LY94<",
            "Lzendesk/core/Serializer;",
            ">;",
            "LY94<",
            "Lzendesk/core/IdentityManager;",
            ">;",
            "LY94<",
            "Lzendesk/core/ApplicationConfiguration;",
            ">;",
            "LY94<",
            "Lzendesk/core/CoreSettingsStorage;",
            ">;",
            "LY94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;->blipsServiceProvider:LY94;

    iput-object p2, p0, Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;->deviceInfoProvider:LY94;

    iput-object p3, p0, Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;->serializerProvider:LY94;

    iput-object p4, p0, Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;->identityManagerProvider:LY94;

    iput-object p5, p0, Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;->applicationConfigurationProvider:LY94;

    iput-object p6, p0, Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;->coreSettingsStorageProvider:LY94;

    iput-object p7, p0, Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;->executorProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/BlipsService;",
            ">;",
            "LY94<",
            "Lzendesk/core/DeviceInfo;",
            ">;",
            "LY94<",
            "Lzendesk/core/Serializer;",
            ">;",
            "LY94<",
            "Lzendesk/core/IdentityManager;",
            ">;",
            "LY94<",
            "Lzendesk/core/ApplicationConfiguration;",
            ">;",
            "LY94<",
            "Lzendesk/core/CoreSettingsStorage;",
            ">;",
            "LY94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;)",
            "Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;"
        }
    .end annotation

    new-instance v8, Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static providerZendeskBlipsProvider(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lzendesk/core/ApplicationConfiguration;Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)Lzendesk/core/ZendeskBlipsProvider;
    .locals 7

    move-object v0, p0

    check-cast v0, Lzendesk/core/BlipsService;

    move-object v1, p1

    check-cast v1, Lzendesk/core/DeviceInfo;

    move-object v2, p2

    check-cast v2, Lzendesk/core/Serializer;

    move-object v3, p3

    check-cast v3, Lzendesk/core/IdentityManager;

    move-object v5, p5

    check-cast v5, Lzendesk/core/CoreSettingsStorage;

    move-object v4, p4

    move-object v6, p6

    invoke-static/range {v0 .. v6}, Lzendesk/core/ZendeskProvidersModule;->providerZendeskBlipsProvider(Lzendesk/core/BlipsService;Lzendesk/core/DeviceInfo;Lzendesk/core/Serializer;Lzendesk/core/IdentityManager;Lzendesk/core/ApplicationConfiguration;Lzendesk/core/CoreSettingsStorage;Ljava/util/concurrent/ExecutorService;)Lzendesk/core/ZendeskBlipsProvider;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/core/ZendeskBlipsProvider;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;->get()Lzendesk/core/ZendeskBlipsProvider;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/core/ZendeskBlipsProvider;
    .locals 8

    iget-object v0, p0, Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;->blipsServiceProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    iget-object v0, p0, Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;->deviceInfoProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    iget-object v0, p0, Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;->serializerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    iget-object v0, p0, Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;->identityManagerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    iget-object v0, p0, Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;->applicationConfigurationProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lzendesk/core/ApplicationConfiguration;

    iget-object v0, p0, Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;->coreSettingsStorageProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v6

    iget-object v0, p0, Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;->executorProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/concurrent/ExecutorService;

    invoke-static/range {v1 .. v7}, Lzendesk/core/ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory;->providerZendeskBlipsProvider(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lzendesk/core/ApplicationConfiguration;Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)Lzendesk/core/ZendeskBlipsProvider;

    move-result-object v0

    return-object v0
.end method
