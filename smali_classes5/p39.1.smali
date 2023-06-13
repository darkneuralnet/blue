.class public final Lp39;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:LT29;


# direct methods
.method public static declared-synchronized a(Lx09;)Lt19;
    .locals 3

    const-class v0, Lp39;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lp39;->a:LT29;

    if-nez v1, :cond_0

    new-instance v1, LT29;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LT29;-><init>(LK29;)V

    sput-object v1, Lp39;->a:LT29;

    :cond_0
    sget-object v1, Lp39;->a:LT29;

    invoke-virtual {v1, p0}, LKn2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lt19;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized b(Ljava/lang/String;)Lt19;
    .locals 1

    const-class p0, Lp39;

    monitor-enter p0

    :try_start_0
    const-string v0, "vision-common"

    invoke-static {v0}, Lx09;->d(Ljava/lang/String;)Lo09;

    move-result-object v0

    invoke-virtual {v0}, Lo09;->c()Lx09;

    move-result-object v0

    invoke-static {v0}, Lp39;->a(Lx09;)Lt19;

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
