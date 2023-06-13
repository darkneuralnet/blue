.class public final Lzn9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ltn9;


# direct methods
.method public static declared-synchronized a(LOk9;)Lmm9;
    .locals 3

    const-class v0, Lzn9;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lzn9;->a:Ltn9;

    if-nez v1, :cond_0

    new-instance v1, Ltn9;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ltn9;-><init>(Lnn9;)V

    sput-object v1, Lzn9;->a:Ltn9;

    :cond_0
    sget-object v1, Lzn9;->a:Ltn9;

    invoke-virtual {v1, p0}, LKn2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmm9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized b(Ljava/lang/String;)Lmm9;
    .locals 1

    const-class v0, Lzn9;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, LOk9;->d(Ljava/lang/String;)LIk9;

    move-result-object p0

    invoke-virtual {p0}, LIk9;->c()LOk9;

    move-result-object p0

    invoke-static {p0}, Lzn9;->a(LOk9;)Lmm9;

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
