.class public LrA3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LpA3;

.field public b:Lf32;

.field public c:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "LnA3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LpA3;Lf32;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrA3;->a:LpA3;

    iput-object p2, p0, LrA3;->b:Lf32;

    invoke-virtual {p1}, LpA3;->b()Ljava/util/Collection;

    move-result-object p1

    iput-object p1, p0, LrA3;->c:Ljava/util/Collection;

    return-void
.end method

.method public static b(Ljava/util/Collection;I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LnA3;",
            ">;I)",
            "Ljava/util/List<",
            "LnA3;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LnA3;

    invoke-virtual {v1}, LnA3;->x()LqA3;

    move-result-object v2

    invoke-virtual {v2, p1}, LqA3;->z(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2, p1}, LqA3;->y(I)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static c(LnA3;I)LnA3;
    .locals 3

    move-object v0, p0

    :cond_0
    invoke-virtual {v0}, LnA3;->x()LqA3;

    move-result-object v1

    invoke-virtual {v1, p1}, LqA3;->k(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, p1}, LqA3;->f(I)Z

    move-result p0

    invoke-static {p0}, LKo;->c(Z)V

    return-object v0

    :cond_1
    invoke-virtual {v0}, LFE1;->l()LFE1;

    move-result-object v0

    check-cast v0, LnA3;

    if-ne v0, p0, :cond_0

    const/4 p0, 0x0

    return-object p0
.end method

.method public static n(LnA3;IZLjava/util/Deque;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LnA3;",
            "IZ",
            "Ljava/util/Deque<",
            "LnA3;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, LnA3;->x()LqA3;

    move-result-object v0

    invoke-virtual {v0, p1}, LqA3;->c(I)I

    move-result v0

    if-eqz p2, :cond_0

    const/4 p2, 0x2

    if-eq v0, p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LnA3;->O()LnA3;

    move-result-object p2

    :cond_1
    invoke-virtual {p2}, LnA3;->x()LqA3;

    move-result-object v1

    invoke-virtual {v1, p1}, LqA3;->y(I)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1, p1, v0}, LqA3;->E(II)V

    invoke-virtual {p2}, LnA3;->U()LnA3;

    move-result-object v1

    invoke-interface {p3, v1}, Ljava/util/Deque;->addFirst(Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {p2}, LnA3;->O()LnA3;

    move-result-object p2

    if-ne p2, p0, :cond_1

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, LrA3;->a:LpA3;

    invoke-virtual {v0}, LpA3;->c()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {p0, v0}, LrA3;->d(Ljava/util/Collection;)V

    invoke-virtual {p0}, LrA3;->g()V

    invoke-virtual {p0}, LrA3;->f()V

    invoke-virtual {p0}, LrA3;->g()V

    invoke-virtual {p0}, LrA3;->i()V

    return-void
.end method

.method public final d(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LnA3;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LnA3;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, LrA3;->m(LnA3;I)V

    iget-object v1, p0, LrA3;->b:Lf32;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lf32;->f(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0, v2}, LrA3;->m(LnA3;I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final e(LnA3;I)V
    .locals 1

    invoke-virtual {p1}, LnA3;->x()LqA3;

    move-result-object p1

    invoke-virtual {p1, p2}, LqA3;->q(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p2}, LqA3;->D(I)V

    return-void
.end method

.method public final f()V
    .locals 4

    iget-object v0, p0, LrA3;->c:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LnA3;

    invoke-virtual {v1}, LnA3;->x()LqA3;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, LqA3;->y(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, v1, v3}, LrA3;->e(LnA3;I)V

    :cond_1
    invoke-virtual {v1}, LnA3;->x()LqA3;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, LqA3;->y(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1, v3}, LrA3;->e(LnA3;I)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final g()V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LrA3;->o(I)V

    iget-object v0, p0, LrA3;->b:Lf32;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lf32;->f(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, LrA3;->o(I)V

    :cond_0
    return-void
.end method

.method public final h(LnA3;I)V
    .locals 2

    invoke-virtual {p1}, LnA3;->x()LqA3;

    move-result-object v0

    iget-object v1, p0, LrA3;->b:Lf32;

    invoke-virtual {v1, p2}, Lf32;->i(I)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x2

    invoke-virtual {v0, p2, p1}, LqA3;->C(II)V

    return-void

    :cond_0
    invoke-virtual {p0, p2, p1}, LrA3;->j(ILnA3;)I

    move-result p1

    invoke-virtual {v0, p2, p1}, LqA3;->C(II)V

    return-void
.end method

.method public final i()V
    .locals 4

    iget-object v0, p0, LrA3;->c:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LnA3;

    invoke-virtual {v1}, LnA3;->x()LqA3;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, LqA3;->y(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, v1, v3}, LrA3;->h(LnA3;I)V

    :cond_1
    invoke-virtual {v1}, LnA3;->x()LqA3;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, LqA3;->y(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1, v3}, LrA3;->h(LnA3;I)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final j(ILnA3;)I
    .locals 2

    iget-object v0, p0, LrA3;->b:Lf32;

    invoke-virtual {p2}, LFE1;->m()LyB0;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lf32;->l(ILyB0;)I

    move-result v0

    iget-object v1, p0, LrA3;->b:Lf32;

    invoke-virtual {p2}, LFE1;->d()LyB0;

    move-result-object p2

    invoke-virtual {v1, p1, p2}, Lf32;->l(ILyB0;)I

    move-result p1

    const/4 p2, 0x0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    if-eq p1, v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move p2, v1

    :goto_1
    return p2
.end method

.method public k(LnA3;I)V
    .locals 5

    invoke-virtual {p1}, LnA3;->x()LqA3;

    move-result-object v0

    invoke-virtual {v0}, LqA3;->n()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p1}, LnA3;->z()Z

    move-result v2

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v3, v2}, LqA3;->e(IIZ)I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p1}, LnA3;->z()Z

    move-result v4

    invoke-virtual {v0, v2, v3, v4}, LqA3;->e(IIZ)I

    move-result v0

    invoke-static {p2, v1, v0}, LtA3;->g(III)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LnA3;->I()V

    :cond_0
    return-void
.end method

.method public l(I)V
    .locals 2

    iget-object v0, p0, LrA3;->c:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LnA3;

    invoke-virtual {p0, v1, p1}, LrA3;->k(LnA3;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public m(LnA3;I)V
    .locals 5

    iget-object v0, p0, LrA3;->b:Lf32;

    invoke-virtual {v0, p2}, Lf32;->i(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, LFE1;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    invoke-static {p1, p2}, LrA3;->c(LnA3;I)LnA3;

    move-result-object p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p1, p2, v1}, LnA3;->y(II)I

    move-result v0

    invoke-virtual {p1}, LnA3;->O()LnA3;

    move-result-object v2

    :cond_3
    invoke-virtual {v2}, LnA3;->x()LqA3;

    move-result-object v3

    invoke-virtual {v3, p2}, LqA3;->k(I)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v3, p2, v0}, LqA3;->E(II)V

    goto :goto_0

    :cond_4
    invoke-virtual {v3, p2}, LqA3;->f(I)Z

    move-result v3

    invoke-static {v3}, LKo;->c(Z)V

    const/4 v3, 0x2

    invoke-virtual {v2, p2, v3}, LnA3;->y(II)I

    move-result v3

    if-ne v3, v0, :cond_6

    invoke-virtual {v2, p2, v1}, LnA3;->y(II)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_5

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "found single null side at "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LKo;->f(Ljava/lang/String;)V

    :cond_5
    :goto_0
    invoke-virtual {v2}, LnA3;->O()LnA3;

    move-result-object v2

    if-ne v2, p1, :cond_3

    return-void

    :cond_6
    new-instance p1, Lorg/locationtech/jts/geom/TopologyException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "side location conflict: arg "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2}, LnA3;->t()LyB0;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lorg/locationtech/jts/geom/TopologyException;-><init>(Ljava/lang/String;LyB0;)V

    throw p1
.end method

.method public final o(I)V
    .locals 3

    iget-object v0, p0, LrA3;->c:Ljava/util/Collection;

    invoke-static {v0, p1}, LrA3;->b(Ljava/util/Collection;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-gtz v1, :cond_0

    return-void

    :cond_0
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1, v0}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    iget-object v0, p0, LrA3;->b:Lf32;

    invoke-virtual {v0, p1}, Lf32;->j(I)Z

    move-result v0

    :goto_0
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v1}, Ljava/util/Deque;->removeFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LnA3;

    invoke-static {v2, p1, v0, v1}, LrA3;->n(LnA3;IZLjava/util/Deque;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public p()V
    .locals 3

    iget-object v0, p0, LrA3;->c:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LnA3;

    invoke-virtual {v1}, LnA3;->C()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, LnA3;->V()V

    goto :goto_0

    :cond_1
    return-void
.end method
