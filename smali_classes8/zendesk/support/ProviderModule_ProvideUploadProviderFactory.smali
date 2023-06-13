.class public final Lzendesk/support/ProviderModule_ProvideUploadProviderFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/support/UploadProvider;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lzendesk/support/ProviderModule;

.field private final uploadServiceProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/ZendeskUploadService;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzendesk/support/ProviderModule;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/support/ProviderModule;",
            "LY94<",
            "Lzendesk/support/ZendeskUploadService;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/ProviderModule_ProvideUploadProviderFactory;->module:Lzendesk/support/ProviderModule;

    iput-object p2, p0, Lzendesk/support/ProviderModule_ProvideUploadProviderFactory;->uploadServiceProvider:LY94;

    return-void
.end method

.method public static create(Lzendesk/support/ProviderModule;LY94;)Lzendesk/support/ProviderModule_ProvideUploadProviderFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/support/ProviderModule;",
            "LY94<",
            "Lzendesk/support/ZendeskUploadService;",
            ">;)",
            "Lzendesk/support/ProviderModule_ProvideUploadProviderFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/support/ProviderModule_ProvideUploadProviderFactory;

    invoke-direct {v0, p0, p1}, Lzendesk/support/ProviderModule_ProvideUploadProviderFactory;-><init>(Lzendesk/support/ProviderModule;LY94;)V

    return-object v0
.end method

.method public static provideUploadProvider(Lzendesk/support/ProviderModule;Ljava/lang/Object;)Lzendesk/support/UploadProvider;
    .locals 0

    check-cast p1, Lzendesk/support/ZendeskUploadService;

    invoke-virtual {p0, p1}, Lzendesk/support/ProviderModule;->provideUploadProvider(Lzendesk/support/ZendeskUploadService;)Lzendesk/support/UploadProvider;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/support/UploadProvider;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/ProviderModule_ProvideUploadProviderFactory;->get()Lzendesk/support/UploadProvider;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/support/UploadProvider;
    .locals 2

    iget-object v0, p0, Lzendesk/support/ProviderModule_ProvideUploadProviderFactory;->module:Lzendesk/support/ProviderModule;

    iget-object v1, p0, Lzendesk/support/ProviderModule_ProvideUploadProviderFactory;->uploadServiceProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lzendesk/support/ProviderModule_ProvideUploadProviderFactory;->provideUploadProvider(Lzendesk/support/ProviderModule;Ljava/lang/Object;)Lzendesk/support/UploadProvider;

    move-result-object v0

    return-object v0
.end method
