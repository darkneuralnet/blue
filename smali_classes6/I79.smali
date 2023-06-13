.class public final LI79;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lke9;

.field public final synthetic c:LMd9;

.field public final synthetic d:LMb9;

.field public final synthetic e:LMb9;

.field public final synthetic f:LW79;


# direct methods
.method public constructor <init>(Ll89;Lke9;LMd9;LMb9;LMb9;LW79;)V
    .locals 0

    iput-object p2, p0, LI79;->b:Lke9;

    iput-object p3, p0, LI79;->c:LMd9;

    iput-object p4, p0, LI79;->d:LMb9;

    iput-object p5, p0, LI79;->e:LMb9;

    iput-object p6, p0, LI79;->f:LW79;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LI79;->b:Lke9;

    invoke-virtual {v0}, Lv39;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LI79;->c:LMd9;

    iget-object v1, p0, LI79;->d:LMb9;

    invoke-virtual {v0, v1}, Lv39;->g(LMb9;)Z

    return-void

    :cond_0
    iget-object v0, p0, LI79;->e:LMb9;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LI79;->f:LW79;

    sget-object v1, LO79;->b:LO79;

    sget-object v2, LO79;->c:LO79;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LI79;->b:Lke9;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lv39;->cancel(Z)Z

    :cond_1
    return-void
.end method
