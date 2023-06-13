.class public final LET8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:LbH8;


# direct methods
.method public static declared-synchronized a(Landroid/content/Context;)LbH8;
    .locals 3

    const-class v0, LET8;

    monitor-enter v0

    :try_start_0
    sget-object v1, LET8;->a:LbH8;

    if-nez v1, :cond_1

    new-instance v1, Ltt8;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ltt8;-><init>(Lsm8;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_0

    move-object p0, v2

    :cond_0
    invoke-virtual {v1, p0}, Ltt8;->a(Landroid/content/Context;)Ltt8;

    invoke-interface {v1}, LDN8;->zzb()LbH8;

    move-result-object p0

    sput-object p0, LET8;->a:LbH8;

    :cond_1
    sget-object p0, LET8;->a:LbH8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
