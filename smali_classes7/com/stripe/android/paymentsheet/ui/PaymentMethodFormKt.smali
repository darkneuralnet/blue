.class public final Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aU\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001ay\u0010\u000e\u001a\u00020\u00062\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00082\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "args",
        "",
        "enabled",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
        "",
        "onFormFieldValuesChanged",
        "LEu1;",
        "showCheckboxFlow",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "injector",
        "LgV2;",
        "modifier",
        "PaymentMethodForm",
        "(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;ZLkotlin/jvm/functions/Function1;LEu1;Lcom/stripe/android/core/injection/NonFallbackInjector;LgV2;LEt0;II)V",
        "",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "paymentMethodCode",
        "completeFormValues",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "hiddenIdentifiers",
        "",
        "Lcom/stripe/android/uicore/elements/FormElement;",
        "elements",
        "lastTextFieldIdentifier",
        "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;LEu1;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;LgV2;LEt0;II)V",
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
        "SMAP\nPaymentMethodForm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodForm.kt\ncom/stripe/android/paymentsheet/ui/PaymentMethodFormKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,78:1\n81#2,11:79\n76#3:90\n76#3:91\n76#3:92\n*S KotlinDebug\n*F\n+ 1 PaymentMethodForm.kt\ncom/stripe/android/paymentsheet/ui/PaymentMethodFormKt\n*L\n28#1:79,11\n37#1:90\n38#1:91\n39#1:92\n*E\n"
    }
.end annotation


# direct methods
.method public static final PaymentMethodForm(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;ZLkotlin/jvm/functions/Function1;LEu1;Lcom/stripe/android/core/injection/NonFallbackInjector;LgV2;LEt0;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
            "Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            "Lkotlin/Unit;",
            ">;",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/stripe/android/core/injection/NonFallbackInjector;",
            "LgV2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v7, p7

    const-string v0, "args"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFormFieldValuesChanged"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "showCheckboxFlow"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "injector"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3a9f34a9

    move-object/from16 v2, p6

    invoke-interface {v2, v0}, LEt0;->u(I)LEt0;

    move-result-object v2

    and-int/lit8 v6, p8, 0x20

    if-eqz v6, :cond_0

    sget-object v6, LgV2;->b0:LgV2$a;

    goto :goto_0

    :cond_0
    move-object/from16 v6, p5

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, -0x1

    const-string v9, "com.stripe.android.paymentsheet.ui.PaymentMethodForm (PaymentMethodForm.kt:19)"

    invoke-static {v0, v7, v8, v9}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getPaymentMethodCode()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;

    invoke-direct {v11, v1, v4, v5}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;LEu1;Lcom/stripe/android/core/injection/NonFallbackInjector;)V

    const v0, 0x671a9c9b

    invoke-interface {v2, v0}, LEt0;->F(I)V

    sget-object v0, Lpv2;->a:Lpv2;

    const/4 v8, 0x6

    invoke-virtual {v0, v2, v8}, Lpv2;->a(LEt0;I)LXr6;

    move-result-object v9

    if-eqz v9, :cond_5

    instance-of v0, v9, Landroidx/lifecycle/e;

    if-eqz v0, :cond_2

    move-object v0, v9

    check-cast v0, Landroidx/lifecycle/e;

    invoke-interface {v0}, Landroidx/lifecycle/e;->getDefaultViewModelCreationExtras()LFE0;

    move-result-object v0

    const-string v8, "{\n        viewModelStore\u2026ModelCreationExtras\n    }"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    sget-object v0, LFE0$a;->b:LFE0$a;

    :goto_1
    move-object v12, v0

    const-class v8, Lcom/stripe/android/paymentsheet/forms/FormViewModel;

    const v14, 0x9048

    const/4 v15, 0x0

    move-object v13, v2

    invoke-static/range {v8 .. v15}, LSr6;->b(Ljava/lang/Class;LXr6;Ljava/lang/String;Landroidx/lifecycle/u$b;LFE0;LEt0;II)LOr6;

    move-result-object v0

    invoke-interface {v2}, LEt0;->Q()V

    check-cast v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->getHiddenIdentifiers$paymentsheet_release()LEu1;

    move-result-object v8

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v9

    const/4 v10, 0x0

    const/16 v12, 0x38

    const/4 v13, 0x2

    move-object v11, v2

    invoke-static/range {v8 .. v13}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v14

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->getElementsFlow()LEu1;

    move-result-object v8

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v9

    invoke-static/range {v8 .. v13}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v15

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->getLastTextFieldIdentifier()LEu1;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static/range {v8 .. v13}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getPaymentMethodCode()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->getCompleteFormValues()LEu1;

    move-result-object v11

    invoke-static {v14}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt;->PaymentMethodForm$lambda$0(LsP5;)Ljava/util/Set;

    move-result-object v12

    invoke-static {v15}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt;->PaymentMethodForm$lambda$1(LsP5;)Ljava/util/List;

    move-result-object v13

    invoke-static {v8}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt;->PaymentMethodForm$lambda$2(LsP5;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v14

    and-int/lit8 v0, v7, 0x70

    const v8, 0x49000    # 4.19E-40f

    or-int/2addr v0, v8

    and-int/lit16 v8, v7, 0x380

    or-int/2addr v0, v8

    sget v8, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v8, v8, 0x12

    or-int/2addr v0, v8

    shl-int/lit8 v8, v7, 0x6

    const/high16 v10, 0x1c00000

    and-int/2addr v8, v10

    or-int v17, v0, v8

    const/16 v18, 0x0

    move-object v8, v9

    move/from16 v9, p1

    move-object/from16 v10, p2

    move-object v15, v6

    move-object/from16 v16, v2

    invoke-static/range {v8 .. v18}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt;->PaymentMethodForm(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;LEu1;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;LgV2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {v2}, LEt0;->w()LWm5;

    move-result-object v9

    if-nez v9, :cond_4

    goto :goto_2

    :cond_4
    new-instance v10, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$1;

    move-object v0, v10

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$1;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;ZLkotlin/jvm/functions/Function1;LEu1;Lcom/stripe/android/core/injection/NonFallbackInjector;LgV2;II)V

    invoke-interface {v9, v10}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final PaymentMethodForm(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;LEu1;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;LgV2;LEt0;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            "Lkotlin/Unit;",
            ">;",
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            ">;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "LgV2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v9, p9

    const-string v0, "paymentMethodCode"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFormFieldValuesChanged"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completeFormValues"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hiddenIdentifiers"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "elements"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x39285fb9

    move-object/from16 v2, p8

    invoke-interface {v2, v0}, LEt0;->u(I)LEt0;

    move-result-object v2

    move/from16 v8, p10

    and-int/lit16 v7, v8, 0x80

    if-eqz v7, :cond_0

    sget-object v7, LgV2;->b0:LgV2$a;

    move-object/from16 v18, v7

    goto :goto_0

    :cond_0
    move-object/from16 v18, p7

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, -0x1

    const-string v10, "com.stripe.android.paymentsheet.ui.PaymentMethodForm (PaymentMethodForm.kt:53)"

    invoke-static {v0, v9, v7, v10}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2;

    const/4 v7, 0x0

    invoke-direct {v0, v4, v3, v7}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2;-><init>(LEu1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    and-int/lit8 v7, v9, 0xe

    or-int/lit8 v7, v7, 0x40

    invoke-static {v1, v0, v2, v7}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    and-int/lit8 v0, v9, 0x70

    or-int/lit16 v0, v0, 0x208

    sget v7, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v7, v7, 0x9

    or-int/2addr v0, v7

    shr-int/lit8 v7, v9, 0x9

    and-int/lit16 v10, v7, 0x1c00

    or-int/2addr v0, v10

    const v10, 0xe000

    and-int/2addr v7, v10

    or-int v16, v0, v7

    const/16 v17, 0x0

    move-object/from16 v10, p4

    move/from16 v11, p1

    move-object/from16 v12, p5

    move-object/from16 v13, p6

    move-object/from16 v14, v18

    move-object v15, v2

    invoke-static/range {v10 .. v17}, Lcom/stripe/android/ui/core/FormUIKt;->FormUI(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;LgV2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {v2}, LEt0;->w()LWm5;

    move-result-object v11

    if-nez v11, :cond_3

    goto :goto_1

    :cond_3
    new-instance v12, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;

    move-object v0, v12

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, v18

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$3;-><init>(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;LEu1;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;LgV2;II)V

    invoke-interface {v11, v12}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method private static final PaymentMethodForm$lambda$0(LsP5;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;)",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method

.method private static final PaymentMethodForm$lambda$1(LsP5;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;>;)",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static final PaymentMethodForm$lambda$2(LsP5;)Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;)",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object p0
.end method
