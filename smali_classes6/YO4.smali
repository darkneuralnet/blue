.class public LYO4;
.super LZO4;
.source "SourceFile"


# instance fields
.field public o:Landroid/graphics/Paint;

.field public p:Lcom/google/android/gms/maps/model/LatLng;

.field public q:LVO4;

.field public r:LVO4;

.field public s:Z

.field public t:Landroid/graphics/Point;

.field public u:Landroid/graphics/Point;

.field public v:I

.field public w:I

.field public x:I

.field public y:I


# direct methods
.method public constructor <init>(ILjava/util/List;ILandroid/graphics/Paint$Cap;Landroid/graphics/Paint$Join;Landroid/graphics/PathEffect;Landroid/graphics/MaskFilter;Landroid/graphics/Shader;ZLjava/lang/Integer;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "LVO4;",
            ">;I",
            "Landroid/graphics/Paint$Cap;",
            "Landroid/graphics/Paint$Join;",
            "Landroid/graphics/PathEffect;",
            "Landroid/graphics/MaskFilter;",
            "Landroid/graphics/Shader;",
            "Z",
            "Ljava/lang/Integer;",
            "ZZ)V"
        }
    .end annotation

    invoke-direct/range {p0 .. p12}, LZO4;-><init>(ILjava/util/List;ILandroid/graphics/Paint$Cap;Landroid/graphics/Paint$Join;Landroid/graphics/PathEffect;Landroid/graphics/MaskFilter;Landroid/graphics/Shader;ZLjava/lang/Integer;ZZ)V

    invoke-virtual {p0}, LYO4;->j()Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, LYO4;->o:Landroid/graphics/Paint;

    return-void
.end method


# virtual methods
.method public final h(Landroid/graphics/Canvas;Landroid/graphics/Paint;LU74;LVO4;LVO4;IIII)V
    .locals 9

    move-object v0, p0

    move-object v1, p3

    invoke-virtual {p5}, LVO4;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    invoke-virtual {p3, v2}, LU74;->c(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/Point;

    move-result-object v2

    iput-object v2, v0, LYO4;->t:Landroid/graphics/Point;

    invoke-virtual {p4}, LVO4;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    invoke-virtual {p3, v2}, LU74;->c(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/Point;

    move-result-object v1

    iput-object v1, v0, LYO4;->u:Landroid/graphics/Point;

    iget v2, v1, Landroid/graphics/Point;->x:I

    div-int/lit8 v3, p8, 0x2

    add-int/2addr v2, v3

    div-int/lit8 v4, p6, 0x2

    sub-int/2addr v2, v4

    iput v2, v0, LYO4;->v:I

    iget v1, v1, Landroid/graphics/Point;->y:I

    div-int/lit8 v5, p9, 0x2

    add-int/2addr v1, v5

    div-int/lit8 v6, p7, 0x2

    sub-int/2addr v1, v6

    iput v1, v0, LYO4;->w:I

    iget-object v7, v0, LYO4;->t:Landroid/graphics/Point;

    iget v8, v7, Landroid/graphics/Point;->x:I

    add-int/2addr v8, v3

    sub-int/2addr v8, v4

    iput v8, v0, LYO4;->x:I

    iget v3, v7, Landroid/graphics/Point;->y:I

    add-int/2addr v3, v5

    sub-int/2addr v3, v6

    iput v3, v0, LYO4;->y:I

    int-to-float v2, v2

    int-to-float v1, v1

    int-to-float v4, v8

    int-to-float v3, v3

    move-object p3, p1

    move p4, v2

    move p5, v1

    move p6, v4

    move/from16 p7, v3

    move-object/from16 p8, p2

    invoke-virtual/range {p3 .. p8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public i(Landroid/graphics/Canvas;LU74;Ljava/util/List;IIII)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "LU74;",
            "Ljava/util/List<",
            "LVO4;",
            ">;IIII)V"
        }
    .end annotation

    move-object v10, p0

    const/4 v0, 0x0

    iput-object v0, v10, LYO4;->q:LVO4;

    const/4 v1, 0x1

    iput-boolean v1, v10, LYO4;->s:Z

    iput-object v0, v10, LYO4;->r:LVO4;

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_0
    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, LVO4;

    invoke-virtual {v12}, LVO4;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    iput-object v0, v10, LYO4;->p:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v0, :cond_0

    iget-boolean v0, v10, LYO4;->s:Z

    if-eqz v0, :cond_1

    iput-object v12, v10, LYO4;->q:LVO4;

    const/4 v0, 0x0

    iput-boolean v0, v10, LYO4;->s:Z

    :cond_1
    iget-object v4, v10, LYO4;->r:LVO4;

    if-eqz v4, :cond_2

    iget-object v2, v10, LYO4;->o:Landroid/graphics/Paint;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v5, v12

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    invoke-virtual/range {v0 .. v9}, LYO4;->h(Landroid/graphics/Canvas;Landroid/graphics/Paint;LU74;LVO4;LVO4;IIII)V

    :cond_2
    iput-object v12, v10, LYO4;->r:LVO4;

    goto :goto_0

    :cond_3
    iget-boolean v0, v10, LZO4;->m:Z

    if-eqz v0, :cond_4

    iget-object v5, v10, LYO4;->q:LVO4;

    if-eqz v5, :cond_4

    iget-object v4, v10, LYO4;->r:LVO4;

    if-eqz v4, :cond_4

    iget-object v2, v10, LYO4;->o:Landroid/graphics/Paint;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    invoke-virtual/range {v0 .. v9}, LYO4;->h(Landroid/graphics/Canvas;Landroid/graphics/Paint;LU74;LVO4;LVO4;IIII)V

    :cond_4
    return-void
.end method

.method public j()Landroid/graphics/Paint;
    .locals 3

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, p0, LZO4;->j:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget v1, p0, LZO4;->c:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-boolean v1, p0, LZO4;->l:Z

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v1, p0, LZO4;->d:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object v1, p0, LZO4;->e:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    iget-object v1, p0, LZO4;->f:Landroid/graphics/PathEffect;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    iget-object v1, p0, LZO4;->g:Landroid/graphics/MaskFilter;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_0

    invoke-static {}, Lxb;->a()Landroid/graphics/BlendMode;

    move-result-object v1

    invoke-static {v0, v1}, LfH6;->a(Landroid/graphics/Paint;Landroid/graphics/BlendMode;)V

    :cond_0
    return-object v0
.end method
