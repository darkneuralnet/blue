.class public LfE2;
.super LtB;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public e:F

.field public f:Z

.field public g:J

.field public h:F

.field public i:F

.field public j:I

.field public k:F

.field public l:F

.field public m:LrD2;

.field public n:Z

.field public o:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, LtB;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, LfE2;->e:F

    const/4 v0, 0x0

    iput-boolean v0, p0, LfE2;->f:Z

    const-wide/16 v1, 0x0

    iput-wide v1, p0, LfE2;->g:J

    const/4 v1, 0x0

    iput v1, p0, LfE2;->h:F

    iput v1, p0, LfE2;->i:F

    iput v0, p0, LfE2;->j:I

    const/high16 v1, -0x31000000

    iput v1, p0, LfE2;->k:F

    const/high16 v1, 0x4f000000

    iput v1, p0, LfE2;->l:F

    iput-boolean v0, p0, LfE2;->n:Z

    iput-boolean v0, p0, LfE2;->o:Z

    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    invoke-virtual {p0}, LfE2;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LfE2;->C(Z)V

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    :cond_0
    return-void
.end method

.method public B()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LfE2;->C(Z)V

    return-void
.end method

.method public C(Z)V
    .locals 1

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, LfE2;->n:Z

    :cond_0
    return-void
.end method

.method public D()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LfE2;->n:Z

    invoke-virtual {p0}, LfE2;->A()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LfE2;->g:J

    invoke-virtual {p0}, LfE2;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LfE2;->o()F

    move-result v0

    invoke-virtual {p0}, LfE2;->r()F

    move-result v1

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, LfE2;->q()F

    move-result v0

    invoke-virtual {p0, v0}, LfE2;->I(F)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LfE2;->w()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LfE2;->o()F

    move-result v0

    invoke-virtual {p0}, LfE2;->q()F

    move-result v1

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    invoke-virtual {p0}, LfE2;->r()F

    move-result v0

    invoke-virtual {p0, v0}, LfE2;->I(F)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, LtB;->h()V

    return-void
.end method

.method public G()V
    .locals 1

    invoke-virtual {p0}, LfE2;->t()F

    move-result v0

    neg-float v0, v0

    invoke-virtual {p0, v0}, LfE2;->O(F)V

    return-void
.end method

.method public H(LrD2;)V
    .locals 2

    iget-object v0, p0, LfE2;->m:LrD2;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object p1, p0, LfE2;->m:LrD2;

    if-eqz v0, :cond_1

    iget v0, p0, LfE2;->k:F

    invoke-virtual {p1}, LrD2;->p()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iget v1, p0, LfE2;->l:F

    invoke-virtual {p1}, LrD2;->f()F

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-virtual {p0, v0, p1}, LfE2;->M(FF)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, LrD2;->p()F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {p1}, LrD2;->f()F

    move-result p1

    float-to-int p1, p1

    int-to-float p1, p1

    invoke-virtual {p0, v0, p1}, LfE2;->M(FF)V

    :goto_1
    iget p1, p0, LfE2;->i:F

    const/4 v0, 0x0

    iput v0, p0, LfE2;->i:F

    iput v0, p0, LfE2;->h:F

    float-to-int p1, p1

    int-to-float p1, p1

    invoke-virtual {p0, p1}, LfE2;->I(F)V

    invoke-virtual {p0}, LtB;->k()V

    return-void
.end method

.method public I(F)V
    .locals 2

    iget v0, p0, LfE2;->h:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LfE2;->r()F

    move-result v0

    invoke-virtual {p0}, LfE2;->q()F

    move-result v1

    invoke-static {p1, v0, v1}, LrU2;->b(FFF)F

    move-result p1

    iput p1, p0, LfE2;->h:F

    iget-boolean v0, p0, LfE2;->o:Z

    if-eqz v0, :cond_1

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-float p1, v0

    :cond_1
    iput p1, p0, LfE2;->i:F

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LfE2;->g:J

    invoke-virtual {p0}, LtB;->k()V

    return-void
.end method

.method public J(F)V
    .locals 1

    iget v0, p0, LfE2;->k:F

    invoke-virtual {p0, v0, p1}, LfE2;->M(FF)V

    return-void
.end method

.method public M(FF)V
    .locals 3

    cmpl-float v0, p1, p2

    if-gtz v0, :cond_4

    iget-object v0, p0, LfE2;->m:LrD2;

    if-nez v0, :cond_0

    const v0, -0x800001

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LrD2;->p()F

    move-result v0

    :goto_0
    iget-object v1, p0, LfE2;->m:LrD2;

    if-nez v1, :cond_1

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, LrD2;->f()F

    move-result v1

    :goto_1
    invoke-static {p1, v0, v1}, LrU2;->b(FFF)F

    move-result p1

    invoke-static {p2, v0, v1}, LrU2;->b(FFF)F

    move-result p2

    iget v0, p0, LfE2;->k:F

    cmpl-float v0, p1, v0

    if-nez v0, :cond_2

    iget v0, p0, LfE2;->l:F

    cmpl-float v0, p2, v0

    if-eqz v0, :cond_3

    :cond_2
    iput p1, p0, LfE2;->k:F

    iput p2, p0, LfE2;->l:F

    iget v0, p0, LfE2;->i:F

    invoke-static {v0, p1, p2}, LrU2;->b(FFF)F

    move-result p1

    float-to-int p1, p1

    int-to-float p1, p1

    invoke-virtual {p0, p1}, LfE2;->I(F)V

    :cond_3
    return-void

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    aput-object p1, v1, v2

    const/4 p1, 0x1

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    aput-object p2, v1, p1

    const-string p1, "minFrame (%s) must be <= maxFrame (%s)"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public N(I)V
    .locals 1

    int-to-float p1, p1

    iget v0, p0, LfE2;->l:F

    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {p0, p1, v0}, LfE2;->M(FF)V

    return-void
.end method

.method public O(F)V
    .locals 0

    iput p1, p0, LfE2;->e:F

    return-void
.end method

.method public P(Z)V
    .locals 0

    iput-boolean p1, p0, LfE2;->o:Z

    return-void
.end method

.method public final Q()V
    .locals 4

    iget-object v0, p0, LfE2;->m:LrD2;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, LfE2;->i:F

    iget v1, p0, LfE2;->k:F

    cmpg-float v1, v0, v1

    if-ltz v1, :cond_1

    iget v1, p0, LfE2;->l:F

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, LfE2;->k:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, LfE2;->l:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget v2, p0, LfE2;->i:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "Frame must be [%f,%f]. It is %f"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public cancel()V
    .locals 0

    invoke-virtual {p0}, LfE2;->d()V

    invoke-virtual {p0}, LfE2;->B()V

    return-void
.end method

.method public d()V
    .locals 1

    invoke-super {p0}, LtB;->d()V

    invoke-virtual {p0}, LfE2;->w()Z

    move-result v0

    invoke-virtual {p0, v0}, LtB;->e(Z)V

    return-void
.end method

.method public doFrame(J)V
    .locals 6

    invoke-virtual {p0}, LfE2;->A()V

    iget-object v0, p0, LfE2;->m:LrD2;

    if-eqz v0, :cond_b

    invoke-virtual {p0}, LfE2;->isRunning()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v0, "LottieValueAnimator#doFrame"

    invoke-static {v0}, LDl2;->a(Ljava/lang/String;)V

    iget-wide v1, p0, LfE2;->g:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    sub-long v3, p1, v1

    :goto_0
    invoke-virtual {p0}, LfE2;->p()F

    move-result v1

    long-to-float v2, v3

    div-float/2addr v2, v1

    iget v1, p0, LfE2;->h:F

    invoke-virtual {p0}, LfE2;->w()Z

    move-result v3

    if-eqz v3, :cond_2

    neg-float v2, v2

    :cond_2
    add-float/2addr v1, v2

    invoke-virtual {p0}, LfE2;->r()F

    move-result v2

    invoke-virtual {p0}, LfE2;->q()F

    move-result v3

    invoke-static {v1, v2, v3}, LrU2;->d(FFF)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    iget v3, p0, LfE2;->h:F

    invoke-virtual {p0}, LfE2;->r()F

    move-result v4

    invoke-virtual {p0}, LfE2;->q()F

    move-result v5

    invoke-static {v1, v4, v5}, LrU2;->b(FFF)F

    move-result v1

    iput v1, p0, LfE2;->h:F

    iget-boolean v4, p0, LfE2;->o:Z

    if-eqz v4, :cond_3

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-float v1, v4

    :cond_3
    iput v1, p0, LfE2;->i:F

    iput-wide p1, p0, LfE2;->g:J

    iget-boolean v1, p0, LfE2;->o:Z

    if-eqz v1, :cond_4

    iget v1, p0, LfE2;->h:F

    cmpl-float v1, v1, v3

    if-eqz v1, :cond_5

    :cond_4
    invoke-virtual {p0}, LtB;->k()V

    :cond_5
    if-eqz v2, :cond_a

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getRepeatCount()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_7

    iget v1, p0, LfE2;->j:I

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getRepeatCount()I

    move-result v2

    if-lt v1, v2, :cond_7

    iget p1, p0, LfE2;->e:F

    const/4 p2, 0x0

    cmpg-float p1, p1, p2

    if-gez p1, :cond_6

    invoke-virtual {p0}, LfE2;->r()F

    move-result p1

    goto :goto_1

    :cond_6
    invoke-virtual {p0}, LfE2;->q()F

    move-result p1

    :goto_1
    iput p1, p0, LfE2;->h:F

    iput p1, p0, LfE2;->i:F

    invoke-virtual {p0}, LfE2;->B()V

    invoke-virtual {p0}, LfE2;->w()Z

    move-result p1

    invoke-virtual {p0, p1}, LtB;->e(Z)V

    goto :goto_4

    :cond_7
    invoke-virtual {p0}, LtB;->g()V

    iget v1, p0, LfE2;->j:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LfE2;->j:I

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getRepeatMode()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_8

    iget-boolean v1, p0, LfE2;->f:Z

    xor-int/lit8 v1, v1, 0x1

    iput-boolean v1, p0, LfE2;->f:Z

    invoke-virtual {p0}, LfE2;->G()V

    goto :goto_3

    :cond_8
    invoke-virtual {p0}, LfE2;->w()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {p0}, LfE2;->q()F

    move-result v1

    goto :goto_2

    :cond_9
    invoke-virtual {p0}, LfE2;->r()F

    move-result v1

    :goto_2
    iput v1, p0, LfE2;->h:F

    iput v1, p0, LfE2;->i:F

    :goto_3
    iput-wide p1, p0, LfE2;->g:J

    :cond_a
    :goto_4
    invoke-virtual {p0}, LfE2;->Q()V

    invoke-static {v0}, LDl2;->b(Ljava/lang/String;)F

    :cond_b
    :goto_5
    return-void
.end method

.method public getAnimatedFraction()F
    .locals 3

    iget-object v0, p0, LfE2;->m:LrD2;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p0}, LfE2;->w()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LfE2;->q()F

    move-result v0

    iget v1, p0, LfE2;->i:F

    sub-float/2addr v0, v1

    invoke-virtual {p0}, LfE2;->q()F

    move-result v1

    invoke-virtual {p0}, LfE2;->r()F

    move-result v2

    :goto_0
    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    return v0

    :cond_1
    iget v0, p0, LfE2;->i:F

    invoke-virtual {p0}, LfE2;->r()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-virtual {p0}, LfE2;->q()F

    move-result v1

    invoke-virtual {p0}, LfE2;->r()F

    move-result v2

    goto :goto_0
.end method

.method public getAnimatedValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LfE2;->n()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public getDuration()J
    .locals 2

    iget-object v0, p0, LfE2;->m:LrD2;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LrD2;->d()F

    move-result v0

    float-to-long v0, v0

    :goto_0
    return-wide v0
.end method

.method public isRunning()Z
    .locals 1

    iget-boolean v0, p0, LfE2;->n:Z

    return v0
.end method

.method public l()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LfE2;->m:LrD2;

    const/high16 v0, -0x31000000

    iput v0, p0, LfE2;->k:F

    const/high16 v0, 0x4f000000

    iput v0, p0, LfE2;->l:F

    return-void
.end method

.method public m()V
    .locals 1

    invoke-virtual {p0}, LfE2;->B()V

    invoke-virtual {p0}, LfE2;->w()Z

    move-result v0

    invoke-virtual {p0, v0}, LtB;->e(Z)V

    return-void
.end method

.method public n()F
    .locals 3

    iget-object v0, p0, LfE2;->m:LrD2;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v1, p0, LfE2;->i:F

    invoke-virtual {v0}, LrD2;->p()F

    move-result v0

    sub-float/2addr v1, v0

    iget-object v0, p0, LfE2;->m:LrD2;

    invoke-virtual {v0}, LrD2;->f()F

    move-result v0

    iget-object v2, p0, LfE2;->m:LrD2;

    invoke-virtual {v2}, LrD2;->p()F

    move-result v2

    sub-float/2addr v0, v2

    div-float/2addr v1, v0

    return v1
.end method

.method public o()F
    .locals 1

    iget v0, p0, LfE2;->i:F

    return v0
.end method

.method public final p()F
    .locals 2

    iget-object v0, p0, LfE2;->m:LrD2;

    if-nez v0, :cond_0

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    return v0

    :cond_0
    const v1, 0x4e6e6b28    # 1.0E9f

    invoke-virtual {v0}, LrD2;->i()F

    move-result v0

    div-float/2addr v1, v0

    iget v0, p0, LfE2;->e:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    div-float/2addr v1, v0

    return v1
.end method

.method public q()F
    .locals 3

    iget-object v0, p0, LfE2;->m:LrD2;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v1, p0, LfE2;->l:F

    const/high16 v2, 0x4f000000

    cmpl-float v2, v1, v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, LrD2;->f()F

    move-result v1

    :cond_1
    return v1
.end method

.method public r()F
    .locals 3

    iget-object v0, p0, LfE2;->m:LrD2;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v1, p0, LfE2;->k:F

    const/high16 v2, -0x31000000

    cmpl-float v2, v1, v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, LrD2;->p()F

    move-result v1

    :cond_1
    return v1
.end method

.method public setRepeatMode(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    iget-boolean p1, p0, LfE2;->f:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, LfE2;->f:Z

    invoke-virtual {p0}, LfE2;->G()V

    :cond_0
    return-void
.end method

.method public t()F
    .locals 1

    iget v0, p0, LfE2;->e:F

    return v0
.end method

.method public final w()Z
    .locals 2

    invoke-virtual {p0}, LfE2;->t()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public y()V
    .locals 0

    invoke-virtual {p0}, LfE2;->B()V

    invoke-virtual {p0}, LtB;->f()V

    return-void
.end method

.method public z()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LfE2;->n:Z

    invoke-virtual {p0}, LfE2;->w()Z

    move-result v0

    invoke-virtual {p0, v0}, LtB;->j(Z)V

    invoke-virtual {p0}, LfE2;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LfE2;->q()F

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LfE2;->r()F

    move-result v0

    :goto_0
    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, LfE2;->I(F)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LfE2;->g:J

    const/4 v0, 0x0

    iput v0, p0, LfE2;->j:I

    invoke-virtual {p0}, LfE2;->A()V

    return-void
.end method
