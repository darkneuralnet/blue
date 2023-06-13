.class public final Lio2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a3\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "LgV2;",
        "LCo2;",
        "state",
        "Lho2;",
        "beyondBoundsInfo",
        "",
        "reverseLayout",
        "LEy3;",
        "orientation",
        "a",
        "(LgV2;LCo2;Lho2;ZLEy3;LEt0;I)LgV2;",
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
        "SMAP\nLazyListBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,71:1\n76#2:72\n36#3:73\n83#3,3:80\n1114#4,6:74\n1114#4,6:83\n*S KotlinDebug\n*F\n+ 1 LazyListBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierKt\n*L\n39#1:72\n40#1:73\n41#1:80,3\n40#1:74,6\n41#1:83,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(LgV2;LCo2;Lho2;ZLEy3;LEt0;I)LgV2;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "beyondBoundsInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "orientation"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x3b2ead9

    invoke-interface {p5, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.lazy.lazyListBeyondBoundsModifier (LazyListBeyondBoundsModifier.kt:32)"

    invoke-static {v0, p6, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Lhu0;->l()LU94;

    move-result-object p6

    invoke-interface {p5, p6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p6

    move-object v4, p6

    check-cast v4, Lpm2;

    const p6, 0x44faf204

    invoke-interface {p5, p6}, LEt0;->F(I)V

    invoke-interface {p5, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p6

    invoke-interface {p5}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez p6, :cond_1

    sget-object p6, LEt0;->a:LEt0$a;

    invoke-virtual {p6}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p6

    if-ne v0, p6, :cond_2

    :cond_1
    new-instance v0, Ljo2;

    invoke-direct {v0, p1}, Ljo2;-><init>(LCo2;)V

    invoke-interface {p5, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p5}, LEt0;->Q()V

    move-object v1, v0

    check-cast v1, Ljo2;

    const/4 p1, 0x5

    new-array p6, p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object v1, p6, v0

    const/4 v2, 0x1

    aput-object p2, p6, v2

    const/4 v2, 0x2

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, p6, v2

    const/4 v2, 0x3

    aput-object v4, p6, v2

    const/4 v2, 0x4

    aput-object p4, p6, v2

    const v2, -0x21de6e89

    invoke-interface {p5, v2}, LEt0;->F(I)V

    move v2, v0

    :goto_0
    if-ge v0, p1, :cond_3

    aget-object v3, p6, v0

    invoke-interface {p5, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    invoke-interface {p5}, LEt0;->G()Ljava/lang/Object;

    move-result-object p1

    if-nez v2, :cond_4

    sget-object p6, LEt0;->a:LEt0$a;

    invoke-virtual {p6}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p6

    if-ne p1, p6, :cond_5

    :cond_4
    new-instance p1, LNn2;

    move-object v0, p1

    move-object v2, p2

    move v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LNn2;-><init>(LDG;Lho2;ZLpm2;LEy3;)V

    invoke-interface {p5, p1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_5
    invoke-interface {p5}, LEt0;->Q()V

    check-cast p1, LgV2;

    invoke-interface {p0, p1}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p0

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    invoke-interface {p5}, LEt0;->Q()V

    return-object p0
.end method
