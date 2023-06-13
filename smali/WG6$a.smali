.class public LWG6$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWG6;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/google/common/util/concurrent/ListenableFuture;

.field public final synthetic c:LWG6;


# direct methods
.method public constructor <init>(LWG6;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LWG6$a;->c:LWG6;

    iput-object p2, p0, LWG6$a;->b:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, LWG6$a;->c:LWG6;

    iget-object v0, v0, LWG6;->r:Lew5;

    invoke-virtual {v0}, Lw0;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, LWG6$a;->b:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v0

    sget-object v1, LWG6;->t:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Starting work for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LWG6$a;->c:LWG6;

    iget-object v3, v3, LWG6;->f:LHG6;

    iget-object v3, v3, LHG6;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LWG6$a;->c:LWG6;

    iget-object v1, v0, LWG6;->r:Lew5;

    iget-object v0, v0, LWG6;->g:Landroidx/work/c;

    invoke-virtual {v0}, Landroidx/work/c;->o()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    invoke-virtual {v1, v0}, Lew5;->r(Lcom/google/common/util/concurrent/ListenableFuture;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, LWG6$a;->c:LWG6;

    iget-object v1, v1, LWG6;->r:Lew5;

    invoke-virtual {v1, v0}, Lew5;->q(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method
