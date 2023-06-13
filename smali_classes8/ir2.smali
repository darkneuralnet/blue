.class public Lir2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LwA3;

.field public b:LbC1;

.field public c:LMW3;

.field public d:Ljava/util/List;

.field public e:Ljava/util/List;


# direct methods
.method public constructor <init>(LwA3;LbC1;LMW3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lir2;->d:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lir2;->e:Ljava/util/List;

    iput-object p1, p0, Lir2;->a:LwA3;

    iput-object p2, p0, Lir2;->b:LbC1;

    iput-object p3, p0, Lir2;->c:LMW3;

    return-void
.end method


# virtual methods
.method public a(I)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lir2;->f()V

    invoke-virtual {p0, p1}, Lir2;->e(I)V

    invoke-virtual {p0, p1}, Lir2;->b(I)V

    iget-object p1, p0, Lir2;->e:Ljava/util/List;

    return-object p1
.end method

.method public final b(I)V
    .locals 3

    iget-object p1, p0, Lir2;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq91;

    iget-object v1, p0, Lir2;->b:LbC1;

    invoke-virtual {v0}, Lq91;->n()[LyB0;

    move-result-object v2

    invoke-virtual {v1, v2}, LbC1;->g([LyB0;)LBr2;

    move-result-object v1

    iget-object v2, p0, Lir2;->e:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LSD1;->g(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c(Lk41;ILjava/util/List;)V
    .locals 3

    invoke-virtual {p1}, Lv91;->f()LSl2;

    move-result-object v0

    invoke-virtual {p1}, Lk41;->s()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lk41;->t()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Lk41;->r()Z

    move-result v1

    if-eqz v1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p1}, Lk41;->e()Lq91;

    move-result-object v1

    invoke-virtual {v1}, LSD1;->e()Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Lk41;->q()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_4

    invoke-virtual {p1}, Lk41;->o()Lk41;

    move-result-object v1

    invoke-virtual {v1}, Lk41;->q()Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_4
    invoke-virtual {p1}, Lk41;->e()Lq91;

    move-result-object v1

    invoke-virtual {v1}, LSD1;->e()Z

    move-result v1

    if-nez v1, :cond_6

    :cond_5
    move v1, v2

    goto :goto_0

    :cond_6
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, LKo;->c(Z)V

    invoke-static {v0, p2}, LwA3;->r(LSl2;I)Z

    move-result v0

    if-eqz v0, :cond_7

    if-ne p2, v2, :cond_7

    invoke-virtual {p1}, Lk41;->e()Lq91;

    move-result-object p2

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v2}, Lk41;->K(Z)V

    :cond_7
    return-void
.end method

.method public final d(Lk41;ILjava/util/List;)V
    .locals 3

    invoke-virtual {p1}, Lv91;->f()LSl2;

    move-result-object v0

    invoke-virtual {p1}, Lk41;->e()Lq91;

    move-result-object v1

    invoke-virtual {p1}, Lk41;->s()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Lk41;->t()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v0, p2}, LwA3;->r(LSl2;I)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {v1}, LSD1;->c()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lk41;->K(Z)V

    :cond_0
    return-void
.end method

.method public final e(I)V
    .locals 3

    iget-object v0, p0, Lir2;->a:LwA3;

    invoke-virtual {v0}, LwA3;->j()LlV3;

    move-result-object v0

    invoke-virtual {v0}, LlV3;->d()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk41;

    iget-object v2, p0, Lir2;->d:Ljava/util/List;

    invoke-virtual {p0, v1, p1, v2}, Lir2;->d(Lk41;ILjava/util/List;)V

    iget-object v2, p0, Lir2;->d:Ljava/util/List;

    invoke-virtual {p0, v1, p1, v2}, Lir2;->c(Lk41;ILjava/util/List;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 4

    iget-object v0, p0, Lir2;->a:LwA3;

    invoke-virtual {v0}, LwA3;->j()LlV3;

    move-result-object v0

    invoke-virtual {v0}, LlV3;->g()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD83;

    invoke-virtual {v1}, LD83;->k()Lz91;

    move-result-object v1

    check-cast v1, Ll41;

    invoke-virtual {v1}, Ll41;->k()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lir2;->a:LwA3;

    invoke-virtual {v0}, LwA3;->j()LlV3;

    move-result-object v0

    invoke-virtual {v0}, LlV3;->d()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk41;

    invoke-virtual {v1}, Lk41;->e()Lq91;

    move-result-object v2

    invoke-virtual {v1}, Lk41;->s()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, LSD1;->d()Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Lir2;->a:LwA3;

    invoke-virtual {v1}, Lv91;->c()LyB0;

    move-result-object v1

    invoke-virtual {v3, v1}, LwA3;->o(LyB0;)Z

    move-result v1

    invoke-virtual {v2, v1}, LSD1;->f(Z)V

    goto :goto_1

    :cond_2
    return-void
.end method
