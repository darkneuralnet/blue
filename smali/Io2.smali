.class public final LIo2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a?\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a \u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "Lkotlin/Function0;",
        "",
        "firstVisibleItemIndex",
        "slidingWindowSize",
        "extraItemCount",
        "LsP5;",
        "Lkotlin/ranges/IntRange;",
        "c",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)LsP5;",
        "firstVisibleItem",
        "b",
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
        "SMAP\nLazyNearestItemsRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyNearestItemsRange.kt\nandroidx/compose/foundation/lazy/layout/LazyNearestItemsRangeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,89:1\n67#2,3:90\n66#2:93\n83#2,3:110\n1114#3,3:94\n1117#3,3:107\n1114#3,6:113\n480#4,4:97\n485#4:106\n122#5,5:101\n*S KotlinDebug\n*F\n+ 1 LazyNearestItemsRange.kt\nandroidx/compose/foundation/lazy/layout/LazyNearestItemsRangeKt\n*L\n47#1:90,3\n47#1:93\n59#1:110,3\n47#1:94,3\n47#1:107,3\n59#1:113,6\n48#1:97,4\n48#1:106\n48#1:101,5\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic a(III)Lkotlin/ranges/IntRange;
    .locals 0

    invoke-static {p0, p1, p2}, LIo2;->b(III)Lkotlin/ranges/IntRange;

    move-result-object p0

    return-object p0
.end method

.method public static final b(III)Lkotlin/ranges/IntRange;
    .locals 2

    div-int/2addr p0, p1

    mul-int/2addr p0, p1

    sub-int v0, p0, p2

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr p0, p1

    add-int/2addr p0, p2

    invoke-static {v0, p0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)LsP5;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;",
            "LEt0;",
            "I)",
            "LsP5<",
            "Lkotlin/ranges/IntRange;",
            ">;"
        }
    .end annotation

    const-string v0, "firstVisibleItemIndex"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "slidingWindowSize"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraItemCount"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x199d35e1

    invoke-interface {p3, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.lazy.layout.rememberLazyNearestItemsRangeState (LazyNearestItemsRange.kt:41)"

    invoke-static {v0, p4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const p4, 0x607fb4c4

    invoke-interface {p3, p4}, LEt0;->F(I)V

    invoke-interface {p3, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p4

    invoke-interface {p3, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    invoke-interface {p3, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    invoke-interface {p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    if-nez p4, :cond_1

    sget-object p4, LEt0;->a:LEt0$a;

    invoke-virtual {p4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne v0, p4, :cond_2

    :cond_1
    sget-object p4, LsM5;->e:LsM5$a;

    invoke-virtual {p4}, LsM5$a;->a()LsM5;

    move-result-object p4

    :try_start_0
    invoke-virtual {p4}, LsM5;->k()LsM5;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v2, v3, v4}, LIo2;->a(III)Lkotlin/ranges/IntRange;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p4, v0}, LsM5;->r(LsM5;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {p4}, LsM5;->d()V

    invoke-interface {p3, v2}, LEt0;->z(Ljava/lang/Object;)V

    move-object v0, v2

    :cond_2
    invoke-interface {p3}, LEt0;->Q()V

    check-cast v0, LEX2;

    const/4 p4, 0x4

    new-array v2, p4, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    const/4 v4, 0x1

    aput-object p1, v2, v4

    aput-object p2, v2, v1

    const/4 v1, 0x3

    aput-object v0, v2, v1

    const v1, -0x21de6e89

    invoke-interface {p3, v1}, LEt0;->F(I)V

    move v1, v3

    :goto_0
    if-ge v3, p4, :cond_3

    aget-object v4, v2, v3

    invoke-interface {p3, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    invoke-interface {p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object p4

    if-nez v1, :cond_4

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p4, v1, :cond_5

    :cond_4
    new-instance p4, LIo2$a;

    const/4 v7, 0x0

    move-object v2, p4

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, v0

    invoke-direct/range {v2 .. v7}, LIo2$a;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEX2;Lkotlin/coroutines/Continuation;)V

    invoke-interface {p3, p4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_5
    invoke-interface {p3}, LEt0;->Q()V

    check-cast p4, Lkotlin/jvm/functions/Function2;

    const/16 p0, 0x40

    invoke-static {v0, p4, p3, p0}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    invoke-interface {p3}, LEt0;->Q()V

    return-object v0

    :catchall_0
    move-exception p0

    :try_start_3
    invoke-virtual {p4, v0}, LsM5;->r(LsM5;)V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p0

    invoke-virtual {p4}, LsM5;->d()V

    throw p0
.end method
