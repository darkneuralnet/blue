.class public final Ln49;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LMb9;

.field public final synthetic c:I

.field public final synthetic d:LD49;


# direct methods
.method public constructor <init>(LD49;LMb9;I)V
    .locals 0

    iput-object p1, p0, Ln49;->d:LD49;

    iput-object p2, p0, Ln49;->b:LMb9;

    iput p3, p0, Ln49;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Ln49;->b:LMb9;

    invoke-interface {v1}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ln49;->d:LD49;

    invoke-static {v1, v0}, LD49;->O(LD49;LXO8;)LXO8;

    iget-object v1, p0, Ln49;->d:LD49;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lv39;->cancel(Z)Z

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ln49;->d:LD49;

    iget v2, p0, Ln49;->c:I

    iget-object v3, p0, Ln49;->b:LMb9;

    invoke-static {v1, v2, v3}, LD49;->P(LD49;ILjava/util/concurrent/Future;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iget-object v1, p0, Ln49;->d:LD49;

    invoke-static {v1, v0}, LD49;->Q(LD49;LXO8;)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Ln49;->d:LD49;

    invoke-static {v2, v0}, LD49;->Q(LD49;LXO8;)V

    throw v1
.end method
