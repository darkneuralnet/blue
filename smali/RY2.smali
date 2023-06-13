.class public final LRY2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aN\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0008\nH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a)\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "LOY2;",
        "navController",
        "",
        "startDestination",
        "LgV2;",
        "modifier",
        "route",
        "Lkotlin/Function1;",
        "LKY2;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "builder",
        "b",
        "(LOY2;Ljava/lang/String;LgV2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LEt0;II)V",
        "LJY2;",
        "graph",
        "a",
        "(LOY2;LJY2;LgV2;LEt0;II)V",
        "navigation-compose_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public static final a(LOY2;LJY2;LgV2;LEt0;II)V
    .locals 10

    const-string v0, "navController"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "graph"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x390ae240    # -31374.875f

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_0

    sget-object p2, LgV2;->b0:LgV2$a;

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/h;->i()LU94;

    move-result-object v0

    invoke-interface {p3, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLifecycleOwner;

    sget-object v1, Lpv2;->a:Lpv2;

    const/16 v2, 0x8

    invoke-virtual {v1, p3, v2}, Lpv2;->a(LEt0;I)LXr6;

    move-result-object v1

    if-eqz v1, :cond_e

    sget-object v3, Liv2;->a:Liv2;

    invoke-virtual {v3, p3, v2}, Liv2;->a(LEt0;I)Lcf3;

    move-result-object v3

    const/4 v8, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v3}, Lcf3;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v8

    :goto_0
    invoke-virtual {p0, v0}, LOY2;->h0(LLifecycleOwner;)V

    invoke-interface {v1}, LXr6;->getViewModelStore()LWr6;

    move-result-object v0

    const-string v1, "viewModelStoreOwner.viewModelStore"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LOY2;->j0(LWr6;)V

    if-eqz v3, :cond_2

    invoke-virtual {p0, v3}, LOY2;->i0(Landroidx/activity/OnBackPressedDispatcher;)V

    :cond_2
    new-instance v0, LRY2$b;

    invoke-direct {v0, p0}, LRY2$b;-><init>(LOY2;)V

    invoke-static {p0, v0, p3, v2}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-virtual {p0, p1}, LDY2;->f0(LJY2;)V

    const/4 v0, 0x0

    invoke-static {p3, v0}, LGi5;->a(LEt0;I)LEi5;

    move-result-object v7

    invoke-virtual {p0}, LDY2;->E()Li13;

    move-result-object v1

    const-string v2, "composable"

    invoke-virtual {v1, v2}, Li13;->e(Ljava/lang/String;)Ld13;

    move-result-object v1

    instance-of v2, v1, Lzt0;

    if-eqz v2, :cond_3

    check-cast v1, Lzt0;

    move-object v9, v1

    goto :goto_1

    :cond_3
    move-object v9, v8

    :goto_1
    if-nez v9, :cond_5

    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_4

    goto :goto_2

    :cond_4
    new-instance v6, LRY2$e;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, LRY2$e;-><init>(LOY2;LJY2;LgV2;II)V

    invoke-interface {p3, v6}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void

    :cond_5
    invoke-virtual {p0}, LDY2;->G()LtP5;

    move-result-object v1

    const v2, -0x384212

    invoke-interface {p3, v2}, LEt0;->F(I)V

    invoke-interface {p3, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_6

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_7

    :cond_6
    invoke-virtual {p0}, LDY2;->G()LtP5;

    move-result-object v1

    new-instance v2, LRY2$g;

    invoke-direct {v2, v1}, LRY2$g;-><init>(LEu1;)V

    invoke-interface {p3, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_7
    invoke-interface {p3}, LEt0;->Q()V

    move-object v1, v2

    check-cast v1, LEu1;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x2

    move-object v4, p3

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v1

    invoke-static {v1}, LRY2;->c(LsP5;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LAY2;

    const v3, -0x384349

    invoke-interface {p3, v3}, LEt0;->F(I)V

    invoke-interface {p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LEt0;->a:LEt0$a;

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_8

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v4, 0x2

    invoke-static {v3, v8, v4, v8}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v3

    invoke-interface {p3, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_8
    invoke-interface {p3}, LEt0;->Q()V

    check-cast v3, LEX2;

    const v4, 0x6c9c2958

    invoke-interface {p3, v4}, LEt0;->F(I)V

    if-eqz v2, :cond_9

    invoke-virtual {v2}, LAY2;->g()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    new-instance v5, LRY2$c;

    invoke-direct {v5, v3, v1, v9, v7}, LRY2$c;-><init>(LEX2;LsP5;Lzt0;LEi5;)V

    const v1, 0x4ea23aaf    # 1.36087744E9f

    const/4 v3, 0x1

    invoke-static {p3, v1, v3, v5}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v5

    shr-int/lit8 v1, p4, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int/lit16 v6, v1, 0xc00

    const/4 v7, 0x4

    move-object v1, v2

    move-object v2, p2

    move-object v3, v4

    move-object v4, v5

    move-object v5, p3

    invoke-static/range {v1 .. v7}, LSE0;->b(Ljava/lang/Object;LgV2;Ltm1;Lkotlin/jvm/functions/Function3;LEt0;II)V

    :cond_9
    invoke-interface {p3}, LEt0;->Q()V

    invoke-virtual {p0}, LDY2;->E()Li13;

    move-result-object v1

    const-string v2, "dialog"

    invoke-virtual {v1, v2}, Li13;->e(Ljava/lang/String;)Ld13;

    move-result-object v1

    instance-of v2, v1, Lx31;

    if-eqz v2, :cond_a

    move-object v8, v1

    check-cast v8, Lx31;

    :cond_a
    if-nez v8, :cond_c

    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_b

    goto :goto_3

    :cond_b
    new-instance v6, LRY2$f;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, LRY2$f;-><init>(LOY2;LJY2;LgV2;II)V

    invoke-interface {p3, v6}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_3
    return-void

    :cond_c
    invoke-static {v8, p3, v0}, Lr31;->a(Lx31;LEt0;I)V

    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_d

    goto :goto_4

    :cond_d
    new-instance v6, LRY2$d;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, LRY2$d;-><init>(LOY2;LJY2;LgV2;II)V

    invoke-interface {p3, v6}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(LOY2;Ljava/lang/String;LgV2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LEt0;II)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOY2;",
            "Ljava/lang/String;",
            "LgV2;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LKY2;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object v2, p1

    move-object/from16 v5, p4

    const-string v0, "navController"

    move-object v1, p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startDestination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x8741dc0

    move-object/from16 v3, p5

    invoke-interface {v3, v0}, LEt0;->u(I)LEt0;

    move-result-object v0

    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_0

    sget-object v3, LgV2;->b0:LgV2$a;

    goto :goto_0

    :cond_0
    move-object v3, p2

    :goto_0
    and-int/lit8 v4, p7, 0x8

    if-eqz v4, :cond_1

    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    move-object/from16 v4, p3

    :goto_1
    const v6, -0x383ecf

    invoke-interface {v0, v6}, LEt0;->F(I)V

    invoke-interface {v0, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {v0, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-interface {v0, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-interface {v0}, LEt0;->G()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_2

    sget-object v6, LEt0;->a:LEt0$a;

    invoke-virtual {v6}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_3

    :cond_2
    invoke-virtual {p0}, LDY2;->E()Li13;

    move-result-object v6

    new-instance v7, LKY2;

    invoke-direct {v7, v6, p1, v4}, LKY2;-><init>(Li13;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v5, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7}, LKY2;->d()LJY2;

    move-result-object v7

    invoke-interface {v0, v7}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {v0}, LEt0;->Q()V

    check-cast v7, LJY2;

    move/from16 v12, p6

    and-int/lit16 v6, v12, 0x380

    or-int/lit8 v10, v6, 0x48

    const/4 v11, 0x0

    move-object v6, p0

    move-object v8, v3

    move-object v9, v0

    invoke-static/range {v6 .. v11}, LRY2;->a(LOY2;LJY2;LgV2;LEt0;II)V

    invoke-interface {v0}, LEt0;->w()LWm5;

    move-result-object v8

    if-nez v8, :cond_4

    goto :goto_2

    :cond_4
    new-instance v9, LRY2$a;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LRY2$a;-><init>(LOY2;Ljava/lang/String;LgV2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;II)V

    invoke-interface {v8, v9}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final c(LsP5;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Ljava/util/List<",
            "LAY2;",
            ">;>;)",
            "Ljava/util/List<",
            "LAY2;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final d(LEX2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final e(LEX2;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic f(LsP5;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, LRY2;->c(LsP5;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(LEX2;)Z
    .locals 0

    invoke-static {p0}, LRY2;->d(LEX2;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic h(LEX2;Z)V
    .locals 0

    invoke-static {p0, p1}, LRY2;->e(LEX2;Z)V

    return-void
.end method
