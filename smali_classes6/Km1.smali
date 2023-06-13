.class public abstract LKm1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized c()LKm1;
    .locals 2

    const-class v0, LKm1;

    monitor-enter v0

    :try_start_0
    invoke-static {}, LAm1;->k()LAm1;

    move-result-object v1

    invoke-static {v1}, LKm1;->d(LAm1;)LKm1;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized d(LAm1;)LKm1;
    .locals 2

    const-class v0, LKm1;

    monitor-enter v0

    :try_start_0
    const-class v1, LKm1;

    invoke-virtual {p0, v1}, LAm1;->i(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LKm1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public abstract a()Lu81;
.end method

.method public abstract b(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "LbQ3;",
            ">;"
        }
    .end annotation
.end method
