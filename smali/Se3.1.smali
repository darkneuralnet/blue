.class public final LSe3;
.super LBm0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSe3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0014\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0004H\u0010\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0004H\u0010\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J@\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0001H\u0010\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006 "
    }
    d2 = {
        "LSe3;",
        "LBm0;",
        "",
        "component",
        "",
        "f",
        "e",
        "",
        "v",
        "l",
        "v0",
        "v1",
        "v2",
        "",
        "j",
        "(FFF)J",
        "m",
        "(FFF)F",
        "x",
        "y",
        "z",
        "a",
        "colorSpace",
        "Lpm0;",
        "n",
        "(FFFFLBm0;)J",
        "b",
        "",
        "name",
        "id",
        "<init>",
        "(Ljava/lang/String;I)V",
        "ui-graphics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOklab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,172:1\n25#2,3:173\n*S KotlinDebug\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n*L\n78#1:173,3\n*E\n"
    }
.end annotation


# static fields
.field public static final e:LSe3$a;

.field public static final f:[F

.field public static final g:[F

.field public static final h:[F

.field public static final i:[F


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, LSe3$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LSe3$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LSe3;->e:LSe3$a;

    const/16 v0, 0x9

    new-array v1, v0, [F

    fill-array-data v1, :array_0

    sget-object v2, LD6;->b:LD6$d;

    invoke-virtual {v2}, LD6$d;->a()LD6;

    move-result-object v2

    invoke-virtual {v2}, LD6;->b()[F

    move-result-object v2

    sget-object v3, LwW1;->a:LwW1;

    invoke-virtual {v3}, LwW1;->b()LNA6;

    move-result-object v4

    invoke-virtual {v4}, LNA6;->c()[F

    move-result-object v4

    invoke-virtual {v3}, LwW1;->e()LNA6;

    move-result-object v3

    invoke-virtual {v3}, LNA6;->c()[F

    move-result-object v3

    invoke-static {v2, v4, v3}, LCm0;->e([F[F[F)[F

    move-result-object v2

    invoke-static {v1, v2}, LCm0;->k([F[F)[F

    move-result-object v1

    sput-object v1, LSe3;->f:[F

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    sput-object v0, LSe3;->g:[F

    invoke-static {v1}, LCm0;->j([F)[F

    move-result-object v1

    sput-object v1, LSe3;->h:[F

    invoke-static {v0}, LCm0;->j([F)[F

    move-result-object v0

    sput-object v0, LSe3;->i:[F

    return-void

    nop

    :array_0
    .array-data 4
        0x3f51a598
        0x3d071acd
        0x3d456dae
        0x3eb94699
        0x3f6de762
        0x3e875b04
        -0x41fc0c33
        0x3d140d73
        0x3f22441b
    .end array-data

    :array_1
    .array-data 4
        0x3e578152
        0x3ffd2f0e
        0x3cd434b4
        0x3f4b2a89
        -0x3fe491f2
        0x3f4863bb
        -0x447a9132
        0x3ee6b438
        -0x40b0faa0
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 7

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lwm0;->a:Lwm0$a;

    invoke-virtual {v0}, Lwm0$a;->a()J

    move-result-wide v3

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v5, p2

    invoke-direct/range {v1 .. v6}, LBm0;-><init>(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public b([F)[F
    .locals 6

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSe3;->f:[F

    invoke-static {v0, p1}, LCm0;->m([F[F)[F

    const/4 v0, 0x0

    aget v1, p1, v0

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    aget v2, p1, v0

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    float-to-double v2, v2

    const v4, 0x3eaaaaab

    float-to-double v4, v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    aput v1, p1, v0

    const/4 v0, 0x1

    aget v1, p1, v0

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    aget v2, p1, v0

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    aput v1, p1, v0

    const/4 v0, 0x2

    aget v1, p1, v0

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    aget v2, p1, v0

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    aput v1, p1, v0

    sget-object v0, LSe3;->g:[F

    invoke-static {v0, p1}, LCm0;->m([F[F)[F

    return-object p1
.end method

.method public e(I)F
    .locals 0

    if-nez p1, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/high16 p1, 0x3f000000    # 0.5f

    :goto_0
    return p1
.end method

.method public f(I)F
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/high16 p1, -0x41000000    # -0.5f

    :goto_0
    return p1
.end method

.method public j(FFF)J
    .locals 4

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p1, v0, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result p1

    const/high16 v0, -0x41000000    # -0.5f

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {p2, v0, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result p2

    invoke-static {p3, v0, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result p3

    sget-object v0, LSe3;->i:[F

    invoke-static {v0, p1, p2, p3}, LCm0;->n([FFFF)F

    move-result v1

    invoke-static {v0, p1, p2, p3}, LCm0;->o([FFFF)F

    move-result v2

    invoke-static {v0, p1, p2, p3}, LCm0;->p([FFFF)F

    move-result p1

    mul-float p2, v1, v1

    mul-float/2addr p2, v1

    mul-float p3, v2, v2

    mul-float/2addr p3, v2

    mul-float v0, p1, p1

    mul-float/2addr v0, p1

    sget-object p1, LSe3;->h:[F

    invoke-static {p1, p2, p3, v0}, LCm0;->n([FFFF)F

    move-result v1

    invoke-static {p1, p2, p3, v0}, LCm0;->o([FFFF)F

    move-result p1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p2

    int-to-long p2, p2

    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p1

    int-to-long v0, p1

    const/16 p1, 0x20

    shl-long p1, p2, p1

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long/2addr p1, v0

    return-wide p1
.end method

.method public l([F)[F
    .locals 6

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget v1, p1, v0

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v1, v2, v3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v1

    aput v1, p1, v0

    const/4 v1, 0x1

    aget v2, p1, v1

    const/high16 v3, -0x41000000    # -0.5f

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-static {v2, v3, v4}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v2

    aput v2, p1, v1

    const/4 v2, 0x2

    aget v5, p1, v2

    invoke-static {v5, v3, v4}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v3

    aput v3, p1, v2

    sget-object v3, LSe3;->i:[F

    invoke-static {v3, p1}, LCm0;->m([F[F)[F

    aget v3, p1, v0

    mul-float v4, v3, v3

    mul-float/2addr v4, v3

    aput v4, p1, v0

    aget v0, p1, v1

    mul-float v3, v0, v0

    mul-float/2addr v3, v0

    aput v3, p1, v1

    aget v0, p1, v2

    mul-float v1, v0, v0

    mul-float/2addr v1, v0

    aput v1, p1, v2

    sget-object v0, LSe3;->h:[F

    invoke-static {v0, p1}, LCm0;->m([F[F)[F

    return-object p1
.end method

.method public m(FFF)F
    .locals 3

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p1, v0, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result p1

    const/high16 v0, -0x41000000    # -0.5f

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {p2, v0, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result p2

    invoke-static {p3, v0, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result p3

    sget-object v0, LSe3;->i:[F

    invoke-static {v0, p1, p2, p3}, LCm0;->n([FFFF)F

    move-result v1

    invoke-static {v0, p1, p2, p3}, LCm0;->o([FFFF)F

    move-result v2

    invoke-static {v0, p1, p2, p3}, LCm0;->p([FFFF)F

    move-result p1

    mul-float p2, v1, v1

    mul-float/2addr p2, v1

    mul-float p3, v2, v2

    mul-float/2addr p3, v2

    mul-float v0, p1, p1

    mul-float/2addr v0, p1

    sget-object p1, LSe3;->h:[F

    invoke-static {p1, p2, p3, v0}, LCm0;->p([FFFF)F

    move-result p1

    return p1
.end method

.method public n(FFFFLBm0;)J
    .locals 5

    const-string v0, "colorSpace"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSe3;->f:[F

    invoke-static {v0, p1, p2, p3}, LCm0;->n([FFFF)F

    move-result v1

    invoke-static {v0, p1, p2, p3}, LCm0;->o([FFFF)F

    move-result v2

    invoke-static {v0, p1, p2, p3}, LCm0;->p([FFFF)F

    move-result p1

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result p2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result p3

    float-to-double v0, p3

    const p3, 0x3eaaaaab

    float-to-double v3, p3

    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-float p3, v0

    mul-float/2addr p2, p3

    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    move-result p3

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr p3, v0

    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    float-to-double v1, p1

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    double-to-float p1, v1

    mul-float/2addr v0, p1

    sget-object p1, LSe3;->g:[F

    invoke-static {p1, p2, p3, v0}, LCm0;->n([FFFF)F

    move-result v1

    invoke-static {p1, p2, p3, v0}, LCm0;->o([FFFF)F

    move-result v2

    invoke-static {p1, p2, p3, v0}, LCm0;->p([FFFF)F

    move-result p1

    invoke-static {v1, v2, p1, p4, p5}, Lvm0;->a(FFFFLBm0;)J

    move-result-wide p1

    return-wide p1
.end method
