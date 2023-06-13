.class public final LXZ8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:LXZ8;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()LXZ8;
    .locals 2

    const-class v0, LXZ8;

    monitor-enter v0

    :try_start_0
    sget-object v1, LXZ8;->a:LXZ8;

    if-nez v1, :cond_0

    new-instance v1, LXZ8;

    invoke-direct {v1}, LXZ8;-><init>()V

    sput-object v1, LXZ8;->a:LXZ8;

    :cond_0
    sget-object v1, LXZ8;->a:LXZ8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
