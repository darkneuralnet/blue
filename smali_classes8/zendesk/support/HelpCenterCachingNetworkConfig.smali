.class Lzendesk/support/HelpCenterCachingNetworkConfig;
.super Lzendesk/core/CustomNetworkConfig;
.source "SourceFile"


# instance fields
.field private interceptor:Lzendesk/support/HelpCenterCachingInterceptor;


# direct methods
.method public constructor <init>(Lzendesk/support/HelpCenterCachingInterceptor;)V
    .locals 0

    invoke-direct {p0}, Lzendesk/core/CustomNetworkConfig;-><init>()V

    iput-object p1, p0, Lzendesk/support/HelpCenterCachingNetworkConfig;->interceptor:Lzendesk/support/HelpCenterCachingInterceptor;

    return-void
.end method


# virtual methods
.method public configureOkHttpClient(Lokhttp3/OkHttpClient$Builder;)V
    .locals 1

    iget-object v0, p0, Lzendesk/support/HelpCenterCachingNetworkConfig;->interceptor:Lzendesk/support/HelpCenterCachingInterceptor;

    invoke-virtual {p1, v0}, Lokhttp3/OkHttpClient$Builder;->addNetworkInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    return-void
.end method
