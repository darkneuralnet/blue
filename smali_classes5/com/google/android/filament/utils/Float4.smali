.class public final Lcom/google/android/filament/utils/Float4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/filament/utils/Float4$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008O\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B#\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0008B\u0019\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nB\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\u000bB-\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J1\u0010U\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\t\u0010V\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010W\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010W\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0086\nJ\u0011\u0010W\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010W\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0013\u0010X\u001a\u00020Y2\u0008\u0010Z\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0011\u0010[\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020]H\u0086\u0002J\u0019\u0010[\u001a\u00020\u00052\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020]H\u0086\u0002J!\u0010[\u001a\u00020\t2\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020]2\u0006\u0010`\u001a\u00020]H\u0086\u0002J)\u0010[\u001a\u00020\u00002\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020]2\u0006\u0010`\u001a\u00020]2\u0006\u0010a\u001a\u00020]H\u0086\u0002J\u0011\u0010[\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020bH\u0086\u0002J\u0019\u0010[\u001a\u00020\u00052\u0006\u0010^\u001a\u00020b2\u0006\u0010_\u001a\u00020bH\u0086\u0002J!\u0010[\u001a\u00020\t2\u0006\u0010^\u001a\u00020b2\u0006\u0010_\u001a\u00020b2\u0006\u0010`\u001a\u00020bH\u0086\u0002J)\u0010[\u001a\u00020\u00002\u0006\u0010^\u001a\u00020b2\u0006\u0010_\u001a\u00020b2\u0006\u0010`\u001a\u00020b2\u0006\u0010a\u001a\u00020bH\u0086\u0002J\t\u0010c\u001a\u00020bH\u00d6\u0001J\t\u0010d\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010e\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020bH\u0086\nJ\u0011\u0010f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0086\nJ\u0011\u0010f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0011\u0010g\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010g\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0086\nJ\u0011\u0010g\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010g\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ1\u0010h\u001a\u00020i2\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020]2\u0006\u0010`\u001a\u00020]2\u0006\u0010a\u001a\u00020]2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J)\u0010h\u001a\u00020i2\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020]2\u0006\u0010`\u001a\u00020]2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J!\u0010h\u001a\u00020i2\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020]2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0019\u0010h\u001a\u00020i2\u0006\u0010\\\u001a\u00020]2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0019\u0010h\u001a\u00020i2\u0006\u0010\\\u001a\u00020b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J!\u0010h\u001a\u00020i2\u0006\u0010^\u001a\u00020b2\u0006\u0010_\u001a\u00020b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J)\u0010h\u001a\u00020i2\u0006\u0010^\u001a\u00020b2\u0006\u0010_\u001a\u00020b2\u0006\u0010`\u001a\u00020b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J1\u0010h\u001a\u00020i2\u0006\u0010^\u001a\u00020b2\u0006\u0010_\u001a\u00020b2\u0006\u0010`\u001a\u00020b2\u0006\u0010a\u001a\u00020b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010j\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010j\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0086\nJ\u0011\u0010j\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010j\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0006\u0010k\u001a\u00020lJ\t\u0010m\u001a\u00020nH\u00d6\u0001J \u0010o\u001a\u00020\u00002\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030qH\u0086\u0008\u00f8\u0001\u0000J\t\u0010r\u001a\u00020\u0000H\u0086\u0002R&\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0004R&\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0015\u0010\u0012\"\u0004\u0008\u0016\u0010\u0004R&\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0018\u0010\u0012\"\u0004\u0008\u0019\u0010\u0004R&\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001b\u0010\u0012\"\u0004\u0008\u001c\u0010\u0004R&\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001e\u0010\u0012\"\u0004\u0008\u001f\u0010\u0004R&\u0010 \u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008!\u0010\u0012\"\u0004\u0008\"\u0010\u0004R&\u0010#\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R&\u0010(\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R&\u0010-\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00008\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008.\u0010/\"\u0004\u00080\u0010\u000bR&\u00101\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u00082\u0010\u0012\"\u0004\u00083\u0010\u0004R&\u00104\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u00085\u0010%\"\u0004\u00086\u0010\'R&\u00107\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u00088\u0010*\"\u0004\u00089\u0010,R&\u0010:\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00008\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008;\u0010/\"\u0004\u0008<\u0010\u000bR&\u0010=\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008>\u0010\u0012\"\u0004\u0008?\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008@\u0010\u0012\"\u0004\u0008A\u0010\u0004R\u001a\u0010\u000c\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008B\u0010\u0012\"\u0004\u0008C\u0010\u0004R&\u0010D\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008E\u0010%\"\u0004\u0008F\u0010\'R&\u0010G\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008H\u0010*\"\u0004\u0008I\u0010,R&\u0010J\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00008\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008K\u0010/\"\u0004\u0008L\u0010\u000bR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008M\u0010\u0012\"\u0004\u0008N\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008O\u0010\u0012\"\u0004\u0008P\u0010\u0004\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006s"
    }
    d2 = {
        "Lcom/google/android/filament/utils/Float4;",
        "",
        "v",
        "",
        "(F)V",
        "Lcom/google/android/filament/utils/Float2;",
        "z",
        "w",
        "(Lcom/google/android/filament/utils/Float2;FF)V",
        "Lcom/google/android/filament/utils/Float3;",
        "(Lcom/google/android/filament/utils/Float3;F)V",
        "(Lcom/google/android/filament/utils/Float4;)V",
        "x",
        "y",
        "(FFFF)V",
        "value",
        "a",
        "getA",
        "()F",
        "setA",
        "b",
        "getB",
        "setB",
        "g",
        "getG",
        "setG",
        "p",
        "getP",
        "setP",
        "q",
        "getQ",
        "setQ",
        "r",
        "getR",
        "setR",
        "rg",
        "getRg",
        "()Lcom/google/android/filament/utils/Float2;",
        "setRg",
        "(Lcom/google/android/filament/utils/Float2;)V",
        "rgb",
        "getRgb",
        "()Lcom/google/android/filament/utils/Float3;",
        "setRgb",
        "(Lcom/google/android/filament/utils/Float3;)V",
        "rgba",
        "getRgba",
        "()Lcom/google/android/filament/utils/Float4;",
        "setRgba",
        "s",
        "getS",
        "setS",
        "st",
        "getSt",
        "setSt",
        "stp",
        "getStp",
        "setStp",
        "stpq",
        "getStpq",
        "setStpq",
        "t",
        "getT",
        "setT",
        "getW",
        "setW",
        "getX",
        "setX",
        "xy",
        "getXy",
        "setXy",
        "xyz",
        "getXyz",
        "setXyz",
        "xyzw",
        "getXyzw",
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
        "dec",
        "div",
        "equals",
        "",
        "other",
        "get",
        "index",
        "Lcom/google/android/filament/utils/VectorComponent;",
        "index1",
        "index2",
        "index3",
        "index4",
        "",
        "hashCode",
        "inc",
        "invoke",
        "minus",
        "plus",
        "set",
        "",
        "times",
        "toFloatArray",
        "",
        "toString",
        "",
        "transform",
        "block",
        "Lkotlin/Function1;",
        "unaryMinus",
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


# instance fields
.field private w:F

.field private x:F

.field private y:F

.field private z:F


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/google/android/filament/utils/Float4;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(F)V
    .locals 0

    invoke-direct {p0, p1, p1, p1, p1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-void
.end method

.method public constructor <init>(FFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/filament/utils/Float4;->x:F

    iput p2, p0, Lcom/google/android/filament/utils/Float4;->y:F

    iput p3, p0, Lcom/google/android/filament/utils/Float4;->z:F

    iput p4, p0, Lcom/google/android/filament/utils/Float4;->w:F

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
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/filament/utils/Float2;FF)V
    .locals 1

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result p1

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/filament/utils/Float2;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move p3, v0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/filament/utils/Float4;-><init>(Lcom/google/android/filament/utils/Float2;FF)V

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

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/filament/utils/Float3;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/google/android/filament/utils/Float4;-><init>(Lcom/google/android/filament/utils/Float3;F)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/filament/utils/Float4;)V
    .locals 3

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p1, Lcom/google/android/filament/utils/Float4;->x:F

    iget v1, p1, Lcom/google/android/filament/utils/Float4;->y:F

    iget v2, p1, Lcom/google/android/filament/utils/Float4;->z:F

    iget p1, p1, Lcom/google/android/filament/utils/Float4;->w:F

    invoke-direct {p0, v0, v1, v2, p1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/google/android/filament/utils/Float4;FFFFILjava/lang/Object;)Lcom/google/android/filament/utils/Float4;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/google/android/filament/utils/Float4;->x:F

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/google/android/filament/utils/Float4;->y:F

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/google/android/filament/utils/Float4;->z:F

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lcom/google/android/filament/utils/Float4;->w:F

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/filament/utils/Float4;->copy(FFFF)Lcom/google/android/filament/utils/Float4;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/Float4;->x:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/Float4;->y:F

    return v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/Float4;->z:F

    return v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/Float4;->w:F

    return v0
.end method

.method public final copy(FFFF)Lcom/google/android/filament/utils/Float4;
    .locals 1

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final dec()Lcom/google/android/filament/utils/Float4;
    .locals 6

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    iget v1, p0, Lcom/google/android/filament/utils/Float4;->x:F

    const/high16 v2, -0x40800000    # -1.0f

    add-float v3, v1, v2

    iput v3, p0, Lcom/google/android/filament/utils/Float4;->x:F

    iget v3, p0, Lcom/google/android/filament/utils/Float4;->y:F

    add-float v4, v3, v2

    iput v4, p0, Lcom/google/android/filament/utils/Float4;->y:F

    iget v4, p0, Lcom/google/android/filament/utils/Float4;->z:F

    add-float v5, v4, v2

    iput v5, p0, Lcom/google/android/filament/utils/Float4;->z:F

    iget v5, p0, Lcom/google/android/filament/utils/Float4;->w:F

    add-float/2addr v2, v5

    iput v2, p0, Lcom/google/android/filament/utils/Float4;->w:F

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final div(F)Lcom/google/android/filament/utils/Float4;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    div-float/2addr v1, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    div-float/2addr v2, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    div-float/2addr v3, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v4

    div-float/2addr v4, p1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final div(Lcom/google/android/filament/utils/Float2;)Lcom/google/android/filament/utils/Float4;
    .locals 4

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v2

    div-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result p1

    div-float/2addr v2, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v3

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final div(Lcom/google/android/filament/utils/Float3;)Lcom/google/android/filament/utils/Float4;
    .locals 4

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v2

    div-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v3

    div-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result p1

    div-float/2addr v3, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final div(Lcom/google/android/filament/utils/Float4;)Lcom/google/android/filament/utils/Float4;
    .locals 5

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v2

    div-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v3

    div-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v4

    div-float/2addr v3, v4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result p1

    div-float/2addr v4, p1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/filament/utils/Float4;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/filament/utils/Float4;

    iget v1, p0, Lcom/google/android/filament/utils/Float4;->x:F

    iget v3, p1, Lcom/google/android/filament/utils/Float4;->x:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/google/android/filament/utils/Float4;->y:F

    iget v3, p1, Lcom/google/android/filament/utils/Float4;->y:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/google/android/filament/utils/Float4;->z:F

    iget v3, p1, Lcom/google/android/filament/utils/Float4;->z:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/google/android/filament/utils/Float4;->w:F

    iget p1, p1, Lcom/google/android/filament/utils/Float4;->w:F

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

    iget p1, p0, Lcom/google/android/filament/utils/Float4;->w:F

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "index must be in 0..3"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget p1, p0, Lcom/google/android/filament/utils/Float4;->z:F

    goto :goto_0

    :cond_2
    iget p1, p0, Lcom/google/android/filament/utils/Float4;->y:F

    goto :goto_0

    :cond_3
    iget p1, p0, Lcom/google/android/filament/utils/Float4;->x:F

    :goto_0
    return p1
.end method

.method public final get(Lcom/google/android/filament/utils/VectorComponent;)F
    .locals 1

    const-string v0, "index"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/filament/utils/Float4$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    iget p1, p0, Lcom/google/android/filament/utils/Float4;->w:F

    goto :goto_0

    :pswitch_1
    iget p1, p0, Lcom/google/android/filament/utils/Float4;->z:F

    goto :goto_0

    :pswitch_2
    iget p1, p0, Lcom/google/android/filament/utils/Float4;->y:F

    goto :goto_0

    :pswitch_3
    iget p1, p0, Lcom/google/android/filament/utils/Float4;->x:F

    :goto_0
    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final get(II)Lcom/google/android/filament/utils/Float2;
    .locals 1

    new-instance v0, Lcom/google/android/filament/utils/Float2;

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->get(I)F

    move-result p1

    invoke-virtual {p0, p2}, Lcom/google/android/filament/utils/Float4;->get(I)F

    move-result p2

    invoke-direct {v0, p1, p2}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    return-object v0
.end method

.method public final get(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Float2;
    .locals 1

    const-string v0, "index1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Float2;

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->get(Lcom/google/android/filament/utils/VectorComponent;)F

    move-result p1

    invoke-virtual {p0, p2}, Lcom/google/android/filament/utils/Float4;->get(Lcom/google/android/filament/utils/VectorComponent;)F

    move-result p2

    invoke-direct {v0, p1, p2}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    return-object v0
.end method

.method public final get(III)Lcom/google/android/filament/utils/Float3;
    .locals 1

    new-instance v0, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->get(I)F

    move-result p1

    invoke-virtual {p0, p2}, Lcom/google/android/filament/utils/Float4;->get(I)F

    move-result p2

    invoke-virtual {p0, p3}, Lcom/google/android/filament/utils/Float4;->get(I)F

    move-result p3

    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    return-object v0
.end method

.method public final get(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Float3;
    .locals 1

    const-string v0, "index1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index3"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->get(Lcom/google/android/filament/utils/VectorComponent;)F

    move-result p1

    invoke-virtual {p0, p2}, Lcom/google/android/filament/utils/Float4;->get(Lcom/google/android/filament/utils/VectorComponent;)F

    move-result p2

    invoke-virtual {p0, p3}, Lcom/google/android/filament/utils/Float4;->get(Lcom/google/android/filament/utils/VectorComponent;)F

    move-result p3

    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    return-object v0
.end method

.method public final get(IIII)Lcom/google/android/filament/utils/Float4;
    .locals 1

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->get(I)F

    move-result p1

    invoke-virtual {p0, p2}, Lcom/google/android/filament/utils/Float4;->get(I)F

    move-result p2

    invoke-virtual {p0, p3}, Lcom/google/android/filament/utils/Float4;->get(I)F

    move-result p3

    invoke-virtual {p0, p4}, Lcom/google/android/filament/utils/Float4;->get(I)F

    move-result p4

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final get(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Float4;
    .locals 1

    const-string v0, "index1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index3"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index4"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->get(Lcom/google/android/filament/utils/VectorComponent;)F

    move-result p1

    invoke-virtual {p0, p2}, Lcom/google/android/filament/utils/Float4;->get(Lcom/google/android/filament/utils/VectorComponent;)F

    move-result p2

    invoke-virtual {p0, p3}, Lcom/google/android/filament/utils/Float4;->get(Lcom/google/android/filament/utils/VectorComponent;)F

    move-result p3

    invoke-virtual {p0, p4}, Lcom/google/android/filament/utils/Float4;->get(Lcom/google/android/filament/utils/VectorComponent;)F

    move-result p4

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final getA()F
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v0

    return v0
.end method

.method public final getB()F
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v0

    return v0
.end method

.method public final getG()F
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v0

    return v0
.end method

.method public final getP()F
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v0

    return v0
.end method

.method public final getQ()F
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v0

    return v0
.end method

.method public final getR()F
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v0

    return v0
.end method

.method public final getRg()Lcom/google/android/filament/utils/Float2;
    .locals 3

    new-instance v0, Lcom/google/android/filament/utils/Float2;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    return-object v0
.end method

.method public final getRgb()Lcom/google/android/filament/utils/Float3;
    .locals 4

    new-instance v0, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    return-object v0
.end method

.method public final getRgba()Lcom/google/android/filament/utils/Float4;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final getS()F
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v0

    return v0
.end method

.method public final getSt()Lcom/google/android/filament/utils/Float2;
    .locals 3

    new-instance v0, Lcom/google/android/filament/utils/Float2;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    return-object v0
.end method

.method public final getStp()Lcom/google/android/filament/utils/Float3;
    .locals 4

    new-instance v0, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    return-object v0
.end method

.method public final getStpq()Lcom/google/android/filament/utils/Float4;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final getT()F
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v0

    return v0
.end method

.method public final getW()F
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/Float4;->w:F

    return v0
.end method

.method public final getX()F
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/Float4;->x:F

    return v0
.end method

.method public final getXy()Lcom/google/android/filament/utils/Float2;
    .locals 3

    new-instance v0, Lcom/google/android/filament/utils/Float2;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    return-object v0
.end method

.method public final getXyz()Lcom/google/android/filament/utils/Float3;
    .locals 4

    new-instance v0, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    return-object v0
.end method

.method public final getXyzw()Lcom/google/android/filament/utils/Float4;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final getY()F
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/Float4;->y:F

    return v0
.end method

.method public final getZ()F
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/Float4;->z:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/google/android/filament/utils/Float4;->x:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/google/android/filament/utils/Float4;->y:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/google/android/filament/utils/Float4;->z:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/google/android/filament/utils/Float4;->w:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final inc()Lcom/google/android/filament/utils/Float4;
    .locals 6

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    iget v1, p0, Lcom/google/android/filament/utils/Float4;->x:F

    const/high16 v2, 0x3f800000    # 1.0f

    add-float v3, v1, v2

    iput v3, p0, Lcom/google/android/filament/utils/Float4;->x:F

    iget v3, p0, Lcom/google/android/filament/utils/Float4;->y:F

    add-float v4, v3, v2

    iput v4, p0, Lcom/google/android/filament/utils/Float4;->y:F

    iget v4, p0, Lcom/google/android/filament/utils/Float4;->z:F

    add-float v5, v4, v2

    iput v5, p0, Lcom/google/android/filament/utils/Float4;->z:F

    iget v5, p0, Lcom/google/android/filament/utils/Float4;->w:F

    add-float/2addr v2, v5

    iput v2, p0, Lcom/google/android/filament/utils/Float4;->w:F

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final invoke(I)F
    .locals 0

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->get(I)F

    move-result p1

    return p1
.end method

.method public final minus(F)Lcom/google/android/filament/utils/Float4;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    sub-float/2addr v1, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    sub-float/2addr v2, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    sub-float/2addr v3, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v4

    sub-float/2addr v4, p1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final minus(Lcom/google/android/filament/utils/Float2;)Lcom/google/android/filament/utils/Float4;
    .locals 4

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result p1

    sub-float/2addr v2, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v3

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final minus(Lcom/google/android/filament/utils/Float3;)Lcom/google/android/filament/utils/Float4;
    .locals 4

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v3

    sub-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result p1

    sub-float/2addr v3, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final minus(Lcom/google/android/filament/utils/Float4;)Lcom/google/android/filament/utils/Float4;
    .locals 5

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v3

    sub-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v4

    sub-float/2addr v3, v4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result p1

    sub-float/2addr v4, p1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final plus(F)Lcom/google/android/filament/utils/Float4;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    add-float/2addr v1, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    add-float/2addr v2, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    add-float/2addr v3, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v4

    add-float/2addr v4, p1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final plus(Lcom/google/android/filament/utils/Float2;)Lcom/google/android/filament/utils/Float4;
    .locals 4

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result p1

    add-float/2addr v2, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v3

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final plus(Lcom/google/android/filament/utils/Float3;)Lcom/google/android/filament/utils/Float4;
    .locals 4

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v3

    add-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result p1

    add-float/2addr v3, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final plus(Lcom/google/android/filament/utils/Float4;)Lcom/google/android/filament/utils/Float4;
    .locals 5

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v3

    add-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v4

    add-float/2addr v3, v4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result p1

    add-float/2addr v4, p1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

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

    iput p2, p0, Lcom/google/android/filament/utils/Float4;->w:F

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "index must be in 0..3"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput p2, p0, Lcom/google/android/filament/utils/Float4;->z:F

    goto :goto_0

    :cond_2
    iput p2, p0, Lcom/google/android/filament/utils/Float4;->y:F

    goto :goto_0

    :cond_3
    iput p2, p0, Lcom/google/android/filament/utils/Float4;->x:F

    :goto_0
    return-void
.end method

.method public final set(IIF)V
    .locals 0

    invoke-virtual {p0, p1, p3}, Lcom/google/android/filament/utils/Float4;->set(IF)V

    invoke-virtual {p0, p2, p3}, Lcom/google/android/filament/utils/Float4;->set(IF)V

    return-void
.end method

.method public final set(IIIF)V
    .locals 0

    invoke-virtual {p0, p1, p4}, Lcom/google/android/filament/utils/Float4;->set(IF)V

    invoke-virtual {p0, p2, p4}, Lcom/google/android/filament/utils/Float4;->set(IF)V

    invoke-virtual {p0, p3, p4}, Lcom/google/android/filament/utils/Float4;->set(IF)V

    return-void
.end method

.method public final set(IIIIF)V
    .locals 0

    invoke-virtual {p0, p1, p5}, Lcom/google/android/filament/utils/Float4;->set(IF)V

    invoke-virtual {p0, p2, p5}, Lcom/google/android/filament/utils/Float4;->set(IF)V

    invoke-virtual {p0, p3, p5}, Lcom/google/android/filament/utils/Float4;->set(IF)V

    invoke-virtual {p0, p4, p5}, Lcom/google/android/filament/utils/Float4;->set(IF)V

    return-void
.end method

.method public final set(Lcom/google/android/filament/utils/VectorComponent;F)V
    .locals 1

    const-string v0, "index"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/filament/utils/Float4$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    iput p2, p0, Lcom/google/android/filament/utils/Float4;->w:F

    goto :goto_0

    :pswitch_1
    iput p2, p0, Lcom/google/android/filament/utils/Float4;->z:F

    goto :goto_0

    :pswitch_2
    iput p2, p0, Lcom/google/android/filament/utils/Float4;->y:F

    goto :goto_0

    :pswitch_3
    iput p2, p0, Lcom/google/android/filament/utils/Float4;->x:F

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final set(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;F)V
    .locals 1

    const-string v0, "index1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p3}, Lcom/google/android/filament/utils/Float4;->set(Lcom/google/android/filament/utils/VectorComponent;F)V

    invoke-virtual {p0, p2, p3}, Lcom/google/android/filament/utils/Float4;->set(Lcom/google/android/filament/utils/VectorComponent;F)V

    return-void
.end method

.method public final set(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;F)V
    .locals 1

    const-string v0, "index1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index3"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p4}, Lcom/google/android/filament/utils/Float4;->set(Lcom/google/android/filament/utils/VectorComponent;F)V

    invoke-virtual {p0, p2, p4}, Lcom/google/android/filament/utils/Float4;->set(Lcom/google/android/filament/utils/VectorComponent;F)V

    invoke-virtual {p0, p3, p4}, Lcom/google/android/filament/utils/Float4;->set(Lcom/google/android/filament/utils/VectorComponent;F)V

    return-void
.end method

.method public final set(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;F)V
    .locals 1

    const-string v0, "index1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index3"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "index4"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p5}, Lcom/google/android/filament/utils/Float4;->set(Lcom/google/android/filament/utils/VectorComponent;F)V

    invoke-virtual {p0, p2, p5}, Lcom/google/android/filament/utils/Float4;->set(Lcom/google/android/filament/utils/VectorComponent;F)V

    invoke-virtual {p0, p3, p5}, Lcom/google/android/filament/utils/Float4;->set(Lcom/google/android/filament/utils/VectorComponent;F)V

    invoke-virtual {p0, p4, p5}, Lcom/google/android/filament/utils/Float4;->set(Lcom/google/android/filament/utils/VectorComponent;F)V

    return-void
.end method

.method public final setA(F)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->setW(F)V

    return-void
.end method

.method public final setB(F)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->setZ(F)V

    return-void
.end method

.method public final setG(F)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->setY(F)V

    return-void
.end method

.method public final setP(F)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->setZ(F)V

    return-void
.end method

.method public final setQ(F)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->setW(F)V

    return-void
.end method

.method public final setR(F)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->setX(F)V

    return-void
.end method

.method public final setRg(Lcom/google/android/filament/utils/Float2;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setX(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->setY(F)V

    return-void
.end method

.method public final setRgb(Lcom/google/android/filament/utils/Float3;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setX(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setY(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->setZ(F)V

    return-void
.end method

.method public final setRgba(Lcom/google/android/filament/utils/Float4;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setX(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setY(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setZ(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->setW(F)V

    return-void
.end method

.method public final setS(F)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->setX(F)V

    return-void
.end method

.method public final setSt(Lcom/google/android/filament/utils/Float2;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setX(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->setY(F)V

    return-void
.end method

.method public final setStp(Lcom/google/android/filament/utils/Float3;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setX(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setY(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->setZ(F)V

    return-void
.end method

.method public final setStpq(Lcom/google/android/filament/utils/Float4;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setX(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setY(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setZ(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->setW(F)V

    return-void
.end method

.method public final setT(F)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->setY(F)V

    return-void
.end method

.method public final setW(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/filament/utils/Float4;->w:F

    return-void
.end method

.method public final setX(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/filament/utils/Float4;->x:F

    return-void
.end method

.method public final setXy(Lcom/google/android/filament/utils/Float2;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setX(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->setY(F)V

    return-void
.end method

.method public final setXyz(Lcom/google/android/filament/utils/Float3;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setX(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setY(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->setZ(F)V

    return-void
.end method

.method public final setXyzw(Lcom/google/android/filament/utils/Float4;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setX(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setY(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setZ(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->setW(F)V

    return-void
.end method

.method public final setY(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/filament/utils/Float4;->y:F

    return-void
.end method

.method public final setZ(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/filament/utils/Float4;->z:F

    return-void
.end method

.method public final times(F)Lcom/google/android/filament/utils/Float4;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    mul-float/2addr v1, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    mul-float/2addr v2, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    mul-float/2addr v3, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v4

    mul-float/2addr v4, p1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final times(Lcom/google/android/filament/utils/Float2;)Lcom/google/android/filament/utils/Float4;
    .locals 4

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v2

    mul-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result p1

    mul-float/2addr v2, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v3

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final times(Lcom/google/android/filament/utils/Float3;)Lcom/google/android/filament/utils/Float4;
    .locals 4

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v2

    mul-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result p1

    mul-float/2addr v3, p1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final times(Lcom/google/android/filament/utils/Float4;)Lcom/google/android/filament/utils/Float4;
    .locals 5

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v2

    mul-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v4

    mul-float/2addr v3, v4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result p1

    mul-float/2addr v4, p1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final toFloatArray()[F
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [F

    const/4 v1, 0x0

    iget v2, p0, Lcom/google/android/filament/utils/Float4;->x:F

    aput v2, v0, v1

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/filament/utils/Float4;->y:F

    aput v2, v0, v1

    const/4 v1, 0x2

    iget v2, p0, Lcom/google/android/filament/utils/Float4;->z:F

    aput v2, v0, v1

    const/4 v1, 0x3

    iget v2, p0, Lcom/google/android/filament/utils/Float4;->w:F

    aput v2, v0, v1

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Float4(x="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/filament/utils/Float4;->x:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", y="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/filament/utils/Float4;->y:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", z="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/filament/utils/Float4;->z:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", w="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/filament/utils/Float4;->w:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final transform(Lkotlin/jvm/functions/Function1;)Lcom/google/android/filament/utils/Float4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;)",
            "Lcom/google/android/filament/utils/Float4;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setX(F)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setY(F)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/utils/Float4;->setZ(F)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Float4;->setW(F)V

    return-object p0
.end method

.method public final unaryMinus()Lcom/google/android/filament/utils/Float4;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    iget v1, p0, Lcom/google/android/filament/utils/Float4;->x:F

    neg-float v1, v1

    iget v2, p0, Lcom/google/android/filament/utils/Float4;->y:F

    neg-float v2, v2

    iget v3, p0, Lcom/google/android/filament/utils/Float4;->z:F

    neg-float v3, v3

    iget v4, p0, Lcom/google/android/filament/utils/Float4;->w:F

    neg-float v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method
