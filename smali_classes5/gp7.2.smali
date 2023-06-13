.class public final Lgp7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lfp7;


# direct methods
.method public static declared-synchronized a(Luo7;)LAo7;
    .locals 3

    const-class v0, Lgp7;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lgp7;->a:Lfp7;

    if-nez v1, :cond_0

    new-instance v1, Lfp7;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lfp7;-><init>(Lep7;)V

    sput-object v1, Lgp7;->a:Lfp7;

    :cond_0
    sget-object v1, Lgp7;->a:Lfp7;

    invoke-virtual {v1, p0}, LKn2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LAo7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized b(Ljava/lang/String;)LAo7;
    .locals 1

    const-class v0, Lgp7;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Luo7;->d(Ljava/lang/String;)Lto7;

    move-result-object p0

    invoke-virtual {p0}, Lto7;->c()Luo7;

    move-result-object p0

    invoke-static {p0}, Lgp7;->a(Luo7;)LAo7;

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
