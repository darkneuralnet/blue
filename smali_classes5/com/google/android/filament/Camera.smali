.class public Lcom/google/android/filament/Camera;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/filament/Camera$Fov;,
        Lcom/google/android/filament/Camera$Projection;
    }
.end annotation


# instance fields
.field private final mEntity:I
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation
.end field

.field private mNativeObject:J


# direct methods
.method public constructor <init>(JI)V
    .locals 0
    .param p3    # I
        .annotation build Lcom/google/android/filament/Entity;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/filament/Camera;->mNativeObject:J

    iput p3, p0, Lcom/google/android/filament/Camera;->mEntity:I

    return-void
.end method

.method public static computeEffectiveFocalLength(DD)D
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/filament/Camera;->nComputeEffectiveFocalLength(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static computeEffectiveFov(DD)D
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/filament/Camera;->nComputeEffectiveFov(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method private static native nComputeEffectiveFocalLength(DD)D
.end method

.method private static native nComputeEffectiveFov(DD)D
.end method

.method private static native nGetAperture(J)F
.end method

.method private static native nGetCullingFar(J)D
.end method

.method private static native nGetCullingProjectionMatrix(J[D)V
.end method

.method private static native nGetFocalLength(J)D
.end method

.method private static native nGetFocusDistance(J)F
.end method

.method private static native nGetForwardVector(J[F)V
.end method

.method private static native nGetLeftVector(J[F)V
.end method

.method private static native nGetModelMatrix(J[F)V
.end method

.method private static native nGetModelMatrixFp64(J[D)V
.end method

.method private static native nGetNear(J)D
.end method

.method private static native nGetPosition(J[F)V
.end method

.method private static native nGetProjectionMatrix(J[D)V
.end method

.method private static native nGetScaling(J[D)V
.end method

.method private static native nGetSensitivity(J)F
.end method

.method private static native nGetShutterSpeed(J)F
.end method

.method private static native nGetUpVector(J[F)V
.end method

.method private static native nGetViewMatrix(J[F)V
.end method

.method private static native nGetViewMatrixFp64(J[D)V
.end method

.method private static native nLookAt(JDDDDDDDDD)V
.end method

.method private static native nSetCustomProjection(J[D[DDD)V
.end method

.method private static native nSetExposure(JFFF)V
.end method

.method private static native nSetFocusDistance(JF)V
.end method

.method private static native nSetLensProjection(JDDDD)V
.end method

.method private static native nSetModelMatrix(J[F)V
.end method

.method private static native nSetModelMatrixFp64(J[D)V
.end method

.method private static native nSetProjection(JIDDDDDD)V
.end method

.method private static native nSetProjectionFov(JDDDDI)V
.end method

.method private static native nSetScaling(JDD)V
.end method

.method private static native nSetShift(JDD)V
.end method


# virtual methods
.method public clearNativeObject()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/filament/Camera;->mNativeObject:J

    return-void
.end method

.method public getAperture()F
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/filament/Camera;->nGetAperture(J)F

    move-result v0

    return v0
.end method

.method public getCullingFar()F
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/filament/Camera;->nGetCullingFar(J)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public getCullingProjectionMatrix([D)[D
    .locals 2

    invoke-static {p1}, Lcom/google/android/filament/Asserts;->assertMat4d([D)[D

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/Camera;->nGetCullingProjectionMatrix(J[D)V

    return-object p1
.end method

.method public getEntity()I
    .locals 1
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation

    iget v0, p0, Lcom/google/android/filament/Camera;->mEntity:I

    return v0
.end method

.method public getFocalLength()D
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/filament/Camera;->nGetFocalLength(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public getFocusDistance()F
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/filament/Camera;->nGetFocusDistance(J)F

    move-result v0

    return v0
.end method

.method public getForwardVector([F)[F
    .locals 2

    invoke-static {p1}, Lcom/google/android/filament/Asserts;->assertFloat3([F)[F

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/Camera;->nGetForwardVector(J[F)V

    return-object p1
.end method

.method public getLeftVector([F)[F
    .locals 2

    invoke-static {p1}, Lcom/google/android/filament/Asserts;->assertFloat3([F)[F

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/Camera;->nGetLeftVector(J[F)V

    return-object p1
.end method

.method public getModelMatrix([D)[D
    .locals 2

    invoke-static {p1}, Lcom/google/android/filament/Asserts;->assertMat4([D)[D

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/Camera;->nGetModelMatrixFp64(J[D)V

    return-object p1
.end method

.method public getModelMatrix([F)[F
    .locals 2

    invoke-static {p1}, Lcom/google/android/filament/Asserts;->assertMat4f([F)[F

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/Camera;->nGetModelMatrix(J[F)V

    return-object p1
.end method

.method public getNativeObject()J
    .locals 4

    iget-wide v0, p0, Lcom/google/android/filament/Camera;->mNativeObject:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    return-wide v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Calling method on destroyed Camera"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getNear()F
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/filament/Camera;->nGetNear(J)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public getPosition([F)[F
    .locals 2

    invoke-static {p1}, Lcom/google/android/filament/Asserts;->assertFloat3([F)[F

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/Camera;->nGetPosition(J[F)V

    return-object p1
.end method

.method public getProjectionMatrix([D)[D
    .locals 2

    invoke-static {p1}, Lcom/google/android/filament/Asserts;->assertMat4d([D)[D

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/Camera;->nGetProjectionMatrix(J[D)V

    return-object p1
.end method

.method public getScaling([D)[D
    .locals 2

    invoke-static {p1}, Lcom/google/android/filament/Asserts;->assertDouble4([D)[D

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/Camera;->nGetScaling(J[D)V

    return-object p1
.end method

.method public getSensitivity()F
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/filament/Camera;->nGetSensitivity(J)F

    move-result v0

    return v0
.end method

.method public getShutterSpeed()F
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/filament/Camera;->nGetShutterSpeed(J)F

    move-result v0

    return v0
.end method

.method public getUpVector([F)[F
    .locals 2

    invoke-static {p1}, Lcom/google/android/filament/Asserts;->assertFloat3([F)[F

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/Camera;->nGetUpVector(J[F)V

    return-object p1
.end method

.method public getViewMatrix([D)[D
    .locals 2

    invoke-static {p1}, Lcom/google/android/filament/Asserts;->assertMat4([D)[D

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/Camera;->nGetViewMatrixFp64(J[D)V

    return-object p1
.end method

.method public getViewMatrix([F)[F
    .locals 2

    invoke-static {p1}, Lcom/google/android/filament/Asserts;->assertMat4f([F)[F

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/Camera;->nGetViewMatrix(J[F)V

    return-object p1
.end method

.method public lookAt(DDDDDDDDD)V
    .locals 20

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-wide/from16 v10, p9

    move-wide/from16 v12, p11

    move-wide/from16 v14, p13

    move-wide/from16 v16, p15

    move-wide/from16 v18, p17

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static/range {v0 .. v19}, Lcom/google/android/filament/Camera;->nLookAt(JDDDDDDDDD)V

    return-void
.end method

.method public setCustomProjection([DDD)V
    .locals 8

    invoke-static {p1}, Lcom/google/android/filament/Asserts;->assertMat4dIn([D)V

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    move-object v2, p1

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-static/range {v0 .. v7}, Lcom/google/android/filament/Camera;->nSetCustomProjection(J[D[DDD)V

    return-void
.end method

.method public setCustomProjection([D[DDD)V
    .locals 8

    invoke-static {p1}, Lcom/google/android/filament/Asserts;->assertMat4dIn([D)V

    invoke-static {p2}, Lcom/google/android/filament/Asserts;->assertMat4dIn([D)V

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-wide v6, p5

    invoke-static/range {v0 .. v7}, Lcom/google/android/filament/Camera;->nSetCustomProjection(J[D[DDD)V

    return-void
.end method

.method public setExposure(F)V
    .locals 2

    const/high16 v0, 0x42c80000    # 100.0f

    const/high16 v1, 0x3f800000    # 1.0f

    div-float p1, v1, p1

    mul-float/2addr p1, v0

    const v0, 0x3f99999a    # 1.2f

    invoke-virtual {p0, v1, v0, p1}, Lcom/google/android/filament/Camera;->setExposure(FFF)V

    return-void
.end method

.method public setExposure(FFF)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2, p3}, Lcom/google/android/filament/Camera;->nSetExposure(JFFF)V

    return-void
.end method

.method public setFocusDistance(F)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/Camera;->nSetFocusDistance(JF)V

    return-void
.end method

.method public setLensProjection(DDDD)V
    .locals 10

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    move-wide v2, p1

    move-wide v4, p3

    move-wide v6, p5

    move-wide/from16 v8, p7

    invoke-static/range {v0 .. v9}, Lcom/google/android/filament/Camera;->nSetLensProjection(JDDDD)V

    return-void
.end method

.method public setModelMatrix([D)V
    .locals 2

    invoke-static {p1}, Lcom/google/android/filament/Asserts;->assertMat4In([D)V

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/Camera;->nSetModelMatrixFp64(J[D)V

    return-void
.end method

.method public setModelMatrix([F)V
    .locals 2

    invoke-static {p1}, Lcom/google/android/filament/Asserts;->assertMat4fIn([F)V

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/Camera;->nSetModelMatrix(J[F)V

    return-void
.end method

.method public setProjection(DDDDLcom/google/android/filament/Camera$Fov;)V
    .locals 11

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-virtual/range {p9 .. p9}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    move-wide v2, p1

    move-wide v4, p3

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    invoke-static/range {v0 .. v10}, Lcom/google/android/filament/Camera;->nSetProjectionFov(JDDDDI)V

    return-void
.end method

.method public setProjection(Lcom/google/android/filament/Camera$Projection;DDDDDD)V
    .locals 15

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move-wide/from16 v11, p10

    move-wide/from16 v13, p12

    invoke-static/range {v0 .. v14}, Lcom/google/android/filament/Camera;->nSetProjection(JIDDDDDD)V

    return-void
.end method

.method public setScaling(DD)V
    .locals 6

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    move-wide v2, p1

    move-wide v4, p3

    invoke-static/range {v0 .. v5}, Lcom/google/android/filament/Camera;->nSetScaling(JDD)V

    return-void
.end method

.method public setScaling([D)V
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p1}, Lcom/google/android/filament/Asserts;->assertDouble4In([D)V

    const/4 v0, 0x0

    aget-wide v0, p1, v0

    const/4 v2, 0x1

    aget-wide v2, p1, v2

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/google/android/filament/Camera;->setScaling(DD)V

    return-void
.end method

.method public setShift(DD)V
    .locals 6

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getNativeObject()J

    move-result-wide v0

    move-wide v2, p1

    move-wide v4, p3

    invoke-static/range {v0 .. v5}, Lcom/google/android/filament/Camera;->nSetShift(JDD)V

    return-void
.end method
