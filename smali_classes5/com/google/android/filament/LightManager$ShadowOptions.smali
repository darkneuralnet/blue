.class public Lcom/google/android/filament/LightManager$ShadowOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/LightManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ShadowOptions"
.end annotation


# instance fields
.field public blurWidth:F

.field public cascadeSplitPositions:[F

.field public constantBias:F

.field public elvsm:Z

.field public lispsm:Z

.field public mapSize:I

.field public maxShadowDistance:F

.field public normalBias:F

.field polygonOffsetConstant:F

.field polygonOffsetSlope:F

.field public screenSpaceContactShadows:Z

.field public shadowBulbRadius:F

.field public shadowCascades:I

.field public shadowFar:F

.field public shadowFarHint:F

.field public shadowNearHint:F

.field public stable:Z

.field public stepCount:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x400

    iput v0, p0, Lcom/google/android/filament/LightManager$ShadowOptions;->mapSize:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/filament/LightManager$ShadowOptions;->shadowCascades:I

    const/4 v0, 0x3

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/google/android/filament/LightManager$ShadowOptions;->cascadeSplitPositions:[F

    const v0, 0x3a83126f    # 0.001f

    iput v0, p0, Lcom/google/android/filament/LightManager$ShadowOptions;->constantBias:F

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/google/android/filament/LightManager$ShadowOptions;->normalBias:F

    const/4 v1, 0x0

    iput v1, p0, Lcom/google/android/filament/LightManager$ShadowOptions;->shadowFar:F

    iput v0, p0, Lcom/google/android/filament/LightManager$ShadowOptions;->shadowNearHint:F

    const/high16 v0, 0x42c80000    # 100.0f

    iput v0, p0, Lcom/google/android/filament/LightManager$ShadowOptions;->shadowFarHint:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/filament/LightManager$ShadowOptions;->stable:Z

    iput-boolean v0, p0, Lcom/google/android/filament/LightManager$ShadowOptions;->lispsm:Z

    const/high16 v2, 0x3f000000    # 0.5f

    iput v2, p0, Lcom/google/android/filament/LightManager$ShadowOptions;->polygonOffsetConstant:F

    const/high16 v2, 0x40000000    # 2.0f

    iput v2, p0, Lcom/google/android/filament/LightManager$ShadowOptions;->polygonOffsetSlope:F

    iput-boolean v0, p0, Lcom/google/android/filament/LightManager$ShadowOptions;->screenSpaceContactShadows:Z

    const/16 v2, 0x8

    iput v2, p0, Lcom/google/android/filament/LightManager$ShadowOptions;->stepCount:I

    const v2, 0x3e99999a    # 0.3f

    iput v2, p0, Lcom/google/android/filament/LightManager$ShadowOptions;->maxShadowDistance:F

    iput-boolean v0, p0, Lcom/google/android/filament/LightManager$ShadowOptions;->elvsm:Z

    iput v1, p0, Lcom/google/android/filament/LightManager$ShadowOptions;->blurWidth:F

    const v0, 0x3ca3d70a    # 0.02f

    iput v0, p0, Lcom/google/android/filament/LightManager$ShadowOptions;->shadowBulbRadius:F

    return-void

    :array_0
    .array-data 4
        0x3e000000    # 0.125f
        0x3e800000    # 0.25f
        0x3f000000    # 0.5f
    .end array-data
.end method
