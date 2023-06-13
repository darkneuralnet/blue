.class public final LnQ8;
.super LTs7;
.source "SourceFile"


# instance fields
.field public final synthetic e:LyQ8;


# direct methods
.method public constructor <init>(LyQ8;LQs8;)V
    .locals 0

    iput-object p1, p0, LnQ8;->e:LyQ8;

    invoke-direct {p0, p2}, LTs7;-><init>(LQs8;)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    iget-object v0, p0, LnQ8;->e:LyQ8;

    iget-object v1, v0, LyQ8;->d:LcR8;

    invoke-virtual {v1}, Lns8;->e()V

    iget-object v1, v0, LyQ8;->d:LcR8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3, v1, v2}, LyQ8;->d(ZZJ)Z

    iget-object v1, v0, LyQ8;->d:LcR8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->v()LaY7;

    move-result-object v1

    iget-object v0, v0, LyQ8;->d:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LaY7;->k(J)V

    return-void
.end method
