.class public final LKo2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lkotlin/Function1;",
        "LEi5;",
        "",
        "content",
        "a",
        "(Lkotlin/jvm/functions/Function3;LEt0;I)V",
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
        "SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolderKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,106:1\n76#2:107\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolderKt\n*L\n43#1:107\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lkotlin/jvm/functions/Function3;LEt0;I)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LEi5;",
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

    const-string v0, "content"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x282f3fa8

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    and-int/lit8 v1, p2, 0xe

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LEt0;->I(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    move v8, v1

    goto :goto_1

    :cond_1
    move v8, p2

    :goto_1
    and-int/lit8 v1, v8, 0xb

    if-ne v1, v2, :cond_3

    invoke-interface {p1}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)"

    invoke-static {v0, v8, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    invoke-static {}, LJi5;->b()LU94;

    move-result-object v0

    invoke-interface {p1, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LHi5;

    const/4 v9, 0x1

    new-array v1, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v0, v1, v10

    sget-object v2, LJo2;->d:LJo2$b;

    invoke-virtual {v2, v0}, LJo2$b;->a(LHi5;)LRi5;

    move-result-object v2

    const/4 v3, 0x0

    new-instance v4, LKo2$c;

    invoke-direct {v4, v0}, LKo2$c;-><init>(LHi5;)V

    const/16 v6, 0x48

    const/4 v7, 0x4

    move-object v5, p1

    invoke-static/range {v1 .. v7}, LQv4;->b([Ljava/lang/Object;LRi5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;II)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJo2;

    new-array v1, v9, [LW94;

    invoke-static {}, LJi5;->b()LU94;

    move-result-object v2

    invoke-virtual {v2, v0}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v2

    aput-object v2, v1, v10

    new-instance v2, LKo2$a;

    invoke-direct {v2, v0, p0, v8}, LKo2$a;-><init>(LJo2;Lkotlin/jvm/functions/Function3;I)V

    const v0, 0x6f1942e8

    invoke-static {p1, v0, v9, v2}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v2, 0x38

    invoke-static {v1, v0, p1, v2}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_4

    :cond_6
    new-instance v0, LKo2$b;

    invoke-direct {v0, p0, p2}, LKo2$b;-><init>(Lkotlin/jvm/functions/Function3;I)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void
.end method
