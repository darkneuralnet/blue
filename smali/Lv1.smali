.class public LLv1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final v:[Landroid/hardware/camera2/params/MeteringRectangle;


# instance fields
.field public final a:Lr90;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ljava/util/concurrent/ScheduledExecutorService;

.field public volatile d:Z

.field public volatile e:Landroid/util/Rational;

.field public final f:LTT2;

.field public g:Z

.field public h:Ljava/lang/Integer;

.field public i:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field public j:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field public k:J

.field public l:Z

.field public m:Z

.field public n:I

.field public o:Lr90$c;

.field public p:Lr90$c;

.field public q:[Landroid/hardware/camera2/params/MeteringRectangle;

.field public r:[Landroid/hardware/camera2/params/MeteringRectangle;

.field public s:[Landroid/hardware/camera2/params/MeteringRectangle;

.field public t:LO80$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LO80$a<",
            "LMv1;",
            ">;"
        }
    .end annotation
.end field

.field public u:LO80$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LO80$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Landroid/hardware/camera2/params/MeteringRectangle;

    sput-object v0, LLv1;->v:[Landroid/hardware/camera2/params/MeteringRectangle;

    return-void
.end method

.method public constructor <init>(Lr90;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;LTe4;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LLv1;->d:Z

    const/4 v1, 0x0

    iput-object v1, p0, LLv1;->e:Landroid/util/Rational;

    iput-boolean v0, p0, LLv1;->g:Z

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, LLv1;->h:Ljava/lang/Integer;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, LLv1;->k:J

    iput-boolean v0, p0, LLv1;->l:Z

    iput-boolean v0, p0, LLv1;->m:Z

    const/4 v0, 0x1

    iput v0, p0, LLv1;->n:I

    iput-object v1, p0, LLv1;->o:Lr90$c;

    iput-object v1, p0, LLv1;->p:Lr90$c;

    sget-object v0, LLv1;->v:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-object v0, p0, LLv1;->q:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-object v0, p0, LLv1;->r:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-object v0, p0, LLv1;->s:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-object v1, p0, LLv1;->t:LO80$a;

    iput-object v1, p0, LLv1;->u:LO80$a;

    iput-object p1, p0, LLv1;->a:Lr90;

    iput-object p3, p0, LLv1;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, LLv1;->c:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p1, LTT2;

    invoke-direct {p1, p4}, LTT2;-><init>(LTe4;)V

    iput-object p1, p0, LLv1;->f:LTT2;

    return-void
.end method

.method private synthetic A(IJLandroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p4, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, p1, :cond_0

    invoke-static {p4, p2, p3}, Lr90;->R(Landroid/hardware/camera2/TotalCaptureResult;J)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LLv1;->o()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private synthetic B(ZJLandroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 4

    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p4, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p0}, LLv1;->M()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eqz p1, :cond_2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, LLv1;->h:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x3

    if-ne p1, v1, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x4

    if-ne p1, v1, :cond_1

    iput-boolean v3, p0, LLv1;->m:Z

    iput-boolean v3, p0, LLv1;->l:Z

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x5

    if-ne p1, v1, :cond_3

    iput-boolean v2, p0, LLv1;->m:Z

    iput-boolean v3, p0, LLv1;->l:Z

    goto :goto_1

    :cond_2
    :goto_0
    iput-boolean v3, p0, LLv1;->m:Z

    iput-boolean v3, p0, LLv1;->l:Z

    :cond_3
    :goto_1
    iget-boolean p1, p0, LLv1;->l:Z

    if-eqz p1, :cond_4

    invoke-static {p4, p2, p3}, Lr90;->R(Landroid/hardware/camera2/TotalCaptureResult;J)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-boolean p1, p0, LLv1;->m:Z

    invoke-virtual {p0, p1}, LLv1;->n(Z)V

    return v3

    :cond_4
    iget-object p1, p0, LLv1;->h:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    if-eqz v0, :cond_5

    iput-object v0, p0, LLv1;->h:Ljava/lang/Integer;

    :cond_5
    return v2
.end method

.method private synthetic C(J)V
    .locals 2

    iget-wide v0, p0, LLv1;->k:J

    cmp-long p1, p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, LLv1;->m:Z

    invoke-virtual {p0, p1}, LLv1;->n(Z)V

    :cond_0
    return-void
.end method

.method private synthetic D(J)V
    .locals 2

    iget-object v0, p0, LLv1;->b:Ljava/util/concurrent/Executor;

    new-instance v1, LEv1;

    invoke-direct {v1, p0, p1, p2}, LEv1;-><init>(LLv1;J)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic E(J)V
    .locals 2

    iget-wide v0, p0, LLv1;->k:J

    cmp-long p1, p1, v0

    if-nez p1, :cond_0

    invoke-virtual {p0}, LLv1;->l()V

    :cond_0
    return-void
.end method

.method private synthetic F(J)V
    .locals 2

    iget-object v0, p0, LLv1;->b:Ljava/util/concurrent/Executor;

    new-instance v1, LDv1;

    invoke-direct {v1, p0, p1, p2}, LDv1;-><init>(LLv1;J)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic G(LO80$a;LCv1;J)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, LLv1;->P(LO80$a;LCv1;J)V

    return-void
.end method

.method private synthetic H(LCv1;JLO80$a;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LLv1;->b:Ljava/util/concurrent/Executor;

    new-instance v7, LHv1;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p4

    move-object v4, p1

    move-wide v5, p2

    invoke-direct/range {v1 .. v6}, LHv1;-><init>(LLv1;LO80$a;LCv1;J)V

    invoke-interface {v0, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p1, "startFocusAndMetering"

    return-object p1
.end method

.method public static I(III)I
    .locals 0

    invoke-static {p0, p2}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method public static synthetic a(LLv1;IJLandroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LLv1;->A(IJLandroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(LLv1;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, LLv1;->C(J)V

    return-void
.end method

.method public static synthetic c(LLv1;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, LLv1;->D(J)V

    return-void
.end method

.method public static synthetic d(LLv1;LCv1;JLO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LLv1;->H(LCv1;JLO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LLv1;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, LLv1;->F(J)V

    return-void
.end method

.method public static synthetic f(LLv1;LO80$a;LCv1;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LLv1;->G(LO80$a;LCv1;J)V

    return-void
.end method

.method public static synthetic g(LLv1;ZJLandroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LLv1;->B(ZJLandroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p0

    return p0
.end method

.method public static synthetic h(LLv1;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, LLv1;->E(J)V

    return-void
.end method

.method public static v(LRT2;Landroid/util/Rational;Landroid/util/Rational;ILTT2;)Landroid/graphics/PointF;
    .locals 6

    invoke-virtual {p0}, LRT2;->b()Landroid/util/Rational;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LRT2;->b()Landroid/util/Rational;

    move-result-object p2

    :cond_0
    invoke-virtual {p4, p0, p3}, LTT2;->a(LRT2;I)Landroid/graphics/PointF;

    move-result-object p0

    invoke-virtual {p2, p1}, Landroid/util/Rational;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    invoke-virtual {p2, p1}, Landroid/util/Rational;->compareTo(Landroid/util/Rational;)I

    move-result p3

    const/high16 p4, 0x3f800000    # 1.0f

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    if-lez p3, :cond_1

    invoke-virtual {p2}, Landroid/util/Rational;->doubleValue()D

    move-result-wide p2

    invoke-virtual {p1}, Landroid/util/Rational;->doubleValue()D

    move-result-wide v4

    div-double/2addr p2, v4

    double-to-float p1, p2

    float-to-double p2, p1

    sub-double/2addr p2, v2

    div-double/2addr p2, v0

    double-to-float p2, p2

    iget p3, p0, Landroid/graphics/PointF;->y:F

    add-float/2addr p2, p3

    div-float/2addr p4, p1

    mul-float/2addr p2, p4

    iput p2, p0, Landroid/graphics/PointF;->y:F

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/util/Rational;->doubleValue()D

    move-result-wide v4

    invoke-virtual {p2}, Landroid/util/Rational;->doubleValue()D

    move-result-wide p1

    div-double/2addr v4, p1

    double-to-float p1, v4

    float-to-double p2, p1

    sub-double/2addr p2, v2

    div-double/2addr p2, v0

    double-to-float p2, p2

    iget p3, p0, Landroid/graphics/PointF;->x:F

    add-float/2addr p2, p3

    div-float/2addr p4, p1

    mul-float/2addr p2, p4

    iput p2, p0, Landroid/graphics/PointF;->x:F

    :cond_2
    :goto_0
    return-object p0
.end method

.method public static w(LRT2;Landroid/graphics/PointF;Landroid/graphics/Rect;)Landroid/hardware/camera2/params/MeteringRectangle;
    .locals 5

    iget v0, p2, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    iget v1, p1, Landroid/graphics/PointF;->x:F

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-int v0, v0

    iget v1, p2, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr p1, v2

    add-float/2addr v1, p1

    float-to-int p1, v1

    invoke-virtual {p0}, LRT2;->a()F

    move-result v1

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {p0}, LRT2;->a()F

    move-result p0

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr p0, v2

    float-to-int p0, p0

    new-instance v2, Landroid/graphics/Rect;

    div-int/lit8 v1, v1, 0x2

    sub-int v3, v0, v1

    div-int/lit8 p0, p0, 0x2

    sub-int v4, p1, p0

    add-int/2addr v0, v1

    add-int/2addr p1, p0

    invoke-direct {v2, v3, v4, v0, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    iget p0, v2, Landroid/graphics/Rect;->left:I

    iget p1, p2, Landroid/graphics/Rect;->right:I

    iget v0, p2, Landroid/graphics/Rect;->left:I

    invoke-static {p0, p1, v0}, LLv1;->I(III)I

    move-result p0

    iput p0, v2, Landroid/graphics/Rect;->left:I

    iget p0, v2, Landroid/graphics/Rect;->right:I

    iget p1, p2, Landroid/graphics/Rect;->right:I

    iget v0, p2, Landroid/graphics/Rect;->left:I

    invoke-static {p0, p1, v0}, LLv1;->I(III)I

    move-result p0

    iput p0, v2, Landroid/graphics/Rect;->right:I

    iget p0, v2, Landroid/graphics/Rect;->top:I

    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    iget v0, p2, Landroid/graphics/Rect;->top:I

    invoke-static {p0, p1, v0}, LLv1;->I(III)I

    move-result p0

    iput p0, v2, Landroid/graphics/Rect;->top:I

    iget p0, v2, Landroid/graphics/Rect;->bottom:I

    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    iget p2, p2, Landroid/graphics/Rect;->top:I

    invoke-static {p0, p1, p2}, LLv1;->I(III)I

    move-result p0

    iput p0, v2, Landroid/graphics/Rect;->bottom:I

    new-instance p0, Landroid/hardware/camera2/params/MeteringRectangle;

    const/16 p1, 0x3e8

    invoke-direct {p0, v2, p1}, Landroid/hardware/camera2/params/MeteringRectangle;-><init>(Landroid/graphics/Rect;I)V

    return-object p0
.end method

.method public static z(LRT2;)Z
    .locals 3

    invoke-virtual {p0}, LRT2;->c()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {p0}, LRT2;->c()F

    move-result v0

    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_0

    invoke-virtual {p0}, LRT2;->d()F

    move-result v0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {p0}, LRT2;->d()F

    move-result p0

    cmpg-float p0, p0, v2

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public J(Z)V
    .locals 1

    iget-boolean v0, p0, LLv1;->d:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, LLv1;->d:Z

    iget-boolean p1, p0, LLv1;->d:Z

    if-nez p1, :cond_1

    invoke-virtual {p0}, LLv1;->l()V

    :cond_1
    return-void
.end method

.method public K(Landroid/util/Rational;)V
    .locals 0

    iput-object p1, p0, LLv1;->e:Landroid/util/Rational;

    return-void
.end method

.method public L(I)V
    .locals 0

    iput p1, p0, LLv1;->n:I

    return-void
.end method

.method public final M()Z
    .locals 1

    iget-object v0, p0, LLv1;->q:[Landroid/hardware/camera2/params/MeteringRectangle;

    array-length v0, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public N(LCv1;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LCv1;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "LMv1;",
            ">;"
        }
    .end annotation

    const-wide/16 v0, 0x1388

    invoke-virtual {p0, p1, v0, v1}, LLv1;->O(LCv1;J)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public O(LCv1;J)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LCv1;",
            "J)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "LMv1;",
            ">;"
        }
    .end annotation

    new-instance v0, LFv1;

    invoke-direct {v0, p0, p1, p2, p3}, LFv1;-><init>(LLv1;LCv1;J)V

    invoke-static {v0}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public P(LO80$a;LCv1;J)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LO80$a<",
            "LMv1;",
            ">;",
            "LCv1;",
            "J)V"
        }
    .end annotation

    iget-boolean v0, p0, LLv1;->d:Z

    if-nez v0, :cond_0

    new-instance p2, Landroidx/camera/core/CameraControl$OperationCanceledException;

    const-string p3, "Camera is not active."

    invoke-direct {p2, p3}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LO80$a;->f(Ljava/lang/Throwable;)Z

    return-void

    :cond_0
    iget-object v0, p0, LLv1;->a:Lr90;

    invoke-virtual {v0}, Lr90;->z()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p0}, LLv1;->u()Landroid/util/Rational;

    move-result-object v7

    invoke-virtual {p2}, LCv1;->c()Ljava/util/List;

    move-result-object v2

    iget-object v1, p0, LLv1;->a:Lr90;

    invoke-virtual {v1}, Lr90;->D()I

    move-result v3

    const/4 v6, 0x1

    move-object v1, p0

    move-object v4, v7

    move-object v5, v0

    invoke-virtual/range {v1 .. v6}, LLv1;->x(Ljava/util/List;ILandroid/util/Rational;Landroid/graphics/Rect;I)Ljava/util/List;

    move-result-object v8

    invoke-virtual {p2}, LCv1;->b()Ljava/util/List;

    move-result-object v2

    iget-object v1, p0, LLv1;->a:Lr90;

    invoke-virtual {v1}, Lr90;->C()I

    move-result v3

    const/4 v6, 0x2

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, LLv1;->x(Ljava/util/List;ILandroid/util/Rational;Landroid/graphics/Rect;I)Ljava/util/List;

    move-result-object v9

    invoke-virtual {p2}, LCv1;->d()Ljava/util/List;

    move-result-object v2

    iget-object v1, p0, LLv1;->a:Lr90;

    invoke-virtual {v1}, Lr90;->E()I

    move-result v3

    const/4 v6, 0x4

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, LLv1;->x(Ljava/util/List;ILandroid/util/Rational;Landroid/graphics/Rect;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string p3, "None of the specified AF/AE/AWB MeteringPoints is supported on this camera."

    invoke-direct {p2, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LO80$a;->f(Ljava/lang/Throwable;)Z

    return-void

    :cond_1
    const-string v1, "Cancelled by another startFocusAndMetering()"

    invoke-virtual {p0, v1}, LLv1;->r(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, LLv1;->s(Ljava/lang/String;)V

    invoke-virtual {p0}, LLv1;->p()V

    iput-object p1, p0, LLv1;->t:LO80$a;

    sget-object p1, LLv1;->v:[Landroid/hardware/camera2/params/MeteringRectangle;

    invoke-interface {v8, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, [Landroid/hardware/camera2/params/MeteringRectangle;

    invoke-interface {v9, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, [Landroid/hardware/camera2/params/MeteringRectangle;

    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, [Landroid/hardware/camera2/params/MeteringRectangle;

    move-object v2, p0

    move-object v6, p2

    move-wide v7, p3

    invoke-virtual/range {v2 .. v8}, LLv1;->q([Landroid/hardware/camera2/params/MeteringRectangle;[Landroid/hardware/camera2/params/MeteringRectangle;[Landroid/hardware/camera2/params/MeteringRectangle;LCv1;J)V

    return-void
.end method

.method public Q(LO80$a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LO80$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, LLv1;->d:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    new-instance v0, Landroidx/camera/core/CameraControl$OperationCanceledException;

    const-string v1, "Camera is not active."

    invoke-direct {v0, v1}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, LO80$a;->f(Ljava/lang/Throwable;)Z

    :cond_0
    return-void

    :cond_1
    new-instance v0, Landroidx/camera/core/impl/d$a;

    invoke-direct {v0}, Landroidx/camera/core/impl/d$a;-><init>()V

    iget v1, p0, LLv1;->n:I

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/d$a;->s(I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/d$a;->t(Z)V

    new-instance v2, Lja0$a;

    invoke-direct {v2}, Lja0$a;-><init>()V

    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    invoke-virtual {v2}, Lja0$a;->a()Lja0;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/d$a;->e(Landroidx/camera/core/impl/f;)V

    new-instance v1, LLv1$b;

    invoke-direct {v1, p0, p1}, LLv1$b;-><init>(LLv1;LO80$a;)V

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/d$a;->c(Lpa0;)V

    iget-object p1, p0, LLv1;->a:Lr90;

    invoke-virtual {v0}, Landroidx/camera/core/impl/d$a;->h()Landroidx/camera/core/impl/d;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lr90;->k0(Ljava/util/List;)V

    return-void
.end method

.method public R(LO80$a;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LO80$a<",
            "Lxa0;",
            ">;Z)V"
        }
    .end annotation

    iget-boolean v0, p0, LLv1;->d:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    new-instance p2, Landroidx/camera/core/CameraControl$OperationCanceledException;

    const-string v0, "Camera is not active."

    invoke-direct {p2, v0}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LO80$a;->f(Ljava/lang/Throwable;)Z

    :cond_0
    return-void

    :cond_1
    new-instance v0, Landroidx/camera/core/impl/d$a;

    invoke-direct {v0}, Landroidx/camera/core/impl/d$a;-><init>()V

    iget v1, p0, LLv1;->n:I

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/d$a;->s(I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/d$a;->t(Z)V

    new-instance v2, Lja0$a;

    invoke-direct {v2}, Lja0$a;-><init>()V

    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    if-eqz p2, :cond_2

    sget-object p2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v3, p0, LLv1;->a:Lr90;

    invoke-virtual {v3, v1}, Lr90;->H(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, p2, v1}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    :cond_2
    invoke-virtual {v2}, Lja0$a;->a()Lja0;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroidx/camera/core/impl/d$a;->e(Landroidx/camera/core/impl/f;)V

    new-instance p2, LLv1$a;

    invoke-direct {p2, p0, p1}, LLv1$a;-><init>(LLv1;LO80$a;)V

    invoke-virtual {v0, p2}, Landroidx/camera/core/impl/d$a;->c(Lpa0;)V

    iget-object p1, p0, LLv1;->a:Lr90;

    invoke-virtual {v0}, Landroidx/camera/core/impl/d$a;->h()Landroidx/camera/core/impl/d;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Lr90;->k0(Ljava/util/List;)V

    return-void
.end method

.method public i(Lja0$a;)V
    .locals 3

    iget-boolean v0, p0, LLv1;->g:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LLv1;->t()I

    move-result v0

    :goto_0
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v2, p0, LLv1;->a:Lr90;

    invoke-virtual {v2, v0}, Lr90;->I(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    iget-object v0, p0, LLv1;->q:[Landroid/hardware/camera2/params/MeteringRectangle;

    array-length v1, v0

    if-eqz v1, :cond_1

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v1, v0}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    :cond_1
    iget-object v0, p0, LLv1;->r:[Landroid/hardware/camera2/params/MeteringRectangle;

    array-length v1, v0

    if-eqz v1, :cond_2

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v1, v0}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    :cond_2
    iget-object v0, p0, LLv1;->s:[Landroid/hardware/camera2/params/MeteringRectangle;

    array-length v1, v0

    if-eqz v1, :cond_3

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v1, v0}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    :cond_3
    return-void
.end method

.method public j(ZZ)V
    .locals 4

    iget-boolean v0, p0, LLv1;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroidx/camera/core/impl/d$a;

    invoke-direct {v0}, Landroidx/camera/core/impl/d$a;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/d$a;->t(Z)V

    iget v1, p0, LLv1;->n:I

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/d$a;->s(I)V

    new-instance v1, Lja0$a;

    invoke-direct {v1}, Lja0$a;-><init>()V

    const/4 v2, 0x2

    if-eqz p1, :cond_1

    sget-object p1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, p1, v3}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    :cond_1
    if-eqz p2, :cond_2

    sget-object p1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v1, p1, p2}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    :cond_2
    invoke-virtual {v1}, Lja0$a;->a()Lja0;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/d$a;->e(Landroidx/camera/core/impl/f;)V

    iget-object p1, p0, LLv1;->a:Lr90;

    invoke-virtual {v0}, Landroidx/camera/core/impl/d$a;->h()Landroidx/camera/core/impl/d;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Lr90;->k0(Ljava/util/List;)V

    return-void
.end method

.method public k(LO80$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LO80$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    const-string v0, "Cancelled by another cancelFocusAndMetering()"

    invoke-virtual {p0, v0}, LLv1;->s(Ljava/lang/String;)V

    const-string v0, "Cancelled by cancelFocusAndMetering()"

    invoke-virtual {p0, v0}, LLv1;->r(Ljava/lang/String;)V

    iput-object p1, p0, LLv1;->u:LO80$a;

    invoke-virtual {p0}, LLv1;->p()V

    invoke-virtual {p0}, LLv1;->m()V

    invoke-virtual {p0}, LLv1;->M()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, LLv1;->j(ZZ)V

    :cond_0
    sget-object p1, LLv1;->v:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-object p1, p0, LLv1;->q:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-object p1, p0, LLv1;->r:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-object p1, p0, LLv1;->s:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-boolean v0, p0, LLv1;->g:Z

    iget-object p1, p0, LLv1;->a:Lr90;

    invoke-virtual {p1}, Lr90;->n0()J

    move-result-wide v0

    iget-object p1, p0, LLv1;->u:LO80$a;

    if-eqz p1, :cond_1

    iget-object p1, p0, LLv1;->a:Lr90;

    invoke-virtual {p0}, LLv1;->t()I

    move-result v2

    invoke-virtual {p1, v2}, Lr90;->I(I)I

    move-result p1

    new-instance v2, LGv1;

    invoke-direct {v2, p0, p1, v0, v1}, LGv1;-><init>(LLv1;IJ)V

    iput-object v2, p0, LLv1;->p:Lr90$c;

    iget-object p1, p0, LLv1;->a:Lr90;

    invoke-virtual {p1, v2}, Lr90;->v(Lr90$c;)V

    :cond_1
    return-void
.end method

.method public l()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LLv1;->k(LO80$a;)V

    return-void
.end method

.method public final m()V
    .locals 2

    iget-object v0, p0, LLv1;->j:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 v0, 0x0

    iput-object v0, p0, LLv1;->j:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method

.method public n(Z)V
    .locals 1

    invoke-virtual {p0}, LLv1;->m()V

    iget-object v0, p0, LLv1;->t:LO80$a;

    if-eqz v0, :cond_0

    invoke-static {p1}, LMv1;->a(Z)LMv1;

    move-result-object p1

    invoke-virtual {v0, p1}, LO80$a;->c(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    iput-object p1, p0, LLv1;->t:LO80$a;

    :cond_0
    return-void
.end method

.method public final o()V
    .locals 2

    iget-object v0, p0, LLv1;->u:LO80$a;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LO80$a;->c(Ljava/lang/Object;)Z

    iput-object v1, p0, LLv1;->u:LO80$a;

    :cond_0
    return-void
.end method

.method public final p()V
    .locals 2

    iget-object v0, p0, LLv1;->i:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 v0, 0x0

    iput-object v0, p0, LLv1;->i:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method

.method public final q([Landroid/hardware/camera2/params/MeteringRectangle;[Landroid/hardware/camera2/params/MeteringRectangle;[Landroid/hardware/camera2/params/MeteringRectangle;LCv1;J)V
    .locals 2

    iget-object v0, p0, LLv1;->a:Lr90;

    iget-object v1, p0, LLv1;->o:Lr90$c;

    invoke-virtual {v0, v1}, Lr90;->d0(Lr90$c;)V

    invoke-virtual {p0}, LLv1;->p()V

    invoke-virtual {p0}, LLv1;->m()V

    iput-object p1, p0, LLv1;->q:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-object p2, p0, LLv1;->r:[Landroid/hardware/camera2/params/MeteringRectangle;

    iput-object p3, p0, LLv1;->s:[Landroid/hardware/camera2/params/MeteringRectangle;

    invoke-virtual {p0}, LLv1;->M()Z

    move-result p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    iput-boolean p2, p0, LLv1;->g:Z

    iput-boolean p3, p0, LLv1;->l:Z

    iput-boolean p3, p0, LLv1;->m:Z

    iget-object p1, p0, LLv1;->a:Lr90;

    invoke-virtual {p1}, Lr90;->n0()J

    move-result-wide v0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p2}, LLv1;->R(LO80$a;Z)V

    goto :goto_0

    :cond_0
    iput-boolean p3, p0, LLv1;->g:Z

    iput-boolean p2, p0, LLv1;->l:Z

    iput-boolean p3, p0, LLv1;->m:Z

    iget-object p1, p0, LLv1;->a:Lr90;

    invoke-virtual {p1}, Lr90;->n0()J

    move-result-wide v0

    :goto_0
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LLv1;->h:Ljava/lang/Integer;

    invoke-virtual {p0}, LLv1;->y()Z

    move-result p1

    new-instance p2, LIv1;

    invoke-direct {p2, p0, p1, v0, v1}, LIv1;-><init>(LLv1;ZJ)V

    iput-object p2, p0, LLv1;->o:Lr90$c;

    iget-object p1, p0, LLv1;->a:Lr90;

    invoke-virtual {p1, p2}, Lr90;->v(Lr90$c;)V

    iget-wide p1, p0, LLv1;->k:J

    const-wide/16 v0, 0x1

    add-long/2addr p1, v0

    iput-wide p1, p0, LLv1;->k:J

    new-instance p3, LJv1;

    invoke-direct {p3, p0, p1, p2}, LJv1;-><init>(LLv1;J)V

    iget-object v0, p0, LLv1;->c:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, p3, p5, p6, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p3

    iput-object p3, p0, LLv1;->j:Ljava/util/concurrent/ScheduledFuture;

    invoke-virtual {p4}, LCv1;->e()Z

    move-result p3

    if-eqz p3, :cond_1

    new-instance p3, LKv1;

    invoke-direct {p3, p0, p1, p2}, LKv1;-><init>(LLv1;J)V

    iget-object p1, p0, LLv1;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {p4}, LCv1;->a()J

    move-result-wide p4

    invoke-interface {p1, p3, p4, p5, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, LLv1;->i:Ljava/util/concurrent/ScheduledFuture;

    :cond_1
    return-void
.end method

.method public final r(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, LLv1;->a:Lr90;

    iget-object v1, p0, LLv1;->o:Lr90$c;

    invoke-virtual {v0, v1}, Lr90;->d0(Lr90$c;)V

    iget-object v0, p0, LLv1;->t:LO80$a;

    if-eqz v0, :cond_0

    new-instance v1, Landroidx/camera/core/CameraControl$OperationCanceledException;

    invoke-direct {v1, p1}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    const/4 p1, 0x0

    iput-object p1, p0, LLv1;->t:LO80$a;

    :cond_0
    return-void
.end method

.method public final s(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, LLv1;->a:Lr90;

    iget-object v1, p0, LLv1;->p:Lr90$c;

    invoke-virtual {v0, v1}, Lr90;->d0(Lr90$c;)V

    iget-object v0, p0, LLv1;->u:LO80$a;

    if-eqz v0, :cond_0

    new-instance v1, Landroidx/camera/core/CameraControl$OperationCanceledException;

    invoke-direct {v1, p1}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    const/4 p1, 0x0

    iput-object p1, p0, LLv1;->u:LO80$a;

    :cond_0
    return-void
.end method

.method public t()I
    .locals 2

    iget v0, p0, LLv1;->n:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v0, 0x4

    return v0

    :cond_0
    return v1
.end method

.method public final u()Landroid/util/Rational;
    .locals 3

    iget-object v0, p0, LLv1;->e:Landroid/util/Rational;

    if-eqz v0, :cond_0

    iget-object v0, p0, LLv1;->e:Landroid/util/Rational;

    return-object v0

    :cond_0
    iget-object v0, p0, LLv1;->a:Lr90;

    invoke-virtual {v0}, Lr90;->z()Landroid/graphics/Rect;

    move-result-object v0

    new-instance v1, Landroid/util/Rational;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    invoke-direct {v1, v2, v0}, Landroid/util/Rational;-><init>(II)V

    return-object v1
.end method

.method public final x(Ljava/util/List;ILandroid/util/Rational;Landroid/graphics/Rect;I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LRT2;",
            ">;I",
            "Landroid/util/Rational;",
            "Landroid/graphics/Rect;",
            "I)",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/params/MeteringRectangle;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    if-nez p2, :cond_0

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Landroid/util/Rational;

    invoke-virtual {p4}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {p4}, Landroid/graphics/Rect;->height()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/util/Rational;-><init>(II)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LRT2;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ne v3, p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v2}, LLv1;->z(LRT2;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    iget-object v3, p0, LLv1;->f:LTT2;

    invoke-static {v2, v1, p3, p5, v3}, LLv1;->v(LRT2;Landroid/util/Rational;Landroid/util/Rational;ILTT2;)Landroid/graphics/PointF;

    move-result-object v3

    invoke-static {v2, v3, p4}, LLv1;->w(LRT2;Landroid/graphics/PointF;Landroid/graphics/Rect;)Landroid/hardware/camera2/params/MeteringRectangle;

    move-result-object v2

    invoke-virtual {v2}, Landroid/hardware/camera2/params/MeteringRectangle;->getWidth()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Landroid/hardware/camera2/params/MeteringRectangle;->getHeight()I

    move-result v3

    if-nez v3, :cond_4

    goto :goto_0

    :cond_4
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    :goto_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final y()Z
    .locals 2

    iget-object v0, p0, LLv1;->a:Lr90;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lr90;->I(I)I

    move-result v0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
