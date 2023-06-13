.class public final Lzendesk/core/ZendeskProvidersModule_ProvideProviderStoreFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/core/ProviderStore;",
        ">;"
    }
.end annotation


# instance fields
.field private final pushRegistrationProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/PushRegistrationProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final userProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/UserProvider;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/UserProvider;",
            ">;",
            "LY94<",
            "Lzendesk/core/PushRegistrationProvider;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/core/ZendeskProvidersModule_ProvideProviderStoreFactory;->userProvider:LY94;

    iput-object p2, p0, Lzendesk/core/ZendeskProvidersModule_ProvideProviderStoreFactory;->pushRegistrationProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;)Lzendesk/core/ZendeskProvidersModule_ProvideProviderStoreFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/UserProvider;",
            ">;",
            "LY94<",
            "Lzendesk/core/PushRegistrationProvider;",
            ">;)",
            "Lzendesk/core/ZendeskProvidersModule_ProvideProviderStoreFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/core/ZendeskProvidersModule_ProvideProviderStoreFactory;

    invoke-direct {v0, p0, p1}, Lzendesk/core/ZendeskProvidersModule_ProvideProviderStoreFactory;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static provideProviderStore(Lzendesk/core/UserProvider;Lzendesk/core/PushRegistrationProvider;)Lzendesk/core/ProviderStore;
    .locals 0

    invoke-static {p0, p1}, Lzendesk/core/ZendeskProvidersModule;->provideProviderStore(Lzendesk/core/UserProvider;Lzendesk/core/PushRegistrationProvider;)Lzendesk/core/ProviderStore;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/core/ProviderStore;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/core/ZendeskProvidersModule_ProvideProviderStoreFactory;->get()Lzendesk/core/ProviderStore;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/core/ProviderStore;
    .locals 2

    iget-object v0, p0, Lzendesk/core/ZendeskProvidersModule_ProvideProviderStoreFactory;->userProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/core/UserProvider;

    iget-object v1, p0, Lzendesk/core/ZendeskProvidersModule_ProvideProviderStoreFactory;->pushRegistrationProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/core/PushRegistrationProvider;

    invoke-static {v0, v1}, Lzendesk/core/ZendeskProvidersModule_ProvideProviderStoreFactory;->provideProviderStore(Lzendesk/core/UserProvider;Lzendesk/core/PushRegistrationProvider;)Lzendesk/core/ProviderStore;

    move-result-object v0

    return-object v0
.end method
