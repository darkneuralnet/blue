.class public Ld26;
.super LqB;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld26$d;
    }
.end annotation


# instance fields
.field public final D:Ljava/lang/StringBuilder;

.field public final E:Landroid/graphics/RectF;

.field public final F:Landroid/graphics/Matrix;

.field public final G:Landroid/graphics/Paint;

.field public final H:Landroid/graphics/Paint;

.field public final I:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Liw1;",
            "Ljava/util/List<",
            "LjA0;",
            ">;>;"
        }
    .end annotation
.end field

.field public final J:Loz2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Loz2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final K:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld26$d;",
            ">;"
        }
    .end annotation
.end field

.field public final L:Lb26;

.field public final M:LRD2;

.field public final N:LrD2;

.field public O:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public P:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public Q:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public R:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public S:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public T:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public U:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public V:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public W:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public X:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Landroid/graphics/Typeface;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LRD2;Lfm2;)V
    .locals 2

    invoke-direct {p0, p1, p2}, LqB;-><init>(LRD2;Lfm2;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Ld26;->D:Ljava/lang/StringBuilder;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ld26;->E:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ld26;->F:Landroid/graphics/Matrix;

    new-instance v0, Ld26$a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ld26$a;-><init>(Ld26;I)V

    iput-object v0, p0, Ld26;->G:Landroid/graphics/Paint;

    new-instance v0, Ld26$b;

    invoke-direct {v0, p0, v1}, Ld26$b;-><init>(Ld26;I)V

    iput-object v0, p0, Ld26;->H:Landroid/graphics/Paint;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ld26;->I:Ljava/util/Map;

    new-instance v0, Loz2;

    invoke-direct {v0}, Loz2;-><init>()V

    iput-object v0, p0, Ld26;->J:Loz2;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ld26;->K:Ljava/util/List;

    iput-object p1, p0, Ld26;->M:LRD2;

    invoke-virtual {p2}, Lfm2;->b()LrD2;

    move-result-object p1

    iput-object p1, p0, Ld26;->N:LrD2;

    invoke-virtual {p2}, Lfm2;->s()LBe;

    move-result-object p1

    invoke-virtual {p1}, LBe;->c()Lb26;

    move-result-object p1

    iput-object p1, p0, Ld26;->L:Lb26;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    invoke-virtual {p0, p1}, LqB;->i(LoB;)V

    invoke-virtual {p2}, Lfm2;->t()LCe;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p1, LCe;->a:Lpe;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lpe;->a()LoB;

    move-result-object p2

    iput-object p2, p0, Ld26;->O:LoB;

    invoke-virtual {p2, p0}, LoB;->a(LoB$b;)V

    iget-object p2, p0, Ld26;->O:LoB;

    invoke-virtual {p0, p2}, LqB;->i(LoB;)V

    :cond_0
    if-eqz p1, :cond_1

    iget-object p2, p1, LCe;->b:Lpe;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lpe;->a()LoB;

    move-result-object p2

    iput-object p2, p0, Ld26;->Q:LoB;

    invoke-virtual {p2, p0}, LoB;->a(LoB$b;)V

    iget-object p2, p0, Ld26;->Q:LoB;

    invoke-virtual {p0, p2}, LqB;->i(LoB;)V

    :cond_1
    if-eqz p1, :cond_2

    iget-object p2, p1, LCe;->c:Lqe;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lqe;->a()LoB;

    move-result-object p2

    iput-object p2, p0, Ld26;->S:LoB;

    invoke-virtual {p2, p0}, LoB;->a(LoB$b;)V

    iget-object p2, p0, Ld26;->S:LoB;

    invoke-virtual {p0, p2}, LqB;->i(LoB;)V

    :cond_2
    if-eqz p1, :cond_3

    iget-object p1, p1, LCe;->d:Lqe;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lqe;->a()LoB;

    move-result-object p1

    iput-object p1, p0, Ld26;->U:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    iget-object p1, p0, Ld26;->U:LoB;

    invoke-virtual {p0, p1}, LqB;->i(LoB;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/String;I)Ljava/lang/String;
    .locals 5

    invoke-virtual {p1, p2}, Ljava/lang/String;->codePointAt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    add-int/2addr v1, p2

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p1, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    invoke-virtual {p0, v2}, Ld26;->c0(I)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v3

    add-int/2addr v1, v3

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v2, p0, Ld26;->J:Loz2;

    int-to-long v3, v0

    invoke-virtual {v2, v3, v4}, Loz2;->f(J)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p0, Ld26;->J:Loz2;

    invoke-virtual {p1, v3, v4}, Loz2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_2
    iget-object v0, p0, Ld26;->D:Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    :goto_2
    if-ge p2, v1, :cond_3

    invoke-virtual {p1, p2}, Ljava/lang/String;->codePointAt(I)I

    move-result v0

    iget-object v2, p0, Ld26;->D:Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    move-result v0

    add-int/2addr p2, v0

    goto :goto_2

    :cond_3
    iget-object p1, p0, Ld26;->D:Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ld26;->J:Loz2;

    invoke-virtual {p2, v3, v4, p1}, Loz2;->n(JLjava/lang/Object;)V

    return-object p1
.end method

.method public final P(LN51;Landroid/graphics/Matrix;)V
    .locals 1

    iget-object p2, p0, Ld26;->P:LoB;

    if-eqz p2, :cond_0

    iget-object v0, p0, Ld26;->G:Landroid/graphics/Paint;

    invoke-virtual {p2}, LoB;->h()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Ld26;->O:LoB;

    if-eqz p2, :cond_1

    iget-object v0, p0, Ld26;->G:Landroid/graphics/Paint;

    invoke-virtual {p2}, LoB;->h()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Ld26;->G:Landroid/graphics/Paint;

    iget v0, p1, LN51;->h:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    :goto_0
    iget-object p2, p0, Ld26;->R:LoB;

    if-eqz p2, :cond_2

    iget-object v0, p0, Ld26;->H:Landroid/graphics/Paint;

    invoke-virtual {p2}, LoB;->h()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    :cond_2
    iget-object p2, p0, Ld26;->Q:LoB;

    if-eqz p2, :cond_3

    iget-object v0, p0, Ld26;->H:Landroid/graphics/Paint;

    invoke-virtual {p2}, LoB;->h()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    :cond_3
    iget-object p2, p0, Ld26;->H:Landroid/graphics/Paint;

    iget v0, p1, LN51;->i:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    :goto_1
    iget-object p2, p0, LqB;->x:Lm96;

    invoke-virtual {p2}, Lm96;->h()LoB;

    move-result-object p2

    const/16 v0, 0x64

    if-nez p2, :cond_4

    move p2, v0

    goto :goto_2

    :cond_4
    iget-object p2, p0, LqB;->x:Lm96;

    invoke-virtual {p2}, Lm96;->h()LoB;

    move-result-object p2

    invoke-virtual {p2}, LoB;->h()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    :goto_2
    mul-int/lit16 p2, p2, 0xff

    div-int/2addr p2, v0

    iget-object v0, p0, Ld26;->G:Landroid/graphics/Paint;

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v0, p0, Ld26;->H:Landroid/graphics/Paint;

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object p2, p0, Ld26;->T:LoB;

    if-eqz p2, :cond_5

    iget-object p1, p0, Ld26;->H:Landroid/graphics/Paint;

    invoke-virtual {p2}, LoB;->h()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    goto :goto_3

    :cond_5
    iget-object p2, p0, Ld26;->S:LoB;

    if-eqz p2, :cond_6

    iget-object p1, p0, Ld26;->H:Landroid/graphics/Paint;

    invoke-virtual {p2}, LoB;->h()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    goto :goto_3

    :cond_6
    iget-object p2, p0, Ld26;->H:Landroid/graphics/Paint;

    iget p1, p1, LN51;->j:F

    invoke-static {}, LGi6;->e()F

    move-result v0

    mul-float/2addr p1, v0

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    :goto_3
    return-void
.end method

.method public final Q(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V
    .locals 8

    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    move-result-object v0

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    if-ne v0, v1, :cond_1

    invoke-virtual {p2}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    return-void

    :cond_1
    const/4 v3, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p3

    move-object v2, p1

    move-object v7, p2

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final R(Liw1;FLN51;Landroid/graphics/Canvas;)V
    .locals 6

    invoke-virtual {p0, p1}, Ld26;->Z(Liw1;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LjA0;

    invoke-virtual {v2}, LjA0;->getPath()Landroid/graphics/Path;

    move-result-object v2

    iget-object v3, p0, Ld26;->E:Landroid/graphics/RectF;

    invoke-virtual {v2, v3, v0}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    iget-object v3, p0, Ld26;->F:Landroid/graphics/Matrix;

    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    iget-object v3, p0, Ld26;->F:Landroid/graphics/Matrix;

    iget v4, p3, LN51;->g:F

    neg-float v4, v4

    invoke-static {}, LGi6;->e()F

    move-result v5

    mul-float/2addr v4, v5

    const/4 v5, 0x0

    invoke-virtual {v3, v5, v4}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    iget-object v3, p0, Ld26;->F:Landroid/graphics/Matrix;

    invoke-virtual {v3, p2, p2}, Landroid/graphics/Matrix;->preScale(FF)Z

    iget-object v3, p0, Ld26;->F:Landroid/graphics/Matrix;

    invoke-virtual {v2, v3}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    iget-boolean v3, p3, LN51;->k:Z

    if-eqz v3, :cond_0

    iget-object v3, p0, Ld26;->G:Landroid/graphics/Paint;

    invoke-virtual {p0, v2, v3, p4}, Ld26;->U(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    iget-object v3, p0, Ld26;->H:Landroid/graphics/Paint;

    invoke-virtual {p0, v2, v3, p4}, Ld26;->U(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    goto :goto_1

    :cond_0
    iget-object v3, p0, Ld26;->H:Landroid/graphics/Paint;

    invoke-virtual {p0, v2, v3, p4}, Ld26;->U(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    iget-object v3, p0, Ld26;->G:Landroid/graphics/Paint;

    invoke-virtual {p0, v2, v3, p4}, Ld26;->U(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final S(Ljava/lang/String;LN51;Landroid/graphics/Canvas;)V
    .locals 0

    iget-boolean p2, p2, LN51;->k:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Ld26;->G:Landroid/graphics/Paint;

    invoke-virtual {p0, p1, p2, p3}, Ld26;->Q(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    iget-object p2, p0, Ld26;->H:Landroid/graphics/Paint;

    invoke-virtual {p0, p1, p2, p3}, Ld26;->Q(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Ld26;->H:Landroid/graphics/Paint;

    invoke-virtual {p0, p1, p2, p3}, Ld26;->Q(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    iget-object p2, p0, Ld26;->G:Landroid/graphics/Paint;

    invoke-virtual {p0, p1, p2, p3}, Ld26;->Q(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    :goto_0
    return-void
.end method

.method public final T(Ljava/lang/String;LN51;Landroid/graphics/Canvas;F)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p0, p1, v0}, Ld26;->O(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v0, v2

    invoke-virtual {p0, v1, p2, p3}, Ld26;->S(Ljava/lang/String;LN51;Landroid/graphics/Canvas;)V

    iget-object v2, p0, Ld26;->G:Landroid/graphics/Paint;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    add-float/2addr v1, p4

    const/4 v2, 0x0

    invoke-virtual {p3, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final U(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V
    .locals 2

    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    move-result-object v0

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    if-ne v0, v1, :cond_1

    invoke-virtual {p2}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p3, p1, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final V(Ljava/lang/String;LN51;Lfw1;Landroid/graphics/Canvas;FFF)V
    .locals 3

    const/4 p5, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p5, v0, :cond_1

    invoke-virtual {p1, p5}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p3}, Lfw1;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3}, Lfw1;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Liw1;->c(CLjava/lang/String;Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Ld26;->N:LrD2;

    invoke-virtual {v1}, LrD2;->c()LLN5;

    move-result-object v1

    invoke-virtual {v1, v0}, LLN5;->k(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liw1;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v0, p6, p2, p4}, Ld26;->R(Liw1;FLN51;Landroid/graphics/Canvas;)V

    invoke-virtual {v0}, Liw1;->b()D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr v0, p6

    invoke-static {}, LGi6;->e()F

    move-result v1

    mul-float/2addr v0, v1

    add-float/2addr v0, p7

    const/4 v1, 0x0

    invoke-virtual {p4, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    :goto_1
    add-int/lit8 p5, p5, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final W(LN51;Lfw1;Landroid/graphics/Canvas;)V
    .locals 18

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    invoke-virtual {v7, v9}, Ld26;->b0(Lfw1;)Landroid/graphics/Typeface;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, v8, LN51;->a:Ljava/lang/String;

    iget-object v2, v7, Ld26;->M:LRD2;

    invoke-virtual {v2}, LRD2;->X()LU06;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual/range {p0 .. p0}, LqB;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, LU06;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    iget-object v2, v7, Ld26;->G:Landroid/graphics/Paint;

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object v0, v7, Ld26;->W:LoB;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LoB;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_2
    iget v0, v8, LN51;->c:F

    :goto_0
    iget-object v2, v7, Ld26;->G:Landroid/graphics/Paint;

    invoke-static {}, LGi6;->e()F

    move-result v3

    mul-float/2addr v3, v0

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v2, v7, Ld26;->H:Landroid/graphics/Paint;

    iget-object v3, v7, Ld26;->G:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object v2, v7, Ld26;->H:Landroid/graphics/Paint;

    iget-object v3, v7, Ld26;->G:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextSize()F

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    iget v2, v8, LN51;->e:I

    int-to-float v2, v2

    const/high16 v3, 0x41200000    # 10.0f

    div-float/2addr v2, v3

    iget-object v3, v7, Ld26;->V:LoB;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, LoB;->h()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    :goto_1
    add-float/2addr v2, v3

    goto :goto_2

    :cond_3
    iget-object v3, v7, Ld26;->U:LoB;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, LoB;->h()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto :goto_1

    :cond_4
    :goto_2
    invoke-static {}, LGi6;->e()F

    move-result v3

    mul-float/2addr v2, v3

    mul-float/2addr v2, v0

    const/high16 v0, 0x42c80000    # 100.0f

    div-float v11, v2, v0

    invoke-virtual {v7, v1}, Ld26;->a0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v13

    const/4 v14, 0x0

    const/4 v0, -0x1

    move v15, v0

    move v6, v14

    :goto_3
    if-ge v6, v13, :cond_7

    invoke-interface {v12, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, v8, LN51;->m:Landroid/graphics/PointF;

    if-nez v0, :cond_5

    const/4 v0, 0x0

    goto :goto_4

    :cond_5
    iget v0, v0, Landroid/graphics/PointF;->x:F

    :goto_4
    move v2, v0

    const/4 v4, 0x0

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object/from16 v3, p2

    move v5, v11

    move/from16 v17, v6

    move/from16 v6, v16

    invoke-virtual/range {v0 .. v6}, Ld26;->e0(Ljava/lang/String;FLfw1;FFZ)Ljava/util/List;

    move-result-object v0

    move v1, v14

    :goto_5
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_6

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld26$d;

    add-int/lit8 v15, v15, 0x1

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    invoke-static {v2}, Ld26$d;->a(Ld26$d;)F

    move-result v3

    invoke-virtual {v7, v10, v8, v15, v3}, Ld26;->d0(Landroid/graphics/Canvas;LN51;IF)V

    invoke-static {v2}, Ld26$d;->b(Ld26$d;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2, v8, v10, v11}, Ld26;->T(Ljava/lang/String;LN51;Landroid/graphics/Canvas;F)V

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->restore()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_6
    add-int/lit8 v6, v17, 0x1

    goto :goto_3

    :cond_7
    return-void
.end method

.method public final X(LN51;Landroid/graphics/Matrix;Lfw1;Landroid/graphics/Canvas;)V
    .locals 20

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    iget-object v0, v8, Ld26;->W:LoB;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LoB;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_0
    iget v0, v9, LN51;->c:F

    :goto_0
    const/high16 v1, 0x42c80000    # 100.0f

    div-float v10, v0, v1

    invoke-static/range {p2 .. p2}, LGi6;->g(Landroid/graphics/Matrix;)F

    move-result v11

    iget-object v0, v9, LN51;->a:Ljava/lang/String;

    invoke-virtual {v8, v0}, Ld26;->a0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v13

    iget v0, v9, LN51;->e:I

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    iget-object v1, v8, Ld26;->V:LoB;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LoB;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    :goto_1
    add-float/2addr v0, v1

    goto :goto_2

    :cond_1
    iget-object v1, v8, Ld26;->U:LoB;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LoB;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    goto :goto_1

    :cond_2
    :goto_2
    move v14, v0

    const/4 v15, 0x0

    const/4 v0, -0x1

    move v7, v0

    move v6, v15

    :goto_3
    if-ge v6, v13, :cond_5

    invoke-interface {v12, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, v9, LN51;->m:Landroid/graphics/PointF;

    if-nez v0, :cond_3

    const/4 v0, 0x0

    goto :goto_4

    :cond_3
    iget v0, v0, Landroid/graphics/PointF;->x:F

    :goto_4
    move v2, v0

    const/16 v16, 0x1

    move-object/from16 v0, p0

    move-object/from16 v3, p3

    move v4, v10

    move v5, v14

    move/from16 v17, v6

    move/from16 v6, v16

    invoke-virtual/range {v0 .. v6}, Ld26;->e0(Ljava/lang/String;FLfw1;FFZ)Ljava/util/List;

    move-result-object v6

    move v5, v15

    :goto_5
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_4

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld26$d;

    add-int/lit8 v7, v7, 0x1

    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Canvas;->save()I

    invoke-static {v0}, Ld26$d;->a(Ld26$d;)F

    move-result v1

    move-object/from16 v4, p4

    invoke-virtual {v8, v4, v9, v7, v1}, Ld26;->d0(Landroid/graphics/Canvas;LN51;IF)V

    invoke-static {v0}, Ld26$d;->b(Ld26$d;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    move/from16 v16, v5

    move v5, v11

    move-object/from16 v18, v6

    move v6, v10

    move/from16 v19, v7

    move v7, v14

    invoke-virtual/range {v0 .. v7}, Ld26;->V(Ljava/lang/String;LN51;Lfw1;Landroid/graphics/Canvas;FFF)V

    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Canvas;->restore()V

    add-int/lit8 v5, v16, 0x1

    move-object/from16 v6, v18

    move/from16 v7, v19

    goto :goto_5

    :cond_4
    add-int/lit8 v6, v17, 0x1

    goto :goto_3

    :cond_5
    return-void
.end method

.method public final Y(I)Ld26$d;
    .locals 4

    iget-object v0, p0, Ld26;->K:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    if-ge v0, p1, :cond_0

    iget-object v1, p0, Ld26;->K:Ljava/util/List;

    new-instance v2, Ld26$d;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ld26$d;-><init>(Ld26$a;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ld26;->K:Ljava/util/List;

    add-int/lit8 p1, p1, -0x1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld26$d;

    return-object p1
.end method

.method public final Z(Liw1;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liw1;",
            ")",
            "Ljava/util/List<",
            "LjA0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ld26;->I:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld26;->I:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Liw1;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lqy5;

    new-instance v5, LjA0;

    iget-object v6, p0, Ld26;->M:LRD2;

    iget-object v7, p0, Ld26;->N:LrD2;

    invoke-direct {v5, v6, p0, v4, v7}, LjA0;-><init>(LRD2;LqB;Lqy5;LrD2;)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ld26;->I:Ljava/util/Map;

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method

.method public a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, LqB;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object p2, p0, Ld26;->N:LrD2;

    invoke-virtual {p2}, LrD2;->b()Landroid/graphics/Rect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result p2

    int-to-float p2, p2

    iget-object p3, p0, Ld26;->N:LrD2;

    invoke-virtual {p3}, LrD2;->b()Landroid/graphics/Rect;

    move-result-object p3

    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    move-result p3

    int-to-float p3, p3

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p2, p3}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method public final a0(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "\r\n"

    const-string v1, "\r"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "\u0003"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "\n"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b0(Lfw1;)Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, Ld26;->X:LoB;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LoB;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Typeface;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Ld26;->M:LRD2;

    invoke-virtual {v0, p1}, LRD2;->Y(Lfw1;)Landroid/graphics/Typeface;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p1}, Lfw1;->d()Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method

.method public final c0(I)Z
    .locals 2

    invoke-static {p1}, Ljava/lang/Character;->getType(I)I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_1

    invoke-static {p1}, Ljava/lang/Character;->getType(I)I

    move-result v0

    const/16 v1, 0x1b

    if-eq v0, v1, :cond_1

    invoke-static {p1}, Ljava/lang/Character;->getType(I)I

    move-result v0

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    invoke-static {p1}, Ljava/lang/Character;->getType(I)I

    move-result v0

    const/16 v1, 0x1c

    if-eq v0, v1, :cond_1

    invoke-static {p1}, Ljava/lang/Character;->getType(I)I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_1

    invoke-static {p1}, Ljava/lang/Character;->getType(I)I

    move-result p1

    const/16 v0, 0x13

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final d0(Landroid/graphics/Canvas;LN51;IF)V
    .locals 6

    iget-object v0, p2, LN51;->l:Landroid/graphics/PointF;

    iget-object v1, p2, LN51;->m:Landroid/graphics/PointF;

    invoke-static {}, LGi6;->e()F

    move-result v2

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    iget v4, p2, LN51;->f:F

    mul-float/2addr v4, v2

    iget v5, v0, Landroid/graphics/PointF;->y:F

    add-float/2addr v4, v5

    :goto_0
    int-to-float p3, p3

    iget v5, p2, LN51;->f:F

    mul-float/2addr p3, v5

    mul-float/2addr p3, v2

    add-float/2addr p3, v4

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    iget v0, v0, Landroid/graphics/PointF;->x:F

    :goto_1
    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    iget v3, v1, Landroid/graphics/PointF;->x:F

    :goto_2
    sget-object v1, Ld26$c;->a:[I

    iget-object p2, p2, LN51;->d:LN51$a;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v1, p2

    const/4 v1, 0x1

    if-eq p2, v1, :cond_5

    const/4 v1, 0x2

    if-eq p2, v1, :cond_4

    const/4 v1, 0x3

    if-eq p2, v1, :cond_3

    goto :goto_3

    :cond_3
    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr v3, p2

    add-float/2addr v0, v3

    div-float/2addr p4, p2

    sub-float/2addr v0, p4

    invoke-virtual {p1, v0, p3}, Landroid/graphics/Canvas;->translate(FF)V

    goto :goto_3

    :cond_4
    add-float/2addr v0, v3

    sub-float/2addr v0, p4

    invoke-virtual {p1, v0, p3}, Landroid/graphics/Canvas;->translate(FF)V

    goto :goto_3

    :cond_5
    invoke-virtual {p1, v0, p3}, Landroid/graphics/Canvas;->translate(FF)V

    :goto_3
    return-void
.end method

.method public final e0(Ljava/lang/String;FLfw1;FFZ)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "F",
            "Lfw1;",
            "FFZ)",
            "Ljava/util/List<",
            "Ld26$d;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, v2

    move v6, v4

    move v7, v6

    move v8, v7

    move v10, v8

    move v5, v3

    move v9, v5

    move v11, v9

    :goto_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v12

    if-ge v4, v12, :cond_7

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-eqz p6, :cond_1

    invoke-virtual/range {p3 .. p3}, Lfw1;->a()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p3 .. p3}, Lfw1;->c()Ljava/lang/String;

    move-result-object v14

    invoke-static {v12, v13, v14}, Liw1;->c(CLjava/lang/String;Ljava/lang/String;)I

    move-result v13

    iget-object v14, v0, Ld26;->N:LrD2;

    invoke-virtual {v14}, LrD2;->c()LLN5;

    move-result-object v14

    invoke-virtual {v14, v13}, LLN5;->k(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Liw1;

    if-nez v13, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v13}, Liw1;->b()D

    move-result-wide v13

    double-to-float v13, v13

    mul-float v13, v13, p4

    invoke-static {}, LGi6;->e()F

    move-result v14

    mul-float/2addr v13, v14

    goto :goto_1

    :cond_1
    iget-object v13, v0, Ld26;->G:Landroid/graphics/Paint;

    add-int/lit8 v14, v4, 0x1

    invoke-virtual {v1, v4, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v13

    :goto_1
    add-float v13, v13, p5

    const/16 v14, 0x20

    if-ne v12, v14, :cond_2

    const/4 v8, 0x1

    move v11, v13

    goto :goto_2

    :cond_2
    if-eqz v8, :cond_3

    move v8, v2

    move v10, v4

    move v9, v13

    goto :goto_2

    :cond_3
    add-float/2addr v9, v13

    :goto_2
    add-float/2addr v5, v13

    cmpl-float v15, p2, v3

    if-lez v15, :cond_6

    cmpl-float v15, v5, p2

    if-ltz v15, :cond_6

    if-ne v12, v14, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v0, v6}, Ld26;->Y(I)Ld26$d;

    move-result-object v12

    if-ne v10, v7, :cond_5

    invoke-virtual {v1, v7, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v10

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    sub-int/2addr v10, v7

    int-to-float v7, v10

    mul-float/2addr v7, v11

    sub-float/2addr v5, v13

    sub-float/2addr v5, v7

    invoke-virtual {v12, v9, v5}, Ld26$d;->c(Ljava/lang/String;F)V

    move v7, v4

    move v10, v7

    move v5, v13

    move v9, v5

    goto :goto_3

    :cond_5
    add-int/lit8 v13, v10, -0x1

    invoke-virtual {v1, v7, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v14

    sub-int/2addr v7, v14

    int-to-float v7, v7

    mul-float/2addr v7, v11

    sub-float/2addr v5, v9

    sub-float/2addr v5, v7

    sub-float/2addr v5, v11

    invoke-virtual {v12, v13, v5}, Ld26$d;->c(Ljava/lang/String;F)V

    move v5, v9

    move v7, v10

    :cond_6
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_7
    cmpl-float v3, v5, v3

    if-lez v3, :cond_8

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v0, v6}, Ld26;->Y(I)Ld26$d;

    move-result-object v3

    invoke-virtual {v1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v5}, Ld26$d;->c(Ljava/lang/String;F)V

    :cond_8
    iget-object v1, v0, Ld26;->K:Ljava/util/List;

    invoke-interface {v1, v2, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    return-object v1
.end method

.method public h(Ljava/lang/Object;LgE2;)V
    .locals 2
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

    sget-object v0, LaE2;->a:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Ld26;->P:LoB;

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LqB;->G(LoB;)V

    :cond_0
    if-nez p2, :cond_1

    iput-object v1, p0, Ld26;->P:LoB;

    goto/16 :goto_0

    :cond_1
    new-instance p1, LCj6;

    invoke-direct {p1, p2}, LCj6;-><init>(LgE2;)V

    iput-object p1, p0, Ld26;->P:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    iget-object p1, p0, Ld26;->P:LoB;

    invoke-virtual {p0, p1}, LqB;->i(LoB;)V

    goto/16 :goto_0

    :cond_2
    sget-object v0, LaE2;->b:Ljava/lang/Integer;

    if-ne p1, v0, :cond_5

    iget-object p1, p0, Ld26;->R:LoB;

    if-eqz p1, :cond_3

    invoke-virtual {p0, p1}, LqB;->G(LoB;)V

    :cond_3
    if-nez p2, :cond_4

    iput-object v1, p0, Ld26;->R:LoB;

    goto/16 :goto_0

    :cond_4
    new-instance p1, LCj6;

    invoke-direct {p1, p2}, LCj6;-><init>(LgE2;)V

    iput-object p1, p0, Ld26;->R:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    iget-object p1, p0, Ld26;->R:LoB;

    invoke-virtual {p0, p1}, LqB;->i(LoB;)V

    goto/16 :goto_0

    :cond_5
    sget-object v0, LaE2;->s:Ljava/lang/Float;

    if-ne p1, v0, :cond_8

    iget-object p1, p0, Ld26;->T:LoB;

    if-eqz p1, :cond_6

    invoke-virtual {p0, p1}, LqB;->G(LoB;)V

    :cond_6
    if-nez p2, :cond_7

    iput-object v1, p0, Ld26;->T:LoB;

    goto/16 :goto_0

    :cond_7
    new-instance p1, LCj6;

    invoke-direct {p1, p2}, LCj6;-><init>(LgE2;)V

    iput-object p1, p0, Ld26;->T:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    iget-object p1, p0, Ld26;->T:LoB;

    invoke-virtual {p0, p1}, LqB;->i(LoB;)V

    goto/16 :goto_0

    :cond_8
    sget-object v0, LaE2;->t:Ljava/lang/Float;

    if-ne p1, v0, :cond_b

    iget-object p1, p0, Ld26;->V:LoB;

    if-eqz p1, :cond_9

    invoke-virtual {p0, p1}, LqB;->G(LoB;)V

    :cond_9
    if-nez p2, :cond_a

    iput-object v1, p0, Ld26;->V:LoB;

    goto :goto_0

    :cond_a
    new-instance p1, LCj6;

    invoke-direct {p1, p2}, LCj6;-><init>(LgE2;)V

    iput-object p1, p0, Ld26;->V:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    iget-object p1, p0, Ld26;->V:LoB;

    invoke-virtual {p0, p1}, LqB;->i(LoB;)V

    goto :goto_0

    :cond_b
    sget-object v0, LaE2;->F:Ljava/lang/Float;

    if-ne p1, v0, :cond_e

    iget-object p1, p0, Ld26;->W:LoB;

    if-eqz p1, :cond_c

    invoke-virtual {p0, p1}, LqB;->G(LoB;)V

    :cond_c
    if-nez p2, :cond_d

    iput-object v1, p0, Ld26;->W:LoB;

    goto :goto_0

    :cond_d
    new-instance p1, LCj6;

    invoke-direct {p1, p2}, LCj6;-><init>(LgE2;)V

    iput-object p1, p0, Ld26;->W:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    iget-object p1, p0, Ld26;->W:LoB;

    invoke-virtual {p0, p1}, LqB;->i(LoB;)V

    goto :goto_0

    :cond_e
    sget-object v0, LaE2;->M:Landroid/graphics/Typeface;

    if-ne p1, v0, :cond_11

    iget-object p1, p0, Ld26;->X:LoB;

    if-eqz p1, :cond_f

    invoke-virtual {p0, p1}, LqB;->G(LoB;)V

    :cond_f
    if-nez p2, :cond_10

    iput-object v1, p0, Ld26;->X:LoB;

    goto :goto_0

    :cond_10
    new-instance p1, LCj6;

    invoke-direct {p1, p2}, LCj6;-><init>(LgE2;)V

    iput-object p1, p0, Ld26;->X:LoB;

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    iget-object p1, p0, Ld26;->X:LoB;

    invoke-virtual {p0, p1}, LqB;->i(LoB;)V

    goto :goto_0

    :cond_11
    sget-object v0, LaE2;->O:Ljava/lang/CharSequence;

    if-ne p1, v0, :cond_12

    iget-object p1, p0, Ld26;->L:Lb26;

    invoke-virtual {p1, p2}, Lb26;->q(LgE2;)V

    :cond_12
    :goto_0
    return-void
.end method

.method public t(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V
    .locals 2

    iget-object p3, p0, Ld26;->L:Lb26;

    invoke-virtual {p3}, LoB;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LN51;

    iget-object v0, p0, Ld26;->N:LrD2;

    invoke-virtual {v0}, LrD2;->g()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p3, LN51;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfw1;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    invoke-virtual {p0, p3, p2}, Ld26;->P(LN51;Landroid/graphics/Matrix;)V

    iget-object v1, p0, Ld26;->M:LRD2;

    invoke-virtual {v1}, LRD2;->e1()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, p3, p2, v0, p1}, Ld26;->X(LN51;Landroid/graphics/Matrix;Lfw1;Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p3, v0, p1}, Ld26;->W(LN51;Lfw1;Landroid/graphics/Canvas;)V

    :goto_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method
