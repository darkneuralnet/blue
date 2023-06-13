.class public final LKm0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u0014\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a0\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\">\u0010\u0013\u001a)\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\t8\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\"\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0015\"?\u0010\u001c\u001a)\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\t*\u00020\u00198F\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "",
        "column",
        "",
        "x",
        "y",
        "z",
        "",
        "matrix",
        "e",
        "Lkotlin/Function1;",
        "LBm0;",
        "Lkotlin/ParameterName;",
        "name",
        "colorSpace",
        "Lwb6;",
        "Lpm0;",
        "Luf;",
        "a",
        "Lkotlin/jvm/functions/Function1;",
        "ColorToVector",
        "b",
        "[F",
        "M1",
        "c",
        "InverseM1",
        "Lpm0$a;",
        "d",
        "(Lpm0$a;)Lkotlin/jvm/functions/Function1;",
        "VectorConverter",
        "animation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LBm0;",
            "Lwb6<",
            "Lpm0;",
            "Luf;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final b:[F

.field public static final c:[F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, LKm0$a;->g:LKm0$a;

    sput-object v0, LKm0;->a:Lkotlin/jvm/functions/Function1;

    const/16 v0, 0x9

    new-array v1, v0, [F

    fill-array-data v1, :array_0

    sput-object v1, LKm0;->b:[F

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    sput-object v0, LKm0;->c:[F

    return-void

    nop

    :array_0
    .array-data 4
        0x3f4dd6b4
        0x3cdc4faa
        0x3d3bdd61
        0x3ea33ed3
        0x3f6e94f8
        0x3e86a7af
        -0x4216215b
        0x3d511d8a
        0x3f570a1d    # 0.83999807f
    .end array-data

    :array_1
    .array-data 4
        0x3f9fcee0
        -0x42f96b04
        -0x4292e928
        -0x41088a6c
        0x3f8d5ea9
        -0x415c76bd
        0x3e4be1d4
        -0x426d607d
        0x3f99dbe4
    .end array-data
.end method

.method public static final synthetic a()[F
    .locals 1

    sget-object v0, LKm0;->c:[F

    return-object v0
.end method

.method public static final synthetic b()[F
    .locals 1

    sget-object v0, LKm0;->b:[F

    return-object v0
.end method

.method public static final synthetic c(IFFF[F)F
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LKm0;->e(IFFF[F)F

    move-result p0

    return p0
.end method

.method public static final d(Lpm0$a;)Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0$a;",
            ")",
            "Lkotlin/jvm/functions/Function1<",
            "LBm0;",
            "Lwb6<",
            "Lpm0;",
            "Luf;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LKm0;->a:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final e(IFFF[F)F
    .locals 1

    aget v0, p4, p0

    mul-float/2addr p1, v0

    add-int/lit8 v0, p0, 0x3

    aget v0, p4, v0

    mul-float/2addr p2, v0

    add-float/2addr p1, p2

    add-int/lit8 p0, p0, 0x6

    aget p0, p4, p0

    mul-float/2addr p3, p0

    add-float/2addr p1, p3

    return p1
.end method
