.class public Leu0;
.super LqB;
.source "SourceFile"


# instance fields
.field public D:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LqB;",
            ">;"
        }
    .end annotation
.end field

.field public final F:Landroid/graphics/RectF;

.field public final G:Landroid/graphics/RectF;

.field public final H:Landroid/graphics/Paint;

.field public I:Z


# direct methods
.method public constructor <init>(LRD2;Lfm2;Ljava/util/List;LrD2;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRD2;",
            "Lfm2;",
            "Ljava/util/List<",
            "Lfm2;",
            ">;",
            "LrD2;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, LqB;-><init>(LRD2;Lfm2;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Leu0;->E:Ljava/util/List;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Leu0;->F:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Leu0;->G:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Leu0;->H:Landroid/graphics/Paint;

    const/4 v0, 0x1

    iput-boolean v0, p0, Leu0;->I:Z

    invoke-virtual {p2}, Lfm2;->u()Lqe;

    move-result-object p2

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lqe;->a()LoB;

    move-result-object p2

    iput-object p2, p0, Leu0;->D:LoB;

    invoke-virtual {p0, p2}, LqB;->i(LoB;)V

    iget-object p2, p0, Leu0;->D:LoB;

    invoke-virtual {p2, p0}, LoB;->a(LoB$b;)V

    goto :goto_0

    :cond_0
    iput-object v1, p0, Leu0;->D:LoB;

    :goto_0
    new-instance p2, Loz2;

    invoke-virtual {p4}, LrD2;->k()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {p2, v2}, Loz2;-><init>(I)V

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v0

    move-object v3, v1

    :goto_1
    const/4 v4, 0x0

    if-ltz v2, :cond_4

    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lfm2;

    invoke-static {p0, v5, p1, p4}, LqB;->u(Leu0;Lfm2;LRD2;LrD2;)LqB;

    move-result-object v6

    if-nez v6, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v6}, LqB;->y()Lfm2;

    move-result-object v7

    invoke-virtual {v7}, Lfm2;->d()J

    move-result-wide v7

    invoke-virtual {p2, v7, v8, v6}, Loz2;->n(JLjava/lang/Object;)V

    if-eqz v3, :cond_2

    invoke-virtual {v3, v6}, LqB;->I(LqB;)V

    move-object v3, v1

    goto :goto_2

    :cond_2
    iget-object v7, p0, Leu0;->E:Ljava/util/List;

    invoke-interface {v7, v4, v6}, Ljava/util/List;->add(ILjava/lang/Object;)V

    sget-object v4, Leu0$a;->a:[I

    invoke-virtual {v5}, Lfm2;->h()Lfm2$b;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    if-eq v4, v0, :cond_3

    const/4 v5, 0x2

    if-eq v4, v5, :cond_3

    goto :goto_2

    :cond_3
    move-object v3, v6

    :goto_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_4
    :goto_3
    invoke-virtual {p2}, Loz2;->size()I

    move-result p1

    if-ge v4, p1, :cond_7

    invoke-virtual {p2, v4}, Loz2;->m(I)J

    move-result-wide p3

    invoke-virtual {p2, p3, p4}, Loz2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LqB;

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, LqB;->y()Lfm2;

    move-result-object p3

    invoke-virtual {p3}, Lfm2;->j()J

    move-result-wide p3

    invoke-virtual {p2, p3, p4}, Loz2;->h(J)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LqB;

    if-eqz p3, :cond_6

    invoke-virtual {p1, p3}, LqB;->K(LqB;)V

    :cond_6
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_7
    return-void
.end method


# virtual methods
.method public H(LBk2;ILjava/util/List;LBk2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBk2;",
            "I",
            "Ljava/util/List<",
            "LBk2;",
            ">;",
            "LBk2;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Leu0;->E:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Leu0;->E:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LqB;

    invoke-virtual {v1, p1, p2, p3, p4}, LqB;->c(LBk2;ILjava/util/List;LBk2;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public J(Z)V
    .locals 2

    invoke-super {p0, p1}, LqB;->J(Z)V

    iget-object v0, p0, Leu0;->E:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LqB;

    invoke-virtual {v1, p1}, LqB;->J(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public L(F)V
    .locals 3

    invoke-super {p0, p1}, LqB;->L(F)V

    iget-object v0, p0, Leu0;->D:LoB;

    if-eqz v0, :cond_0

    iget-object p1, p0, LqB;->p:LRD2;

    invoke-virtual {p1}, LRD2;->I()LrD2;

    move-result-object p1

    invoke-virtual {p1}, LrD2;->e()F

    move-result p1

    const v0, 0x3c23d70a    # 0.01f

    add-float/2addr p1, v0

    iget-object v0, p0, LqB;->q:Lfm2;

    invoke-virtual {v0}, Lfm2;->b()LrD2;

    move-result-object v0

    invoke-virtual {v0}, LrD2;->p()F

    move-result v0

    iget-object v1, p0, Leu0;->D:LoB;

    invoke-virtual {v1}, LoB;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget-object v2, p0, LqB;->q:Lfm2;

    invoke-virtual {v2}, Lfm2;->b()LrD2;

    move-result-object v2

    invoke-virtual {v2}, LrD2;->i()F

    move-result v2

    mul-float/2addr v1, v2

    sub-float/2addr v1, v0

    div-float p1, v1, p1

    :cond_0
    iget-object v0, p0, Leu0;->D:LoB;

    if-nez v0, :cond_1

    iget-object v0, p0, LqB;->q:Lfm2;

    invoke-virtual {v0}, Lfm2;->r()F

    move-result v0

    sub-float/2addr p1, v0

    :cond_1
    iget-object v0, p0, LqB;->q:Lfm2;

    invoke-virtual {v0}, Lfm2;->v()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_2

    iget-object v0, p0, LqB;->q:Lfm2;

    invoke-virtual {v0}, Lfm2;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, "__container"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LqB;->q:Lfm2;

    invoke-virtual {v0}, Lfm2;->v()F

    move-result v0

    div-float/2addr p1, v0

    :cond_2
    iget-object v0, p0, Leu0;->E:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_3

    iget-object v1, p0, Leu0;->E:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LqB;

    invoke-virtual {v1, p1}, LqB;->L(F)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public O(Z)V
    .locals 0

    iput-boolean p1, p0, Leu0;->I:Z

    return-void
.end method

.method public a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 3

    invoke-super {p0, p1, p2, p3}, LqB;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object p2, p0, Leu0;->E:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    const/4 p3, 0x1

    sub-int/2addr p2, p3

    :goto_0
    if-ltz p2, :cond_0

    iget-object v0, p0, Leu0;->F:Landroid/graphics/RectF;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, p0, Leu0;->E:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LqB;

    iget-object v1, p0, Leu0;->F:Landroid/graphics/RectF;

    iget-object v2, p0, LqB;->o:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1, v2, p3}, LqB;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object v0, p0, Leu0;->F:Landroid/graphics/RectF;

    invoke-virtual {p1, v0}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h(Ljava/lang/Object;LgE2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "LgE2<",
            "TT;>;)V"
        }
    .end annotation

    invoke-super {p0, p1, p2}, LqB;->h(Ljava/lang/Object;LgE2;)V

    sget-object v0, LaE2;->E:Ljava/lang/Float;

    if-ne p1, v0, :cond_1

    if-nez p2, :cond_0

    iget-object p1, p0, Leu0;->D:LoB;

    if-eqz p1, :cond_1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    goto :goto_0

    :cond_0
    new-instance p1, LCj6;

    invoke-direct {p1, p2}, LCj6;-><init>(LgE2;)V

    iput-object p1, p0, Leu0;->D:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    iget-object p1, p0, Leu0;->D:LoB;

    invoke-virtual {p0, p1}, LqB;->i(LoB;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public t(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V
    .locals 7

    const-string v0, "CompositionLayer#draw"

    invoke-static {v0}, LDl2;->a(Ljava/lang/String;)V

    iget-object v1, p0, Leu0;->G:Landroid/graphics/RectF;

    iget-object v2, p0, LqB;->q:Lfm2;

    invoke-virtual {v2}, Lfm2;->l()F

    move-result v2

    iget-object v3, p0, LqB;->q:Lfm2;

    invoke-virtual {v3}, Lfm2;->k()F

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v4, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v1, p0, Leu0;->G:Landroid/graphics/RectF;

    invoke-virtual {p2, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget-object v1, p0, LqB;->p:LRD2;

    invoke-virtual {v1}, LRD2;->c0()Z

    move-result v1

    const/16 v2, 0xff

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Leu0;->E:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v4, :cond_0

    if-eq p3, v2, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-eqz v1, :cond_1

    iget-object v5, p0, Leu0;->H:Landroid/graphics/Paint;

    invoke-virtual {v5, p3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v5, p0, Leu0;->G:Landroid/graphics/RectF;

    iget-object v6, p0, Leu0;->H:Landroid/graphics/Paint;

    invoke-static {p1, v5, v6}, LGi6;->m(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    :goto_1
    if-eqz v1, :cond_2

    move p3, v2

    :cond_2
    iget-object v1, p0, Leu0;->E:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v4

    :goto_2
    if-ltz v1, :cond_6

    iget-boolean v2, p0, Leu0;->I:Z

    if-nez v2, :cond_3

    iget-object v2, p0, LqB;->q:Lfm2;

    invoke-virtual {v2}, Lfm2;->i()Ljava/lang/String;

    move-result-object v2

    const-string v5, "__container"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    move v2, v4

    goto :goto_3

    :cond_3
    move v2, v3

    :goto_3
    if-nez v2, :cond_4

    iget-object v2, p0, Leu0;->G:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Leu0;->G:Landroid/graphics/RectF;

    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    move-result v2

    goto :goto_4

    :cond_4
    move v2, v4

    :goto_4
    if-eqz v2, :cond_5

    iget-object v2, p0, Leu0;->E:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LqB;

    invoke-virtual {v2, p1, p2, p3}, LqB;->d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V

    :cond_5
    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    invoke-static {v0}, LDl2;->b(Ljava/lang/String;)F

    return-void
.end method
