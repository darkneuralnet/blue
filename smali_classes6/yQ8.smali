.class public final LyQ8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation
.end field

.field public b:J
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation
.end field

.field public final c:LTs7;

.field public final synthetic d:LcR8;


# direct methods
.method public constructor <init>(LcR8;)V
    .locals 2

    iput-object p1, p0, LyQ8;->d:LcR8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LnQ8;

    iget-object v1, p1, Lns8;->a:LPn8;

    invoke-direct {v0, p0, v1}, LnQ8;-><init>(LyQ8;LQs8;)V

    iput-object v0, p0, LyQ8;->c:LTs7;

    iget-object p1, p1, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, LyQ8;->a:J

    iput-wide v0, p0, LyQ8;->b:J

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LyQ8;->c:LTs7;

    invoke-virtual {v0}, LTs7;->b()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LyQ8;->a:J

    iput-wide v0, p0, LyQ8;->b:J

    return-void
.end method

.method public final b(J)V
    .locals 0

    iget-object p1, p0, LyQ8;->c:LTs7;

    invoke-virtual {p1}, LTs7;->b()V

    return-void
.end method

.method public final c(J)V
    .locals 1

    iget-object v0, p0, LyQ8;->d:LcR8;

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, LyQ8;->c:LTs7;

    invoke-virtual {v0}, LTs7;->b()V

    iput-wide p1, p0, LyQ8;->a:J

    iput-wide p1, p0, LyQ8;->b:J

    return-void
.end method

.method public final d(ZZJ)Z
    .locals 4

    iget-object v0, p0, LyQ8;->d:LcR8;

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, LyQ8;->d:LcR8;

    invoke-virtual {v0}, Lwe8;->f()V

    invoke-static {}, Lte9;->b()Z

    iget-object v0, p0, LyQ8;->d:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, La98;->h0:LL88;

    invoke-virtual {v0, v1, v2}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LyQ8;->d:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LyQ8;->d:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->F()LIh8;

    move-result-object v0

    iget-object v0, v0, LIh8;->o:Lzg8;

    iget-object v1, p0, LyQ8;->d:LcR8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lzg8;->b(J)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LyQ8;->d:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->F()LIh8;

    move-result-object v0

    iget-object v0, v0, LIh8;->o:Lzg8;

    iget-object v1, p0, LyQ8;->d:LcR8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lzg8;->b(J)V

    :cond_1
    :goto_0
    iget-wide v0, p0, LyQ8;->a:J

    sub-long v0, p3, v0

    if-nez p1, :cond_3

    const-wide/16 v2, 0x3e8

    cmp-long p1, v0, v2

    if-ltz p1, :cond_2

    goto :goto_1

    :cond_2
    iget-object p1, p0, LyQ8;->d:LcR8;

    iget-object p1, p1, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->s()Lec8;

    move-result-object p1

    const-string p2, "Screen exposed for less than 1000 ms. Event not sent. time"

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_1
    if-nez p2, :cond_4

    iget-wide v0, p0, LyQ8;->b:J

    sub-long v0, p3, v0

    iput-wide p3, p0, LyQ8;->b:J

    :cond_4
    iget-object p1, p0, LyQ8;->d:LcR8;

    iget-object p1, p1, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->s()Lec8;

    move-result-object p1

    const-string v2, "Recording user engagement, ms"

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "_et"

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    iget-object v0, p0, LyQ8;->d:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    invoke-virtual {v0}, Lgl7;->D()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iget-object v2, p0, LyQ8;->d:LcR8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->K()LnG8;

    move-result-object v2

    invoke-virtual {v2, v0}, LnG8;->p(Z)LwE8;

    move-result-object v0

    invoke-static {v0, p1, v1}, LOW8;->v(LwE8;Landroid/os/Bundle;Z)V

    if-nez p2, :cond_5

    iget-object p2, p0, LyQ8;->d:LcR8;

    iget-object p2, p2, Lns8;->a:LPn8;

    invoke-virtual {p2}, LPn8;->I()LRC8;

    move-result-object p2

    const-string v0, "auto"

    const-string v2, "_e"

    invoke-virtual {p2, v0, v2, p1}, LRC8;->r(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_5
    iput-wide p3, p0, LyQ8;->a:J

    iget-object p1, p0, LyQ8;->c:LTs7;

    invoke-virtual {p1}, LTs7;->b()V

    iget-object p1, p0, LyQ8;->c:LTs7;

    const-wide/32 p2, 0x36ee80

    invoke-virtual {p1, p2, p3}, LTs7;->d(J)V

    return v1
.end method
