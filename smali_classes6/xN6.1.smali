.class public final LxN6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGN6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResultT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LGN6<",
        "TResultT;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ljava/lang/Object;

.field public final c:Lnh3;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh3<",
            "-TResultT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lnh3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lnh3<",
            "-TResultT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LxN6;->b:Ljava/lang/Object;

    iput-object p1, p0, LxN6;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, LxN6;->c:Lnh3;

    return-void
.end method

.method public static synthetic b(LxN6;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LxN6;->b:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic c(LxN6;)Lnh3;
    .locals 0

    iget-object p0, p0, LxN6;->c:Lnh3;

    return-object p0
.end method


# virtual methods
.method public final a(LXY5;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXY5<",
            "TResultT;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, LXY5;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LxN6;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LxN6;->c:Lnh3;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LxN6;->a:Ljava/util/concurrent/Executor;

    new-instance v1, LjN6;

    invoke-direct {v1, p0, p1}, LjN6;-><init>(LxN6;LXY5;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_1
    return-void
.end method
