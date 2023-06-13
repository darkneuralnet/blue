.class public final LNb0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0003\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/google/android/filament/Camera;",
        "",
        "a",
        "(Lcom/google/android/filament/Camera;)F",
        "ev100",
        "b",
        "exposureFactor",
        "sceneview_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public static final a(Lcom/google/android/filament/Camera;)F
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getAperture()F

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getAperture()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getShutterSpeed()F

    move-result v1

    div-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/Camera;->getSensitivity()F

    move-result p0

    div-float/2addr v0, p0

    invoke-static {v0}, Lkotlin/math/MathKt;->log2(F)F

    move-result p0

    return p0
.end method

.method public static final b(Lcom/google/android/filament/Camera;)F
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p0}, LNb0;->a(Lcom/google/android/filament/Camera;)F

    move-result p0

    div-float/2addr v0, p0

    return v0
.end method
