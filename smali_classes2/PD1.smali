.class public LPD1;
.super LsE;
.source "SourceFile"


# instance fields
.field public final A:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public B:LCj6;

.field public final r:Ljava/lang/String;

.field public final s:Z

.field public final t:Loz2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Loz2<",
            "Landroid/graphics/LinearGradient;",
            ">;"
        }
    .end annotation
.end field

.field public final u:Loz2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Loz2<",
            "Landroid/graphics/RadialGradient;",
            ">;"
        }
    .end annotation
.end field

.field public final v:Landroid/graphics/RectF;

.field public final w:LRD1;

.field public final x:I

.field public final y:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "LHD1;",
            "LHD1;",
            ">;"
        }
    .end annotation
.end field

.field public final z:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LRD2;LqB;LOD1;)V
    .locals 11

    invoke-virtual {p3}, LOD1;->b()Lyy5$b;

    move-result-object v0

    invoke-virtual {v0}, Lyy5$b;->b()Landroid/graphics/Paint$Cap;

    move-result-object v4

    invoke-virtual {p3}, LOD1;->g()Lyy5$c;

    move-result-object v0

    invoke-virtual {v0}, Lyy5$c;->b()Landroid/graphics/Paint$Join;

    move-result-object v5

    invoke-virtual {p3}, LOD1;->i()F

    move-result v6

    invoke-virtual {p3}, LOD1;->k()Lse;

    move-result-object v7

    invoke-virtual {p3}, LOD1;->m()Lqe;

    move-result-object v8

    invoke-virtual {p3}, LOD1;->h()Ljava/util/List;

    move-result-object v9

    invoke-virtual {p3}, LOD1;->c()Lqe;

    move-result-object v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v10}, LsE;-><init>(LRD2;LqB;Landroid/graphics/Paint$Cap;Landroid/graphics/Paint$Join;FLse;Lqe;Ljava/util/List;Lqe;)V

    new-instance v0, Loz2;

    invoke-direct {v0}, Loz2;-><init>()V

    iput-object v0, p0, LPD1;->t:Loz2;

    new-instance v0, Loz2;

    invoke-direct {v0}, Loz2;-><init>()V

    iput-object v0, p0, LPD1;->u:Loz2;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, LPD1;->v:Landroid/graphics/RectF;

    invoke-virtual {p3}, LOD1;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LPD1;->r:Ljava/lang/String;

    invoke-virtual {p3}, LOD1;->f()LRD1;

    move-result-object v0

    iput-object v0, p0, LPD1;->w:LRD1;

    invoke-virtual {p3}, LOD1;->n()Z

    move-result v0

    iput-boolean v0, p0, LPD1;->s:Z

    invoke-virtual {p1}, LRD2;->I()LrD2;

    move-result-object p1

    invoke-virtual {p1}, LrD2;->d()F

    move-result p1

    const/high16 v0, 0x42000000    # 32.0f

    div-float/2addr p1, v0

    float-to-int p1, p1

    iput p1, p0, LPD1;->x:I

    invoke-virtual {p3}, LOD1;->e()Lre;

    move-result-object p1

    invoke-virtual {p1}, Lre;->a()LoB;

    move-result-object p1

    iput-object p1, p0, LPD1;->y:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    invoke-virtual {p2, p1}, LqB;->i(LoB;)V

    invoke-virtual {p3}, LOD1;->l()Lxe;

    move-result-object p1

    invoke-virtual {p1}, Lxe;->a()LoB;

    move-result-object p1

    iput-object p1, p0, LPD1;->z:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    invoke-virtual {p2, p1}, LqB;->i(LoB;)V

    invoke-virtual {p3}, LOD1;->d()Lxe;

    move-result-object p1

    invoke-virtual {p1}, Lxe;->a()LoB;

    move-result-object p1

    iput-object p1, p0, LPD1;->A:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    invoke-virtual {p2, p1}, LqB;->i(LoB;)V

    return-void
.end method


# virtual methods
.method public d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V
    .locals 2

    iget-boolean v0, p0, LPD1;->s:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LPD1;->v:Landroid/graphics/RectF;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p2, v1}, LsE;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object v0, p0, LPD1;->w:LRD1;

    sget-object v1, LRD1;->b:LRD1;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, LPD1;->l()Landroid/graphics/LinearGradient;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LPD1;->m()Landroid/graphics/RadialGradient;

    move-result-object v0

    :goto_0
    invoke-virtual {v0, p2}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    iget-object v1, p0, LsE;->i:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    invoke-super {p0, p1, p2, p3}, LsE;->d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LPD1;->r:Ljava/lang/String;

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

    invoke-super {p0, p1, p2}, LsE;->h(Ljava/lang/Object;LgE2;)V

    sget-object v0, LaE2;->L:[Ljava/lang/Integer;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, LPD1;->B:LCj6;

    if-eqz p1, :cond_0

    iget-object v0, p0, LsE;->f:LqB;

    invoke-virtual {v0, p1}, LqB;->G(LoB;)V

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, LPD1;->B:LCj6;

    goto :goto_0

    :cond_1
    new-instance p1, LCj6;

    invoke-direct {p1, p2}, LCj6;-><init>(LgE2;)V

    iput-object p1, p0, LPD1;->B:LCj6;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    iget-object p1, p0, LsE;->f:LqB;

    iget-object p2, p0, LPD1;->B:LCj6;

    invoke-virtual {p1, p2}, LqB;->i(LoB;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final j([I)[I
    .locals 4

    iget-object v0, p0, LPD1;->B:LCj6;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LCj6;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Integer;

    array-length v1, p1

    array-length v2, v0

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    :goto_0
    array-length v1, p1

    if-ge v3, v1, :cond_1

    aget-object v1, v0, v3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aput v1, p1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    array-length p1, v0

    new-array p1, p1, [I

    :goto_1
    array-length v1, v0

    if-ge v3, v1, :cond_1

    aget-object v1, v0, v3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aput v1, p1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-object p1
.end method

.method public final k()I
    .locals 4

    iget-object v0, p0, LPD1;->z:LoB;

    invoke-virtual {v0}, LoB;->f()F

    move-result v0

    iget v1, p0, LPD1;->x:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget-object v1, p0, LPD1;->A:LoB;

    invoke-virtual {v1}, LoB;->f()F

    move-result v1

    iget v2, p0, LPD1;->x:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget-object v2, p0, LPD1;->y:LoB;

    invoke-virtual {v2}, LoB;->f()F

    move-result v2

    iget v3, p0, LPD1;->x:I

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    if-eqz v0, :cond_0

    const/16 v3, 0x20f

    mul-int/2addr v3, v0

    goto :goto_0

    :cond_0
    const/16 v3, 0x11

    :goto_0
    if-eqz v1, :cond_1

    mul-int/lit8 v3, v3, 0x1f

    mul-int/2addr v3, v1

    :cond_1
    if-eqz v2, :cond_2

    mul-int/lit8 v3, v3, 0x1f

    mul-int/2addr v3, v2

    :cond_2
    return v3
.end method

.method public final l()Landroid/graphics/LinearGradient;
    .locals 14

    invoke-virtual {p0}, LPD1;->k()I

    move-result v0

    iget-object v1, p0, LPD1;->t:Loz2;

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Loz2;->h(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/LinearGradient;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LPD1;->z:LoB;

    invoke-virtual {v0}, LoB;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget-object v1, p0, LPD1;->A:LoB;

    invoke-virtual {v1}, LoB;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget-object v4, p0, LPD1;->y:LoB;

    invoke-virtual {v4}, LoB;->h()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LHD1;

    invoke-virtual {v4}, LHD1;->c()[I

    move-result-object v5

    invoke-virtual {p0, v5}, LPD1;->j([I)[I

    move-result-object v11

    invoke-virtual {v4}, LHD1;->d()[F

    move-result-object v12

    iget v7, v0, Landroid/graphics/PointF;->x:F

    iget v8, v0, Landroid/graphics/PointF;->y:F

    iget v9, v1, Landroid/graphics/PointF;->x:F

    iget v10, v1, Landroid/graphics/PointF;->y:F

    new-instance v0, Landroid/graphics/LinearGradient;

    sget-object v13, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object v6, v0

    invoke-direct/range {v6 .. v13}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    iget-object v1, p0, LPD1;->t:Loz2;

    invoke-virtual {v1, v2, v3, v0}, Loz2;->n(JLjava/lang/Object;)V

    return-object v0
.end method

.method public final m()Landroid/graphics/RadialGradient;
    .locals 13

    invoke-virtual {p0}, LPD1;->k()I

    move-result v0

    iget-object v1, p0, LPD1;->u:Loz2;

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Loz2;->h(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/RadialGradient;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LPD1;->z:LoB;

    invoke-virtual {v0}, LoB;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget-object v1, p0, LPD1;->A:LoB;

    invoke-virtual {v1}, LoB;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget-object v4, p0, LPD1;->y:LoB;

    invoke-virtual {v4}, LoB;->h()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LHD1;

    invoke-virtual {v4}, LHD1;->c()[I

    move-result-object v5

    invoke-virtual {p0, v5}, LPD1;->j([I)[I

    move-result-object v10

    invoke-virtual {v4}, LHD1;->d()[F

    move-result-object v11

    iget v7, v0, Landroid/graphics/PointF;->x:F

    iget v8, v0, Landroid/graphics/PointF;->y:F

    iget v0, v1, Landroid/graphics/PointF;->x:F

    iget v1, v1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v0, v7

    float-to-double v4, v0

    sub-float/2addr v1, v8

    float-to-double v0, v1

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v0

    double-to-float v9, v0

    new-instance v0, Landroid/graphics/RadialGradient;

    sget-object v12, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object v6, v0

    invoke-direct/range {v6 .. v12}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    iget-object v1, p0, LPD1;->u:Loz2;

    invoke-virtual {v1, v2, v3, v0}, Loz2;->n(JLjava/lang/Object;)V

    return-object v0
.end method
