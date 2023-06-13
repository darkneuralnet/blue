.class public final LYn2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001a7\u0010\t\u001a\u00020\u00072\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "key",
        "",
        "index",
        "LZn2;",
        "pinnedItemList",
        "Lkotlin/Function0;",
        "",
        "content",
        "a",
        "(Ljava/lang/Object;ILZn2;Lkotlin/jvm/functions/Function2;LEt0;I)V",
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
        "SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,161:1\n50#2:162\n49#2:163\n36#2:171\n1114#3,6:164\n1114#3,6:172\n76#4:170\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n*L\n49#1:162\n49#1:163\n52#1:171\n49#1:164,6\n52#1:172,6\n51#1:170\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Ljava/lang/Object;ILZn2;Lkotlin/jvm/functions/Function2;LEt0;I)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I",
            "LZn2;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const-string v0, "pinnedItemList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x7beccd10

    invoke-interface {p4, v0}, LEt0;->u(I)LEt0;

    move-result-object p4

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:42)"

    invoke-static {v0, p5, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const v0, 0x1e7b2b64

    invoke-interface {p4, v0}, LEt0;->F(I)V

    invoke-interface {p4, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p4, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface {p4}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v1, LXn2;

    invoke-direct {v1, p0, p2}, LXn2;-><init>(Ljava/lang/Object;LZn2;)V

    invoke-interface {p4, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p4}, LEt0;->Q()V

    check-cast v1, LXn2;

    invoke-virtual {v1, p1}, LXn2;->g(I)V

    invoke-static {}, LST3;->a()LU94;

    move-result-object v0

    invoke-interface {p4, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LRT3;

    invoke-virtual {v1, v0}, LXn2;->i(LRT3;)V

    const v0, 0x44faf204

    invoke-interface {p4, v0}, LEt0;->F(I)V

    invoke-interface {p4, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p4}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_3

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_4

    :cond_3
    new-instance v2, LYn2$a;

    invoke-direct {v2, v1}, LYn2$a;-><init>(LXn2;)V

    invoke-interface {p4, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p4}, LEt0;->Q()V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x0

    invoke-static {v1, v2, p4, v0}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    const/4 v2, 0x1

    new-array v2, v2, [LW94;

    invoke-static {}, LST3;->a()LU94;

    move-result-object v3

    invoke-virtual {v3, v1}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v1

    aput-object v1, v2, v0

    shr-int/lit8 v0, p5, 0x6

    and-int/lit8 v0, v0, 0x70

    or-int/lit8 v0, v0, 0x8

    invoke-static {v2, p3, p4, v0}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    invoke-interface {p4}, LEt0;->w()LWm5;

    move-result-object p4

    if-nez p4, :cond_6

    goto :goto_0

    :cond_6
    new-instance v6, LYn2$b;

    move-object v0, v6

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, LYn2$b;-><init>(Ljava/lang/Object;ILZn2;Lkotlin/jvm/functions/Function2;I)V

    invoke-interface {p4, v6}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method
