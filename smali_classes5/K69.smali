.class public final LK69;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:LC69;


# direct methods
.method public static declared-synchronized a(LL29;)Ly49;
    .locals 3

    const-class v0, LK69;

    monitor-enter v0

    :try_start_0
    sget-object v1, LK69;->a:LC69;

    if-nez v1, :cond_0

    new-instance v1, LC69;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LC69;-><init>(Lv69;)V

    sput-object v1, LK69;->a:LC69;

    :cond_0
    sget-object v1, LK69;->a:LC69;

    invoke-virtual {v1, p0}, LKn2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly49;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized b(Ljava/lang/String;)Ly49;
    .locals 1

    const-class v0, LK69;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, LL29;->d(Ljava/lang/String;)LB29;

    move-result-object p0

    invoke-virtual {p0}, LB29;->c()LL29;

    move-result-object p0

    invoke-static {p0}, LK69;->a(LL29;)Ly49;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
