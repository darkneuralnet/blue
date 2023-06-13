.class public final Lcom/google/android/filament/utils/QuaternionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0008\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001\u001a\u0019\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\u0008\u001a\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0011\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0008\u001a\u0011\u0010\r\u001a\u00020\u00082\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0008\u001a\u001e\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0008\u001a\u001e\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0008\u001a\u000e\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a(\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0008\u001a\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\u00082\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0015\u001a\u00020\u0001*\u00020\u00082\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0016\u001a\u00020\u0001*\u00020\u00082\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00082\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u00a8\u0006\u0018"
    }
    d2 = {
        "abs",
        "Lcom/google/android/filament/utils/Quaternion;",
        "q",
        "conjugate",
        "cross",
        "a",
        "b",
        "dot",
        "",
        "eulerAngles",
        "Lcom/google/android/filament/utils/Float3;",
        "inverse",
        "length",
        "length2",
        "lerp",
        "t",
        "nlerp",
        "normalize",
        "slerp",
        "valueEps",
        "div",
        "minus",
        "plus",
        "times",
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
        "SMAP\nQuaternion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Quaternion.kt\ncom/google/android/filament/utils/QuaternionKt\n+ 2 Quaternion.kt\ncom/google/android/filament/utils/Quaternion\n+ 3 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n*L\n1#1,343:1\n257#1:344\n259#1:345\n259#1:351\n259#1:352\n253#1:354\n253#1:356\n230#2,5:346\n228#2:355\n228#2:357\n31#3:353\n37#3:358\n37#3:359\n37#3:360\n*S KotlinDebug\n*F\n+ 1 Quaternion.kt\ncom/google/android/filament/utils/QuaternionKt\n*L\n265#1:344\n272#1:345\n297#1:351\n303#1:352\n315#1:354\n319#1:356\n277#1:346,5\n315#1:355\n319#1:357\n304#1:353\n335#1:358\n338#1:359\n340#1:360\n*E\n"
    }
.end annotation


# direct methods
.method public static final abs(Lcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Quaternion;
    .locals 4

    const-string v0, "q"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v0
.end method

.method public static final conjugate(Lcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Quaternion;
    .locals 4

    const-string v0, "q"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    neg-float v1, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    neg-float v2, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    neg-float v3, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v0
.end method

.method public static final cross(Lcom/google/android/filament/utils/Quaternion;Lcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Quaternion;
    .locals 7

    const-string v0, "a"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v2

    mul-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v3

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v3

    mul-float/2addr v2, v3

    sub-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v4

    mul-float/2addr v3, v4

    sub-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v4

    mul-float/2addr v3, v4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v5

    mul-float/2addr v4, v5

    sub-float/2addr v3, v4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v5

    mul-float/2addr v4, v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v5

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v6

    mul-float/2addr v5, v6

    sub-float/2addr v4, v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v5

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v6

    mul-float/2addr v5, v6

    sub-float/2addr v4, v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result p0

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result p1

    mul-float/2addr p0, p1

    sub-float/2addr v4, p0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    new-instance p0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result p1

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v0

    const/4 v2, 0x0

    invoke-direct {p0, p1, v1, v0, v2}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object p0
.end method

.method public static final div(FLcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Quaternion;
    .locals 4

    const-string v0, "q"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    div-float v1, p0, v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    div-float v2, p0, v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    div-float v3, p0, v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p1

    div-float/2addr p0, p1

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v0
.end method

.method public static final dot(Lcom/google/android/filament/utils/Quaternion;Lcom/google/android/filament/utils/Quaternion;)F
    .locals 3

    const-string v0, "a"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p0

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p1

    mul-float/2addr p0, p1

    add-float/2addr v0, p0

    return v0
.end method

.method public static final eulerAngles(Lcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Float3;
    .locals 9

    const-string v0, "q"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/android/filament/utils/QuaternionKt;->normalize(Lcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Quaternion;

    move-result-object p0

    new-instance v0, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v2

    mul-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v3

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    float-to-double v3, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v5

    mul-float/2addr v1, v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v6

    mul-float/2addr v5, v6

    sub-float/2addr v1, v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v6

    mul-float/2addr v5, v6

    sub-float/2addr v1, v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v1, v5

    float-to-double v5, v1

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v3

    double-to-float v1, v3

    const v3, 0x42652ee0

    mul-float/2addr v1, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v5

    mul-float/2addr v4, v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v6

    mul-float/2addr v5, v6

    sub-float/2addr v4, v5

    const/high16 v5, -0x40000000    # -2.0f

    mul-float/2addr v4, v5

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->asin(D)D

    move-result-wide v4

    double-to-float v4, v4

    mul-float/2addr v4, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v6

    mul-float/2addr v5, v6

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v6

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    mul-float/2addr v5, v2

    float-to-double v5, v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v7

    mul-float/2addr v2, v7

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v7

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v8

    mul-float/2addr v7, v8

    add-float/2addr v2, v7

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v7

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v8

    mul-float/2addr v7, v8

    sub-float/2addr v2, v7

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v7

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result p0

    mul-float/2addr v7, p0

    sub-float/2addr v2, v7

    float-to-double v7, v2

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v5

    double-to-float p0, v5

    mul-float/2addr p0, v3

    invoke-direct {v0, v1, v4, p0}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    return-object v0
.end method

.method public static final inverse(Lcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Quaternion;
    .locals 5

    const-string v0, "q"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    div-float/2addr v1, v0

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v2

    neg-float v2, v2

    mul-float/2addr v2, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v3

    neg-float v3, v3

    mul-float/2addr v3, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v4

    neg-float v4, v4

    mul-float/2addr v4, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p0

    mul-float/2addr p0, v1

    invoke-direct {v0, v2, v3, v4, p0}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v0
.end method

.method public static final length(Lcom/google/android/filament/utils/Quaternion;)F
    .locals 3

    const-string v0, "q"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p0

    mul-float/2addr v1, p0

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final length2(Lcom/google/android/filament/utils/Quaternion;)F
    .locals 3

    const-string v0, "q"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p0

    mul-float/2addr v1, p0

    add-float/2addr v0, v1

    return v0
.end method

.method public static final lerp(Lcom/google/android/filament/utils/Quaternion;Lcom/google/android/filament/utils/Quaternion;F)Lcom/google/android/filament/utils/Quaternion;
    .locals 5

    const-string v0, "a"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    int-to-float v0, v0

    sub-float/2addr v0, p2

    new-instance v1, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v2

    mul-float/2addr v2, v0

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v3

    mul-float/2addr v3, v0

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v4

    mul-float/2addr v4, v0

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p0

    mul-float/2addr v0, p0

    invoke-direct {v1, v2, v3, v4, v0}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    new-instance p0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v0

    mul-float/2addr v0, p2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    mul-float/2addr v2, p2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    mul-float/2addr v3, p2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p1

    mul-float/2addr p2, p1

    invoke-direct {p0, v0, v2, v3, p2}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    new-instance p1, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result p2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v0

    add-float/2addr p2, v0

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    add-float/2addr v0, v2

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    add-float/2addr v2, v3

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p0

    add-float/2addr v1, p0

    invoke-direct {p1, p2, v0, v2, v1}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object p1
.end method

.method public static final minus(FLcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Quaternion;
    .locals 4

    const-string v0, "q"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    sub-float v1, p0, v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    sub-float v2, p0, v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    sub-float v3, p0, v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p1

    sub-float/2addr p0, p1

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v0
.end method

.method public static final nlerp(Lcom/google/android/filament/utils/Quaternion;Lcom/google/android/filament/utils/Quaternion;F)Lcom/google/android/filament/utils/Quaternion;
    .locals 1

    const-string v0, "a"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lcom/google/android/filament/utils/QuaternionKt;->lerp(Lcom/google/android/filament/utils/Quaternion;Lcom/google/android/filament/utils/Quaternion;F)Lcom/google/android/filament/utils/Quaternion;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/filament/utils/QuaternionKt;->normalize(Lcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Quaternion;

    move-result-object p0

    return-object p0
.end method

.method public static final normalize(Lcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Quaternion;
    .locals 5

    const-string v0, "q"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    div-float/2addr v1, v0

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v2

    mul-float/2addr v2, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v3

    mul-float/2addr v3, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v4

    mul-float/2addr v4, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p0

    mul-float/2addr p0, v1

    invoke-direct {v0, v2, v3, v4, p0}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v0
.end method

.method public static final plus(FLcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Quaternion;
    .locals 4

    const-string v0, "q"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    add-float/2addr v1, p0

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    add-float/2addr v2, p0

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    add-float/2addr v3, p0

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p1

    add-float/2addr p0, p1

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v0
.end method

.method public static final slerp(Lcom/google/android/filament/utils/Quaternion;Lcom/google/android/filament/utils/Quaternion;FF)Lcom/google/android/filament/utils/Quaternion;
    .locals 8

    const-string v0, "a"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v3, v2, v1

    cmpg-float v3, v3, p3

    const/4 v4, 0x0

    if-gez v3, :cond_1

    cmpg-float p3, v0, v4

    if-gez p3, :cond_0

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->unaryMinus()Lcom/google/android/filament/utils/Quaternion;

    move-result-object p0

    :cond_0
    invoke-static {p0, p1, p2}, Lcom/google/android/filament/utils/QuaternionKt;->lerp(Lcom/google/android/filament/utils/Quaternion;Lcom/google/android/filament/utils/Quaternion;F)Lcom/google/android/filament/utils/Quaternion;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/filament/utils/QuaternionKt;->normalize(Lcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Quaternion;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v5

    mul-float/2addr v3, v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v3, v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v3, v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v3, v5

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v5

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v6

    mul-float/2addr v5, v6

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v6

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v6

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v6

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    mul-float/2addr v3, v5

    float-to-double v5, v3

    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v5

    double-to-float v3, v5

    div-float/2addr v1, v3

    const/high16 v3, -0x40800000    # -1.0f

    cmpg-float v5, v1, v3

    if-gez v5, :cond_2

    move v1, v3

    goto :goto_0

    :cond_2
    cmpl-float v3, v1, v2

    if-lez v3, :cond_3

    move v1, v2

    :cond_3
    :goto_0
    float-to-double v5, v1

    invoke-static {v5, v6}, Ljava/lang/Math;->acos(D)D

    move-result-wide v5

    double-to-float v1, v5

    sub-float v3, v2, p2

    mul-float/2addr v3, v1

    mul-float v5, v1, p2

    float-to-double v6, v1

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    double-to-float v1, v6

    cmpg-float p3, v1, p3

    if-gez p3, :cond_4

    invoke-static {p0, p1, p2}, Lcom/google/android/filament/utils/QuaternionKt;->lerp(Lcom/google/android/filament/utils/Quaternion;Lcom/google/android/filament/utils/Quaternion;F)Lcom/google/android/filament/utils/Quaternion;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/filament/utils/QuaternionKt;->normalize(Lcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Quaternion;

    move-result-object p0

    return-object p0

    :cond_4
    div-float/2addr v2, v1

    float-to-double p2, v3

    invoke-static {p2, p3}, Ljava/lang/Math;->sin(D)D

    move-result-wide p2

    double-to-float p2, p2

    mul-float/2addr p2, v2

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    move-result-wide v5

    double-to-float p3, v5

    mul-float/2addr p3, v2

    new-instance v1, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v2

    mul-float/2addr v2, p2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v3

    mul-float/2addr v3, p2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v5

    mul-float/2addr v5, p2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p0

    mul-float/2addr p2, p0

    invoke-direct {v1, v2, v3, v5, p2}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    cmpg-float p0, v0, v4

    if-gez p0, :cond_5

    neg-float p3, p3

    :cond_5
    new-instance p0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result p2

    mul-float/2addr p2, p3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v0

    mul-float/2addr v0, p3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v2

    mul-float/2addr v2, p3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p1

    mul-float/2addr p3, p1

    invoke-direct {p0, p2, v0, v2, p3}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    new-instance p1, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result p2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result p3

    add-float/2addr p2, p3

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result p3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v0

    add-float/2addr p3, v0

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v2

    add-float/2addr v0, v2

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p0

    add-float/2addr v1, p0

    invoke-direct {p1, p2, p3, v0, v1}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    invoke-static {p1}, Lcom/google/android/filament/utils/QuaternionKt;->normalize(Lcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Quaternion;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic slerp$default(Lcom/google/android/filament/utils/Quaternion;Lcom/google/android/filament/utils/Quaternion;FFILjava/lang/Object;)Lcom/google/android/filament/utils/Quaternion;
    .locals 0

    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_0

    const p3, 0x2edbe6ff    # 1.0E-10f

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/google/android/filament/utils/QuaternionKt;->slerp(Lcom/google/android/filament/utils/Quaternion;Lcom/google/android/filament/utils/Quaternion;FF)Lcom/google/android/filament/utils/Quaternion;

    move-result-object p0

    return-object p0
.end method

.method public static final times(FLcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Quaternion;
    .locals 4

    const-string v0, "q"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    mul-float/2addr v1, p0

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    mul-float/2addr v2, p0

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    mul-float/2addr v3, p0

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p1

    mul-float/2addr p0, p1

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v0
.end method
