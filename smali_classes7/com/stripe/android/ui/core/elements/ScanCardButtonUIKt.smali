.class public final Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001a:\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002!\u0010\u0008\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\u0008(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "enabled",
        "Lkotlin/Function1;",
        "Landroid/content/Intent;",
        "Lkotlin/ParameterName;",
        "name",
        "intent",
        "",
        "onResult",
        "ScanCardButtonUI",
        "(ZLkotlin/jvm/functions/Function1;LEt0;I)V",
        "payments-ui-core_release"
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
        "SMAP\nScanCardButtonUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanCardButtonUI.kt\ncom/stripe/android/ui/core/elements/ScanCardButtonUIKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,75:1\n76#2:76\n76#2:98\n36#3:77\n25#3:84\n460#3,13:110\n473#3,3:127\n1057#4,6:78\n1057#4,6:85\n75#5,6:91\n81#5:123\n85#5:131\n75#6:97\n76#6,11:99\n89#6:130\n154#7:124\n154#7:125\n154#7:126\n*S KotlinDebug\n*F\n+ 1 ScanCardButtonUI.kt\ncom/stripe/android/ui/core/elements/ScanCardButtonUIKt\n*L\n32#1:76\n40#1:98\n35#1:77\n43#1:84\n40#1:110,13\n40#1:127,3\n35#1:78,6\n43#1:85,6\n40#1:91,6\n40#1:123\n40#1:131\n40#1:97\n40#1:99,11\n40#1:130\n63#1:124\n64#1:125\n69#1:126\n*E\n"
    }
.end annotation


# direct methods
.method public static final ScanCardButtonUI(ZLkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/content/Intent;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move/from16 v9, p0

    move-object/from16 v10, p1

    move/from16 v11, p3

    const-string v0, "onResult"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x4a11e154    # 2390101.0f

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v15

    and-int/lit8 v1, v11, 0xe

    const/4 v14, 0x4

    if-nez v1, :cond_1

    invoke-interface {v15, v9}, LEt0;->o(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v14

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_1
    move v1, v11

    :goto_1
    and-int/lit8 v2, v11, 0x70

    if-nez v2, :cond_3

    invoke-interface {v15, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x5b

    const/16 v12, 0x12

    if-ne v2, v12, :cond_5

    invoke-interface {v15}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LEt0;->k()V

    move-object v0, v15

    goto/16 :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.ui.core.elements.ScanCardButtonUI (ScanCardButtonUI.kt:27)"

    invoke-static {v0, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v0

    invoke-interface {v15, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    new-instance v1, Lz5;

    invoke-direct {v1}, Lz5;-><init>()V

    const v2, 0x44faf204

    invoke-interface {v15, v2}, LEt0;->F(I)V

    invoke-interface {v15, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v15}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_7

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_8

    :cond_7
    new-instance v3, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$cardScanLauncher$1$1;

    invoke-direct {v3, v10}, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$cardScanLauncher$1$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v15, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_8
    invoke-interface {v15}, LEt0;->Q()V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/16 v2, 0x8

    invoke-static {v1, v3, v15, v2}, LD5;->a(Lv5;Lkotlin/jvm/functions/Function1;LEt0;I)LTH2;

    move-result-object v1

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->h()LK9$c;

    move-result-object v13

    sget-object v8, LgV2;->b0:LgV2$a;

    const v2, -0x1d58f75c

    invoke-interface {v15, v2}, LEt0;->F(I)V

    invoke-interface {v15}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LEt0;->a:LEt0$a;

    invoke-virtual {v3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_9

    invoke-static {}, Lf62;->a()LrX2;

    move-result-object v2

    invoke-interface {v15, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_9
    invoke-interface {v15}, LEt0;->Q()V

    check-cast v2, LrX2;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    new-instance v6, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$2;

    invoke-direct {v6, v1, v0}, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$2;-><init>(LTH2;Landroid/content/Context;)V

    const/16 v7, 0x18

    const/16 v16, 0x0

    move-object v0, v8

    move-object v1, v2

    move-object v2, v3

    move/from16 v3, p0

    move-object/from16 v36, v8

    move-object/from16 v8, v16

    invoke-static/range {v0 .. v8}, Lak0;->c(LgV2;LrX2;Ly12;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LgV2;

    move-result-object v0

    const v1, 0x2952b718

    invoke-interface {v15, v1}, LEt0;->F(I)V

    sget-object v1, Llo;->a:Llo;

    invoke-virtual {v1}, Llo;->f()Llo$d;

    move-result-object v1

    const/16 v2, 0x30

    invoke-static {v1, v13, v15, v2}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v1

    const v2, -0x4ee9b9da

    invoke-interface {v15, v2}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {v15, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v3

    invoke-interface {v15, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v4

    invoke-interface {v15, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJq6;

    sget-object v5, LBt0;->M:LBt0$a;

    invoke-virtual {v5}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {v15}, LEt0;->v()Llm;

    move-result-object v7

    instance-of v7, v7, Llm;

    if-nez v7, :cond_a

    invoke-static {}, Lyt0;->c()V

    :cond_a
    invoke-interface {v15}, LEt0;->h()V

    invoke-interface {v15}, LEt0;->t()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {v15, v6}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_4

    :cond_b
    invoke-interface {v15}, LEt0;->e()V

    :goto_4
    invoke-interface {v15}, LEt0;->L()V

    invoke-static {v15}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v6

    invoke-virtual {v5}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v1, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v5}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v2, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v5}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v3, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v5}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v4, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v15}, LEt0;->q()V

    invoke-static {v15}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v1, v15, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v15, v0}, LEt0;->F(I)V

    const v0, -0x286e2e7f

    invoke-interface {v15, v0}, LEt0;->F(I)V

    sget-object v0, Lad5;->a:Lad5;

    const v0, 0x52629670

    invoke-interface {v15, v0}, LEt0;->F(I)V

    sget v0, Lcom/stripe/android/ui/core/R$drawable;->ic_photo_camera:I

    invoke-static {v0, v15, v2}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v0

    sget v1, Lcom/stripe/android/ui/core/R$string;->scan_card:I

    invoke-static {v1, v15, v2}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v13

    sget-object v3, Lsm0;->b:Lsm0$a;

    sget-object v8, LTM2;->a:LTM2;

    sget v7, LTM2;->b:I

    invoke-virtual {v8, v15, v7}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v4

    invoke-virtual {v4}, LMm0;->j()J

    move-result-wide v4

    const/4 v6, 0x0

    const/16 v16, 0x2

    const/16 v17, 0x0

    move/from16 v37, v7

    move/from16 v7, v16

    move-object/from16 v38, v8

    move-object/from16 v8, v17

    invoke-static/range {v3 .. v8}, Lsm0$a;->b(Lsm0$a;JIILjava/lang/Object;)Lsm0;

    move-result-object v18

    int-to-float v3, v12

    invoke-static {v3}, Lk61;->g(F)F

    move-result v4

    move-object/from16 v5, v36

    invoke-static {v5, v4}, LBB5;->A(LgV2;F)LgV2;

    move-result-object v4

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    invoke-static {v4, v3}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x188

    const/16 v21, 0x38

    move-object v12, v0

    move v0, v14

    move-object v14, v3

    move-object v8, v15

    move-object v15, v4

    move-object/from16 v19, v8

    invoke-static/range {v12 .. v21}, LxX1;->a(LnE3;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;LEt0;II)V

    invoke-static {v1, v8, v2}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v12

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v3

    const/4 v4, 0x0

    const/4 v0, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xe

    const/4 v1, 0x0

    move-object v2, v5

    move v5, v0

    move-object v0, v8

    move-object v8, v1

    invoke-static/range {v2 .. v8}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v13

    move/from16 v2, v37

    move-object/from16 v1, v38

    invoke-virtual {v1, v0, v2}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v3

    invoke-virtual {v3}, LMm0;->j()J

    move-result-wide v14

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-virtual {v1, v0, v2}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v1

    invoke-virtual {v1}, LGc6;->j()LG26;

    move-result-object v31

    const/16 v33, 0x30

    const/16 v34, 0x0

    const/16 v35, 0x7ff8

    move-object/from16 v32, v0

    invoke-static/range {v12 .. v35}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->f()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {}, LQt0;->Y()V

    :cond_c
    :goto_5
    invoke-interface {v0}, LEt0;->w()LWm5;

    move-result-object v0

    if-nez v0, :cond_d

    goto :goto_6

    :cond_d
    new-instance v1, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$4;

    invoke-direct {v1, v9, v10, v11}, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$4;-><init>(ZLkotlin/jvm/functions/Function1;I)V

    invoke-interface {v0, v1}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_6
    return-void
.end method
