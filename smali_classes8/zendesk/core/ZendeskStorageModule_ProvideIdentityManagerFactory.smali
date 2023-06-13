.class public final Lzendesk/core/ZendeskStorageModule_ProvideIdentityManagerFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/core/IdentityManager;",
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


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/IdentityStorage;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/core/ZendeskStorageModule_ProvideIdentityManagerFactory;->identityStorageProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lzendesk/core/ZendeskStorageModule_ProvideIdentityManagerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/IdentityStorage;",
            ">;)",
            "Lzendesk/core/ZendeskStorageModule_ProvideIdentityManagerFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/core/ZendeskStorageModule_ProvideIdentityManagerFactory;

    invoke-direct {v0, p0}, Lzendesk/core/ZendeskStorageModule_ProvideIdentityManagerFactory;-><init>(LY94;)V

    return-object v0
.end method

.method public static provideIdentityManager(Ljava/lang/Object;)Lzendesk/core/IdentityManager;
    .locals 0

    check-cast p0, Lzendesk/core/IdentityStorage;

    invoke-static {p0}, Lzendesk/core/ZendeskStorageModule;->provideIdentityManager(Lzendesk/core/IdentityStorage;)Lzendesk/core/IdentityManager;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/core/IdentityManager;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/core/ZendeskStorageModule_ProvideIdentityManagerFactory;->get()Lzendesk/core/IdentityManager;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/core/IdentityManager;
    .locals 1

    iget-object v0, p0, Lzendesk/core/ZendeskStorageModule_ProvideIdentityManagerFactory;->identityStorageProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lzendesk/core/ZendeskStorageModule_ProvideIdentityManagerFactory;->provideIdentityManager(Ljava/lang/Object;)Lzendesk/core/IdentityManager;

    move-result-object v0

    return-object v0
.end method
