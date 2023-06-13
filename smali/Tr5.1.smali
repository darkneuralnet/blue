.class public final LTr5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aF\u0010\t\u001a\u00020\u0000*\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\'\u0010\u0008\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\u000c\u0008\u0005\u0012\u0008\u0008\u0006\u0012\u0004\u0008\u0008(\u0007\u0012\u0004\u0012\u00020\u00000\u0004H\u0000\u00f8\u0001\u0000\u001a&\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000b2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\"#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u00128\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\"\u0017\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\"\u001d\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "LgV2;",
        "Lkotlin/Function0;",
        "LCe3;",
        "magnifierCenter",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "animatedCenter",
        "platformMagnifier",
        "g",
        "targetCalculation",
        "LsP5;",
        "h",
        "(Lkotlin/jvm/functions/Function0;LEt0;I)LsP5;",
        "Ltf;",
        "a",
        "Ltf;",
        "UnspecifiedAnimationVector2D",
        "Lwb6;",
        "b",
        "Lwb6;",
        "UnspecifiedSafeOffsetVectorConverter",
        "c",
        "J",
        "OffsetDisplacementThreshold",
        "LjO5;",
        "d",
        "LjO5;",
        "MagnifierSpringSpec",
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
        "SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,111:1\n25#2:112\n25#2:119\n1114#3,6:113\n1114#3,6:120\n76#4:126\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n*L\n80#1:112\n81#1:119\n80#1:113,6\n81#1:120,6\n80#1:126\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Ltf;

.field public static final b:Lwb6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb6<",
            "LCe3;",
            "Ltf;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:J

.field public static final d:LjO5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LjO5<",
            "LCe3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Ltf;

    const/high16 v1, 0x7fc00000    # Float.NaN

    invoke-direct {v0, v1, v1}, Ltf;-><init>(FF)V

    sput-object v0, LTr5;->a:Ltf;

    sget-object v0, LTr5$a;->g:LTr5$a;

    sget-object v1, LTr5$b;->g:LTr5$b;

    invoke-static {v0, v1}, LXj6;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lwb6;

    move-result-object v0

    sput-object v0, LTr5;->b:Lwb6;

    const v0, 0x3c23d70a    # 0.01f

    invoke-static {v0, v0}, LGe3;->a(FF)J

    move-result-wide v0

    sput-wide v0, LTr5;->c:J

    new-instance v8, LjO5;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1}, LCe3;->d(J)LCe3;

    move-result-object v5

    const/4 v6, 0x3

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, LjO5;-><init>(FFLjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v8, LTr5;->d:LjO5;

    return-void
.end method

.method public static final synthetic a()LjO5;
    .locals 1

    sget-object v0, LTr5;->d:LjO5;

    return-object v0
.end method

.method public static final synthetic b()J
    .locals 2

    sget-wide v0, LTr5;->c:J

    return-wide v0
.end method

.method public static final synthetic c()Ltf;
    .locals 1

    sget-object v0, LTr5;->a:Ltf;

    return-object v0
.end method

.method public static final synthetic d()Lwb6;
    .locals 1

    sget-object v0, LTr5;->b:Lwb6;

    return-object v0
.end method

.method public static final synthetic e(Lkotlin/jvm/functions/Function0;LEt0;I)LsP5;
    .locals 0

    invoke-static {p0, p1, p2}, LTr5;->h(Lkotlin/jvm/functions/Function0;LEt0;I)LsP5;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(LsP5;)J
    .locals 2

    invoke-static {p0}, LTr5;->i(LsP5;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final g(LgV2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)LgV2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "Lkotlin/jvm/functions/Function0<",
            "LCe3;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/jvm/functions/Function0<",
            "LCe3;",
            ">;+",
            "LgV2;",
            ">;)",
            "LgV2;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "magnifierCenter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "platformMagnifier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LTr5$c;

    invoke-direct {v0, p1, p2}, LTr5$c;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p0, p2, v0, p1, p2}, LDt0;->b(LgV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)LgV2;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lkotlin/jvm/functions/Function0;LEt0;I)LsP5;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "LCe3;",
            ">;",
            "LEt0;",
            "I)",
            "LsP5<",
            "LCe3;",
            ">;"
        }
    .end annotation

    const v0, -0x5ec259b1

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const p2, -0x1d58f75c

    invoke-interface {p1, p2}, LEt0;->F(I)V

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_1

    invoke-static {p0}, LGM5;->c(Lkotlin/jvm/functions/Function0;)LsP5;

    move-result-object v0

    invoke-interface {p1, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    check-cast v0, LsP5;

    invoke-interface {p1, p2}, LEt0;->F(I)V

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne p0, p2, :cond_2

    new-instance p0, Lne;

    invoke-static {v0}, LTr5;->f(LsP5;)J

    move-result-wide v1

    invoke-static {v1, v2}, LCe3;->d(J)LCe3;

    move-result-object p2

    invoke-static {}, LTr5;->d()Lwb6;

    move-result-object v1

    invoke-static {}, LTr5;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, LCe3;->d(J)LCe3;

    move-result-object v2

    invoke-direct {p0, p2, v1, v2}, Lne;-><init>(Ljava/lang/Object;Lwb6;Ljava/lang/Object;)V

    invoke-interface {p1, p0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p1}, LEt0;->Q()V

    check-cast p0, Lne;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    new-instance v1, LTr5$d;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p0, v2}, LTr5$d;-><init>(LsP5;Lne;Lkotlin/coroutines/Continuation;)V

    const/16 v0, 0x46

    invoke-static {p2, v1, p1, v0}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-virtual {p0}, Lne;->g()LsP5;

    move-result-object p0

    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p1}, LEt0;->Q()V

    return-object p0
.end method

.method public static final i(LsP5;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "LCe3;",
            ">;)J"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LCe3;

    invoke-virtual {p0}, LCe3;->x()J

    move-result-wide v0

    return-wide v0
.end method
