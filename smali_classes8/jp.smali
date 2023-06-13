.class public Ljp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements LJY3;


# instance fields
.field public final b:LfQ3;

.field public final c:LBg1;


# direct methods
.method public constructor <init>(LBg1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljp;->c:LBg1;

    new-instance p1, LfQ3;

    invoke-direct {p1}, LfQ3;-><init>()V

    iput-object p1, p0, Ljp;->b:LfQ3;

    return-void
.end method


# virtual methods
.method public a(LpT5;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p1, p2}, LeQ3;->a(LpT5;Ljava/lang/Object;)LeQ3;

    move-result-object p1

    iget-object p2, p0, Ljp;->b:LfQ3;

    invoke-virtual {p2, p1}, LfQ3;->a(LeQ3;)V

    iget-object p1, p0, Ljp;->c:LBg1;

    invoke-virtual {p1}, LBg1;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Ljp;->b:LfQ3;

    invoke-virtual {v0}, LfQ3;->b()LeQ3;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Ljp;->c:LBg1;

    invoke-virtual {v1, v0}, LBg1;->g(LeQ3;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No pending post available"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
