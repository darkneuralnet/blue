.class public final LZF2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001ao\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a2\u0006\u0002\u0008\u00042\u0019\u0008\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a2\u0006\u0002\u0008\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0016\u0008\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0001H\u0007\u00f8\u0001\u0000\u001ao\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a2\u0006\u0002\u0008\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a2\u0006\u0002\u0008\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0001\u00f8\u0001\u0000\u001a\u0012\u0010\u0015\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012H\u0001\")\u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00170\u00168\u0000X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u001a\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "LgV2;",
        "Lkotlin/Function1;",
        "Lg01;",
        "LCe3;",
        "Lkotlin/ExtensionFunctionType;",
        "sourceCenter",
        "magnifierCenter",
        "",
        "zoom",
        "LaG2;",
        "style",
        "Lo61;",
        "",
        "onSizeChanged",
        "d",
        "LFV3;",
        "platformMagnifierFactory",
        "e",
        "",
        "sdkVersion",
        "",
        "b",
        "Lrs5;",
        "Lkotlin/Function0;",
        "a",
        "Lrs5;",
        "()Lrs5;",
        "MagnifierPositionInRoot",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,394:1\n135#2:395\n146#2:396\n*S KotlinDebug\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt\n*L\n233#1:395\n231#1:396\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lrs5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrs5<",
            "Lkotlin/jvm/functions/Function0<",
            "LCe3;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lrs5;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, "MagnifierPositionInRoot"

    invoke-direct {v0, v3, v1, v2, v1}, Lrs5;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LZF2;->a:Lrs5;

    return-void
.end method

.method public static final a()Lrs5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lrs5<",
            "Lkotlin/jvm/functions/Function0<",
            "LCe3;",
            ">;>;"
        }
    .end annotation

    sget-object v0, LZF2;->a:Lrs5;

    return-object v0
.end method

.method public static final b(I)Z
    .locals 1

    const/16 v0, 0x1c

    if-lt p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic c(IILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    :cond_0
    invoke-static {p0}, LZF2;->b(I)Z

    move-result p0

    return p0
.end method

.method public static final d(LgV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FLaG2;Lkotlin/jvm/functions/Function1;)LgV2;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lg01;",
            "LCe3;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lg01;",
            "LCe3;",
            ">;F",
            "LaG2;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lo61;",
            "Lkotlin/Unit;",
            ">;)",
            "LgV2;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceCenter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "magnifierCenter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LK32;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LZF2$a;

    invoke-direct {v0, p1, p2, p3, p4}, LZF2$a;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FLaG2;)V

    goto :goto_0

    :cond_0
    invoke-static {}, LK32;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    :goto_0
    sget-object v1, LgV2;->b0:LgV2$a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v4, v2, v3}, LZF2;->c(IILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, LFV3;->a:LFV3$a;

    invoke-virtual {v2}, LFV3$a;->a()LFV3;

    move-result-object v7

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-static/range {v1 .. v7}, LZF2;->e(LgV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FLaG2;Lkotlin/jvm/functions/Function1;LFV3;)LgV2;

    move-result-object v1

    :cond_1
    invoke-static {p0, v0, v1}, LK32;->b(LgV2;Lkotlin/jvm/functions/Function1;LgV2;)LgV2;

    move-result-object p0

    return-object p0
.end method

.method public static final e(LgV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FLaG2;Lkotlin/jvm/functions/Function1;LFV3;)LgV2;
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ModifierInspectorInfo"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lg01;",
            "LCe3;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lg01;",
            "LCe3;",
            ">;F",
            "LaG2;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lo61;",
            "Lkotlin/Unit;",
            ">;",
            "LFV3;",
            ")",
            "LgV2;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceCenter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "magnifierCenter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "platformMagnifierFactory"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LZF2$c;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p5

    move-object v6, p6

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, LZF2$c;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FLkotlin/jvm/functions/Function1;LFV3;LaG2;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p0, p2, v0, p1, p2}, LDt0;->b(LgV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)LgV2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(LgV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FLaG2;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    sget-object p2, LZF2$b;->g:LZF2$b;

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const/high16 p3, 0x7fc00000    # Float.NaN

    :cond_1
    move v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    sget-object p2, LaG2;->g:LaG2$a;

    invoke-virtual {p2}, LaG2$a;->a()LaG2;

    move-result-object p4

    :cond_2
    move-object v4, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    const/4 p5, 0x0

    :cond_3
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, LZF2;->d(LgV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FLaG2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object p0

    return-object p0
.end method
