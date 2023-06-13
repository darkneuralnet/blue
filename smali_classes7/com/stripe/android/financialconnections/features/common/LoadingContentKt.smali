.class public final Lcom/stripe/android/financialconnections/features/common/LoadingContentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a1\u0010\n\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0008H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u000f\u0010\u000c\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lkotlin/Function1;",
        "La30;",
        "",
        "content",
        "LoadingShimmerEffect",
        "(Lkotlin/jvm/functions/Function3;LEt0;I)V",
        "LgV2;",
        "modifier",
        "",
        "title",
        "LoadingContent",
        "(LgV2;Ljava/lang/String;Ljava/lang/String;LEt0;II)V",
        "LoadingSpinner",
        "(LEt0;I)V",
        "LoadingSpinnerPreview",
        "",
        "LOADING_SPINNER_ROTATION_MS",
        "I",
        "financial-connections_release"
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
        "SMAP\nLoadingContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadingContent.kt\ncom/stripe/android/financialconnections/features/common/LoadingContentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,111:1\n154#2:112\n154#2:146\n154#2:147\n154#2:148\n74#3,6:113\n80#3:145\n84#3:153\n75#4:119\n76#4,11:121\n89#4:152\n76#5:120\n460#6,13:132\n473#6,3:149\n36#6:154\n1057#7,6:155\n76#8:161\n*S KotlinDebug\n*F\n+ 1 LoadingContent.kt\ncom/stripe/android/financialconnections/features/common/LoadingContentKt\n*L\n66#1:112\n68#1:146\n71#1:147\n78#1:148\n64#1:113,6\n64#1:145\n64#1:153\n64#1:119\n64#1:121,11\n64#1:152\n64#1:120\n64#1:132,13\n64#1:149,3\n99#1:154\n99#1:155,6\n90#1:161\n*E\n"
    }
.end annotation


# static fields
.field private static final LOADING_SPINNER_ROTATION_MS:I = 0x3e8


# direct methods
.method public static final LoadingContent(LgV2;Ljava/lang/String;Ljava/lang/String;LEt0;II)V
    .locals 31

    move/from16 v4, p4

    const v0, 0x12913d82

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    and-int/lit8 v2, p5, 0x1

    const/4 v3, 0x2

    if-eqz v2, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0xe

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-interface {v1, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    move v6, v3

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, p5, 0x2

    const/16 v14, 0x10

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v4, 0x70

    if-nez v8, :cond_5

    move-object/from16 v8, p1

    invoke-interface {v1, v8}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    move v9, v14

    :goto_2
    or-int/2addr v6, v9

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v8, p1

    :goto_4
    and-int/lit8 v9, p5, 0x4

    if-eqz v9, :cond_6

    or-int/lit16 v6, v6, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v10, v4, 0x380

    if-nez v10, :cond_8

    move-object/from16 v10, p2

    invoke-interface {v1, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_5

    :cond_7
    const/16 v11, 0x80

    :goto_5
    or-int/2addr v6, v11

    goto :goto_7

    :cond_8
    :goto_6
    move-object/from16 v10, p2

    :goto_7
    move v15, v6

    and-int/lit16 v6, v15, 0x2db

    const/16 v11, 0x92

    if-ne v6, v11, :cond_a

    invoke-interface {v1}, LEt0;->b()Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_8

    :cond_9
    invoke-interface {v1}, LEt0;->k()V

    move-object v2, v8

    move-object v3, v10

    goto/16 :goto_e

    :cond_a
    :goto_8
    if-eqz v2, :cond_b

    sget-object v2, LgV2;->b0:LgV2$a;

    goto :goto_9

    :cond_b
    move-object v2, v5

    :goto_9
    const/4 v5, 0x0

    if-eqz v7, :cond_c

    move-object/from16 v29, v5

    goto :goto_a

    :cond_c
    move-object/from16 v29, v8

    :goto_a
    if-eqz v9, :cond_d

    move-object/from16 v30, v5

    goto :goto_b

    :cond_d
    move-object/from16 v30, v10

    :goto_b
    invoke-static {}, LQt0;->O()Z

    move-result v6

    if-eqz v6, :cond_e

    const/4 v6, -0x1

    const-string v7, "com.stripe.android.financialconnections.features.common.LoadingContent (LoadingContent.kt:58)"

    invoke-static {v0, v15, v6, v7}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_e
    const/16 v0, 0x18

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    const/4 v6, 0x0

    invoke-static {v2, v0, v6, v3, v5}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v0

    const v3, -0x1cd0f17e

    invoke-interface {v1, v3}, LEt0;->F(I)V

    sget-object v3, Llo;->a:Llo;

    invoke-virtual {v3}, Llo;->g()Llo$l;

    move-result-object v3

    sget-object v5, LK9;->a:LK9$a;

    invoke-virtual {v5}, LK9$a;->j()LK9$b;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v3, v5, v1, v6}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v3

    const v5, -0x4ee9b9da

    invoke-interface {v1, v5}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v5

    invoke-interface {v1, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v7

    invoke-interface {v1, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v8

    invoke-interface {v1, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LJq6;

    sget-object v9, LBt0;->M:LBt0$a;

    invoke-virtual {v9}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v10

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {v1}, LEt0;->v()Llm;

    move-result-object v11

    instance-of v11, v11, Llm;

    if-nez v11, :cond_f

    invoke-static {}, Lyt0;->c()V

    :cond_f
    invoke-interface {v1}, LEt0;->h()V

    invoke-interface {v1}, LEt0;->t()Z

    move-result v11

    if-eqz v11, :cond_10

    invoke-interface {v1, v10}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_c

    :cond_10
    invoke-interface {v1}, LEt0;->e()V

    :goto_c
    invoke-interface {v1}, LEt0;->L()V

    invoke-static {v1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v10

    invoke-virtual {v9}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v11

    invoke-static {v10, v3, v11}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v9}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v10, v5, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v9}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v10, v7, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v9}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v10, v8, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v1}, LEt0;->q()V

    invoke-static {v1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v3, v1, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v1, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {v1, v0}, LEt0;->F(I)V

    sget-object v0, LQm0;->a:LQm0;

    const v0, -0x4eaa6708

    invoke-interface {v1, v0}, LEt0;->F(I)V

    sget-object v0, LgV2;->b0:LgV2$a;

    const/16 v3, 0x8

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    invoke-static {v0, v3}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v3

    const/4 v5, 0x6

    invoke-static {v3, v1, v5}, LDN5;->a(LgV2;LEt0;I)V

    invoke-static {v1, v6}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt;->LoadingSpinner(LEt0;I)V

    const v3, 0x2f8e9c80

    invoke-interface {v1, v3}, LEt0;->F(I)V

    if-eqz v29, :cond_11

    int-to-float v3, v14

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    invoke-static {v0, v3}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v3

    invoke-static {v3, v1, v5}, LDN5;->a(LgV2;LEt0;I)V

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    move v3, v15

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    sget-object v6, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    invoke-virtual {v6, v1, v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getSubtitle()LG26;

    move-result-object v24

    shr-int/lit8 v6, v3, 0x3

    and-int/lit8 v26, v6, 0xe

    const/16 v27, 0x0

    const/16 v28, 0x7ffe

    move v6, v5

    move-object/from16 v5, v29

    move-object/from16 v25, v1

    move-object/from16 p3, v2

    move v2, v6

    const/4 v6, 0x0

    invoke-static/range {v5 .. v28}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    goto :goto_d

    :cond_11
    move-object/from16 p3, v2

    move v2, v5

    move v3, v15

    :goto_d
    invoke-interface {v1}, LEt0;->Q()V

    if-eqz v30, :cond_12

    const/16 v5, 0x10

    int-to-float v5, v5

    invoke-static {v5}, Lk61;->g(F)F

    move-result v5

    invoke-static {v0, v5}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v0

    invoke-static {v0, v1, v2}, LDN5;->a(LgV2;LEt0;I)V

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    invoke-virtual {v0, v1, v2}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getBody()LG26;

    move-result-object v24

    shr-int/lit8 v0, v3, 0x6

    and-int/lit8 v26, v0, 0xe

    const/16 v27, 0x0

    const/16 v28, 0x7ffe

    move-object/from16 v5, v30

    move-object/from16 v25, v1

    invoke-static/range {v5 .. v28}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    :cond_12
    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->f()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-static {}, LQt0;->Y()V

    :cond_13
    move-object/from16 v5, p3

    move-object/from16 v2, v29

    move-object/from16 v3, v30

    :goto_e
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v6

    if-nez v6, :cond_14

    goto :goto_f

    :cond_14
    new-instance v7, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$LoadingContent$2;

    move-object v0, v7

    move-object v1, v5

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$LoadingContent$2;-><init>(LgV2;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-interface {v6, v7}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_f
    return-void
.end method

.method public static final LoadingShimmerEffect(Lkotlin/jvm/functions/Function3;LEt0;I)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "La30;",
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

    const v2, -0x31b4ccbd

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LEt0;->u(I)LEt0;

    move-result-object v9

    and-int/lit8 v3, v1, 0xe

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-interface {v9, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v1

    move v10, v3

    goto :goto_1

    :cond_1
    move v10, v1

    :goto_1
    and-int/lit8 v3, v10, 0xb

    if-ne v3, v4, :cond_3

    invoke-interface {v9}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v9}, LEt0;->k()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v5, "com.stripe.android.financialconnections.features.common.LoadingShimmerEffect (LoadingContent.kt:27)"

    invoke-static {v2, v10, v3, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    const/4 v2, 0x3

    new-array v3, v2, [Lpm0;

    sget-object v5, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v6, 0x6

    invoke-virtual {v5, v9, v6}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getBackgroundContainer-0d7_KjU()J

    move-result-wide v7

    invoke-static {v7, v8}, Lpm0;->i(J)Lpm0;

    move-result-object v7

    const/4 v8, 0x0

    aput-object v7, v3, v8

    invoke-virtual {v5, v9, v6}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextWhite-0d7_KjU()J

    move-result-wide v11

    invoke-static {v11, v12}, Lpm0;->i(J)Lpm0;

    move-result-object v7

    const/4 v11, 0x1

    aput-object v7, v3, v11

    invoke-virtual {v5, v9, v6}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getBackgroundContainer-0d7_KjU()J

    move-result-wide v5

    invoke-static {v5, v6}, Lpm0;->i(J)Lpm0;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    invoke-static {v9, v8}, LK12;->e(LEt0;I)LJ12;

    move-result-object v3

    const/4 v5, 0x0

    const/high16 v6, 0x447a0000    # 1000.0f

    invoke-static {}, Li91;->a()Lh91;

    move-result-object v7

    const/4 v11, 0x0

    const/16 v13, 0x3e8

    invoke-static {v13, v8, v7, v4, v11}, Lmf;->k(IILh91;ILjava/lang/Object;)Ltb6;

    move-result-object v14

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x6

    const/16 v19, 0x0

    invoke-static/range {v14 .. v19}, Lmf;->d(Lh81;LeG4;JILjava/lang/Object;)LI12;

    move-result-object v7

    sget v4, LJ12;->f:I

    or-int/lit16 v4, v4, 0x1b0

    sget v8, LI12;->d:I

    shl-int/lit8 v8, v8, 0x9

    or-int/2addr v8, v4

    move v4, v5

    move v5, v6

    move-object v6, v7

    move-object v7, v9

    invoke-static/range {v3 .. v8}, LK12;->a(LJ12;FFLI12;LEt0;I)LsP5;

    move-result-object v3

    sget-object v11, La30;->b:La30$a;

    const/high16 v4, 0x43480000    # 200.0f

    invoke-static {v4, v4}, LGe3;->a(FF)J

    move-result-wide v13

    invoke-interface {v3}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-interface {v3}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v4, v3}, LGe3;->a(FF)J

    move-result-wide v15

    const/16 v17, 0x0

    const/16 v18, 0x8

    invoke-static/range {v11 .. v19}, La30$a;->b(La30$a;Ljava/util/List;JJIILjava/lang/Object;)La30;

    move-result-object v3

    shl-int/lit8 v2, v10, 0x3

    and-int/lit8 v2, v2, 0x70

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v3, v9, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_3
    invoke-interface {v9}, LEt0;->w()LWm5;

    move-result-object v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    new-instance v3, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$LoadingShimmerEffect$1;

    invoke-direct {v3, v0, v1}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$LoadingShimmerEffect$1;-><init>(Lkotlin/jvm/functions/Function3;I)V

    invoke-interface {v2, v3}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void
.end method

.method public static final LoadingSpinner(LEt0;I)V
    .locals 13

    const v0, 0x29d5248b

    invoke-interface {p0, v0}, LEt0;->u(I)LEt0;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LEt0;->k()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.common.LoadingSpinner (LoadingContent.kt:87)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const/4 v0, 0x0

    invoke-static {p0, v0}, LK12;->e(LEt0;I)LJ12;

    move-result-object v1

    const/4 v2, 0x0

    const/high16 v3, 0x43b40000    # 360.0f

    const/16 v4, 0x3e8

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static {v4, v0, v6, v5, v6}, Lmf;->k(IILh91;ILjava/lang/Object;)Ltb6;

    move-result-object v7

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, Lmf;->d(Lh81;LeG4;JILjava/lang/Object;)LI12;

    move-result-object v4

    sget v5, LJ12;->f:I

    or-int/lit16 v5, v5, 0x1b0

    sget v6, LI12;->d:I

    shl-int/lit8 v6, v6, 0x9

    or-int/2addr v6, v5

    move-object v5, p0

    invoke-static/range {v1 .. v6}, LK12;->a(LJ12;FFLI12;LEt0;I)LsP5;

    move-result-object v1

    sget v2, Lcom/stripe/android/financialconnections/R$drawable;->stripe_ic_loading_spinner:I

    invoke-static {v2, p0, v0}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v0

    sget-object v2, LgV2;->b0:LgV2$a;

    const v3, 0x44faf204

    invoke-interface {p0, v3}, LEt0;->F(I)V

    invoke-interface {p0, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p0}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_3

    sget-object v3, LEt0;->a:LEt0$a;

    invoke-virtual {v3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_4

    :cond_3
    new-instance v4, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$LoadingSpinner$1$1;

    invoke-direct {v4, v1}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$LoadingSpinner$1$1;-><init>(LsP5;)V

    invoke-interface {p0, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p0}, LEt0;->Q()V

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v4}, Landroidx/compose/ui/graphics/b;->a(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v3

    const-string v2, "Loading spinner."

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v9, 0x38

    const/16 v10, 0x78

    move-object v1, v0

    move-object v8, p0

    invoke-static/range {v1 .. v10}, LxX1;->a(LnE3;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_1
    invoke-interface {p0}, LEt0;->w()LWm5;

    move-result-object p0

    if-nez p0, :cond_6

    goto :goto_2

    :cond_6
    new-instance v0, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$LoadingSpinner$2;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$LoadingSpinner$2;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method private static final LoadingSpinner$lambda$1(LsP5;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/Float;",
            ">;)F"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method public static final LoadingSpinnerPreview(LEt0;I)V
    .locals 3

    const v0, -0x74830da7

    invoke-interface {p0, v0}, LEt0;->u(I)LEt0;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.common.LoadingSpinnerPreview (LoadingContent.kt:107)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt;->LoadingSpinner(LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    invoke-interface {p0}, LEt0;->w()LWm5;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$LoadingSpinnerPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt$LoadingSpinnerPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final synthetic access$LoadingSpinner$lambda$1(LsP5;)F
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt;->LoadingSpinner$lambda$1(LsP5;)F

    move-result p0

    return p0
.end method
