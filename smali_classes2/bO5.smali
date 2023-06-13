.class public LbO5;
.super LoB;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LoB<",
        "Landroid/graphics/PointF;",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# instance fields
.field public final i:Landroid/graphics/PointF;

.field public final j:Landroid/graphics/PointF;

.field public final k:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final l:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public m:LgE2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LgE2<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public n:LgE2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LgE2<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LoB;LoB;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;",
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, LoB;-><init>(Ljava/util/List;)V

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, LbO5;->i:Landroid/graphics/PointF;

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, LbO5;->j:Landroid/graphics/PointF;

    iput-object p1, p0, LbO5;->k:LoB;

    iput-object p2, p0, LbO5;->l:LoB;

    invoke-virtual {p0}, LoB;->f()F

    move-result p1

    invoke-virtual {p0, p1}, LbO5;->m(F)V

    return-void
.end method


# virtual methods
.method public bridge synthetic h()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LbO5;->p()Landroid/graphics/PointF;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic i(Lfl2;F)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LbO5;->q(Lfl2;F)Landroid/graphics/PointF;

    move-result-object p1

    return-object p1
.end method

.method public m(F)V
    .locals 2

    iget-object v0, p0, LbO5;->k:LoB;

    invoke-virtual {v0, p1}, LoB;->m(F)V

    iget-object v0, p0, LbO5;->l:LoB;

    invoke-virtual {v0, p1}, LoB;->m(F)V

    iget-object p1, p0, LbO5;->i:Landroid/graphics/PointF;

    iget-object v0, p0, LbO5;->k:LoB;

    invoke-virtual {v0}, LoB;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v1, p0, LbO5;->l:LoB;

    invoke-virtual {v1}, LoB;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/PointF;->set(FF)V

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, LoB;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, LoB;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LoB$b;

    invoke-interface {v0}, LoB$b;->e()V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public p()Landroid/graphics/PointF;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, LbO5;->q(Lfl2;F)Landroid/graphics/PointF;

    move-result-object v0

    return-object v0
.end method

.method public q(Lfl2;F)Landroid/graphics/PointF;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfl2<",
            "Landroid/graphics/PointF;",
            ">;F)",
            "Landroid/graphics/PointF;"
        }
    .end annotation

    iget-object p1, p0, LbO5;->m:LgE2;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, LbO5;->k:LoB;

    invoke-virtual {p1}, LoB;->b()Lfl2;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v1, p0, LbO5;->k:LoB;

    invoke-virtual {v1}, LoB;->d()F

    move-result v9

    iget-object v1, p1, Lfl2;->h:Ljava/lang/Float;

    iget-object v2, p0, LbO5;->m:LgE2;

    iget v3, p1, Lfl2;->g:F

    if-nez v1, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    move v4, v1

    :goto_0
    iget-object v1, p1, Lfl2;->b:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ljava/lang/Float;

    iget-object p1, p1, Lfl2;->c:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ljava/lang/Float;

    move v7, p2

    move v8, p2

    invoke-virtual/range {v2 .. v9}, LgE2;->b(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    iget-object v1, p0, LbO5;->n:LgE2;

    if-eqz v1, :cond_3

    iget-object v1, p0, LbO5;->l:LoB;

    invoke-virtual {v1}, LoB;->b()Lfl2;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v0, p0, LbO5;->l:LoB;

    invoke-virtual {v0}, LoB;->d()F

    move-result v9

    iget-object v0, v1, Lfl2;->h:Ljava/lang/Float;

    iget-object v2, p0, LbO5;->n:LgE2;

    iget v3, v1, Lfl2;->g:F

    if-nez v0, :cond_2

    move v4, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    move v4, v0

    :goto_2
    iget-object v0, v1, Lfl2;->b:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/Float;

    iget-object v0, v1, Lfl2;->c:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/Float;

    move v7, p2

    move v8, p2

    invoke-virtual/range {v2 .. v9}, LgE2;->b(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Ljava/lang/Float;

    :cond_3
    const/4 p2, 0x0

    if-nez p1, :cond_4

    iget-object p1, p0, LbO5;->j:Landroid/graphics/PointF;

    iget-object v1, p0, LbO5;->i:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    invoke-virtual {p1, v1, p2}, Landroid/graphics/PointF;->set(FF)V

    goto :goto_3

    :cond_4
    iget-object v1, p0, LbO5;->j:Landroid/graphics/PointF;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v1, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    :goto_3
    if-nez v0, :cond_5

    iget-object p1, p0, LbO5;->j:Landroid/graphics/PointF;

    iget p2, p1, Landroid/graphics/PointF;->x:F

    iget-object v0, p0, LbO5;->i:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    invoke-virtual {p1, p2, v0}, Landroid/graphics/PointF;->set(FF)V

    goto :goto_4

    :cond_5
    iget-object p1, p0, LbO5;->j:Landroid/graphics/PointF;

    iget p2, p1, Landroid/graphics/PointF;->x:F

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/graphics/PointF;->set(FF)V

    :goto_4
    iget-object p1, p0, LbO5;->j:Landroid/graphics/PointF;

    return-object p1
.end method

.method public r(LgE2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgE2<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LbO5;->m:LgE2;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LgE2;->c(LoB;)V

    :cond_0
    iput-object p1, p0, LbO5;->m:LgE2;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, LgE2;->c(LoB;)V

    :cond_1
    return-void
.end method

.method public s(LgE2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgE2<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LbO5;->n:LgE2;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LgE2;->c(LoB;)V

    :cond_0
    iput-object p1, p0, LbO5;->n:LgE2;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, LgE2;->c(LoB;)V

    :cond_1
    return-void
.end method
