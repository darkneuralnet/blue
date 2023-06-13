.class public final Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u00d3\u0001\u0010\u0017\u001a\u00020\u00002\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0016\u0010\u0008\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0006\u0010\n\u001a\u00020\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00102\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00142\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0014H\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a\u00c7\u0001\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000c2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000b2\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00102\u0016\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00102\u0016\u0010\u0008\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u0010\n\u001a\u00020\t2\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0014H\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001a%\u0010\u001d\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0014H\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u001aa\u0010%\u001a\u00020\u00002\u0016\u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00142\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u0010H\u0003\u00a2\u0006\u0004\u0008%\u0010&\u001a\u000f\u0010\'\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\'\u0010\u0002\u001a\u000f\u0010(\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008(\u0010\u0002\u00a8\u0006)"
    }
    d2 = {
        "",
        "ManualEntryScreen",
        "(LEt0;I)V",
        "Lkotlin/Pair;",
        "",
        "",
        "routing",
        "account",
        "accountConfirm",
        "",
        "isValidForm",
        "Ldp;",
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;",
        "payload",
        "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
        "linkPaymentAccountStatus",
        "Lkotlin/Function1;",
        "onRoutingEntered",
        "onAccountEntered",
        "onAccountConfirmEntered",
        "Lkotlin/Function0;",
        "onSubmit",
        "onCloseClick",
        "ManualEntryContent",
        "(Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;ZLdp;Ldp;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V",
        "LXp5;",
        "scrollState",
        "ManualEntryLoaded",
        "(LXp5;Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;Ldp;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;LEt0;II)V",
        "ManualEntryFooter",
        "(ZLkotlin/jvm/functions/Function0;LEt0;I)V",
        "inputWithError",
        "label",
        "testTag",
        "hint",
        "onFocusGained",
        "onInputChanged",
        "InputWithError",
        "(Lkotlin/Pair;ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V",
        "ManualEntryScreenPreview",
        "ManualEntryScreenErrorPreview",
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
        "SMAP\nManualEntryScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManualEntryScreen.kt\ncom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt\n+ 2 MavericksComposeExtensions.kt\ncom/airbnb/mvrx/compose/MavericksComposeExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,357:1\n53#2:358\n54#2,15:360\n69#2,8:381\n79#2:392\n80#2,5:395\n76#3:359\n76#3:407\n76#3:444\n76#3:486\n76#3:562\n83#4,3:375\n50#4:393\n49#4:394\n460#4,13:419\n460#4,13:456\n25#4:470\n460#4,13:498\n473#4,3:512\n36#4:520\n36#4:528\n36#4:537\n473#4,3:544\n473#4,3:549\n460#4,13:574\n473#4,3:588\n36#4:600\n50#4:607\n49#4:608\n1057#5,3:378\n1060#5,3:389\n1057#5,6:471\n1057#5,6:521\n1057#5,6:529\n1057#5,6:538\n1057#5,6:593\n1057#5,6:601\n1057#5,6:609\n74#6,6:400\n80#6:432\n74#6,6:437\n80#6:469\n84#6:548\n84#6:553\n74#6,6:555\n80#6:587\n84#6:592\n75#7:406\n76#7,11:408\n75#7:443\n76#7,11:445\n75#7:485\n76#7,11:487\n89#7:515\n89#7:547\n89#7:552\n75#7:561\n76#7,11:563\n89#7:591\n154#8:433\n154#8:434\n154#8:435\n154#8:436\n154#8:477\n154#8:517\n154#8:518\n154#8:519\n154#8:527\n154#8:535\n154#8:536\n154#8:554\n154#8:599\n154#8:615\n66#9,7:478\n73#9:511\n77#9:516\n76#10:616\n102#10,2:617\n76#10:619\n102#10,2:620\n*S KotlinDebug\n*F\n+ 1 ManualEntryScreen.kt\ncom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt\n*L\n63#1:358\n63#1:360,15\n63#1:381,8\n63#1:392\n63#1:395,5\n63#1:359\n147#1:407\n151#1:444\n170#1:486\n245#1:562\n63#1:375,3\n63#1:393\n63#1:394\n147#1:419,13\n151#1:456,13\n162#1:470\n170#1:498,13\n170#1:512,3\n207#1:520\n216#1:528\n231#1:537\n151#1:544,3\n147#1:549,3\n245#1:574,13\n245#1:588,3\n296#1:600\n289#1:607\n289#1:608\n63#1:378,3\n63#1:389,3\n162#1:471,6\n207#1:521,6\n216#1:529,6\n231#1:538,6\n269#1:593,6\n296#1:601,6\n289#1:609,6\n147#1:400,6\n147#1:432\n151#1:437,6\n151#1:469\n151#1:548\n147#1:553\n245#1:555,6\n245#1:587\n245#1:592\n147#1:406\n147#1:408,11\n151#1:443\n151#1:445,11\n170#1:485\n170#1:487,11\n170#1:515\n151#1:547\n147#1:552\n245#1:561\n245#1:563,11\n245#1:591\n156#1:433\n157#1:434\n158#1:435\n159#1:436\n169#1:477\n189#1:517\n192#1:518\n199#1:519\n209#1:527\n218#1:535\n224#1:536\n246#1:554\n275#1:599\n303#1:615\n170#1:478,7\n170#1:511\n170#1:516\n162#1:616\n162#1:617,2\n269#1:619\n269#1:620,2\n*E\n"
    }
.end annotation


# direct methods
.method private static final InputWithError(Lkotlin/Pair;ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    const v0, -0x19a9a9da

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    and-int/lit8 v8, v7, 0xe

    const/4 v15, 0x4

    const/4 v9, 0x2

    move-object/from16 v14, p0

    if-nez v8, :cond_1

    invoke-interface {v1, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    move v8, v15

    goto :goto_0

    :cond_0
    move v8, v9

    :goto_0
    or-int/2addr v8, v7

    goto :goto_1

    :cond_1
    move v8, v7

    :goto_1
    and-int/lit8 v10, v7, 0x70

    const/16 v12, 0x10

    if-nez v10, :cond_3

    invoke-interface {v1, v2}, LEt0;->r(I)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    move v10, v12

    :goto_2
    or-int/2addr v8, v10

    :cond_3
    and-int/lit16 v10, v7, 0x380

    if-nez v10, :cond_5

    invoke-interface {v1, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x100

    goto :goto_3

    :cond_4
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v8, v10

    :cond_5
    and-int/lit16 v10, v7, 0x1c00

    if-nez v10, :cond_7

    invoke-interface {v1, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x800

    goto :goto_4

    :cond_6
    const/16 v10, 0x400

    :goto_4
    or-int/2addr v8, v10

    :cond_7
    const v10, 0xe000

    and-int/2addr v10, v7

    if-nez v10, :cond_9

    invoke-interface {v1, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x4000

    goto :goto_5

    :cond_8
    const/16 v10, 0x2000

    :goto_5
    or-int/2addr v8, v10

    :cond_9
    const/high16 v10, 0x70000

    and-int/2addr v10, v7

    if-nez v10, :cond_b

    invoke-interface {v1, v6}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/high16 v10, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v10, 0x10000

    :goto_6
    or-int/2addr v8, v10

    :cond_b
    move v13, v8

    const v8, 0x5b6db

    and-int/2addr v8, v13

    const v10, 0x12492

    if-ne v8, v10, :cond_d

    invoke-interface {v1}, LEt0;->b()Z

    move-result v8

    if-nez v8, :cond_c

    goto :goto_7

    :cond_c
    invoke-interface {v1}, LEt0;->k()V

    goto/16 :goto_9

    :cond_d
    :goto_7
    invoke-static {}, LQt0;->O()Z

    move-result v8

    if-eqz v8, :cond_e

    const/4 v8, -0x1

    const-string v10, "com.stripe.android.financialconnections.features.manualentry.InputWithError (ManualEntryScreen.kt:260)"

    invoke-static {v0, v13, v8, v10}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_e
    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    sget-object v32, LEt0;->a:LEt0$a;

    invoke-virtual/range {v32 .. v32}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v8

    const/4 v10, 0x0

    if-ne v0, v8, :cond_f

    new-instance v0, LF16;

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x7

    const/16 v22, 0x0

    move-object/from16 v16, v0

    invoke-direct/range {v16 .. v22}, LF16;-><init>(Ljava/lang/String;JLs26;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v10, v9, v10}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v0

    invoke-interface {v1, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_f
    check-cast v0, LEX2;

    shr-int/lit8 v8, v13, 0x3

    and-int/lit8 v8, v8, 0xe

    invoke-static {v2, v1, v8}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    sget-object v11, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v9, 0x6

    invoke-virtual {v11, v1, v9}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v16

    move-object/from16 v33, v11

    move-wide/from16 v10, v16

    const-wide/16 v16, 0x0

    move/from16 v34, v13

    move-wide/from16 v12, v16

    const/16 v16, 0x0

    move-object/from16 v14, v16

    move-object/from16 v15, v16

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v12, v33

    invoke-virtual {v12, v1, v9}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v13

    invoke-virtual {v13}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getBody()LG26;

    move-result-object v27

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x7ffa

    move-object/from16 v28, v1

    move v7, v9

    move-object v2, v12

    const/4 v9, 0x0

    const-wide/16 v12, 0x0

    invoke-static/range {v8 .. v31}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    sget-object v15, LgV2;->b0:LgV2$a;

    const/4 v8, 0x4

    int-to-float v8, v8

    invoke-static {v8}, Lk61;->g(F)F

    move-result v8

    invoke-static {v15, v8}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v8

    invoke-static {v8, v1, v7}, LDN5;->a(LgV2;LEt0;I)V

    invoke-static {v0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;->InputWithError$lambda$12(LEX2;)LF16;

    move-result-object v8

    new-instance v13, Lbl2;

    const/16 v17, 0x0

    const/16 v18, 0x0

    sget-object v9, Lcl2;->b:Lcl2$a;

    invoke-virtual {v9}, Lcl2$a;->d()I

    move-result v19

    const/16 v20, 0x0

    const/16 v21, 0xb

    const/16 v22, 0x0

    move-object/from16 v16, v13

    invoke-direct/range {v16 .. v22}, Lbl2;-><init>(IZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p0 .. p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v9

    const/4 v10, 0x1

    const/4 v14, 0x0

    if-eqz v9, :cond_10

    move v12, v10

    goto :goto_8

    :cond_10
    move v12, v14

    :goto_8
    sget-object v9, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$InputWithError$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$InputWithError$1;

    const/4 v11, 0x0

    invoke-static {v15, v14, v9, v10, v11}, Lfs5;->b(LgV2;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;

    move-result-object v9

    invoke-static {v9, v3}, Lo06;->a(LgV2;Ljava/lang/String;)LgV2;

    move-result-object v9

    const v11, 0x44faf204

    invoke-interface {v1, v11}, LEt0;->F(I)V

    invoke-interface {v1, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v11

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v14

    if-nez v11, :cond_11

    invoke-virtual/range {v32 .. v32}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v14, v11, :cond_12

    :cond_11
    new-instance v14, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$InputWithError$2$1;

    invoke-direct {v14, v5}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$InputWithError$2$1;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-interface {v1, v14}, LEt0;->z(Ljava/lang/Object;)V

    :cond_12
    invoke-interface {v1}, LEt0;->Q()V

    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v14}, Landroidx/compose/ui/focus/b;->a(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v9

    const v11, 0x1e7b2b64

    invoke-interface {v1, v11}, LEt0;->F(I)V

    invoke-interface {v1, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v11

    invoke-interface {v1, v6}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v11, v14

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v14

    if-nez v11, :cond_13

    invoke-virtual/range {v32 .. v32}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v14, v11, :cond_14

    :cond_13
    new-instance v14, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$InputWithError$3$1;

    invoke-direct {v14, v6, v0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$InputWithError$3$1;-><init>(Lkotlin/jvm/functions/Function1;LEX2;)V

    invoke-interface {v1, v14}, LEt0;->z(Ljava/lang/Object;)V

    :cond_14
    invoke-interface {v1}, LEt0;->Q()V

    move-object v0, v14

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    new-instance v14, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$InputWithError$4;

    move/from16 v7, v34

    invoke-direct {v14, v4, v7}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$InputWithError$4;-><init>(Ljava/lang/String;I)V

    const v7, 0x12a9ed94

    invoke-static {v1, v7, v10, v14}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v14

    const/4 v7, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/high16 v20, 0x180000

    const/16 v21, 0x0

    const/16 v22, 0x788

    move-object v10, v0

    const/4 v0, 0x0

    move-object/from16 v24, v15

    move-object v15, v7

    move-object/from16 v19, v1

    invoke-static/range {v8 .. v22}, Lcom/stripe/android/financialconnections/ui/components/TextFieldKt;->FinancialConnectionsOutlinedTextField(LF16;LgV2;Lkotlin/jvm/functions/Function1;ZZLbl2;Lkotlin/jvm/functions/Function2;LEu6;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LEt0;III)V

    invoke-virtual/range {p0 .. p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_15

    invoke-virtual/range {p0 .. p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-static {v7, v1, v0}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v8

    const/4 v0, 0x6

    invoke-virtual {v2, v1, v0}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextCritical-0d7_KjU()J

    move-result-wide v10

    invoke-virtual {v2, v1, v0}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getCaptionEmphasized()LG26;

    move-result-object v27

    const/16 v0, 0x10

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v36

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0xe

    const/16 v41, 0x0

    move-object/from16 v35, v24

    invoke-static/range {v35 .. v41}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v9

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x30

    const/16 v30, 0x0

    const/16 v31, 0x7ff8

    move-object/from16 v28, v1

    invoke-static/range {v8 .. v31}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    :cond_15
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {}, LQt0;->Y()V

    :cond_16
    :goto_9
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v8

    if-nez v8, :cond_17

    goto :goto_a

    :cond_17
    new-instance v9, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$InputWithError$5;

    move-object v0, v9

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$InputWithError$5;-><init>(Lkotlin/Pair;ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {v8, v9}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_a
    return-void
.end method

.method private static final InputWithError$lambda$12(LEX2;)LF16;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "LF16;",
            ">;)",
            "LF16;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF16;

    return-object p0
.end method

.method private static final InputWithError$lambda$13(LEX2;LF16;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "LF16;",
            ">;",
            "LF16;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final ManualEntryContent(Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;ZLdp;Ldp;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;Z",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;",
            ">;",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
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

    move/from16 v13, p13

    const v0, -0x504871f0

    move-object/from16 v1, p11

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "com.stripe.android.financialconnections.features.manualentry.ManualEntryContent (ManualEntryScreen.kt:80)"

    move/from16 v12, p12

    invoke-static {v0, v12, v13, v2}, LQt0;->Z(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v12, p12

    :goto_0
    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v0, v2}, LUp5;->a(ILEt0;II)LXp5;

    move-result-object v0

    new-instance v3, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$1;

    move-object/from16 v11, p10

    invoke-direct {v3, v0, v11, v13}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$1;-><init>(LXp5;Lkotlin/jvm/functions/Function0;I)V

    const v4, -0x66a481c1

    invoke-static {v1, v4, v2, v3}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v3

    new-instance v4, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;

    move-object v14, v4

    move-object/from16 v15, p4

    move-object/from16 v16, v0

    move-object/from16 v17, p5

    move-object/from16 v18, p0

    move-object/from16 v19, p6

    move-object/from16 v20, p1

    move-object/from16 v21, p7

    move-object/from16 v22, p2

    move-object/from16 v23, p8

    move/from16 v24, p3

    move-object/from16 v25, p9

    move/from16 v26, p12

    invoke-direct/range {v14 .. v26}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;-><init>(Ldp;LXp5;Ldp;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;I)V

    const v0, -0x2dbf13fd

    invoke-static {v1, v0, v2, v4}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v2, 0x36

    invoke-static {v3, v0, v1, v2}, Lcom/stripe/android/financialconnections/ui/components/ScaffoldKt;->FinancialConnectionsScaffold(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v14

    if-nez v14, :cond_2

    goto :goto_1

    :cond_2
    new-instance v15, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$3;

    move-object v0, v15

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$3;-><init>(Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;ZLdp;Ldp;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V

    invoke-interface {v14, v15}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method private static final ManualEntryFooter(ZLkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const v0, -0x6e4868ed

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    and-int/lit8 v1, p3, 0xe

    if-nez v1, :cond_1

    invoke-interface {p2, p0}, LEt0;->o(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x70

    if-nez v2, :cond_3

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

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

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-interface {p2}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LEt0;->k()V

    goto/16 :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.manualentry.ManualEntryFooter (ManualEntryScreen.kt:240)"

    invoke-static {v0, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    sget-object v0, LgV2;->b0:LgV2$a;

    const/16 v2, 0x18

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v0, v2}, LND3;->i(LgV2;F)LgV2;

    move-result-object v2

    const v3, -0x1cd0f17e

    invoke-interface {p2, v3}, LEt0;->F(I)V

    sget-object v3, Llo;->a:Llo;

    invoke-virtual {v3}, Llo;->g()Llo$l;

    move-result-object v3

    sget-object v4, LK9;->a:LK9$a;

    invoke-virtual {v4}, LK9$a;->j()LK9$b;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v3, v4, p2, v5}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v3

    const v4, -0x4ee9b9da

    invoke-interface {p2, v4}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {p2, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v6

    invoke-interface {p2, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v7

    invoke-interface {p2, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LJq6;

    sget-object v8, LBt0;->M:LBt0$a;

    invoke-virtual {v8}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface {p2}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_7

    invoke-static {}, Lyt0;->c()V

    :cond_7
    invoke-interface {p2}, LEt0;->h()V

    invoke-interface {p2}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {p2, v9}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_4

    :cond_8
    invoke-interface {p2}, LEt0;->e()V

    :goto_4
    invoke-interface {p2}, LEt0;->L()V

    invoke-static {p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v9

    invoke-virtual {v8}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v9, v3, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v4, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v6, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v7, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {p2}, LEt0;->q()V

    invoke-static {p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v3, p2, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v2, 0x7ab4aae9

    invoke-interface {p2, v2}, LEt0;->F(I)V

    const v2, -0x455f09d5

    invoke-interface {p2, v2}, LEt0;->F(I)V

    sget-object v2, LQm0;->a:LQm0;

    const v2, 0x46ab0209

    invoke-interface {p2, v2}, LEt0;->F(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v4, v2, v3}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v6, 0x0

    sget-object v0, Lcom/stripe/android/financialconnections/features/manualentry/ComposableSingletons$ManualEntryScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ComposableSingletons$ManualEntryScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/manualentry/ComposableSingletons$ManualEntryScreenKt;->getLambda-1$financial_connections_release()Lkotlin/jvm/functions/Function3;

    move-result-object v7

    shr-int/lit8 v0, v1, 0x3

    and-int/lit8 v0, v0, 0xe

    const v5, 0x180030

    or-int/2addr v0, v5

    shl-int/lit8 v1, v1, 0xc

    const v5, 0xe000

    and-int/2addr v1, v5

    or-int v9, v0, v1

    const/16 v10, 0x2c

    move-object v1, p1

    move v5, p0

    move-object v8, p2

    invoke-static/range {v1 .. v10}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt;->FinancialConnectionsButton(Lkotlin/jvm/functions/Function0;LgV2;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->f()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LQt0;->Y()V

    :cond_9
    :goto_5
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_a

    goto :goto_6

    :cond_a
    new-instance v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryFooter$2;

    invoke-direct {v0, p0, p1, p3}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryFooter$2;-><init>(ZLkotlin/jvm/functions/Function0;I)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_6
    return-void
.end method

.method private static final ManualEntryLoaded(LXp5;Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;Ldp;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;LEt0;II)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXp5;",
            "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
            ">;",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v3, p2

    move/from16 v12, p12

    move/from16 v13, p13

    const v0, -0x4706fac8

    move-object/from16 v1, p11

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "com.stripe.android.financialconnections.features.manualentry.ManualEntryLoaded (ManualEntryScreen.kt:133)"

    invoke-static {v0, v12, v13, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, LgV2;->b0:LgV2$a;

    const/4 v2, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v0, v2, v10, v11}, LBB5;->l(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v4

    const v14, -0x1cd0f17e

    invoke-interface {v1, v14}, LEt0;->F(I)V

    sget-object v15, Llo;->a:Llo;

    invoke-virtual {v15}, Llo;->g()Llo$l;

    move-result-object v5

    sget-object v38, LK9;->a:LK9$a;

    invoke-virtual/range {v38 .. v38}, LK9$a;->j()LK9$b;

    move-result-object v6

    const/4 v9, 0x0

    invoke-static {v5, v6, v1, v9}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v5

    const v8, -0x4ee9b9da

    invoke-interface {v1, v8}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v1, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

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

    sget-object v39, LBt0;->M:LBt0$a;

    invoke-virtual/range {v39 .. v39}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v2

    invoke-static {v4}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v4

    invoke-interface {v1}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_1

    invoke-static {}, Lyt0;->c()V

    :cond_1
    invoke-interface {v1}, LEt0;->h()V

    invoke-interface {v1}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v1, v2}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_2
    invoke-interface {v1}, LEt0;->e()V

    :goto_0
    invoke-interface {v1}, LEt0;->L()V

    invoke-static {v1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v2

    invoke-virtual/range {v39 .. v39}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v2, v5, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v2, v6, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v2, v7, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v2, v8, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v1}, LEt0;->q()V

    invoke-static {v1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v2

    invoke-static {v2}, LMB5;->a(LEt0;)LMB5;

    move-result-object v2

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v2, v1, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v2, 0x7ab4aae9

    invoke-interface {v1, v2}, LEt0;->F(I)V

    const v10, -0x455f09d5

    invoke-interface {v1, v10}, LEt0;->F(I)V

    sget-object v40, LQm0;->a:LQm0;

    const v4, 0x57542982

    invoke-interface {v1, v4}, LEt0;->F(I)V

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/16 v18, 0x0

    move-object/from16 v4, v40

    move-object v5, v0

    const v11, -0x4ee9b9da

    move v10, v9

    move-object/from16 v9, v18

    invoke-static/range {v4 .. v9}, LPm0;->b(LPm0;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v19

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0xe

    const/16 v25, 0x0

    move-object/from16 v20, p0

    invoke-static/range {v19 .. v25}, LUp5;->d(LgV2;LXp5;ZLcu1;ZILjava/lang/Object;)LgV2;

    move-result-object v4

    const/16 v5, 0x10

    int-to-float v5, v5

    invoke-static {v5}, Lk61;->g(F)F

    move-result v5

    const/16 v6, 0x18

    int-to-float v9, v6

    invoke-static {v9}, Lk61;->g(F)F

    move-result v6

    invoke-static {v9}, Lk61;->g(F)F

    move-result v7

    invoke-static {v9}, Lk61;->g(F)F

    move-result v8

    invoke-static {v4, v6, v5, v7, v8}, LND3;->l(LgV2;FFFF)LgV2;

    move-result-object v4

    invoke-interface {v1, v14}, LEt0;->F(I)V

    invoke-virtual {v15}, Llo;->g()Llo$l;

    move-result-object v5

    invoke-virtual/range {v38 .. v38}, LK9$a;->j()LK9$b;

    move-result-object v6

    invoke-static {v5, v6, v1, v10}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v5

    invoke-interface {v1, v11}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v1, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

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

    invoke-virtual/range {v39 .. v39}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v14

    invoke-static {v4}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v4

    invoke-interface {v1}, LEt0;->v()Llm;

    move-result-object v15

    instance-of v15, v15, Llm;

    if-nez v15, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface {v1}, LEt0;->h()V

    invoke-interface {v1}, LEt0;->t()Z

    move-result v15

    if-eqz v15, :cond_4

    invoke-interface {v1, v14}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface {v1}, LEt0;->e()V

    :goto_1
    invoke-interface {v1}, LEt0;->L()V

    invoke-static {v1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v14

    invoke-virtual/range {v39 .. v39}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v14, v5, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v14, v6, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v14, v7, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v14, v8, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v1}, LEt0;->q()V

    invoke-static {v1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v5

    invoke-static {v5}, LMB5;->a(LEt0;)LMB5;

    move-result-object v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v5, v1, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1, v2}, LEt0;->F(I)V

    const v4, -0x455f09d5

    invoke-interface {v1, v4}, LEt0;->F(I)V

    const v4, 0x221c9ccc

    invoke-interface {v1, v4}, LEt0;->F(I)V

    const v4, -0x1d58f75c

    invoke-interface {v1, v4}, LEt0;->F(I)V

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    sget-object v42, LEt0;->a:LEt0$a;

    invoke-virtual/range {v42 .. v42}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_5

    sget v4, Lcom/stripe/android/financialconnections/R$drawable;->stripe_check_base:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v4, v6, v5, v6}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v4

    invoke-interface {v1, v4}, LEt0;->z(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    const/4 v6, 0x0

    :goto_2
    invoke-interface {v1}, LEt0;->Q()V

    move-object v8, v4

    check-cast v8, LEX2;

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v0, v5, v4, v6}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v15

    sget v4, Lcom/stripe/android/financialconnections/R$string;->stripe_manualentry_title:I

    invoke-static {v4, v1, v10}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v14

    sget-object v7, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v5, 0x6

    invoke-virtual {v7, v1, v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextPrimary-0d7_KjU()J

    move-result-wide v16

    invoke-virtual {v7, v1, v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getSubtitle()LG26;

    move-result-object v33

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v35, 0x30

    const/16 v36, 0x0

    const/16 v37, 0x7ff8

    move-object/from16 v34, v1

    invoke-static/range {v14 .. v37}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-static {v9}, Lk61;->g(F)F

    move-result v4

    invoke-static {v0, v4}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v4

    invoke-static {v4, v1, v5}, LDN5;->a(LgV2;LEt0;I)V

    const v4, 0x2bb5b5d7

    invoke-interface {v1, v4}, LEt0;->F(I)V

    invoke-virtual/range {v38 .. v38}, LK9$a;->n()LK9;

    move-result-object v4

    invoke-static {v4, v10, v1, v10}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v4

    invoke-interface {v1, v11}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v11

    invoke-interface {v1, v11}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v14

    invoke-interface {v1, v14}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v15

    invoke-interface {v1, v15}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LJq6;

    invoke-virtual/range {v39 .. v39}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v5

    invoke-interface {v1}, LEt0;->v()Llm;

    move-result-object v2

    instance-of v2, v2, Llm;

    if-nez v2, :cond_6

    invoke-static {}, Lyt0;->c()V

    :cond_6
    invoke-interface {v1}, LEt0;->h()V

    invoke-interface {v1}, LEt0;->t()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1, v6}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_7
    invoke-interface {v1}, LEt0;->e()V

    :goto_3
    invoke-interface {v1}, LEt0;->L()V

    invoke-static {v1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v2

    invoke-virtual/range {v39 .. v39}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v2, v4, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v2, v11, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v2, v14, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v39 .. v39}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v2, v15, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v1}, LEt0;->q()V

    invoke-static {v1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v2

    invoke-static {v2}, LMB5;->a(LEt0;)LMB5;

    move-result-object v2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v2, v1, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v2, 0x7ab4aae9

    invoke-interface {v1, v2}, LEt0;->F(I)V

    const v2, -0x7f65a980

    invoke-interface {v1, v2}, LEt0;->F(I)V

    sget-object v2, Lf10;->a:Lf10;

    const v2, 0x5f6ed586

    invoke-interface {v1, v2}, LEt0;->F(I)V

    sget v2, Lcom/stripe/android/financialconnections/R$drawable;->stripe_check_base:I

    invoke-static {v2, v1, v10}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v14

    const-string v15, "Image of bank check referencing routing number"

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x38

    const/16 v23, 0x7c

    move-object/from16 v21, v1

    invoke-static/range {v14 .. v23}, LxX1;->a(LnE3;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;LEt0;II)V

    invoke-static {v8}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;->ManualEntryLoaded$lambda$9$lambda$8$lambda$1(LEX2;)Ljava/lang/Integer;

    move-result-object v2

    const v4, 0x7a2ce2b0

    invoke-interface {v1, v4}, LEt0;->F(I)V

    if-nez v2, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v2, v1, v10}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v14

    const-string v15, "Image of bank check referencing routing number"

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x38

    const/16 v23, 0x7c

    move-object/from16 v21, v1

    invoke-static/range {v14 .. v23}, LxX1;->a(LnE3;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;LEt0;II)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_4
    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->f()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    const v2, 0x7a2ce3ad

    invoke-interface {v1, v2}, LEt0;->F(I)V

    instance-of v2, v3, LCj1;

    const/16 v4, 0x8

    if-eqz v2, :cond_c

    move-object v2, v3

    check-cast v2, LCj1;

    invoke-virtual {v2}, LCj1;->b()Ljava/lang/Throwable;

    move-result-object v2

    instance-of v5, v2, Lcom/stripe/android/core/exception/StripeException;

    if-eqz v5, :cond_9

    move-object v11, v2

    check-cast v11, Lcom/stripe/android/core/exception/StripeException;

    goto :goto_5

    :cond_9
    const/4 v11, 0x0

    :goto_5
    if-eqz v11, :cond_a

    invoke-virtual {v11}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_b

    :cond_a
    sget v2, Lcom/stripe/android/financialconnections/R$string;->stripe_error_generic_title:I

    invoke-static {v2, v1, v10}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v2

    :cond_b
    move-object v14, v2

    const/4 v15, 0x0

    const/4 v2, 0x6

    invoke-virtual {v7, v1, v2}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextCritical-0d7_KjU()J

    move-result-wide v16

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/4 v2, 0x6

    invoke-virtual {v7, v1, v2}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getBody()LG26;

    move-result-object v33

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x7ffa

    move-object/from16 v34, v1

    invoke-static/range {v14 .. v37}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    int-to-float v2, v4

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v0, v2}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v2

    const/4 v5, 0x6

    invoke-static {v2, v1, v5}, LDN5;->a(LgV2;LEt0;I)V

    goto :goto_6

    :cond_c
    const/4 v5, 0x6

    :goto_6
    invoke-interface {v1}, LEt0;->Q()V

    const v2, 0x7a2ce588

    invoke-interface {v1, v2}, LEt0;->F(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;->getVerifyWithMicrodeposits()Z

    move-result v2

    if-eqz v2, :cond_d

    int-to-float v2, v4

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v0, v2}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v2

    invoke-static {v2, v1, v5}, LDN5;->a(LgV2;LEt0;I)V

    sget v2, Lcom/stripe/android/financialconnections/R$string;->stripe_manualentry_microdeposits_desc:I

    invoke-static {v2, v1, v10}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v14

    const/4 v15, 0x0

    invoke-virtual {v7, v1, v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextPrimary-0d7_KjU()J

    move-result-wide v16

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/4 v2, 0x6

    invoke-virtual {v7, v1, v2}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getBody()LG26;

    move-result-object v33

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x7ffa

    move-object/from16 v34, v1

    invoke-static/range {v14 .. v37}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    :cond_d
    invoke-interface {v1}, LEt0;->Q()V

    int-to-float v2, v4

    invoke-static {v2}, Lk61;->g(F)F

    move-result v4

    invoke-static {v0, v4}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v4

    const/4 v5, 0x6

    invoke-static {v4, v1, v5}, LDN5;->a(LgV2;LEt0;I)V

    sget v6, Lcom/stripe/android/financialconnections/R$string;->stripe_manualentry_routing:I

    const-string v11, "RoutingInput"

    const-string v14, "123456789"

    const v15, 0x44faf204

    invoke-interface {v1, v15}, LEt0;->F(I)V

    invoke-interface {v1, v8}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_e

    invoke-virtual/range {v42 .. v42}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_f

    :cond_e
    new-instance v5, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryLoaded$1$1$2$1;

    invoke-direct {v5, v8}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryLoaded$1$1$2$1;-><init>(LEX2;)V

    invoke-interface {v1, v5}, LEt0;->z(Ljava/lang/Object;)V

    :cond_f
    invoke-interface {v1}, LEt0;->Q()V

    move-object/from16 v16, v5

    check-cast v16, Lkotlin/jvm/functions/Function0;

    shr-int/lit8 v38, v12, 0x9

    and-int/lit8 v4, v38, 0xe

    or-int/lit16 v4, v4, 0xd80

    shl-int/lit8 v5, v12, 0x3

    const/high16 v39, 0x70000

    and-int v5, v5, v39

    or-int v17, v4, v5

    move-object/from16 v4, p3

    const/4 v15, 0x6

    move v5, v6

    move-object v6, v11

    move-object v11, v7

    move-object v7, v14

    move-object v14, v8

    move-object/from16 v8, v16

    move/from16 v41, v9

    move-object/from16 v9, p4

    move-object v10, v1

    move-object/from16 v43, v11

    move/from16 v11, v17

    invoke-static/range {v4 .. v11}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;->InputWithError(Lkotlin/Pair;ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-static/range {v41 .. v41}, Lk61;->g(F)F

    move-result v4

    invoke-static {v0, v4}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v4

    invoke-static {v4, v1, v15}, LDN5;->a(LgV2;LEt0;I)V

    sget v5, Lcom/stripe/android/financialconnections/R$string;->stripe_manualentry_account:I

    const-string v6, "AccountInput"

    const-string v7, "000123456789"

    const v11, 0x44faf204

    invoke-interface {v1, v11}, LEt0;->F(I)V

    invoke-interface {v1, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_10

    invoke-virtual/range {v42 .. v42}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v8, v4, :cond_11

    :cond_10
    new-instance v8, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryLoaded$1$1$3$1;

    invoke-direct {v8, v14}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryLoaded$1$1$3$1;-><init>(LEX2;)V

    invoke-interface {v1, v8}, LEt0;->z(Ljava/lang/Object;)V

    :cond_11
    invoke-interface {v1}, LEt0;->Q()V

    check-cast v8, Lkotlin/jvm/functions/Function0;

    shr-int/lit8 v4, v12, 0xf

    and-int/lit8 v4, v4, 0xe

    or-int/lit16 v4, v4, 0xd80

    shr-int/lit8 v9, v12, 0x3

    and-int v9, v9, v39

    or-int v16, v4, v9

    move-object/from16 v4, p5

    move-object/from16 v9, p6

    move-object v10, v1

    move/from16 v17, v11

    move/from16 v11, v16

    invoke-static/range {v4 .. v11}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;->InputWithError(Lkotlin/Pair;ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v0, v2}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v2

    invoke-static {v2, v1, v15}, LDN5;->a(LgV2;LEt0;I)V

    sget v2, Lcom/stripe/android/financialconnections/R$string;->stripe_manualentry_account_type_disclaimer:I

    const/4 v11, 0x0

    invoke-static {v2, v1, v11}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v2

    move-object v4, v14

    move-object v14, v2

    const/4 v2, 0x0

    move v6, v15

    move/from16 v5, v17

    move-object v15, v2

    move-object/from16 v2, v43

    invoke-virtual {v2, v1, v6}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v16

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-virtual {v2, v1, v6}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getCaption()LG26;

    move-result-object v33

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x7ffa

    move-object/from16 v34, v1

    invoke-static/range {v14 .. v37}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-static/range {v41 .. v41}, Lk61;->g(F)F

    move-result v2

    invoke-static {v0, v2}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v2

    invoke-static {v2, v1, v6}, LDN5;->a(LgV2;LEt0;I)V

    sget v2, Lcom/stripe/android/financialconnections/R$string;->stripe_manualentry_accountconfirm:I

    const-string v6, "ConfirmAccountInput"

    const-string v7, "000123456789"

    invoke-interface {v1, v5}, LEt0;->F(I)V

    invoke-interface {v1, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_12

    invoke-virtual/range {v42 .. v42}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v8, v5, :cond_13

    :cond_12
    new-instance v8, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryLoaded$1$1$4$1;

    invoke-direct {v8, v4}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryLoaded$1$1$4$1;-><init>(LEX2;)V

    invoke-interface {v1, v8}, LEt0;->z(Ljava/lang/Object;)V

    :cond_13
    invoke-interface {v1}, LEt0;->Q()V

    check-cast v8, Lkotlin/jvm/functions/Function0;

    shr-int/lit8 v4, v12, 0x15

    and-int/lit8 v4, v4, 0xe

    or-int/lit16 v4, v4, 0xd80

    and-int v5, v38, v39

    or-int v14, v4, v5

    move-object/from16 v4, p7

    move v5, v2

    move-object/from16 v9, p8

    move-object v10, v1

    move v2, v11

    move v11, v14

    invoke-static/range {v4 .. v11}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;->InputWithError(Lkotlin/Pair;ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    move-object/from16 v4, v40

    move-object v5, v0

    invoke-static/range {v4 .. v9}, LPm0;->b(LPm0;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v0

    invoke-static {v0, v1, v2}, LDN5;->a(LgV2;LEt0;I)V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->f()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    shr-int/lit8 v0, v12, 0x1b

    and-int/lit8 v0, v0, 0xe

    shl-int/lit8 v2, v13, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v0, v2

    move/from16 v10, p9

    move-object/from16 v11, p10

    invoke-static {v10, v11, v1, v0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;->ManualEntryFooter(ZLkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->f()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static {}, LQt0;->Y()V

    :cond_14
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v14

    if-nez v14, :cond_15

    goto :goto_7

    :cond_15
    new-instance v15, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryLoaded$2;

    move-object v0, v15

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryLoaded$2;-><init>(LXp5;Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;Ldp;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;II)V

    invoke-interface {v14, v15}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_7
    return-void
.end method

.method private static final ManualEntryLoaded$lambda$9$lambda$8$lambda$1(LEX2;)Ljava/lang/Integer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    return-object p0
.end method

.method private static final ManualEntryLoaded$lambda$9$lambda$8$lambda$2(LEX2;Ljava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final ManualEntryScreen(LEt0;I)V
    .locals 25

    move/from16 v0, p1

    const v1, -0x48a9d5b4

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

    goto/16 :goto_7

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.manualentry.ManualEntryScreen (ManualEntryScreen.kt:61)"

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

    if-eqz v4, :cond_13

    instance-of v2, v1, LXr6;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    move-object v2, v1

    check-cast v2, LXr6;

    goto :goto_1

    :cond_3
    move-object v2, v3

    :goto_1
    if-eqz v2, :cond_12

    instance-of v5, v1, LPi5;

    if-eqz v5, :cond_4

    move-object v5, v1

    check-cast v5, LPi5;

    goto :goto_2

    :cond_4
    move-object v5, v3

    :goto_2
    if-eqz v5, :cond_11

    invoke-interface {v5}, LPi5;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v5

    const-class v6, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;

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

    const/4 v9, 0x1

    aput-object v4, v8, v9

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

    aget-object v13, v8, v9

    invoke-interface {v15, v13}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v10, v13

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

    const-class v18, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

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

    check-cast v3, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;

    invoke-static {v15, v12}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModelKt;->parentViewModel(LEt0;I)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object v1

    const/16 v2, 0x8

    invoke-static {v3, v15, v2}, LtN2;->b(LRN2;LEt0;I)LsP5;

    move-result-object v2

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->getRouting()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->getRoutingError()Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->getAccount()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->getAccountError()Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->getAccountConfirm()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->getAccountConfirmError()Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->isValidForm()Z

    move-result v7

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->getPayload()Ldp;

    move-result-object v8

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->getLinkPaymentAccount()Ldp;

    move-result-object v9

    new-instance v10, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryScreen$1;

    invoke-direct {v10, v3}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryScreen$1;-><init>(Ljava/lang/Object;)V

    new-instance v11, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryScreen$2;

    invoke-direct {v11, v3}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryScreen$2;-><init>(Ljava/lang/Object;)V

    new-instance v12, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryScreen$3;

    invoke-direct {v12, v3}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryScreen$3;-><init>(Ljava/lang/Object;)V

    new-instance v13, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryScreen$4;

    invoke-direct {v13, v3}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryScreen$4;-><init>(Ljava/lang/Object;)V

    new-instance v14, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryScreen$5;

    invoke-direct {v14, v1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryScreen$5;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)V

    const v1, 0x48000

    const/16 v16, 0x0

    move-object v2, v4

    move-object v3, v5

    move-object v4, v6

    move v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v10

    move-object v9, v11

    move-object v10, v12

    move-object v11, v13

    move-object v12, v14

    move-object v13, v15

    move v14, v1

    move-object v1, v15

    move/from16 v15, v16

    invoke-static/range {v2 .. v15}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;->ManualEntryContent(Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;ZLdp;Ldp;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-static {}, LQt0;->Y()V

    :cond_f
    :goto_7
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v1

    if-nez v1, :cond_10

    goto :goto_8

    :cond_10
    new-instance v2, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryScreen$6;

    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryScreen$6;-><init>(I)V

    invoke-interface {v1, v2}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_8
    return-void

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner must be a SavedStateRegistryOwner!"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner must be a ViewModelStoreOwner!"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Composable is not hosted in a ComponentActivity!"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final ManualEntryScreenErrorPreview(LEt0;I)V
    .locals 4

    const v0, 0x1857cc8c

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

    const-string v2, "com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenErrorPreview (ManualEntryScreen.kt:333)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/features/manualentry/ComposableSingletons$ManualEntryScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ComposableSingletons$ManualEntryScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/manualentry/ComposableSingletons$ManualEntryScreenKt;->getLambda-3$financial_connections_release()Lkotlin/jvm/functions/Function2;

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryScreenErrorPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryScreenErrorPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final ManualEntryScreenPreview(LEt0;I)V
    .locals 4

    const v0, 0x3c3a8238

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

    const-string v2, "com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenPreview (ManualEntryScreen.kt:309)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/features/manualentry/ComposableSingletons$ManualEntryScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ComposableSingletons$ManualEntryScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/manualentry/ComposableSingletons$ManualEntryScreenKt;->getLambda-2$financial_connections_release()Lkotlin/jvm/functions/Function2;

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryScreenPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryScreenPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final synthetic access$InputWithError(Lkotlin/Pair;ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;->InputWithError(Lkotlin/Pair;ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$InputWithError$lambda$12(LEX2;)LF16;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;->InputWithError$lambda$12(LEX2;)LF16;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$InputWithError$lambda$13(LEX2;LF16;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;->InputWithError$lambda$13(LEX2;LF16;)V

    return-void
.end method

.method public static final synthetic access$ManualEntryContent(Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;ZLdp;Ldp;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V
    .locals 0

    invoke-static/range {p0 .. p13}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;->ManualEntryContent(Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;ZLdp;Ldp;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V

    return-void
.end method

.method public static final synthetic access$ManualEntryFooter(ZLkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;->ManualEntryFooter(ZLkotlin/jvm/functions/Function0;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$ManualEntryLoaded(LXp5;Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;Ldp;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;LEt0;II)V
    .locals 0

    invoke-static/range {p0 .. p13}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;->ManualEntryLoaded(LXp5;Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;Ldp;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;LEt0;II)V

    return-void
.end method

.method public static final synthetic access$ManualEntryLoaded$lambda$9$lambda$8$lambda$2(LEX2;Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;->ManualEntryLoaded$lambda$9$lambda$8$lambda$2(LEX2;Ljava/lang/Integer;)V

    return-void
.end method
