.class public final Lcom/google/android/filament/utils/ScalarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0016\u001a!\u0010\u0008\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\u0008\u001a\u0011\u0010\u000c\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\u0008\u001a\u0011\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\u0008\u001a!\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0086\u0008\u001a\u0019\u0010\u0012\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0086\u0008\u001a\u0011\u0010\u0014\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\u0008\u001a\u0011\u0010\u0015\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0086\u0008\u001a\u0011\u0010\u0016\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\u0008\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "FOUR_PI",
        "",
        "FPI",
        "HALF_PI",
        "INV_FOUR_PI",
        "INV_PI",
        "INV_TWO_PI",
        "TWO_PI",
        "clamp",
        "x",
        "min",
        "max",
        "degrees",
        "v",
        "fract",
        "mix",
        "a",
        "b",
        "pow",
        "y",
        "radians",
        "saturate",
        "sqr",
        "filament-utils-android_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nScalar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n*L\n1#1,46:1\n31#1:47\n*S KotlinDebug\n*F\n+ 1 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n*L\n33#1:47\n*E\n"
    }
.end annotation


# static fields
.field public static final FOUR_PI:F = 12.566371f

.field public static final FPI:F = 3.1415927f

.field public static final HALF_PI:F = 1.5707964f

.field public static final INV_FOUR_PI:F = 0.07957747f

.field public static final INV_PI:F = 0.31830987f

.field public static final INV_TWO_PI:F = 0.15915494f

.field public static final TWO_PI:F = 6.2831855f


# direct methods
.method public static final clamp(FFF)F
    .locals 1

    cmpg-float v0, p0, p1

    if-gez v0, :cond_0

    move p0, p1

    goto :goto_0

    :cond_0
    cmpl-float p1, p0, p2

    if-lez p1, :cond_1

    move p0, p2

    :cond_1
    :goto_0
    return p0
.end method

.method public static final degrees(F)F
    .locals 1

    const v0, 0x42652ee0

    mul-float/2addr p0, v0

    return p0
.end method

.method public static final fract(F)F
    .locals 1

    const/4 v0, 0x1

    int-to-float v0, v0

    rem-float/2addr p0, v0

    return p0
.end method

.method public static final mix(FFF)F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p2

    mul-float/2addr p0, v0

    mul-float/2addr p1, p2

    add-float/2addr p0, p1

    return p0
.end method

.method public static final pow(FF)F
    .locals 2

    float-to-double v0, p0

    float-to-double p0, p1

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method

.method public static final radians(F)F
    .locals 1

    const v0, 0x3c8efa35

    mul-float/2addr p0, v0

    return p0
.end method

.method public static final saturate(F)F
    .locals 2

    const/4 v0, 0x0

    cmpg-float v1, p0, v0

    if-gez v1, :cond_0

    :goto_0
    move p0, v0

    goto :goto_1

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p0, v0

    if-lez v1, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    return p0
.end method

.method public static final sqr(F)F
    .locals 0

    mul-float/2addr p0, p0

    return p0
.end method
