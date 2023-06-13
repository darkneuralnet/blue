.class public Lcom/google/android/filament/View$BloomOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BloomOptions"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/filament/View$BloomOptions$BlendMode;
    }
.end annotation


# instance fields
.field public anamorphism:F

.field public blendMode:Lcom/google/android/filament/View$BloomOptions$BlendMode;

.field public chromaticAberration:F

.field public dirt:Lcom/google/android/filament/Texture;

.field public dirtStrength:F

.field public enabled:Z

.field public ghostCount:I

.field public ghostSpacing:F

.field public ghostThreshold:F

.field public haloRadius:F

.field public haloThickness:F

.field public haloThreshold:F

.field public highlight:F

.field public lensFlare:Z

.field public levels:I

.field public resolution:I

.field public starburst:Z

.field public strength:F

.field public threshold:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/filament/View$BloomOptions;->dirt:Lcom/google/android/filament/Texture;

    const v0, 0x3e4ccccd    # 0.2f

    iput v0, p0, Lcom/google/android/filament/View$BloomOptions;->dirtStrength:F

    const v0, 0x3dcccccd    # 0.1f

    iput v0, p0, Lcom/google/android/filament/View$BloomOptions;->strength:F

    const/16 v1, 0x168

    iput v1, p0, Lcom/google/android/filament/View$BloomOptions;->resolution:I

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lcom/google/android/filament/View$BloomOptions;->anamorphism:F

    const/4 v1, 0x6

    iput v1, p0, Lcom/google/android/filament/View$BloomOptions;->levels:I

    sget-object v1, Lcom/google/android/filament/View$BloomOptions$BlendMode;->ADD:Lcom/google/android/filament/View$BloomOptions$BlendMode;

    iput-object v1, p0, Lcom/google/android/filament/View$BloomOptions;->blendMode:Lcom/google/android/filament/View$BloomOptions$BlendMode;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/filament/View$BloomOptions;->threshold:Z

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/google/android/filament/View$BloomOptions;->enabled:Z

    const/high16 v3, 0x447a0000    # 1000.0f

    iput v3, p0, Lcom/google/android/filament/View$BloomOptions;->highlight:F

    iput-boolean v2, p0, Lcom/google/android/filament/View$BloomOptions;->lensFlare:Z

    iput-boolean v1, p0, Lcom/google/android/filament/View$BloomOptions;->starburst:Z

    const v1, 0x3ba3d70a    # 0.005f

    iput v1, p0, Lcom/google/android/filament/View$BloomOptions;->chromaticAberration:F

    const/4 v1, 0x4

    iput v1, p0, Lcom/google/android/filament/View$BloomOptions;->ghostCount:I

    const v1, 0x3f19999a    # 0.6f

    iput v1, p0, Lcom/google/android/filament/View$BloomOptions;->ghostSpacing:F

    const/high16 v1, 0x41200000    # 10.0f

    iput v1, p0, Lcom/google/android/filament/View$BloomOptions;->ghostThreshold:F

    iput v0, p0, Lcom/google/android/filament/View$BloomOptions;->haloThickness:F

    const v0, 0x3ecccccd    # 0.4f

    iput v0, p0, Lcom/google/android/filament/View$BloomOptions;->haloRadius:F

    iput v1, p0, Lcom/google/android/filament/View$BloomOptions;->haloThreshold:F

    return-void
.end method
