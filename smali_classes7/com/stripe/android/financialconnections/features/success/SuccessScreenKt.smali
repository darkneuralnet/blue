.class public final Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u009d\u0001\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00102\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u0010\u0013\u001a\u00020\r2\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00102\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00102\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0010H\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0002\u001a\u008f\u0001\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00102\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00102\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00102\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0010H\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u001a;\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00102\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0010H\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u001a\'\u0010 \u001a\u00020\u00052\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0003\u00a2\u0006\u0004\u0008 \u0010!\u001a\u000f\u0010\"\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\"\u0010\u0002\u00a8\u0006#"
    }
    d2 = {
        "",
        "SuccessScreen",
        "(LEt0;I)V",
        "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;",
        "accessibleDataModel",
        "",
        "disconnectUrl",
        "",
        "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
        "accounts",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "institution",
        "businessName",
        "",
        "loading",
        "skipSuccessPane",
        "Lkotlin/Function0;",
        "onDoneClick",
        "onLinkAnotherAccountClick",
        "showLinkAnotherAccount",
        "onLearnMoreAboutDataAccessClick",
        "onDisconnectLinkClick",
        "onCloseClick",
        "SuccessContent",
        "(Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V",
        "SuccessLoading",
        "LXp5;",
        "scrollState",
        "SuccessLoaded",
        "(LXp5;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V",
        "SuccessLoadedFooter",
        "(ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V",
        "getSubtitle",
        "(Ljava/lang/String;Ljava/util/List;LEt0;I)Ljava/lang/String;",
        "SuccessScreenPreview",
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
        "SMAP\nSuccessScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuccessScreen.kt\ncom/stripe/android/financialconnections/features/success/SuccessScreenKt\n+ 2 MavericksComposeExtensions.kt\ncom/airbnb/mvrx/compose/MavericksComposeExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,342:1\n53#2:343\n54#2,15:345\n69#2,8:366\n79#2:377\n80#2,5:380\n76#3:344\n76#3:385\n76#3:393\n76#3:429\n76#3:487\n83#4,3:360\n50#4:378\n49#4:379\n460#4,13:405\n460#4,13:441\n36#4:459\n473#4,3:467\n473#4,3:472\n460#4,13:499\n473#4,3:514\n1057#5,3:363\n1060#5,3:374\n1057#5,6:460\n74#6,6:386\n80#6:418\n74#6,6:422\n80#6:454\n84#6:471\n84#6:476\n74#6,6:480\n80#6:512\n84#6:518\n75#7:392\n76#7,11:394\n75#7:428\n76#7,11:430\n89#7:470\n89#7:475\n75#7:486\n76#7,11:488\n89#7:517\n154#8:419\n154#8:420\n154#8:421\n154#8:455\n154#8:456\n154#8:457\n154#8:458\n154#8:466\n154#8:477\n154#8:478\n154#8:479\n154#8:513\n*S KotlinDebug\n*F\n+ 1 SuccessScreen.kt\ncom/stripe/android/financialconnections/features/success/SuccessScreenKt\n*L\n48#1:343\n48#1:345,15\n48#1:366,8\n48#1:377\n48#1:380,5\n48#1:344\n141#1:385\n142#1:393\n146#1:429\n219#1:487\n48#1:360,3\n48#1:378\n48#1:379\n142#1:405,13\n146#1:441,13\n182#1:459\n146#1:467,3\n142#1:472,3\n219#1:499,13\n219#1:514,3\n48#1:363,3\n48#1:374,3\n182#1:460,6\n142#1:386,6\n142#1:418\n146#1:422,6\n146#1:454\n146#1:471\n142#1:476\n219#1:480,6\n219#1:512\n219#1:518\n142#1:392\n142#1:394,11\n146#1:428\n146#1:430,11\n146#1:470\n142#1:475\n219#1:486\n219#1:488,11\n219#1:517\n151#1:419\n152#1:420\n153#1:421\n157#1:455\n162#1:456\n169#1:457\n177#1:458\n185#1:466\n221#1:477\n222#1:478\n223#1:479\n236#1:513\n*E\n"
    }
.end annotation


# direct methods
.method private static final SuccessContent(Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "Ljava/lang/String;",
            "ZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move/from16 v15, p15

    const v0, -0x19db30f

    move-object/from16 v1, p13

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v14

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "com.stripe.android.financialconnections.features.success.SuccessContent (SuccessScreen.kt:70)"

    move/from16 v13, p14

    invoke-static {v0, v13, v15, v1}, LQt0;->Z(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v13, p14

    :goto_0
    const/4 v0, 0x0

    const/4 v12, 0x1

    invoke-static {v0, v14, v0, v12}, LUp5;->a(ILEt0;II)LXp5;

    move-result-object v2

    new-instance v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$1;

    move-object/from16 v11, p12

    invoke-direct {v0, v2, v11, v15}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$1;-><init>(LXp5;Lkotlin/jvm/functions/Function0;I)V

    const v1, -0x1ff66c1e

    invoke-static {v14, v1, v12, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v10

    new-instance v9, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;

    move-object v0, v9

    move/from16 v1, p6

    move-object/from16 v3, p4

    move-object/from16 v4, p2

    move-object/from16 v5, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p3

    move/from16 v8, p5

    move-object/from16 v16, v9

    move/from16 v9, p9

    move-object/from16 v17, v10

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p8

    move-object/from16 v13, p7

    move-object/from16 v18, v14

    move/from16 v14, p14

    move/from16 v15, p15

    invoke-direct/range {v0 .. v15}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;-><init>(ZLXp5;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V

    const v0, -0x279b0662

    move-object/from16 v2, v16

    move-object/from16 v1, v18

    const/4 v3, 0x1

    invoke-static {v1, v0, v3, v2}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v2, 0x36

    move-object/from16 v3, v17

    invoke-static {v3, v0, v1, v2}, Lcom/stripe/android/financialconnections/ui/components/ScaffoldKt;->FinancialConnectionsScaffold(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v15

    if-nez v15, :cond_2

    goto :goto_1

    :cond_2
    new-instance v14, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$3;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v19, v14

    move/from16 v14, p14

    move-object/from16 v20, v15

    move/from16 v15, p15

    invoke-direct/range {v0 .. v15}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$3;-><init>(Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V

    move-object/from16 v1, v19

    move-object/from16 v0, v20

    invoke-interface {v0, v1}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method private static final SuccessLoaded(LXp5;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V
    .locals 68
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXp5;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "ZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v6, p2

    move-object/from16 v9, p8

    move/from16 v13, p13

    move/from16 v14, p14

    const v0, -0x1d40af2f

    move-object/from16 v1, p12

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v7

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "com.stripe.android.financialconnections.features.success.SuccessLoaded (SuccessScreen.kt:126)"

    invoke-static {v0, v13, v14, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Lhu0;->p()LU94;

    move-result-object v0

    invoke-interface {v7, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, LDf6;

    sget-object v10, LgV2;->b0:LgV2$a;

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v15, 0x0

    invoke-static {v10, v11, v12, v15}, LBB5;->l(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v0

    const v5, -0x1cd0f17e

    invoke-interface {v7, v5}, LEt0;->F(I)V

    sget-object v16, Llo;->a:Llo;

    invoke-virtual/range {v16 .. v16}, Llo;->g()Llo$l;

    move-result-object v1

    sget-object v17, LK9;->a:LK9$a;

    invoke-virtual/range {v17 .. v17}, LK9$a;->j()LK9$b;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v1, v2, v7, v4}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v1

    const v3, -0x4ee9b9da

    invoke-interface {v7, v3}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {v7, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v3

    invoke-interface {v7, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {v7, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v19, LBt0;->M:LBt0$a;

    invoke-virtual/range {v19 .. v19}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v15

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {v7}, LEt0;->v()Llm;

    move-result-object v11

    instance-of v11, v11, Llm;

    if-nez v11, :cond_1

    invoke-static {}, Lyt0;->c()V

    :cond_1
    invoke-interface {v7}, LEt0;->h()V

    invoke-interface {v7}, LEt0;->t()Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-interface {v7, v15}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_2
    invoke-interface {v7}, LEt0;->e()V

    :goto_0
    invoke-interface {v7}, LEt0;->L()V

    invoke-static {v7}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v11

    invoke-virtual/range {v19 .. v19}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v11, v1, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v19 .. v19}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v11, v2, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v19 .. v19}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v11, v3, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v19 .. v19}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v11, v5, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v7}, LEt0;->q()V

    invoke-static {v7}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v7, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v11, 0x7ab4aae9

    invoke-interface {v7, v11}, LEt0;->F(I)V

    const v15, -0x455f09d5

    invoke-interface {v7, v15}, LEt0;->F(I)V

    sget-object v40, LQm0;->a:LQm0;

    const v0, -0x37426339

    invoke-interface {v7, v0}, LEt0;->F(I)V

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/16 v21, 0x0

    move-object/from16 v0, v40

    move-object v1, v10

    const v12, -0x4ee9b9da

    move v15, v4

    move v4, v5

    const v11, -0x1cd0f17e

    move-object/from16 v5, v21

    invoke-static/range {v0 .. v5}, LPm0;->b(LPm0;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v23

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0xe

    const/16 v29, 0x0

    move-object/from16 v24, p0

    invoke-static/range {v23 .. v29}, LUp5;->d(LgV2;LXp5;ZLcu1;ZILjava/lang/Object;)LgV2;

    move-result-object v30

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v32

    const/16 v1, 0x18

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v31

    invoke-static {v1}, Lk61;->g(F)F

    move-result v33

    const/16 v34, 0x0

    const/16 v35, 0x8

    const/16 v36, 0x0

    invoke-static/range {v30 .. v36}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v2

    invoke-interface {v7, v11}, LEt0;->F(I)V

    invoke-virtual/range {v16 .. v16}, Llo;->g()Llo$l;

    move-result-object v3

    invoke-virtual/range {v17 .. v17}, LK9$a;->j()LK9$b;

    move-result-object v4

    invoke-static {v3, v4, v7, v15}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v3

    invoke-interface {v7, v12}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {v7, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v5

    invoke-interface {v7, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v11

    invoke-interface {v7, v11}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LJq6;

    invoke-virtual/range {v19 .. v19}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v12

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface {v7}, LEt0;->v()Llm;

    move-result-object v15

    instance-of v15, v15, Llm;

    if-nez v15, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface {v7}, LEt0;->h()V

    invoke-interface {v7}, LEt0;->t()Z

    move-result v15

    if-eqz v15, :cond_4

    invoke-interface {v7, v12}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface {v7}, LEt0;->e()V

    :goto_1
    invoke-interface {v7}, LEt0;->L()V

    invoke-static {v7}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v12

    invoke-virtual/range {v19 .. v19}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v12, v3, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v19 .. v19}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v12, v4, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v19 .. v19}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v12, v5, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v19 .. v19}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v12, v11, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v7}, LEt0;->q()V

    invoke-static {v7}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v3, v7, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v2, 0x7ab4aae9

    invoke-interface {v7, v2}, LEt0;->F(I)V

    const v2, -0x455f09d5

    invoke-interface {v7, v2}, LEt0;->F(I)V

    const v2, 0x3422f9bd

    invoke-interface {v7, v2}, LEt0;->F(I)V

    const/16 v2, 0x28

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v10, v2}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v17

    sget v2, Lcom/stripe/android/financialconnections/R$drawable;->stripe_ic_check_circle:I

    const/4 v3, 0x0

    invoke-static {v2, v7, v3}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v15

    sget-object v11, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v12, 0x6

    invoke-virtual {v11, v7, v12}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSuccess-0d7_KjU()J

    move-result-wide v18

    const/16 v16, 0x0

    const/16 v21, 0x1b8

    const/16 v22, 0x0

    move v4, v3

    const/4 v5, 0x0

    move-object/from16 v20, v7

    invoke-static/range {v15 .. v22}, LDP1;->b(LnE3;Ljava/lang/String;LgV2;JLEt0;II)V

    const/16 v2, 0x10

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v10, v2}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v2

    invoke-static {v2, v7, v12}, LDN5;->a(LgV2;LEt0;I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v10, v2, v3, v5}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v16

    sget v2, Lcom/stripe/android/financialconnections/R$string;->stripe_success_title:I

    invoke-static {v2, v7, v4}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v11, v7, v12}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getSubtitle()LG26;

    move-result-object v34

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v36, 0x30

    const/16 v37, 0x0

    const/16 v38, 0x7ffc

    move-object/from16 v35, v7

    invoke-static/range {v15 .. v38}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {v10, v0}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v0

    invoke-static {v0, v7, v12}, LDN5;->a(LgV2;LEt0;I)V

    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-static {v10, v0, v2, v5}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v16

    shr-int/lit8 v0, v13, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x40

    move-object/from16 v3, p1

    invoke-static {v3, v6, v7, v0}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt;->getSubtitle(Ljava/lang/String;Ljava/util/List;LEt0;I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v11, v7, v12}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getBody()LG26;

    move-result-object v34

    invoke-static/range {v15 .. v38}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    const v0, 0x596aafc

    invoke-interface {v7, v0}, LEt0;->F(I)V

    move-object v0, v6

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    if-eqz v0, :cond_7

    invoke-static {v1}, Lk61;->g(F)F

    move-result v0

    invoke-static {v10, v0}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v0

    invoke-static {v0, v7, v12}, LDN5;->a(LgV2;LEt0;I)V

    const v0, 0x44faf204

    invoke-interface {v7, v0}, LEt0;->F(I)V

    invoke-interface {v7, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v7}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_5

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_6

    :cond_5
    new-instance v1, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$1$1$1$1;

    invoke-direct {v1, v9}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$1$1$1$1;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-interface {v7, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_6
    invoke-interface {v7}, LEt0;->Q()V

    move-object v15, v1

    check-cast v15, Lkotlin/jvm/functions/Function0;

    shr-int/lit8 v0, v13, 0xc

    and-int/lit8 v0, v0, 0x70

    or-int/lit16 v2, v0, 0x208

    move-object/from16 v0, p3

    move-object/from16 v1, p5

    move/from16 v16, v2

    move-object/from16 v2, p2

    move-object v3, v15

    move v15, v4

    move-object v4, v7

    move-object v15, v5

    move/from16 v5, v16

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutKt;->AccessibleDataCalloutWithAccounts(Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/util/List;Lkotlin/jvm/functions/Function0;LEt0;I)V

    goto :goto_2

    :cond_7
    move-object v15, v5

    :goto_2
    invoke-interface {v7}, LEt0;->Q()V

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {v10, v0}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v0

    invoke-static {v0, v7, v12}, LDN5;->a(LgV2;LEt0;I)V

    new-instance v0, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;

    sget v1, Lcom/stripe/android/financialconnections/R$string;->success_pane_disconnect:I

    const/4 v2, 0x2

    invoke-direct {v0, v1, v15, v2, v15}, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$1$1$2;

    move-object/from16 v5, p4

    move-object/from16 v4, p9

    invoke-direct {v1, v4, v8, v5}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$1$1$2;-><init>(Lkotlin/jvm/functions/Function0;LDf6;Ljava/lang/String;)V

    invoke-virtual {v11, v7, v12}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getCaption()LG26;

    move-result-object v41

    invoke-virtual {v11, v7, v12}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v42

    const-wide/16 v44, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const-wide/16 v51, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const-wide/16 v56, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const-wide/16 v62, 0x0

    const/16 v64, 0x0

    const v65, 0x3fffe

    const/16 v66, 0x0

    invoke-static/range {v41 .. v66}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v17

    const/16 v18, 0x0

    sget-object v2, Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;->CLICKABLE:Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;

    invoke-virtual {v11, v7, v12}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getCaptionEmphasized()LG26;

    move-result-object v3

    invoke-virtual {v3}, LG26;->L()LGN5;

    move-result-object v19

    invoke-virtual {v11, v7, v12}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextBrand-0d7_KjU()J

    move-result-wide v20

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const-wide/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x3ffe

    const/16 v39, 0x0

    invoke-static/range {v19 .. v39}, LGN5;->b(LGN5;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILjava/lang/Object;)LGN5;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v19

    const/16 v21, 0x8

    const/16 v22, 0x8

    const/4 v8, 0x0

    move-object v15, v0

    move-object/from16 v16, v1

    move-object/from16 v20, v7

    invoke-static/range {v15 .. v22}, Lcom/stripe/android/financialconnections/ui/components/TextKt;->AnnotatedText(Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function1;LG26;LgV2;Ljava/util/Map;LEt0;II)V

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/4 v11, 0x2

    const/4 v12, 0x0

    move-object/from16 v0, v40

    move-object v1, v10

    move v4, v11

    move-object v5, v12

    invoke-static/range {v0 .. v5}, LPm0;->b(LPm0;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v0

    invoke-static {v0, v7, v8}, LDN5;->a(LgV2;LEt0;I)V

    invoke-interface {v7}, LEt0;->Q()V

    invoke-interface {v7}, LEt0;->Q()V

    invoke-interface {v7}, LEt0;->Q()V

    invoke-interface {v7}, LEt0;->f()V

    invoke-interface {v7}, LEt0;->Q()V

    invoke-interface {v7}, LEt0;->Q()V

    shr-int/lit8 v0, v13, 0x15

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v1, v13, 0xf

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v0, v1

    shl-int/lit8 v1, v14, 0x6

    and-int/lit16 v2, v1, 0x380

    or-int/2addr v0, v2

    and-int/lit16 v1, v1, 0x1c00

    or-int v20, v0, v1

    move/from16 v15, p7

    move/from16 v16, p6

    move-object/from16 v17, p10

    move-object/from16 v18, p11

    move-object/from16 v19, v7

    invoke-static/range {v15 .. v20}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt;->SuccessLoadedFooter(ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-interface {v7}, LEt0;->Q()V

    invoke-interface {v7}, LEt0;->Q()V

    invoke-interface {v7}, LEt0;->Q()V

    invoke-interface {v7}, LEt0;->f()V

    invoke-interface {v7}, LEt0;->Q()V

    invoke-interface {v7}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LQt0;->Y()V

    :cond_8
    invoke-interface {v7}, LEt0;->w()LWm5;

    move-result-object v15

    if-nez v15, :cond_9

    goto :goto_3

    :cond_9
    new-instance v12, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v67, v12

    move-object/from16 v12, p11

    move/from16 v13, p13

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$2;-><init>(LXp5;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V

    move-object/from16 v0, v67

    invoke-interface {v15, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_3
    return-void
.end method

.method private static final SuccessLoadedFooter(ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move/from16 v1, p0

    move/from16 v12, p1

    move/from16 v13, p5

    const v0, 0x2095ae57

    move-object/from16 v2, p4

    invoke-interface {v2, v0}, LEt0;->u(I)LEt0;

    move-result-object v14

    and-int/lit8 v2, v13, 0xe

    if-nez v2, :cond_1

    invoke-interface {v14, v1}, LEt0;->o(Z)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v13

    goto :goto_1

    :cond_1
    move v2, v13

    :goto_1
    and-int/lit8 v3, v13, 0x70

    if-nez v3, :cond_3

    invoke-interface {v14, v12}, LEt0;->o(Z)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v13, 0x380

    move-object/from16 v15, p2

    if-nez v3, :cond_5

    invoke-interface {v14, v15}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v2, v3

    :cond_5
    and-int/lit16 v3, v13, 0x1c00

    move-object/from16 v11, p3

    if-nez v3, :cond_7

    invoke-interface {v14, v11}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x800

    goto :goto_4

    :cond_6
    const/16 v3, 0x400

    :goto_4
    or-int/2addr v2, v3

    :cond_7
    move v10, v2

    and-int/lit16 v2, v10, 0x16db

    const/16 v3, 0x492

    if-ne v2, v3, :cond_9

    invoke-interface {v14}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {v14}, LEt0;->k()V

    goto/16 :goto_8

    :cond_9
    :goto_5
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.success.SuccessLoadedFooter (SuccessScreen.kt:212)"

    invoke-static {v0, v10, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_a
    sget-object v0, LgV2;->b0:LgV2$a;

    const/16 v2, 0x18

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v20

    invoke-static {v2}, Lk61;->g(F)F

    move-result v17

    invoke-static {v2}, Lk61;->g(F)F

    move-result v19

    const/16 v18, 0x0

    const/16 v21, 0x2

    const/16 v22, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v16 .. v22}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v2

    const v3, -0x1cd0f17e

    invoke-interface {v14, v3}, LEt0;->F(I)V

    sget-object v3, Llo;->a:Llo;

    invoke-virtual {v3}, Llo;->g()Llo$l;

    move-result-object v3

    sget-object v4, LK9;->a:LK9$a;

    invoke-virtual {v4}, LK9$a;->j()LK9$b;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v3, v4, v14, v5}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v3

    const v4, -0x4ee9b9da

    invoke-interface {v14, v4}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {v14, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v6

    invoke-interface {v14, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v7

    invoke-interface {v14, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LJq6;

    sget-object v8, LBt0;->M:LBt0$a;

    invoke-virtual {v8}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface {v14}, LEt0;->v()Llm;

    move-result-object v5

    instance-of v5, v5, Llm;

    if-nez v5, :cond_b

    invoke-static {}, Lyt0;->c()V

    :cond_b
    invoke-interface {v14}, LEt0;->h()V

    invoke-interface {v14}, LEt0;->t()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v14, v9}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_6

    :cond_c
    invoke-interface {v14}, LEt0;->e()V

    :goto_6
    invoke-interface {v14}, LEt0;->L()V

    invoke-static {v14}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v5

    invoke-virtual {v8}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v5, v3, v9}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v5, v4, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v5, v6, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v5, v7, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v14}, LEt0;->q()V

    invoke-static {v14}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v3, v14, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v2, 0x7ab4aae9

    invoke-interface {v14, v2}, LEt0;->F(I)V

    const v2, -0x455f09d5

    invoke-interface {v14, v2}, LEt0;->F(I)V

    sget-object v2, LQm0;->a:LQm0;

    const v2, 0x73a2584d

    invoke-interface {v14, v2}, LEt0;->F(I)V

    const v2, -0x2c3568b5

    invoke-interface {v14, v2}, LEt0;->F(I)V

    const/4 v9, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x1

    if-eqz v1, :cond_d

    xor-int/lit8 v6, v12, 0x1

    sget-object v4, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Secondary;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Secondary;

    invoke-static {v0, v8, v7, v9}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v3

    const/4 v5, 0x0

    const/16 v16, 0x0

    sget-object v2, Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt;->getLambda-1$financial_connections_release()Lkotlin/jvm/functions/Function3;

    move-result-object v17

    shr-int/lit8 v2, v10, 0x6

    and-int/lit8 v2, v2, 0xe

    const v18, 0x1801b0

    or-int v18, v2, v18

    const/16 v19, 0x28

    move-object/from16 v2, p2

    move/from16 v7, v16

    move-object/from16 v8, v17

    move-object v9, v14

    move/from16 v16, v10

    move/from16 v10, v18

    move/from16 v11, v19

    invoke-static/range {v2 .. v11}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt;->FinancialConnectionsButton(Lkotlin/jvm/functions/Function0;LgV2;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;LEt0;II)V

    const/16 v2, 0x8

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v0, v2}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v2, v14, v3}, LDN5;->a(LgV2;LEt0;I)V

    goto :goto_7

    :cond_d
    move/from16 v16, v10

    :goto_7
    invoke-interface {v14}, LEt0;->Q()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v3, v4, v2}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget-object v0, Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt;->getLambda-2$financial_connections_release()Lkotlin/jvm/functions/Function3;

    move-result-object v8

    shr-int/lit8 v0, v16, 0x9

    and-int/lit8 v0, v0, 0xe

    const v2, 0x180030

    or-int/2addr v0, v2

    shl-int/lit8 v2, v16, 0xc

    const/high16 v7, 0x70000

    and-int/2addr v2, v7

    or-int v10, v0, v2

    const/16 v11, 0x1c

    move-object/from16 v2, p3

    move/from16 v7, p1

    move-object v9, v14

    invoke-static/range {v2 .. v11}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt;->FinancialConnectionsButton(Lkotlin/jvm/functions/Function0;LgV2;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-interface {v14}, LEt0;->Q()V

    invoke-interface {v14}, LEt0;->Q()V

    invoke-interface {v14}, LEt0;->Q()V

    invoke-interface {v14}, LEt0;->f()V

    invoke-interface {v14}, LEt0;->Q()V

    invoke-interface {v14}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, LQt0;->Y()V

    :cond_e
    :goto_8
    invoke-interface {v14}, LEt0;->w()LWm5;

    move-result-object v6

    if-nez v6, :cond_f

    goto :goto_9

    :cond_f
    new-instance v7, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoadedFooter$2;

    move-object v0, v7

    move/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoadedFooter$2;-><init>(ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v6, v7}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_9
    return-void
.end method

.method private static final SuccessLoading(LEt0;I)V
    .locals 7

    const v0, -0x16fbd191

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

    const-string v2, "com.stripe.android.financialconnections.features.success.SuccessLoading (SuccessScreen.kt:117)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const/4 v1, 0x0

    sget v0, Lcom/stripe/android/financialconnections/R$string;->stripe_success_pane_skip_title:I

    const/4 v2, 0x0

    invoke-static {v0, p0, v2}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v0

    sget v3, Lcom/stripe/android/financialconnections/R$string;->stripe_success_pane_skip_desc:I

    invoke-static {v3, p0, v2}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v2, v0

    move-object v4, p0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt;->LoadingContent(LgV2;Ljava/lang/String;Ljava/lang/String;LEt0;II)V

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoading$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoading$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final SuccessScreen(LEt0;I)V
    .locals 25

    move/from16 v0, p1

    const v1, -0x63f988cb

    move-object/from16 v2, p0

    invoke-interface {v2, v1}, LEt0;->u(I)LEt0;

    move-result-object v15

    if-nez v0, :cond_1

    invoke-interface {v15}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v15}, LEt0;->k()V

    move-object v1, v15

    goto/16 :goto_8

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.success.SuccessScreen (SuccessScreen.kt:46)"

    invoke-static {v1, v0, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const v1, 0x1e871a90

    invoke-interface {v15, v1}, LEt0;->F(I)V

    invoke-static {}, Landroidx/compose/ui/platform/h;->i()LU94;

    move-result-object v1

    invoke-interface {v15, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLifecycleOwner;

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v2

    invoke-interface {v15, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-static {v2}, LtN2;->f(Landroid/content/Context;)Landroidx/activity/ComponentActivity;

    move-result-object v4

    if-eqz v4, :cond_14

    instance-of v2, v1, LXr6;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    move-object v2, v1

    check-cast v2, LXr6;

    goto :goto_1

    :cond_3
    move-object v2, v3

    :goto_1
    if-eqz v2, :cond_13

    instance-of v5, v1, LPi5;

    if-eqz v5, :cond_4

    move-object v5, v1

    check-cast v5, LPi5;

    goto :goto_2

    :cond_4
    move-object v5, v3

    :goto_2
    if-eqz v5, :cond_12

    invoke-interface {v5}, LPi5;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v5

    const-class v6, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;

    invoke-static {v6}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v11

    invoke-static {}, Landroidx/compose/ui/platform/h;->k()LU94;

    move-result-object v6

    invoke-interface {v15, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    const/4 v7, 0x4

    new-array v8, v7, [Ljava/lang/Object;

    const/4 v12, 0x0

    aput-object v1, v8, v12

    const/4 v13, 0x1

    aput-object v4, v8, v13

    const/4 v9, 0x2

    aput-object v2, v8, v9

    const/4 v9, 0x3

    aput-object v5, v8, v9

    const v9, -0x21de6e89

    invoke-interface {v15, v9}, LEt0;->F(I)V

    move v9, v12

    move v10, v9

    :goto_3
    if-ge v9, v7, :cond_5

    aget-object v14, v8, v9

    invoke-interface {v15, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v10, v14

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_5
    invoke-interface {v15}, LEt0;->G()Ljava/lang/Object;

    move-result-object v7

    if-nez v10, :cond_6

    sget-object v8, LEt0;->a:LEt0$a;

    invoke-virtual {v8}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v7, v8, :cond_c

    :cond_6
    instance-of v7, v1, Landroidx/fragment/app/Fragment;

    if-eqz v7, :cond_7

    check-cast v1, Landroidx/fragment/app/Fragment;

    goto :goto_4

    :cond_7
    move-object v1, v3

    :goto_4
    if-nez v1, :cond_8

    invoke-static {v6}, LtN2;->g(Landroid/view/View;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    :cond_8
    move-object v6, v1

    const-string v1, "mavericks:arg"

    if-eqz v6, :cond_a

    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    goto :goto_5

    :cond_9
    move-object v5, v3

    :goto_5
    new-instance v1, LFy1;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x18

    const/4 v10, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v10}, LFy1;-><init>(Landroidx/activity/ComponentActivity;Ljava/lang/Object;Landroidx/fragment/app/Fragment;LXr6;Landroidx/savedstate/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v4}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v6

    if-eqz v6, :cond_b

    invoke-virtual {v6, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    :cond_b
    new-instance v1, Lr6;

    invoke-direct {v1, v4, v3, v2, v5}, Lr6;-><init>(Landroidx/activity/ComponentActivity;Ljava/lang/Object;LXr6;Landroidx/savedstate/a;)V

    :goto_6
    move-object v7, v1

    invoke-interface {v15, v7}, LEt0;->z(Ljava/lang/Object;)V

    :cond_c
    invoke-interface {v15}, LEt0;->Q()V

    move-object v1, v7

    check-cast v1, LPr6;

    const v2, 0x1e7b2b64

    invoke-interface {v15, v2}, LEt0;->F(I)V

    invoke-interface {v15, v11}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v15, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {v15}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_d

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_e

    :cond_d
    sget-object v16, LYN2;->a:LYN2;

    invoke-static {v11}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v17

    const-class v18, Lcom/stripe/android/financialconnections/features/success/SuccessState;

    invoke-static {v11}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "keyFactory?.invoke() ?: viewModelClass.java.name"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x30

    const/16 v24, 0x0

    move-object/from16 v19, v1

    move-object/from16 v20, v2

    invoke-static/range {v16 .. v24}, LYN2;->c(LYN2;Ljava/lang/Class;Ljava/lang/Class;LPr6;Ljava/lang/String;ZLBN2;ILjava/lang/Object;)LRN2;

    move-result-object v3

    invoke-interface {v15, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_e
    invoke-interface {v15}, LEt0;->Q()V

    check-cast v3, LRN2;

    invoke-interface {v15}, LEt0;->Q()V

    check-cast v3, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;

    invoke-static {v15, v12}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModelKt;->parentViewModel(LEt0;I)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object v1

    const/16 v2, 0x8

    invoke-static {v3, v15, v2}, LtN2;->b(LRN2;LEt0;I)LsP5;

    move-result-object v2

    sget-object v4, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessScreen$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessScreen$1;

    const/16 v5, 0x36

    invoke-static {v13, v4, v15, v5, v12}, LSv;->a(ZLkotlin/jvm/functions/Function0;LEt0;II)V

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/financialconnections/features/success/SuccessState;

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/features/success/SuccessState;->getPayload()Ldp;

    move-result-object v4

    invoke-virtual {v4}, Ldp;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;

    if-nez v4, :cond_f

    move-object v1, v15

    goto/16 :goto_7

    :cond_f
    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->getAccessibleData()Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    move-result-object v5

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->getDisconnectUrl()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->getAccounts()Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->getData()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v8

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->getBusinessName()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/financialconnections/features/success/SuccessState;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/features/success/SuccessState;->getCompleteSession()Ldp;

    move-result-object v2

    instance-of v10, v2, LAt2;

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->getSkipSuccessPane()Z

    move-result v11

    new-instance v12, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessScreen$2$1;

    invoke-direct {v12, v3}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessScreen$2$1;-><init>(Ljava/lang/Object;)V

    new-instance v13, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessScreen$2$2;

    invoke-direct {v13, v3}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessScreen$2$2;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->getShowLinkAnotherAccount()Z

    move-result v14

    new-instance v4, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessScreen$2$3;

    invoke-direct {v4, v3}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessScreen$2$3;-><init>(Ljava/lang/Object;)V

    new-instance v2, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessScreen$2$4;

    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessScreen$2$4;-><init>(Ljava/lang/Object;)V

    new-instance v3, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessScreen$2$5;

    invoke-direct {v3, v1}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessScreen$2$5;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)V

    const/16 v16, 0x208

    const/16 v17, 0x0

    move-object v1, v2

    move-object v2, v5

    move-object/from16 v18, v3

    move-object v3, v6

    move-object/from16 v19, v4

    move-object v4, v7

    move-object v5, v8

    move-object v6, v9

    move v7, v10

    move v8, v11

    move-object v9, v12

    move-object v10, v13

    move v11, v14

    move-object/from16 v12, v19

    move-object v13, v1

    move-object/from16 v14, v18

    move-object v1, v15

    invoke-static/range {v2 .. v17}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt;->SuccessContent(Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V

    :goto_7
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-static {}, LQt0;->Y()V

    :cond_10
    :goto_8
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v1

    if-nez v1, :cond_11

    goto :goto_9

    :cond_11
    new-instance v2, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessScreen$3;

    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessScreen$3;-><init>(I)V

    invoke-interface {v1, v2}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_9
    return-void

    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner must be a SavedStateRegistryOwner!"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner must be a ViewModelStoreOwner!"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Composable is not hosted in a ComponentActivity!"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final SuccessScreenPreview(LEt0;I)V
    .locals 4

    const v0, -0x6003e5d1

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

    const-string v2, "com.stripe.android.financialconnections.features.success.SuccessScreenPreview (SuccessScreen.kt:269)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt;->getLambda-3$financial_connections_release()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v3, v0, p0, v1, v2}, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt;->FinancialConnectionsPreview(ZLkotlin/jvm/functions/Function2;LEt0;II)V

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessScreenPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessScreenPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final synthetic access$SuccessContent(Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V
    .locals 0

    invoke-static/range {p0 .. p15}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt;->SuccessContent(Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V

    return-void
.end method

.method public static final synthetic access$SuccessLoaded(LXp5;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V
    .locals 0

    invoke-static/range {p0 .. p14}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt;->SuccessLoaded(LXp5;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V

    return-void
.end method

.method public static final synthetic access$SuccessLoadedFooter(ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt;->SuccessLoadedFooter(ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$SuccessLoading(LEt0;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt;->SuccessLoading(LEt0;I)V

    return-void
.end method

.method private static final getSubtitle(Ljava/lang/String;Ljava/util/List;LEt0;I)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;",
            "LEt0;",
            "I)",
            "Ljava/lang/String;"
        }
    .end annotation

    const v0, 0x3c2ae412

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.success.getSubtitle (SuccessScreen.kt:250)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const/4 p3, 0x0

    if-eqz p0, :cond_1

    const v0, -0x3269b9e7    # -3.1514704E8f

    invoke-interface {p2, v0}, LEt0;->F(I)V

    sget v0, Lcom/stripe/android/financialconnections/R$plurals;->stripe_success_desc:I

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p0, v1, p3

    const/16 p0, 0x200

    invoke-static {v0, p1, v1, p2, p0}, LfS5;->b(II[Ljava/lang/Object;LEt0;I)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p2}, LEt0;->Q()V

    goto :goto_0

    :cond_1
    const p0, -0x3269b968

    invoke-interface {p2, p0}, LEt0;->F(I)V

    sget p0, Lcom/stripe/android/financialconnections/R$plurals;->stripe_success_desc_no_business:I

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    invoke-static {p0, p1, p2, p3}, LfS5;->a(IILEt0;I)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p2}, LEt0;->Q()V

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {p2}, LEt0;->Q()V

    return-object p0
.end method
