.class public final Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0003\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u00a1\u0001\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00082\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00082\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00082\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00082\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00082\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00082\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00082\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00000\u0005H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0002\u001a\u00a5\u0001\u0010&\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001b\u001a\u00020\u00152\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001f2\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0!2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00052\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00082\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00082\u0008\u0010%\u001a\u0004\u0018\u00010$H\u0003\u00a2\u0006\u0004\u0008&\u0010\'\u001a?\u0010(\u001a\u00020\u00002\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0!2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u0005H\u0003\u00a2\u0006\u0004\u0008(\u0010)\u001aU\u0010*\u001a\u00020\u00002\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0!2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00052\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00082\u0006\u0010\u001b\u001a\u00020\u0015H\u0003\u00a2\u0006\u0004\u0008*\u0010+\u001a\u0017\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0015H\u0003\u00a2\u0006\u0004\u0008-\u0010.\u001a\u0017\u0010/\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0015H\u0003\u00a2\u0006\u0004\u0008/\u0010.\u001aL\u00105\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00152\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00052\u0006\u00101\u001a\u00020\u00192\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00000\u0005\u00a2\u0006\u0002\u00083H\u0003\u00a2\u0006\u0004\u00085\u00106\u001a%\u00108\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010\"072\u0006\u00101\u001a\u00020\u0019H\u0003\u00a2\u0006\u0004\u00088\u00109\u001a\u000f\u0010:\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008:\u0010\u0002\u001a\u000f\u0010;\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008;\u0010\u0002\u001a\u000f\u0010<\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008<\u0010\u0002\u00a8\u0006="
    }
    d2 = {
        "",
        "AccountPickerScreen",
        "(LEt0;I)V",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;",
        "state",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
        "onAccountClicked",
        "Lkotlin/Function0;",
        "onSubmit",
        "onSelectAllAccountsClicked",
        "onSelectAnotherBank",
        "onEnterDetailsManually",
        "onLoadAccountsAgain",
        "onCloseClick",
        "onLearnMoreAboutDataAccessClick",
        "",
        "onCloseFromErrorClick",
        "AccountPickerContent",
        "(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V",
        "AccountPickerLoading",
        "",
        "submitEnabled",
        "submitLoading",
        "",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;",
        "accounts",
        "allAccountsSelected",
        "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;",
        "accessibleDataCalloutModel",
        "requiresSingleAccountConfirmation",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;",
        "selectionMode",
        "",
        "",
        "selectedIds",
        "Lcom/stripe/android/financialconnections/ui/TextResource;",
        "subtitle",
        "AccountPickerLoaded",
        "(ZZLjava/util/List;ZLcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZLcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/ui/TextResource;LEt0;II)V",
        "SingleSelectContent",
        "(Ljava/util/List;Ljava/util/Set;Lkotlin/jvm/functions/Function1;LEt0;I)V",
        "MultiSelectContent",
        "(Ljava/util/List;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLEt0;I)V",
        "checked",
        "FinancialConnectionCheckbox",
        "(ZLEt0;I)V",
        "FinancialConnectionRadioButton",
        "selected",
        "accountUI",
        "LZc5;",
        "Lkotlin/ExtensionFunctionType;",
        "selectorContent",
        "AccountItem",
        "(ZLkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;Lkotlin/jvm/functions/Function3;LEt0;I)V",
        "Lkotlin/Pair;",
        "getAccountTexts",
        "(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;LEt0;I)Lkotlin/Pair;",
        "AccountPickerPreviewMultiSelect",
        "AccountPickerPreviewSingleSelect",
        "AccountPickerPreviewSingleSelectWithConfirm",
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
        "SMAP\nAccountPickerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountPickerScreen.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt\n+ 2 MavericksComposeExtensions.kt\ncom/airbnb/mvrx/compose/MavericksComposeExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,521:1\n53#2:522\n54#2,15:524\n69#2,8:545\n79#2:556\n80#2,5:559\n76#3:523\n76#3:575\n76#3:608\n76#3:674\n76#3:708\n76#3:742\n83#4,3:539\n50#4:557\n49#4:558\n460#4,13:587\n460#4,13:620\n473#4,3:636\n473#4,3:642\n460#4,13:686\n460#4,13:720\n460#4,13:754\n473#4,3:769\n473#4,3:774\n473#4,3:779\n1057#5,3:542\n1060#5,3:553\n1057#5,3:651\n1060#5,3:655\n1057#5,3:658\n1060#5,3:662\n154#6:564\n154#6:565\n154#6:566\n154#6:567\n154#6:634\n154#6:635\n154#6:641\n154#6:647\n154#6:648\n154#6:649\n154#6:650\n154#6:654\n154#6:661\n154#6:665\n154#6:666\n154#6:734\n154#6:768\n74#7,6:568\n80#7:600\n74#7,6:601\n80#7:633\n84#7:640\n84#7:646\n74#7,6:735\n80#7:767\n84#7:773\n75#8:574\n76#8,11:576\n75#8:607\n76#8,11:609\n89#8:639\n89#8:645\n75#8:673\n76#8,11:675\n75#8:707\n76#8,11:709\n75#8:741\n76#8,11:743\n89#8:772\n89#8:777\n89#8:782\n67#9,6:667\n73#9:699\n77#9:783\n74#10,7:700\n81#10:733\n85#10:778\n*S KotlinDebug\n*F\n+ 1 AccountPickerScreen.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt\n*L\n69#1:522\n69#1:524,15\n69#1:545,8\n69#1:556\n69#1:559,5\n69#1:523\n180#1:575\n190#1:608\n385#1:674\n400#1:708\n407#1:742\n69#1:539,3\n69#1:557\n69#1:558\n180#1:587,13\n190#1:620,13\n190#1:636,3\n180#1:642,3\n385#1:686,13\n400#1:720,13\n407#1:754,13\n407#1:769,3\n400#1:774,3\n385#1:779,3\n69#1:542,3\n69#1:553,3\n383#1:651,3\n383#1:655,3\n384#1:658,3\n384#1:662,3\n184#1:564\n185#1:565\n186#1:566\n187#1:567\n209#1:634\n217#1:635\n241#1:641\n269#1:647\n270#1:648\n296#1:649\n297#1:650\n383#1:654\n384#1:661\n390#1:665\n398#1:666\n405#1:734\n422#1:768\n180#1:568,6\n180#1:600\n190#1:601,6\n190#1:633\n190#1:640\n180#1:646\n407#1:735,6\n407#1:767\n407#1:773\n180#1:574\n180#1:576,11\n190#1:607\n190#1:609,11\n190#1:639\n180#1:645\n385#1:673\n385#1:675,11\n400#1:707\n400#1:709,11\n407#1:741\n407#1:743,11\n407#1:772\n400#1:777\n385#1:782\n385#1:667,6\n385#1:699\n385#1:783\n400#1:700,7\n400#1:733\n400#1:778\n*E\n"
    }
.end annotation


# direct methods
.method private static final AccountItem(ZLkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;Lkotlin/jvm/functions/Function3;LEt0;I)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LZc5;",
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

    move/from16 v5, p5

    const v0, 0x337bace1

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.accountpicker.AccountItem (AccountPickerScreen.kt:374)"

    invoke-static {v0, v5, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;->getAccount()Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-result-object v0

    invoke-interface {v1, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_3

    :cond_1
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getDisplayableAccountNumbers()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    const/16 v2, 0xa

    goto :goto_0

    :cond_2
    const/16 v2, 0xc

    :goto_0
    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v2}, Lk61;->d(F)Lk61;

    move-result-object v3

    invoke-interface {v1, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    check-cast v3, Lk61;

    invoke-virtual {v3}, Lk61;->l()F

    move-result v2

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LEt0;->a:LEt0$a;

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v4

    const/16 v6, 0x8

    if-ne v3, v4, :cond_4

    int-to-float v3, v6

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    invoke-static {v3}, Lcc5;->d(F)Lbc5;

    move-result-object v3

    invoke-interface {v1, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lbc5;

    sget-object v4, LgV2;->b0:LgV2$a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-static {v4, v7, v9, v8}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v7

    invoke-static {v7, v3}, LQk0;->a(LgV2;Lhy5;)LgV2;

    move-result-object v7

    if-eqz p0, :cond_5

    const/4 v8, 0x2

    int-to-float v8, v8

    goto :goto_1

    :cond_5
    int-to-float v8, v9

    :goto_1
    invoke-static {v8}, Lk61;->g(F)F

    move-result v8

    const/4 v15, 0x6

    if-eqz p0, :cond_6

    sget-object v9, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    invoke-virtual {v9, v1, v15}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextBrand-0d7_KjU()J

    move-result-wide v9

    goto :goto_2

    :cond_6
    sget-object v9, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    invoke-virtual {v9, v1, v15}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getBorderDefault-0d7_KjU()J

    move-result-wide v9

    :goto_2
    invoke-static {v7, v8, v9, v10, v3}, LdZ;->g(LgV2;FJLhy5;)LgV2;

    move-result-object v16

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;->getAccount()Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getAllowSelection$financial_connections_release()Z

    move-result v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountItem$1;

    move-object/from16 v14, p1

    invoke-direct {v3, v14, v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountItem$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/model/PartnerAccount;)V

    const/16 v21, 0x6

    const/16 v22, 0x0

    move-object/from16 v20, v3

    invoke-static/range {v16 .. v22}, Lak0;->e(LgV2;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LgV2;

    move-result-object v0

    const/16 v3, 0x10

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v7

    invoke-static {v0, v7, v2}, LND3;->j(LgV2;FF)LgV2;

    move-result-object v0

    const v2, 0x2bb5b5d7

    invoke-interface {v1, v2}, LEt0;->F(I)V

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->n()LK9;

    move-result-object v7

    const/4 v13, 0x0

    invoke-static {v7, v13, v1, v13}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v7

    const v12, -0x4ee9b9da

    invoke-interface {v1, v12}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v8

    invoke-interface {v1, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v9

    invoke-interface {v1, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v10

    invoke-interface {v1, v10}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LJq6;

    sget-object v16, LBt0;->M:LBt0$a;

    invoke-virtual/range {v16 .. v16}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v11

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {v1}, LEt0;->v()Llm;

    move-result-object v6

    instance-of v6, v6, Llm;

    if-nez v6, :cond_7

    invoke-static {}, Lyt0;->c()V

    :cond_7
    invoke-interface {v1}, LEt0;->h()V

    invoke-interface {v1}, LEt0;->t()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v1, v11}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_8
    invoke-interface {v1}, LEt0;->e()V

    :goto_3
    invoke-interface {v1}, LEt0;->L()V

    invoke-static {v1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v6

    invoke-virtual/range {v16 .. v16}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v11

    invoke-static {v6, v7, v11}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v8, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v9, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v10, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v1}, LEt0;->q()V

    invoke-static {v1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v6

    invoke-static {v6}, LMB5;->a(LEt0;)LMB5;

    move-result-object v6

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v0, v6, v1, v7}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v1, v0}, LEt0;->F(I)V

    const v6, -0x7f65a980

    invoke-interface {v1, v6}, LEt0;->F(I)V

    sget-object v6, Lf10;->a:Lf10;

    const v6, 0x136ecd1b

    invoke-interface {v1, v6}, LEt0;->F(I)V

    sget-object v6, Llo;->a:Llo;

    invoke-virtual {v6}, Llo;->f()Llo$d;

    move-result-object v7

    invoke-virtual {v2}, LK9$a;->h()LK9$c;

    move-result-object v8

    const v9, 0x2952b718

    invoke-interface {v1, v9}, LEt0;->F(I)V

    const/16 v9, 0x36

    invoke-static {v7, v8, v1, v9}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v7

    invoke-interface {v1, v12}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v8

    invoke-interface {v1, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v9

    invoke-interface {v1, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v10

    invoke-interface {v1, v10}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LJq6;

    invoke-virtual/range {v16 .. v16}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v11

    invoke-static {v4}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v12

    invoke-interface {v1}, LEt0;->v()Llm;

    move-result-object v15

    instance-of v15, v15, Llm;

    if-nez v15, :cond_9

    invoke-static {}, Lyt0;->c()V

    :cond_9
    invoke-interface {v1}, LEt0;->h()V

    invoke-interface {v1}, LEt0;->t()Z

    move-result v15

    if-eqz v15, :cond_a

    invoke-interface {v1, v11}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_4

    :cond_a
    invoke-interface {v1}, LEt0;->e()V

    :goto_4
    invoke-interface {v1}, LEt0;->L()V

    invoke-static {v1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v11

    invoke-virtual/range {v16 .. v16}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v11, v7, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v11, v8, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v11, v9, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v11, v10, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v1}, LEt0;->q()V

    invoke-static {v1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v7

    invoke-static {v7}, LMB5;->a(LEt0;)LMB5;

    move-result-object v7

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v12, v7, v1, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1, v0}, LEt0;->F(I)V

    const v7, -0x286e2e7f

    invoke-interface {v1, v7}, LEt0;->F(I)V

    sget-object v7, Lad5;->a:Lad5;

    const v8, -0x7277a4c9

    invoke-interface {v1, v8}, LEt0;->F(I)V

    shr-int/lit8 v8, v5, 0x6

    and-int/lit8 v8, v8, 0x70

    const/4 v9, 0x6

    or-int/2addr v8, v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    move-object/from16 v15, p3

    invoke-interface {v15, v7, v1, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    invoke-static {v4, v3}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v3

    invoke-static {v3, v1, v9}, LDN5;->a(LgV2;LEt0;I)V

    move-object/from16 v3, p2

    const/16 v8, 0x8

    invoke-static {v3, v1, v8}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt;->getAccountTexts(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;LEt0;I)Lkotlin/Pair;

    move-result-object v8

    invoke-virtual {v8}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v21, v9

    check-cast v21, Ljava/lang/String;

    invoke-virtual {v8}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v30, v8

    check-cast v30, Ljava/lang/String;

    const v9, 0x3f333333    # 0.7f

    const/4 v10, 0x0

    const/4 v11, 0x2

    const/4 v12, 0x0

    move-object v8, v4

    const v0, -0x4ee9b9da

    invoke-static/range {v7 .. v12}, LZc5;->b(LZc5;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v7

    const v8, -0x1cd0f17e

    invoke-interface {v1, v8}, LEt0;->F(I)V

    invoke-virtual {v6}, Llo;->g()Llo$l;

    move-result-object v6

    invoke-virtual {v2}, LK9$a;->j()LK9$b;

    move-result-object v2

    invoke-static {v6, v2, v1, v13}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v2

    invoke-interface {v1, v0}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v0

    invoke-interface {v1, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v6

    invoke-interface {v1, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v8

    invoke-interface {v1, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LJq6;

    invoke-virtual/range {v16 .. v16}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-static {v7}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v7

    invoke-interface {v1}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_b

    invoke-static {}, Lyt0;->c()V

    :cond_b
    invoke-interface {v1}, LEt0;->h()V

    invoke-interface {v1}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-interface {v1, v9}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_5

    :cond_c
    invoke-interface {v1}, LEt0;->e()V

    :goto_5
    invoke-interface {v1}, LEt0;->L()V

    invoke-static {v1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v9

    invoke-virtual/range {v16 .. v16}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v9, v2, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v9, v0, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v9, v6, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v16 .. v16}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v9, v8, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v1}, LEt0;->q()V

    invoke-static {v1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v7, v0, v1, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v1, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {v1, v0}, LEt0;->F(I)V

    sget-object v0, LQm0;->a:LQm0;

    const v0, 0x67538e01

    invoke-interface {v1, v0}, LEt0;->F(I)V

    sget-object v0, Ln26;->a:Ln26$a;

    invoke-virtual {v0}, Ln26$a;->b()I

    move-result v2

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;->getAccount()Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getAllowSelection$financial_connections_release()Z

    move-result v6

    if-eqz v6, :cond_d

    const v6, 0x7664aba7

    invoke-interface {v1, v6}, LEt0;->F(I)V

    sget-object v6, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v8, 0x6

    invoke-virtual {v6, v1, v8}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextPrimary-0d7_KjU()J

    move-result-wide v6

    invoke-interface {v1}, LEt0;->Q()V

    goto :goto_6

    :cond_d
    const/4 v8, 0x6

    const v6, 0x7664abef

    invoke-interface {v1, v6}, LEt0;->F(I)V

    sget-object v6, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    invoke-virtual {v6, v1, v8}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextDisabled-0d7_KjU()J

    move-result-wide v6

    invoke-interface {v1}, LEt0;->Q()V

    :goto_6
    move-wide/from16 v31, v6

    sget-object v9, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    invoke-virtual {v9, v1, v8}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getBodyEmphasized()LG26;

    move-result-object v25

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v6, 0x0

    move-object v14, v6

    const-wide/16 v16, 0x0

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v28, 0xc30

    const/16 v29, 0x57fa

    move-object/from16 v6, v21

    move-object/from16 v33, v9

    move-wide/from16 v8, v31

    move/from16 v21, v2

    move-object/from16 v26, v1

    invoke-static/range {v6 .. v29}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    if-nez v30, :cond_e

    goto :goto_7

    :cond_e
    const/4 v2, 0x4

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v4, v2}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v2

    const/4 v4, 0x6

    invoke-static {v2, v1, v4}, LDN5;->a(LgV2;LEt0;I)V

    invoke-virtual {v0}, Ln26$a;->b()I

    move-result v21

    move-object/from16 v0, v33

    invoke-virtual {v0, v1, v4}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextDisabled-0d7_KjU()J

    move-result-wide v8

    invoke-virtual {v0, v1, v4}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getCaptionTight()LG26;

    move-result-object v25

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v28, 0xc30

    const/16 v29, 0x57fa

    move-object/from16 v6, v30

    move-object/from16 v26, v1

    invoke-static/range {v6 .. v29}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_7
    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->f()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->f()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->f()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LQt0;->Y()V

    :cond_f
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v6

    if-nez v6, :cond_10

    goto :goto_8

    :cond_10
    new-instance v7, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountItem$3;

    move-object v0, v7

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountItem$3;-><init>(ZLkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;Lkotlin/jvm/functions/Function3;I)V

    invoke-interface {v6, v7}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_8
    return-void
.end method

.method private static final AccountPickerContent(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
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
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move/from16 v11, p11

    const v0, -0x75112f32

    move-object/from16 v1, p10

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v12

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerContent (AccountPickerScreen.kt:87)"

    invoke-static {v0, v11, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerContent$1;

    move-object/from16 v13, p7

    invoke-direct {v0, v13, v11}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerContent$1;-><init>(Lkotlin/jvm/functions/Function0;I)V

    const v1, 0x47cb84bd

    const/4 v14, 0x1

    invoke-static {v12, v1, v14, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v15

    new-instance v10, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerContent$2;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    move-object/from16 v4, p2

    move-object/from16 v5, p8

    move/from16 v6, p11

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object v11, v10

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerContent$2;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    const v0, -0x3e927c7f

    invoke-static {v12, v0, v14, v11}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v1, 0x36

    invoke-static {v15, v0, v12, v1}, Lcom/stripe/android/financialconnections/ui/components/ScaffoldKt;->FinancialConnectionsScaffold(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {v12}, LEt0;->w()LWm5;

    move-result-object v12

    if-nez v12, :cond_2

    goto :goto_0

    :cond_2
    new-instance v14, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerContent$3;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerContent$3;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {v12, v14}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method private static final AccountPickerLoaded(ZZLjava/util/List;ZLcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZLcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/ui/TextResource;LEt0;II)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;",
            ">;Z",
            "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;",
            "Z",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
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
            "Lcom/stripe/android/financialconnections/ui/TextResource;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v14, p7

    move-object/from16 v15, p12

    move/from16 v4, p14

    move/from16 v3, p15

    const v0, 0x1299c1c2

    move-object/from16 v1, p13

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerLoaded (AccountPickerScreen.kt:164)"

    invoke-static {v0, v4, v3, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, LgV2;->b0:LgV2$a;

    const/4 v2, 0x0

    const/4 v13, 0x1

    const/4 v12, 0x0

    invoke-static {v0, v2, v13, v12}, LBB5;->l(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v7

    const/16 v8, 0x10

    int-to-float v8, v8

    invoke-static {v8}, Lk61;->g(F)F

    move-result v8

    const/16 v9, 0x18

    int-to-float v11, v9

    invoke-static {v11}, Lk61;->g(F)F

    move-result v9

    invoke-static {v11}, Lk61;->g(F)F

    move-result v10

    invoke-static {v11}, Lk61;->g(F)F

    move-result v12

    invoke-static {v7, v9, v8, v10, v12}, LND3;->l(LgV2;FFFF)LgV2;

    move-result-object v7

    const v12, -0x1cd0f17e

    invoke-interface {v1, v12}, LEt0;->F(I)V

    sget-object v16, Llo;->a:Llo;

    invoke-virtual/range {v16 .. v16}, Llo;->g()Llo$l;

    move-result-object v8

    sget-object v17, LK9;->a:LK9$a;

    invoke-virtual/range {v17 .. v17}, LK9$a;->j()LK9$b;

    move-result-object v9

    const/4 v10, 0x0

    invoke-static {v8, v9, v1, v10}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v8

    const v9, -0x4ee9b9da

    invoke-interface {v1, v9}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v9

    invoke-interface {v1, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v12

    invoke-interface {v1, v12}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v2

    invoke-interface {v1, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJq6;

    sget-object v20, LBt0;->M:LBt0$a;

    invoke-virtual/range {v20 .. v20}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    invoke-static {v7}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v7

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

    invoke-interface {v1, v13}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_2
    invoke-interface {v1}, LEt0;->e()V

    :goto_0
    invoke-interface {v1}, LEt0;->L()V

    invoke-static {v1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v10

    invoke-virtual/range {v20 .. v20}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v13

    invoke-static {v10, v8, v13}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v20 .. v20}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v10, v9, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v20 .. v20}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v10, v12, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v20 .. v20}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v10, v2, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v1}, LEt0;->q()V

    invoke-static {v1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v2

    invoke-static {v2}, LMB5;->a(LEt0;)LMB5;

    move-result-object v2

    const/4 v10, 0x0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v2, v1, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v2, 0x7ab4aae9

    invoke-interface {v1, v2}, LEt0;->F(I)V

    const v13, -0x455f09d5

    invoke-interface {v1, v13}, LEt0;->F(I)V

    sget-object v40, LQm0;->a:LQm0;

    const v7, -0x229dcaf4

    invoke-interface {v1, v7}, LEt0;->F(I)V

    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v12, 0x0

    const/16 v21, 0x2

    const/16 v22, 0x0

    move-object/from16 v7, v40

    move-object v8, v0

    const v13, -0x4ee9b9da

    move v2, v10

    move v10, v12

    move/from16 v41, v11

    move/from16 v11, v21

    const v13, -0x1cd0f17e

    move-object/from16 v12, v22

    invoke-static/range {v7 .. v12}, LPm0;->b(LPm0;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v7

    invoke-interface {v1, v13}, LEt0;->F(I)V

    invoke-virtual/range {v16 .. v16}, Llo;->g()Llo$l;

    move-result-object v8

    invoke-virtual/range {v17 .. v17}, LK9$a;->j()LK9$b;

    move-result-object v9

    invoke-static {v8, v9, v1, v2}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v8

    const v9, -0x4ee9b9da

    invoke-interface {v1, v9}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v9

    invoke-interface {v1, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v10

    invoke-interface {v1, v10}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v11

    invoke-interface {v1, v11}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LJq6;

    invoke-virtual/range {v20 .. v20}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v12

    invoke-static {v7}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v7

    invoke-interface {v1}, LEt0;->v()Llm;

    move-result-object v13

    instance-of v13, v13, Llm;

    if-nez v13, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface {v1}, LEt0;->h()V

    invoke-interface {v1}, LEt0;->t()Z

    move-result v13

    if-eqz v13, :cond_4

    invoke-interface {v1, v12}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface {v1}, LEt0;->e()V

    :goto_1
    invoke-interface {v1}, LEt0;->L()V

    invoke-static {v1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v12

    invoke-virtual/range {v20 .. v20}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v13

    invoke-static {v12, v8, v13}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v20 .. v20}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v12, v9, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v20 .. v20}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v12, v10, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v20 .. v20}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v12, v11, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v1}, LEt0;->q()V

    invoke-static {v1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v8

    invoke-static {v8}, LMB5;->a(LEt0;)LMB5;

    move-result-object v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v7, v8, v1, v9}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v7, 0x7ab4aae9

    invoke-interface {v1, v7}, LEt0;->F(I)V

    const v7, -0x455f09d5

    invoke-interface {v1, v7}, LEt0;->F(I)V

    const v7, -0x7b2188aa

    invoke-interface {v1, v7}, LEt0;->F(I)V

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v13, 0x0

    invoke-static {v0, v7, v8, v13}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v17

    const/4 v7, 0x2

    if-ne v6, v8, :cond_5

    sget v9, Lcom/stripe/android/financialconnections/R$string;->stripe_account_picker_confirm_account:I

    goto :goto_2

    :cond_5
    if-nez v6, :cond_e

    sget-object v9, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v9, v9, v10

    if-eq v9, v8, :cond_7

    if-ne v9, v7, :cond_6

    sget v9, Lcom/stripe/android/financialconnections/R$string;->stripe_account_picker_multiselect_account:I

    goto :goto_2

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_7
    sget v9, Lcom/stripe/android/financialconnections/R$string;->stripe_account_picker_singleselect_account:I

    :goto_2
    invoke-static {v9, v1, v2}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v16

    sget-object v8, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v12, 0x6

    invoke-virtual {v8, v1, v12}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getSubtitle()LG26;

    move-result-object v35

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v37, 0x30

    const/16 v38, 0x0

    const/16 v39, 0x7ffc

    move-object/from16 v36, v1

    invoke-static/range {v16 .. v39}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    const v9, -0x1b1b24b

    invoke-interface {v1, v9}, LEt0;->F(I)V

    const/16 v11, 0x8

    if-nez v15, :cond_8

    goto :goto_3

    :cond_8
    int-to-float v9, v11

    invoke-static {v9}, Lk61;->g(F)F

    move-result v9

    invoke-static {v0, v9}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v9

    invoke-static {v9, v1, v12}, LDN5;->a(LgV2;LEt0;I)V

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-static {v0, v9, v10, v13}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v17

    invoke-interface {v15, v1, v2}, Lcom/stripe/android/financialconnections/ui/TextResource;->toText(LEt0;I)Ljava/lang/CharSequence;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v8, v1, v12}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getBody()LG26;

    move-result-object v35

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v37, 0x30

    const/16 v38, 0x0

    const/16 v39, 0x7ffc

    move-object/from16 v36, v1

    invoke-static/range {v16 .. v39}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    sget-object v8, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_3
    invoke-interface {v1}, LEt0;->Q()V

    invoke-static/range {v41 .. v41}, Lk61;->g(F)F

    move-result v8

    invoke-static {v0, v8}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v8

    invoke-static {v8, v1, v12}, LDN5;->a(LgV2;LEt0;I)V

    sget-object v8, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v8, v8, v9

    const v16, 0xe000

    const/4 v10, 0x1

    if-eq v8, v10, :cond_a

    if-eq v8, v7, :cond_9

    const v7, -0x1b1ae5d

    invoke-interface {v1, v7}, LEt0;->F(I)V

    invoke-interface {v1}, LEt0;->Q()V

    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v13, p2

    move-object/from16 v12, p8

    move/from16 v19, v11

    goto :goto_4

    :cond_9
    const v7, -0x1b1afac

    invoke-interface {v1, v7}, LEt0;->F(I)V

    shr-int/lit8 v7, v4, 0x12

    and-int/lit16 v8, v7, 0x380

    or-int/lit8 v8, v8, 0x48

    and-int/lit16 v7, v7, 0x1c00

    or-int/2addr v7, v8

    shl-int/lit8 v8, v4, 0x3

    and-int v8, v8, v16

    or-int v17, v7, v8

    move-object/from16 v7, p2

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v18, v10

    move-object/from16 v10, p9

    move/from16 v19, v11

    move/from16 v11, p3

    move-object v12, v1

    move/from16 v13, v17

    invoke-static/range {v7 .. v13}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt;->MultiSelectContent(Ljava/util/List;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLEt0;I)V

    invoke-interface {v1}, LEt0;->Q()V

    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v13, p2

    move-object/from16 v12, p8

    goto :goto_4

    :cond_a
    move/from16 v19, v11

    const v7, -0x1b1b090

    invoke-interface {v1, v7}, LEt0;->F(I)V

    shr-int/lit8 v7, v4, 0x12

    and-int/lit16 v7, v7, 0x380

    or-int/lit8 v7, v7, 0x48

    move-object/from16 v13, p2

    move-object/from16 v12, p8

    invoke-static {v13, v14, v12, v1, v7}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt;->SingleSelectContent(Ljava/util/List;Ljava/util/Set;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-interface {v1}, LEt0;->Q()V

    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_4
    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v10, 0x0

    const/4 v11, 0x2

    const/16 v17, 0x0

    move-object/from16 v7, v40

    move-object v8, v0

    move-object/from16 v12, v17

    invoke-static/range {v7 .. v12}, LPm0;->b(LPm0;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v7

    invoke-static {v7, v1, v2}, LDN5;->a(LgV2;LEt0;I)V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->f()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    const v2, -0x71c73f1c

    invoke-interface {v1, v2}, LEt0;->F(I)V

    if-nez v5, :cond_b

    move-object/from16 v12, p11

    goto :goto_5

    :cond_b
    and-int/lit8 v2, v3, 0x70

    or-int/lit8 v2, v2, 0x8

    move-object/from16 v12, p11

    invoke-static {v5, v12, v1, v2}, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutKt;->AccessibleDataCallout(Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Lkotlin/jvm/functions/Function0;LEt0;I)V

    :goto_5
    invoke-interface {v1}, LEt0;->Q()V

    const/16 v2, 0xc

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v0, v2}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v2

    const/4 v7, 0x6

    invoke-static {v2, v1, v7}, LDN5;->a(LgV2;LEt0;I)V

    const/4 v2, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-static {v0, v7, v8, v2}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerLoaded$1$3;

    invoke-direct {v0, v6, v14}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerLoaded$1$3;-><init>(ZLjava/util/Set;)V

    const v2, -0x6de116ad

    invoke-static {v1, v2, v8, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v22

    and-int/lit8 v0, v3, 0xe

    const v2, 0x180030

    or-int/2addr v0, v2

    shl-int/lit8 v2, v4, 0xc

    and-int v7, v2, v16

    or-int/2addr v0, v7

    const/high16 v7, 0x70000

    and-int/2addr v2, v7

    or-int v24, v0, v2

    const/16 v25, 0xc

    move-object/from16 v16, p10

    move/from16 v20, p0

    move/from16 v21, p1

    move-object/from16 v23, v1

    invoke-static/range {v16 .. v25}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt;->FinancialConnectionsButton(Lkotlin/jvm/functions/Function0;LgV2;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->f()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LQt0;->Y()V

    :cond_c
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v11

    if-nez v11, :cond_d

    goto :goto_6

    :cond_d
    new-instance v10, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerLoaded$2;

    move-object v0, v10

    move/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object v14, v10

    move-object/from16 v10, p9

    move-object v13, v11

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v42, v13

    move-object/from16 v13, p12

    move-object v15, v14

    move/from16 v14, p14

    move-object/from16 v43, v15

    move/from16 v15, p15

    invoke-direct/range {v0 .. v15}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerLoaded$2;-><init>(ZZLjava/util/List;ZLcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZLcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/ui/TextResource;II)V

    move-object/from16 v0, v42

    move-object/from16 v1, v43

    invoke-interface {v0, v1}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_6
    return-void

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final AccountPickerLoading(LEt0;I)V
    .locals 7

    const v0, 0x2786ee27

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

    const-string v2, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerLoading (AccountPickerScreen.kt:155)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const/4 v1, 0x0

    sget v0, Lcom/stripe/android/financialconnections/R$string;->stripe_account_picker_loading_title:I

    const/4 v2, 0x0

    invoke-static {v0, p0, v2}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v0

    sget v3, Lcom/stripe/android/financialconnections/R$string;->stripe_account_picker_loading_desc:I

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerLoading$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerLoading$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final AccountPickerPreviewMultiSelect(LEt0;I)V
    .locals 4

    const v0, -0x5044ea64

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

    const-string v2, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerPreviewMultiSelect (AccountPickerScreen.kt:461)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/features/accountpicker/ComposableSingletons$AccountPickerScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/accountpicker/ComposableSingletons$AccountPickerScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/accountpicker/ComposableSingletons$AccountPickerScreenKt;->getLambda-3$financial_connections_release()Lkotlin/jvm/functions/Function2;

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerPreviewMultiSelect$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerPreviewMultiSelect$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final AccountPickerPreviewSingleSelect(LEt0;I)V
    .locals 4

    const v0, -0x75e20d69

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

    const-string v2, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerPreviewSingleSelect (AccountPickerScreen.kt:483)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/features/accountpicker/ComposableSingletons$AccountPickerScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/accountpicker/ComposableSingletons$AccountPickerScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/accountpicker/ComposableSingletons$AccountPickerScreenKt;->getLambda-4$financial_connections_release()Lkotlin/jvm/functions/Function2;

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerPreviewSingleSelect$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerPreviewSingleSelect$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final AccountPickerPreviewSingleSelectWithConfirm(LEt0;I)V
    .locals 4

    const v0, 0x4d9bdc3b    # 3.26862688E8f

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

    const-string v2, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerPreviewSingleSelectWithConfirm (AccountPickerScreen.kt:505)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/features/accountpicker/ComposableSingletons$AccountPickerScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/accountpicker/ComposableSingletons$AccountPickerScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/accountpicker/ComposableSingletons$AccountPickerScreenKt;->getLambda-5$financial_connections_release()Lkotlin/jvm/functions/Function2;

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerPreviewSingleSelectWithConfirm$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerPreviewSingleSelectWithConfirm$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final AccountPickerScreen(LEt0;I)V
    .locals 24

    move/from16 v0, p1

    const v1, -0xa8f443

    move-object/from16 v2, p0

    invoke-interface {v2, v1}, LEt0;->u(I)LEt0;

    move-result-object v14

    if-nez v0, :cond_1

    invoke-interface {v14}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v14}, LEt0;->k()V

    goto/16 :goto_7

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreen (AccountPickerScreen.kt:67)"

    invoke-static {v1, v0, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const v1, 0x1e871a90

    invoke-interface {v14, v1}, LEt0;->F(I)V

    invoke-static {}, Landroidx/compose/ui/platform/h;->i()LU94;

    move-result-object v1

    invoke-interface {v14, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLifecycleOwner;

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v2

    invoke-interface {v14, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

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

    const-class v6, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    invoke-static {v6}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v11

    invoke-static {}, Landroidx/compose/ui/platform/h;->k()LU94;

    move-result-object v6

    invoke-interface {v14, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

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

    invoke-interface {v14, v9}, LEt0;->F(I)V

    move v9, v12

    move v10, v9

    :goto_3
    if-ge v9, v7, :cond_5

    aget-object v15, v8, v9

    invoke-interface {v14, v15}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v10, v15

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_5
    invoke-interface {v14}, LEt0;->G()Ljava/lang/Object;

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

    invoke-interface {v14, v7}, LEt0;->z(Ljava/lang/Object;)V

    :cond_c
    invoke-interface {v14}, LEt0;->Q()V

    move-object v1, v7

    check-cast v1, LPr6;

    const v2, 0x1e7b2b64

    invoke-interface {v14, v2}, LEt0;->F(I)V

    invoke-interface {v14, v11}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v14, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {v14}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_d

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_e

    :cond_d
    sget-object v15, LYN2;->a:LYN2;

    invoke-static {v11}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v16

    const-class v17, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    invoke-static {v11}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "keyFactory?.invoke() ?: viewModelClass.java.name"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x30

    const/16 v23, 0x0

    move-object/from16 v18, v1

    move-object/from16 v19, v2

    invoke-static/range {v15 .. v23}, LYN2;->c(LYN2;Ljava/lang/Class;Ljava/lang/Class;LPr6;Ljava/lang/String;ZLBN2;ILjava/lang/Object;)LRN2;

    move-result-object v3

    invoke-interface {v14, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_e
    invoke-interface {v14}, LEt0;->Q()V

    check-cast v3, LRN2;

    invoke-interface {v14}, LEt0;->Q()V

    check-cast v3, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    invoke-static {v14, v12}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModelKt;->parentViewModel(LEt0;I)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$1;

    const/16 v4, 0x36

    invoke-static {v13, v2, v14, v4, v12}, LSv;->a(ZLkotlin/jvm/functions/Function0;LEt0;II)V

    const/16 v2, 0x8

    invoke-static {v3, v14, v2}, LtN2;->b(LRN2;LEt0;I)LsP5;

    move-result-object v2

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    new-instance v4, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$2;

    invoke-direct {v4, v3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$2;-><init>(Ljava/lang/Object;)V

    new-instance v5, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$3;

    invoke-direct {v5, v3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$3;-><init>(Ljava/lang/Object;)V

    new-instance v6, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$4;

    invoke-direct {v6, v3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$4;-><init>(Ljava/lang/Object;)V

    new-instance v7, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$5;

    invoke-direct {v7, v3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$5;-><init>(Ljava/lang/Object;)V

    new-instance v8, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$6;

    invoke-direct {v8, v3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$6;-><init>(Ljava/lang/Object;)V

    new-instance v9, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$7;

    invoke-direct {v9, v3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$7;-><init>(Ljava/lang/Object;)V

    new-instance v11, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$8;

    invoke-direct {v11, v1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$8;-><init>(Ljava/lang/Object;)V

    new-instance v10, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$9;

    invoke-direct {v10, v3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$9;-><init>(Ljava/lang/Object;)V

    new-instance v12, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$10;

    invoke-direct {v12, v1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$10;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)V

    const/16 v13, 0x8

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v12

    move-object v12, v14

    invoke-static/range {v2 .. v13}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt;->AccountPickerContent(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, LQt0;->Y()V

    :cond_f
    :goto_7
    invoke-interface {v14}, LEt0;->w()LWm5;

    move-result-object v1

    if-nez v1, :cond_10

    goto :goto_8

    :cond_10
    new-instance v2, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$11;

    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerScreen$11;-><init>(I)V

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

.method private static final FinancialConnectionCheckbox(ZLEt0;I)V
    .locals 8

    const v0, -0x56050976

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    and-int/lit8 v1, p2, 0xe

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LEt0;->o(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0xb

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.accountpicker.FinancialConnectionCheckbox (AccountPickerScreen.kt:337)"

    invoke-static {v0, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v4, Lcom/stripe/android/financialconnections/features/accountpicker/ComposableSingletons$AccountPickerScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/accountpicker/ComposableSingletons$AccountPickerScreenKt;

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/features/accountpicker/ComposableSingletons$AccountPickerScreenKt;->getLambda-1$financial_connections_release()Lkotlin/jvm/functions/Function3;

    move-result-object v4

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v6, v1, 0xc00

    const/4 v7, 0x6

    move-object v1, v0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, LSE0;->b(Ljava/lang/Object;LgV2;Ltm1;Lkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_4

    :cond_6
    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$FinancialConnectionCheckbox$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$FinancialConnectionCheckbox$1;-><init>(ZI)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void
.end method

.method private static final FinancialConnectionRadioButton(ZLEt0;I)V
    .locals 8

    const v0, 0x49ee2342    # 1950824.2f

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    and-int/lit8 v1, p2, 0xe

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LEt0;->o(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0xb

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.accountpicker.FinancialConnectionRadioButton (AccountPickerScreen.kt:355)"

    invoke-static {v0, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v4, Lcom/stripe/android/financialconnections/features/accountpicker/ComposableSingletons$AccountPickerScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/accountpicker/ComposableSingletons$AccountPickerScreenKt;

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/features/accountpicker/ComposableSingletons$AccountPickerScreenKt;->getLambda-2$financial_connections_release()Lkotlin/jvm/functions/Function3;

    move-result-object v4

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v6, v1, 0xc00

    const/4 v7, 0x6

    move-object v1, v0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, LSE0;->b(Ljava/lang/Object;LgV2;Ltm1;Lkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_4

    :cond_6
    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$FinancialConnectionRadioButton$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$FinancialConnectionRadioButton$1;-><init>(ZI)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void
.end method

.method private static final MultiSelectContent(Ljava/util/List;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLEt0;I)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const v0, -0x7ac6ff3

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v13

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.accountpicker.MultiSelectContent (AccountPickerScreen.kt:287)"

    move/from16 v14, p6

    invoke-static {v0, v14, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v14, p6

    :goto_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v6

    const/4 v7, 0x7

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, LND3;->e(FFFFILjava/lang/Object;)LPD3;

    move-result-object v10

    const/4 v11, 0x0

    sget-object v3, Llo;->a:Llo;

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-virtual {v3, v0}, Llo;->n(F)Llo$e;

    move-result-object v0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    new-instance v17, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$MultiSelectContent$1;

    move-object/from16 v3, v17

    move-object/from16 v4, p0

    move/from16 v5, p4

    move-object/from16 v6, p3

    move/from16 v7, p6

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    invoke-direct/range {v3 .. v9}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$MultiSelectContent$1;-><init>(Ljava/util/List;ZLkotlin/jvm/functions/Function0;ILjava/util/Set;Lkotlin/jvm/functions/Function1;)V

    const/16 v18, 0x6180

    const/16 v19, 0xeb

    move-object v3, v10

    move v4, v11

    move-object v5, v0

    move-object v6, v12

    move-object v7, v15

    move/from16 v8, v16

    move-object/from16 v9, v17

    move-object v10, v13

    move/from16 v11, v18

    move/from16 v12, v19

    invoke-static/range {v1 .. v12}, Lgn2;->a(LgV2;LCo2;LPD3;ZLlo$l;LK9$b;Lcu1;ZLkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {v13}, LEt0;->w()LWm5;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$MultiSelectContent$2;

    move-object v3, v1

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move/from16 v8, p4

    move/from16 v9, p6

    invoke-direct/range {v3 .. v9}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$MultiSelectContent$2;-><init>(Ljava/util/List;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZI)V

    invoke-interface {v0, v1}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method private static final SingleSelectContent(Ljava/util/List;Ljava/util/Set;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    const v4, -0x7ecfab70

    move-object/from16 v5, p3

    invoke-interface {v5, v4}, LEt0;->u(I)LEt0;

    move-result-object v17

    invoke-static {}, LQt0;->O()Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, -0x1

    const-string v6, "com.stripe.android.financialconnections.features.accountpicker.SingleSelectContent (AccountPickerScreen.kt:262)"

    invoke-static {v4, v3, v5, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v4, 0xc

    int-to-float v4, v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v10

    const/4 v11, 0x7

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, LND3;->e(FFFFILjava/lang/Object;)LPD3;

    move-result-object v7

    const/4 v8, 0x0

    sget-object v9, Llo;->a:Llo;

    invoke-static {v4}, Lk61;->g(F)F

    move-result v4

    invoke-virtual {v9, v4}, Llo;->n(F)Llo$e;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    new-instance v13, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$SingleSelectContent$1;

    invoke-direct {v13, v0, v1, v2, v3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$SingleSelectContent$1;-><init>(Ljava/util/List;Ljava/util/Set;Lkotlin/jvm/functions/Function1;I)V

    const/16 v15, 0x6180

    const/16 v16, 0xeb

    move-object/from16 v14, v17

    invoke-static/range {v5 .. v16}, Lgn2;->a(LgV2;LCo2;LPD3;ZLlo$l;LK9$b;Lcu1;ZLkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface/range {v17 .. v17}, LEt0;->w()LWm5;

    move-result-object v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    new-instance v5, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$SingleSelectContent$2;

    invoke-direct {v5, v0, v1, v2, v3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$SingleSelectContent$2;-><init>(Ljava/util/List;Ljava/util/Set;Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {v4, v5}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method public static final synthetic access$AccountItem(ZLkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;Lkotlin/jvm/functions/Function3;LEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt;->AccountItem(ZLkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;Lkotlin/jvm/functions/Function3;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$AccountPickerContent(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p11}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt;->AccountPickerContent(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$AccountPickerLoaded(ZZLjava/util/List;ZLcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZLcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/ui/TextResource;LEt0;II)V
    .locals 0

    invoke-static/range {p0 .. p15}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt;->AccountPickerLoaded(ZZLjava/util/List;ZLcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZLcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/ui/TextResource;LEt0;II)V

    return-void
.end method

.method public static final synthetic access$AccountPickerLoading(LEt0;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt;->AccountPickerLoading(LEt0;I)V

    return-void
.end method

.method public static final synthetic access$FinancialConnectionCheckbox(ZLEt0;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt;->FinancialConnectionCheckbox(ZLEt0;I)V

    return-void
.end method

.method public static final synthetic access$FinancialConnectionRadioButton(ZLEt0;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt;->FinancialConnectionRadioButton(ZLEt0;I)V

    return-void
.end method

.method public static final synthetic access$MultiSelectContent(Ljava/util/List;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt;->MultiSelectContent(Ljava/util/List;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLEt0;I)V

    return-void
.end method

.method public static final synthetic access$SingleSelectContent(Ljava/util/List;Ljava/util/Set;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt;->SingleSelectContent(Ljava/util/List;Ljava/util/Set;Lkotlin/jvm/functions/Function1;LEt0;I)V

    return-void
.end method

.method private static final getAccountTexts(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;LEt0;I)Lkotlin/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;",
            "LEt0;",
            "I)",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const v0, -0x3965908

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.accountpicker.getAccountTexts (AccountPickerScreen.kt:436)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;->getAccount()Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getAllowSelection$financial_connections_release()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;->getFormattedBalance()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getEncryptedNumbers$financial_connections_release()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getAllowSelection$financial_connections_release()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getAllowSelectionMessage()Ljava/lang/String;

    move-result-object p0

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;->getFormattedBalance()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;->getFormattedBalance()Ljava/lang/String;

    move-result-object p0

    goto :goto_3

    :cond_4
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getEncryptedNumbers$financial_connections_release()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-lez p0, :cond_5

    const/4 p0, 0x1

    goto :goto_2

    :cond_5
    const/4 p0, 0x0

    :goto_2
    if-eqz p0, :cond_6

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getEncryptedNumbers$financial_connections_release()Ljava/lang/String;

    move-result-object p0

    goto :goto_3

    :cond_6
    const/4 p0, 0x0

    :goto_3
    invoke-static {v0, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    invoke-interface {p1}, LEt0;->Q()V

    return-object p0
.end method
