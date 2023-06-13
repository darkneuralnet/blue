.class public final Lzendesk/support/StorageModule_ProvideRequestStorageFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/support/RequestStorage;",
        ">;"
    }
.end annotation


# instance fields
.field private final baseStorageProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/SessionStorage;",
            ">;"
        }
    .end annotation
.end field

.field private final memoryCacheProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/MemoryCache;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lzendesk/support/StorageModule;

.field private final requestMigratorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/RequestMigrator;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzendesk/support/StorageModule;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/support/StorageModule;",
            "LY94<",
            "Lzendesk/core/SessionStorage;",
            ">;",
            "LY94<",
            "Lzendesk/support/RequestMigrator;",
            ">;",
            "LY94<",
            "Lzendesk/core/MemoryCache;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/StorageModule_ProvideRequestStorageFactory;->module:Lzendesk/support/StorageModule;

    iput-object p2, p0, Lzendesk/support/StorageModule_ProvideRequestStorageFactory;->baseStorageProvider:LY94;

    iput-object p3, p0, Lzendesk/support/StorageModule_ProvideRequestStorageFactory;->requestMigratorProvider:LY94;

    iput-object p4, p0, Lzendesk/support/StorageModule_ProvideRequestStorageFactory;->memoryCacheProvider:LY94;

    return-void
.end method

.method public static create(Lzendesk/support/StorageModule;LY94;LY94;LY94;)Lzendesk/support/StorageModule_ProvideRequestStorageFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/support/StorageModule;",
            "LY94<",
            "Lzendesk/core/SessionStorage;",
            ">;",
            "LY94<",
            "Lzendesk/support/RequestMigrator;",
            ">;",
            "LY94<",
            "Lzendesk/core/MemoryCache;",
            ">;)",
            "Lzendesk/support/StorageModule_ProvideRequestStorageFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/support/StorageModule_ProvideRequestStorageFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lzendesk/support/StorageModule_ProvideRequestStorageFactory;-><init>(Lzendesk/support/StorageModule;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static provideRequestStorage(Lzendesk/support/StorageModule;Lzendesk/core/SessionStorage;Ljava/lang/Object;Lzendesk/core/MemoryCache;)Lzendesk/support/RequestStorage;
    .locals 0

    check-cast p2, Lzendesk/support/RequestMigrator;

    invoke-virtual {p0, p1, p2, p3}, Lzendesk/support/StorageModule;->provideRequestStorage(Lzendesk/core/SessionStorage;Lzendesk/support/RequestMigrator;Lzendesk/core/MemoryCache;)Lzendesk/support/RequestStorage;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/support/RequestStorage;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/StorageModule_ProvideRequestStorageFactory;->get()Lzendesk/support/RequestStorage;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/support/RequestStorage;
    .locals 4

    iget-object v0, p0, Lzendesk/support/StorageModule_ProvideRequestStorageFactory;->module:Lzendesk/support/StorageModule;

    iget-object v1, p0, Lzendesk/support/StorageModule_ProvideRequestStorageFactory;->baseStorageProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/core/SessionStorage;

    iget-object v2, p0, Lzendesk/support/StorageModule_ProvideRequestStorageFactory;->requestMigratorProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lzendesk/support/StorageModule_ProvideRequestStorageFactory;->memoryCacheProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzendesk/core/MemoryCache;

    invoke-static {v0, v1, v2, v3}, Lzendesk/support/StorageModule_ProvideRequestStorageFactory;->provideRequestStorage(Lzendesk/support/StorageModule;Lzendesk/core/SessionStorage;Ljava/lang/Object;Lzendesk/core/MemoryCache;)Lzendesk/support/RequestStorage;

    move-result-object v0

    return-object v0
.end method
