.class public Lcom/google/android/filament/View$MultiSampleAntiAliasingOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MultiSampleAntiAliasingOptions"
.end annotation


# instance fields
.field public customResolve:Z

.field public enabled:Z

.field public sampleCount:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/filament/View$MultiSampleAntiAliasingOptions;->enabled:Z

    const/4 v1, 0x4

    iput v1, p0, Lcom/google/android/filament/View$MultiSampleAntiAliasingOptions;->sampleCount:I

    iput-boolean v0, p0, Lcom/google/android/filament/View$MultiSampleAntiAliasingOptions;->customResolve:Z

    return-void
.end method
