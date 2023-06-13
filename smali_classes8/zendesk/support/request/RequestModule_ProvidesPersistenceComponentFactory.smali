.class public final Lzendesk/support/request/RequestModule_ProvidesPersistenceComponentFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/support/request/ComponentPersistence;",
        ">;"
    }
.end annotation


# instance fields
.field private final executorServiceProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field private final queueProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/request/ComponentPersistence$PersistenceQueue;",
            ">;"
        }
    .end annotation
.end field

.field private final supportUiStorageProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/SupportUiStorage;",
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
            "Lzendesk/support/SupportUiStorage;",
            ">;",
            "LY94<",
            "Lzendesk/support/request/ComponentPersistence$PersistenceQueue;",
            ">;",
            "LY94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/request/RequestModule_ProvidesPersistenceComponentFactory;->supportUiStorageProvider:LY94;

    iput-object p2, p0, Lzendesk/support/request/RequestModule_ProvidesPersistenceComponentFactory;->queueProvider:LY94;

    iput-object p3, p0, Lzendesk/support/request/RequestModule_ProvidesPersistenceComponentFactory;->executorServiceProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;)Lzendesk/support/request/RequestModule_ProvidesPersistenceComponentFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/support/SupportUiStorage;",
            ">;",
            "LY94<",
            "Lzendesk/support/request/ComponentPersistence$PersistenceQueue;",
            ">;",
            "LY94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;)",
            "Lzendesk/support/request/RequestModule_ProvidesPersistenceComponentFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/support/request/RequestModule_ProvidesPersistenceComponentFactory;

    invoke-direct {v0, p0, p1, p2}, Lzendesk/support/request/RequestModule_ProvidesPersistenceComponentFactory;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static providesPersistenceComponent(Lzendesk/support/SupportUiStorage;Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)Lzendesk/support/request/ComponentPersistence;
    .locals 0

    check-cast p1, Lzendesk/support/request/ComponentPersistence$PersistenceQueue;

    invoke-static {p0, p1, p2}, Lzendesk/support/request/RequestModule;->providesPersistenceComponent(Lzendesk/support/SupportUiStorage;Lzendesk/support/request/ComponentPersistence$PersistenceQueue;Ljava/util/concurrent/ExecutorService;)Lzendesk/support/request/ComponentPersistence;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/support/request/ComponentPersistence;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/request/RequestModule_ProvidesPersistenceComponentFactory;->get()Lzendesk/support/request/ComponentPersistence;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/support/request/ComponentPersistence;
    .locals 3

    iget-object v0, p0, Lzendesk/support/request/RequestModule_ProvidesPersistenceComponentFactory;->supportUiStorageProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/support/SupportUiStorage;

    iget-object v1, p0, Lzendesk/support/request/RequestModule_ProvidesPersistenceComponentFactory;->queueProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lzendesk/support/request/RequestModule_ProvidesPersistenceComponentFactory;->executorServiceProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/ExecutorService;

    invoke-static {v0, v1, v2}, Lzendesk/support/request/RequestModule_ProvidesPersistenceComponentFactory;->providesPersistenceComponent(Lzendesk/support/SupportUiStorage;Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)Lzendesk/support/request/ComponentPersistence;

    move-result-object v0

    return-object v0
.end method
