.class public LdE2$a;
.super Ljava/util/concurrent/FutureTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LdE2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/FutureTask<",
        "LbE2<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LdE2;


# direct methods
.method public constructor <init>(LdE2;Ljava/util/concurrent/Callable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "LbE2<",
            "TT;>;>;)V"
        }
    .end annotation

    iput-object p1, p0, LdE2$a;->b:LdE2;

    invoke-direct {p0, p2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    return-void
.end method


# virtual methods
.method public done()V
    .locals 3

    invoke-virtual {p0}, Ljava/util/concurrent/FutureTask;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, LdE2$a;->b:LdE2;

    invoke-virtual {p0}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LbE2;

    invoke-static {v0, v1}, LdE2;->b(LdE2;LbE2;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    iget-object v1, p0, LdE2$a;->b:LdE2;

    new-instance v2, LbE2;

    invoke-direct {v2, v0}, LbE2;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v1, v2}, LdE2;->b(LdE2;LbE2;)V

    :goto_1
    return-void
.end method
