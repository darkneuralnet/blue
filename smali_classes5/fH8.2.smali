.class public final LfH8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Landroid/content/SharedPreferences;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-class v0, Landroid/content/SharedPreferences;

    monitor-enter v0

    :try_start_0
    sget-object v1, LfH8;->a:Landroid/content/SharedPreferences;

    if-nez v1, :cond_0

    new-instance v1, LIN8;

    invoke-direct {v1, p0}, LIN8;-><init>(Landroid/content/Context;)V

    invoke-static {v1}, LX58;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/SharedPreferences;

    sput-object p0, LfH8;->a:Landroid/content/SharedPreferences;

    :cond_0
    sget-object p0, LfH8;->a:Landroid/content/SharedPreferences;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
