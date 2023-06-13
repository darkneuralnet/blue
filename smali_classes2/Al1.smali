.class public LAl1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp71;
.implements LoB$b;
.implements LDk2;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Paint;

.field public final c:LqB;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LhJ3;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public i:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Landroid/graphics/ColorFilter;",
            "Landroid/graphics/ColorFilter;",
            ">;"
        }
    .end annotation
.end field

.field public final j:LRD2;

.field public k:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public l:F

.field public m:LW71;


# direct methods
.method public constructor <init>(LRD2;LqB;Loy5;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, LAl1;->a:Landroid/graphics/Path;

    new-instance v1, LPl2;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, LPl2;-><init>(I)V

    iput-object v1, p0, LAl1;->b:Landroid/graphics/Paint;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LAl1;->f:Ljava/util/List;

    iput-object p2, p0, LAl1;->c:LqB;

    invoke-virtual {p3}, Loy5;->d()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, LAl1;->d:Ljava/lang/String;

    invoke-virtual {p3}, Loy5;->f()Z

    move-result v1

    iput-boolean v1, p0, LAl1;->e:Z

    iput-object p1, p0, LAl1;->j:LRD2;

    invoke-virtual {p2}, LqB;->v()LMY;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, LqB;->v()LMY;

    move-result-object p1

    invoke-virtual {p1}, LMY;->a()Lqe;

    move-result-object p1

    invoke-virtual {p1}, Lqe;->a()LoB;

    move-result-object p1

    iput-object p1, p0, LAl1;->k:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    iget-object p1, p0, LAl1;->k:LoB;

    invoke-virtual {p2, p1}, LqB;->i(LoB;)V

    :cond_0
    invoke-virtual {p2}, LqB;->x()LU71;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance p1, LW71;

    invoke-virtual {p2}, LqB;->x()LU71;

    move-result-object v1

    invoke-direct {p1, p0, p2, v1}, LW71;-><init>(LoB$b;LqB;LU71;)V

    iput-object p1, p0, LAl1;->m:LW71;

    :cond_1
    invoke-virtual {p3}, Loy5;->b()Lpe;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p3}, Loy5;->e()Lse;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p3}, Loy5;->c()Landroid/graphics/Path$FillType;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    invoke-virtual {p3}, Loy5;->b()Lpe;

    move-result-object p1

    invoke-virtual {p1}, Lpe;->a()LoB;

    move-result-object p1

    iput-object p1, p0, LAl1;->g:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    invoke-virtual {p2, p1}, LqB;->i(LoB;)V

    invoke-virtual {p3}, Loy5;->e()Lse;

    move-result-object p1

    invoke-virtual {p1}, Lse;->a()LoB;

    move-result-object p1

    iput-object p1, p0, LAl1;->h:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    invoke-virtual {p2, p1}, LqB;->i(LoB;)V

    return-void

    :cond_3
    :goto_0
    const/4 p1, 0x0

    iput-object p1, p0, LAl1;->g:LoB;

    iput-object p1, p0, LAl1;->h:LoB;

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 3

    iget-object p3, p0, LAl1;->a:Landroid/graphics/Path;

    invoke-virtual {p3}, Landroid/graphics/Path;->reset()V

    const/4 p3, 0x0

    move v0, p3

    :goto_0
    iget-object v1, p0, LAl1;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LAl1;->a:Landroid/graphics/Path;

    iget-object v2, p0, LAl1;->f:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LhJ3;

    invoke-interface {v2}, LhJ3;->getPath()Landroid/graphics/Path;

    move-result-object v2

    invoke-virtual {v1, v2, p2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object p2, p0, LAl1;->a:Landroid/graphics/Path;

    invoke-virtual {p2, p1, p3}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    iget p2, p1, Landroid/graphics/RectF;->left:F

    const/high16 p3, 0x3f800000    # 1.0f

    sub-float/2addr p2, p3

    iget v0, p1, Landroid/graphics/RectF;->top:F

    sub-float/2addr v0, p3

    iget v1, p1, Landroid/graphics/RectF;->right:F

    add-float/2addr v1, p3

    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v2, p3

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method public c(LBk2;ILjava/util/List;LBk2;)V
    .locals 0
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

    invoke-static {p1, p2, p3, p4, p0}, LrU2;->k(LBk2;ILjava/util/List;LBk2;LDk2;)V

    return-void
.end method

.method public d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V
    .locals 5

    iget-boolean v0, p0, LAl1;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "FillContent#draw"

    invoke-static {v0}, LDl2;->a(Ljava/lang/String;)V

    iget-object v1, p0, LAl1;->g:LoB;

    check-cast v1, Ltm0;

    invoke-virtual {v1}, Ltm0;->p()I

    move-result v1

    int-to-float p3, p3

    const/high16 v2, 0x437f0000    # 255.0f

    div-float/2addr p3, v2

    iget-object v3, p0, LAl1;->h:LoB;

    invoke-virtual {v3}, LoB;->h()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr p3, v3

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr p3, v3

    mul-float/2addr p3, v2

    float-to-int p3, p3

    iget-object v2, p0, LAl1;->b:Landroid/graphics/Paint;

    const/16 v3, 0xff

    const/4 v4, 0x0

    invoke-static {p3, v4, v3}, LrU2;->c(III)I

    move-result p3

    shl-int/lit8 p3, p3, 0x18

    const v3, 0xffffff

    and-int/2addr v1, v3

    or-int/2addr p3, v1

    invoke-virtual {v2, p3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p3, p0, LAl1;->i:LoB;

    if-eqz p3, :cond_1

    iget-object v1, p0, LAl1;->b:Landroid/graphics/Paint;

    invoke-virtual {p3}, LoB;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/ColorFilter;

    invoke-virtual {v1, p3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :cond_1
    iget-object p3, p0, LAl1;->k:LoB;

    if-eqz p3, :cond_4

    invoke-virtual {p3}, LoB;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    const/4 v1, 0x0

    cmpl-float v1, p3, v1

    if-nez v1, :cond_2

    iget-object v1, p0, LAl1;->b:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    goto :goto_0

    :cond_2
    iget v1, p0, LAl1;->l:F

    cmpl-float v1, p3, v1

    if-eqz v1, :cond_3

    iget-object v1, p0, LAl1;->c:LqB;

    invoke-virtual {v1, p3}, LqB;->w(F)Landroid/graphics/BlurMaskFilter;

    move-result-object v1

    iget-object v2, p0, LAl1;->b:Landroid/graphics/Paint;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    :cond_3
    :goto_0
    iput p3, p0, LAl1;->l:F

    :cond_4
    iget-object p3, p0, LAl1;->m:LW71;

    if-eqz p3, :cond_5

    iget-object v1, p0, LAl1;->b:Landroid/graphics/Paint;

    invoke-virtual {p3, v1}, LW71;->a(Landroid/graphics/Paint;)V

    :cond_5
    iget-object p3, p0, LAl1;->a:Landroid/graphics/Path;

    invoke-virtual {p3}, Landroid/graphics/Path;->reset()V

    :goto_1
    iget-object p3, p0, LAl1;->f:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    if-ge v4, p3, :cond_6

    iget-object p3, p0, LAl1;->a:Landroid/graphics/Path;

    iget-object v1, p0, LAl1;->f:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LhJ3;

    invoke-interface {v1}, LhJ3;->getPath()Landroid/graphics/Path;

    move-result-object v1

    invoke-virtual {p3, v1, p2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_6
    iget-object p2, p0, LAl1;->a:Landroid/graphics/Path;

    iget-object p3, p0, LAl1;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-static {v0}, LDl2;->b(Ljava/lang/String;)F

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, LAl1;->j:LRD2;

    invoke-virtual {v0}, LRD2;->invalidateSelf()V

    return-void
.end method

.method public f(Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LVz0;",
            ">;",
            "Ljava/util/List<",
            "LVz0;",
            ">;)V"
        }
    .end annotation

    const/4 p1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVz0;

    instance-of v1, v0, LhJ3;

    if-eqz v1, :cond_0

    iget-object v1, p0, LAl1;->f:Ljava/util/List;

    check-cast v0, LhJ3;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LAl1;->d:Ljava/lang/String;

    return-object v0
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

    sget-object v0, LaE2;->a:Ljava/lang/Integer;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LAl1;->g:LoB;

    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    goto/16 :goto_0

    :cond_0
    sget-object v0, LaE2;->d:Ljava/lang/Integer;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, LAl1;->h:LoB;

    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    goto/16 :goto_0

    :cond_1
    sget-object v0, LaE2;->K:Landroid/graphics/ColorFilter;

    if-ne p1, v0, :cond_4

    iget-object p1, p0, LAl1;->i:LoB;

    if-eqz p1, :cond_2

    iget-object v0, p0, LAl1;->c:LqB;

    invoke-virtual {v0, p1}, LqB;->G(LoB;)V

    :cond_2
    if-nez p2, :cond_3

    const/4 p1, 0x0

    iput-object p1, p0, LAl1;->i:LoB;

    goto/16 :goto_0

    :cond_3
    new-instance p1, LCj6;

    invoke-direct {p1, p2}, LCj6;-><init>(LgE2;)V

    iput-object p1, p0, LAl1;->i:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    iget-object p1, p0, LAl1;->c:LqB;

    iget-object p2, p0, LAl1;->i:LoB;

    invoke-virtual {p1, p2}, LqB;->i(LoB;)V

    goto :goto_0

    :cond_4
    sget-object v0, LaE2;->j:Ljava/lang/Float;

    if-ne p1, v0, :cond_6

    iget-object p1, p0, LAl1;->k:LoB;

    if-eqz p1, :cond_5

    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    goto :goto_0

    :cond_5
    new-instance p1, LCj6;

    invoke-direct {p1, p2}, LCj6;-><init>(LgE2;)V

    iput-object p1, p0, LAl1;->k:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    iget-object p1, p0, LAl1;->c:LqB;

    iget-object p2, p0, LAl1;->k:LoB;

    invoke-virtual {p1, p2}, LqB;->i(LoB;)V

    goto :goto_0

    :cond_6
    sget-object v0, LaE2;->e:Ljava/lang/Integer;

    if-ne p1, v0, :cond_7

    iget-object v0, p0, LAl1;->m:LW71;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p2}, LW71;->b(LgE2;)V

    goto :goto_0

    :cond_7
    sget-object v0, LaE2;->G:Ljava/lang/Float;

    if-ne p1, v0, :cond_8

    iget-object v0, p0, LAl1;->m:LW71;

    if-eqz v0, :cond_8

    invoke-virtual {v0, p2}, LW71;->f(LgE2;)V

    goto :goto_0

    :cond_8
    sget-object v0, LaE2;->H:Ljava/lang/Float;

    if-ne p1, v0, :cond_9

    iget-object v0, p0, LAl1;->m:LW71;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p2}, LW71;->c(LgE2;)V

    goto :goto_0

    :cond_9
    sget-object v0, LaE2;->I:Ljava/lang/Float;

    if-ne p1, v0, :cond_a

    iget-object v0, p0, LAl1;->m:LW71;

    if-eqz v0, :cond_a

    invoke-virtual {v0, p2}, LW71;->d(LgE2;)V

    goto :goto_0

    :cond_a
    sget-object v0, LaE2;->J:Ljava/lang/Float;

    if-ne p1, v0, :cond_b

    iget-object p1, p0, LAl1;->m:LW71;

    if-eqz p1, :cond_b

    invoke-virtual {p1, p2}, LW71;->g(LgE2;)V

    :cond_b
    :goto_0
    return-void
.end method
