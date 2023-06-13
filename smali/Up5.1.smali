.class public final LUp5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\u0019\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a2\u0010\u000c\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0007\u001a6\u0010\u000f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002\u00a8\u0006\u0010"
    }
    d2 = {
        "",
        "initial",
        "LXp5;",
        "a",
        "(ILEt0;II)LXp5;",
        "LgV2;",
        "state",
        "",
        "enabled",
        "Lcu1;",
        "flingBehavior",
        "reverseScrolling",
        "c",
        "isScrollable",
        "isVertical",
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
        "SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,410:1\n36#2:411\n1114#3,6:412\n135#4:418\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n*L\n72#1:411\n72#1:412,6\n317#1:418\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(ILEt0;II)LXp5;
    .locals 10

    const v0, -0x5746c6c7

    invoke-interface {p1, v0}, LEt0;->F(I)V

    and-int/lit8 p3, p3, 0x1

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    move p0, v1

    :cond_0
    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p3, -0x1

    const-string v2, "androidx.compose.foundation.rememberScrollState (Scroll.kt:70)"

    invoke-static {v0, p2, p3, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    new-array v3, v1, [Ljava/lang/Object;

    sget-object p2, LXp5;->i:LXp5$c;

    invoke-virtual {p2}, LXp5$c;->a()LRi5;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const p3, 0x44faf204

    invoke-interface {p1, p3}, LEt0;->F(I)V

    invoke-interface {p1, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p2

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_2

    sget-object p2, LEt0;->a:LEt0$a;

    invoke-virtual {p2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne p3, p2, :cond_3

    :cond_2
    new-instance p3, LUp5$a;

    invoke-direct {p3, p0}, LUp5$a;-><init>(I)V

    invoke-interface {p1, p3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p1}, LEt0;->Q()V

    move-object v6, p3

    check-cast v6, Lkotlin/jvm/functions/Function0;

    const/16 v8, 0x48

    const/4 v9, 0x4

    move-object v7, p1

    invoke-static/range {v3 .. v9}, LQv4;->b([Ljava/lang/Object;LRi5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;II)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LXp5;

    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {p1}, LEt0;->Q()V

    return-object p0
.end method

.method public static final b(LgV2;LXp5;ZLcu1;ZZ)LgV2;
    .locals 8

    invoke-static {}, LK32;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LUp5$b;

    move-object v1, v0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, LUp5$b;-><init>(LXp5;ZLcu1;ZZ)V

    goto :goto_0

    :cond_0
    invoke-static {}, LK32;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    :goto_0
    new-instance v7, LUp5$c;

    move-object v1, v7

    move v2, p5

    move v3, p2

    move-object v4, p1

    move v5, p4

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, LUp5$c;-><init>(ZZLXp5;ZLcu1;)V

    invoke-static {p0, v0, v7}, LDt0;->a(LgV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)LgV2;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LgV2;LXp5;ZLcu1;Z)LgV2;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x1

    move-object v1, p0

    move-object v2, p1

    move v3, p4

    move-object v4, p3

    move v5, p2

    invoke-static/range {v1 .. v6}, LUp5;->b(LgV2;LXp5;ZLcu1;ZZ)LgV2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LgV2;LXp5;ZLcu1;ZILjava/lang/Object;)LgV2;
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x1

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, LUp5;->c(LgV2;LXp5;ZLcu1;Z)LgV2;

    move-result-object p0

    return-object p0
.end method
