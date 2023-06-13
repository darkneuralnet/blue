.class public final Lfo2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u001a;\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "LgV2;",
        "LRn2;",
        "itemProvider",
        "Ldo2;",
        "state",
        "LEy3;",
        "orientation",
        "",
        "userScrollEnabled",
        "reverseScrolling",
        "a",
        "(LgV2;LRn2;Ldo2;LEy3;ZZLEt0;I)LgV2;",
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
        "SMAP\nLazyLayoutSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,151:1\n474#2,4:152\n478#2,2:160\n482#2:166\n25#3:156\n83#3,3:167\n1114#4,3:157\n1117#4,3:163\n1114#4,6:170\n474#5:162\n*S KotlinDebug\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt\n*L\n47#1:152,4\n47#1:160,2\n47#1:166\n47#1:156\n49#1:167,3\n47#1:157,3\n47#1:163,3\n49#1:170,6\n47#1:162\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(LgV2;LRn2;Ldo2;LEy3;ZZLEt0;I)LgV2;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p6

    const-string v5, "<this>"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "itemProvider"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "state"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "orientation"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v5, 0x114aa1e3

    invoke-interface {v4, v5}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, -0x1

    const-string v7, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:39)"

    move/from16 v8, p7

    invoke-static {v5, v8, v6, v7}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const v5, 0x2e20b340

    invoke-interface {v4, v5}, LEt0;->F(I)V

    const v5, -0x1d58f75c

    invoke-interface {v4, v5}, LEt0;->F(I)V

    invoke-interface/range {p6 .. p6}, LEt0;->G()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, LEt0;->a:LEt0$a;

    invoke-virtual {v6}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_1

    sget-object v5, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    invoke-static {v5, v4}, LY91;->j(Lkotlin/coroutines/CoroutineContext;LEt0;)LZC0;

    move-result-object v5

    new-instance v6, Liu0;

    invoke-direct {v6, v5}, Liu0;-><init>(LZC0;)V

    invoke-interface {v4, v6}, LEt0;->z(Ljava/lang/Object;)V

    move-object v5, v6

    :cond_1
    invoke-interface/range {p6 .. p6}, LEt0;->Q()V

    check-cast v5, Liu0;

    invoke-virtual {v5}, Liu0;->a()LZC0;

    move-result-object v5

    invoke-interface/range {p6 .. p6}, LEt0;->Q()V

    const/4 v6, 0x4

    new-array v7, v6, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v1, v7, v8

    const/4 v9, 0x1

    aput-object v2, v7, v9

    const/4 v10, 0x2

    aput-object v3, v7, v10

    const/4 v10, 0x3

    invoke-static/range {p4 .. p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    aput-object v11, v7, v10

    const v10, -0x21de6e89

    invoke-interface {v4, v10}, LEt0;->F(I)V

    move v10, v8

    move v11, v10

    :goto_0
    if-ge v10, v6, :cond_2

    aget-object v12, v7, v10

    invoke-interface {v4, v12}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_2
    invoke-interface/range {p6 .. p6}, LEt0;->G()Ljava/lang/Object;

    move-result-object v6

    if-nez v11, :cond_3

    sget-object v7, LEt0;->a:LEt0$a;

    invoke-virtual {v7}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v6, v7, :cond_7

    :cond_3
    sget-object v6, LEy3;->b:LEy3;

    if-ne v3, v6, :cond_4

    move v12, v9

    goto :goto_1

    :cond_4
    move v12, v8

    :goto_1
    new-instance v11, Lfo2$d;

    invoke-direct {v11, v1}, Lfo2$d;-><init>(LRn2;)V

    new-instance v13, LQp5;

    new-instance v3, Lfo2$b;

    invoke-direct {v3, v2}, Lfo2$b;-><init>(Ldo2;)V

    new-instance v6, Lfo2$c;

    invoke-direct {v6, v2, v1}, Lfo2$c;-><init>(Ldo2;LRn2;)V

    move/from16 v7, p5

    invoke-direct {v13, v3, v6, v7}, LQp5;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V

    const/4 v3, 0x0

    if-eqz p4, :cond_5

    new-instance v6, Lfo2$e;

    invoke-direct {v6, v12, v5, v2}, Lfo2$e;-><init>(ZLZC0;Ldo2;)V

    move-object v14, v6

    goto :goto_2

    :cond_5
    move-object v14, v3

    :goto_2
    if-eqz p4, :cond_6

    new-instance v6, Lfo2$f;

    invoke-direct {v6, v1, v5, v2}, Lfo2$f;-><init>(LRn2;LZC0;Ldo2;)V

    move-object v15, v6

    goto :goto_3

    :cond_6
    move-object v15, v3

    :goto_3
    invoke-interface/range {p2 .. p2}, Ldo2;->e()Lem0;

    move-result-object v16

    sget-object v1, LgV2;->b0:LgV2$a;

    new-instance v2, Lfo2$a;

    move-object v10, v2

    invoke-direct/range {v10 .. v16}, Lfo2$a;-><init>(Lkotlin/jvm/functions/Function1;ZLQp5;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lem0;)V

    invoke-static {v1, v8, v2, v9, v3}, Lfs5;->b(LgV2;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;

    move-result-object v6

    invoke-interface {v4, v6}, LEt0;->z(Ljava/lang/Object;)V

    :cond_7
    invoke-interface/range {p6 .. p6}, LEt0;->Q()V

    check-cast v6, LgV2;

    invoke-interface {v0, v6}, LgV2;->t0(LgV2;)LgV2;

    move-result-object v0

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, LQt0;->Y()V

    :cond_8
    invoke-interface/range {p6 .. p6}, LEt0;->Q()V

    return-object v0
.end method
