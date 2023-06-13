.class public final Lzendesk/core/ZendeskNetworkModule_ProvideCoreRetrofitFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LMN4;",
        ">;"
    }
.end annotation


# instance fields
.field private final configurationProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/ApplicationConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final gsonProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LoE1;",
            ">;"
        }
    .end annotation
.end field

.field private final okHttpClientProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lokhttp3/OkHttpClient;",
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
            "Lzendesk/core/ApplicationConfiguration;",
            ">;",
            "LY94<",
            "LoE1;",
            ">;",
            "LY94<",
            "Lokhttp3/OkHttpClient;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/core/ZendeskNetworkModule_ProvideCoreRetrofitFactory;->configurationProvider:LY94;

    iput-object p2, p0, Lzendesk/core/ZendeskNetworkModule_ProvideCoreRetrofitFactory;->gsonProvider:LY94;

    iput-object p3, p0, Lzendesk/core/ZendeskNetworkModule_ProvideCoreRetrofitFactory;->okHttpClientProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;)Lzendesk/core/ZendeskNetworkModule_ProvideCoreRetrofitFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/ApplicationConfiguration;",
            ">;",
            "LY94<",
            "LoE1;",
            ">;",
            "LY94<",
            "Lokhttp3/OkHttpClient;",
            ">;)",
            "Lzendesk/core/ZendeskNetworkModule_ProvideCoreRetrofitFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/core/ZendeskNetworkModule_ProvideCoreRetrofitFactory;

    invoke-direct {v0, p0, p1, p2}, Lzendesk/core/ZendeskNetworkModule_ProvideCoreRetrofitFactory;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static provideCoreRetrofit(Lzendesk/core/ApplicationConfiguration;LoE1;Lokhttp3/OkHttpClient;)LMN4;
    .locals 0

    invoke-static {p0, p1, p2}, Lzendesk/core/ZendeskNetworkModule;->provideCoreRetrofit(Lzendesk/core/ApplicationConfiguration;LoE1;Lokhttp3/OkHttpClient;)LMN4;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LMN4;

    return-object p0
.end method


# virtual methods
.method public get()LMN4;
    .locals 3

    iget-object v0, p0, Lzendesk/core/ZendeskNetworkModule_ProvideCoreRetrofitFactory;->configurationProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/core/ApplicationConfiguration;

    iget-object v1, p0, Lzendesk/core/ZendeskNetworkModule_ProvideCoreRetrofitFactory;->gsonProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LoE1;

    iget-object v2, p0, Lzendesk/core/ZendeskNetworkModule_ProvideCoreRetrofitFactory;->okHttpClientProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lokhttp3/OkHttpClient;

    invoke-static {v0, v1, v2}, Lzendesk/core/ZendeskNetworkModule_ProvideCoreRetrofitFactory;->provideCoreRetrofit(Lzendesk/core/ApplicationConfiguration;LoE1;Lokhttp3/OkHttpClient;)LMN4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/core/ZendeskNetworkModule_ProvideCoreRetrofitFactory;->get()LMN4;

    move-result-object v0

    return-object v0
.end method
