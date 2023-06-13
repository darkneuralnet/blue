.class public abstract LsE;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LoB$b;
.implements LDk2;
.implements Lp71;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LsE$b;
    }
.end annotation


# instance fields
.field public final a:Landroid/graphics/PathMeasure;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/Path;

.field public final d:Landroid/graphics/RectF;

.field public final e:LRD2;

.field public final f:LqB;

.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LsE$b;",
            ">;"
        }
    .end annotation
.end field

.field public final h:[F

.field public final i:Landroid/graphics/Paint;

.field public final j:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final k:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "*",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LoB<",
            "*",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field

.field public final m:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public n:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Landroid/graphics/ColorFilter;",
            "Landroid/graphics/ColorFilter;",
            ">;"
        }
    .end annotation
.end field

.field public o:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public p:F

.field public q:LW71;


# direct methods
.method public constructor <init>(LRD2;LqB;Landroid/graphics/Paint$Cap;Landroid/graphics/Paint$Join;FLse;Lqe;Ljava/util/List;Lqe;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRD2;",
            "LqB;",
            "Landroid/graphics/Paint$Cap;",
            "Landroid/graphics/Paint$Join;",
            "F",
            "Lse;",
            "Lqe;",
            "Ljava/util/List<",
            "Lqe;",
            ">;",
            "Lqe;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/PathMeasure;

    invoke-direct {v0}, Landroid/graphics/PathMeasure;-><init>()V

    iput-object v0, p0, LsE;->a:Landroid/graphics/PathMeasure;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, LsE;->b:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, LsE;->c:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, LsE;->d:Landroid/graphics/RectF;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LsE;->g:Ljava/util/List;

    new-instance v0, LPl2;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LPl2;-><init>(I)V

    iput-object v0, p0, LsE;->i:Landroid/graphics/Paint;

    const/4 v1, 0x0

    iput v1, p0, LsE;->p:F

    iput-object p1, p0, LsE;->e:LRD2;

    iput-object p2, p0, LsE;->f:LqB;

    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    invoke-virtual {v0, p4}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    invoke-virtual {v0, p5}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    invoke-virtual {p6}, Lse;->a()LoB;

    move-result-object p1

    iput-object p1, p0, LsE;->k:LoB;

    invoke-virtual {p7}, Lqe;->a()LoB;

    move-result-object p1

    iput-object p1, p0, LsE;->j:LoB;

    if-nez p9, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, LsE;->m:LoB;

    goto :goto_0

    :cond_0
    invoke-virtual {p9}, Lqe;->a()LoB;

    move-result-object p1

    iput-object p1, p0, LsE;->m:LoB;

    :goto_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {p8}, Ljava/util/List;->size()I

    move-result p3

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, LsE;->l:Ljava/util/List;

    invoke-interface {p8}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [F

    iput-object p1, p0, LsE;->h:[F

    const/4 p1, 0x0

    move p3, p1

    :goto_1
    invoke-interface {p8}, Ljava/util/List;->size()I

    move-result p4

    if-ge p3, p4, :cond_1

    iget-object p4, p0, LsE;->l:Ljava/util/List;

    invoke-interface {p8, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lqe;

    invoke-virtual {p5}, Lqe;->a()LoB;

    move-result-object p5

    invoke-interface {p4, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    :cond_1
    iget-object p3, p0, LsE;->k:LoB;

    invoke-virtual {p2, p3}, LqB;->i(LoB;)V

    iget-object p3, p0, LsE;->j:LoB;

    invoke-virtual {p2, p3}, LqB;->i(LoB;)V

    move p3, p1

    :goto_2
    iget-object p4, p0, LsE;->l:Ljava/util/List;

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p4

    if-ge p3, p4, :cond_2

    iget-object p4, p0, LsE;->l:Ljava/util/List;

    invoke-interface {p4, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, LoB;

    invoke-virtual {p2, p4}, LqB;->i(LoB;)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_2
    iget-object p3, p0, LsE;->m:LoB;

    if-eqz p3, :cond_3

    invoke-virtual {p2, p3}, LqB;->i(LoB;)V

    :cond_3
    iget-object p3, p0, LsE;->k:LoB;

    invoke-virtual {p3, p0}, LoB;->a(LoB$b;)V

    iget-object p3, p0, LsE;->j:LoB;

    invoke-virtual {p3, p0}, LoB;->a(LoB$b;)V

    :goto_3
    invoke-interface {p8}, Ljava/util/List;->size()I

    move-result p3

    if-ge p1, p3, :cond_4

    iget-object p3, p0, LsE;->l:Ljava/util/List;

    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LoB;

    invoke-virtual {p3, p0}, LoB;->a(LoB$b;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_4
    iget-object p1, p0, LsE;->m:LoB;

    if-eqz p1, :cond_5

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    :cond_5
    invoke-virtual {p2}, LqB;->v()LMY;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p2}, LqB;->v()LMY;

    move-result-object p1

    invoke-virtual {p1}, LMY;->a()Lqe;

    move-result-object p1

    invoke-virtual {p1}, Lqe;->a()LoB;

    move-result-object p1

    iput-object p1, p0, LsE;->o:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    iget-object p1, p0, LsE;->o:LoB;

    invoke-virtual {p2, p1}, LqB;->i(LoB;)V

    :cond_6
    invoke-virtual {p2}, LqB;->x()LU71;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance p1, LW71;

    invoke-virtual {p2}, LqB;->x()LU71;

    move-result-object p3

    invoke-direct {p1, p0, p2, p3}, LW71;-><init>(LoB$b;LqB;LU71;)V

    iput-object p1, p0, LsE;->q:LW71;

    :cond_7
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 6

    const-string p3, "StrokeContent#getBounds"

    invoke-static {p3}, LDl2;->a(Ljava/lang/String;)V

    iget-object v0, p0, LsE;->b:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, LsE;->g:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, LsE;->g:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LsE$b;

    move v3, v0

    :goto_1
    invoke-static {v2}, LsE$b;->a(LsE$b;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_0

    iget-object v4, p0, LsE;->b:Landroid/graphics/Path;

    invoke-static {v2}, LsE$b;->a(LsE$b;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LhJ3;

    invoke-interface {v5}, LhJ3;->getPath()Landroid/graphics/Path;

    move-result-object v5

    invoke-virtual {v4, v5, p2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object p2, p0, LsE;->b:Landroid/graphics/Path;

    iget-object v1, p0, LsE;->d:Landroid/graphics/RectF;

    invoke-virtual {p2, v1, v0}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    iget-object p2, p0, LsE;->j:LoB;

    check-cast p2, Lou1;

    invoke-virtual {p2}, Lou1;->p()F

    move-result p2

    iget-object v0, p0, LsE;->d:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr p2, v2

    sub-float/2addr v1, p2

    iget v2, v0, Landroid/graphics/RectF;->top:F

    sub-float/2addr v2, p2

    iget v3, v0, Landroid/graphics/RectF;->right:F

    add-float/2addr v3, p2

    iget v4, v0, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v4, p2

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object p2, p0, LsE;->d:Landroid/graphics/RectF;

    invoke-virtual {p1, p2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    iget p2, p1, Landroid/graphics/RectF;->left:F

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr p2, v0

    iget v1, p1, Landroid/graphics/RectF;->top:F

    sub-float/2addr v1, v0

    iget v2, p1, Landroid/graphics/RectF;->right:F

    add-float/2addr v2, v0

    iget v3, p1, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v3, v0

    invoke-virtual {p1, p2, v1, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-static {p3}, LDl2;->b(Ljava/lang/String;)F

    return-void
.end method

.method public final b(Landroid/graphics/Matrix;)V
    .locals 5

    const-string v0, "StrokeContent#applyDashPattern"

    invoke-static {v0}, LDl2;->a(Ljava/lang/String;)V

    iget-object v1, p0, LsE;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LDl2;->b(Ljava/lang/String;)F

    return-void

    :cond_0
    invoke-static {p1}, LGi6;->g(Landroid/graphics/Matrix;)F

    move-result p1

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LsE;->l:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    iget-object v2, p0, LsE;->h:[F

    iget-object v3, p0, LsE;->l:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LoB;

    invoke-virtual {v3}, LoB;->h()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    aput v3, v2, v1

    rem-int/lit8 v2, v1, 0x2

    if-nez v2, :cond_1

    iget-object v2, p0, LsE;->h:[F

    aget v3, v2, v1

    const/high16 v4, 0x3f800000    # 1.0f

    cmpg-float v3, v3, v4

    if-gez v3, :cond_2

    aput v4, v2, v1

    goto :goto_1

    :cond_1
    iget-object v2, p0, LsE;->h:[F

    aget v3, v2, v1

    const v4, 0x3dcccccd    # 0.1f

    cmpg-float v3, v3, v4

    if-gez v3, :cond_2

    aput v4, v2, v1

    :cond_2
    :goto_1
    iget-object v2, p0, LsE;->h:[F

    aget v3, v2, v1

    mul-float/2addr v3, p1

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    iget-object v1, p0, LsE;->m:LoB;

    if-nez v1, :cond_4

    const/4 p1, 0x0

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, LoB;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    mul-float/2addr p1, v1

    :goto_2
    iget-object v1, p0, LsE;->i:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/DashPathEffect;

    iget-object v3, p0, LsE;->h:[F

    invoke-direct {v2, v3, p1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    invoke-static {v0}, LDl2;->b(Ljava/lang/String;)F

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
    .locals 6

    const-string v0, "StrokeContent#draw"

    invoke-static {v0}, LDl2;->a(Ljava/lang/String;)V

    invoke-static {p2}, LGi6;->h(Landroid/graphics/Matrix;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LDl2;->b(Ljava/lang/String;)F

    return-void

    :cond_0
    int-to-float p3, p3

    const/high16 v1, 0x437f0000    # 255.0f

    div-float/2addr p3, v1

    iget-object v2, p0, LsE;->k:LoB;

    check-cast v2, LN52;

    invoke-virtual {v2}, LN52;->p()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr p3, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr p3, v2

    mul-float/2addr p3, v1

    float-to-int p3, p3

    iget-object v1, p0, LsE;->i:Landroid/graphics/Paint;

    const/16 v2, 0xff

    const/4 v3, 0x0

    invoke-static {p3, v3, v2}, LrU2;->c(III)I

    move-result p3

    invoke-virtual {v1, p3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object p3, p0, LsE;->i:Landroid/graphics/Paint;

    iget-object v1, p0, LsE;->j:LoB;

    check-cast v1, Lou1;

    invoke-virtual {v1}, Lou1;->p()F

    move-result v1

    invoke-static {p2}, LGi6;->g(Landroid/graphics/Matrix;)F

    move-result v2

    mul-float/2addr v1, v2

    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p3, p0, LsE;->i:Landroid/graphics/Paint;

    invoke-virtual {p3}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result p3

    const/4 v1, 0x0

    cmpg-float p3, p3, v1

    if-gtz p3, :cond_1

    invoke-static {v0}, LDl2;->b(Ljava/lang/String;)F

    return-void

    :cond_1
    invoke-virtual {p0, p2}, LsE;->b(Landroid/graphics/Matrix;)V

    iget-object p3, p0, LsE;->n:LoB;

    if-eqz p3, :cond_2

    iget-object v2, p0, LsE;->i:Landroid/graphics/Paint;

    invoke-virtual {p3}, LoB;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/ColorFilter;

    invoke-virtual {v2, p3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :cond_2
    iget-object p3, p0, LsE;->o:LoB;

    if-eqz p3, :cond_5

    invoke-virtual {p3}, LoB;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    cmpl-float v1, p3, v1

    if-nez v1, :cond_3

    iget-object v1, p0, LsE;->i:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    goto :goto_0

    :cond_3
    iget v1, p0, LsE;->p:F

    cmpl-float v1, p3, v1

    if-eqz v1, :cond_4

    iget-object v1, p0, LsE;->f:LqB;

    invoke-virtual {v1, p3}, LqB;->w(F)Landroid/graphics/BlurMaskFilter;

    move-result-object v1

    iget-object v2, p0, LsE;->i:Landroid/graphics/Paint;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    :cond_4
    :goto_0
    iput p3, p0, LsE;->p:F

    :cond_5
    iget-object p3, p0, LsE;->q:LW71;

    if-eqz p3, :cond_6

    iget-object v1, p0, LsE;->i:Landroid/graphics/Paint;

    invoke-virtual {p3, v1}, LW71;->a(Landroid/graphics/Paint;)V

    :cond_6
    :goto_1
    iget-object p3, p0, LsE;->g:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    if-ge v3, p3, :cond_9

    iget-object p3, p0, LsE;->g:Ljava/util/List;

    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LsE$b;

    invoke-static {p3}, LsE$b;->b(LsE$b;)Lxa6;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {p0, p1, p3, p2}, LsE;->i(Landroid/graphics/Canvas;LsE$b;Landroid/graphics/Matrix;)V

    goto :goto_3

    :cond_7
    const-string v1, "StrokeContent#buildPath"

    invoke-static {v1}, LDl2;->a(Ljava/lang/String;)V

    iget-object v2, p0, LsE;->b:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    invoke-static {p3}, LsE$b;->a(LsE$b;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_2
    if-ltz v2, :cond_8

    iget-object v4, p0, LsE;->b:Landroid/graphics/Path;

    invoke-static {p3}, LsE$b;->a(LsE$b;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LhJ3;

    invoke-interface {v5}, LhJ3;->getPath()Landroid/graphics/Path;

    move-result-object v5

    invoke-virtual {v4, v5, p2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_8
    invoke-static {v1}, LDl2;->b(Ljava/lang/String;)F

    const-string p3, "StrokeContent#drawPath"

    invoke-static {p3}, LDl2;->a(Ljava/lang/String;)V

    iget-object v1, p0, LsE;->b:Landroid/graphics/Path;

    iget-object v2, p0, LsE;->i:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-static {p3}, LDl2;->b(Ljava/lang/String;)F

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_9
    invoke-static {v0}, LDl2;->b(Ljava/lang/String;)F

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, LsE;->e:LRD2;

    invoke-virtual {v0}, LRD2;->invalidateSelf()V

    return-void
.end method

.method public f(Ljava/util/List;Ljava/util/List;)V
    .locals 7
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

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    if-ltz v0, :cond_1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LVz0;

    instance-of v4, v3, Lxa6;

    if-eqz v4, :cond_0

    check-cast v3, Lxa6;

    invoke-virtual {v3}, Lxa6;->j()LAy5$a;

    move-result-object v4

    sget-object v5, LAy5$a;->c:LAy5$a;

    if-ne v4, v5, :cond_0

    move-object v2, v3

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {v2, p0}, Lxa6;->b(LoB$b;)V

    :cond_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    move-object v0, v1

    :goto_1
    if-ltz p1, :cond_7

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LVz0;

    instance-of v4, v3, Lxa6;

    if-eqz v4, :cond_4

    move-object v4, v3

    check-cast v4, Lxa6;

    invoke-virtual {v4}, Lxa6;->j()LAy5$a;

    move-result-object v5

    sget-object v6, LAy5$a;->c:LAy5$a;

    if-ne v5, v6, :cond_4

    if-eqz v0, :cond_3

    iget-object v3, p0, LsE;->g:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    new-instance v0, LsE$b;

    invoke-direct {v0, v4, v1}, LsE$b;-><init>(Lxa6;LsE$a;)V

    invoke-virtual {v4, p0}, Lxa6;->b(LoB$b;)V

    goto :goto_2

    :cond_4
    instance-of v4, v3, LhJ3;

    if-eqz v4, :cond_6

    if-nez v0, :cond_5

    new-instance v0, LsE$b;

    invoke-direct {v0, v2, v1}, LsE$b;-><init>(Lxa6;LsE$a;)V

    :cond_5
    invoke-static {v0}, LsE$b;->a(LsE$b;)Ljava/util/List;

    move-result-object v4

    check-cast v3, LhJ3;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    :goto_2
    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_7
    if-eqz v0, :cond_8

    iget-object p1, p0, LsE;->g:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
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

    sget-object v0, LaE2;->d:Ljava/lang/Integer;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LsE;->k:LoB;

    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    goto/16 :goto_0

    :cond_0
    sget-object v0, LaE2;->s:Ljava/lang/Float;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, LsE;->j:LoB;

    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    goto/16 :goto_0

    :cond_1
    sget-object v0, LaE2;->K:Landroid/graphics/ColorFilter;

    if-ne p1, v0, :cond_4

    iget-object p1, p0, LsE;->n:LoB;

    if-eqz p1, :cond_2

    iget-object v0, p0, LsE;->f:LqB;

    invoke-virtual {v0, p1}, LqB;->G(LoB;)V

    :cond_2
    if-nez p2, :cond_3

    const/4 p1, 0x0

    iput-object p1, p0, LsE;->n:LoB;

    goto/16 :goto_0

    :cond_3
    new-instance p1, LCj6;

    invoke-direct {p1, p2}, LCj6;-><init>(LgE2;)V

    iput-object p1, p0, LsE;->n:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    iget-object p1, p0, LsE;->f:LqB;

    iget-object p2, p0, LsE;->n:LoB;

    invoke-virtual {p1, p2}, LqB;->i(LoB;)V

    goto :goto_0

    :cond_4
    sget-object v0, LaE2;->j:Ljava/lang/Float;

    if-ne p1, v0, :cond_6

    iget-object p1, p0, LsE;->o:LoB;

    if-eqz p1, :cond_5

    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    goto :goto_0

    :cond_5
    new-instance p1, LCj6;

    invoke-direct {p1, p2}, LCj6;-><init>(LgE2;)V

    iput-object p1, p0, LsE;->o:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    iget-object p1, p0, LsE;->f:LqB;

    iget-object p2, p0, LsE;->o:LoB;

    invoke-virtual {p1, p2}, LqB;->i(LoB;)V

    goto :goto_0

    :cond_6
    sget-object v0, LaE2;->e:Ljava/lang/Integer;

    if-ne p1, v0, :cond_7

    iget-object v0, p0, LsE;->q:LW71;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p2}, LW71;->b(LgE2;)V

    goto :goto_0

    :cond_7
    sget-object v0, LaE2;->G:Ljava/lang/Float;

    if-ne p1, v0, :cond_8

    iget-object v0, p0, LsE;->q:LW71;

    if-eqz v0, :cond_8

    invoke-virtual {v0, p2}, LW71;->f(LgE2;)V

    goto :goto_0

    :cond_8
    sget-object v0, LaE2;->H:Ljava/lang/Float;

    if-ne p1, v0, :cond_9

    iget-object v0, p0, LsE;->q:LW71;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p2}, LW71;->c(LgE2;)V

    goto :goto_0

    :cond_9
    sget-object v0, LaE2;->I:Ljava/lang/Float;

    if-ne p1, v0, :cond_a

    iget-object v0, p0, LsE;->q:LW71;

    if-eqz v0, :cond_a

    invoke-virtual {v0, p2}, LW71;->d(LgE2;)V

    goto :goto_0

    :cond_a
    sget-object v0, LaE2;->J:Ljava/lang/Float;

    if-ne p1, v0, :cond_b

    iget-object p1, p0, LsE;->q:LW71;

    if-eqz p1, :cond_b

    invoke-virtual {p1, p2}, LW71;->g(LgE2;)V

    :cond_b
    :goto_0
    return-void
.end method

.method public final i(Landroid/graphics/Canvas;LsE$b;Landroid/graphics/Matrix;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    const-string v3, "StrokeContent#applyTrimPath"

    invoke-static {v3}, LDl2;->a(Ljava/lang/String;)V

    invoke-static/range {p2 .. p2}, LsE$b;->b(LsE$b;)Lxa6;

    move-result-object v4

    if-nez v4, :cond_0

    invoke-static {v3}, LDl2;->b(Ljava/lang/String;)F

    return-void

    :cond_0
    iget-object v4, v0, LsE;->b:Landroid/graphics/Path;

    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    invoke-static/range {p2 .. p2}, LsE$b;->a(LsE$b;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    :goto_0
    if-ltz v4, :cond_1

    iget-object v5, v0, LsE;->b:Landroid/graphics/Path;

    invoke-static/range {p2 .. p2}, LsE$b;->a(LsE$b;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LhJ3;

    invoke-interface {v6}, LhJ3;->getPath()Landroid/graphics/Path;

    move-result-object v6

    invoke-virtual {v5, v6, v2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_1
    invoke-static/range {p2 .. p2}, LsE$b;->b(LsE$b;)Lxa6;

    move-result-object v4

    invoke-virtual {v4}, Lxa6;->i()LoB;

    move-result-object v4

    invoke-virtual {v4}, LoB;->h()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    const/high16 v5, 0x42c80000    # 100.0f

    div-float/2addr v4, v5

    invoke-static/range {p2 .. p2}, LsE$b;->b(LsE$b;)Lxa6;

    move-result-object v6

    invoke-virtual {v6}, Lxa6;->c()LoB;

    move-result-object v6

    invoke-virtual {v6}, LoB;->h()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Float;

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    div-float/2addr v6, v5

    invoke-static/range {p2 .. p2}, LsE$b;->b(LsE$b;)Lxa6;

    move-result-object v5

    invoke-virtual {v5}, Lxa6;->h()LoB;

    move-result-object v5

    invoke-virtual {v5}, LoB;->h()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    const/high16 v7, 0x43b40000    # 360.0f

    div-float/2addr v5, v7

    const v7, 0x3c23d70a    # 0.01f

    cmpg-float v7, v4, v7

    if-gez v7, :cond_2

    const v7, 0x3f7d70a4    # 0.99f

    cmpl-float v7, v6, v7

    if-lez v7, :cond_2

    iget-object v2, v0, LsE;->b:Landroid/graphics/Path;

    iget-object v4, v0, LsE;->i:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-static {v3}, LDl2;->b(Ljava/lang/String;)F

    return-void

    :cond_2
    iget-object v7, v0, LsE;->a:Landroid/graphics/PathMeasure;

    iget-object v8, v0, LsE;->b:Landroid/graphics/Path;

    const/4 v9, 0x0

    invoke-virtual {v7, v8, v9}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    iget-object v7, v0, LsE;->a:Landroid/graphics/PathMeasure;

    invoke-virtual {v7}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v7

    :goto_1
    iget-object v8, v0, LsE;->a:Landroid/graphics/PathMeasure;

    invoke-virtual {v8}, Landroid/graphics/PathMeasure;->nextContour()Z

    move-result v8

    if-eqz v8, :cond_3

    iget-object v8, v0, LsE;->a:Landroid/graphics/PathMeasure;

    invoke-virtual {v8}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v8

    add-float/2addr v7, v8

    goto :goto_1

    :cond_3
    mul-float/2addr v5, v7

    mul-float/2addr v4, v7

    add-float/2addr v4, v5

    mul-float/2addr v6, v7

    add-float/2addr v6, v5

    add-float v5, v4, v7

    const/high16 v8, 0x3f800000    # 1.0f

    sub-float/2addr v5, v8

    invoke-static {v6, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    invoke-static/range {p2 .. p2}, LsE$b;->a(LsE$b;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    const/4 v10, 0x0

    move v11, v10

    :goto_2
    if-ltz v6, :cond_b

    iget-object v12, v0, LsE;->c:Landroid/graphics/Path;

    invoke-static/range {p2 .. p2}, LsE$b;->a(LsE$b;)Ljava/util/List;

    move-result-object v13

    invoke-interface {v13, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LhJ3;

    invoke-interface {v13}, LhJ3;->getPath()Landroid/graphics/Path;

    move-result-object v13

    invoke-virtual {v12, v13}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    iget-object v12, v0, LsE;->c:Landroid/graphics/Path;

    invoke-virtual {v12, v2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    iget-object v12, v0, LsE;->a:Landroid/graphics/PathMeasure;

    iget-object v13, v0, LsE;->c:Landroid/graphics/Path;

    invoke-virtual {v12, v13, v9}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    iget-object v12, v0, LsE;->a:Landroid/graphics/PathMeasure;

    invoke-virtual {v12}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v12

    cmpl-float v13, v5, v7

    if-lez v13, :cond_5

    sub-float v13, v5, v7

    add-float v14, v11, v12

    cmpg-float v14, v13, v14

    if-gez v14, :cond_5

    cmpg-float v14, v11, v13

    if-gez v14, :cond_5

    cmpl-float v14, v4, v7

    if-lez v14, :cond_4

    sub-float v14, v4, v7

    div-float/2addr v14, v12

    goto :goto_3

    :cond_4
    move v14, v10

    :goto_3
    div-float/2addr v13, v12

    invoke-static {v13, v8}, Ljava/lang/Math;->min(FF)F

    move-result v13

    iget-object v15, v0, LsE;->c:Landroid/graphics/Path;

    invoke-static {v15, v14, v13, v10}, LGi6;->a(Landroid/graphics/Path;FFF)V

    iget-object v13, v0, LsE;->c:Landroid/graphics/Path;

    iget-object v14, v0, LsE;->i:Landroid/graphics/Paint;

    invoke-virtual {v1, v13, v14}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_6

    :cond_5
    add-float v13, v11, v12

    cmpg-float v14, v13, v4

    if-ltz v14, :cond_a

    cmpl-float v14, v11, v5

    if-lez v14, :cond_6

    goto :goto_6

    :cond_6
    cmpg-float v14, v13, v5

    if-gtz v14, :cond_7

    cmpg-float v14, v4, v11

    if-gez v14, :cond_7

    iget-object v13, v0, LsE;->c:Landroid/graphics/Path;

    iget-object v14, v0, LsE;->i:Landroid/graphics/Paint;

    invoke-virtual {v1, v13, v14}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_6

    :cond_7
    cmpg-float v14, v4, v11

    if-gez v14, :cond_8

    move v14, v10

    goto :goto_4

    :cond_8
    sub-float v14, v4, v11

    div-float/2addr v14, v12

    :goto_4
    cmpl-float v13, v5, v13

    if-lez v13, :cond_9

    move v13, v8

    goto :goto_5

    :cond_9
    sub-float v13, v5, v11

    div-float/2addr v13, v12

    :goto_5
    iget-object v15, v0, LsE;->c:Landroid/graphics/Path;

    invoke-static {v15, v14, v13, v10}, LGi6;->a(Landroid/graphics/Path;FFF)V

    iget-object v13, v0, LsE;->c:Landroid/graphics/Path;

    iget-object v14, v0, LsE;->i:Landroid/graphics/Paint;

    invoke-virtual {v1, v13, v14}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_a
    :goto_6
    add-float/2addr v11, v12

    add-int/lit8 v6, v6, -0x1

    goto/16 :goto_2

    :cond_b
    invoke-static {v3}, LDl2;->b(Ljava/lang/String;)F

    return-void
.end method
