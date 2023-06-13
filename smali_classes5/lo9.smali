.class public final Llo9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lgo9;


# direct methods
.method public static declared-synchronized a(Ljm9;)Len9;
    .locals 3

    const-class v0, Llo9;

    monitor-enter v0

    :try_start_0
    sget-object v1, Llo9;->a:Lgo9;

    if-nez v1, :cond_0

    new-instance v1, Lgo9;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lgo9;-><init>(Lbo9;)V

    sput-object v1, Llo9;->a:Lgo9;

    :cond_0
    sget-object v1, Llo9;->a:Lgo9;

    invoke-virtual {v1, p0}, LKn2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Len9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized b(Ljava/lang/String;)Len9;
    .locals 1

    const-class v0, Llo9;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Ljm9;->d(Ljava/lang/String;)Ldm9;

    move-result-object p0

    invoke-virtual {p0}, Ldm9;->c()Ljm9;

    move-result-object p0

    invoke-static {p0}, Llo9;->a(Ljm9;)Len9;

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
