.class public final LQy0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZd3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LZd3<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final b:LQy0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LQy0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LQy0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LQy0;-><init>(Ljava/lang/Object;)V

    sput-object v0, LQy0;->b:LQy0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LIA1;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    iput-object p1, p0, LQy0;->a:Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method

.method public static synthetic a(LQy0;LZd3$a;)V
    .locals 0

    invoke-direct {p0, p1}, LQy0;->e(LZd3$a;)V

    return-void
.end method

.method private synthetic e(LZd3$a;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, LQy0;->a:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, LZd3$a;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    invoke-interface {p1, v0}, LZd3$a;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public static f(Ljava/lang/Object;)LZd3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(TU;)",
            "LZd3<",
            "TU;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    sget-object p0, LQy0;->b:LQy0;

    return-object p0

    :cond_0
    new-instance v0, LQy0;

    invoke-direct {v0, p0}, LQy0;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public b(LZd3$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd3$a<",
            "-TT;>;)V"
        }
    .end annotation

    return-void
.end method

.method public c(Ljava/util/concurrent/Executor;LZd3$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "LZd3$a<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, LQy0;->a:Lcom/google/common/util/concurrent/ListenableFuture;

    new-instance v1, LPy0;

    invoke-direct {v1, p0, p2}, LPy0;-><init>(LQy0;LZd3$a;)V

    invoke-interface {v0, v1, p1}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public d()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LQy0;->a:Lcom/google/common/util/concurrent/ListenableFuture;

    return-object v0
.end method
