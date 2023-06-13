.class public Lcom/google/android/filament/utils/AutomationEngine$ViewerOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/utils/AutomationEngine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ViewerOptions"
.end annotation


# instance fields
.field public autoInstancingEnabled:Z

.field public autoScaleEnabled:Z

.field public cameraAperture:F

.field public cameraFocalLength:F

.field public cameraFocusDistance:F

.field public cameraISO:F

.field public cameraSpeed:F

.field public groundPlaneEnabled:Z

.field public groundShadowStrength:F

.field public skyboxEnabled:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x41800000    # 16.0f

    iput v0, p0, Lcom/google/android/filament/utils/AutomationEngine$ViewerOptions;->cameraAperture:F

    const/high16 v0, 0x42fa0000    # 125.0f

    iput v0, p0, Lcom/google/android/filament/utils/AutomationEngine$ViewerOptions;->cameraSpeed:F

    const/high16 v0, 0x42c80000    # 100.0f

    iput v0, p0, Lcom/google/android/filament/utils/AutomationEngine$ViewerOptions;->cameraISO:F

    const/high16 v0, 0x3f400000    # 0.75f

    iput v0, p0, Lcom/google/android/filament/utils/AutomationEngine$ViewerOptions;->groundShadowStrength:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/filament/utils/AutomationEngine$ViewerOptions;->groundPlaneEnabled:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/filament/utils/AutomationEngine$ViewerOptions;->skyboxEnabled:Z

    const/high16 v2, 0x41e00000    # 28.0f

    iput v2, p0, Lcom/google/android/filament/utils/AutomationEngine$ViewerOptions;->cameraFocalLength:F

    const/4 v2, 0x0

    iput v2, p0, Lcom/google/android/filament/utils/AutomationEngine$ViewerOptions;->cameraFocusDistance:F

    iput-boolean v1, p0, Lcom/google/android/filament/utils/AutomationEngine$ViewerOptions;->autoScaleEnabled:Z

    iput-boolean v0, p0, Lcom/google/android/filament/utils/AutomationEngine$ViewerOptions;->autoInstancingEnabled:Z

    return-void
.end method
