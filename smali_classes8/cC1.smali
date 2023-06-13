.class public LcC1;
.super LlV3;
.source "SourceFile"


# instance fields
.field public d:LWB1;

.field public e:Ljava/util/Map;

.field public f:Lu00;

.field public g:Z

.field public h:I

.field public i:Ljava/util/Collection;

.field public j:Z

.field public k:LyB0;

.field public l:LNW3;

.field public final m:LMW3;


# direct methods
.method public constructor <init>(ILWB1;Lu00;)V
    .locals 2

    invoke-direct {p0}, LlV3;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LcC1;->e:Ljava/util/Map;

    const/4 v0, 0x0

    iput-object v0, p0, LcC1;->f:Lu00;

    const/4 v1, 0x1

    iput-boolean v1, p0, LcC1;->g:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, LcC1;->j:Z

    iput-object v0, p0, LcC1;->k:LyB0;

    iput-object v0, p0, LcC1;->l:LNW3;

    new-instance v0, LMW3;

    invoke-direct {v0}, LMW3;-><init>()V

    iput-object v0, p0, LcC1;->m:LMW3;

    iput p1, p0, LcC1;->h:I

    iput-object p2, p0, LcC1;->d:LWB1;

    iput-object p3, p0, LcC1;->f:Lu00;

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, LcC1;->k(LWB1;)V

    :cond_0
    return-void
.end method

.method public static w(Lu00;I)I
    .locals 0

    invoke-interface {p0, p1}, Lu00;->a(I)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final A(ILyB0;)V
    .locals 2

    iget-object v0, p0, LlV3;->b:LN83;

    invoke-virtual {v0, p2}, LN83;->b(LyB0;)LD83;

    move-result-object p2

    invoke-virtual {p2}, LSD1;->b()LSl2;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, LSl2;->e(II)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v1, 0x2

    :cond_0
    iget-object v0, p0, LcC1;->f:Lu00;

    invoke-static {v0, v1}, LcC1;->w(Lu00;I)I

    move-result v0

    invoke-virtual {p2, p1, v0}, LSl2;->n(II)V

    return-void
.end method

.method public final B(ILyB0;I)V
    .locals 1

    iget-object v0, p0, LlV3;->b:LN83;

    invoke-virtual {v0, p2}, LN83;->b(LyB0;)LD83;

    move-result-object p2

    invoke-virtual {p2}, LSD1;->b()LSl2;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, LSl2;

    invoke-direct {v0, p1, p3}, LSl2;-><init>(II)V

    iput-object v0, p2, LSD1;->a:LSl2;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p3}, LSl2;->n(II)V

    :goto_0
    return-void
.end method

.method public final k(LWB1;)V
    .locals 2

    invoke-virtual {p1}, LWB1;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, LWW2;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    iput-boolean v1, p0, LcC1;->g:Z

    :cond_1
    instance-of v1, p1, LCX3;

    if-eqz v1, :cond_2

    check-cast p1, LCX3;

    invoke-virtual {p0, p1}, LcC1;->o(LCX3;)V

    goto :goto_0

    :cond_2
    instance-of v1, p1, LBr2;

    if-eqz v1, :cond_3

    check-cast p1, LBr2;

    invoke-virtual {p0, p1}, LcC1;->m(LBr2;)V

    goto :goto_0

    :cond_3
    instance-of v1, p1, LFW3;

    if-eqz v1, :cond_4

    check-cast p1, LFW3;

    invoke-virtual {p0, p1}, LcC1;->n(LFW3;)V

    goto :goto_0

    :cond_4
    instance-of v1, p1, LVW2;

    if-eqz v1, :cond_5

    check-cast p1, LVW2;

    invoke-virtual {p0, p1}, LcC1;->l(LXB1;)V

    goto :goto_0

    :cond_5
    instance-of v1, p1, LDW2;

    if-eqz v1, :cond_6

    check-cast p1, LDW2;

    invoke-virtual {p0, p1}, LcC1;->l(LXB1;)V

    goto :goto_0

    :cond_6
    if-eqz v0, :cond_7

    check-cast p1, LWW2;

    invoke-virtual {p0, p1}, LcC1;->l(LXB1;)V

    goto :goto_0

    :cond_7
    instance-of v0, p1, LXB1;

    if-eqz v0, :cond_8

    check-cast p1, LXB1;

    invoke-virtual {p0, p1}, LcC1;->l(LXB1;)V

    :goto_0
    return-void

    :cond_8
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final l(LXB1;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, LXB1;->f0()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p1, v0}, LXB1;->d0(I)LWB1;

    move-result-object v1

    invoke-virtual {p0, v1}, LcC1;->k(LWB1;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final m(LBr2;)V
    .locals 7

    invoke-virtual {p1}, LBr2;->Y()[LyB0;

    move-result-object v0

    invoke-static {v0}, LBB0;->g([LyB0;)[LyB0;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-ge v1, v4, :cond_0

    iput-boolean v2, p0, LcC1;->j:Z

    aget-object p1, v0, v3

    iput-object p1, p0, LcC1;->k:LyB0;

    return-void

    :cond_0
    new-instance v1, Lq91;

    new-instance v5, LSl2;

    iget v6, p0, LcC1;->h:I

    invoke-direct {v5, v6, v3}, LSl2;-><init>(II)V

    invoke-direct {v1, v0, v5}, Lq91;-><init>([LyB0;LSl2;)V

    iget-object v5, p0, LcC1;->e:Ljava/util/Map;

    invoke-interface {v5, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v1}, LlV3;->h(Lq91;)V

    array-length p1, v0

    if-lt p1, v4, :cond_1

    move p1, v2

    goto :goto_0

    :cond_1
    move p1, v3

    :goto_0
    const-string v1, "found LineString with single point"

    invoke-static {p1, v1}, LKo;->d(ZLjava/lang/String;)V

    iget p1, p0, LcC1;->h:I

    aget-object v1, v0, v3

    invoke-virtual {p0, p1, v1}, LcC1;->A(ILyB0;)V

    iget p1, p0, LcC1;->h:I

    array-length v1, v0

    sub-int/2addr v1, v2

    aget-object v0, v0, v1

    invoke-virtual {p0, p1, v0}, LcC1;->A(ILyB0;)V

    return-void
.end method

.method public final n(LFW3;)V
    .locals 2

    invoke-virtual {p1}, LFW3;->W()LyB0;

    move-result-object p1

    iget v0, p0, LcC1;->h:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, LcC1;->B(ILyB0;I)V

    return-void
.end method

.method public final o(LCX3;)V
    .locals 4

    invoke-virtual {p1}, LCX3;->L0()LKr2;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, LcC1;->p(LKr2;II)V

    move v0, v2

    :goto_0
    invoke-virtual {p1}, LCX3;->O0()I

    move-result v3

    if-ge v0, v3, :cond_0

    invoke-virtual {p1, v0}, LCX3;->M0(I)LKr2;

    move-result-object v3

    invoke-virtual {p0, v3, v2, v1}, LcC1;->p(LKr2;II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final p(LKr2;II)V
    .locals 7

    invoke-virtual {p1}, LBr2;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, LBr2;->Y()[LyB0;

    move-result-object v0

    invoke-static {v0}, LBB0;->g([LyB0;)[LyB0;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ge v1, v2, :cond_1

    iput-boolean v4, p0, LcC1;->j:Z

    aget-object p1, v0, v3

    iput-object p1, p0, LcC1;->k:LyB0;

    return-void

    :cond_1
    invoke-static {v0}, LDy3;->c([LyB0;)Z

    move-result v1

    if-eqz v1, :cond_2

    move v6, p3

    move p3, p2

    move p2, v6

    :cond_2
    new-instance v1, Lq91;

    new-instance v2, LSl2;

    iget v5, p0, LcC1;->h:I

    invoke-direct {v2, v5, v4, p2, p3}, LSl2;-><init>(IIII)V

    invoke-direct {v1, v0, v2}, Lq91;-><init>([LyB0;LSl2;)V

    iget-object p2, p0, LcC1;->e:Ljava/util/Map;

    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v1}, LlV3;->h(Lq91;)V

    iget p1, p0, LcC1;->h:I

    aget-object p2, v0, v3

    invoke-virtual {p0, p1, p2, v4}, LcC1;->B(ILyB0;I)V

    return-void
.end method

.method public final q(ILyB0;I)V
    .locals 1

    invoke-virtual {p0, p1, p2}, LlV3;->i(ILyB0;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    if-ne p3, v0, :cond_1

    iget-boolean v0, p0, LcC1;->g:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1, p2}, LcC1;->A(ILyB0;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, LcC1;->B(ILyB0;I)V

    :goto_0
    return-void
.end method

.method public final r(I)V
    .locals 4

    iget-object v0, p0, LlV3;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq91;

    invoke-virtual {v1}, LSD1;->b()LSl2;

    move-result-object v2

    invoke-virtual {v2, p1}, LSl2;->d(I)I

    move-result v2

    iget-object v1, v1, Lq91;->g:LB91;

    invoke-virtual {v1}, LB91;->e()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LA91;

    iget-object v3, v3, LA91;->b:LyB0;

    invoke-virtual {p0, p1, v3, v2}, LcC1;->q(ILyB0;I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public s(LcC1;Lsr2;Z)LWq5;
    .locals 2

    new-instance v0, LWq5;

    const/4 v1, 0x1

    invoke-direct {v0, p2, p3, v1}, LWq5;-><init>(Lsr2;ZZ)V

    invoke-virtual {p0}, LcC1;->y()Ljava/util/Collection;

    move-result-object p2

    invoke-virtual {p1}, LcC1;->y()Ljava/util/Collection;

    move-result-object p3

    invoke-virtual {v0, p2, p3}, LWq5;->i(Ljava/util/Collection;Ljava/util/Collection;)V

    invoke-virtual {p0}, LcC1;->v()LI91;

    move-result-object p2

    iget-object p3, p0, LlV3;->a:Ljava/util/List;

    iget-object p1, p1, LlV3;->a:Ljava/util/List;

    invoke-virtual {p2, p3, p1, v0}, LI91;->b(Ljava/util/List;Ljava/util/List;LWq5;)V

    return-object v0
.end method

.method public t(Lsr2;Z)LWq5;
    .locals 5

    new-instance v0, LWq5;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, LWq5;-><init>(Lsr2;ZZ)V

    invoke-virtual {p0}, LcC1;->v()LI91;

    move-result-object p1

    iget-object v3, p0, LcC1;->d:LWB1;

    instance-of v4, v3, LKr2;

    if-nez v4, :cond_1

    instance-of v4, v3, LCX3;

    if-nez v4, :cond_1

    instance-of v3, v3, LWW2;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move v3, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v3, v1

    :goto_1
    if-nez p2, :cond_3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :cond_3
    :goto_2
    iget-object p2, p0, LlV3;->a:Ljava/util/List;

    invoke-virtual {p1, p2, v0, v1}, LI91;->a(Ljava/util/List;LWq5;Z)V

    iget p1, p0, LcC1;->h:I

    invoke-virtual {p0, p1}, LcC1;->r(I)V

    return-object v0
.end method

.method public u(Ljava/util/List;)V
    .locals 2

    iget-object v0, p0, LlV3;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq91;

    iget-object v1, v1, Lq91;->g:LB91;

    invoke-virtual {v1, p1}, LB91;->c(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final v()LI91;
    .locals 1

    new-instance v0, LRA5;

    invoke-direct {v0}, LRA5;-><init>()V

    return-object v0
.end method

.method public x()Lu00;
    .locals 1

    iget-object v0, p0, LcC1;->f:Lu00;

    return-object v0
.end method

.method public y()Ljava/util/Collection;
    .locals 2

    iget-object v0, p0, LcC1;->i:Ljava/util/Collection;

    if-nez v0, :cond_0

    iget-object v0, p0, LlV3;->b:LN83;

    iget v1, p0, LcC1;->h:I

    invoke-virtual {v0, v1}, LN83;->d(I)Ljava/util/Collection;

    move-result-object v0

    iput-object v0, p0, LcC1;->i:Ljava/util/Collection;

    :cond_0
    iget-object v0, p0, LcC1;->i:Ljava/util/Collection;

    return-object v0
.end method

.method public z()LWB1;
    .locals 1

    iget-object v0, p0, LcC1;->d:LWB1;

    return-object v0
.end method
