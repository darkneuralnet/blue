.class public Lx91;
.super Lv91;
.source "SourceFile"


# instance fields
.field public j:Ljava/util/List;


# direct methods
.method public constructor <init>(Lu00;Lv91;)V
    .locals 4

    invoke-virtual {p2}, Lv91;->e()Lq91;

    move-result-object p1

    invoke-virtual {p2}, Lv91;->c()LyB0;

    move-result-object v0

    invoke-virtual {p2}, Lv91;->d()LyB0;

    move-result-object v1

    new-instance v2, LSl2;

    invoke-virtual {p2}, Lv91;->f()LSl2;

    move-result-object v3

    invoke-direct {v2, v3}, LSl2;-><init>(LSl2;)V

    invoke-direct {p0, p1, v0, v1, v2}, Lv91;-><init>(Lq91;LyB0;LyB0;LSl2;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lx91;->j:Ljava/util/List;

    invoke-virtual {p0, p2}, Lx91;->m(Lv91;)V

    return-void
.end method

.method public constructor <init>(Lv91;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lx91;-><init>(Lu00;Lv91;)V

    return-void
.end method


# virtual methods
.method public b(Lu00;)V
    .locals 4

    invoke-virtual {p0}, Lx91;->n()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv91;

    invoke-virtual {v3}, Lv91;->f()LSl2;

    move-result-object v3

    invoke-virtual {v3}, LSl2;->g()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    if-eqz v2, :cond_2

    new-instance v3, LSl2;

    invoke-direct {v3, v0, v0, v0}, LSl2;-><init>(III)V

    iput-object v3, p0, Lv91;->c:LSl2;

    goto :goto_1

    :cond_2
    new-instance v3, LSl2;

    invoke-direct {v3, v0}, LSl2;-><init>(I)V

    iput-object v3, p0, Lv91;->c:LSl2;

    :goto_1
    const/4 v0, 0x2

    if-ge v1, v0, :cond_4

    invoke-virtual {p0, v1, p1}, Lx91;->j(ILu00;)V

    if-eqz v2, :cond_3

    invoke-virtual {p0, v1}, Lx91;->l(I)V

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    return-void
.end method

.method public f()LSl2;
    .locals 1

    iget-object v0, p0, Lv91;->c:LSl2;

    return-object v0
.end method

.method public final j(ILu00;)V
    .locals 6

    invoke-virtual {p0}, Lx91;->n()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lv91;

    invoke-virtual {v4}, Lv91;->f()LSl2;

    move-result-object v4

    invoke-virtual {v4, p1}, LSl2;->d(I)I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_1

    add-int/lit8 v3, v3, 0x1

    :cond_1
    if-nez v4, :cond_0

    move v2, v5

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, -0x1

    :goto_1
    if-lez v3, :cond_4

    invoke-static {p2, v3}, LcC1;->w(Lu00;I)I

    move-result v1

    :cond_4
    iget-object p2, p0, Lv91;->c:LSl2;

    invoke-virtual {p2, p1, v1}, LSl2;->n(II)V

    return-void
.end method

.method public final k(II)V
    .locals 3

    invoke-virtual {p0}, Lx91;->n()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv91;

    invoke-virtual {v1}, Lv91;->f()LSl2;

    move-result-object v2

    invoke-virtual {v2}, LSl2;->g()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lv91;->f()LSl2;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, LSl2;->e(II)I

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, p0, Lv91;->c:LSl2;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, LSl2;->o(III)V

    return-void

    :cond_1
    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lv91;->c:LSl2;

    invoke-virtual {v1, p1, p2, v2}, LSl2;->o(III)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final l(I)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lx91;->k(II)V

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lx91;->k(II)V

    return-void
.end method

.method public m(Lv91;)V
    .locals 1

    iget-object v0, p0, Lx91;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public n()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lx91;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public o(LP62;)V
    .locals 1

    iget-object v0, p0, Lv91;->c:LSl2;

    invoke-static {v0, p1}, Lq91;->x(LSl2;LP62;)V

    return-void
.end method
