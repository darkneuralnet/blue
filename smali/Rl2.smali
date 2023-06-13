.class public final LRl2;
.super LBm0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRl2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0014\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0004H\u0010\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0004H\u0010\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J@\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0001H\u0010\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006 "
    }
    d2 = {
        "LRl2;",
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
        "SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,140:1\n25#2,3:141\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n74#1:141,3\n*E\n"
    }
.end annotation


# static fields
.field public static final e:LRl2$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LRl2$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LRl2$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LRl2;->e:LRl2$a;

    return-void
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
    .locals 16

    move-object/from16 v0, p1

    const-string v1, "v"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    aget v2, v0, v1

    sget-object v3, LwW1;->a:LwW1;

    invoke-virtual {v3}, LwW1;->c()[F

    move-result-object v4

    aget v4, v4, v1

    div-float/2addr v2, v4

    const/4 v4, 0x1

    aget v5, v0, v4

    invoke-virtual {v3}, LwW1;->c()[F

    move-result-object v6

    aget v6, v6, v4

    div-float/2addr v5, v6

    const/4 v6, 0x2

    aget v7, v0, v6

    invoke-virtual {v3}, LwW1;->c()[F

    move-result-object v3

    aget v3, v3, v6

    div-float/2addr v7, v3

    const v3, 0x3c111aa7

    cmpl-float v8, v2, v3

    const v9, 0x3eaaaaab

    const v10, 0x3e0d3dcb

    const v11, 0x40f92f68

    if-lez v8, :cond_0

    float-to-double v12, v2

    float-to-double v14, v9

    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v12

    double-to-float v2, v12

    goto :goto_0

    :cond_0
    mul-float/2addr v2, v11

    add-float/2addr v2, v10

    :goto_0
    cmpl-float v8, v5, v3

    if-lez v8, :cond_1

    float-to-double v12, v5

    float-to-double v14, v9

    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v12

    double-to-float v5, v12

    goto :goto_1

    :cond_1
    mul-float/2addr v5, v11

    add-float/2addr v5, v10

    :goto_1
    cmpl-float v3, v7, v3

    if-lez v3, :cond_2

    float-to-double v7, v7

    float-to-double v9, v9

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v7

    double-to-float v3, v7

    goto :goto_2

    :cond_2
    mul-float/2addr v7, v11

    add-float v3, v7, v10

    :goto_2
    const/high16 v7, 0x42e80000    # 116.0f

    mul-float/2addr v7, v5

    const/high16 v8, 0x41800000    # 16.0f

    sub-float/2addr v7, v8

    const/high16 v8, 0x43fa0000    # 500.0f

    sub-float/2addr v2, v5

    mul-float/2addr v2, v8

    const/high16 v8, 0x43480000    # 200.0f

    sub-float/2addr v5, v3

    mul-float/2addr v5, v8

    const/4 v3, 0x0

    const/high16 v8, 0x42c80000    # 100.0f

    invoke-static {v7, v3, v8}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v3

    aput v3, v0, v1

    const/high16 v1, -0x3d000000    # -128.0f

    const/high16 v3, 0x43000000    # 128.0f

    invoke-static {v2, v1, v3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v2

    aput v2, v0, v4

    invoke-static {v5, v1, v3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v1

    aput v1, v0, v6

    return-object v0
.end method

.method public e(I)F
    .locals 0

    if-nez p1, :cond_0

    const/high16 p1, 0x42c80000    # 100.0f

    goto :goto_0

    :cond_0
    const/high16 p1, 0x43000000    # 128.0f

    :goto_0
    return p1
.end method

.method public f(I)F
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/high16 p1, -0x3d000000    # -128.0f

    :goto_0
    return p1
.end method

.method public j(FFF)J
    .locals 4

    const/4 p2, 0x0

    const/high16 p3, 0x42c80000    # 100.0f

    invoke-static {p1, p2, p3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result p2

    const/high16 p3, -0x3d000000    # -128.0f

    const/high16 v0, 0x43000000    # 128.0f

    invoke-static {p1, p3, v0}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result p1

    const/high16 p3, 0x41800000    # 16.0f

    add-float/2addr p2, p3

    const/high16 p3, 0x42e80000    # 116.0f

    div-float/2addr p2, p3

    const p3, 0x3b03126f    # 0.002f

    mul-float/2addr p1, p3

    add-float/2addr p1, p2

    const p3, 0x3e53dcb1

    cmpl-float v0, p1, p3

    const v1, 0x3e0d3dcb

    const v2, 0x3e038027

    if-lez v0, :cond_0

    mul-float v0, p1, p1

    mul-float/2addr v0, p1

    goto :goto_0

    :cond_0
    sub-float/2addr p1, v1

    mul-float v0, p1, v2

    :goto_0
    cmpl-float p1, p2, p3

    if-lez p1, :cond_1

    mul-float p1, p2, p2

    mul-float/2addr p1, p2

    goto :goto_1

    :cond_1
    sub-float/2addr p2, v1

    mul-float p1, p2, v2

    :goto_1
    sget-object p2, LwW1;->a:LwW1;

    invoke-virtual {p2}, LwW1;->c()[F

    move-result-object p3

    const/4 v1, 0x0

    aget p3, p3, v1

    mul-float/2addr v0, p3

    invoke-virtual {p2}, LwW1;->c()[F

    move-result-object p2

    const/4 p3, 0x1

    aget p2, p2, p3

    mul-float/2addr p1, p2

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

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
    .locals 10

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget v1, p1, v0

    const/4 v2, 0x0

    const/high16 v3, 0x42c80000    # 100.0f

    invoke-static {v1, v2, v3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v1

    aput v1, p1, v0

    const/4 v1, 0x1

    aget v2, p1, v1

    const/high16 v3, -0x3d000000    # -128.0f

    const/high16 v4, 0x43000000    # 128.0f

    invoke-static {v2, v3, v4}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v2

    aput v2, p1, v1

    const/4 v2, 0x2

    aget v5, p1, v2

    invoke-static {v5, v3, v4}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v3

    aput v3, p1, v2

    aget v4, p1, v0

    const/high16 v5, 0x41800000    # 16.0f

    add-float/2addr v4, v5

    const/high16 v5, 0x42e80000    # 116.0f

    div-float/2addr v4, v5

    aget v5, p1, v1

    const v6, 0x3b03126f    # 0.002f

    mul-float/2addr v5, v6

    add-float/2addr v5, v4

    const v6, 0x3ba3d70a    # 0.005f

    mul-float/2addr v3, v6

    sub-float v3, v4, v3

    const v6, 0x3e53dcb1

    cmpl-float v7, v5, v6

    const v8, 0x3e0d3dcb

    const v9, 0x3e038027

    if-lez v7, :cond_0

    mul-float v7, v5, v5

    mul-float/2addr v7, v5

    goto :goto_0

    :cond_0
    sub-float/2addr v5, v8

    mul-float v7, v5, v9

    :goto_0
    cmpl-float v5, v4, v6

    if-lez v5, :cond_1

    mul-float v5, v4, v4

    mul-float/2addr v5, v4

    goto :goto_1

    :cond_1
    sub-float/2addr v4, v8

    mul-float v5, v4, v9

    :goto_1
    cmpl-float v4, v3, v6

    if-lez v4, :cond_2

    mul-float v4, v3, v3

    mul-float/2addr v4, v3

    goto :goto_2

    :cond_2
    sub-float/2addr v3, v8

    mul-float v4, v3, v9

    :goto_2
    sget-object v3, LwW1;->a:LwW1;

    invoke-virtual {v3}, LwW1;->c()[F

    move-result-object v6

    aget v6, v6, v0

    mul-float/2addr v7, v6

    aput v7, p1, v0

    invoke-virtual {v3}, LwW1;->c()[F

    move-result-object v0

    aget v0, v0, v1

    mul-float/2addr v5, v0

    aput v5, p1, v1

    invoke-virtual {v3}, LwW1;->c()[F

    move-result-object v0

    aget v0, v0, v2

    mul-float/2addr v4, v0

    aput v4, p1, v2

    return-object p1
.end method

.method public m(FFF)F
    .locals 1

    const/4 p2, 0x0

    const/high16 v0, 0x42c80000    # 100.0f

    invoke-static {p1, p2, v0}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result p1

    const/high16 p2, -0x3d000000    # -128.0f

    const/high16 v0, 0x43000000    # 128.0f

    invoke-static {p3, p2, v0}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result p2

    const/high16 p3, 0x41800000    # 16.0f

    add-float/2addr p1, p3

    const/high16 p3, 0x42e80000    # 116.0f

    div-float/2addr p1, p3

    const p3, 0x3ba3d70a    # 0.005f

    mul-float/2addr p2, p3

    sub-float/2addr p1, p2

    const p2, 0x3e53dcb1

    cmpl-float p2, p1, p2

    if-lez p2, :cond_0

    mul-float p2, p1, p1

    mul-float/2addr p2, p1

    goto :goto_0

    :cond_0
    const p2, 0x3e0d3dcb

    sub-float/2addr p1, p2

    const p2, 0x3e038027

    mul-float/2addr p2, p1

    :goto_0
    sget-object p1, LwW1;->a:LwW1;

    invoke-virtual {p1}, LwW1;->c()[F

    move-result-object p1

    const/4 p3, 0x2

    aget p1, p1, p3

    mul-float/2addr p2, p1

    return p2
.end method

.method public n(FFFFLBm0;)J
    .locals 9

    const-string v0, "colorSpace"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LwW1;->a:LwW1;

    invoke-virtual {v0}, LwW1;->c()[F

    move-result-object v1

    const/4 v2, 0x0

    aget v1, v1, v2

    div-float/2addr p1, v1

    invoke-virtual {v0}, LwW1;->c()[F

    move-result-object v1

    const/4 v2, 0x1

    aget v1, v1, v2

    div-float/2addr p2, v1

    invoke-virtual {v0}, LwW1;->c()[F

    move-result-object v0

    const/4 v1, 0x2

    aget v0, v0, v1

    div-float/2addr p3, v0

    const v0, 0x3c111aa7

    cmpl-float v1, p1, v0

    const v2, 0x3eaaaaab

    const v3, 0x3e0d3dcb

    const v4, 0x40f92f68

    if-lez v1, :cond_0

    float-to-double v5, p1

    float-to-double v7, v2

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    double-to-float p1, v5

    goto :goto_0

    :cond_0
    mul-float/2addr p1, v4

    add-float/2addr p1, v3

    :goto_0
    cmpl-float v1, p2, v0

    if-lez v1, :cond_1

    float-to-double v5, p2

    float-to-double v7, v2

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    double-to-float p2, v5

    goto :goto_1

    :cond_1
    mul-float/2addr p2, v4

    add-float/2addr p2, v3

    :goto_1
    cmpl-float v0, p3, v0

    if-lez v0, :cond_2

    float-to-double v0, p3

    float-to-double v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-float p3, v0

    goto :goto_2

    :cond_2
    mul-float/2addr p3, v4

    add-float/2addr p3, v3

    :goto_2
    const/high16 v0, 0x42e80000    # 116.0f

    mul-float/2addr v0, p2

    const/high16 v1, 0x41800000    # 16.0f

    sub-float/2addr v0, v1

    const/high16 v1, 0x43fa0000    # 500.0f

    sub-float/2addr p1, p2

    mul-float/2addr p1, v1

    const/high16 v1, 0x43480000    # 200.0f

    sub-float/2addr p2, p3

    mul-float/2addr p2, v1

    const/4 p3, 0x0

    const/high16 v1, 0x42c80000    # 100.0f

    invoke-static {v0, p3, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result p3

    const/high16 v0, -0x3d000000    # -128.0f

    const/high16 v1, 0x43000000    # 128.0f

    invoke-static {p1, v0, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result p1

    invoke-static {p2, v0, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result p2

    invoke-static {p3, p1, p2, p4, p5}, Lvm0;->a(FFFFLBm0;)J

    move-result-wide p1

    return-wide p1
.end method
