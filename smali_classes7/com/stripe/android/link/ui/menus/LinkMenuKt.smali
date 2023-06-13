.class public final Lcom/stripe/android/link/ui/menus/LinkMenuKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a;\u0010\u0007\u001a\u00020\u0005\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a+\u0010\u000c\u001a\u00020\u0005\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00028\u00002\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/menus/LinkMenuItem;",
        "T",
        "",
        "items",
        "Lkotlin/Function1;",
        "",
        "onItemPress",
        "LinkMenu",
        "(Ljava/util/List;Lkotlin/jvm/functions/Function1;LEt0;I)V",
        "item",
        "LgV2;",
        "modifier",
        "LinkBottomSheetRow",
        "(Lcom/stripe/android/link/ui/menus/LinkMenuItem;LgV2;LEt0;II)V",
        "link_release"
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
        "SMAP\nLinkMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkMenu.kt\ncom/stripe/android/link/ui/menus/LinkMenuKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,81:1\n154#2:82\n74#3,6:83\n80#3:115\n84#3:120\n75#4:89\n76#4,11:91\n89#4:119\n75#4:127\n76#4,11:129\n89#4:157\n76#5:90\n76#5:128\n460#6,13:102\n473#6,3:116\n460#6,13:140\n473#6,3:154\n75#7,6:121\n81#7:153\n85#7:158\n*S KotlinDebug\n*F\n+ 1 LinkMenu.kt\ncom/stripe/android/link/ui/menus/LinkMenuKt\n*L\n46#1:82\n43#1:83,6\n43#1:115\n43#1:120\n43#1:89\n43#1:91,11\n43#1:119\n64#1:127\n64#1:129,11\n64#1:157\n43#1:90\n64#1:128\n43#1:102,13\n43#1:116,3\n64#1:140,13\n64#1:154,3\n64#1:121,6\n64#1:153\n64#1:158\n*E\n"
    }
.end annotation


# direct methods
.method private static final LinkBottomSheetRow(Lcom/stripe/android/link/ui/menus/LinkMenuItem;LgV2;LEt0;II)V
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/stripe/android/link/ui/menus/LinkMenuItem;",
            ">(TT;",
            "LgV2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    const v3, -0x6776fc6b

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LEt0;->u(I)LEt0;

    move-result-object v6

    and-int/lit8 v4, v2, 0x1

    const/4 v5, 0x2

    if-eqz v4, :cond_0

    or-int/lit8 v4, v1, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0xe

    if-nez v4, :cond_2

    invoke-interface {v6, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    move v4, v5

    :goto_0
    or-int/2addr v4, v1

    goto :goto_1

    :cond_2
    move v4, v1

    :goto_1
    and-int/lit8 v7, v2, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v1, 0x70

    if-nez v8, :cond_5

    move-object/from16 v8, p1

    invoke-interface {v6, v8}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v4, v9

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v8, p1

    :goto_4
    and-int/lit8 v4, v4, 0x5b

    const/16 v9, 0x12

    if-ne v4, v9, :cond_7

    invoke-interface {v6}, LEt0;->b()Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {v6}, LEt0;->k()V

    move-object v3, v6

    goto/16 :goto_9

    :cond_7
    :goto_5
    if-eqz v7, :cond_8

    sget-object v4, LgV2;->b0:LgV2$a;

    move-object v7, v4

    goto :goto_6

    :cond_8
    move-object v7, v8

    :goto_6
    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, -0x1

    const-string v8, "com.stripe.android.link.ui.menus.LinkBottomSheetRow (LinkMenu.kt:59)"

    invoke-static {v3, v1, v4, v8}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_9
    sget-object v3, LK9;->a:LK9$a;

    invoke-virtual {v3}, LK9$a;->h()LK9$c;

    move-result-object v3

    invoke-static {}, Lcom/stripe/android/link/theme/ThemeKt;->getMinimumTouchTargetSize()F

    move-result v4

    invoke-static {v7, v4}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v4

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-static {v4, v8, v9, v10}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v4

    const v9, 0x2952b718

    invoke-interface {v6, v9}, LEt0;->F(I)V

    sget-object v9, Llo;->a:Llo;

    invoke-virtual {v9}, Llo;->f()Llo$d;

    move-result-object v9

    const/16 v11, 0x30

    invoke-static {v9, v3, v6, v11}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v3

    const v9, -0x4ee9b9da

    invoke-interface {v6, v9}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v9

    invoke-interface {v6, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v11

    invoke-interface {v6, v11}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v12

    invoke-interface {v6, v12}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LJq6;

    sget-object v13, LBt0;->M:LBt0$a;

    invoke-virtual {v13}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v14

    invoke-static {v4}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v4

    invoke-interface {v6}, LEt0;->v()Llm;

    move-result-object v15

    instance-of v15, v15, Llm;

    if-nez v15, :cond_a

    invoke-static {}, Lyt0;->c()V

    :cond_a
    invoke-interface {v6}, LEt0;->h()V

    invoke-interface {v6}, LEt0;->t()Z

    move-result v15

    if-eqz v15, :cond_b

    invoke-interface {v6, v14}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_7

    :cond_b
    invoke-interface {v6}, LEt0;->e()V

    :goto_7
    invoke-interface {v6}, LEt0;->L()V

    invoke-static {v6}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v14

    invoke-virtual {v13}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v14, v3, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v13}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v14, v9, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v13}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v14, v11, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v13}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v14, v12, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v6}, LEt0;->q()V

    invoke-static {v6}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    const/4 v9, 0x0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v4, v3, v6, v11}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v3, 0x7ab4aae9

    invoke-interface {v6, v3}, LEt0;->F(I)V

    const v3, -0x286e2e7f

    invoke-interface {v6, v3}, LEt0;->F(I)V

    sget-object v3, Lad5;->a:Lad5;

    const v3, -0x59408f4f

    invoke-interface {v6, v3}, LEt0;->F(I)V

    invoke-interface/range {p0 .. p0}, Lcom/stripe/android/link/ui/menus/LinkMenuItem;->getTextResId()I

    move-result v3

    invoke-static {v3, v6, v9}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v4

    const v3, -0x79a99daf

    invoke-interface {v6, v3}, LEt0;->F(I)V

    invoke-interface/range {p0 .. p0}, Lcom/stripe/android/link/ui/menus/LinkMenuItem;->isDestructive()Z

    move-result v3

    if-eqz v3, :cond_c

    sget-object v3, LTM2;->a:LTM2;

    sget v9, LTM2;->b:I

    invoke-static {v3, v6, v9}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/theme/LinkColors;->getErrorText-0d7_KjU()J

    move-result-wide v11

    goto :goto_8

    :cond_c
    sget-object v3, Lpm0;->b:Lpm0$a;

    invoke-virtual {v3}, Lpm0$a;->g()J

    move-result-wide v11

    :goto_8
    move-wide/from16 v28, v11

    invoke-interface {v6}, LEt0;->Q()V

    sget-object v3, LgV2;->b0:LgV2$a;

    invoke-static {}, Lcom/stripe/android/link/theme/ThemeKt;->getHorizontalPadding()F

    move-result v9

    invoke-static {v3, v9, v8, v5, v10}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v5

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x30

    const/16 v26, 0x0

    const v27, 0xfff8

    move-object v3, v6

    move-object/from16 v30, v7

    move-wide/from16 v6, v28

    move-object/from16 v24, v3

    invoke-static/range {v4 .. v27}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->f()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-static {}, LQt0;->Y()V

    :cond_d
    move-object/from16 v8, v30

    :goto_9
    invoke-interface {v3}, LEt0;->w()LWm5;

    move-result-object v3

    if-nez v3, :cond_e

    goto :goto_a

    :cond_e
    new-instance v4, Lcom/stripe/android/link/ui/menus/LinkMenuKt$LinkBottomSheetRow$2;

    invoke-direct {v4, v0, v8, v1, v2}, Lcom/stripe/android/link/ui/menus/LinkMenuKt$LinkBottomSheetRow$2;-><init>(Lcom/stripe/android/link/ui/menus/LinkMenuItem;LgV2;II)V

    invoke-interface {v3, v4}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_a
    return-void
.end method

.method public static final LinkMenu(Ljava/util/List;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/stripe/android/link/ui/menus/LinkMenuItem;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemPress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7c349972

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.menus.LinkMenu (LinkMenu.kt:38)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, LgV2;->b0:LgV2$a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v0

    const/16 v4, 0xa

    int-to-float v4, v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v4

    invoke-static {v0, v1, v4, v2, v3}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v0

    const v1, -0x1cd0f17e

    invoke-interface {p2, v1}, LEt0;->F(I)V

    sget-object v1, Llo;->a:Llo;

    invoke-virtual {v1}, Llo;->g()Llo$l;

    move-result-object v1

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->j()LK9$b;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, p2, v3}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v1

    const v2, -0x4ee9b9da

    invoke-interface {p2, v2}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {p2, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {p2, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {p2, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v6, LBt0;->M:LBt0$a;

    invoke-virtual {v6}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {p2}, LEt0;->v()Llm;

    move-result-object v8

    instance-of v8, v8, Llm;

    if-nez v8, :cond_1

    invoke-static {}, Lyt0;->c()V

    :cond_1
    invoke-interface {p2}, LEt0;->h()V

    invoke-interface {p2}, LEt0;->t()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {p2, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_2
    invoke-interface {p2}, LEt0;->e()V

    :goto_0
    invoke-interface {p2}, LEt0;->L()V

    invoke-static {p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v7

    invoke-virtual {v6}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v7, v1, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v2, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v4, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v5, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {p2}, LEt0;->q()V

    invoke-static {p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, p2, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {p2, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {p2, v0}, LEt0;->F(I)V

    sget-object v0, LQm0;->a:LQm0;

    const v0, 0x6d6273bc

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/ui/menus/LinkMenuItem;

    sget-object v4, LgV2;->b0:LgV2$a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    new-instance v8, Lcom/stripe/android/link/ui/menus/LinkMenuKt$LinkMenu$1$1;

    invoke-direct {v8, p1, v1}, Lcom/stripe/android/link/ui/menus/LinkMenuKt$LinkMenu$1$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/ui/menus/LinkMenuItem;)V

    const/4 v9, 0x7

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lak0;->e(LgV2;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LgV2;

    move-result-object v2

    invoke-static {v1, v2, p2, v3, v3}, Lcom/stripe/android/link/ui/menus/LinkMenuKt;->LinkBottomSheetRow(Lcom/stripe/android/link/ui/menus/LinkMenuItem;LgV2;LEt0;II)V

    goto :goto_1

    :cond_3
    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->f()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_5

    goto :goto_2

    :cond_5
    new-instance v0, Lcom/stripe/android/link/ui/menus/LinkMenuKt$LinkMenu$2;

    invoke-direct {v0, p0, p1, p3}, Lcom/stripe/android/link/ui/menus/LinkMenuKt$LinkMenu$2;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final synthetic access$LinkBottomSheetRow(Lcom/stripe/android/link/ui/menus/LinkMenuItem;LgV2;LEt0;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/ui/menus/LinkMenuKt;->LinkBottomSheetRow(Lcom/stripe/android/link/ui/menus/LinkMenuItem;LgV2;LEt0;II)V

    return-void
.end method
