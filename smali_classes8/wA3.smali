.class public LwA3;
.super LdC1;
.source "SourceFile"


# instance fields
.field public final d:LMW3;

.field public e:LbC1;

.field public f:LWB1;

.field public g:LlV3;

.field public h:LD91;

.field public i:Ljava/util/List;

.field public j:Ljava/util/List;

.field public k:Ljava/util/List;


# direct methods
.method public constructor <init>(LWB1;LWB1;)V
    .locals 1

    invoke-direct {p0, p1, p2}, LdC1;-><init>(LWB1;LWB1;)V

    new-instance p2, LMW3;

    invoke-direct {p2}, LMW3;-><init>()V

    iput-object p2, p0, LwA3;->d:LMW3;

    new-instance p2, LD91;

    invoke-direct {p2}, LD91;-><init>()V

    iput-object p2, p0, LwA3;->h:LD91;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, LwA3;->i:Ljava/util/List;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, LwA3;->j:Ljava/util/List;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, LwA3;->k:Ljava/util/List;

    new-instance p2, LlV3;

    new-instance v0, LvA3;

    invoke-direct {v0}, LvA3;-><init>()V

    invoke-direct {p2, v0}, LlV3;-><init>(LJ83;)V

    iput-object p2, p0, LwA3;->g:LlV3;

    invoke-virtual {p1}, LWB1;->c0()LbC1;

    move-result-object p1

    iput-object p1, p0, LwA3;->e:LbC1;

    return-void
.end method

.method public static h(ILWB1;LWB1;LbC1;)LWB1;
    .locals 0

    invoke-static {p0, p1, p2}, LwA3;->x(ILWB1;LWB1;)I

    move-result p0

    invoke-virtual {p3, p0}, LbC1;->b(I)LWB1;

    move-result-object p0

    return-object p0
.end method

.method public static q(III)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_0

    move p0, v0

    :cond_0
    if-ne p1, v1, :cond_1

    move p1, v0

    :cond_1
    if-eq p2, v1, :cond_b

    const/4 v2, 0x2

    if-eq p2, v2, :cond_8

    const/4 v2, 0x3

    if-eq p2, v2, :cond_6

    const/4 v2, 0x4

    if-eq p2, v2, :cond_2

    return v0

    :cond_2
    if-nez p0, :cond_3

    if-nez p1, :cond_4

    :cond_3
    if-eqz p0, :cond_5

    if-nez p1, :cond_5

    :cond_4
    move v0, v1

    :cond_5
    return v0

    :cond_6
    if-nez p0, :cond_7

    if-eqz p1, :cond_7

    move v0, v1

    :cond_7
    return v0

    :cond_8
    if-eqz p0, :cond_9

    if-nez p1, :cond_a

    :cond_9
    move v0, v1

    :cond_a
    return v0

    :cond_b
    if-nez p0, :cond_c

    if-nez p1, :cond_c

    move v0, v1

    :cond_c
    return v0
.end method

.method public static r(LSl2;I)Z
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LSl2;->d(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, LSl2;->d(I)I

    move-result p0

    invoke-static {v0, p0, p1}, LwA3;->q(III)Z

    move-result p0

    return p0
.end method

.method public static v(LWB1;LWB1;I)LWB1;
    .locals 1

    new-instance v0, LwA3;

    invoke-direct {v0, p0, p1}, LwA3;-><init>(LWB1;LWB1;)V

    invoke-virtual {v0, p2}, LwA3;->k(I)LWB1;

    move-result-object p0

    return-object p0
.end method

.method public static x(ILWB1;LWB1;)I
    .locals 1

    invoke-virtual {p1}, LWB1;->F()I

    move-result p1

    invoke-virtual {p2}, LWB1;->F()I

    move-result p2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_3

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    goto :goto_0

    :cond_2
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :cond_3
    :goto_0
    return p1
.end method


# virtual methods
.method public final b()V
    .locals 4

    iget-object v0, p0, LwA3;->g:LlV3;

    invoke-virtual {v0}, LlV3;->d()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk41;

    invoke-virtual {v1}, Lk41;->o()Lk41;

    move-result-object v2

    invoke-virtual {v1}, Lk41;->q()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lk41;->q()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lk41;->v(Z)V

    invoke-virtual {v2, v3}, Lk41;->v(Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final c(Ljava/util/List;Ljava/util/List;Ljava/util/List;I)LWB1;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LdC1;->c:[LcC1;

    const/4 p2, 0x0

    aget-object p1, p1, p2

    invoke-virtual {p1}, LcC1;->z()LWB1;

    move-result-object p1

    iget-object p2, p0, LdC1;->c:[LcC1;

    const/4 p3, 0x1

    aget-object p2, p2, p3

    invoke-virtual {p2}, LcC1;->z()LWB1;

    move-result-object p2

    iget-object p3, p0, LwA3;->e:LbC1;

    invoke-static {p4, p1, p2, p3}, LwA3;->h(ILWB1;LWB1;LbC1;)LWB1;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, LwA3;->e:LbC1;

    invoke-virtual {p1, v0}, LbC1;->a(Ljava/util/Collection;)LWB1;

    move-result-object p1

    return-object p1
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, LwA3;->g:LlV3;

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

    iget-object v2, p0, LdC1;->c:[LcC1;

    invoke-virtual {v1, v2}, Lz91;->b([LcC1;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LwA3;->u()V

    invoke-virtual {p0}, LwA3;->y()V

    return-void
.end method

.method public final e()V
    .locals 8

    iget-object v0, p0, LwA3;->h:LD91;

    invoke-virtual {v0}, LD91;->e()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq91;

    invoke-virtual {v1}, LSD1;->b()LSl2;

    move-result-object v2

    invoke-virtual {v1}, Lq91;->o()Lr01;

    move-result-object v1

    invoke-virtual {v1}, Lr01;->e()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v1}, Lr01;->h()V

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x2

    if-ge v3, v4, :cond_0

    invoke-virtual {v2, v3}, LSl2;->j(I)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v2}, LSl2;->g()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v1, v3}, Lr01;->f(I)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v1, v3}, Lr01;->c(I)I

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v2, v3}, LSl2;->p(I)V

    goto :goto_1

    :cond_1
    const/4 v5, 0x1

    invoke-virtual {v1, v3, v5}, Lr01;->g(II)Z

    move-result v6

    xor-int/2addr v6, v5

    const-string v7, "depth of LEFT side has not been initialized"

    invoke-static {v6, v7}, LKo;->d(ZLjava/lang/String;)V

    invoke-virtual {v1, v3, v5}, Lr01;->d(II)I

    move-result v6

    invoke-virtual {v2, v3, v5, v6}, LSl2;->o(III)V

    invoke-virtual {v1, v3, v4}, Lr01;->g(II)Z

    move-result v6

    xor-int/2addr v5, v6

    const-string v6, "depth of RIGHT side has not been initialized"

    invoke-static {v5, v6}, LKo;->d(ZLjava/lang/String;)V

    invoke-virtual {v1, v3, v4}, Lr01;->d(II)I

    move-result v5

    invoke-virtual {v2, v3, v4, v5}, LSl2;->o(III)V

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final f(I)V
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LwA3;->g(I)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, LwA3;->g(I)V

    iget-object v2, p0, LdC1;->c:[LcC1;

    aget-object v2, v2, v0

    iget-object v3, p0, LdC1;->a:Lsr2;

    invoke-virtual {v2, v3, v0}, LcC1;->t(Lsr2;Z)LWq5;

    iget-object v2, p0, LdC1;->c:[LcC1;

    aget-object v2, v2, v1

    iget-object v3, p0, LdC1;->a:Lsr2;

    invoke-virtual {v2, v3, v0}, LcC1;->t(Lsr2;Z)LWq5;

    iget-object v2, p0, LdC1;->c:[LcC1;

    aget-object v3, v2, v0

    aget-object v2, v2, v1

    iget-object v4, p0, LdC1;->a:Lsr2;

    invoke-virtual {v3, v2, v4, v1}, LcC1;->s(LcC1;Lsr2;Z)LWq5;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, p0, LdC1;->c:[LcC1;

    aget-object v0, v3, v0

    invoke-virtual {v0, v2}, LcC1;->u(Ljava/util/List;)V

    iget-object v0, p0, LdC1;->c:[LcC1;

    aget-object v0, v0, v1

    invoke-virtual {v0, v2}, LcC1;->u(Ljava/util/List;)V

    invoke-virtual {p0, v2}, LwA3;->m(Ljava/util/List;)V

    invoke-virtual {p0}, LwA3;->e()V

    invoke-virtual {p0}, LwA3;->w()V

    iget-object v0, p0, LwA3;->h:LD91;

    invoke-virtual {v0}, LD91;->d()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LG91;->b(Ljava/util/Collection;)V

    iget-object v0, p0, LwA3;->g:LlV3;

    iget-object v1, p0, LwA3;->h:LD91;

    invoke-virtual {v1}, LD91;->d()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, LlV3;->b(Ljava/util/List;)V

    invoke-virtual {p0}, LwA3;->d()V

    invoke-virtual {p0}, LwA3;->t()V

    invoke-virtual {p0, p1}, LwA3;->i(I)V

    invoke-virtual {p0}, LwA3;->b()V

    new-instance v0, LFX3;

    iget-object v1, p0, LwA3;->e:LbC1;

    invoke-direct {v0, v1}, LFX3;-><init>(LbC1;)V

    iget-object v1, p0, LwA3;->g:LlV3;

    invoke-virtual {v0, v1}, LFX3;->a(LlV3;)V

    invoke-virtual {v0}, LFX3;->h()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LwA3;->i:Ljava/util/List;

    new-instance v0, Lir2;

    iget-object v1, p0, LwA3;->e:LbC1;

    iget-object v2, p0, LwA3;->d:LMW3;

    invoke-direct {v0, p0, v1, v2}, Lir2;-><init>(LwA3;LbC1;LMW3;)V

    invoke-virtual {v0, p1}, Lir2;->a(I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LwA3;->j:Ljava/util/List;

    new-instance v0, LHW3;

    iget-object v1, p0, LwA3;->e:LbC1;

    iget-object v2, p0, LwA3;->d:LMW3;

    invoke-direct {v0, p0, v1, v2}, LHW3;-><init>(LwA3;LbC1;LMW3;)V

    invoke-virtual {v0, p1}, LHW3;->a(I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LwA3;->k:Ljava/util/List;

    iget-object v1, p0, LwA3;->j:Ljava/util/List;

    iget-object v2, p0, LwA3;->i:Ljava/util/List;

    invoke-virtual {p0, v0, v1, v2, p1}, LwA3;->c(Ljava/util/List;Ljava/util/List;Ljava/util/List;I)LWB1;

    move-result-object p1

    iput-object p1, p0, LwA3;->f:LWB1;

    return-void
.end method

.method public final g(I)V
    .locals 4

    iget-object v0, p0, LdC1;->c:[LcC1;

    aget-object v0, v0, p1

    invoke-virtual {v0}, LlV3;->f()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD83;

    iget-object v2, p0, LwA3;->g:LlV3;

    invoke-virtual {v1}, LD83;->j()LyB0;

    move-result-object v3

    invoke-virtual {v2, v3}, LlV3;->c(LyB0;)LD83;

    move-result-object v2

    invoke-virtual {v1}, LSD1;->b()LSl2;

    move-result-object v1

    invoke-virtual {v1, p1}, LSl2;->d(I)I

    move-result v1

    invoke-virtual {v2, p1, v1}, LD83;->n(II)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final i(I)V
    .locals 6

    iget-object v0, p0, LwA3;->g:LlV3;

    invoke-virtual {v0}, LlV3;->d()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk41;

    invoke-virtual {v1}, Lv91;->f()LSl2;

    move-result-object v2

    invoke-virtual {v2}, LSl2;->g()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Lk41;->r()Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-virtual {v2, v3, v4}, LSl2;->e(II)I

    move-result v3

    const/4 v5, 0x1

    invoke-virtual {v2, v5, v4}, LSl2;->e(II)I

    move-result v2

    invoke-static {v3, v2, p1}, LwA3;->q(III)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v5}, Lk41;->v(Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public j()LlV3;
    .locals 1

    iget-object v0, p0, LwA3;->g:LlV3;

    return-object v0
.end method

.method public k(I)LWB1;
    .locals 0

    invoke-virtual {p0, p1}, LwA3;->f(I)V

    iget-object p1, p0, LwA3;->f:LWB1;

    return-object p1
.end method

.method public l(Lq91;)V
    .locals 4

    iget-object v0, p0, LwA3;->h:LD91;

    invoke-virtual {v0, p1}, LD91;->c(Lq91;)Lq91;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LSD1;->b()LSl2;

    move-result-object v1

    invoke-virtual {p1}, LSD1;->b()LSl2;

    move-result-object v2

    invoke-virtual {v0, p1}, Lq91;->v(Lq91;)Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v2, LSl2;

    invoke-virtual {p1}, LSD1;->b()LSl2;

    move-result-object p1

    invoke-direct {v2, p1}, LSl2;-><init>(LSl2;)V

    invoke-virtual {v2}, LSl2;->b()V

    :cond_0
    invoke-virtual {v0}, Lq91;->o()Lr01;

    move-result-object p1

    invoke-virtual {p1}, Lr01;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, v1}, Lr01;->a(LSl2;)V

    :cond_1
    invoke-virtual {p1, v2}, Lr01;->a(LSl2;)V

    invoke-virtual {v1, v2}, LSl2;->k(LSl2;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LwA3;->h:LD91;

    invoke-virtual {v0, p1}, LD91;->a(Lq91;)V

    :goto_0
    return-void
.end method

.method public final m(Ljava/util/List;)V
    .locals 1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq91;

    invoke-virtual {p0, v0}, LwA3;->l(Lq91;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final n(LyB0;Ljava/util/List;)Z
    .locals 2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LWB1;

    iget-object v1, p0, LwA3;->d:LMW3;

    invoke-virtual {v1, p1, v0}, LMW3;->b(LyB0;LWB1;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public o(LyB0;)Z
    .locals 1

    iget-object v0, p0, LwA3;->i:Ljava/util/List;

    invoke-virtual {p0, p1, v0}, LwA3;->n(LyB0;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public p(LyB0;)Z
    .locals 2

    iget-object v0, p0, LwA3;->j:Ljava/util/List;

    invoke-virtual {p0, p1, v0}, LwA3;->n(LyB0;Ljava/util/List;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LwA3;->i:Ljava/util/List;

    invoke-virtual {p0, p1, v0}, LwA3;->n(LyB0;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final s(LD83;I)V
    .locals 3

    iget-object v0, p0, LwA3;->d:LMW3;

    invoke-virtual {p1}, LD83;->j()LyB0;

    move-result-object v1

    iget-object v2, p0, LdC1;->c:[LcC1;

    aget-object v2, v2, p2

    invoke-virtual {v2}, LcC1;->z()LWB1;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LMW3;->b(LyB0;LWB1;)I

    move-result v0

    invoke-virtual {p1}, LSD1;->b()LSl2;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, LSl2;->n(II)V

    return-void
.end method

.method public final t()V
    .locals 5

    iget-object v0, p0, LwA3;->g:LlV3;

    invoke-virtual {v0}, LlV3;->g()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD83;

    invoke-virtual {v1}, LSD1;->b()LSl2;

    move-result-object v2

    invoke-virtual {v1}, LD83;->m()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, LSl2;->j(I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p0, v1, v3}, LwA3;->s(LD83;I)V

    goto :goto_1

    :cond_0
    const/4 v3, 0x1

    invoke-virtual {p0, v1, v3}, LwA3;->s(LD83;I)V

    :cond_1
    :goto_1
    invoke-virtual {v1}, LD83;->k()Lz91;

    move-result-object v1

    check-cast v1, Ll41;

    invoke-virtual {v1, v2}, Ll41;->r(LSl2;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final u()V
    .locals 2

    iget-object v0, p0, LwA3;->g:LlV3;

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

    invoke-virtual {v1}, Ll41;->q()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final w()V
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LwA3;->h:LD91;

    invoke-virtual {v1}, LD91;->e()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq91;

    invoke-virtual {v2}, Lq91;->t()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    invoke-virtual {v2}, Lq91;->k()Lq91;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v1, p0, LwA3;->h:LD91;

    invoke-virtual {v1, v0}, LD91;->b(Ljava/util/Collection;)V

    return-void
.end method

.method public final y()V
    .locals 3

    iget-object v0, p0, LwA3;->g:LlV3;

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

    move-result-object v2

    check-cast v2, Ll41;

    invoke-virtual {v2}, Ll41;->l()LSl2;

    move-result-object v2

    invoke-virtual {v1}, LSD1;->b()LSl2;

    move-result-object v1

    invoke-virtual {v1, v2}, LSl2;->k(LSl2;)V

    goto :goto_0

    :cond_0
    return-void
.end method
