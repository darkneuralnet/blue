.class public LbW5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUV5;


# instance fields
.field public final a:LTV5;

.field public final b:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(LTV5;Ljava/util/concurrent/Executor;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    instance-of v0, p1, LUV5;

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "SurfaceProcessorInternal should always be thread safe. Do not wrap."

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    iput-object p1, p0, LbW5;->a:LTV5;

    iput-object p2, p0, LbW5;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic c(LbW5;Landroidx/camera/core/o;)V
    .locals 0

    invoke-direct {p0, p1}, LbW5;->e(Landroidx/camera/core/o;)V

    return-void
.end method

.method public static synthetic d(LbW5;LPV5;)V
    .locals 0

    invoke-direct {p0, p1}, LbW5;->f(LPV5;)V

    return-void
.end method

.method private synthetic e(Landroidx/camera/core/o;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LbW5;->a:LTV5;

    invoke-interface {v0, p1}, LTV5;->b(Landroidx/camera/core/o;)V
    :try_end_0
    .catch Landroidx/camera/core/ProcessingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "SurfaceProcessor"

    const-string v1, "Failed to setup SurfaceProcessor input."

    invoke-static {v0, v1, p1}, LJx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic f(LPV5;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LbW5;->a:LTV5;

    invoke-interface {v0, p1}, LTV5;->a(LPV5;)V
    :try_end_0
    .catch Landroidx/camera/core/ProcessingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "SurfaceProcessor"

    const-string v1, "Failed to setup SurfaceProcessor output."

    invoke-static {v0, v1, p1}, LJx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(LPV5;)V
    .locals 2

    iget-object v0, p0, LbW5;->b:Ljava/util/concurrent/Executor;

    new-instance v1, LaW5;

    invoke-direct {v1, p0, p1}, LaW5;-><init>(LbW5;LPV5;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Landroidx/camera/core/o;)V
    .locals 2

    iget-object v0, p0, LbW5;->b:Ljava/util/concurrent/Executor;

    new-instance v1, LZV5;

    invoke-direct {v1, p0, p1}, LZV5;-><init>(LbW5;Landroidx/camera/core/o;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public release()V
    .locals 0

    return-void
.end method
