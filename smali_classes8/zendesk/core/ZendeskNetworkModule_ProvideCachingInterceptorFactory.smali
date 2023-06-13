.class public final Lzendesk/core/ZendeskNetworkModule_ProvideCachingInterceptorFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/core/CachingInterceptor;",
        ">;"
    }
.end annotation


# instance fields
.field private final mediaCacheProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/BaseStorage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/BaseStorage;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/core/ZendeskNetworkModule_ProvideCachingInterceptorFactory;->mediaCacheProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lzendesk/core/ZendeskNetworkModule_ProvideCachingInterceptorFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/BaseStorage;",
            ">;)",
            "Lzendesk/core/ZendeskNetworkModule_ProvideCachingInterceptorFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/core/ZendeskNetworkModule_ProvideCachingInterceptorFactory;

    invoke-direct {v0, p0}, Lzendesk/core/ZendeskNetworkModule_ProvideCachingInterceptorFactory;-><init>(LY94;)V

    return-object v0
.end method

.method public static provideCachingInterceptor(Lzendesk/core/BaseStorage;)Lzendesk/core/CachingInterceptor;
    .locals 0

    invoke-static {p0}, Lzendesk/core/ZendeskNetworkModule;->provideCachingInterceptor(Lzendesk/core/BaseStorage;)Lzendesk/core/CachingInterceptor;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/core/CachingInterceptor;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/core/ZendeskNetworkModule_ProvideCachingInterceptorFactory;->get()Lzendesk/core/CachingInterceptor;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/core/CachingInterceptor;
    .locals 1

    iget-object v0, p0, Lzendesk/core/ZendeskNetworkModule_ProvideCachingInterceptorFactory;->mediaCacheProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/core/BaseStorage;

    invoke-static {v0}, Lzendesk/core/ZendeskNetworkModule_ProvideCachingInterceptorFactory;->provideCachingInterceptor(Lzendesk/core/BaseStorage;)Lzendesk/core/CachingInterceptor;

    move-result-object v0

    return-object v0
.end method
