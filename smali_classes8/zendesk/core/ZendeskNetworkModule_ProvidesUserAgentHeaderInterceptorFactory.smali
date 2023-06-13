.class public final Lzendesk/core/ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/core/UserAgentAndClientHeadersInterceptor;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lzendesk/core/ZendeskNetworkModule;


# direct methods
.method public constructor <init>(Lzendesk/core/ZendeskNetworkModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/core/ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory;->module:Lzendesk/core/ZendeskNetworkModule;

    return-void
.end method

.method public static create(Lzendesk/core/ZendeskNetworkModule;)Lzendesk/core/ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory;
    .locals 1

    new-instance v0, Lzendesk/core/ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory;

    invoke-direct {v0, p0}, Lzendesk/core/ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory;-><init>(Lzendesk/core/ZendeskNetworkModule;)V

    return-object v0
.end method

.method public static providesUserAgentHeaderInterceptor(Lzendesk/core/ZendeskNetworkModule;)Lzendesk/core/UserAgentAndClientHeadersInterceptor;
    .locals 0

    invoke-virtual {p0}, Lzendesk/core/ZendeskNetworkModule;->providesUserAgentHeaderInterceptor()Lzendesk/core/UserAgentAndClientHeadersInterceptor;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/core/UserAgentAndClientHeadersInterceptor;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/core/ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory;->get()Lzendesk/core/UserAgentAndClientHeadersInterceptor;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/core/UserAgentAndClientHeadersInterceptor;
    .locals 1

    iget-object v0, p0, Lzendesk/core/ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory;->module:Lzendesk/core/ZendeskNetworkModule;

    invoke-static {v0}, Lzendesk/core/ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory;->providesUserAgentHeaderInterceptor(Lzendesk/core/ZendeskNetworkModule;)Lzendesk/core/UserAgentAndClientHeadersInterceptor;

    move-result-object v0

    return-object v0
.end method
