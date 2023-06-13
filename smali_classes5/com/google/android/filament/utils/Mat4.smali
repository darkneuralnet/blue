.class public final Lcom/google/android/filament/utils/Mat4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/filament/utils/Mat4$WhenMappings;,
        Lcom/google/android/filament/utils/Mat4$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u0000 O2\u00020\u0001:\u0001OB)\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007B\u000f\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\tB-\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000fJ\t\u0010/\u001a\u00020\u000bH\u00c6\u0003J\t\u00100\u001a\u00020\u000bH\u00c6\u0003J\t\u00101\u001a\u00020\u000bH\u00c6\u0003J\t\u00102\u001a\u00020\u000bH\u00c6\u0003J1\u00103\u001a\u00020\u00002\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000bH\u00c6\u0001J\t\u00104\u001a\u00020\u0000H\u0086\u0002J\u0011\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u000207H\u0086\u0002J\u0013\u00108\u001a\u0002092\u0008\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0011\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020=H\u0086\u0002J\u0019\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0086\u0002J\u0011\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020?H\u0086\u0002J\u0019\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020?2\u0006\u0010>\u001a\u00020?H\u0086\u0002J\t\u0010@\u001a\u00020?H\u00d6\u0001J\t\u0010A\u001a\u00020\u0000H\u0086\u0002J\u0019\u0010B\u001a\u0002072\u0006\u0010>\u001a\u00020?2\u0006\u0010<\u001a\u00020?H\u0086\u0002J!\u0010B\u001a\u00020C2\u0006\u0010>\u001a\u00020?2\u0006\u0010<\u001a\u00020?2\u0006\u00106\u001a\u000207H\u0086\u0002J\u0011\u0010D\u001a\u00020\u00002\u0006\u00106\u001a\u000207H\u0086\u0002J\u0011\u0010E\u001a\u00020\u00002\u0006\u00106\u001a\u000207H\u0086\u0002J\u0019\u0010F\u001a\u00020C2\u0006\u0010<\u001a\u00020?2\u0006\u00106\u001a\u00020\u000bH\u0086\u0002J!\u0010F\u001a\u00020C2\u0006\u0010<\u001a\u00020?2\u0006\u0010>\u001a\u00020?2\u0006\u00106\u001a\u000207H\u0086\u0002J\u0011\u0010G\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000bH\u0086\u0002J\u0011\u0010G\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010G\u001a\u00020\u00002\u0006\u00106\u001a\u000207H\u0086\u0002J\u0006\u0010H\u001a\u00020IJ\u0006\u0010J\u001a\u00020KJ\u0008\u0010L\u001a\u00020MH\u0016J\t\u0010N\u001a\u00020\u0000H\u0086\u0002R&\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R&\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0015\u0010\u0012\"\u0004\u0008\u0016\u0010\u0014R&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0017\u0010\u0012\"\u0004\u0008\u0018\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0012R\u0012\u0010\u001b\u001a\u00020\u00038\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u0012R\u0012\u0010\u001d\u001a\u00020\u00038\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u0012R&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038\u00c6\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001f\u0010\u0012\"\u0004\u0008 \u0010\u0014R\u0012\u0010!\u001a\u00020\"8\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$R\u001a\u0010\u000e\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010&\"\u0004\u0008*\u0010(R\u001a\u0010\u000c\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008+\u0010&\"\u0004\u0008,\u0010(R\u001a\u0010\r\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008-\u0010&\"\u0004\u0008.\u0010(\u00a8\u0006P"
    }
    d2 = {
        "Lcom/google/android/filament/utils/Mat4;",
        "",
        "right",
        "Lcom/google/android/filament/utils/Float3;",
        "up",
        "forward",
        "position",
        "(Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;)V",
        "m",
        "(Lcom/google/android/filament/utils/Mat4;)V",
        "x",
        "Lcom/google/android/filament/utils/Float4;",
        "y",
        "z",
        "w",
        "(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)V",
        "value",
        "getForward",
        "()Lcom/google/android/filament/utils/Float3;",
        "setForward",
        "(Lcom/google/android/filament/utils/Float3;)V",
        "getPosition",
        "setPosition",
        "getRight",
        "setRight",
        "rotation",
        "getRotation",
        "scale",
        "getScale",
        "translation",
        "getTranslation",
        "getUp",
        "setUp",
        "upperLeft",
        "Lcom/google/android/filament/utils/Mat3;",
        "getUpperLeft",
        "()Lcom/google/android/filament/utils/Mat3;",
        "getW",
        "()Lcom/google/android/filament/utils/Float4;",
        "setW",
        "(Lcom/google/android/filament/utils/Float4;)V",
        "getX",
        "setX",
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
        "v",
        "",
        "equals",
        "",
        "other",
        "get",
        "column",
        "Lcom/google/android/filament/utils/MatrixColumn;",
        "row",
        "",
        "hashCode",
        "inc",
        "invoke",
        "",
        "minus",
        "plus",
        "set",
        "times",
        "toFloatArray",
        "",
        "toQuaternion",
        "Lcom/google/android/filament/utils/Quaternion;",
        "toString",
        "",
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
        "SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/Mat4\n+ 2 Vector.kt\ncom/google/android/filament/utils/Float4\n+ 3 Vector.kt\ncom/google/android/filament/utils/VectorKt\n+ 4 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n*L\n1#1,682:1\n229#1:706\n234#1:708\n239#1:710\n394#2:683\n396#2,4:684\n394#2:688\n396#2,4:689\n394#2:693\n396#2,4:694\n394#2:698\n396#2,4:699\n394#2:703\n394#2:705\n394#2:707\n394#2:709\n394#2:711\n394#2:715\n419#2,5:716\n533#2:721\n534#2:722\n535#2:723\n536#2:724\n656#3:704\n37#4:712\n37#4:713\n37#4:714\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/Mat4\n*L\n255#1:706\n256#1:708\n257#1:710\n229#1:683\n231#1:684,4\n234#1:688\n236#1:689,4\n239#1:693\n241#1:694,4\n244#1:698\n246#1:699,4\n250#1:703\n252#1:705\n255#1:707\n256#1:709\n257#1:711\n268#1:715\n291#1:716,5\n301#1:721\n302#1:722\n303#1:723\n304#1:724\n250#1:704\n260#1:712\n261#1:713\n263#1:714\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/google/android/filament/utils/Mat4$Companion;


# instance fields
.field private w:Lcom/google/android/filament/utils/Float4;

.field private x:Lcom/google/android/filament/utils/Float4;

.field private y:Lcom/google/android/filament/utils/Float4;

.field private z:Lcom/google/android/filament/utils/Float4;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/filament/utils/Mat4$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/filament/utils/Mat4$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/google/android/filament/utils/Mat4;->Companion:Lcom/google/android/filament/utils/Mat4$Companion;

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

    invoke-direct/range {v0 .. v6}, Lcom/google/android/filament/utils/Mat4;-><init>(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;)V
    .locals 4

    const-string v0, "right"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "up"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "forward"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/google/android/filament/utils/Float4;-><init>(Lcom/google/android/filament/utils/Float3;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, Lcom/google/android/filament/utils/Float4;

    invoke-direct {p1, p2, v1, v2, v3}, Lcom/google/android/filament/utils/Float4;-><init>(Lcom/google/android/filament/utils/Float3;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p2, Lcom/google/android/filament/utils/Float4;

    invoke-direct {p2, p3, v1, v2, v3}, Lcom/google/android/filament/utils/Float4;-><init>(Lcom/google/android/filament/utils/Float3;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p3, Lcom/google/android/filament/utils/Float4;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {p3, p4, v1}, Lcom/google/android/filament/utils/Float4;-><init>(Lcom/google/android/filament/utils/Float3;F)V

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/filament/utils/Mat4;-><init>(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    new-instance p4, Lcom/google/android/filament/utils/Float3;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/filament/utils/Float3;-><init>(FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/filament/utils/Mat4;-><init>(Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)V
    .locals 1

    const-string v0, "x"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "y"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "z"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "w"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    iput-object p2, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    iput-object p3, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    iput-object p4, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    new-instance p1, Lcom/google/android/filament/utils/Float4;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xe

    const/4 v6, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Lcom/google/android/filament/utils/Float4;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    new-instance p2, Lcom/google/android/filament/utils/Float4;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xd

    const/4 v6, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v6}, Lcom/google/android/filament/utils/Float4;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    new-instance p3, Lcom/google/android/filament/utils/Float4;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/16 v5, 0xb

    const/4 v6, 0x0

    move-object v0, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/filament/utils/Float4;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    new-instance p4, Lcom/google/android/filament/utils/Float4;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v0, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/filament/utils/Float4;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/filament/utils/Mat4;-><init>(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/filament/utils/Mat4;)V
    .locals 10

    const-string v0, "m"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xf

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lcom/google/android/filament/utils/Float4;->copy$default(Lcom/google/android/filament/utils/Float4;FFFFILjava/lang/Object;)Lcom/google/android/filament/utils/Float4;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-static/range {v1 .. v7}, Lcom/google/android/filament/utils/Float4;->copy$default(Lcom/google/android/filament/utils/Float4;FFFFILjava/lang/Object;)Lcom/google/android/filament/utils/Float4;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    const/4 v6, 0x0

    const/16 v7, 0xf

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Lcom/google/android/filament/utils/Float4;->copy$default(Lcom/google/android/filament/utils/Float4;FFFFILjava/lang/Object;)Lcom/google/android/filament/utils/Float4;

    move-result-object v2

    iget-object v3, p1, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    const/4 v7, 0x0

    const/16 v8, 0xf

    const/4 v9, 0x0

    invoke-static/range {v3 .. v9}, Lcom/google/android/filament/utils/Float4;->copy$default(Lcom/google/android/filament/utils/Float4;FFFFILjava/lang/Object;)Lcom/google/android/filament/utils/Float4;

    move-result-object p1

    invoke-direct {p0, v0, v1, v2, p1}, Lcom/google/android/filament/utils/Mat4;-><init>(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/google/android/filament/utils/Mat4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;ILjava/lang/Object;)Lcom/google/android/filament/utils/Mat4;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/filament/utils/Mat4;->copy(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)Lcom/google/android/filament/utils/Mat4;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/google/android/filament/utils/Float4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    return-object v0
.end method

.method public final component2()Lcom/google/android/filament/utils/Float4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    return-object v0
.end method

.method public final component3()Lcom/google/android/filament/utils/Float4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    return-object v0
.end method

.method public final component4()Lcom/google/android/filament/utils/Float4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    return-object v0
.end method

.method public final copy(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)Lcom/google/android/filament/utils/Mat4;
    .locals 1

    const-string v0, "x"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "y"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "z"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "w"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Mat4;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/filament/utils/Mat4;-><init>(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)V

    return-object v0
.end method

.method public final dec()Lcom/google/android/filament/utils/Mat4;
    .locals 6

    new-instance v0, Lcom/google/android/filament/utils/Mat4;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->dec()Lcom/google/android/filament/utils/Float4;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->dec()Lcom/google/android/filament/utils/Float4;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->dec()Lcom/google/android/filament/utils/Float4;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    iget-object v4, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->dec()Lcom/google/android/filament/utils/Float4;

    move-result-object v5

    iput-object v5, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Mat4;-><init>(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)V

    return-object v0
.end method

.method public final div(F)Lcom/google/android/filament/utils/Mat4;
    .locals 9

    new-instance v0, Lcom/google/android/filament/utils/Mat4;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    new-instance v2, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v3

    div-float/2addr v3, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v4

    div-float/2addr v4, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v5

    div-float/2addr v5, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    div-float/2addr v1, p1

    invoke-direct {v2, v3, v4, v5, v1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    new-instance v3, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v4

    div-float/2addr v4, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v5

    div-float/2addr v5, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v6

    div-float/2addr v6, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    div-float/2addr v1, p1

    invoke-direct {v3, v4, v5, v6, v1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    new-instance v4, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v5

    div-float/2addr v5, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v6

    div-float/2addr v6, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v7

    div-float/2addr v7, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    div-float/2addr v1, p1

    invoke-direct {v4, v5, v6, v7, v1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    new-instance v5, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v6

    div-float/2addr v6, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v7

    div-float/2addr v7, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v8

    div-float/2addr v8, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    div-float/2addr v1, p1

    invoke-direct {v5, v6, v7, v8, v1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/filament/utils/Mat4;-><init>(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/filament/utils/Mat4;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/filament/utils/Mat4;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    iget-object v3, p1, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    iget-object v3, p1, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    iget-object v3, p1, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    iget-object p1, p1, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final get(II)F
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Mat4;->get(I)Lcom/google/android/filament/utils/Float4;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/filament/utils/Float4;->get(I)F

    move-result p1

    return p1
.end method

.method public final get(Lcom/google/android/filament/utils/MatrixColumn;I)F
    .locals 1

    const-string v0, "column"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Mat4;->get(Lcom/google/android/filament/utils/MatrixColumn;)Lcom/google/android/filament/utils/Float4;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/filament/utils/Float4;->get(I)F

    move-result p1

    return p1
.end method

.method public final get(I)Lcom/google/android/filament/utils/Float4;
    .locals 1

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "column must be in 0..3"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p1, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    :goto_0
    return-object p1
.end method

.method public final get(Lcom/google/android/filament/utils/MatrixColumn;)Lcom/google/android/filament/utils/Float4;
    .locals 1

    const-string v0, "column"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/filament/utils/Mat4$WhenMappings;->$EnumSwitchMapping$0:[I

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

    iget-object p1, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    iget-object p1, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    :goto_0
    return-object p1
.end method

.method public final getForward()Lcom/google/android/filament/utils/Float3;
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Mat4;->getZ()Lcom/google/android/filament/utils/Float4;

    move-result-object v0

    new-instance v1, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v3

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v0

    invoke-direct {v1, v2, v3, v0}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    return-object v1
.end method

.method public final getPosition()Lcom/google/android/filament/utils/Float3;
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Mat4;->getW()Lcom/google/android/filament/utils/Float4;

    move-result-object v0

    new-instance v1, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v3

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v0

    invoke-direct {v1, v2, v3, v0}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    return-object v1
.end method

.method public final getRight()Lcom/google/android/filament/utils/Float3;
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Mat4;->getX()Lcom/google/android/filament/utils/Float4;

    move-result-object v0

    new-instance v1, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v3

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v0

    invoke-direct {v1, v2, v3, v0}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    return-object v1
.end method

.method public final getRotation()Lcom/google/android/filament/utils/Float3;
    .locals 10

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Mat4;->getX()Lcom/google/android/filament/utils/Float4;

    move-result-object v0

    new-instance v1, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v3

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v0

    invoke-direct {v1, v2, v3, v0}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    invoke-static {v1}, Lcom/google/android/filament/utils/VectorKt;->normalize(Lcom/google/android/filament/utils/Float3;)Lcom/google/android/filament/utils/Float3;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Mat4;->getY()Lcom/google/android/filament/utils/Float4;

    move-result-object v1

    new-instance v2, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v3

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v4

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v1

    invoke-direct {v2, v3, v4, v1}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    invoke-static {v2}, Lcom/google/android/filament/utils/VectorKt;->normalize(Lcom/google/android/filament/utils/Float3;)Lcom/google/android/filament/utils/Float3;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Mat4;->getZ()Lcom/google/android/filament/utils/Float4;

    move-result-object v2

    new-instance v3, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v4

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v5

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v2

    invoke-direct {v3, v4, v5, v2}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    invoke-static {v3}, Lcom/google/android/filament/utils/VectorKt;->normalize(Lcom/google/android/filament/utils/Float3;)Lcom/google/android/filament/utils/Float3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v3

    const/high16 v4, -0x40800000    # -1.0f

    cmpg-float v3, v3, v4

    const/4 v4, 0x0

    const v5, 0x42652ee0

    if-gtz v3, :cond_0

    new-instance v2, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result v0

    float-to-double v6, v0

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr v0, v5

    const/high16 v1, -0x3d4c0000    # -90.0f

    invoke-direct {v2, v1, v4, v0}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v3

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v3, v3, v6

    if-ltz v3, :cond_1

    new-instance v2, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result v0

    neg-float v0, v0

    float-to-double v6, v0

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result v0

    neg-float v0, v0

    float-to-double v0, v0

    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr v0, v5

    const/high16 v1, 0x42b40000    # 90.0f

    invoke-direct {v2, v1, v4, v0}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    goto :goto_0

    :cond_1
    new-instance v3, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v4

    float-to-double v6, v4

    invoke-static {v6, v7}, Ljava/lang/Math;->asin(D)D

    move-result-wide v6

    double-to-float v4, v6

    neg-float v4, v4

    mul-float/2addr v4, v5

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v6

    float-to-double v6, v6

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result v2

    float-to-double v8, v2

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v6

    double-to-float v2, v6

    neg-float v2, v2

    mul-float/2addr v2, v5

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v0

    float-to-double v6, v0

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr v0, v5

    invoke-direct {v3, v4, v2, v0}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    move-object v2, v3

    :goto_0
    return-object v2
.end method

.method public final getScale()Lcom/google/android/filament/utils/Float3;
    .locals 7

    new-instance v0, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Mat4;->getX()Lcom/google/android/filament/utils/Float4;

    move-result-object v1

    new-instance v2, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v3

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v4

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v1

    invoke-direct {v2, v3, v4, v1}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v1

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v3

    mul-float/2addr v1, v3

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v3

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v1, v3

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result v3

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result v2

    mul-float/2addr v3, v2

    add-float/2addr v1, v3

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Mat4;->getY()Lcom/google/android/filament/utils/Float4;

    move-result-object v2

    new-instance v3, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v4

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v5

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v2

    invoke-direct {v3, v4, v5, v2}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v2

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v4

    mul-float/2addr v2, v4

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v4

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v2, v4

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result v4

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result v3

    mul-float/2addr v4, v3

    add-float/2addr v2, v4

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Mat4;->getZ()Lcom/google/android/filament/utils/Float4;

    move-result-object v3

    new-instance v4, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v5

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v6

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-direct {v4, v5, v6, v3}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v3

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v5

    mul-float/2addr v3, v5

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v5

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v3, v5

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result v5

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result v4

    mul-float/2addr v5, v4

    add-float/2addr v3, v5

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    double-to-float v3, v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    return-object v0
.end method

.method public final getTranslation()Lcom/google/android/filament/utils/Float3;
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Mat4;->getW()Lcom/google/android/filament/utils/Float4;

    move-result-object v0

    new-instance v1, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v3

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v0

    invoke-direct {v1, v2, v3, v0}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    return-object v1
.end method

.method public final getUp()Lcom/google/android/filament/utils/Float3;
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Mat4;->getY()Lcom/google/android/filament/utils/Float4;

    move-result-object v0

    new-instance v1, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v3

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v0

    invoke-direct {v1, v2, v3, v0}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    return-object v1
.end method

.method public final getUpperLeft()Lcom/google/android/filament/utils/Mat3;
    .locals 7

    new-instance v0, Lcom/google/android/filament/utils/Mat3;

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Mat4;->getX()Lcom/google/android/filament/utils/Float4;

    move-result-object v1

    new-instance v2, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v3

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v4

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v1

    invoke-direct {v2, v3, v4, v1}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Mat4;->getY()Lcom/google/android/filament/utils/Float4;

    move-result-object v1

    new-instance v3, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v4

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v5

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v1

    invoke-direct {v3, v4, v5, v1}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Mat4;->getZ()Lcom/google/android/filament/utils/Float4;

    move-result-object v1

    new-instance v4, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v5

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v6

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v1

    invoke-direct {v4, v5, v6, v1}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    invoke-direct {v0, v2, v3, v4}, Lcom/google/android/filament/utils/Mat3;-><init>(Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;)V

    return-object v0
.end method

.method public final getW()Lcom/google/android/filament/utils/Float4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    return-object v0
.end method

.method public final getX()Lcom/google/android/filament/utils/Float4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    return-object v0
.end method

.method public final getY()Lcom/google/android/filament/utils/Float4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    return-object v0
.end method

.method public final getZ()Lcom/google/android/filament/utils/Float4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float4;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final inc()Lcom/google/android/filament/utils/Mat4;
    .locals 6

    new-instance v0, Lcom/google/android/filament/utils/Mat4;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->inc()Lcom/google/android/filament/utils/Float4;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->inc()Lcom/google/android/filament/utils/Float4;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->inc()Lcom/google/android/filament/utils/Float4;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    iget-object v4, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->inc()Lcom/google/android/filament/utils/Float4;

    move-result-object v5

    iput-object v5, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Mat4;-><init>(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)V

    return-object v0
.end method

.method public final invoke(II)F
    .locals 0

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p0, p2}, Lcom/google/android/filament/utils/Mat4;->get(I)Lcom/google/android/filament/utils/Float4;

    move-result-object p2

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p2, p1}, Lcom/google/android/filament/utils/Float4;->get(I)F

    move-result p1

    return p1
.end method

.method public final invoke(IIF)V
    .locals 0

    add-int/lit8 p2, p2, -0x1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p2, p1, p3}, Lcom/google/android/filament/utils/Mat4;->set(IIF)V

    return-void
.end method

.method public final minus(F)Lcom/google/android/filament/utils/Mat4;
    .locals 9

    new-instance v0, Lcom/google/android/filament/utils/Mat4;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    new-instance v2, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v3

    sub-float/2addr v3, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v4

    sub-float/2addr v4, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v5

    sub-float/2addr v5, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    sub-float/2addr v1, p1

    invoke-direct {v2, v3, v4, v5, v1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    new-instance v3, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v4

    sub-float/2addr v4, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v5

    sub-float/2addr v5, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v6

    sub-float/2addr v6, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    sub-float/2addr v1, p1

    invoke-direct {v3, v4, v5, v6, v1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    new-instance v4, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v5

    sub-float/2addr v5, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v6

    sub-float/2addr v6, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v7

    sub-float/2addr v7, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    sub-float/2addr v1, p1

    invoke-direct {v4, v5, v6, v7, v1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    new-instance v5, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v6

    sub-float/2addr v6, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v7

    sub-float/2addr v7, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v8

    sub-float/2addr v8, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    sub-float/2addr v1, p1

    invoke-direct {v5, v6, v7, v8, v1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/filament/utils/Mat4;-><init>(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)V

    return-object v0
.end method

.method public final plus(F)Lcom/google/android/filament/utils/Mat4;
    .locals 9

    new-instance v0, Lcom/google/android/filament/utils/Mat4;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    new-instance v2, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v3

    add-float/2addr v3, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v4

    add-float/2addr v4, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v5

    add-float/2addr v5, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    add-float/2addr v1, p1

    invoke-direct {v2, v3, v4, v5, v1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    new-instance v3, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v4

    add-float/2addr v4, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v5

    add-float/2addr v5, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v6

    add-float/2addr v6, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    add-float/2addr v1, p1

    invoke-direct {v3, v4, v5, v6, v1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    new-instance v4, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v5

    add-float/2addr v5, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v6

    add-float/2addr v6, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v7

    add-float/2addr v7, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    add-float/2addr v1, p1

    invoke-direct {v4, v5, v6, v7, v1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    new-instance v5, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v6

    add-float/2addr v6, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v7

    add-float/2addr v7, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v8

    add-float/2addr v8, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    add-float/2addr v1, p1

    invoke-direct {v5, v6, v7, v8, v1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/filament/utils/Mat4;-><init>(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)V

    return-object v0
.end method

.method public final set(IIF)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Mat4;->get(I)Lcom/google/android/filament/utils/Float4;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lcom/google/android/filament/utils/Float4;->set(IF)V

    return-void
.end method

.method public final set(ILcom/google/android/filament/utils/Float4;)V
    .locals 1

    const-string v0, "v"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/Mat4;->get(I)Lcom/google/android/filament/utils/Float4;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/filament/utils/Float4;->setX(F)V

    invoke-virtual {p2}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/filament/utils/Float4;->setY(F)V

    invoke-virtual {p2}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/filament/utils/Float4;->setZ(F)V

    invoke-virtual {p2}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result p2

    invoke-virtual {p1, p2}, Lcom/google/android/filament/utils/Float4;->setW(F)V

    return-void
.end method

.method public final setForward(Lcom/google/android/filament/utils/Float3;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Mat4;->getZ()Lcom/google/android/filament/utils/Float4;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/utils/Float4;->setX(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/utils/Float4;->setY(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/filament/utils/Float4;->setZ(F)V

    return-void
.end method

.method public final setPosition(Lcom/google/android/filament/utils/Float3;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Mat4;->getW()Lcom/google/android/filament/utils/Float4;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/utils/Float4;->setX(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/utils/Float4;->setY(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/filament/utils/Float4;->setZ(F)V

    return-void
.end method

.method public final setRight(Lcom/google/android/filament/utils/Float3;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Mat4;->getX()Lcom/google/android/filament/utils/Float4;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/utils/Float4;->setX(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/utils/Float4;->setY(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/filament/utils/Float4;->setZ(F)V

    return-void
.end method

.method public final setUp(Lcom/google/android/filament/utils/Float3;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/Mat4;->getY()Lcom/google/android/filament/utils/Float4;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/utils/Float4;->setX(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/utils/Float4;->setY(F)V

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/filament/utils/Float4;->setZ(F)V

    return-void
.end method

.method public final setW(Lcom/google/android/filament/utils/Float4;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    return-void
.end method

.method public final setX(Lcom/google/android/filament/utils/Float4;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    return-void
.end method

.method public final setY(Lcom/google/android/filament/utils/Float4;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    return-void
.end method

.method public final setZ(Lcom/google/android/filament/utils/Float4;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    return-void
.end method

.method public final times(Lcom/google/android/filament/utils/Float4;)Lcom/google/android/filament/utils/Float4;
    .locals 7

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Float4;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v2

    mul-float/2addr v1, v2

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v3

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v3

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v3

    mul-float/2addr v2, v3

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v4

    mul-float/2addr v3, v4

    iget-object v4, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v5

    mul-float/2addr v4, v5

    iget-object v5, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v5

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    iget-object v5, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v5

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    iget-object v5, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v5

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result p1

    mul-float/2addr v5, p1

    add-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    return-object v0
.end method

.method public final times(F)Lcom/google/android/filament/utils/Mat4;
    .locals 9

    new-instance v0, Lcom/google/android/filament/utils/Mat4;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    new-instance v2, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v3

    mul-float/2addr v3, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v4

    mul-float/2addr v4, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v5

    mul-float/2addr v5, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    mul-float/2addr v1, p1

    invoke-direct {v2, v3, v4, v5, v1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    new-instance v3, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v4

    mul-float/2addr v4, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v5

    mul-float/2addr v5, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v6

    mul-float/2addr v6, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    mul-float/2addr v1, p1

    invoke-direct {v3, v4, v5, v6, v1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    new-instance v4, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v5

    mul-float/2addr v5, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v6

    mul-float/2addr v6, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v7

    mul-float/2addr v7, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    mul-float/2addr v1, p1

    invoke-direct {v4, v5, v6, v7, v1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    new-instance v5, Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v6

    mul-float/2addr v6, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v7

    mul-float/2addr v7, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v8

    mul-float/2addr v8, p1

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    mul-float/2addr v1, p1

    invoke-direct {v5, v6, v7, v8, v1}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/filament/utils/Mat4;-><init>(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)V

    return-object v0
.end method

.method public final times(Lcom/google/android/filament/utils/Mat4;)Lcom/google/android/filament/utils/Mat4;
    .locals 11

    const-string v0, "m"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/Mat4;

    new-instance v1, Lcom/google/android/filament/utils/Float4;

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v2

    iget-object v3, p1, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v3

    mul-float/2addr v2, v3

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v3

    iget-object v4, p1, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v3

    iget-object v4, p1, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v3

    iget-object v4, p1, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v4

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v3

    iget-object v4, p1, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v4

    mul-float/2addr v3, v4

    iget-object v4, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v4

    iget-object v5, p1, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v4

    iget-object v5, p1, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v4

    iget-object v5, p1, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v4

    iget-object v5, p1, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v5

    mul-float/2addr v4, v5

    iget-object v5, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v5

    iget-object v6, p1, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    iget-object v5, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v5

    iget-object v6, p1, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    iget-object v5, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v5

    iget-object v6, p1, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    iget-object v5, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v5

    iget-object v6, p1, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v6

    mul-float/2addr v5, v6

    iget-object v6, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v6

    iget-object v7, p1, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    iget-object v6, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v6

    iget-object v7, p1, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    iget-object v6, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v6

    iget-object v7, p1, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    new-instance v2, Lcom/google/android/filament/utils/Float4;

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v3

    iget-object v4, p1, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v4

    mul-float/2addr v3, v4

    iget-object v4, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v4

    iget-object v5, p1, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v4

    iget-object v5, p1, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v4

    iget-object v5, p1, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v4

    iget-object v5, p1, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v5

    mul-float/2addr v4, v5

    iget-object v5, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v5

    iget-object v6, p1, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    iget-object v5, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v5

    iget-object v6, p1, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    iget-object v5, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v5

    iget-object v6, p1, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    iget-object v5, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v5

    iget-object v6, p1, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v6

    mul-float/2addr v5, v6

    iget-object v6, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v6

    iget-object v7, p1, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    iget-object v6, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v6

    iget-object v7, p1, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    iget-object v6, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v6

    iget-object v7, p1, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    iget-object v6, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v6

    iget-object v7, p1, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v7

    mul-float/2addr v6, v7

    iget-object v7, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v7

    iget-object v8, p1, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v8}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v8

    mul-float/2addr v7, v8

    add-float/2addr v6, v7

    iget-object v7, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v7

    iget-object v8, p1, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v8}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v8

    mul-float/2addr v7, v8

    add-float/2addr v6, v7

    iget-object v7, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v7

    iget-object v8, p1, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v8}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v8

    mul-float/2addr v7, v8

    add-float/2addr v6, v7

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    new-instance v3, Lcom/google/android/filament/utils/Float4;

    iget-object v4, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v4

    iget-object v5, p1, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v5

    mul-float/2addr v4, v5

    iget-object v5, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v5

    iget-object v6, p1, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    iget-object v5, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v5

    iget-object v6, p1, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    iget-object v5, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v5

    iget-object v6, p1, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    iget-object v5, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v5

    iget-object v6, p1, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v6

    mul-float/2addr v5, v6

    iget-object v6, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v6

    iget-object v7, p1, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    iget-object v6, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v6

    iget-object v7, p1, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    iget-object v6, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v6

    iget-object v7, p1, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    iget-object v6, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v6

    iget-object v7, p1, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v7

    mul-float/2addr v6, v7

    iget-object v7, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v7

    iget-object v8, p1, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v8}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v8

    mul-float/2addr v7, v8

    add-float/2addr v6, v7

    iget-object v7, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v7

    iget-object v8, p1, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v8}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v8

    mul-float/2addr v7, v8

    add-float/2addr v6, v7

    iget-object v7, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v7

    iget-object v8, p1, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v8}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v8

    mul-float/2addr v7, v8

    add-float/2addr v6, v7

    iget-object v7, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v7

    iget-object v8, p1, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v8}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v8

    mul-float/2addr v7, v8

    iget-object v8, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v8}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v8

    iget-object v9, p1, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v9}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v9

    mul-float/2addr v8, v9

    add-float/2addr v7, v8

    iget-object v8, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v8}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v8

    iget-object v9, p1, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v9}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v9

    mul-float/2addr v8, v9

    add-float/2addr v7, v8

    iget-object v8, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v8}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v8

    iget-object v9, p1, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v9}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v9

    mul-float/2addr v8, v9

    add-float/2addr v7, v8

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    new-instance v4, Lcom/google/android/filament/utils/Float4;

    iget-object v5, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v5

    iget-object v6, p1, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v6

    mul-float/2addr v5, v6

    iget-object v6, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v6

    iget-object v7, p1, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    iget-object v6, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v6

    iget-object v7, p1, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    iget-object v6, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v6

    iget-object v7, p1, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    iget-object v6, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v6}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v6

    iget-object v7, p1, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v7

    mul-float/2addr v6, v7

    iget-object v7, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v7

    iget-object v8, p1, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v8}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v8

    mul-float/2addr v7, v8

    add-float/2addr v6, v7

    iget-object v7, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v7

    iget-object v8, p1, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v8}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v8

    mul-float/2addr v7, v8

    add-float/2addr v6, v7

    iget-object v7, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v7

    iget-object v8, p1, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v8}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v8

    mul-float/2addr v7, v8

    add-float/2addr v6, v7

    iget-object v7, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v7}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v7

    iget-object v8, p1, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v8}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v8

    mul-float/2addr v7, v8

    iget-object v8, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v8}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v8

    iget-object v9, p1, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v9}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v9

    mul-float/2addr v8, v9

    add-float/2addr v7, v8

    iget-object v8, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v8}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v8

    iget-object v9, p1, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v9}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v9

    mul-float/2addr v8, v9

    add-float/2addr v7, v8

    iget-object v8, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v8}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v8

    iget-object v9, p1, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v9}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v9

    mul-float/2addr v8, v9

    add-float/2addr v7, v8

    iget-object v8, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v8}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v8

    iget-object v9, p1, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v9}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v9

    mul-float/2addr v8, v9

    iget-object v9, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v9}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v9

    iget-object v10, p1, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v10}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v10

    mul-float/2addr v9, v10

    add-float/2addr v8, v9

    iget-object v9, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v9}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v9

    iget-object v10, p1, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v10}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v10

    mul-float/2addr v9, v10

    add-float/2addr v8, v9

    iget-object v9, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v9}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v9

    iget-object p1, p1, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result p1

    mul-float/2addr v9, p1

    add-float/2addr v8, v9

    invoke-direct {v4, v5, v6, v7, v8}, Lcom/google/android/filament/utils/Float4;-><init>(FFFF)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Mat4;-><init>(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)V

    return-object v0
.end method

.method public final toFloatArray()[F
    .locals 3

    const/16 v0, 0x10

    new-array v0, v0, [F

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    const/4 v2, 0x3

    aput v1, v0, v2

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v1

    const/4 v2, 0x4

    aput v1, v0, v2

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v1

    const/4 v2, 0x5

    aput v1, v0, v2

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v1

    const/4 v2, 0x6

    aput v1, v0, v2

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v1

    const/4 v2, 0x7

    aput v1, v0, v2

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v1

    const/16 v2, 0x8

    aput v1, v0, v2

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v1

    const/16 v2, 0x9

    aput v1, v0, v2

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v1

    const/16 v2, 0xa

    aput v1, v0, v2

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v1

    const/16 v2, 0xb

    aput v1, v0, v2

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    const/16 v2, 0xc

    aput v1, v0, v2

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    const/16 v2, 0xd

    aput v1, v0, v2

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    const/16 v2, 0xe

    aput v1, v0, v2

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    const/16 v2, 0xf

    aput v1, v0, v2

    return-object v0
.end method

.method public final toQuaternion()Lcom/google/android/filament/utils/Quaternion;
    .locals 1

    invoke-static {p0}, Lcom/google/android/filament/utils/MatrixKt;->quaternion(Lcom/google/android/filament/utils/Mat4;)Lcom/google/android/filament/utils/Quaternion;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\n            |"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->getX()F

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, "|\n            |"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getY()F

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->getZ()F

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->getW()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "|\n            "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/StringsKt;->trimIndent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final unaryMinus()Lcom/google/android/filament/utils/Mat4;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Mat4;

    iget-object v1, p0, Lcom/google/android/filament/utils/Mat4;->x:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float4;->unaryMinus()Lcom/google/android/filament/utils/Float4;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/filament/utils/Mat4;->y:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float4;->unaryMinus()Lcom/google/android/filament/utils/Float4;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/filament/utils/Mat4;->z:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float4;->unaryMinus()Lcom/google/android/filament/utils/Float4;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/filament/utils/Mat4;->w:Lcom/google/android/filament/utils/Float4;

    invoke-virtual {v4}, Lcom/google/android/filament/utils/Float4;->unaryMinus()Lcom/google/android/filament/utils/Float4;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/filament/utils/Mat4;-><init>(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)V

    return-object v0
.end method
