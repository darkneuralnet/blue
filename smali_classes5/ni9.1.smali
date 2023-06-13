.class public final Lni9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lfi9;


# direct methods
.method public static declared-synchronized a(Lmf9;)Lgg9;
    .locals 3

    const-class v0, Lni9;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lni9;->a:Lfi9;

    if-nez v1, :cond_0

    new-instance v1, Lfi9;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lfi9;-><init>(LXh9;)V

    sput-object v1, Lni9;->a:Lfi9;

    :cond_0
    sget-object v1, Lni9;->a:Lfi9;

    invoke-virtual {v1, p0}, LKn2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized b(Ljava/lang/String;)Lgg9;
    .locals 1

    const-class p0, Lni9;

    monitor-enter p0

    :try_start_0
    const-string v0, "common"

    invoke-static {v0}, Lmf9;->d(Ljava/lang/String;)Lef9;

    move-result-object v0

    invoke-virtual {v0}, Lef9;->c()Lmf9;

    move-result-object v0

    invoke-static {v0}, Lni9;->a(Lmf9;)Lgg9;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
