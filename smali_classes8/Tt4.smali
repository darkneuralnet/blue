.class public LTt4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lsr2;

.field public b:LMW3;

.field public c:[LcC1;

.field public d:LN83;

.field public e:LP62;

.field public f:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>([LcC1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LBb5;

    invoke-direct {v0}, LBb5;-><init>()V

    iput-object v0, p0, LTt4;->a:Lsr2;

    new-instance v0, LMW3;

    invoke-direct {v0}, LMW3;-><init>()V

    iput-object v0, p0, LTt4;->b:LMW3;

    new-instance v0, LN83;

    new-instance v1, LVt4;

    invoke-direct {v1}, LVt4;-><init>()V

    invoke-direct {v0, v1}, LN83;-><init>(LJ83;)V

    iput-object v0, p0, LTt4;->d:LN83;

    const/4 v0, 0x0

    iput-object v0, p0, LTt4;->e:LP62;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LTt4;->f:Ljava/util/ArrayList;

    iput-object p1, p0, LTt4;->c:[LcC1;

    return-void
.end method

.method public static f(LWB1;Lu00;)I
    .locals 1

    invoke-static {p0, p1}, Lv00;->h(LWB1;Lu00;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LWB1;->F()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-virtual {p0}, LWB1;->P()I

    move-result p0

    return p0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method


# virtual methods
.method public final a(LP62;Lu00;)V
    .locals 5

    iget-object v0, p0, LTt4;->c:[LcC1;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, LcC1;->z()LWB1;

    move-result-object v0

    invoke-virtual {v0}, LWB1;->r0()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-nez v2, :cond_0

    invoke-virtual {v0}, LWB1;->F()I

    move-result v2

    invoke-virtual {p1, v1, v4, v2}, LP62;->m(III)V

    invoke-static {v0, p2}, LTt4;->f(LWB1;Lu00;)I

    move-result v0

    invoke-virtual {p1, v3, v4, v0}, LP62;->m(III)V

    :cond_0
    iget-object v0, p0, LTt4;->c:[LcC1;

    aget-object v0, v0, v3

    invoke-virtual {v0}, LcC1;->z()LWB1;

    move-result-object v0

    invoke-virtual {v0}, LWB1;->r0()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, LWB1;->F()I

    move-result v2

    invoke-virtual {p1, v4, v1, v2}, LP62;->m(III)V

    invoke-static {v0, p2}, LTt4;->f(LWB1;Lu00;)I

    move-result p2

    invoke-virtual {p1, v4, v3, p2}, LP62;->m(III)V

    :cond_1
    return-void
.end method

.method public b()LP62;
    .locals 6

    new-instance v0, LP62;

    invoke-direct {v0}, LP62;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {v0, v1, v1, v1}, LP62;->m(III)V

    iget-object v1, p0, LTt4;->c:[LcC1;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v1}, LcC1;->z()LWB1;

    move-result-object v1

    invoke-virtual {v1}, LWB1;->Z()Lsf1;

    move-result-object v1

    iget-object v3, p0, LTt4;->c:[LcC1;

    const/4 v4, 0x1

    aget-object v3, v3, v4

    invoke-virtual {v3}, LcC1;->z()LWB1;

    move-result-object v3

    invoke-virtual {v3}, LWB1;->Z()Lsf1;

    move-result-object v3

    invoke-virtual {v1, v3}, Lsf1;->K(Lsf1;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LTt4;->c:[LcC1;

    aget-object v1, v1, v2

    invoke-virtual {v1}, LcC1;->x()Lu00;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, LTt4;->a(LP62;Lu00;)V

    return-object v0

    :cond_0
    iget-object v1, p0, LTt4;->c:[LcC1;

    aget-object v1, v1, v2

    iget-object v3, p0, LTt4;->a:Lsr2;

    invoke-virtual {v1, v3, v2}, LcC1;->t(Lsr2;Z)LWq5;

    iget-object v1, p0, LTt4;->c:[LcC1;

    aget-object v1, v1, v4

    iget-object v3, p0, LTt4;->a:Lsr2;

    invoke-virtual {v1, v3, v2}, LcC1;->t(Lsr2;Z)LWq5;

    iget-object v1, p0, LTt4;->c:[LcC1;

    aget-object v3, v1, v2

    aget-object v1, v1, v4

    iget-object v5, p0, LTt4;->a:Lsr2;

    invoke-virtual {v3, v1, v5, v2}, LcC1;->s(LcC1;Lsr2;Z)LWq5;

    move-result-object v1

    invoke-virtual {p0, v2}, LTt4;->c(I)V

    invoke-virtual {p0, v4}, LTt4;->c(I)V

    invoke-virtual {p0, v2}, LTt4;->e(I)V

    invoke-virtual {p0, v4}, LTt4;->e(I)V

    invoke-virtual {p0}, LTt4;->k()V

    invoke-virtual {p0, v1, v0}, LTt4;->d(LWq5;LP62;)V

    new-instance v1, Lw91;

    invoke-direct {v1}, Lw91;-><init>()V

    iget-object v3, p0, LTt4;->c:[LcC1;

    aget-object v3, v3, v2

    invoke-virtual {v3}, LlV3;->e()Ljava/util/Iterator;

    move-result-object v3

    invoke-virtual {v1, v3}, Lw91;->a(Ljava/util/Iterator;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0, v3}, LTt4;->g(Ljava/util/List;)V

    iget-object v3, p0, LTt4;->c:[LcC1;

    aget-object v3, v3, v4

    invoke-virtual {v3}, LlV3;->e()Ljava/util/Iterator;

    move-result-object v3

    invoke-virtual {v1, v3}, Lw91;->a(Ljava/util/Iterator;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v1}, LTt4;->g(Ljava/util/List;)V

    invoke-virtual {p0}, LTt4;->l()V

    invoke-virtual {p0, v2, v4}, LTt4;->i(II)V

    invoke-virtual {p0, v4, v2}, LTt4;->i(II)V

    invoke-virtual {p0, v0}, LTt4;->m(LP62;)V

    return-object v0
.end method

.method public final c(I)V
    .locals 5

    iget-object v0, p0, LTt4;->c:[LcC1;

    aget-object v0, v0, p1

    invoke-virtual {v0}, LlV3;->e()Ljava/util/Iterator;

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

    invoke-virtual {v2, p1}, LSl2;->d(I)I

    move-result v2

    invoke-virtual {v1}, Lq91;->p()LB91;

    move-result-object v1

    invoke-virtual {v1}, LB91;->e()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LA91;

    iget-object v4, p0, LTt4;->d:LN83;

    iget-object v3, v3, LA91;->b:LyB0;

    invoke-virtual {v4, v3}, LN83;->b(LyB0;)LD83;

    move-result-object v3

    check-cast v3, LUt4;

    const/4 v4, 0x1

    if-ne v2, v4, :cond_2

    invoke-virtual {v3, p1}, LD83;->o(I)V

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, LSD1;->b()LSl2;

    move-result-object v4

    invoke-virtual {v4, p1}, LSl2;->j(I)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x0

    invoke-virtual {v3, p1, v4}, LD83;->n(II)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final d(LWq5;LP62;)V
    .locals 5

    iget-object v0, p0, LTt4;->c:[LcC1;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, LcC1;->z()LWB1;

    move-result-object v0

    invoke-virtual {v0}, LWB1;->F()I

    move-result v0

    iget-object v1, p0, LTt4;->c:[LcC1;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v1}, LcC1;->z()LWB1;

    move-result-object v1

    invoke-virtual {v1}, LWB1;->F()I

    move-result v1

    invoke-virtual {p1}, LWq5;->c()Z

    move-result v3

    invoke-virtual {p1}, LWq5;->b()Z

    move-result p1

    const/4 v4, 0x2

    if-ne v0, v4, :cond_0

    if-ne v1, v4, :cond_0

    if-eqz v3, :cond_5

    const-string p1, "212101212"

    invoke-virtual {p2, p1}, LP62;->p(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-ne v0, v4, :cond_2

    if-ne v1, v2, :cond_2

    if-eqz v3, :cond_1

    const-string v0, "FFF0FFFF2"

    invoke-virtual {p2, v0}, LP62;->p(Ljava/lang/String;)V

    :cond_1
    if-eqz p1, :cond_5

    const-string p1, "1FFFFF1FF"

    invoke-virtual {p2, p1}, LP62;->p(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    if-ne v0, v2, :cond_4

    if-ne v1, v4, :cond_4

    if-eqz v3, :cond_3

    const-string v0, "F0FFFFFF2"

    invoke-virtual {p2, v0}, LP62;->p(Ljava/lang/String;)V

    :cond_3
    if-eqz p1, :cond_5

    const-string p1, "1F1FFFFFF"

    invoke-virtual {p2, p1}, LP62;->p(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    if-ne v0, v2, :cond_5

    if-ne v1, v2, :cond_5

    if-eqz p1, :cond_5

    const-string p1, "0FFFFFFFF"

    invoke-virtual {p2, p1}, LP62;->p(Ljava/lang/String;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public final e(I)V
    .locals 4

    iget-object v0, p0, LTt4;->c:[LcC1;

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

    iget-object v2, p0, LTt4;->d:LN83;

    invoke-virtual {v1}, LD83;->j()LyB0;

    move-result-object v3

    invoke-virtual {v2, v3}, LN83;->b(LyB0;)LD83;

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

.method public final g(Ljava/util/List;)V
    .locals 2

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv91;

    iget-object v1, p0, LTt4;->d:LN83;

    invoke-virtual {v1, v0}, LN83;->a(Lv91;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final h(Lq91;ILWB1;)V
    .locals 2

    invoke-virtual {p3}, LWB1;->F()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LTt4;->b:LMW3;

    invoke-virtual {p1}, Lq91;->l()LyB0;

    move-result-object v1

    invoke-virtual {v0, v1, p3}, LMW3;->b(LyB0;LWB1;)I

    move-result p3

    invoke-virtual {p1}, LSD1;->b()LSl2;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, LSl2;->l(II)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LSD1;->b()LSl2;

    move-result-object p1

    const/4 p3, 0x2

    invoke-virtual {p1, p2, p3}, LSl2;->l(II)V

    :goto_0
    return-void
.end method

.method public final i(II)V
    .locals 2

    iget-object v0, p0, LTt4;->c:[LcC1;

    aget-object p1, v0, p1

    invoke-virtual {p1}, LlV3;->e()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq91;

    invoke-virtual {v0}, Lq91;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LTt4;->c:[LcC1;

    aget-object v1, v1, p2

    invoke-virtual {v1}, LcC1;->z()LWB1;

    move-result-object v1

    invoke-virtual {p0, v0, p2, v1}, LTt4;->h(Lq91;ILWB1;)V

    iget-object v1, p0, LTt4;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final j(LD83;I)V
    .locals 3

    iget-object v0, p0, LTt4;->b:LMW3;

    invoke-virtual {p1}, LD83;->j()LyB0;

    move-result-object v1

    iget-object v2, p0, LTt4;->c:[LcC1;

    aget-object v2, v2, p2

    invoke-virtual {v2}, LcC1;->z()LWB1;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LMW3;->b(LyB0;LWB1;)I

    move-result v0

    invoke-virtual {p1}, LSD1;->b()LSl2;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, LSl2;->l(II)V

    return-void
.end method

.method public final k()V
    .locals 7

    iget-object v0, p0, LTt4;->d:LN83;

    invoke-virtual {v0}, LN83;->e()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD83;

    invoke-virtual {v1}, LSD1;->b()LSl2;

    move-result-object v2

    invoke-virtual {v2}, LSl2;->c()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-lez v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    move v3, v5

    :goto_1
    const-string v6, "node with empty label found"

    invoke-static {v3, v6}, LKo;->d(ZLjava/lang/String;)V

    invoke-virtual {v1}, LD83;->m()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2, v5}, LSl2;->j(I)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v1, v5}, LTt4;->j(LD83;I)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v1, v4}, LTt4;->j(LD83;I)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final l()V
    .locals 3

    iget-object v0, p0, LTt4;->d:LN83;

    invoke-virtual {v0}, LN83;->e()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LUt4;

    invoke-virtual {v1}, LD83;->k()Lz91;

    move-result-object v1

    iget-object v2, p0, LTt4;->c:[LcC1;

    invoke-virtual {v1, v2}, Lz91;->b([LcC1;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final m(LP62;)V
    .locals 2

    iget-object v0, p0, LTt4;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq91;

    invoke-virtual {v1, p1}, LSD1;->h(LP62;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LTt4;->d:LN83;

    invoke-virtual {v0}, LN83;->e()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LUt4;

    invoke-virtual {v1, p1}, LSD1;->h(LP62;)V

    invoke-virtual {v1, p1}, LUt4;->p(LP62;)V

    goto :goto_1

    :cond_1
    return-void
.end method
