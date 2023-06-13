.class public abstract Landroidx/work/RxWorker;
.super Landroidx/work/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/RxWorker$a;
    }
.end annotation


# static fields
.field public static final g:Ljava/util/concurrent/Executor;


# instance fields
.field public f:Landroidx/work/RxWorker$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/work/RxWorker$a<",
            "Landroidx/work/c$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LSX5;

    invoke-direct {v0}, LSX5;-><init>()V

    sput-object v0, Landroidx/work/RxWorker;->g:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/work/c;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    return-void
.end method


# virtual methods
.method public d()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "LYw1;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/work/RxWorker$a;

    invoke-direct {v0}, Landroidx/work/RxWorker$a;-><init>()V

    invoke-virtual {p0}, Landroidx/work/RxWorker;->t()Lio/reactivex/F;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroidx/work/RxWorker;->q(Landroidx/work/RxWorker$a;Lio/reactivex/F;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public m()V
    .locals 1

    invoke-super {p0}, Landroidx/work/c;->m()V

    iget-object v0, p0, Landroidx/work/RxWorker;->f:Landroidx/work/RxWorker$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/work/RxWorker$a;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/work/RxWorker;->f:Landroidx/work/RxWorker$a;

    :cond_0
    return-void
.end method

.method public o()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/work/c$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/work/RxWorker$a;

    invoke-direct {v0}, Landroidx/work/RxWorker$a;-><init>()V

    iput-object v0, p0, Landroidx/work/RxWorker;->f:Landroidx/work/RxWorker$a;

    invoke-virtual {p0}, Landroidx/work/RxWorker;->r()Lio/reactivex/F;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroidx/work/RxWorker;->q(Landroidx/work/RxWorker$a;Lio/reactivex/F;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public final q(Landroidx/work/RxWorker$a;Lio/reactivex/F;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/work/RxWorker$a<",
            "TT;>;",
            "Lio/reactivex/F<",
            "TT;>;)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/work/RxWorker;->s()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p2, v0}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/work/c;->i()LmZ5;

    move-result-object v0

    invoke-interface {v0}, LmZ5;->c()LRs5;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/schedulers/a;->b(Ljava/util/concurrent/Executor;)Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p2, v0}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p2

    invoke-virtual {p2, p1}, Lio/reactivex/F;->a(Lio/reactivex/I;)V

    iget-object p1, p1, Landroidx/work/RxWorker$a;->b:Lew5;

    return-object p1
.end method

.method public abstract r()Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Landroidx/work/c$a;",
            ">;"
        }
    .end annotation
.end method

.method public s()Lio/reactivex/E;
    .locals 1

    invoke-virtual {p0}, Landroidx/work/c;->c()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/schedulers/a;->b(Ljava/util/concurrent/Executor;)Lio/reactivex/E;

    move-result-object v0

    return-object v0
.end method

.method public t()Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "LYw1;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expedited WorkRequests require a RxWorker to provide an implementation for `getForegroundInfo()`"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method
