.class public final LcQ8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LRP8;

.field public final synthetic b:LcR8;


# direct methods
.method public constructor <init>(LcR8;)V
    .locals 0

    iput-object p1, p0, LcQ8;->b:LcR8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 7

    new-instance v6, LRP8;

    iget-object v0, p0, LcQ8;->b:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v2

    move-object v0, v6

    move-object v1, p0

    move-wide v4, p1

    invoke-direct/range {v0 .. v5}, LRP8;-><init>(LcQ8;JJ)V

    iput-object v6, p0, LcQ8;->a:LRP8;

    iget-object p1, p0, LcQ8;->b:LcR8;

    invoke-static {p1}, LcR8;->l(LcR8;)Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, LcQ8;->a:LRP8;

    const-wide/16 v0, 0x7d0

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, LcQ8;->b:LcR8;

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, LcQ8;->a:LRP8;

    if-eqz v0, :cond_0

    iget-object v1, p0, LcQ8;->b:LcR8;

    invoke-static {v1}, LcR8;->l(LcR8;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    iget-object v0, p0, LcQ8;->b:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->F()LIh8;

    move-result-object v0

    iget-object v0, v0, LIh8;->r:LVf8;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LVf8;->a(Z)V

    return-void
.end method
