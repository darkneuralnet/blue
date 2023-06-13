.class public final LZ39;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:LZ39;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()LZ39;
    .locals 2

    const-class v0, LZ39;

    monitor-enter v0

    :try_start_0
    sget-object v1, LZ39;->a:LZ39;

    if-nez v1, :cond_0

    new-instance v1, LZ39;

    invoke-direct {v1}, LZ39;-><init>()V

    sput-object v1, LZ39;->a:LZ39;

    :cond_0
    sget-object v1, LZ39;->a:LZ39;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static final b()Z
    .locals 1

    const-string v0, "mlkit-dev-profiling"

    invoke-static {v0}, LQ39;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
