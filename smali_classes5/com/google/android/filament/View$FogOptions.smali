.class public Lcom/google/android/filament/View$FogOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FogOptions"
.end annotation


# instance fields
.field public color:[F

.field public density:F

.field public distance:F

.field public enabled:Z

.field public fogColorFromIbl:Z

.field public height:F

.field public heightFalloff:F

.field public inScatteringSize:F

.field public inScatteringStart:F

.field public maximumOpacity:F


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/filament/View$FogOptions;->distance:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lcom/google/android/filament/View$FogOptions;->maximumOpacity:F

    iput v0, p0, Lcom/google/android/filament/View$FogOptions;->height:F

    iput v1, p0, Lcom/google/android/filament/View$FogOptions;->heightFalloff:F

    const/4 v1, 0x3

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    iput-object v1, p0, Lcom/google/android/filament/View$FogOptions;->color:[F

    const v1, 0x3dcccccd    # 0.1f

    iput v1, p0, Lcom/google/android/filament/View$FogOptions;->density:F

    iput v0, p0, Lcom/google/android/filament/View$FogOptions;->inScatteringStart:F

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/google/android/filament/View$FogOptions;->inScatteringSize:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/filament/View$FogOptions;->fogColorFromIbl:Z

    iput-boolean v0, p0, Lcom/google/android/filament/View$FogOptions;->enabled:Z

    return-void

    nop

    :array_0
    .array-data 4
        0x3f000000    # 0.5f
        0x3f000000    # 0.5f
        0x3f000000    # 0.5f
    .end array-data
.end method
