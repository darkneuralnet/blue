.class public final Lcom/stripe/android/financialconnections/features/common/PartnerCalloutKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "LgV2;",
        "modifier",
        "Lcom/stripe/android/financialconnections/domain/PartnerNotice;",
        "partnerNotice",
        "Lkotlin/Function1;",
        "",
        "",
        "onClickableTextClick",
        "PartnerCallout",
        "(LgV2;Lcom/stripe/android/financialconnections/domain/PartnerNotice;Lkotlin/jvm/functions/Function1;LEt0;II)V",
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
        "SMAP\nPartnerCallout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartnerCallout.kt\ncom/stripe/android/financialconnections/features/common/PartnerCalloutKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,64:1\n154#2:65\n154#2:66\n154#2:101\n154#2:102\n154#2:103\n75#3,6:67\n81#3:99\n85#3:108\n75#4:73\n76#4,11:75\n89#4:107\n76#5:74\n76#5:100\n460#6,13:86\n473#6,3:104\n*S KotlinDebug\n*F\n+ 1 PartnerCallout.kt\ncom/stripe/android/financialconnections/features/common/PartnerCalloutKt\n*L\n32#1:65\n34#1:66\n41#1:101\n42#1:102\n44#1:103\n29#1:67,6\n29#1:99\n29#1:108\n29#1:73\n29#1:75,11\n29#1:107\n29#1:74\n38#1:100\n29#1:86,13\n29#1:104,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final PartnerCallout(LgV2;Lcom/stripe/android/financialconnections/domain/PartnerNotice;Lkotlin/jvm/functions/Function1;LEt0;II)V
    .locals 52
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "Lcom/stripe/android/financialconnections/domain/PartnerNotice;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v11, p2

    move/from16 v12, p4

    const-string v0, "partnerNotice"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClickableTextClick"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x747af233

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    and-int/lit8 v3, p5, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v5, v12, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v12, 0xe

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-interface {v1, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v12

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v12

    :goto_1
    and-int/lit8 v7, p5, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v12, 0x70

    if-nez v7, :cond_5

    invoke-interface {v1, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_5
    :goto_3
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v12, 0x380

    if-nez v7, :cond_8

    invoke-interface {v1, v11}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v6, v7

    :cond_8
    :goto_5
    and-int/lit16 v7, v6, 0x2db

    const/16 v9, 0x92

    if-ne v7, v9, :cond_a

    invoke-interface {v1}, LEt0;->b()Z

    move-result v7

    if-nez v7, :cond_9

    goto :goto_6

    :cond_9
    invoke-interface {v1}, LEt0;->k()V

    goto/16 :goto_9

    :cond_a
    :goto_6
    if-eqz v3, :cond_b

    sget-object v3, LgV2;->b0:LgV2$a;

    move-object v10, v3

    goto :goto_7

    :cond_b
    move-object v10, v5

    :goto_7
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_c

    const/4 v3, -0x1

    const-string v5, "com.stripe.android.financialconnections.features.common.PartnerCallout (PartnerCallout.kt:23)"

    invoke-static {v0, v6, v3, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_c
    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x1

    invoke-static {v10, v0, v5, v3}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v0

    const/16 v3, 0x8

    int-to-float v7, v3

    invoke-static {v7}, Lk61;->g(F)F

    move-result v7

    invoke-static {v7}, Lcc5;->d(F)Lbc5;

    move-result-object v7

    invoke-static {v0, v7}, LQk0;->a(LgV2;Lhy5;)LgV2;

    move-result-object v13

    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v7, 0x6

    invoke-virtual {v0, v1, v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getBackgroundContainer-0d7_KjU()J

    move-result-wide v14

    const/16 v16, 0x0

    const/16 v17, 0x2

    const/16 v18, 0x0

    invoke-static/range {v13 .. v18}, Lbw;->d(LgV2;JLhy5;ILjava/lang/Object;)LgV2;

    move-result-object v9

    const/16 v13, 0xc

    int-to-float v13, v13

    invoke-static {v13}, Lk61;->g(F)F

    move-result v13

    invoke-static {v9, v13}, LND3;->i(LgV2;F)LgV2;

    move-result-object v9

    const v13, 0x2952b718

    invoke-interface {v1, v13}, LEt0;->F(I)V

    sget-object v13, Llo;->a:Llo;

    invoke-virtual {v13}, Llo;->f()Llo$d;

    move-result-object v13

    sget-object v14, LK9;->a:LK9$a;

    invoke-virtual {v14}, LK9$a;->k()LK9$c;

    move-result-object v14

    const/4 v15, 0x0

    invoke-static {v13, v14, v1, v15}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v13

    const v14, -0x4ee9b9da

    invoke-interface {v1, v14}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v14

    invoke-interface {v1, v14}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v3

    invoke-interface {v1, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {v1, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v16, LBt0;->M:LBt0$a;

    invoke-virtual/range {v16 .. v16}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v4

    invoke-static {v9}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v9

    invoke-interface {v1}, LEt0;->v()Llm;

    move-result-object v8

    instance-of v8, v8, Llm;

    if-nez v8, :cond_d

    invoke-static {}, Lyt0;->c()V

    :cond_d
    invoke-interface {v1}, LEt0;->h()V

    invoke-interface {v1}, LEt0;->t()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface {v1, v4}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_8

    :cond_e
    invoke-interface {v1}, LEt0;->e()V

    :goto_8
    invoke-interface {v1}, LEt0;->L()V

    invoke-static {v1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v4

    invoke-virtual/range {v16 .. v16}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v4, v13, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v4, v14, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v4, v3, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v4, v5, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v1}, LEt0;->q()V

    invoke-static {v1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v9, v3, v1, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v3, 0x7ab4aae9

    invoke-interface {v1, v3}, LEt0;->F(I)V

    const v3, -0x286e2e7f

    invoke-interface {v1, v3}, LEt0;->F(I)V

    sget-object v3, Lad5;->a:Lad5;

    const v3, 0x7ba4b531

    invoke-interface {v1, v3}, LEt0;->F(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/domain/PartnerNotice;->getPartnerIcon()Lcom/stripe/android/financialconnections/model/Image;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/Image;->getDefault()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_f

    const-string v3, ""

    :cond_f
    move-object v13, v3

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->getLocalImageLoader()LU94;

    move-result-object v3

    invoke-interface {v1, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Lcom/stripe/android/uicore/image/StripeImageLoader;

    const/4 v3, 0x0

    sget-object v4, LgV2;->b0:LgV2$a;

    const/16 v5, 0x18

    int-to-float v5, v5

    invoke-static {v5}, Lk61;->g(F)F

    move-result v5

    invoke-static {v4, v5}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v5

    int-to-float v8, v7

    invoke-static {v8}, Lk61;->g(F)F

    move-result v8

    invoke-static {v8}, Lcc5;->d(F)Lbc5;

    move-result-object v8

    invoke-static {v5, v8}, LQk0;->a(LgV2;Lhy5;)LgV2;

    move-result-object v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    sget v5, Lcom/stripe/android/uicore/image/StripeImageLoader;->$stable:I

    shl-int/lit8 v5, v5, 0x3

    or-int/lit16 v5, v5, 0x180

    const/16 v24, 0x1f0

    move v8, v15

    move-object v15, v3

    move-object/from16 v22, v1

    move/from16 v23, v5

    invoke-static/range {v13 .. v24}, Lcom/stripe/android/uicore/image/StripeImageKt;->StripeImage(Ljava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;LgV2;LBA0;Lsm0;LnE3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;LEt0;II)V

    const/16 v3, 0x10

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    invoke-static {v4, v3}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v3

    invoke-static {v3, v1, v7}, LDN5;->a(LgV2;LEt0;I)V

    new-instance v3, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/domain/PartnerNotice;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/stripe/android/financialconnections/ui/sdui/ServerDrivenUiKt;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/stripe/android/financialconnections/ui/TextResource$Text;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v1, v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getCaption()LG26;

    move-result-object v26

    invoke-virtual {v0, v1, v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v27

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const-wide/16 v36, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const-wide/16 v41, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const-wide/16 v47, 0x0

    const/16 v49, 0x0

    const v50, 0x3fffe

    const/16 v51, 0x0

    invoke-static/range {v26 .. v51}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v5

    const/4 v4, 0x2

    new-array v4, v4, [Lkotlin/Pair;

    sget-object v9, Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;->CLICKABLE:Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;

    invoke-virtual {v0, v1, v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v13

    invoke-virtual {v13}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getCaptionEmphasized()LG26;

    move-result-object v13

    invoke-virtual {v13}, LG26;->L()LGN5;

    move-result-object v14

    invoke-virtual {v0, v1, v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v13

    invoke-virtual {v13}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextBrand-0d7_KjU()J

    move-result-wide v15

    const-wide/16 v17, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v33, 0x3ffe

    invoke-static/range {v14 .. v34}, LGN5;->b(LGN5;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILjava/lang/Object;)LGN5;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v4, v8

    sget-object v8, Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;->BOLD:Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;

    invoke-virtual {v0, v1, v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getCaptionEmphasized()LG26;

    move-result-object v9

    invoke-virtual {v9}, LG26;->L()LGN5;

    move-result-object v13

    invoke-virtual {v0, v1, v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v14

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x3ffe

    const/16 v33, 0x0

    invoke-static/range {v13 .. v33}, LGN5;->b(LGN5;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILjava/lang/Object;)LGN5;

    move-result-object v0

    invoke-static {v8, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v7, 0x1

    aput-object v0, v4, v7

    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/4 v0, 0x0

    shr-int/lit8 v4, v6, 0x3

    and-int/lit8 v4, v4, 0x70

    const/16 v6, 0x8

    or-int/lit8 v9, v4, 0x8

    const/16 v13, 0x8

    move-object/from16 v4, p2

    move-object v6, v0

    move-object v8, v1

    move-object v0, v10

    move v10, v13

    invoke-static/range {v3 .. v10}, Lcom/stripe/android/financialconnections/ui/components/TextKt;->AnnotatedText(Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function1;LG26;LgV2;Ljava/util/Map;LEt0;II)V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->f()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-static {}, LQt0;->Y()V

    :cond_10
    move-object v5, v0

    :goto_9
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v6

    if-nez v6, :cond_11

    goto :goto_a

    :cond_11
    new-instance v7, Lcom/stripe/android/financialconnections/features/common/PartnerCalloutKt$PartnerCallout$2;

    move-object v0, v7

    move-object v1, v5

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/common/PartnerCalloutKt$PartnerCallout$2;-><init>(LgV2;Lcom/stripe/android/financialconnections/domain/PartnerNotice;Lkotlin/jvm/functions/Function1;II)V

    invoke-interface {v6, v7}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_a
    return-void
.end method
