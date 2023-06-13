.class public Lm96;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Matrix;

.field public final b:Landroid/graphics/Matrix;

.field public final c:Landroid/graphics/Matrix;

.field public final d:Landroid/graphics/Matrix;

.field public final e:[F

.field public f:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public g:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "*",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public h:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ldj5;",
            "Ldj5;",
            ">;"
        }
    .end annotation
.end field

.field public i:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public j:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public k:Lou1;

.field public l:Lou1;

.field public m:LoB;
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
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LEe;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lm96;->a:Landroid/graphics/Matrix;

    invoke-virtual {p1}, LEe;->c()Lve;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LEe;->c()Lve;

    move-result-object v0

    invoke-virtual {v0}, Lve;->a()LoB;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lm96;->f:LoB;

    invoke-virtual {p1}, LEe;->f()LGe;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v0, v1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, LEe;->f()LGe;

    move-result-object v0

    invoke-interface {v0}, LGe;->a()LoB;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lm96;->g:LoB;

    invoke-virtual {p1}, LEe;->h()Lye;

    move-result-object v0

    if-nez v0, :cond_2

    move-object v0, v1

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, LEe;->h()Lye;

    move-result-object v0

    invoke-virtual {v0}, Lye;->a()LoB;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lm96;->h:LoB;

    invoke-virtual {p1}, LEe;->g()Lqe;

    move-result-object v0

    if-nez v0, :cond_3

    move-object v0, v1

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, LEe;->g()Lqe;

    move-result-object v0

    invoke-virtual {v0}, Lqe;->a()LoB;

    move-result-object v0

    :goto_3
    iput-object v0, p0, Lm96;->i:LoB;

    invoke-virtual {p1}, LEe;->i()Lqe;

    move-result-object v0

    if-nez v0, :cond_4

    move-object v0, v1

    goto :goto_4

    :cond_4
    invoke-virtual {p1}, LEe;->i()Lqe;

    move-result-object v0

    invoke-virtual {v0}, Lqe;->a()LoB;

    move-result-object v0

    check-cast v0, Lou1;

    :goto_4
    iput-object v0, p0, Lm96;->k:Lou1;

    if-eqz v0, :cond_5

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lm96;->b:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lm96;->c:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lm96;->d:Landroid/graphics/Matrix;

    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lm96;->e:[F

    goto :goto_5

    :cond_5
    iput-object v1, p0, Lm96;->b:Landroid/graphics/Matrix;

    iput-object v1, p0, Lm96;->c:Landroid/graphics/Matrix;

    iput-object v1, p0, Lm96;->d:Landroid/graphics/Matrix;

    iput-object v1, p0, Lm96;->e:[F

    :goto_5
    invoke-virtual {p1}, LEe;->j()Lqe;

    move-result-object v0

    if-nez v0, :cond_6

    move-object v0, v1

    goto :goto_6

    :cond_6
    invoke-virtual {p1}, LEe;->j()Lqe;

    move-result-object v0

    invoke-virtual {v0}, Lqe;->a()LoB;

    move-result-object v0

    check-cast v0, Lou1;

    :goto_6
    iput-object v0, p0, Lm96;->l:Lou1;

    invoke-virtual {p1}, LEe;->e()Lse;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, LEe;->e()Lse;

    move-result-object v0

    invoke-virtual {v0}, Lse;->a()LoB;

    move-result-object v0

    iput-object v0, p0, Lm96;->j:LoB;

    :cond_7
    invoke-virtual {p1}, LEe;->k()Lqe;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, LEe;->k()Lqe;

    move-result-object v0

    invoke-virtual {v0}, Lqe;->a()LoB;

    move-result-object v0

    iput-object v0, p0, Lm96;->m:LoB;

    goto :goto_7

    :cond_8
    iput-object v1, p0, Lm96;->m:LoB;

    :goto_7
    invoke-virtual {p1}, LEe;->d()Lqe;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, LEe;->d()Lqe;

    move-result-object p1

    invoke-virtual {p1}, Lqe;->a()LoB;

    move-result-object p1

    iput-object p1, p0, Lm96;->n:LoB;

    goto :goto_8

    :cond_9
    iput-object v1, p0, Lm96;->n:LoB;

    :goto_8
    return-void
.end method


# virtual methods
.method public a(LqB;)V
    .locals 1

    iget-object v0, p0, Lm96;->j:LoB;

    invoke-virtual {p1, v0}, LqB;->i(LoB;)V

    iget-object v0, p0, Lm96;->m:LoB;

    invoke-virtual {p1, v0}, LqB;->i(LoB;)V

    iget-object v0, p0, Lm96;->n:LoB;

    invoke-virtual {p1, v0}, LqB;->i(LoB;)V

    iget-object v0, p0, Lm96;->f:LoB;

    invoke-virtual {p1, v0}, LqB;->i(LoB;)V

    iget-object v0, p0, Lm96;->g:LoB;

    invoke-virtual {p1, v0}, LqB;->i(LoB;)V

    iget-object v0, p0, Lm96;->h:LoB;

    invoke-virtual {p1, v0}, LqB;->i(LoB;)V

    iget-object v0, p0, Lm96;->i:LoB;

    invoke-virtual {p1, v0}, LqB;->i(LoB;)V

    iget-object v0, p0, Lm96;->k:Lou1;

    invoke-virtual {p1, v0}, LqB;->i(LoB;)V

    iget-object v0, p0, Lm96;->l:Lou1;

    invoke-virtual {p1, v0}, LqB;->i(LoB;)V

    return-void
.end method

.method public b(LoB$b;)V
    .locals 1

    iget-object v0, p0, Lm96;->j:LoB;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LoB;->a(LoB$b;)V

    :cond_0
    iget-object v0, p0, Lm96;->m:LoB;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, LoB;->a(LoB$b;)V

    :cond_1
    iget-object v0, p0, Lm96;->n:LoB;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, LoB;->a(LoB$b;)V

    :cond_2
    iget-object v0, p0, Lm96;->f:LoB;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, LoB;->a(LoB$b;)V

    :cond_3
    iget-object v0, p0, Lm96;->g:LoB;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1}, LoB;->a(LoB$b;)V

    :cond_4
    iget-object v0, p0, Lm96;->h:LoB;

    if-eqz v0, :cond_5

    invoke-virtual {v0, p1}, LoB;->a(LoB$b;)V

    :cond_5
    iget-object v0, p0, Lm96;->i:LoB;

    if-eqz v0, :cond_6

    invoke-virtual {v0, p1}, LoB;->a(LoB$b;)V

    :cond_6
    iget-object v0, p0, Lm96;->k:Lou1;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, LoB;->a(LoB$b;)V

    :cond_7
    iget-object v0, p0, Lm96;->l:Lou1;

    if-eqz v0, :cond_8

    invoke-virtual {v0, p1}, LoB;->a(LoB$b;)V

    :cond_8
    return-void
.end method

.method public c(Ljava/lang/Object;LgE2;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "LgE2<",
            "TT;>;)Z"
        }
    .end annotation

    sget-object v0, LaE2;->f:Landroid/graphics/PointF;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lm96;->f:LoB;

    if-nez p1, :cond_0

    new-instance p1, LCj6;

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    invoke-direct {p1, p2, v0}, LCj6;-><init>(LgE2;Ljava/lang/Object;)V

    iput-object p1, p0, Lm96;->f:LoB;

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    goto/16 :goto_0

    :cond_1
    sget-object v0, LaE2;->g:Landroid/graphics/PointF;

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Lm96;->g:LoB;

    if-nez p1, :cond_2

    new-instance p1, LCj6;

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    invoke-direct {p1, p2, v0}, LCj6;-><init>(LgE2;Ljava/lang/Object;)V

    iput-object p1, p0, Lm96;->g:LoB;

    goto/16 :goto_0

    :cond_2
    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    goto/16 :goto_0

    :cond_3
    sget-object v0, LaE2;->h:Ljava/lang/Float;

    if-ne p1, v0, :cond_4

    iget-object v0, p0, Lm96;->g:LoB;

    instance-of v1, v0, LbO5;

    if-eqz v1, :cond_4

    check-cast v0, LbO5;

    invoke-virtual {v0, p2}, LbO5;->r(LgE2;)V

    goto/16 :goto_0

    :cond_4
    sget-object v0, LaE2;->i:Ljava/lang/Float;

    if-ne p1, v0, :cond_5

    iget-object v0, p0, Lm96;->g:LoB;

    instance-of v1, v0, LbO5;

    if-eqz v1, :cond_5

    check-cast v0, LbO5;

    invoke-virtual {v0, p2}, LbO5;->s(LgE2;)V

    goto/16 :goto_0

    :cond_5
    sget-object v0, LaE2;->o:Ldj5;

    if-ne p1, v0, :cond_7

    iget-object p1, p0, Lm96;->h:LoB;

    if-nez p1, :cond_6

    new-instance p1, LCj6;

    new-instance v0, Ldj5;

    invoke-direct {v0}, Ldj5;-><init>()V

    invoke-direct {p1, p2, v0}, LCj6;-><init>(LgE2;Ljava/lang/Object;)V

    iput-object p1, p0, Lm96;->h:LoB;

    goto/16 :goto_0

    :cond_6
    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    goto/16 :goto_0

    :cond_7
    sget-object v0, LaE2;->p:Ljava/lang/Float;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_9

    iget-object p1, p0, Lm96;->i:LoB;

    if-nez p1, :cond_8

    new-instance p1, LCj6;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-direct {p1, p2, v0}, LCj6;-><init>(LgE2;Ljava/lang/Object;)V

    iput-object p1, p0, Lm96;->i:LoB;

    goto/16 :goto_0

    :cond_8
    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    goto/16 :goto_0

    :cond_9
    sget-object v0, LaE2;->c:Ljava/lang/Integer;

    if-ne p1, v0, :cond_b

    iget-object p1, p0, Lm96;->j:LoB;

    if-nez p1, :cond_a

    new-instance p1, LCj6;

    const/16 v0, 0x64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p1, p2, v0}, LCj6;-><init>(LgE2;Ljava/lang/Object;)V

    iput-object p1, p0, Lm96;->j:LoB;

    goto/16 :goto_0

    :cond_a
    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    goto/16 :goto_0

    :cond_b
    sget-object v0, LaE2;->C:Ljava/lang/Float;

    const/high16 v2, 0x42c80000    # 100.0f

    if-ne p1, v0, :cond_d

    iget-object p1, p0, Lm96;->m:LoB;

    if-nez p1, :cond_c

    new-instance p1, LCj6;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-direct {p1, p2, v0}, LCj6;-><init>(LgE2;Ljava/lang/Object;)V

    iput-object p1, p0, Lm96;->m:LoB;

    goto :goto_0

    :cond_c
    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    goto :goto_0

    :cond_d
    sget-object v0, LaE2;->D:Ljava/lang/Float;

    if-ne p1, v0, :cond_f

    iget-object p1, p0, Lm96;->n:LoB;

    if-nez p1, :cond_e

    new-instance p1, LCj6;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-direct {p1, p2, v0}, LCj6;-><init>(LgE2;Ljava/lang/Object;)V

    iput-object p1, p0, Lm96;->n:LoB;

    goto :goto_0

    :cond_e
    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    goto :goto_0

    :cond_f
    sget-object v0, LaE2;->q:Ljava/lang/Float;

    if-ne p1, v0, :cond_11

    iget-object p1, p0, Lm96;->k:Lou1;

    if-nez p1, :cond_10

    new-instance p1, Lou1;

    new-instance v0, Lfl2;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-direct {v0, v1}, Lfl2;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v0}, Lou1;-><init>(Ljava/util/List;)V

    iput-object p1, p0, Lm96;->k:Lou1;

    :cond_10
    iget-object p1, p0, Lm96;->k:Lou1;

    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    goto :goto_0

    :cond_11
    sget-object v0, LaE2;->r:Ljava/lang/Float;

    if-ne p1, v0, :cond_13

    iget-object p1, p0, Lm96;->l:Lou1;

    if-nez p1, :cond_12

    new-instance p1, Lou1;

    new-instance v0, Lfl2;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-direct {v0, v1}, Lfl2;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v0}, Lou1;-><init>(Ljava/util/List;)V

    iput-object p1, p0, Lm96;->l:Lou1;

    :cond_12
    iget-object p1, p0, Lm96;->l:Lou1;

    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_13
    const/4 p1, 0x0

    return p1
.end method

.method public final d()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x9

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lm96;->e:[F

    const/4 v2, 0x0

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e()LoB;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LoB<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm96;->n:LoB;

    return-object v0
.end method

.method public f()Landroid/graphics/Matrix;
    .locals 13

    iget-object v0, p0, Lm96;->a:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    iget-object v0, p0, Lm96;->g:LoB;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LoB;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    if-eqz v0, :cond_1

    iget v2, v0, Landroid/graphics/PointF;->x:F

    cmpl-float v3, v2, v1

    if-nez v3, :cond_0

    iget v3, v0, Landroid/graphics/PointF;->y:F

    cmpl-float v3, v3, v1

    if-eqz v3, :cond_1

    :cond_0
    iget-object v3, p0, Lm96;->a:Landroid/graphics/Matrix;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    invoke-virtual {v3, v2, v0}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    :cond_1
    iget-object v0, p0, Lm96;->i:LoB;

    if-eqz v0, :cond_3

    instance-of v2, v0, LCj6;

    if-eqz v2, :cond_2

    invoke-virtual {v0}, LoB;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_2
    check-cast v0, Lou1;

    invoke-virtual {v0}, Lou1;->p()F

    move-result v0

    :goto_0
    cmpl-float v2, v0, v1

    if-eqz v2, :cond_3

    iget-object v2, p0, Lm96;->a:Landroid/graphics/Matrix;

    invoke-virtual {v2, v0}, Landroid/graphics/Matrix;->preRotate(F)Z

    :cond_3
    iget-object v0, p0, Lm96;->k:Lou1;

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v0, :cond_6

    iget-object v3, p0, Lm96;->l:Lou1;

    const/high16 v4, 0x42b40000    # 90.0f

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_1

    :cond_4
    invoke-virtual {v3}, Lou1;->p()F

    move-result v3

    neg-float v3, v3

    add-float/2addr v3, v4

    float-to-double v5, v3

    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    double-to-float v3, v5

    :goto_1
    iget-object v5, p0, Lm96;->l:Lou1;

    if-nez v5, :cond_5

    move v4, v2

    goto :goto_2

    :cond_5
    invoke-virtual {v5}, Lou1;->p()F

    move-result v5

    neg-float v5, v5

    add-float/2addr v5, v4

    float-to-double v4, v5

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    double-to-float v4, v4

    :goto_2
    invoke-virtual {v0}, Lou1;->p()F

    move-result v0

    float-to-double v5, v0

    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Math;->tan(D)D

    move-result-wide v5

    double-to-float v0, v5

    invoke-virtual {p0}, Lm96;->d()V

    iget-object v5, p0, Lm96;->e:[F

    const/4 v6, 0x0

    aput v3, v5, v6

    const/4 v7, 0x1

    aput v4, v5, v7

    neg-float v8, v4

    const/4 v9, 0x3

    aput v8, v5, v9

    const/4 v10, 0x4

    aput v3, v5, v10

    const/16 v11, 0x8

    aput v2, v5, v11

    iget-object v12, p0, Lm96;->b:Landroid/graphics/Matrix;

    invoke-virtual {v12, v5}, Landroid/graphics/Matrix;->setValues([F)V

    invoke-virtual {p0}, Lm96;->d()V

    iget-object v5, p0, Lm96;->e:[F

    aput v2, v5, v6

    aput v0, v5, v9

    aput v2, v5, v10

    aput v2, v5, v11

    iget-object v0, p0, Lm96;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, v5}, Landroid/graphics/Matrix;->setValues([F)V

    invoke-virtual {p0}, Lm96;->d()V

    iget-object v0, p0, Lm96;->e:[F

    aput v3, v0, v6

    aput v8, v0, v7

    aput v4, v0, v9

    aput v3, v0, v10

    aput v2, v0, v11

    iget-object v3, p0, Lm96;->d:Landroid/graphics/Matrix;

    invoke-virtual {v3, v0}, Landroid/graphics/Matrix;->setValues([F)V

    iget-object v0, p0, Lm96;->c:Landroid/graphics/Matrix;

    iget-object v3, p0, Lm96;->b:Landroid/graphics/Matrix;

    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    iget-object v0, p0, Lm96;->d:Landroid/graphics/Matrix;

    iget-object v3, p0, Lm96;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    iget-object v0, p0, Lm96;->a:Landroid/graphics/Matrix;

    iget-object v3, p0, Lm96;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    :cond_6
    iget-object v0, p0, Lm96;->h:LoB;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, LoB;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldj5;

    invoke-virtual {v0}, Ldj5;->b()F

    move-result v3

    cmpl-float v3, v3, v2

    if-nez v3, :cond_7

    invoke-virtual {v0}, Ldj5;->c()F

    move-result v3

    cmpl-float v2, v3, v2

    if-eqz v2, :cond_8

    :cond_7
    iget-object v2, p0, Lm96;->a:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Ldj5;->b()F

    move-result v3

    invoke-virtual {v0}, Ldj5;->c()F

    move-result v0

    invoke-virtual {v2, v3, v0}, Landroid/graphics/Matrix;->preScale(FF)Z

    :cond_8
    iget-object v0, p0, Lm96;->f:LoB;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, LoB;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    if-eqz v0, :cond_9

    iget v2, v0, Landroid/graphics/PointF;->x:F

    cmpl-float v2, v2, v1

    if-nez v2, :cond_a

    :cond_9
    iget v2, v0, Landroid/graphics/PointF;->y:F

    cmpl-float v1, v2, v1

    if-eqz v1, :cond_b

    :cond_a
    iget-object v1, p0, Lm96;->a:Landroid/graphics/Matrix;

    iget v2, v0, Landroid/graphics/PointF;->x:F

    neg-float v2, v2

    iget v0, v0, Landroid/graphics/PointF;->y:F

    neg-float v0, v0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    :cond_b
    iget-object v0, p0, Lm96;->a:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public g(F)Landroid/graphics/Matrix;
    .locals 9

    iget-object v0, p0, Lm96;->g:LoB;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LoB;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    :goto_0
    iget-object v2, p0, Lm96;->h:LoB;

    if-nez v2, :cond_1

    move-object v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, LoB;->h()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldj5;

    :goto_1
    iget-object v3, p0, Lm96;->a:Landroid/graphics/Matrix;

    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    if-eqz v0, :cond_2

    iget-object v3, p0, Lm96;->a:Landroid/graphics/Matrix;

    iget v4, v0, Landroid/graphics/PointF;->x:F

    mul-float/2addr v4, p1

    iget v0, v0, Landroid/graphics/PointF;->y:F

    mul-float/2addr v0, p1

    invoke-virtual {v3, v4, v0}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    :cond_2
    if-eqz v2, :cond_3

    iget-object v0, p0, Lm96;->a:Landroid/graphics/Matrix;

    invoke-virtual {v2}, Ldj5;->b()F

    move-result v3

    float-to-double v3, v3

    float-to-double v5, p1

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    double-to-float v3, v3

    invoke-virtual {v2}, Ldj5;->c()F

    move-result v2

    float-to-double v7, v2

    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    double-to-float v2, v4

    invoke-virtual {v0, v3, v2}, Landroid/graphics/Matrix;->preScale(FF)Z

    :cond_3
    iget-object v0, p0, Lm96;->i:LoB;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, LoB;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v2, p0, Lm96;->f:LoB;

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v2}, LoB;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    :goto_2
    iget-object v2, p0, Lm96;->a:Landroid/graphics/Matrix;

    mul-float/2addr v0, p1

    const/4 p1, 0x0

    if-nez v1, :cond_5

    move v3, p1

    goto :goto_3

    :cond_5
    iget v3, v1, Landroid/graphics/PointF;->x:F

    :goto_3
    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    iget p1, v1, Landroid/graphics/PointF;->y:F

    :goto_4
    invoke-virtual {v2, v0, v3, p1}, Landroid/graphics/Matrix;->preRotate(FFF)Z

    :cond_7
    iget-object p1, p0, Lm96;->a:Landroid/graphics/Matrix;

    return-object p1
.end method

.method public h()LoB;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LoB<",
            "*",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm96;->j:LoB;

    return-object v0
.end method

.method public i()LoB;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LoB<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm96;->m:LoB;

    return-object v0
.end method

.method public j(F)V
    .locals 1

    iget-object v0, p0, Lm96;->j:LoB;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LoB;->m(F)V

    :cond_0
    iget-object v0, p0, Lm96;->m:LoB;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, LoB;->m(F)V

    :cond_1
    iget-object v0, p0, Lm96;->n:LoB;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, LoB;->m(F)V

    :cond_2
    iget-object v0, p0, Lm96;->f:LoB;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, LoB;->m(F)V

    :cond_3
    iget-object v0, p0, Lm96;->g:LoB;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1}, LoB;->m(F)V

    :cond_4
    iget-object v0, p0, Lm96;->h:LoB;

    if-eqz v0, :cond_5

    invoke-virtual {v0, p1}, LoB;->m(F)V

    :cond_5
    iget-object v0, p0, Lm96;->i:LoB;

    if-eqz v0, :cond_6

    invoke-virtual {v0, p1}, LoB;->m(F)V

    :cond_6
    iget-object v0, p0, Lm96;->k:Lou1;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, LoB;->m(F)V

    :cond_7
    iget-object v0, p0, Lm96;->l:Lou1;

    if-eqz v0, :cond_8

    invoke-virtual {v0, p1}, LoB;->m(F)V

    :cond_8
    return-void
.end method
