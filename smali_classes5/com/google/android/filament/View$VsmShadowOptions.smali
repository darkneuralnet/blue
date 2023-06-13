.class public Lcom/google/android/filament/View$VsmShadowOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "VsmShadowOptions"
.end annotation


# instance fields
.field public anisotropy:I

.field public highPrecision:Z

.field public lightBleedReduction:F

.field public minVarianceScale:F

.field public mipmapping:Z

.field public msaaSamples:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/filament/View$VsmShadowOptions;->anisotropy:I

    iput-boolean v0, p0, Lcom/google/android/filament/View$VsmShadowOptions;->mipmapping:Z

    const/4 v1, 0x1

    iput v1, p0, Lcom/google/android/filament/View$VsmShadowOptions;->msaaSamples:I

    iput-boolean v0, p0, Lcom/google/android/filament/View$VsmShadowOptions;->highPrecision:Z

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lcom/google/android/filament/View$VsmShadowOptions;->minVarianceScale:F

    const v0, 0x3e19999a    # 0.15f

    iput v0, p0, Lcom/google/android/filament/View$VsmShadowOptions;->lightBleedReduction:F

    return-void
.end method
