.class public final LJe7;
.super LZX7;
.source "SourceFile"


# instance fields
.field public final a:LPn8;

.field public final b:LRC8;


# direct methods
.method public constructor <init>(LPn8;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LZX7;-><init>(LRP7;)V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LJe7;->a:LPn8;

    invoke-virtual {p1}, LPn8;->I()LRC8;

    move-result-object p1

    iput-object p1, p0, LJe7;->b:LRC8;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LJe7;->b:LRC8;

    invoke-virtual {v0}, LRC8;->V()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LJe7;->b:LRC8;

    invoke-virtual {v0, p1, p2, p3}, LRC8;->o(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LJe7;->b:LRC8;

    invoke-virtual {v0}, LRC8;->X()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LJe7;->a:LPn8;

    invoke-virtual {v0}, LPn8;->v()LaY7;

    move-result-object v0

    iget-object v1, p0, LJe7;->a:LPn8;

    invoke-virtual {v1}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, LaY7;->i(Ljava/lang/String;J)V

    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LJe7;->a:LPn8;

    invoke-virtual {v0}, LPn8;->v()LaY7;

    move-result-object v0

    iget-object v1, p0, LJe7;->a:LPn8;

    invoke-virtual {v1}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, LaY7;->j(Ljava/lang/String;J)V

    return-void
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LJe7;->b:LRC8;

    invoke-virtual {v0, p1, p2, p3}, LRC8;->a0(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, LJe7;->b:LRC8;

    invoke-virtual {v0, p1, p2}, LRC8;->Z(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final h(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LJe7;->b:LRC8;

    invoke-virtual {v0, p1}, LRC8;->D(Landroid/os/Bundle;)V

    return-void
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LJe7;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, LRC8;->l(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, LJe7;->b:LRC8;

    invoke-virtual {v0, p1}, LRC8;->Q(Ljava/lang/String;)I

    const/16 p1, 0x19

    return p1
.end method

.method public final zzb()J
    .locals 2

    iget-object v0, p0, LJe7;->a:LPn8;

    invoke-virtual {v0}, LPn8;->N()LOW8;

    move-result-object v0

    invoke-virtual {v0}, LOW8;->t0()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzh()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LJe7;->b:LRC8;

    invoke-virtual {v0}, LRC8;->V()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzi()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LJe7;->b:LRC8;

    invoke-virtual {v0}, LRC8;->W()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
