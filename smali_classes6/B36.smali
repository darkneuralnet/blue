.class public LB36;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/util/concurrent/Executor;

.field public static b:Ljava/util/concurrent/Executor;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, LB36;->a:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    new-instance v0, LB36$a;

    invoke-direct {v0}, LB36$a;-><init>()V

    sput-object v0, LB36;->a:Ljava/util/concurrent/Executor;

    :cond_0
    sget-object v0, LB36;->a:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public static b()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, LB36;->b:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    :cond_0
    return-object v0
.end method
