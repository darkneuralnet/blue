.class public Lrn1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>(LAm1;LpP5;Ljava/util/concurrent/Executor;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, LAm1;->j()Landroid/content/Context;

    move-result-object p1

    invoke-static {}, LBv0;->g()LBv0;

    move-result-object v0

    invoke-virtual {v0, p1}, LBv0;->O(Landroid/content/Context;)V

    invoke-static {}, Lnl;->b()Lnl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnl;->i(Landroid/content/Context;)V

    new-instance v1, Lzn1;

    invoke-direct {v1}, Lzn1;-><init>()V

    invoke-virtual {v0, v1}, Lnl;->j(Lnl$a;)V

    if-eqz p2, :cond_0

    invoke-static {}, Lcom/google/firebase/perf/metrics/AppStartTrace;->o()Lcom/google/firebase/perf/metrics/AppStartTrace;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/firebase/perf/metrics/AppStartTrace;->z(Landroid/content/Context;)V

    new-instance p1, Lcom/google/firebase/perf/metrics/AppStartTrace$c;

    invoke-direct {p1, p2}, Lcom/google/firebase/perf/metrics/AppStartTrace$c;-><init>(Lcom/google/firebase/perf/metrics/AppStartTrace;)V

    invoke-interface {p3, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/perf/session/SessionManager;->initializeGaugeCollection()V

    return-void
.end method
