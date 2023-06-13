.class public final Lcom/stripe/android/link/ui/CommonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a(\u0010\u0005\u001a\u00020\u00022\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\u0008\u0003H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006*,\u0010\u0007\"\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\u0008\u00032\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\u0008\u0003\u00a8\u0006\u0008"
    }
    d2 = {
        "Lkotlin/Function1;",
        "LPm0;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "content",
        "ScrollableTopLevelColumn",
        "(Lkotlin/jvm/functions/Function3;LEt0;I)V",
        "BottomSheetContent",
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
        "SMAP\nCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Common.kt\ncom/stripe/android/link/ui/CommonKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,37:1\n67#2,6:38\n73#2:70\n77#2:114\n75#3:44\n76#3,11:46\n75#3:78\n76#3,11:80\n89#3:108\n89#3:113\n76#4:45\n76#4:79\n460#5,13:57\n460#5,13:91\n473#5,3:105\n473#5,3:110\n154#6:71\n74#7,6:72\n80#7:104\n84#7:109\n*S KotlinDebug\n*F\n+ 1 Common.kt\ncom/stripe/android/link/ui/CommonKt\n*L\n24#1:38,6\n24#1:70\n24#1:114\n24#1:44\n24#1:46,11\n27#1:78\n27#1:80,11\n27#1:108\n24#1:113\n24#1:45\n27#1:79\n24#1:57,13\n27#1:91,13\n27#1:105,3\n24#1:110,3\n30#1:71\n27#1:72,6\n27#1:104\n27#1:109\n*E\n"
    }
.end annotation


# direct methods
.method public static final ScrollableTopLevelColumn(Lkotlin/jvm/functions/Function3;LEt0;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
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

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "content"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x135a8899

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LEt0;->u(I)LEt0;

    move-result-object v3

    and-int/lit8 v4, v1, 0xe

    const/4 v5, 0x2

    if-nez v4, :cond_1

    invoke-interface {v3, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int/2addr v4, v1

    goto :goto_1

    :cond_1
    move v4, v1

    :goto_1
    and-int/lit8 v6, v4, 0xb

    if-ne v6, v5, :cond_3

    invoke-interface {v3}, LEt0;->b()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v3}, LEt0;->k()V

    goto/16 :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v5, -0x1

    const-string v6, "com.stripe.android.link.ui.ScrollableTopLevelColumn (Common.kt:20)"

    invoke-static {v2, v4, v5, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    sget-object v2, LgV2;->b0:LgV2$a;

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v5, v3, v5, v6}, LUp5;->a(ILEt0;II)LXp5;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xe

    const/4 v13, 0x0

    move-object v7, v2

    invoke-static/range {v7 .. v13}, LUp5;->d(LgV2;LXp5;ZLcu1;ZILjava/lang/Object;)LgV2;

    move-result-object v7

    const v8, 0x2bb5b5d7

    invoke-interface {v3, v8}, LEt0;->F(I)V

    sget-object v8, LK9;->a:LK9$a;

    invoke-virtual {v8}, LK9$a;->n()LK9;

    move-result-object v9

    invoke-static {v9, v5, v3, v5}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v9

    const v10, -0x4ee9b9da

    invoke-interface {v3, v10}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v11

    invoke-interface {v3, v11}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v12

    invoke-interface {v3, v12}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v13

    invoke-interface {v3, v13}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LJq6;

    sget-object v14, LBt0;->M:LBt0$a;

    invoke-virtual {v14}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v15

    invoke-static {v7}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v7

    invoke-interface {v3}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_5

    invoke-static {}, Lyt0;->c()V

    :cond_5
    invoke-interface {v3}, LEt0;->h()V

    invoke-interface {v3}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v3, v15}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_6
    invoke-interface {v3}, LEt0;->e()V

    :goto_3
    invoke-interface {v3}, LEt0;->L()V

    invoke-static {v3}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v10

    invoke-virtual {v14}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v10, v9, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v14}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v10, v11, v9}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v14}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v10, v12, v9}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v14}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v10, v13, v9}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3}, LEt0;->q()V

    invoke-static {v3}, LMB5;->b(LEt0;)LEt0;

    move-result-object v9

    invoke-static {v9}, LMB5;->a(LEt0;)LMB5;

    move-result-object v9

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v7, v9, v3, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v7, 0x7ab4aae9

    invoke-interface {v3, v7}, LEt0;->F(I)V

    const v9, -0x7f65a980

    invoke-interface {v3, v9}, LEt0;->F(I)V

    sget-object v9, Lf10;->a:Lf10;

    const v9, -0x40fc0b93

    invoke-interface {v3, v9}, LEt0;->F(I)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static {v2, v9, v6, v10}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v2

    const/16 v6, 0x14

    int-to-float v6, v6

    invoke-static {v6}, Lk61;->g(F)F

    move-result v6

    invoke-static {v2, v6}, LND3;->i(LgV2;F)LgV2;

    move-result-object v2

    invoke-virtual {v8}, LK9$a;->g()LK9$b;

    move-result-object v6

    const v8, -0x1cd0f17e

    invoke-interface {v3, v8}, LEt0;->F(I)V

    sget-object v8, Llo;->a:Llo;

    invoke-virtual {v8}, Llo;->g()Llo$l;

    move-result-object v8

    const/16 v9, 0x30

    invoke-static {v8, v6, v3, v9}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v6

    const v8, -0x4ee9b9da

    invoke-interface {v3, v8}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v8

    invoke-interface {v3, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v9

    invoke-interface {v3, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v10

    invoke-interface {v3, v10}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LJq6;

    invoke-virtual {v14}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v11

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface {v3}, LEt0;->v()Llm;

    move-result-object v12

    instance-of v12, v12, Llm;

    if-nez v12, :cond_7

    invoke-static {}, Lyt0;->c()V

    :cond_7
    invoke-interface {v3}, LEt0;->h()V

    invoke-interface {v3}, LEt0;->t()Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-interface {v3, v11}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_4

    :cond_8
    invoke-interface {v3}, LEt0;->e()V

    :goto_4
    invoke-interface {v3}, LEt0;->L()V

    invoke-static {v3}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v11

    invoke-virtual {v14}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v12

    invoke-static {v11, v6, v12}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v14}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v11, v8, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v14}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v11, v9, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v14}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v11, v10, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3}, LEt0;->q()V

    invoke-static {v3}, LMB5;->b(LEt0;)LEt0;

    move-result-object v6

    invoke-static {v6}, LMB5;->a(LEt0;)LMB5;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v6, v3, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v3, v7}, LEt0;->F(I)V

    const v2, -0x455f09d5

    invoke-interface {v3, v2}, LEt0;->F(I)V

    sget-object v2, LQm0;->a:LQm0;

    const v5, 0x73f75f63

    invoke-interface {v3, v5}, LEt0;->F(I)V

    shl-int/lit8 v4, v4, 0x3

    and-int/lit8 v4, v4, 0x70

    const/4 v5, 0x6

    or-int/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v2, v3, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->f()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->f()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static {}, LQt0;->Y()V

    :cond_9
    :goto_5
    invoke-interface {v3}, LEt0;->w()LWm5;

    move-result-object v2

    if-nez v2, :cond_a

    goto :goto_6

    :cond_a
    new-instance v3, Lcom/stripe/android/link/ui/CommonKt$ScrollableTopLevelColumn$2;

    invoke-direct {v3, v0, v1}, Lcom/stripe/android/link/ui/CommonKt$ScrollableTopLevelColumn$2;-><init>(Lkotlin/jvm/functions/Function3;I)V

    invoke-interface {v2, v3}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_6
    return-void
.end method
