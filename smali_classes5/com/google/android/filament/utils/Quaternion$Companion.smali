.class public final Lcom/google/android/filament/utils/Quaternion$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/utils/Quaternion;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006J$\u0010\u000b\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00082\u0008\u0008\u0002\u0010\r\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0008\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/google/android/filament/utils/Quaternion$Companion;",
        "",
        "()V",
        "fromAxisAngle",
        "Lcom/google/android/filament/utils/Quaternion;",
        "axis",
        "Lcom/google/android/filament/utils/Float3;",
        "angle",
        "",
        "fromEuler",
        "d",
        "fromEulerZYX",
        "yaw",
        "pitch",
        "roll",
        "filament-utils-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nQuaternion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Quaternion.kt\ncom/google/android/filament/utils/Quaternion$Companion\n+ 2 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n+ 3 Vector.kt\ncom/google/android/filament/utils/VectorKt\n+ 4 Vector.kt\ncom/google/android/filament/utils/Float3\n*L\n1#1,343:1\n39#2:344\n39#2:348\n652#3:345\n715#3:346\n306#4:347\n307#4,3:349\n*S KotlinDebug\n*F\n+ 1 Quaternion.kt\ncom/google/android/filament/utils/Quaternion$Companion\n*L\n50#1:344\n63#1:348\n51#1:345\n63#1:346\n63#1:347\n63#1:349,3\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/filament/utils/Quaternion$Companion;-><init>()V

    return-void
.end method

.method public static synthetic fromEulerZYX$default(Lcom/google/android/filament/utils/Quaternion$Companion;FFFILjava/lang/Object;)Lcom/google/android/filament/utils/Quaternion;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move p3, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/filament/utils/Quaternion$Companion;->fromEulerZYX(FFF)Lcom/google/android/filament/utils/Quaternion;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final fromAxisAngle(Lcom/google/android/filament/utils/Float3;F)Lcom/google/android/filament/utils/Quaternion;
    .locals 6

    const-string v0, "axis"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3c8efa35

    mul-float/2addr p2, v0

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr p2, v1

    float-to-double v1, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    double-to-float p2, v3

    invoke-static {p1}, Lcom/google/android/filament/utils/VectorKt;->normalize(Lcom/google/android/filament/utils/Float3;)Lcom/google/android/filament/utils/Float3;

    move-result-object p1

    new-instance v3, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v4

    mul-float/2addr v4, p2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v5

    mul-float/2addr v5, p2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result p1

    mul-float/2addr p2, p1

    invoke-direct {v3, v4, v5, p2}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide p1

    double-to-float p1, p1

    invoke-direct {v0, v3, p1}, Lcom/google/android/filament/utils/Quaternion;-><init>(Lcom/google/android/filament/utils/Float3;F)V

    return-object v0
.end method

.method public final fromEuler(Lcom/google/android/filament/utils/Float3;)Lcom/google/android/filament/utils/Quaternion;
    .locals 7

    const-string v0, "d"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lcom/google/android/filament/utils/Float3;->copy$default(Lcom/google/android/filament/utils/Float3;FFFILjava/lang/Object;)Lcom/google/android/filament/utils/Float3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v0

    const v1, 0x3c8efa35

    mul-float/2addr v0, v1

    invoke-virtual {p1, v0}, Lcom/google/android/filament/utils/Float3;->setX(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v0

    mul-float/2addr v0, v1

    invoke-virtual {p1, v0}, Lcom/google/android/filament/utils/Float3;->setY(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result v0

    mul-float/2addr v0, v1

    invoke-virtual {p1, v0}, Lcom/google/android/filament/utils/Float3;->setZ(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result p1

    invoke-virtual {p0, v0, v1, p1}, Lcom/google/android/filament/utils/Quaternion$Companion;->fromEulerZYX(FFF)Lcom/google/android/filament/utils/Quaternion;

    move-result-object p1

    return-object p1
.end method

.method public final fromEulerZYX(FFF)Lcom/google/android/filament/utils/Quaternion;
    .locals 8

    const/high16 v0, 0x3f000000    # 0.5f

    mul-float/2addr p1, v0

    float-to-double v1, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    double-to-float p1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr p2, v0

    float-to-double v2, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    double-to-float p2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr p3, v0

    float-to-double v3, p3

    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    double-to-float p3, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    double-to-float v0, v3

    new-instance v3, Lcom/google/android/filament/utils/Quaternion;

    mul-float v4, v0, p2

    mul-float v5, v4, p1

    mul-float v6, p3, v2

    mul-float v7, v6, v1

    sub-float/2addr v5, v7

    mul-float/2addr v6, p1

    mul-float/2addr v4, v1

    add-float/2addr v6, v4

    mul-float/2addr p3, p2

    mul-float p2, p3, v1

    mul-float/2addr v0, v2

    mul-float v2, v0, p1

    sub-float/2addr p2, v2

    mul-float/2addr p3, p1

    mul-float/2addr v0, v1

    add-float/2addr p3, v0

    invoke-direct {v3, v5, v6, p2, p3}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v3
.end method
