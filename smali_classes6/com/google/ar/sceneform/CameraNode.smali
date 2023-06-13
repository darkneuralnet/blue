.class public Lcom/google/ar/sceneform/CameraNode;
.super Lio/github/sceneview/node/Node;
.source "SourceFile"


# static fields
.field public static final Z:Lhu1;

.field public static final p0:LUc4;


# instance fields
.field public final K:LjN2;

.field public final P:LjN2;

.field public Q:Lcom/google/android/filament/Camera;

.field public R:F

.field public S:F

.field public T:F

.field public U:Z

.field public W:Z

.field public X:[F

.field public Y:[F


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhu1;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v1, v2}, Lhu1;-><init>(FFF)V

    sput-object v0, Lcom/google/ar/sceneform/CameraNode;->Z:Lhu1;

    new-instance v0, LUc4;

    invoke-direct {v0}, LUc4;-><init>()V

    sput-object v0, Lcom/google/ar/sceneform/CameraNode;->p0:LUc4;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/ar/sceneform/CameraNode;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    invoke-direct {p0}, Lio/github/sceneview/node/Node;-><init>()V

    new-instance v0, LjN2;

    invoke-direct {v0}, LjN2;-><init>()V

    iput-object v0, p0, Lcom/google/ar/sceneform/CameraNode;->K:LjN2;

    new-instance v0, LjN2;

    invoke-direct {v0}, LjN2;-><init>()V

    iput-object v0, p0, Lcom/google/ar/sceneform/CameraNode;->P:LjN2;

    const v0, 0x3c23d70a    # 0.01f

    iput v0, p0, Lcom/google/ar/sceneform/CameraNode;->R:F

    const/high16 v0, 0x41f00000    # 30.0f

    iput v0, p0, Lcom/google/ar/sceneform/CameraNode;->S:F

    const/high16 v0, 0x42b40000    # 90.0f

    iput v0, p0, Lcom/google/ar/sceneform/CameraNode;->T:F

    const/16 v0, 0x10

    new-array v1, v0, [F

    iput-object v1, p0, Lcom/google/ar/sceneform/CameraNode;->X:[F

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/google/ar/sceneform/CameraNode;->Y:[F

    invoke-static {}, Ldl1;->c()Lcom/google/android/filament/Engine;

    move-result-object v0

    invoke-static {v0}, Lel1;->b(Lcom/google/android/filament/Engine;)Lcom/google/android/filament/Camera;

    move-result-object v0

    iput-object v0, p0, Lcom/google/ar/sceneform/CameraNode;->Q:Lcom/google/android/filament/Camera;

    iput-boolean p1, p0, Lcom/google/ar/sceneform/CameraNode;->U:Z

    sget-object p1, Lcom/google/ar/sceneform/CameraNode;->Z:Lhu1;

    invoke-virtual {p0, p1}, Lio/github/sceneview/node/Node;->z0(Lhu1;)V

    sget-object p1, Lcom/google/ar/sceneform/CameraNode;->p0:LUc4;

    invoke-virtual {p0, p1}, Lio/github/sceneview/node/Node;->A0(LUc4;)V

    return-void
.end method


# virtual methods
.method public O0()F
    .locals 1

    iget v0, p0, Lcom/google/ar/sceneform/CameraNode;->S:F

    return v0
.end method

.method public P0()F
    .locals 1

    iget v0, p0, Lcom/google/ar/sceneform/CameraNode;->R:F

    return v0
.end method

.method public Q0()LjN2;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/CameraNode;->P:LjN2;

    return-object v0
.end method

.method public final R0()I
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->b0()Lio/github/sceneview/SceneView;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v0, 0x438

    return v0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    return v0
.end method

.method public S0()LjN2;
    .locals 2

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->y()LjN2;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ar/sceneform/CameraNode;->K:LjN2;

    invoke-static {v0, v1}, LjN2;->b(LjN2;LjN2;)Z

    iget-object v0, p0, Lcom/google/ar/sceneform/CameraNode;->K:LjN2;

    return-object v0
.end method

.method public final T0()I
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->b0()Lio/github/sceneview/SceneView;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v0, 0x780

    return v0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    return v0
.end method

.method public U0()V
    .locals 4

    invoke-virtual {p0}, Lcom/google/ar/sceneform/CameraNode;->T0()I

    move-result v0

    invoke-virtual {p0}, Lcom/google/ar/sceneform/CameraNode;->R0()I

    move-result v1

    if-eqz v0, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    int-to-float v0, v0

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget v1, p0, Lcom/google/ar/sceneform/CameraNode;->T:F

    iget v2, p0, Lcom/google/ar/sceneform/CameraNode;->R:F

    iget v3, p0, Lcom/google/ar/sceneform/CameraNode;->S:F

    invoke-virtual {p0, v1, v0, v2, v3}, Lcom/google/ar/sceneform/CameraNode;->V0(FFFF)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final V0(FFFF)V
    .locals 7

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-lez v1, :cond_1

    const/high16 v1, 0x43340000    # 180.0f

    cmpl-float v1, p1, v1

    if-gez v1, :cond_1

    cmpg-float v0, p2, v0

    if-lez v0, :cond_0

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->tan(D)D

    move-result-wide v0

    double-to-float p1, v0

    mul-float v4, p1, p3

    neg-float v3, v4

    mul-float v2, v4, p2

    neg-float v1, v2

    move-object v0, p0

    move v5, p3

    move v6, p4

    invoke-virtual/range {v0 .. v6}, Lcom/google/ar/sceneform/CameraNode;->W0(FFFFFF)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Parameter \"aspect\" must be greater than zero."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Parameter \"verticalFovInDegrees\" is out of the valid range of (0, 180) degrees."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final W0(FFFFFF)V
    .locals 8

    iget-object v0, p0, Lcom/google/ar/sceneform/CameraNode;->P:LjN2;

    iget-object v0, v0, LjN2;->a:[F

    cmpl-float v1, p1, p2

    if-eqz v1, :cond_0

    cmpl-float v1, p3, p4

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    cmpg-float v2, p5, v1

    if-lez v2, :cond_0

    cmpg-float v2, p6, p5

    if-lez v2, :cond_0

    sub-float v2, p2, p1

    const/high16 v3, 0x3f800000    # 1.0f

    div-float v2, v3, v2

    sub-float v4, p4, p3

    div-float v4, v3, v4

    sub-float v5, p6, p5

    div-float/2addr v3, v5

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, p5

    mul-float v6, v5, v2

    const/4 v7, 0x0

    aput v6, v0, v7

    const/4 v6, 0x1

    aput v1, v0, v6

    const/4 v7, 0x2

    aput v1, v0, v7

    const/4 v7, 0x3

    aput v1, v0, v7

    const/4 v7, 0x4

    aput v1, v0, v7

    const/4 v7, 0x5

    mul-float/2addr v5, v4

    aput v5, v0, v7

    const/4 v5, 0x6

    aput v1, v0, v5

    const/4 v5, 0x7

    aput v1, v0, v5

    add-float/2addr p2, p1

    mul-float/2addr p2, v2

    const/16 p1, 0x8

    aput p2, v0, p1

    add-float/2addr p4, p3

    mul-float/2addr p4, v4

    const/16 p1, 0x9

    aput p4, v0, p1

    add-float p1, p6, p5

    neg-float p1, p1

    mul-float/2addr p1, v3

    const/16 p2, 0xa

    aput p1, v0, p2

    const/16 p1, 0xb

    const/high16 p2, -0x40800000    # -1.0f

    aput p2, v0, p1

    const/16 p1, 0xc

    aput v1, v0, p1

    const/16 p1, 0xd

    aput v1, v0, p1

    const/high16 p1, -0x40000000    # -2.0f

    mul-float/2addr p1, p6

    mul-float/2addr p1, p5

    mul-float/2addr p1, v3

    const/16 p2, 0xe

    aput p1, v0, p2

    const/16 p1, 0xf

    aput v1, v0, p1

    iput p5, p0, Lcom/google/ar/sceneform/CameraNode;->R:F

    iput p6, p0, Lcom/google/ar/sceneform/CameraNode;->S:F

    iput-boolean v6, p0, Lcom/google/ar/sceneform/CameraNode;->W:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid parameters to setPerspective, valid values:  width != height, bottom != top, near > 0.0f, far > near"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-super {p0}, Lio/github/sceneview/node/Node;->L()Lio/github/sceneview/node/Node;

    move-result-object v0

    return-object v0
.end method

.method public g(LPy1;)V
    .locals 7

    invoke-super {p0, p1}, Lio/github/sceneview/node/Node;->g(LPy1;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->y()LjN2;

    move-result-object p1

    iget-object p1, p1, LjN2;->a:[F

    iget-object v0, p0, Lcom/google/ar/sceneform/CameraNode;->X:[F

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([F[F)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/google/ar/sceneform/CameraNode;->X:[F

    iget-object v0, p0, Lcom/google/ar/sceneform/CameraNode;->Q:Lcom/google/android/filament/Camera;

    invoke-virtual {v0, p1}, Lcom/google/android/filament/Camera;->setModelMatrix([F)V

    :cond_0
    invoke-virtual {p0}, Lcom/google/ar/sceneform/CameraNode;->Q0()LjN2;

    move-result-object p1

    iget-object p1, p1, LjN2;->a:[F

    iget-object v0, p0, Lcom/google/ar/sceneform/CameraNode;->Y:[F

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([F[F)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object p1, p0, Lcom/google/ar/sceneform/CameraNode;->Y:[F

    array-length v0, p1

    new-array v2, v0, [D

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    aget v1, p1, v0

    float-to-double v3, v1

    aput-wide v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/ar/sceneform/CameraNode;->Q:Lcom/google/android/filament/Camera;

    invoke-virtual {p0}, Lcom/google/ar/sceneform/CameraNode;->P0()F

    move-result p1

    float-to-double v3, p1

    invoke-virtual {p0}, Lcom/google/ar/sceneform/CameraNode;->O0()F

    move-result p1

    float-to-double v5, p1

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/filament/Camera;->setCustomProjection([DDD)V

    :cond_2
    return-void
.end method

.method public onDestroy(LLifecycleOwner;)V
    .locals 1

    invoke-super {p0, p1}, Lio/github/sceneview/node/Node;->onDestroy(LLifecycleOwner;)V

    :try_start_0
    invoke-static {}, Ldl1;->c()Lcom/google/android/filament/Engine;

    move-result-object p1

    iget-object v0, p0, Lcom/google/ar/sceneform/CameraNode;->Q:Lcom/google/android/filament/Camera;

    invoke-virtual {v0}, Lcom/google/android/filament/Camera;->getEntity()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/filament/Engine;->destroyCameraComponent(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    invoke-static {}, Ldl1;->d()Lcom/google/android/filament/EntityManager;

    move-result-object p1

    iget-object v0, p0, Lcom/google/ar/sceneform/CameraNode;->Q:Lcom/google/android/filament/Camera;

    invoke-virtual {v0}, Lcom/google/android/filament/Camera;->getEntity()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/filament/EntityManager;->destroy(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method

.method public v0()V
    .locals 0

    invoke-super {p0}, Lio/github/sceneview/node/Node;->v0()V

    return-void
.end method
