.class public final Lpt8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:J

.field public B:J

.field public C:J

.field public D:Ljava/lang/String;

.field public E:Z

.field public F:J

.field public G:J

.field public final a:LPn8;

.field public final b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:J

.field public h:J

.field public i:J

.field public j:Ljava/lang/String;

.field public k:J

.field public l:Ljava/lang/String;

.field public m:J

.field public n:J

.field public o:Z

.field public p:Z

.field public q:Ljava/lang/String;

.field public r:Ljava/lang/Boolean;

.field public s:J

.field public t:Ljava/util/List;

.field public u:Ljava/lang/String;

.field public v:Z

.field public w:J

.field public x:J

.field public y:J

.field public z:J


# direct methods
.method public constructor <init>(LPn8;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    iput-object p1, p0, Lpt8;->a:LPn8;

    iput-object p2, p0, Lpt8;->b:Ljava/lang/String;

    invoke-virtual {p1}, LPn8;->c()Ldn8;

    move-result-object p1

    invoke-virtual {p1}, Lns8;->e()V

    return-void
.end method


# virtual methods
.method public final A()J
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final B(J)V
    .locals 3

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-wide v1, p0, Lpt8;->i:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-wide p1, p0, Lpt8;->i:J

    return-void
.end method

.method public final C(J)V
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ltz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(Z)V

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-wide v3, p0, Lpt8;->g:J

    cmp-long v3, v3, p1

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-wide p1, p0, Lpt8;->g:J

    return-void
.end method

.method public final D(J)V
    .locals 3

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-wide v1, p0, Lpt8;->h:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-wide p1, p0, Lpt8;->h:J

    return-void
.end method

.method public final E(Z)V
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-boolean v1, p0, Lpt8;->o:Z

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-boolean p1, p0, Lpt8;->o:Z

    return-void
.end method

.method public final F(Ljava/lang/Boolean;)V
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-object v1, p0, Lpt8;->r:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lnm8;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-object p1, p0, Lpt8;->r:Ljava/lang/Boolean;

    return-void
.end method

.method public final G(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-object v1, p0, Lpt8;->e:Ljava/lang/String;

    invoke-static {v1, p1}, Lnm8;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-object p1, p0, Lpt8;->e:Ljava/lang/String;

    return-void
.end method

.method public final H(Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, Lpt8;->t:Ljava/util/List;

    invoke-static {v0, p1}, Lnm8;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpt8;->E:Z

    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lpt8;->t:Ljava/util/List;

    :cond_1
    return-void
.end method

.method public final I(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-object v1, p0, Lpt8;->u:Ljava/lang/String;

    invoke-static {v1, p1}, Lnm8;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-object p1, p0, Lpt8;->u:Ljava/lang/String;

    return-void
.end method

.method public final J(Z)V
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-boolean v1, p0, Lpt8;->v:Z

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-boolean p1, p0, Lpt8;->v:Z

    return-void
.end method

.method public final K(J)V
    .locals 3

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-wide v1, p0, Lpt8;->w:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-wide p1, p0, Lpt8;->w:J

    return-void
.end method

.method public final L()Z
    .locals 1

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->p:Z

    return v0
.end method

.method public final M()Z
    .locals 1

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->o:Z

    return v0
.end method

.method public final N()Z
    .locals 1

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    return v0
.end method

.method public final O()Z
    .locals 1

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->v:Z

    return v0
.end method

.method public final P()J
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-wide v0, p0, Lpt8;->k:J

    return-wide v0
.end method

.method public final Q()J
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-wide v0, p0, Lpt8;->F:J

    return-wide v0
.end method

.method public final R()J
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-wide v0, p0, Lpt8;->A:J

    return-wide v0
.end method

.method public final S()J
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-wide v0, p0, Lpt8;->B:J

    return-wide v0
.end method

.method public final T()J
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-wide v0, p0, Lpt8;->z:J

    return-wide v0
.end method

.method public final U()J
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-wide v0, p0, Lpt8;->y:J

    return-wide v0
.end method

.method public final V()J
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-wide v0, p0, Lpt8;->C:J

    return-wide v0
.end method

.method public final W()J
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-wide v0, p0, Lpt8;->x:J

    return-wide v0
.end method

.method public final X()J
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-wide v0, p0, Lpt8;->n:J

    return-wide v0
.end method

.method public final Y()J
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-wide v0, p0, Lpt8;->s:J

    return-wide v0
.end method

.method public final Z()J
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-wide v0, p0, Lpt8;->G:J

    return-wide v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, Lpt8;->D:Ljava/lang/String;

    return-object v0
.end method

.method public final a0()J
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-wide v0, p0, Lpt8;->m:J

    return-wide v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, Lpt8;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final b0()J
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-wide v0, p0, Lpt8;->i:J

    return-wide v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, Lpt8;->u:Ljava/lang/String;

    return-object v0
.end method

.method public final c0()J
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-wide v0, p0, Lpt8;->g:J

    return-wide v0
.end method

.method public final d()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, Lpt8;->t:Ljava/util/List;

    return-object v0
.end method

.method public final d0()J
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-wide v0, p0, Lpt8;->h:J

    return-wide v0
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lpt8;->E:Z

    return-void
.end method

.method public final e0()J
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-wide v0, p0, Lpt8;->w:J

    return-wide v0
.end method

.method public final f()V
    .locals 4

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-wide v0, p0, Lpt8;->g:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->t()Lec8;

    move-result-object v0

    iget-object v1, p0, Lpt8;->b:Ljava/lang/String;

    invoke-static {v1}, LFc8;->w(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Bundle index overflow. appId"

    invoke-virtual {v0, v2, v1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    :cond_0
    const/4 v2, 0x1

    iput-boolean v2, p0, Lpt8;->E:Z

    iput-wide v0, p0, Lpt8;->g:J

    return-void
.end method

.method public final f0()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, Lpt8;->r:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final g(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    iget-boolean v0, p0, Lpt8;->E:Z

    iget-object v2, p0, Lpt8;->q:Ljava/lang/String;

    invoke-static {v2, p1}, Lnm8;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    xor-int/2addr v1, v2

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-object p1, p0, Lpt8;->q:Ljava/lang/String;

    return-void
.end method

.method public final g0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, Lpt8;->q:Ljava/lang/String;

    return-object v0
.end method

.method public final h(Z)V
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-boolean v1, p0, Lpt8;->p:Z

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-boolean p1, p0, Lpt8;->p:Z

    return-void
.end method

.method public final h0()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, Lpt8;->D:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lpt8;->z(Ljava/lang/String;)V

    return-object v0
.end method

.method public final i(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-object v1, p0, Lpt8;->c:Ljava/lang/String;

    invoke-static {v1, p1}, Lnm8;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-object p1, p0, Lpt8;->c:Ljava/lang/String;

    return-void
.end method

.method public final i0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, Lpt8;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final j(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-object v1, p0, Lpt8;->l:Ljava/lang/String;

    invoke-static {v1, p1}, Lnm8;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-object p1, p0, Lpt8;->l:Ljava/lang/String;

    return-void
.end method

.method public final j0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, Lpt8;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final k(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-object v1, p0, Lpt8;->j:Ljava/lang/String;

    invoke-static {v1, p1}, Lnm8;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-object p1, p0, Lpt8;->j:Ljava/lang/String;

    return-void
.end method

.method public final k0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, Lpt8;->l:Ljava/lang/String;

    return-object v0
.end method

.method public final l(J)V
    .locals 3

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-wide v1, p0, Lpt8;->k:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-wide p1, p0, Lpt8;->k:J

    return-void
.end method

.method public final l0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, Lpt8;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final m(J)V
    .locals 3

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-wide v1, p0, Lpt8;->F:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-wide p1, p0, Lpt8;->F:J

    return-void
.end method

.method public final m0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, Lpt8;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final n(J)V
    .locals 3

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-wide v1, p0, Lpt8;->A:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-wide p1, p0, Lpt8;->A:J

    return-void
.end method

.method public final n0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, Lpt8;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final o(J)V
    .locals 3

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-wide v1, p0, Lpt8;->B:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-wide p1, p0, Lpt8;->B:J

    return-void
.end method

.method public final p(J)V
    .locals 3

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-wide v1, p0, Lpt8;->z:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-wide p1, p0, Lpt8;->z:J

    return-void
.end method

.method public final q(J)V
    .locals 3

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-wide v1, p0, Lpt8;->y:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-wide p1, p0, Lpt8;->y:J

    return-void
.end method

.method public final r(J)V
    .locals 3

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-wide v1, p0, Lpt8;->C:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-wide p1, p0, Lpt8;->C:J

    return-void
.end method

.method public final s(J)V
    .locals 3

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-wide v1, p0, Lpt8;->x:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-wide p1, p0, Lpt8;->x:J

    return-void
.end method

.method public final t(J)V
    .locals 3

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-wide v1, p0, Lpt8;->n:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-wide p1, p0, Lpt8;->n:J

    return-void
.end method

.method public final u(J)V
    .locals 3

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-wide v1, p0, Lpt8;->s:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-wide p1, p0, Lpt8;->s:J

    return-void
.end method

.method public final v(J)V
    .locals 3

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-wide v1, p0, Lpt8;->G:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-wide p1, p0, Lpt8;->G:J

    return-void
.end method

.method public final w(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-object v1, p0, Lpt8;->f:Ljava/lang/String;

    invoke-static {v1, p1}, Lnm8;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-object p1, p0, Lpt8;->f:Ljava/lang/String;

    return-void
.end method

.method public final x(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    iget-boolean v0, p0, Lpt8;->E:Z

    iget-object v2, p0, Lpt8;->d:Ljava/lang/String;

    invoke-static {v2, p1}, Lnm8;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    xor-int/2addr v1, v2

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-object p1, p0, Lpt8;->d:Ljava/lang/String;

    return-void
.end method

.method public final y(J)V
    .locals 3

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-wide v1, p0, Lpt8;->m:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-wide p1, p0, Lpt8;->m:J

    return-void
.end method

.method public final z(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lpt8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, Lpt8;->E:Z

    iget-object v1, p0, Lpt8;->D:Ljava/lang/String;

    invoke-static {v1, p1}, Lnm8;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lpt8;->E:Z

    iput-object p1, p0, Lpt8;->D:Ljava/lang/String;

    return-void
.end method
