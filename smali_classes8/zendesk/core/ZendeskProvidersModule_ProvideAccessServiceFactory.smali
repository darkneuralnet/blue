.class public final Lzendesk/core/ZendeskProvidersModule_ProvideAccessServiceFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/core/AccessService;",
        ">;"
    }
.end annotation


# instance fields
.field private final retrofitProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LMN4;",
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
            "LMN4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/core/ZendeskProvidersModule_ProvideAccessServiceFactory;->retrofitProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lzendesk/core/ZendeskProvidersModule_ProvideAccessServiceFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LMN4;",
            ">;)",
            "Lzendesk/core/ZendeskProvidersModule_ProvideAccessServiceFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/core/ZendeskProvidersModule_ProvideAccessServiceFactory;

    invoke-direct {v0, p0}, Lzendesk/core/ZendeskProvidersModule_ProvideAccessServiceFactory;-><init>(LY94;)V

    return-object v0
.end method

.method public static provideAccessService(LMN4;)Lzendesk/core/AccessService;
    .locals 0

    invoke-static {p0}, Lzendesk/core/ZendeskProvidersModule;->provideAccessService(LMN4;)Lzendesk/core/AccessService;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/core/AccessService;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/core/ZendeskProvidersModule_ProvideAccessServiceFactory;->get()Lzendesk/core/AccessService;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/core/AccessService;
    .locals 1

    iget-object v0, p0, Lzendesk/core/ZendeskProvidersModule_ProvideAccessServiceFactory;->retrofitProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LMN4;

    invoke-static {v0}, Lzendesk/core/ZendeskProvidersModule_ProvideAccessServiceFactory;->provideAccessService(LMN4;)Lzendesk/core/AccessService;

    move-result-object v0

    return-object v0
.end method
