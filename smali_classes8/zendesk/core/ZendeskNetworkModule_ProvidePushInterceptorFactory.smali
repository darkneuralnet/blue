.class public final Lzendesk/core/ZendeskNetworkModule_ProvidePushInterceptorFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/core/ZendeskPushInterceptor;",
        ">;"
    }
.end annotation


# instance fields
.field private final identityStorageProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/IdentityStorage;",
            ">;"
        }
    .end annotation
.end field

.field private final pushDeviceIdStorageProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/PushDeviceIdStorage;",
            ">;"
        }
    .end annotation
.end field

.field private final pushProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/PushRegistrationProviderInternal;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/PushRegistrationProviderInternal;",
            ">;",
            "LY94<",
            "Lzendesk/core/PushDeviceIdStorage;",
            ">;",
            "LY94<",
            "Lzendesk/core/IdentityStorage;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/core/ZendeskNetworkModule_ProvidePushInterceptorFactory;->pushProvider:LY94;

    iput-object p2, p0, Lzendesk/core/ZendeskNetworkModule_ProvidePushInterceptorFactory;->pushDeviceIdStorageProvider:LY94;

    iput-object p3, p0, Lzendesk/core/ZendeskNetworkModule_ProvidePushInterceptorFactory;->identityStorageProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;)Lzendesk/core/ZendeskNetworkModule_ProvidePushInterceptorFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/PushRegistrationProviderInternal;",
            ">;",
            "LY94<",
            "Lzendesk/core/PushDeviceIdStorage;",
            ">;",
            "LY94<",
            "Lzendesk/core/IdentityStorage;",
            ">;)",
            "Lzendesk/core/ZendeskNetworkModule_ProvidePushInterceptorFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/core/ZendeskNetworkModule_ProvidePushInterceptorFactory;

    invoke-direct {v0, p0, p1, p2}, Lzendesk/core/ZendeskNetworkModule_ProvidePushInterceptorFactory;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static providePushInterceptor(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lzendesk/core/ZendeskPushInterceptor;
    .locals 0

    check-cast p0, Lzendesk/core/PushRegistrationProviderInternal;

    check-cast p1, Lzendesk/core/PushDeviceIdStorage;

    check-cast p2, Lzendesk/core/IdentityStorage;

    invoke-static {p0, p1, p2}, Lzendesk/core/ZendeskNetworkModule;->providePushInterceptor(Lzendesk/core/PushRegistrationProviderInternal;Lzendesk/core/PushDeviceIdStorage;Lzendesk/core/IdentityStorage;)Lzendesk/core/ZendeskPushInterceptor;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/core/ZendeskPushInterceptor;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/core/ZendeskNetworkModule_ProvidePushInterceptorFactory;->get()Lzendesk/core/ZendeskPushInterceptor;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/core/ZendeskPushInterceptor;
    .locals 3

    iget-object v0, p0, Lzendesk/core/ZendeskNetworkModule_ProvidePushInterceptorFactory;->pushProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lzendesk/core/ZendeskNetworkModule_ProvidePushInterceptorFactory;->pushDeviceIdStorageProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lzendesk/core/ZendeskNetworkModule_ProvidePushInterceptorFactory;->identityStorageProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lzendesk/core/ZendeskNetworkModule_ProvidePushInterceptorFactory;->providePushInterceptor(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lzendesk/core/ZendeskPushInterceptor;

    move-result-object v0

    return-object v0
.end method
