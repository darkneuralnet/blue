.class public abstract LFu0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:F

.field public B:F

.field public C:F

.field public D:F

.field public E:I

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Landroid/view/VelocityTracker;

.field public J:F

.field public K:F

.field public L:F

.field public M:F

.field public N:F

.field public O:F

.field public final a:Landroid/graphics/Matrix;

.field public final b:Landroid/graphics/Paint;

.field public final c:[F

.field public d:Landroid/graphics/Rect;

.field public e:J

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:Ljava/lang/Float;

.field public m:Ljava/lang/Float;

.field public n:Ljava/lang/Long;

.field public o:Ljava/lang/Long;

.field public p:F

.field public q:F

.field public r:F

.field public s:Ljava/lang/Float;

.field public t:Ljava/lang/Long;

.field public u:J

.field public v:Landroid/view/animation/Interpolator;

.field public w:F

.field public x:F

.field public y:F

.field public z:F


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, LFu0;->a:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, LFu0;->b:Landroid/graphics/Paint;

    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, LFu0;->c:[F

    return-void
.end method

.method public static b(FFFLjava/lang/Long;Ljava/lang/Float;II)J
    .locals 8

    const/4 v0, 0x0

    cmpl-float v1, p2, v0

    const-wide v2, 0x7fffffffffffffffL

    const-wide/16 v4, 0x0

    if-eqz v1, :cond_6

    if-lez v1, :cond_0

    move p5, p6

    :cond_0
    if-eqz p3, :cond_3

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v6, 0x0

    cmp-long p6, v0, v6

    if-gez p6, :cond_1

    goto :goto_0

    :cond_1
    int-to-float p5, p5

    sub-float/2addr p5, p0

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-float p0, v0

    mul-float/2addr p1, p0

    sub-float/2addr p5, p1

    float-to-double p0, p5

    const-wide/high16 p5, 0x3fe0000000000000L    # 0.5

    float-to-double v0, p2

    mul-double/2addr v0, p5

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p5

    long-to-double p5, p5

    mul-double/2addr v0, p5

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p5

    long-to-double p5, p5

    mul-double/2addr v0, p5

    sub-double/2addr p0, v0

    invoke-virtual {p4}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p5

    long-to-float p3, p5

    mul-float/2addr p2, p3

    float-to-double p2, p2

    add-double/2addr p0, p2

    invoke-virtual {p4}, Ljava/lang/Float;->floatValue()F

    move-result p2

    float-to-double p2, p2

    div-double/2addr p0, p2

    cmpl-double p2, p0, v4

    if-lez p2, :cond_2

    double-to-long v2, p0

    :cond_2
    return-wide v2

    :cond_3
    :goto_0
    const/high16 p3, 0x40000000    # 2.0f

    mul-float/2addr p3, p2

    int-to-float p4, p5

    mul-float/2addr p4, p3

    mul-float/2addr p3, p0

    sub-float/2addr p4, p3

    mul-float p0, p1, p1

    add-float/2addr p4, p0

    float-to-double p3, p4

    invoke-static {p3, p4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p3

    neg-double p5, p3

    float-to-double p0, p1

    sub-double/2addr p5, p0

    float-to-double v0, p2

    div-double/2addr p5, v0

    cmpl-double p2, p5, v4

    if-lez p2, :cond_4

    double-to-long p0, p5

    return-wide p0

    :cond_4
    sub-double/2addr p3, p0

    div-double/2addr p3, v0

    cmpl-double p0, p3, v4

    if-lez p0, :cond_5

    double-to-long p0, p3

    return-wide p0

    :cond_5
    return-wide v2

    :cond_6
    if-nez p3, :cond_7

    goto :goto_1

    :cond_7
    invoke-virtual {p4}, Ljava/lang/Float;->floatValue()F

    move-result p1

    :goto_1
    cmpl-float p2, p1, v0

    if-lez p2, :cond_8

    move p5, p6

    :cond_8
    if-eqz p2, :cond_9

    int-to-float p2, p5

    sub-float/2addr p2, p0

    div-float/2addr p2, p1

    float-to-double p0, p2

    cmpl-double p2, p0, v4

    if-lez p2, :cond_9

    double-to-long v2, p0

    :cond_9
    return-wide v2
.end method

.method public static d(Ljava/lang/Float;FF)Ljava/lang/Long;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    const/4 v1, 0x0

    cmpl-float v1, p2, v1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    sub-float/2addr p0, p1

    div-float/2addr p0, p2

    float-to-long p0, p0

    cmp-long p2, p0, v2

    if-lez p2, :cond_0

    move-wide v2, p0

    :cond_0
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    cmpg-float p0, p0, p1

    if-gez p0, :cond_2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method


# virtual methods
.method public A(F)V
    .locals 0

    iput p1, p0, LFu0;->r:F

    return-void
.end method

.method public B(J)V
    .locals 0

    iput-wide p1, p0, LFu0;->u:J

    return-void
.end method

.method public C(Ljava/lang/Float;)V
    .locals 0

    iput-object p1, p0, LFu0;->s:Ljava/lang/Float;

    return-void
.end method

.method public D(Ljava/lang/Float;)V
    .locals 0

    iput-object p1, p0, LFu0;->l:Ljava/lang/Float;

    return-void
.end method

.method public E(Ljava/lang/Float;)V
    .locals 0

    iput-object p1, p0, LFu0;->m:Ljava/lang/Float;

    return-void
.end method

.method public a(J)Z
    .locals 12

    iget-wide v0, p0, LFu0;->e:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iput-wide p1, p0, LFu0;->e:J

    :cond_0
    iget-wide v0, p0, LFu0;->e:J

    sub-long/2addr p1, v0

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    const/4 v1, 0x0

    const/4 v11, 0x1

    if-ltz v0, :cond_1

    move v0, v11

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    iput-boolean v0, p0, LFu0;->F:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, LFu0;->G:Z

    if-nez v0, :cond_4

    iget-object v3, p0, LFu0;->c:[F

    iget v6, p0, LFu0;->f:F

    iget v7, p0, LFu0;->h:F

    iget v8, p0, LFu0;->j:F

    iget-object v9, p0, LFu0;->n:Ljava/lang/Long;

    iget-object v10, p0, LFu0;->l:Ljava/lang/Float;

    move-object v2, p0

    move-wide v4, p1

    invoke-virtual/range {v2 .. v10}, LFu0;->c([FJFFFLjava/lang/Long;Ljava/lang/Float;)V

    iget-object v3, p0, LFu0;->c:[F

    aget v0, v3, v1

    iput v0, p0, LFu0;->y:F

    aget v0, v3, v11

    iput v0, p0, LFu0;->B:F

    iget v6, p0, LFu0;->g:F

    iget v7, p0, LFu0;->i:F

    iget v8, p0, LFu0;->k:F

    iget-object v9, p0, LFu0;->o:Ljava/lang/Long;

    iget-object v10, p0, LFu0;->m:Ljava/lang/Float;

    invoke-virtual/range {v2 .. v10}, LFu0;->c([FJFFFLjava/lang/Long;Ljava/lang/Float;)V

    iget-object v3, p0, LFu0;->c:[F

    aget v0, v3, v1

    iput v0, p0, LFu0;->z:F

    aget v0, v3, v11

    iput v0, p0, LFu0;->C:F

    iget v6, p0, LFu0;->p:F

    iget v7, p0, LFu0;->q:F

    iget v8, p0, LFu0;->r:F

    iget-object v9, p0, LFu0;->t:Ljava/lang/Long;

    iget-object v10, p0, LFu0;->s:Ljava/lang/Float;

    invoke-virtual/range {v2 .. v10}, LFu0;->c([FJFFFLjava/lang/Long;Ljava/lang/Float;)V

    iget-object v0, p0, LFu0;->c:[F

    aget v2, v0, v1

    iput v2, p0, LFu0;->A:F

    aget v0, v0, v11

    iput v0, p0, LFu0;->D:F

    iget-object v0, p0, LFu0;->v:Landroid/view/animation/Interpolator;

    if-eqz v0, :cond_2

    long-to-float v2, p1

    iget v3, p0, LFu0;->w:F

    div-float/2addr v2, v3

    invoke-interface {v0, v2}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v0

    const/high16 v2, 0x437f0000    # 255.0f

    mul-float/2addr v0, v2

    float-to-int v0, v0

    iput v0, p0, LFu0;->E:I

    goto :goto_1

    :cond_2
    const/16 v0, 0xff

    iput v0, p0, LFu0;->E:I

    :goto_1
    iget-boolean v0, p0, LFu0;->H:Z

    if-nez v0, :cond_3

    long-to-float v0, p1

    iget v2, p0, LFu0;->w:F

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_3

    move v1, v11

    :cond_3
    iput-boolean v1, p0, LFu0;->G:Z

    long-to-float p1, p1

    iget p2, p0, LFu0;->w:F

    div-float/2addr p1, p2

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    iput p1, p0, LFu0;->x:F

    :cond_4
    iget-boolean p1, p0, LFu0;->G:Z

    xor-int/2addr p1, v11

    return p1
.end method

.method public final c([FJFFFLjava/lang/Long;Ljava/lang/Float;)V
    .locals 5

    long-to-float v0, p2

    mul-float v1, p6, v0

    add-float/2addr v1, p5

    const/4 v2, 0x1

    aput v1, p1, v2

    const/4 v1, 0x0

    const/high16 v2, 0x3f000000    # 0.5f

    if-eqz p7, :cond_1

    invoke-virtual {p7}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v3, p2, v3

    if-gez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p7}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    long-to-float v0, v3

    mul-float/2addr p5, v0

    add-float/2addr p4, p5

    mul-float/2addr p6, v2

    invoke-virtual {p7}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-float p5, v2

    mul-float/2addr p6, p5

    invoke-virtual {p7}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-float p5, v2

    mul-float/2addr p6, p5

    add-float/2addr p4, p6

    invoke-virtual {p7}, Ljava/lang/Long;->longValue()J

    move-result-wide p5

    sub-long/2addr p2, p5

    long-to-float p2, p2

    invoke-virtual {p8}, Ljava/lang/Float;->floatValue()F

    move-result p3

    mul-float/2addr p2, p3

    add-float/2addr p4, p2

    aput p4, p1, v1

    goto :goto_1

    :cond_1
    :goto_0
    mul-float/2addr p5, v0

    add-float/2addr p4, p5

    mul-float/2addr p6, v2

    mul-float/2addr p6, v0

    mul-float/2addr p6, v0

    add-float/2addr p4, p6

    aput p4, p1, v1

    :goto_1
    return-void
.end method

.method public e(Landroid/graphics/Paint;)V
    .locals 1

    iget v0, p0, LFu0;->E:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public final f(FF)Z
    .locals 2

    iget v0, p0, LFu0;->y:F

    cmpg-float v1, v0, p1

    if-gtz v1, :cond_0

    invoke-virtual {p0}, LFu0;->k()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_0

    iget p1, p0, LFu0;->z:F

    cmpg-float v0, p1, p2

    if-gtz v0, :cond_0

    invoke-virtual {p0}, LFu0;->j()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr p1, v0

    cmpg-float p1, p2, p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public g(Landroid/graphics/Canvas;)V
    .locals 8

    iget-boolean v0, p0, LFu0;->H:Z

    if-eqz v0, :cond_0

    iget v0, p0, LFu0;->L:F

    iput v0, p0, LFu0;->B:F

    iget v0, p0, LFu0;->M:F

    iput v0, p0, LFu0;->C:F

    iget v0, p0, LFu0;->J:F

    iget v1, p0, LFu0;->N:F

    add-float v4, v0, v1

    iget v0, p0, LFu0;->K:F

    iget v1, p0, LFu0;->O:F

    add-float v5, v0, v1

    iget v6, p0, LFu0;->A:F

    iget v7, p0, LFu0;->x:F

    move-object v2, p0

    move-object v3, p1

    invoke-virtual/range {v2 .. v7}, LFu0;->h(Landroid/graphics/Canvas;FFFF)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, LFu0;->F:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LFu0;->G:Z

    if-nez v0, :cond_1

    iget v3, p0, LFu0;->y:F

    iget v4, p0, LFu0;->z:F

    iget v5, p0, LFu0;->A:F

    iget v6, p0, LFu0;->x:F

    move-object v1, p0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, LFu0;->h(Landroid/graphics/Canvas;FFFF)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final h(Landroid/graphics/Canvas;FFFF)V
    .locals 10

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v0, p0, LFu0;->d:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    iget-object v0, p0, LFu0;->a:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    iget-object v0, p0, LFu0;->b:Landroid/graphics/Paint;

    iget v1, p0, LFu0;->E:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v4, p0, LFu0;->a:Landroid/graphics/Matrix;

    iget-object v5, p0, LFu0;->b:Landroid/graphics/Paint;

    move-object v2, p0

    move-object v3, p1

    move v6, p2

    move v7, p3

    move v8, p4

    move v9, p5

    invoke-virtual/range {v2 .. v9}, LFu0;->i(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Landroid/graphics/Paint;FFFF)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public abstract i(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Landroid/graphics/Paint;FFFF)V
.end method

.method public abstract j()I
.end method

.method public abstract k()I
.end method

.method public l(Landroid/view/MotionEvent;)Z
    .locals 4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-virtual {p0, v0, v1}, LFu0;->f(FF)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    iput-boolean v2, p0, LFu0;->H:Z

    iput v0, p0, LFu0;->J:F

    iput v1, p0, LFu0;->K:F

    iget v3, p0, LFu0;->y:F

    sub-float/2addr v3, v0

    iput v3, p0, LFu0;->N:F

    iget v0, p0, LFu0;->z:F

    sub-float/2addr v0, v1

    iput v0, p0, LFu0;->O:F

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, LFu0;->I:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    return v2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public m(Landroid/view/MotionEvent;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, LFu0;->J:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, LFu0;->K:F

    iget-object v0, p0, LFu0;->I:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    iget-object p1, p0, LFu0;->I:Landroid/view/VelocityTracker;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    iget-object p1, p0, LFu0;->I:Landroid/view/VelocityTracker;

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result p1

    iput p1, p0, LFu0;->L:F

    iget-object p1, p0, LFu0;->I:Landroid/view/VelocityTracker;

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result p1

    iput p1, p0, LFu0;->M:F

    return-void
.end method

.method public n(Landroid/view/MotionEvent;)V
    .locals 2

    iget-object v0, p0, LFu0;->I:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    iget-object v0, p0, LFu0;->I:Landroid/view/VelocityTracker;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LFu0;->e:J

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p0, LFu0;->N:F

    add-float/2addr v0, v1

    iput v0, p0, LFu0;->f:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget v0, p0, LFu0;->O:F

    add-float/2addr p1, v0

    iput p1, p0, LFu0;->g:F

    iget-object p1, p0, LFu0;->I:Landroid/view/VelocityTracker;

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result p1

    iput p1, p0, LFu0;->h:F

    iget-object p1, p0, LFu0;->I:Landroid/view/VelocityTracker;

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result p1

    iput p1, p0, LFu0;->i:F

    iget p1, p0, LFu0;->A:F

    iput p1, p0, LFu0;->p:F

    iget-object p1, p0, LFu0;->I:Landroid/view/VelocityTracker;

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V

    const/4 p1, 0x0

    iput-object p1, p0, LFu0;->I:Landroid/view/VelocityTracker;

    iget-object p1, p0, LFu0;->d:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, LFu0;->o(Landroid/graphics/Rect;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, LFu0;->H:Z

    return-void
.end method

.method public o(Landroid/graphics/Rect;)V
    .locals 8

    iput-object p1, p0, LFu0;->d:Landroid/graphics/Rect;

    iget-object v0, p0, LFu0;->l:Ljava/lang/Float;

    iget v1, p0, LFu0;->h:F

    iget v2, p0, LFu0;->j:F

    invoke-static {v0, v1, v2}, LFu0;->d(Ljava/lang/Float;FF)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, LFu0;->n:Ljava/lang/Long;

    iget-object v0, p0, LFu0;->m:Ljava/lang/Float;

    iget v1, p0, LFu0;->i:F

    iget v2, p0, LFu0;->k:F

    invoke-static {v0, v1, v2}, LFu0;->d(Ljava/lang/Float;FF)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, LFu0;->o:Ljava/lang/Long;

    iget-object v0, p0, LFu0;->s:Ljava/lang/Float;

    iget v1, p0, LFu0;->q:F

    iget v2, p0, LFu0;->r:F

    invoke-static {v0, v1, v2}, LFu0;->d(Ljava/lang/Float;FF)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, LFu0;->t:Ljava/lang/Long;

    iget-wide v0, p0, LFu0;->u:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    long-to-float v0, v0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x5f000000

    :goto_0
    iput v0, p0, LFu0;->w:F

    iget v1, p0, LFu0;->f:F

    iget v2, p0, LFu0;->h:F

    iget v3, p0, LFu0;->j:F

    iget-object v4, p0, LFu0;->n:Ljava/lang/Long;

    iget-object v5, p0, LFu0;->l:Ljava/lang/Float;

    iget v0, p1, Landroid/graphics/Rect;->left:I

    invoke-virtual {p0}, LFu0;->k()I

    move-result v6

    sub-int v6, v0, v6

    iget v7, p1, Landroid/graphics/Rect;->right:I

    invoke-static/range {v1 .. v7}, LFu0;->b(FFFLjava/lang/Long;Ljava/lang/Float;II)J

    move-result-wide v0

    long-to-float v0, v0

    iget v1, p0, LFu0;->w:F

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, LFu0;->w:F

    iget v1, p0, LFu0;->g:F

    iget v2, p0, LFu0;->i:F

    iget v3, p0, LFu0;->k:F

    iget-object v4, p0, LFu0;->o:Ljava/lang/Long;

    iget-object v5, p0, LFu0;->m:Ljava/lang/Float;

    iget v0, p1, Landroid/graphics/Rect;->top:I

    invoke-virtual {p0}, LFu0;->j()I

    move-result v6

    sub-int v6, v0, v6

    iget v7, p1, Landroid/graphics/Rect;->bottom:I

    invoke-static/range {v1 .. v7}, LFu0;->b(FFFLjava/lang/Long;Ljava/lang/Float;II)J

    move-result-wide v0

    long-to-float p1, v0

    iget v0, p0, LFu0;->w:F

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    iput p1, p0, LFu0;->w:F

    iget-object p1, p0, LFu0;->b:Landroid/graphics/Paint;

    invoke-virtual {p0, p1}, LFu0;->e(Landroid/graphics/Paint;)V

    return-void
.end method

.method public p()V
    .locals 4

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LFu0;->e:J

    const/4 v2, 0x0

    iput v2, p0, LFu0;->g:F

    iput v2, p0, LFu0;->f:F

    iput v2, p0, LFu0;->i:F

    iput v2, p0, LFu0;->h:F

    iput v2, p0, LFu0;->k:F

    iput v2, p0, LFu0;->j:F

    const/4 v3, 0x0

    iput-object v3, p0, LFu0;->m:Ljava/lang/Float;

    iput-object v3, p0, LFu0;->l:Ljava/lang/Float;

    iput-object v3, p0, LFu0;->o:Ljava/lang/Long;

    iput-object v3, p0, LFu0;->n:Ljava/lang/Long;

    iput v2, p0, LFu0;->p:F

    iput v2, p0, LFu0;->q:F

    iput v2, p0, LFu0;->r:F

    iput-object v3, p0, LFu0;->s:Ljava/lang/Float;

    iput-object v3, p0, LFu0;->t:Ljava/lang/Long;

    iput-wide v0, p0, LFu0;->u:J

    iput v2, p0, LFu0;->w:F

    iput v2, p0, LFu0;->x:F

    iput-object v3, p0, LFu0;->v:Landroid/view/animation/Interpolator;

    iput v2, p0, LFu0;->z:F

    iput v2, p0, LFu0;->y:F

    iput v2, p0, LFu0;->C:F

    iput v2, p0, LFu0;->B:F

    iput v2, p0, LFu0;->A:F

    const/16 v0, 0xff

    iput v0, p0, LFu0;->E:I

    const/4 v0, 0x0

    iput-boolean v0, p0, LFu0;->F:Z

    iput-boolean v0, p0, LFu0;->G:Z

    return-void
.end method

.method public q(F)V
    .locals 0

    iput p1, p0, LFu0;->j:F

    return-void
.end method

.method public r(F)V
    .locals 0

    iput p1, p0, LFu0;->k:F

    return-void
.end method

.method public s(Landroid/view/animation/Interpolator;)V
    .locals 0

    iput-object p1, p0, LFu0;->v:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public t(J)V
    .locals 0

    iput-wide p1, p0, LFu0;->e:J

    return-void
.end method

.method public u(F)V
    .locals 0

    iput p1, p0, LFu0;->p:F

    return-void
.end method

.method public v(F)V
    .locals 0

    iput p1, p0, LFu0;->q:F

    return-void
.end method

.method public w(F)V
    .locals 0

    iput p1, p0, LFu0;->h:F

    return-void
.end method

.method public x(F)V
    .locals 0

    iput p1, p0, LFu0;->i:F

    return-void
.end method

.method public y(F)V
    .locals 0

    iput p1, p0, LFu0;->f:F

    return-void
.end method

.method public z(F)V
    .locals 0

    iput p1, p0, LFu0;->g:F

    return-void
.end method
