.class public final LcR8;
.super Lwe8;
.source "SourceFile"


# instance fields
.field public c:Landroid/os/Handler;

.field public final d:LJQ8;

.field public final e:LyQ8;

.field public final f:LcQ8;


# direct methods
.method public constructor <init>(LPn8;)V
    .locals 0

    invoke-direct {p0, p1}, Lwe8;-><init>(LPn8;)V

    new-instance p1, LJQ8;

    invoke-direct {p1, p0}, LJQ8;-><init>(LcR8;)V

    iput-object p1, p0, LcR8;->d:LJQ8;

    new-instance p1, LyQ8;

    invoke-direct {p1, p0}, LyQ8;-><init>(LcR8;)V

    iput-object p1, p0, LcR8;->e:LyQ8;

    new-instance p1, LcQ8;

    invoke-direct {p1, p0}, LcQ8;-><init>(LcR8;)V

    iput-object p1, p0, LcR8;->f:LcQ8;

    return-void
.end method

.method public static bridge synthetic l(LcR8;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, LcR8;->c:Landroid/os/Handler;

    return-object p0
.end method

.method public static bridge synthetic m(LcR8;)V
    .locals 0

    invoke-virtual {p0}, LcR8;->p()V

    return-void
.end method

.method public static bridge synthetic n(LcR8;J)V
    .locals 3

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, LcR8;->p()V

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v1, "Activity paused, time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, LcR8;->f:LcQ8;

    invoke-virtual {v0, p1, p2}, LcQ8;->a(J)V

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    invoke-virtual {v0}, Lgl7;->D()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, LcR8;->e:LyQ8;

    invoke-virtual {p0, p1, p2}, LyQ8;->b(J)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic o(LcR8;J)V
    .locals 3

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, LcR8;->p()V

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v1, "Activity resumed, time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    invoke-virtual {v0}, Lgl7;->D()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->F()LIh8;

    move-result-object v0

    iget-object v0, v0, LIh8;->r:LVf8;

    invoke-virtual {v0}, LVf8;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, LcR8;->e:LyQ8;

    invoke-virtual {v0, p1, p2}, LyQ8;->c(J)V

    :cond_1
    iget-object p1, p0, LcR8;->f:LcQ8;

    invoke-virtual {p1}, LcQ8;->b()V

    iget-object p0, p0, LcR8;->d:LJQ8;

    iget-object p1, p0, LJQ8;->a:LcR8;

    invoke-virtual {p1}, Lns8;->e()V

    iget-object p1, p0, LJQ8;->a:LcR8;

    iget-object p1, p1, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->l()Z

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    iget-object p1, p0, LJQ8;->a:LcR8;

    iget-object p1, p1, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, LJQ8;->b(JZ)V

    return-void
.end method


# virtual methods
.method public final k()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final p()V
    .locals 2

    invoke-virtual {p0}, Lns8;->e()V

    iget-object v0, p0, LcR8;->c:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, LUO7;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, LUO7;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, LcR8;->c:Landroid/os/Handler;

    :cond_0
    return-void
.end method
