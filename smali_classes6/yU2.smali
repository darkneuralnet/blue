.class public LyU2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation


# static fields
.field public static final b:Ljava/lang/Object;

.field public static c:LyU2;


# instance fields
.field public a:Let0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LyU2;->b:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()LyU2;
    .locals 3
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    sget-object v0, LyU2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LyU2;->c:LyU2;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "MlKitContext has not been initialized"

    invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkState(ZLjava/lang/Object;)V

    sget-object v1, LyU2;->c:LyU2;

    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LyU2;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static d(Landroid/content/Context;)LyU2;
    .locals 7

    sget-object v0, LyU2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LyU2;->c:LyU2;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    const-string v4, "MlKitContext is already initialized"

    invoke-static {v1, v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkState(ZLjava/lang/Object;)V

    new-instance v1, LyU2;

    invoke-direct {v1}, LyU2;-><init>()V

    sput-object v1, LyU2;->c:LyU2;

    invoke-static {p0}, LyU2;->e(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    const-class v4, Lcom/google/mlkit/common/internal/MlKitComponentDiscoveryService;

    invoke-static {p0, v4}, LSs0;->c(Landroid/content/Context;Ljava/lang/Class;)LSs0;

    move-result-object v4

    invoke-virtual {v4}, LSs0;->b()Ljava/util/List;

    move-result-object v4

    sget-object v5, Lcom/google/android/gms/tasks/TaskExecutors;->MAIN_THREAD:Ljava/util/concurrent/Executor;

    invoke-static {v5}, Let0;->l(Ljava/util/concurrent/Executor;)Let0$b;

    move-result-object v5

    invoke-virtual {v5, v4}, Let0$b;->d(Ljava/util/Collection;)Let0$b;

    move-result-object v4

    const-class v5, Landroid/content/Context;

    new-array v6, v3, [Ljava/lang/Class;

    invoke-static {p0, v5, v6}, LEs0;->s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)LEs0;

    move-result-object p0

    invoke-virtual {v4, p0}, Let0$b;->b(LEs0;)Let0$b;

    move-result-object p0

    const-class v4, LyU2;

    new-array v3, v3, [Ljava/lang/Class;

    invoke-static {v1, v4, v3}, LEs0;->s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)LEs0;

    move-result-object v3

    invoke-virtual {p0, v3}, Let0$b;->b(LEs0;)Let0$b;

    move-result-object p0

    invoke-virtual {p0}, Let0$b;->e()Let0;

    move-result-object p0

    iput-object p0, v1, LyU2;->a:Let0;

    invoke-virtual {p0, v2}, Let0;->o(Z)V

    sget-object p0, LyU2;->c:LyU2;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static e(Landroid/content/Context;)Landroid/content/Context;
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    sget-object v0, LyU2;->c:LyU2;

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "MlKitContext has been deleted"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkState(ZLjava/lang/Object;)V

    iget-object v0, p0, LyU2;->a:Let0;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LyU2;->a:Let0;

    invoke-interface {v0, p1}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, LyU2;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    return-object v0
.end method
