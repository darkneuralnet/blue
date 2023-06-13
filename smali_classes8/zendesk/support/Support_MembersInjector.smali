.class public final Lzendesk/support/Support_MembersInjector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lzendesk/support/Support;",
        ">;"
    }
.end annotation


# instance fields
.field private final actionHandlerRegistryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/ActionHandlerRegistry;",
            ">;"
        }
    .end annotation
.end field

.field private final authenticationProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/AuthenticationProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final blipsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/SupportBlipsProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final providerStoreProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/ProviderStore;",
            ">;"
        }
    .end annotation
.end field

.field private final requestMigratorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/RequestMigrator;",
            ">;"
        }
    .end annotation
.end field

.field private final requestProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/RequestProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final supportModuleProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/SupportModule;",
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
            "Lzendesk/support/ProviderStore;",
            ">;",
            "LY94<",
            "Lzendesk/support/SupportModule;",
            ">;",
            "LY94<",
            "Lzendesk/support/RequestMigrator;",
            ">;",
            "LY94<",
            "Lzendesk/support/SupportBlipsProvider;",
            ">;",
            "LY94<",
            "Lzendesk/core/ActionHandlerRegistry;",
            ">;",
            "LY94<",
            "Lzendesk/support/RequestProvider;",
            ">;",
            "LY94<",
            "Lzendesk/core/AuthenticationProvider;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/Support_MembersInjector;->providerStoreProvider:LY94;

    iput-object p2, p0, Lzendesk/support/Support_MembersInjector;->supportModuleProvider:LY94;

    iput-object p3, p0, Lzendesk/support/Support_MembersInjector;->requestMigratorProvider:LY94;

    iput-object p4, p0, Lzendesk/support/Support_MembersInjector;->blipsProvider:LY94;

    iput-object p5, p0, Lzendesk/support/Support_MembersInjector;->actionHandlerRegistryProvider:LY94;

    iput-object p6, p0, Lzendesk/support/Support_MembersInjector;->requestProvider:LY94;

    iput-object p7, p0, Lzendesk/support/Support_MembersInjector;->authenticationProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Ldagger/MembersInjector;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/support/ProviderStore;",
            ">;",
            "LY94<",
            "Lzendesk/support/SupportModule;",
            ">;",
            "LY94<",
            "Lzendesk/support/RequestMigrator;",
            ">;",
            "LY94<",
            "Lzendesk/support/SupportBlipsProvider;",
            ">;",
            "LY94<",
            "Lzendesk/core/ActionHandlerRegistry;",
            ">;",
            "LY94<",
            "Lzendesk/support/RequestProvider;",
            ">;",
            "LY94<",
            "Lzendesk/core/AuthenticationProvider;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lzendesk/support/Support;",
            ">;"
        }
    .end annotation

    new-instance v8, Lzendesk/support/Support_MembersInjector;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lzendesk/support/Support_MembersInjector;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static injectActionHandlerRegistry(Lzendesk/support/Support;Lzendesk/core/ActionHandlerRegistry;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/Support;->actionHandlerRegistry:Lzendesk/core/ActionHandlerRegistry;

    return-void
.end method

.method public static injectAuthenticationProvider(Lzendesk/support/Support;Lzendesk/core/AuthenticationProvider;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/Support;->authenticationProvider:Lzendesk/core/AuthenticationProvider;

    return-void
.end method

.method public static injectBlipsProvider(Lzendesk/support/Support;Lzendesk/support/SupportBlipsProvider;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/Support;->blipsProvider:Lzendesk/support/SupportBlipsProvider;

    return-void
.end method

.method public static injectProviderStore(Lzendesk/support/Support;Lzendesk/support/ProviderStore;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/Support;->providerStore:Lzendesk/support/ProviderStore;

    return-void
.end method

.method public static injectRequestMigrator(Lzendesk/support/Support;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/RequestMigrator;

    iput-object p1, p0, Lzendesk/support/Support;->requestMigrator:Lzendesk/support/RequestMigrator;

    return-void
.end method

.method public static injectRequestProvider(Lzendesk/support/Support;Lzendesk/support/RequestProvider;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/Support;->requestProvider:Lzendesk/support/RequestProvider;

    return-void
.end method

.method public static injectSupportModule(Lzendesk/support/Support;Lzendesk/support/SupportModule;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/Support;->supportModule:Lzendesk/support/SupportModule;

    return-void
.end method


# virtual methods
.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/Support;

    invoke-virtual {p0, p1}, Lzendesk/support/Support_MembersInjector;->injectMembers(Lzendesk/support/Support;)V

    return-void
.end method

.method public injectMembers(Lzendesk/support/Support;)V
    .locals 1

    iget-object v0, p0, Lzendesk/support/Support_MembersInjector;->providerStoreProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/support/ProviderStore;

    invoke-static {p1, v0}, Lzendesk/support/Support_MembersInjector;->injectProviderStore(Lzendesk/support/Support;Lzendesk/support/ProviderStore;)V

    iget-object v0, p0, Lzendesk/support/Support_MembersInjector;->supportModuleProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/support/SupportModule;

    invoke-static {p1, v0}, Lzendesk/support/Support_MembersInjector;->injectSupportModule(Lzendesk/support/Support;Lzendesk/support/SupportModule;)V

    iget-object v0, p0, Lzendesk/support/Support_MembersInjector;->requestMigratorProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/Support_MembersInjector;->injectRequestMigrator(Lzendesk/support/Support;Ljava/lang/Object;)V

    iget-object v0, p0, Lzendesk/support/Support_MembersInjector;->blipsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/support/SupportBlipsProvider;

    invoke-static {p1, v0}, Lzendesk/support/Support_MembersInjector;->injectBlipsProvider(Lzendesk/support/Support;Lzendesk/support/SupportBlipsProvider;)V

    iget-object v0, p0, Lzendesk/support/Support_MembersInjector;->actionHandlerRegistryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/core/ActionHandlerRegistry;

    invoke-static {p1, v0}, Lzendesk/support/Support_MembersInjector;->injectActionHandlerRegistry(Lzendesk/support/Support;Lzendesk/core/ActionHandlerRegistry;)V

    iget-object v0, p0, Lzendesk/support/Support_MembersInjector;->requestProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/support/RequestProvider;

    invoke-static {p1, v0}, Lzendesk/support/Support_MembersInjector;->injectRequestProvider(Lzendesk/support/Support;Lzendesk/support/RequestProvider;)V

    iget-object v0, p0, Lzendesk/support/Support_MembersInjector;->authenticationProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/core/AuthenticationProvider;

    invoke-static {p1, v0}, Lzendesk/support/Support_MembersInjector;->injectAuthenticationProvider(Lzendesk/support/Support;Lzendesk/core/AuthenticationProvider;)V

    return-void
.end method
