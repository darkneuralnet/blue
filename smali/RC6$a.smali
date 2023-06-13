.class public LRC6$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRC6;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lew5;

.field public final synthetic c:LRC6;


# direct methods
.method public constructor <init>(LRC6;Lew5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LRC6$a;->c:LRC6;

    iput-object p2, p0, LRC6$a;->b:Lew5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, LRC6$a;->c:LRC6;

    iget-object v0, v0, LRC6;->b:Lew5;

    invoke-virtual {v0}, Lw0;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, LRC6$a;->b:Lew5;

    invoke-virtual {v0}, Lw0;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYw1;

    if-eqz v0, :cond_1

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v1

    sget-object v2, LRC6;->h:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Updating notification for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, LRC6$a;->c:LRC6;

    iget-object v4, v4, LRC6;->d:LHG6;

    iget-object v4, v4, LHG6;->c:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, LRC6$a;->c:LRC6;

    iget-object v2, v1, LRC6;->b:Lew5;

    iget-object v3, v1, LRC6;->f:Lsx1;

    iget-object v4, v1, LRC6;->c:Landroid/content/Context;

    iget-object v1, v1, LRC6;->e:Landroidx/work/c;

    invoke-virtual {v1}, Landroidx/work/c;->e()Ljava/util/UUID;

    move-result-object v1

    invoke-interface {v3, v4, v1, v0}, Lsx1;->a(Landroid/content/Context;Ljava/util/UUID;LYw1;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    invoke-virtual {v2, v0}, Lew5;->r(Lcom/google/common/util/concurrent/ListenableFuture;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Worker was marked important ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LRC6$a;->c:LRC6;

    iget-object v1, v1, LRC6;->d:LHG6;

    iget-object v1, v1, LHG6;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ") but did not provide ForegroundInfo"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, LRC6$a;->c:LRC6;

    iget-object v1, v1, LRC6;->b:Lew5;

    invoke-virtual {v1, v0}, Lew5;->q(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method
