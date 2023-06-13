.class public Lcom/google/android/filament/View$AmbientOcclusionOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AmbientOcclusionOptions"
.end annotation


# instance fields
.field public bentNormals:Z

.field public bias:F

.field public bilateralThreshold:F

.field public enabled:Z

.field public intensity:F

.field public lowPassFilter:Lcom/google/android/filament/View$QualityLevel;

.field public minHorizonAngleRad:F

.field public power:F

.field public quality:Lcom/google/android/filament/View$QualityLevel;

.field public radius:F

.field public resolution:F

.field public ssctContactDistanceMax:F

.field public ssctDepthBias:F

.field public ssctDepthSlopeBias:F

.field public ssctEnabled:Z

.field public ssctIntensity:F

.field public ssctLightConeRad:F

.field public ssctLightDirection:[F

.field public ssctRayCount:I

.field public ssctSampleCount:I

.field public ssctShadowDistance:F

.field public upsampling:Lcom/google/android/filament/View$QualityLevel;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x3e99999a    # 0.3f

    iput v0, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->radius:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->power:F

    const v2, 0x3a03126f    # 5.0E-4f

    iput v2, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->bias:F

    const/high16 v2, 0x3f000000    # 0.5f

    iput v2, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->resolution:F

    iput v1, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->intensity:F

    const v2, 0x3d4ccccd    # 0.05f

    iput v2, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->bilateralThreshold:F

    sget-object v2, Lcom/google/android/filament/View$QualityLevel;->LOW:Lcom/google/android/filament/View$QualityLevel;

    iput-object v2, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->quality:Lcom/google/android/filament/View$QualityLevel;

    sget-object v3, Lcom/google/android/filament/View$QualityLevel;->MEDIUM:Lcom/google/android/filament/View$QualityLevel;

    iput-object v3, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->lowPassFilter:Lcom/google/android/filament/View$QualityLevel;

    iput-object v2, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->upsampling:Lcom/google/android/filament/View$QualityLevel;

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->enabled:Z

    iput-boolean v2, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->bentNormals:Z

    const/4 v3, 0x0

    iput v3, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->minHorizonAngleRad:F

    iput v1, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->ssctLightConeRad:F

    iput v0, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->ssctShadowDistance:F

    iput v1, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->ssctContactDistanceMax:F

    const v0, 0x3f4ccccd    # 0.8f

    iput v0, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->ssctIntensity:F

    const/4 v0, 0x3

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->ssctLightDirection:[F

    const v0, 0x3c23d70a    # 0.01f

    iput v0, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->ssctDepthBias:F

    iput v0, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->ssctDepthSlopeBias:F

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->ssctSampleCount:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->ssctRayCount:I

    iput-boolean v2, p0, Lcom/google/android/filament/View$AmbientOcclusionOptions;->ssctEnabled:Z

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        -0x40800000    # -1.0f
        0x0
    .end array-data
.end method
