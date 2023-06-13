.class public final LKi9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:LKi9;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()LKi9;
    .locals 2

    const-class v0, LKi9;

    monitor-enter v0

    :try_start_0
    sget-object v1, LKi9;->a:LKi9;

    if-nez v1, :cond_0

    new-instance v1, LKi9;

    invoke-direct {v1}, LKi9;-><init>()V

    sput-object v1, LKi9;->a:LKi9;

    :cond_0
    sget-object v1, LKi9;->a:LKi9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static b()V
    .locals 0

    invoke-static {}, LCi9;->a()V

    return-void
.end method
