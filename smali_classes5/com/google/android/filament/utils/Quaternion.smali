.class public final Lcom/google/android/filament/utils/Quaternion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/filament/utils/Quaternion$WhenMappings;,
        Lcom/google/android/filament/utils/Quaternion$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008(\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u0000 L2\u00020\u0001:\u0001LB\u0019\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008B\u000f\u0008\u0016\u0012\u0006\u0010\t\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\nB-\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000eJ\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J1\u0010-\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00052\u0008\u0008\u0002\u0010\r\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0011\u0010.\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0013\u0010/\u001a\u0002002\u0008\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0011\u00102\u001a\u00020\u00052\u0006\u00103\u001a\u000204H\u0086\u0002J!\u00102\u001a\u00020\u00032\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u000204H\u0086\u0002J)\u00102\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u0002042\u0006\u00108\u001a\u000204H\u0086\u0002J\u0011\u00102\u001a\u00020\u00052\u0006\u00103\u001a\u000209H\u0086\u0002J!\u00102\u001a\u00020\u00032\u0006\u00105\u001a\u0002092\u0006\u00106\u001a\u0002092\u0006\u00107\u001a\u000209H\u0086\u0002J)\u00102\u001a\u00020\u00002\u0006\u00105\u001a\u0002092\u0006\u00106\u001a\u0002092\u0006\u00107\u001a\u0002092\u0006\u00108\u001a\u000209H\u0086\u0002J\t\u0010:\u001a\u000209H\u00d6\u0001J\u0011\u0010;\u001a\u00020\u00052\u0006\u00103\u001a\u000209H\u0086\nJ\u0011\u0010<\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\nJ\u0011\u0010<\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\nJ\u0011\u0010=\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ1\u0010>\u001a\u00020?2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u0002042\u0006\u00108\u001a\u0002042\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J)\u0010>\u001a\u00020?2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u0002042\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J!\u0010>\u001a\u00020?2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\u0019\u0010>\u001a\u00020?2\u0006\u00103\u001a\u0002042\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\u0019\u0010>\u001a\u00020?2\u0006\u00103\u001a\u0002092\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J!\u0010>\u001a\u00020?2\u0006\u00105\u001a\u0002092\u0006\u00106\u001a\u0002092\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J)\u0010>\u001a\u00020?2\u0006\u00105\u001a\u0002092\u0006\u00106\u001a\u0002092\u0006\u00107\u001a\u0002092\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J1\u0010>\u001a\u00020?2\u0006\u00105\u001a\u0002092\u0006\u00106\u001a\u0002092\u0006\u00107\u001a\u0002092\u0006\u00108\u001a\u0002092\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\u0011\u0010@\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0011\u0010@\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\nJ\u0011\u0010@\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0006\u0010A\u001a\u00020\u0003J\u0006\u0010B\u001a\u00020CJ\u0006\u0010D\u001a\u00020EJ\t\u0010F\u001a\u00020GH\u00d6\u0001J \u0010H\u001a\u00020\u00002\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050JH\u0086\u0008\u00f8\u0001\u0000J\t\u0010K\u001a\u00020\u0000H\u0086\u0002R&\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R&\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u0017\"\u0004\u0008\u001b\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001c\u0010\u0017\"\u0004\u0008\u001d\u0010\u0019R&\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001f\u0010\u0012\"\u0004\u0008 \u0010\u0014R&\u0010!\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00078\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010\u0008R\u001a\u0010\u000c\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010\u0017\"\u0004\u0008&\u0010\u0019R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\'\u0010\u0017\"\u0004\u0008(\u0010\u0019\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006M"
    }
    d2 = {
        "Lcom/google/android/filament/utils/Quaternion;",
        "",
        "v",
        "Lcom/google/android/filament/utils/Float3;",
        "w",
        "",
        "(Lcom/google/android/filament/utils/Float3;F)V",
        "Lcom/google/android/filament/utils/Float4;",
        "(Lcom/google/android/filament/utils/Float4;)V",
        "q",
        "(Lcom/google/android/filament/utils/Quaternion;)V",
        "x",
        "y",
        "z",
        "(FFFF)V",
        "value",
        "imaginary",
        "getImaginary",
        "()Lcom/google/android/filament/utils/Float3;",
        "setImaginary",
        "(Lcom/google/android/filament/utils/Float3;)V",
        "real",
        "getReal",
        "()F",
        "setReal",
        "(F)V",
        "getW",
        "setW",
        "getX",
        "setX",
        "xyz",
        "getXyz",
        "setXyz",
        "xyzw",
        "getXyzw",
        "()Lcom/google/android/filament/utils/Float4;",
        "setXyzw",
        "getY",
        "setY",
        "getZ",
        "setZ",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "div",
        "equals",
        "",
        "other",
        "get",
        "index",
        "Lcom/google/android/filament/utils/QuaternionComponent;",
        "index1",
        "index2",
        "index3",
        "index4",
        "",
        "hashCode",
        "invoke",
        "minus",
        "plus",
        "set",
        "",
        "times",
        "toEulerAngles",
        "toFloatArray",
        "",
        "toMatrix",
        "Lcom/google/android/filament/utils/Mat4;",
        "toString",
        "",
        "transform",
        "block",
        "Lkotlin/Function1;",
        "unaryMinus",
        "Companion",
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
        "SMAP\nQuaternion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Quaternion.kt\ncom/google/android/filament/utils/Quaternion\n*L\n1#1,343:1\n95#1:344\n230#1,5:345\n95#1:350\n*S KotlinDebug\n*F\n+ 1 Quaternion.kt\ncom/google/android/filament/utils/Quaternion\n*L\n103#1:344\n226#1:345,5\n226#1:350\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/google/android/filament/utils/Quaternion$Companion;


# instance fields
.field private w:F

.field private x:F

.field private y:F

.field private z:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/filament/utils/Quaternion$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/filament/utils/Quaternion$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/google/android/filament/utils/Quaternion;->Companion:Lcom/google/android/filament/utils/Quaternion$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(FFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/filament/utils/Quaternion;->x:F

    iput p2, p0, Lcom/google/android/filament/utils/Quaternion;->y:F

    iput p3, p0, Lcom/google/android/filament/utils/Quaternion;->z:F

    iput p4, p0, Lcom/google/android/filament/utils/Quaternion;->w:F

    return-void
.end method

.method public synthetic constructor <init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/filament/utils/Float3;F)V
    .locals 2

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result p1

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/filament/utils/Float3;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/google/android/filament/utils/Quaternion;-><init>(Lcom/google/android/filament/utils/Float3;F)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/filament/utils/Float4;)V
    .locals 3

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result p1

    invoke-direct {p0, v0, v1, v2, p1}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/filament/utils/Quaternion;)V
    .locals 3

    const-string v0, "q"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p1, Lcom/google/android/filament/utils/Quaternion;->x:F

    iget v1, p1, Lcom/google/android/filament/utils/Quaternion;->y:F

    iget v2, p1, Lcom/google/android/filament/utils/Quaternion;->z:F

    iget p1, p1, Lcom/google/android/filament/utils/Quaternion;->w:F

    invoke-direct {p0, v0, v1, v2, p1}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/google/android/filament/utils/Quaternion;FFFFILjava/lang/Object;)Lcom/google/android/filament/utils/Quaternion;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/google/android/filament/utils/Quaternion;->x:F

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/google/android/filament/utils/Quaternion;->y:F

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/google/android/filament/utils/Quaternion;->z:F

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lcom/google/android/filament/utils/Quaternion;->w:F

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/filament/utils/Quaternion;->copy(FFFF)Lcom/google/android/filament/utils/Quaternion;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/Quaternion;->x:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/Quaternion;->y:F

    return v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/Quaternion;->z:F

    return v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/Quaternion;->w:F

    return v0
.end method

.method public final copy(FFFF)Lcom/google/android/filament/utils/Quaternion;
    .locals 1

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v0
.end method

.method public final div(F)Lcom/google/android/filament/utils/Quaternion;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    div-float/2addr v1, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    div-float/2addr v2, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    div-float/2addr v3, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v4

    div-float/2addr v4, p1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/filament/utils/Quaternion;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/filament/utils/Quaternion;

    iget v1, p0, Lcom/google/android/filament/utils/Quaternion;->x:F

    iget v3, p1, Lcom/google/android/filament/utils/Quaternion;->x:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/google/android/filament/utils/Quaternion;->y:F

    iget v3, p1, Lcom/google/android/filament/utils/Quaternion;->y:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/google/android/filament/utils/Quaternion;->z:F

    iget v3, p1, Lcom/google/android/filament/utils/Quaternion;->z:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/google/android/filament/utils/Quaternion;->w:F

    iget p1, p1, Lcom/google/android/filament/utils/Quaternion;->w:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final get(I)F
    .locals 1

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    iget p1, p0, Lcom/google/android/filament/utils/Quaternion;->w:F

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "index must be in 0..3"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget p1, p0, Lcom/google/android/filament/utils/Quaternion;->z:F

    goto :goto_0

    :cond_2
    iget p1, p0, Lcom/google/android/filament/utils/Quaternion;->y:F

    goto :goto_0

    :cond_3
    iget p1, p0, Lcom/google/android/filament/utils/Quaternion;->x:F

    :goto_0
    return p1
.end method

.method public final get(Lcom/google/android/filament/utils/QuaternionComponent;)F
    .locals 1

    const-string v0, "index"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/filament/utils/Quaternion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    iget p1, p0, Lcom/google/android/filament/utils/Quaternion;->w:F

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    iget p1, p0, Lcom/google/android/filament/utils/Quaternion;->z:F

    goto :goto_0

    :cond_2
    iget p1, p0, Lcom/google/android/filament/utils/Quaternion;->y:F

    goto :goto_0

    :cond_3
    iget p1, p0, Lcom/google/android/filament/utils/Quaternion;->x:F

    :goto_0
    return p1
.end method

.method public final get(III)Lcom/google/android/filament/utils/Float3;
    .locals 1

    new-instance v0, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Quaternion;->get(I)F

    move-result p1

    invoke-virtual {p0, p2}, Lcom/google/android/filament/utils/Quaternion;->get(I)F

    move-result p2

    invoke-virtual {p0, p3}, Lcom/google/android/filament/utils/Quaternion;->get(I)F

    move-result p3

    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    return-object v0
.end method

.method public final get(Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;)Lcom/google/android/filament/utils/Float3;
    .locals 1

    const-string v0, "index1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index3"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Quaternion;->get(Lcom/google/android/filament/utils/QuaternionComponent;)F

    move-result p1

    invoke-virtual {p0, p2}, Lcom/google/android/filament/utils/Quaternion;->get(Lcom/google/android/filament/utils/QuaternionComponent;)F

    move-result p2

    invoke-virtual {p0, p3}, Lcom/google/android/filament/utils/Quaternion;->get(Lcom/google/android/filament/utils/QuaternionComponent;)F

    move-result p3

    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    return-object v0
.end method

.method public final get(IIII)Lcom/google/android/filament/utils/Quaternion;
    .locals 1

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Quaternion;->get(I)F

    move-result p1

    invoke-virtual {p0, p2}, Lcom/google/android/filament/utils/Quaternion;->get(I)F

    move-result p2

    invoke-virtual {p0, p3}, Lcom/google/android/filament/utils/Quaternion;->get(I)F

    move-result p3

    invoke-virtual {p0, p4}, Lcom/google/android/filament/utils/Quaternion;->get(I)F

    move-result p4

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v0
.end method

.method public final get(Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;)Lcom/google/android/filament/utils/Quaternion;
    .locals 1

    const-string v0, "index1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index3"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index4"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Quaternion;->get(Lcom/google/android/filament/utils/QuaternionComponent;)F

    move-result p1

    invoke-virtual {p0, p2}, Lcom/google/android/filament/utils/Quaternion;->get(Lcom/google/android/filament/utils/QuaternionComponent;)F

    move-result p2

    invoke-virtual {p0, p3}, Lcom/google/android/filament/utils/Quaternion;->get(Lcom/google/android/filament/utils/QuaternionComponent;)F

    move-result p3

    invoke-virtual {p0, p4}, Lcom/google/android/filament/utils/Quaternion;->get(Lcom/google/android/filament/utils/QuaternionComponent;)F

    move-result p4

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v0
.end method

.method public final getImaginary()Lcom/google/android/filament/utils/Float3;
    .locals 4

    new-instance v0, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    return-object v0
.end method

.method public final getReal()F
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v0

    return v0
.end method

.method public final getW()F
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/Quaternion;->w:F

    return v0
.end method

.method public final getX()F
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/Quaternion;->x:F

    return v0
.end method

.method public final getXyz()Lcom/google/android/filament/utils/Float3;
    .locals 4

    new-instance v0, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    return-object v0
.end method

.method public final getXyzw()Lcom/google/android/filament/utils/Float4;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final getY()F
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/Quaternion;->y:F

    return v0
.end method

.method public final getZ()F
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/Quaternion;->z:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/google/android/filament/utils/Quaternion;->x:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/google/android/filament/utils/Quaternion;->y:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/google/android/filament/utils/Quaternion;->z:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/google/android/filament/utils/Quaternion;->w:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final invoke(I)F
    .locals 0

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Quaternion;->get(I)F

    move-result p1

    return p1
.end method

.method public final minus(F)Lcom/google/android/filament/utils/Quaternion;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    sub-float/2addr v1, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    sub-float/2addr v2, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    sub-float/2addr v3, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v4

    sub-float/2addr v4, p1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v0
.end method

.method public final minus(Lcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Quaternion;
    .locals 5

    const-string v0, "q"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v3

    sub-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v4

    sub-float/2addr v3, v4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p1

    sub-float/2addr v4, p1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v0
.end method

.method public final plus(F)Lcom/google/android/filament/utils/Quaternion;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    add-float/2addr v1, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    add-float/2addr v2, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    add-float/2addr v3, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v4

    add-float/2addr v4, p1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v0
.end method

.method public final plus(Lcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Quaternion;
    .locals 5

    const-string v0, "q"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v3

    add-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v4

    add-float/2addr v3, v4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result p1

    add-float/2addr v4, p1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v0
.end method

.method public final set(IF)V
    .locals 1

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    iput p2, p0, Lcom/google/android/filament/utils/Quaternion;->w:F

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "index must be in 0..3"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput p2, p0, Lcom/google/android/filament/utils/Quaternion;->z:F

    goto :goto_0

    :cond_2
    iput p2, p0, Lcom/google/android/filament/utils/Quaternion;->y:F

    goto :goto_0

    :cond_3
    iput p2, p0, Lcom/google/android/filament/utils/Quaternion;->x:F

    :goto_0
    return-void
.end method

.method public final set(IIF)V
    .locals 0

    invoke-virtual {p0, p1, p3}, Lcom/google/android/filament/utils/Quaternion;->set(IF)V

    invoke-virtual {p0, p2, p3}, Lcom/google/android/filament/utils/Quaternion;->set(IF)V

    return-void
.end method

.method public final set(IIIF)V
    .locals 0

    invoke-virtual {p0, p1, p4}, Lcom/google/android/filament/utils/Quaternion;->set(IF)V

    invoke-virtual {p0, p2, p4}, Lcom/google/android/filament/utils/Quaternion;->set(IF)V

    invoke-virtual {p0, p3, p4}, Lcom/google/android/filament/utils/Quaternion;->set(IF)V

    return-void
.end method

.method public final set(IIIIF)V
    .locals 0

    invoke-virtual {p0, p1, p5}, Lcom/google/android/filament/utils/Quaternion;->set(IF)V

    invoke-virtual {p0, p2, p5}, Lcom/google/android/filament/utils/Quaternion;->set(IF)V

    invoke-virtual {p0, p3, p5}, Lcom/google/android/filament/utils/Quaternion;->set(IF)V

    invoke-virtual {p0, p4, p5}, Lcom/google/android/filament/utils/Quaternion;->set(IF)V

    return-void
.end method

.method public final set(Lcom/google/android/filament/utils/QuaternionComponent;F)V
    .locals 1

    const-string v0, "index"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/filament/utils/Quaternion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    iput p2, p0, Lcom/google/android/filament/utils/Quaternion;->w:F

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    iput p2, p0, Lcom/google/android/filament/utils/Quaternion;->z:F

    goto :goto_0

    :cond_2
    iput p2, p0, Lcom/google/android/filament/utils/Quaternion;->y:F

    goto :goto_0

    :cond_3
    iput p2, p0, Lcom/google/android/filament/utils/Quaternion;->x:F

    :goto_0
    return-void
.end method

.method public final set(Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;F)V
    .locals 1

    const-string v0, "index1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p3}, Lcom/google/android/filament/utils/Quaternion;->set(Lcom/google/android/filament/utils/QuaternionComponent;F)V

    invoke-virtual {p0, p2, p3}, Lcom/google/android/filament/utils/Quaternion;->set(Lcom/google/android/filament/utils/QuaternionComponent;F)V

    return-void
.end method

.method public final set(Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;F)V
    .locals 1

    const-string v0, "index1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index3"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p4}, Lcom/google/android/filament/utils/Quaternion;->set(Lcom/google/android/filament/utils/QuaternionComponent;F)V

    invoke-virtual {p0, p2, p4}, Lcom/google/android/filament/utils/Quaternion;->set(Lcom/google/android/filament/utils/QuaternionComponent;F)V

    invoke-virtual {p0, p3, p4}, Lcom/google/android/filament/utils/Quaternion;->set(Lcom/google/android/filament/utils/QuaternionComponent;F)V

    return-void
.end method

.method public final set(Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;F)V
    .locals 1

    const-string v0, "index1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index3"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index4"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p5}, Lcom/google/android/filament/utils/Quaternion;->set(Lcom/google/android/filament/utils/QuaternionComponent;F)V

    invoke-virtual {p0, p2, p5}, Lcom/google/android/filament/utils/Quaternion;->set(Lcom/google/android/filament/utils/QuaternionComponent;F)V

    invoke-virtual {p0, p3, p5}, Lcom/google/android/filament/utils/Quaternion;->set(Lcom/google/android/filament/utils/QuaternionComponent;F)V

    invoke-virtual {p0, p4, p5}, Lcom/google/android/filament/utils/Quaternion;->set(Lcom/google/android/filament/utils/QuaternionComponent;F)V

    return-void
.end method

.method public final setImaginary(Lcom/google/android/filament/utils/Float3;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Quaternion;->setX(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Quaternion;->setY(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Quaternion;->setZ(F)V

    return-void
.end method

.method public final setReal(F)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Quaternion;->setW(F)V

    return-void
.end method

.method public final setW(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/filament/utils/Quaternion;->w:F

    return-void
.end method

.method public final setX(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/filament/utils/Quaternion;->x:F

    return-void
.end method

.method public final setXyz(Lcom/google/android/filament/utils/Float3;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Quaternion;->setX(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Quaternion;->setY(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Quaternion;->setZ(F)V

    return-void
.end method

.method public final setXyzw(Lcom/google/android/filament/utils/Float4;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Quaternion;->setX(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Quaternion;->setY(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Quaternion;->setZ(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Quaternion;->setW(F)V

    return-void
.end method

.method public final setY(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/filament/utils/Quaternion;->y:F

    return-void
.end method

.method public final setZ(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/filament/utils/Quaternion;->z:F

    return-void
.end method

.method public final times(Lcom/google/android/filament/utils/Float3;)Lcom/google/android/filament/utils/Float3;
    .locals 8

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/filament/utils/Quaternion;-><init>(Lcom/google/android/filament/utils/Float3;F)V

    new-instance p1, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v2

    mul-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v3

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v3

    mul-float/2addr v2, v3

    sub-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v3

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v4

    mul-float/2addr v3, v4

    sub-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v3

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v3

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v4

    mul-float/2addr v3, v4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v4

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v4

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v5

    mul-float/2addr v4, v5

    sub-float/2addr v3, v4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v4

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v4

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v5

    mul-float/2addr v4, v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v5

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v6

    mul-float/2addr v5, v6

    sub-float/2addr v4, v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v5

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v6

    mul-float/2addr v5, v6

    sub-float/2addr v4, v5

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v5

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v0

    mul-float/2addr v5, v0

    sub-float/2addr v4, v5

    invoke-direct {p1, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    invoke-static {p0}, Lcom/google/android/filament/utils/QuaternionKt;->inverse(Lcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Quaternion;

    move-result-object v0

    new-instance v1, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v3

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v3

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v4

    mul-float/2addr v3, v4

    sub-float/2addr v2, v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v3

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v4

    mul-float/2addr v3, v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v4

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v5

    mul-float/2addr v4, v5

    sub-float/2addr v3, v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v4

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v4

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v4

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v5

    mul-float/2addr v4, v5

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v5

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v5

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v6

    mul-float/2addr v5, v6

    sub-float/2addr v4, v5

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v5

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v5

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v6

    mul-float/2addr v5, v6

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v6

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v7

    mul-float/2addr v6, v7

    sub-float/2addr v5, v6

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v6

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v7

    mul-float/2addr v6, v7

    sub-float/2addr v5, v6

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result p1

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v0

    mul-float/2addr p1, v0

    sub-float/2addr v5, p1

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    new-instance p1, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v0

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v1

    invoke-direct {p1, v0, v2, v1}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    return-object p1
.end method

.method public final times(F)Lcom/google/android/filament/utils/Quaternion;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v1

    mul-float/2addr v1, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v2

    mul-float/2addr v2, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v3

    mul-float/2addr v3, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v4

    mul-float/2addr v4, p1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v0
.end method

.method public final times(Lcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Quaternion;
    .locals 7

    const-string v0, "q"

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

    move-result v5

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result p1

    mul-float/2addr v5, p1

    sub-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v0
.end method

.method public final toEulerAngles()Lcom/google/android/filament/utils/Float3;
    .locals 1

    invoke-static {p0}, Lcom/google/android/filament/utils/QuaternionKt;->eulerAngles(Lcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Float3;

    move-result-object v0

    return-object v0
.end method

.method public final toFloatArray()[F
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [F

    const/4 v1, 0x0

    iget v2, p0, Lcom/google/android/filament/utils/Quaternion;->x:F

    aput v2, v0, v1

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/filament/utils/Quaternion;->y:F

    aput v2, v0, v1

    const/4 v1, 0x2

    iget v2, p0, Lcom/google/android/filament/utils/Quaternion;->z:F

    aput v2, v0, v1

    const/4 v1, 0x3

    iget v2, p0, Lcom/google/android/filament/utils/Quaternion;->w:F

    aput v2, v0, v1

    return-object v0
.end method

.method public final toMatrix()Lcom/google/android/filament/utils/Mat4;
    .locals 1

    invoke-static {p0}, Lcom/google/android/filament/utils/MatrixKt;->rotation(Lcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Mat4;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Quaternion(x="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/filament/utils/Quaternion;->x:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", y="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/filament/utils/Quaternion;->y:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", z="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/filament/utils/Quaternion;->z:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", w="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/filament/utils/Quaternion;->w:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final transform(Lkotlin/jvm/functions/Function1;)Lcom/google/android/filament/utils/Quaternion;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;)",
            "Lcom/google/android/filament/utils/Quaternion;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Quaternion;->setX(F)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getY()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Quaternion;->setY(F)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getZ()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Quaternion;->setZ(F)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Quaternion;->getW()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Quaternion;->setW(F)V

    return-object p0
.end method

.method public final unaryMinus()Lcom/google/android/filament/utils/Quaternion;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Quaternion;

    iget v1, p0, Lcom/google/android/filament/utils/Quaternion;->x:F

    neg-float v1, v1

    iget v2, p0, Lcom/google/android/filament/utils/Quaternion;->y:F

    neg-float v2, v2

    iget v3, p0, Lcom/google/android/filament/utils/Quaternion;->z:F

    neg-float v3, v3

    iget v4, p0, Lcom/google/android/filament/utils/Quaternion;->w:F

    neg-float v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Quaternion;-><init>(FFFF)V

    return-object v0
.end method
