.class public final Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001e\u0010\u000c\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u001a\u001c\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001\"\u001c\u0010\u0017\u001a\u00060\u0007j\u0002`\u0014*\u00020\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
        "sheetViewModel",
        "LgV2;",
        "modifier",
        "",
        "AddPaymentMethod",
        "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;II)V",
        "",
        "paymentMethodCode",
        "Lcom/stripe/android/link/model/AccountStatus;",
        "linkAccountStatus",
        "",
        "showLinkInlineSignupView",
        "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
        "Landroid/content/Context;",
        "context",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
        "paymentMethod",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "transformToPaymentSelection",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "getInitiallySelectedPaymentMethodType",
        "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;)Ljava/lang/String;",
        "initiallySelectedPaymentMethodType",
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
        "SMAP\nAddPaymentMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddPaymentMethod.kt\ncom/stripe/android/paymentsheet/ui/AddPaymentMethodKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,178:1\n76#2:179\n76#2:218\n25#3:180\n36#3:187\n50#3:196\n49#3:197\n25#3:204\n460#3,13:230\n473#3,3:244\n1057#4,6:181\n1057#4,3:188\n1060#4,3:193\n1057#4,6:198\n1057#4,6:205\n223#5,2:191\n74#6,6:211\n80#6:243\n84#6:248\n75#7:217\n76#7,11:219\n89#7:247\n540#8:249\n525#8,6:250\n76#9:256\n76#9:257\n76#9:258\n76#9:259\n102#9,2:260\n76#9:262\n76#9:263\n76#9:264\n102#9,2:265\n*S KotlinDebug\n*F\n+ 1 AddPaymentMethod.kt\ncom/stripe/android/paymentsheet/ui/AddPaymentMethodKt\n*L\n37#1:179\n89#1:218\n39#1:180\n52#1:187\n63#1:196\n63#1:197\n73#1:204\n89#1:230,13\n89#1:244,3\n39#1:181,6\n52#1:188,3\n52#1:193,3\n63#1:198,6\n73#1:205,6\n53#1:191,2\n89#1:211,6\n89#1:243\n89#1:248\n89#1:217\n89#1:219,11\n89#1:247\n154#1:249\n154#1:250,6\n41#1:256\n43#1:257\n44#1:258\n48#1:259\n48#1:260,2\n71#1:262\n72#1:263\n73#1:264\n73#1:265,2\n*E\n"
    }
.end annotation


# direct methods
.method public static final AddPaymentMethod(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;II)V
    .locals 25

    move-object/from16 v11, p0

    move/from16 v12, p3

    move/from16 v13, p4

    const-string v0, "sheetViewModel"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x6a4e113d

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v14

    and-int/lit8 v1, v13, 0x2

    if-eqz v1, :cond_0

    sget-object v1, LgV2;->b0:LgV2$a;

    move-object v15, v1

    goto :goto_0

    :cond_0
    move-object/from16 v15, p1

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.ui.AddPaymentMethod (AddPaymentMethod.kt:32)"

    invoke-static {v0, v12, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v0

    invoke-interface {v14, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/content/Context;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object v8

    const v0, -0x1d58f75c

    invoke-interface {v14, v0}, LEt0;->F(I)V

    invoke-interface {v14}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    sget-object v9, LEt0;->a:LEt0$a;

    invoke-virtual {v9}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_2

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v1

    invoke-interface {v14, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {v14}, LEt0;->Q()V

    move-object v7, v1

    check-cast v7, LGX2;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getProcessing()LtP5;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v3, 0x0

    const/16 v5, 0x38

    const/4 v6, 0x2

    move-object v4, v14

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v16

    invoke-virtual {v8}, Lcom/stripe/android/paymentsheet/LinkHandler;->getLinkConfiguration()LtP5;

    move-result-object v1

    const/4 v6, 0x0

    const/16 v5, 0x8

    const/4 v4, 0x1

    invoke-static {v1, v6, v14, v5, v4}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$2(LsP5;)Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    move-result-object v1

    const v2, 0x9601c52

    invoke-interface {v14, v2}, LEt0;->F(I)V

    if-nez v1, :cond_3

    move-object v0, v6

    goto :goto_1

    :cond_3
    invoke-virtual {v8}, Lcom/stripe/android/paymentsheet/LinkHandler;->getLinkLauncher()Lcom/stripe/android/link/LinkPaymentLauncher;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/stripe/android/link/LinkPaymentLauncher;->getAccountStatusFlow(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;)LEu1;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v17, 0x38

    const/16 v18, 0x2

    move v0, v4

    move-object v4, v14

    move/from16 v5, v17

    move-object v0, v6

    move/from16 v6, v18

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v6

    :goto_1
    invoke-interface {v14}, LEt0;->Q()V

    const/4 v5, 0x2

    if-nez v6, :cond_4

    invoke-static {v0, v0, v5, v0}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v6

    :cond_4
    move-object/from16 v18, v6

    const/4 v6, 0x0

    new-array v1, v6, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$selectedPaymentMethodCode$2;

    invoke-direct {v4, v11}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$selectedPaymentMethodCode$2;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;)V

    const/16 v20, 0x8

    const/16 v21, 0x6

    move-object v5, v14

    move/from16 v6, v20

    move-object v12, v7

    move/from16 v7, v21

    invoke-static/range {v1 .. v7}, LQv4;->b([Ljava/lang/Object;LRi5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;II)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v20, v1

    check-cast v20, LEX2;

    invoke-static/range {v20 .. v20}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$5(LEX2;)Ljava/lang/String;

    move-result-object v1

    const v2, 0x44faf204

    invoke-interface {v14, v2}, LEt0;->F(I)V

    invoke-interface {v14, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v14}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_5

    invoke-virtual {v9}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_6

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSupportedPaymentMethods$paymentsheet_release()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v3

    invoke-static/range {v20 .. v20}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->access$AddPaymentMethod$lambda$5(LEX2;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface {v14, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_6
    invoke-interface {v14}, LEt0;->Q()V

    move-object v7, v2

    check-cast v7, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    invoke-static/range {v20 .. v20}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$5(LEX2;)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v18 .. v18}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$4(LsP5;)Lcom/stripe/android/link/model/AccountStatus;

    move-result-object v2

    invoke-static {v11, v1, v2}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->showLinkInlineSignupView(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Ljava/lang/String;Lcom/stripe/android/link/model/AccountStatus;)Z

    move-result v9

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    sget v2, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->$stable:I

    const v2, 0x1e7b2b64

    invoke-interface {v14, v2}, LEt0;->F(I)V

    invoke-interface {v14, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v14, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v1, v2

    invoke-interface {v14}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_7

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_8

    :cond_7
    invoke-virtual {v11, v7, v9}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->createFormArguments(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Z)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v2

    invoke-interface {v14, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_8
    invoke-interface {v14}, LEt0;->Q()V

    move-object v6, v2

    check-cast v6, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    new-instance v1, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$1;

    invoke-direct {v1, v12, v6, v0}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$1;-><init>(LGX2;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lkotlin/coroutines/Continuation;)V

    sget v2, Lcom/stripe/android/ui/core/Amount;->$stable:I

    sget v18, Lcom/stripe/android/model/PaymentMethodCreateParams;->$stable:I

    or-int v2, v2, v18

    or-int/lit8 v2, v2, 0x40

    invoke-static {v6, v1, v14, v2}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSelection$paymentsheet_release()LtP5;

    move-result-object v1

    const/16 v2, 0x8

    const/4 v3, 0x1

    invoke-static {v1, v0, v14, v2, v3}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v4

    invoke-virtual {v8}, Lcom/stripe/android/paymentsheet/LinkHandler;->getLinkInlineSelection()LGX2;

    move-result-object v1

    invoke-static {v1, v0, v14, v2, v3}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v5

    const v1, -0x1d58f75c

    invoke-interface {v14, v1}, LEt0;->F(I)V

    invoke-interface {v14}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_9

    const/4 v2, 0x2

    invoke-static {v0, v0, v2, v0}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v1

    invoke-interface {v14, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_9
    invoke-interface {v14}, LEt0;->Q()V

    move-object/from16 v17, v1

    check-cast v17, LEX2;

    invoke-static {v4}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$10(LsP5;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v19

    invoke-static/range {v17 .. v17}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$13(LEX2;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object v21

    invoke-static {v5}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$11(LsP5;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    move-result-object v22

    new-instance v23, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;

    const/16 v24, 0x0

    move-object v2, v0

    move-object/from16 v0, v23

    move-object/from16 v1, p0

    move-object v11, v2

    move-object/from16 v2, v17

    move v13, v3

    move-object v3, v5

    move-object/from16 v5, v24

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LEX2;LsP5;LsP5;Lkotlin/coroutines/Continuation;)V

    sget v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->$stable:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit16 v0, v0, 0x1000

    sget v1, Lcom/stripe/android/link/LinkPaymentDetails$New;->$stable:I

    sget v2, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->$stable:I

    or-int/2addr v1, v2

    or-int v1, v1, v18

    shl-int/lit8 v1, v1, 0x6

    or-int/2addr v0, v1

    move-object/from16 v1, v19

    move-object/from16 v2, v21

    move-object/from16 v3, v22

    move-object/from16 v4, v23

    move-object v5, v14

    move-object/from16 v18, v6

    move v6, v0

    invoke-static/range {v1 .. v6}, LY91;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    const/4 v0, 0x0

    invoke-static {v15, v0, v13, v11}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v0

    const v1, -0x1cd0f17e

    invoke-interface {v14, v1}, LEt0;->F(I)V

    sget-object v1, Llo;->a:Llo;

    invoke-virtual {v1}, Llo;->g()Llo$l;

    move-result-object v1

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->j()LK9$b;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, v14, v3}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v1

    const v2, -0x4ee9b9da

    invoke-interface {v14, v2}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {v14, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {v14, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {v14, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v6, LBt0;->M:LBt0$a;

    invoke-virtual {v6}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v11

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {v14}, LEt0;->v()Llm;

    move-result-object v13

    instance-of v13, v13, Llm;

    if-nez v13, :cond_a

    invoke-static {}, Lyt0;->c()V

    :cond_a
    invoke-interface {v14}, LEt0;->h()V

    invoke-interface {v14}, LEt0;->t()Z

    move-result v13

    if-eqz v13, :cond_b

    invoke-interface {v14, v11}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_b
    invoke-interface {v14}, LEt0;->e()V

    :goto_3
    invoke-interface {v14}, LEt0;->L()V

    invoke-static {v14}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v11

    invoke-virtual {v6}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v13

    invoke-static {v11, v1, v13}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v11, v2, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v11, v4, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v11, v5, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v14}, LEt0;->q()V

    invoke-static {v14}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v14, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v14, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {v14, v0}, LEt0;->F(I)V

    sget-object v0, LQm0;->a:LQm0;

    const v0, 0x7d76db3

    invoke-interface {v14, v0}, LEt0;->F(I)V

    const/4 v0, 0x1

    new-array v11, v0, [LW94;

    invoke-static {}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->getLocalAutofillEventReporter()LU94;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$1;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getEventReporter$paymentsheet_release()Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$1;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v0

    aput-object v0, v11, v3

    new-instance v13, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;

    move-object v0, v13

    move-object/from16 v1, p0

    move-object v2, v7

    move v3, v9

    move-object v4, v8

    move-object v5, v12

    move-object/from16 v6, v17

    move-object/from16 v7, v18

    move-object/from16 v8, v16

    move-object/from16 v9, v20

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;ZLcom/stripe/android/paymentsheet/LinkHandler;LGX2;LEX2;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;LsP5;LEX2;Landroid/content/Context;)V

    const v0, -0x2cfc1d8d

    const/4 v1, 0x1

    invoke-static {v14, v0, v1, v13}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {v11, v0, v14, v1}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-interface {v14}, LEt0;->Q()V

    invoke-interface {v14}, LEt0;->Q()V

    invoke-interface {v14}, LEt0;->Q()V

    invoke-interface {v14}, LEt0;->f()V

    invoke-interface {v14}, LEt0;->Q()V

    invoke-interface {v14}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LQt0;->Y()V

    :cond_c
    invoke-interface {v14}, LEt0;->w()LWm5;

    move-result-object v0

    if-nez v0, :cond_d

    goto :goto_4

    :cond_d
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$4;

    move-object/from16 v4, p0

    move/from16 v5, p3

    move/from16 v6, p4

    invoke-direct {v1, v4, v15, v5, v6}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$4;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;II)V

    invoke-interface {v0, v1}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void

    :cond_e
    move/from16 v5, p3

    move-object v4, v11

    move-object v11, v0

    move-object v0, v12

    move-object v0, v11

    move-object v11, v4

    goto/16 :goto_2

    :cond_f
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Collection contains no element matching the predicate."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final AddPaymentMethod$lambda$1(LsP5;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final AddPaymentMethod$lambda$10(LsP5;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object p0
.end method

.method private static final AddPaymentMethod$lambda$11(LsP5;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    return-object p0
.end method

.method private static final AddPaymentMethod$lambda$13(LEX2;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            ">;)",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    return-object p0
.end method

.method private static final AddPaymentMethod$lambda$14(LEX2;Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            ">;",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final AddPaymentMethod$lambda$2(LsP5;)Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            ">;)",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    return-object p0
.end method

.method private static final AddPaymentMethod$lambda$4(LsP5;)Lcom/stripe/android/link/model/AccountStatus;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Lcom/stripe/android/link/model/AccountStatus;",
            ">;)",
            "Lcom/stripe/android/link/model/AccountStatus;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/model/AccountStatus;

    return-object p0
.end method

.method private static final AddPaymentMethod$lambda$5(LEX2;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final AddPaymentMethod$lambda$6(LEX2;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$AddPaymentMethod$lambda$1(LsP5;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$1(LsP5;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$AddPaymentMethod$lambda$10(LsP5;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$10(LsP5;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$AddPaymentMethod$lambda$11(LsP5;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$11(LsP5;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$AddPaymentMethod$lambda$13(LEX2;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$13(LEX2;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$AddPaymentMethod$lambda$14(LEX2;Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$14(LEX2;Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)V

    return-void
.end method

.method public static final synthetic access$AddPaymentMethod$lambda$5(LEX2;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$5(LEX2;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$AddPaymentMethod$lambda$6(LEX2;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$6(LEX2;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getInitiallySelectedPaymentMethodType(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->getInitiallySelectedPaymentMethodType(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final getInitiallySelectedPaymentMethodType(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getNewPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    move-result-object v0

    instance-of v1, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    if-eqz v1, :cond_0

    sget-object p0, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    goto :goto_2

    :cond_0
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    :goto_0
    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    instance-of v2, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;

    :goto_1
    if-eqz v2, :cond_3

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getTypeCode()Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSupportedPaymentMethods$paymentsheet_release()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object p0

    :goto_2
    return-object p0
.end method

.method private static final showLinkInlineSignupView(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Ljava/lang/String;Lcom/stripe/android/link/model/AccountStatus;)Z
    .locals 6

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/stripe/android/link/model/AccountStatus;

    sget-object v1, Lcom/stripe/android/link/model/AccountStatus;->Verified:Lcom/stripe/android/link/model/AccountStatus;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/stripe/android/link/model/AccountStatus;->NeedsVerification:Lcom/stripe/android/link/model/AccountStatus;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const/4 v1, 0x2

    sget-object v4, Lcom/stripe/android/link/model/AccountStatus;->VerificationStarted:Lcom/stripe/android/link/model/AccountStatus;

    aput-object v4, v0, v1

    const/4 v1, 0x3

    sget-object v4, Lcom/stripe/android/link/model/AccountStatus;->SignedOut:Lcom/stripe/android/link/model/AccountStatus;

    aput-object v4, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/LinkHandler;->getLinkInlineSelection()LGX2;

    move-result-object v1

    invoke-interface {v1}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/LinkHandler;->isLinkEnabled()LtP5;

    move-result-object v4

    invoke-interface {v4}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getStripeIntent$paymentsheet_release()LtP5;

    move-result-object p0

    invoke-interface {p0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/model/StripeIntent;

    if-eqz p0, :cond_1

    invoke-interface {p0}, Lcom/stripe/android/model/StripeIntent;->getLinkFundingSources()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_1

    sget-object v4, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v4, v4, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-interface {p0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-ne p0, v3, :cond_1

    move p0, v3

    goto :goto_1

    :cond_1
    move p0, v2

    :goto_1
    if-eqz p0, :cond_3

    sget-object p0, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {v0, p2}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    if-eqz v1, :cond_3

    :cond_2
    move v2, v3

    :cond_3
    return v2
.end method

.method public static final transformToPaymentSelection(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Landroid/content/Context;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethod"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter;->Companion:Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/forms/FormFieldValues;->getFieldValuePairs()Ljava/util/Map;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v5}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getSaveForFutureUse()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v5}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardBrand()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v4, 0x1

    :goto_2
    if-nez v4, :cond_0

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getRequiresMandate()Z

    move-result v3

    invoke-virtual {v0, v2, v1, v3}, Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion;->transformToPaymentMethodCreateParams(Ljava/util/Map;Ljava/lang/String;Z)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v9

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;

    sget-object p2, Lcom/stripe/android/model/CardBrand;->Companion:Lcom/stripe/android/model/CardBrand$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/forms/FormFieldValues;->getFieldValuePairs()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardBrand()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {p2, v0}, Lcom/stripe/android/model/CardBrand$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;

    move-result-object p2

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/forms/FormFieldValues;->getUserRequestedReuse()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    move-result-object p0

    invoke-direct {p1, v9, p2, p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;-><init>(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)V

    goto :goto_4

    :cond_5
    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getDisplayNameResource()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string p1, "context.getString(paymen\u2026thod.displayNameResource)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getIconResource()I

    move-result v6

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getLightThemeIconUrl()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getDarkThemeIconUrl()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/forms/FormFieldValues;->getUserRequestedReuse()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    move-result-object v10

    move-object v4, v0

    invoke-direct/range {v4 .. v10}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)V

    move-object p1, v0

    :goto_4
    return-object p1
.end method
