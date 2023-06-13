.class public final Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a;\u0010\u0007\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lkotlin/Function0;",
        "",
        "topBar",
        "Lkotlin/Function1;",
        "LgV2;",
        "content",
        "modifier",
        "PaymentSheetScaffold",
        "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;LgV2;LEt0;II)V",
        "paymentsheet_release"
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
        "SMAP\nPaymentSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetScaffold.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,46:1\n25#2:47\n460#2,13:73\n473#2,3:87\n1057#3,6:48\n74#4,6:54\n80#4:86\n84#4:91\n75#5:60\n76#5,11:62\n89#5:90\n76#6:61\n76#7:92\n76#7:93\n*S KotlinDebug\n*F\n+ 1 PaymentSheetScaffold.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt\n*L\n24#1:47\n36#1:73,13\n36#1:87,3\n24#1:48,6\n36#1:54,6\n36#1:86\n36#1:91\n36#1:60\n36#1:62,11\n36#1:90\n36#1:61\n24#1:92\n34#1:93\n*E\n"
    }
.end annotation


# direct methods
.method public static final PaymentSheetScaffold(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;LgV2;LEt0;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LgV2;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "topBar"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x270b004

    move-object/from16 v3, p3

    invoke-interface {v3, v0}, LEt0;->u(I)LEt0;

    move-result-object v3

    and-int/lit8 v5, p5, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v5, v4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0xe

    if-nez v5, :cond_2

    invoke-interface {v3, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_2
    move v5, v4

    :goto_1
    and-int/lit8 v6, p5, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v5, v5, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v4, 0x70

    if-nez v6, :cond_5

    invoke-interface {v3, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_5
    :goto_3
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v5, v5, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v4, 0x380

    if-nez v7, :cond_8

    move-object/from16 v7, p2

    invoke-interface {v3, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v5, v8

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v7, p2

    :goto_6
    move v15, v5

    and-int/lit16 v5, v15, 0x2db

    const/16 v8, 0x92

    if-ne v5, v8, :cond_a

    invoke-interface {v3}, LEt0;->b()Z

    move-result v5

    if-nez v5, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {v3}, LEt0;->k()V

    move-object/from16 v17, v7

    goto/16 :goto_e

    :cond_a
    :goto_7
    if-eqz v6, :cond_b

    sget-object v5, LgV2;->b0:LgV2$a;

    move-object/from16 v17, v5

    goto :goto_8

    :cond_b
    move-object/from16 v17, v7

    :goto_8
    invoke-static {}, LQt0;->O()Z

    move-result v5

    if-eqz v5, :cond_c

    const/4 v5, -0x1

    const-string v6, "com.stripe.android.paymentsheet.ui.PaymentSheetScaffold (PaymentSheetScaffold.kt:16)"

    invoke-static {v0, v15, v5, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_c
    const/4 v0, 0x0

    const/4 v14, 0x1

    invoke-static {v0, v3, v0, v14}, LUp5;->a(ILEt0;II)LXp5;

    move-result-object v0

    const v5, -0x1d58f75c

    invoke-interface {v3, v5}, LEt0;->F(I)V

    invoke-interface {v3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, LEt0;->a:LEt0$a;

    invoke-virtual {v6}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_d

    new-instance v5, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$targetElevation$2$1;

    invoke-direct {v5, v0}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$targetElevation$2$1;-><init>(LXp5;)V

    invoke-static {v5}, LGM5;->c(Lkotlin/jvm/functions/Function0;)LsP5;

    move-result-object v5

    invoke-interface {v3, v5}, LEt0;->z(Ljava/lang/Object;)V

    :cond_d
    invoke-interface {v3}, LEt0;->Q()V

    check-cast v5, LsP5;

    invoke-static {v5}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt;->PaymentSheetScaffold$lambda$1(LsP5;)F

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xe

    move-object v9, v3

    invoke-static/range {v5 .. v11}, LJe;->c(FLlf;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LEt0;II)LsP5;

    move-result-object v5

    shr-int/lit8 v6, v15, 0x6

    and-int/lit8 v6, v6, 0xe

    const v7, -0x1cd0f17e

    invoke-interface {v3, v7}, LEt0;->F(I)V

    sget-object v7, Llo;->a:Llo;

    invoke-virtual {v7}, Llo;->g()Llo$l;

    move-result-object v7

    sget-object v8, LK9;->a:LK9$a;

    invoke-virtual {v8}, LK9$a;->j()LK9$b;

    move-result-object v8

    shr-int/lit8 v9, v6, 0x3

    and-int/lit8 v10, v9, 0xe

    and-int/lit8 v9, v9, 0x70

    or-int/2addr v9, v10

    invoke-static {v7, v8, v3, v9}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v7

    shl-int/lit8 v8, v6, 0x3

    and-int/lit8 v8, v8, 0x70

    const v9, -0x4ee9b9da

    invoke-interface {v3, v9}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v9

    invoke-interface {v3, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v10

    invoke-interface {v3, v10}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v11

    invoke-interface {v3, v11}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LJq6;

    sget-object v16, LBt0;->M:LBt0$a;

    invoke-virtual/range {v16 .. v16}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v14

    invoke-static/range {v17 .. v17}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v13

    shl-int/lit8 v8, v8, 0x9

    and-int/lit16 v8, v8, 0x1c00

    or-int/lit8 v8, v8, 0x6

    invoke-interface {v3}, LEt0;->v()Llm;

    move-result-object v12

    instance-of v12, v12, Llm;

    if-nez v12, :cond_e

    invoke-static {}, Lyt0;->c()V

    :cond_e
    invoke-interface {v3}, LEt0;->h()V

    invoke-interface {v3}, LEt0;->t()Z

    move-result v12

    if-eqz v12, :cond_f

    invoke-interface {v3, v14}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_9

    :cond_f
    invoke-interface {v3}, LEt0;->e()V

    :goto_9
    invoke-interface {v3}, LEt0;->L()V

    invoke-static {v3}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v12

    invoke-virtual/range {v16 .. v16}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v14

    invoke-static {v12, v7, v14}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v12, v9, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v12, v10, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v12, v11, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3}, LEt0;->q()V

    invoke-static {v3}, LMB5;->b(LEt0;)LEt0;

    move-result-object v7

    invoke-static {v7}, LMB5;->a(LEt0;)LMB5;

    move-result-object v7

    shr-int/lit8 v9, v8, 0x3

    and-int/lit8 v9, v9, 0x70

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v13, v7, v3, v9}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v7, 0x7ab4aae9

    invoke-interface {v3, v7}, LEt0;->F(I)V

    shr-int/lit8 v7, v8, 0x9

    and-int/lit8 v7, v7, 0xe

    const v8, -0x455f09d5

    invoke-interface {v3, v8}, LEt0;->F(I)V

    and-int/lit8 v7, v7, 0xb

    const/4 v8, 0x2

    if-ne v7, v8, :cond_11

    invoke-interface {v3}, LEt0;->b()Z

    move-result v7

    if-nez v7, :cond_10

    goto :goto_a

    :cond_10
    invoke-interface {v3}, LEt0;->k()V

    goto :goto_d

    :cond_11
    :goto_a
    sget-object v7, LQm0;->a:LQm0;

    shr-int/lit8 v6, v6, 0x6

    and-int/lit8 v6, v6, 0x70

    or-int/lit8 v6, v6, 0x6

    const v7, -0x727707b2

    invoke-interface {v3, v7}, LEt0;->F(I)V

    and-int/lit8 v6, v6, 0x51

    const/16 v7, 0x10

    if-ne v6, v7, :cond_13

    invoke-interface {v3}, LEt0;->b()Z

    move-result v6

    if-nez v6, :cond_12

    goto :goto_b

    :cond_12
    invoke-interface {v3}, LEt0;->k()V

    goto :goto_c

    :cond_13
    :goto_b
    invoke-static {v5}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt;->PaymentSheetScaffold$lambda$2(LsP5;)F

    move-result v12

    sget-object v14, LgV2;->b0:LgV2$a;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v14, v5}, LkI6;->a(LgV2;F)LgV2;

    move-result-object v5

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    new-instance v13, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$1$1;

    invoke-direct {v13, v1, v15}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$1$1;-><init>(Lkotlin/jvm/functions/Function2;I)V

    const v11, 0x22c60392

    const/4 v9, 0x1

    invoke-static {v3, v11, v9, v13}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v13

    const v16, 0x180006

    const/16 v20, 0x1e

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v18, v14

    move-object v14, v3

    move/from16 v19, v15

    move/from16 v15, v16

    move/from16 v16, v20

    invoke-static/range {v5 .. v16}, LNV5;->a(LgV2;Lhy5;JJLeZ;FLkotlin/jvm/functions/Function2;LEt0;II)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xe

    const/4 v11, 0x0

    move-object/from16 v5, v18

    move-object v6, v0

    invoke-static/range {v5 .. v11}, LUp5;->d(LgV2;LXp5;ZLcu1;ZILjava/lang/Object;)LgV2;

    move-result-object v0

    and-int/lit8 v5, v19, 0x70

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v0, v3, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_c
    invoke-interface {v3}, LEt0;->Q()V

    :goto_d
    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->f()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static {}, LQt0;->Y()V

    :cond_14
    :goto_e
    invoke-interface {v3}, LEt0;->w()LWm5;

    move-result-object v6

    if-nez v6, :cond_15

    goto :goto_f

    :cond_15
    new-instance v7, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$2;

    move-object v0, v7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, v17

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$2;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;LgV2;II)V

    invoke-interface {v6, v7}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_f
    return-void
.end method

.method private static final PaymentSheetScaffold$lambda$1(LsP5;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lk61;",
            ">;)F"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lk61;

    invoke-virtual {p0}, Lk61;->l()F

    move-result p0

    return p0
.end method

.method private static final PaymentSheetScaffold$lambda$2(LsP5;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lk61;",
            ">;)F"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lk61;

    invoke-virtual {p0}, Lk61;->l()F

    move-result p0

    return p0
.end method
