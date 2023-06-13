.class public final LH69;
.super LX69;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LX69<",
        "LMb9;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lc69;

.field public final synthetic g:Le79;


# direct methods
.method public constructor <init>(Le79;Lc69;Ljava/util/concurrent/Executor;)V
    .locals 0

    iput-object p1, p0, LH69;->g:Le79;

    invoke-direct {p0, p1, p3}, LX69;-><init>(Le79;Ljava/util/concurrent/Executor;)V

    iput-object p2, p0, LH69;->f:Lc69;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LH69;->f:Lc69;

    invoke-interface {v0}, Lc69;->zza()LMb9;

    move-result-object v0

    const-string v1, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s"

    iget-object v2, p0, LH69;->f:Lc69;

    invoke-static {v0, v1, v2}, LyK8;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LH69;->f:Lc69;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic h(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, LMb9;

    iget-object v0, p0, LH69;->g:Le79;

    invoke-virtual {v0, p1}, Lv39;->g(LMb9;)Z

    return-void
.end method
