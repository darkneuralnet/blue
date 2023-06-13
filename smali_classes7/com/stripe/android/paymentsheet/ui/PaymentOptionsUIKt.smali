.class public final Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001as\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000c2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u000e2\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0015\u001a\u001d\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a\u007f\u0010\"\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000c2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u000e2\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008 \u0010!\u001a=\u0010%\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000c2\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008#\u0010$\u001aM\u0010(\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00040\u000e2\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008&\u0010\'\u001aM\u0010*\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00040\u000e2\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008)\u0010\'\u001aq\u0010/\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u000e2\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008-\u0010.\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u00060"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
        "viewModel",
        "LgV2;",
        "modifier",
        "",
        "PaymentOptions",
        "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;II)V",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsState;",
        "state",
        "",
        "isEditing",
        "isProcessing",
        "Lkotlin/Function0;",
        "onAddCardPressed",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "onItemSelected",
        "Lcom/stripe/android/model/PaymentMethod;",
        "onItemRemoved",
        "LCo2;",
        "scrollState",
        "(Lcom/stripe/android/paymentsheet/PaymentOptionsState;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LCo2;LEt0;II)V",
        "Lk61;",
        "maxWidth",
        "rememberItemWidth-8Feqmps",
        "(FLEt0;I)F",
        "rememberItemWidth",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
        "item",
        "width",
        "isEnabled",
        "isSelected",
        "PaymentOption-iWtaglI",
        "(Lcom/stripe/android/paymentsheet/PaymentOptionsItem;FZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LEt0;II)V",
        "PaymentOption",
        "AddCard-AjpBEmI",
        "(FZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V",
        "AddCard",
        "GooglePay-PBTpf3Q",
        "(FZZLkotlin/jvm/functions/Function1;LgV2;LEt0;II)V",
        "GooglePay",
        "Link-PBTpf3Q",
        "Link",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;",
        "paymentMethod",
        "SavedPaymentMethod-Uww-Ezs",
        "(Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;FZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LEt0;II)V",
        "SavedPaymentMethod",
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
        "SMAP\nPaymentOptionsUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionsUI.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,269:1\n1057#2,3:270\n1060#2,3:282\n1057#2,6:286\n1057#2,6:293\n1057#2,6:300\n154#3:273\n154#3:276\n92#4:274\n58#4:275\n92#4:277\n51#4:278\n92#4:279\n81#4:280\n71#4:281\n36#5:285\n36#5:292\n36#5:299\n76#6:306\n76#7:307\n76#7:308\n76#7:309\n*S KotlinDebug\n*F\n+ 1 PaymentOptionsUI.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt\n*L\n93#1:270,3\n93#1:282,3\n197#1:286,6\n211#1:293,6\n228#1:300,6\n94#1:273\n95#1:276\n94#1:274\n94#1:275\n95#1:277\n95#1:278\n97#1:279\n97#1:280\n98#1:281\n197#1:285\n211#1:292\n228#1:299\n244#1:306\n38#1:307\n39#1:308\n40#1:309\n*E\n"
    }
.end annotation


# direct methods
.method private static final AddCard-AjpBEmI(FZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move/from16 v5, p5

    const v0, 0x69d85146

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    and-int/lit8 v2, p6, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v5, 0x6

    move v3, v2

    move/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v5, 0xe

    if-nez v2, :cond_2

    move/from16 v2, p0

    invoke-interface {v1, v2}, LEt0;->p(F)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_2
    move/from16 v2, p0

    move v3, v5

    :goto_1
    and-int/lit8 v4, p6, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v5, 0x70

    if-nez v4, :cond_5

    move/from16 v4, p1

    invoke-interface {v1, v4}, LEt0;->o(Z)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    goto :goto_4

    :cond_5
    :goto_3
    move/from16 v4, p1

    :goto_4
    and-int/lit8 v6, p6, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v3, v3, 0x180

    move-object/from16 v11, p2

    goto :goto_6

    :cond_6
    and-int/lit16 v6, v5, 0x380

    move-object/from16 v11, p2

    if-nez v6, :cond_8

    invoke-interface {v1, v11}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_5

    :cond_7
    const/16 v6, 0x80

    :goto_5
    or-int/2addr v3, v6

    :cond_8
    :goto_6
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v7, v5, 0x1c00

    if-nez v7, :cond_b

    move-object/from16 v7, p3

    invoke-interface {v1, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_7

    :cond_a
    const/16 v8, 0x400

    :goto_7
    or-int/2addr v3, v8

    goto :goto_9

    :cond_b
    :goto_8
    move-object/from16 v7, p3

    :goto_9
    and-int/lit16 v8, v3, 0x16db

    const/16 v9, 0x492

    if-ne v8, v9, :cond_d

    invoke-interface {v1}, LEt0;->b()Z

    move-result v8

    if-nez v8, :cond_c

    goto :goto_a

    :cond_c
    invoke-interface {v1}, LEt0;->k()V

    goto/16 :goto_d

    :cond_d
    :goto_a
    if-eqz v6, :cond_e

    sget-object v6, LgV2;->b0:LgV2$a;

    move-object/from16 v24, v6

    goto :goto_b

    :cond_e
    move-object/from16 v24, v7

    :goto_b
    invoke-static {}, LQt0;->O()Z

    move-result v6

    if-eqz v6, :cond_f

    const/4 v6, -0x1

    const-string v7, "com.stripe.android.paymentsheet.ui.AddCard (PaymentOptionsUI.kt:155)"

    invoke-static {v0, v3, v6, v7}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_f
    sget-object v0, LTM2;->a:LTM2;

    sget v6, LTM2;->b:I

    invoke-static {v0, v1, v6}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/StripeColors;->getComponent-0d7_KjU()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/stripe/android/uicore/StripeThemeKt;->shouldUseDarkDynamicColor-8_81llA(J)Z

    move-result v0

    if-eqz v0, :cond_10

    sget v0, Lcom/stripe/android/paymentsheet/R$drawable;->stripe_ic_paymentsheet_add_dark:I

    goto :goto_c

    :cond_10
    sget v0, Lcom/stripe/android/paymentsheet/R$drawable;->stripe_ic_paymentsheet_add_light:I

    :goto_c
    move v10, v0

    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_add_payment_method_button_label:I

    const/4 v6, 0x0

    invoke-static {v0, v1, v6}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v14

    sget v0, Lcom/stripe/android/paymentsheet/R$string;->add_new_payment_method:I

    invoke-static {v0, v1, v6}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v16

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    and-int/lit8 v0, v3, 0xe

    or-int/lit16 v0, v0, 0x1b0

    shl-int/lit8 v6, v3, 0x6

    and-int/lit16 v9, v6, 0x1c00

    or-int/2addr v0, v9

    const/high16 v9, 0x70000

    and-int/2addr v6, v9

    or-int v21, v0, v6

    shl-int/lit8 v0, v3, 0x3

    and-int/lit16 v0, v0, 0x1c00

    move/from16 v22, v0

    const/16 v23, 0x1ac0

    move/from16 v6, p0

    move/from16 v9, p1

    move-object/from16 v11, v24

    move-object/from16 v19, p2

    move-object/from16 v20, v1

    invoke-static/range {v6 .. v23}, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt;->PaymentOptionUi-VPtddqc(FZZZILgV2;Lpm0;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {}, LQt0;->Y()V

    :cond_11
    move-object/from16 v7, v24

    :goto_d
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v8

    if-nez v8, :cond_12

    goto :goto_e

    :cond_12
    new-instance v9, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$AddCard$1;

    move-object v0, v9

    move/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object v4, v7

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$AddCard$1;-><init>(FZLkotlin/jvm/functions/Function0;LgV2;II)V

    invoke-interface {v8, v9}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_e
    return-void
.end method

.method private static final GooglePay-PBTpf3Q(FZZLkotlin/jvm/functions/Function1;LgV2;LEt0;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p3

    move/from16 v6, p6

    const v0, -0x61ddc9bb

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    and-int/lit8 v2, p7, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v6, 0x6

    move v3, v2

    move/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v6, 0xe

    if-nez v2, :cond_2

    move/from16 v2, p0

    invoke-interface {v1, v2}, LEt0;->p(F)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v6

    goto :goto_1

    :cond_2
    move/from16 v2, p0

    move v3, v6

    :goto_1
    and-int/lit8 v5, p7, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v6, 0x70

    if-nez v5, :cond_5

    move/from16 v5, p1

    invoke-interface {v1, v5}, LEt0;->o(Z)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    goto :goto_4

    :cond_5
    :goto_3
    move/from16 v5, p1

    :goto_4
    and-int/lit8 v7, p7, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v3, v3, 0x180

    move/from16 v15, p2

    goto :goto_6

    :cond_6
    and-int/lit16 v7, v6, 0x380

    move/from16 v15, p2

    if-nez v7, :cond_8

    invoke-interface {v1, v15}, LEt0;->o(Z)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_5

    :cond_7
    const/16 v7, 0x80

    :goto_5
    or-int/2addr v3, v7

    :cond_8
    :goto_6
    and-int/lit8 v7, p7, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v7, v6, 0x1c00

    if-nez v7, :cond_b

    invoke-interface {v1, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x800

    goto :goto_7

    :cond_a
    const/16 v7, 0x400

    :goto_7
    or-int/2addr v3, v7

    :cond_b
    :goto_8
    and-int/lit8 v7, p7, 0x10

    if-eqz v7, :cond_c

    or-int/lit16 v3, v3, 0x6000

    goto :goto_a

    :cond_c
    const v8, 0xe000

    and-int/2addr v8, v6

    if-nez v8, :cond_e

    move-object/from16 v8, p4

    invoke-interface {v1, v8}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    const/16 v9, 0x4000

    goto :goto_9

    :cond_d
    const/16 v9, 0x2000

    :goto_9
    or-int/2addr v3, v9

    goto :goto_b

    :cond_e
    :goto_a
    move-object/from16 v8, p4

    :goto_b
    const v9, 0xb6db

    and-int/2addr v9, v3

    const/16 v10, 0x2492

    if-ne v9, v10, :cond_10

    invoke-interface {v1}, LEt0;->b()Z

    move-result v9

    if-nez v9, :cond_f

    goto :goto_c

    :cond_f
    invoke-interface {v1}, LEt0;->k()V

    goto/16 :goto_e

    :cond_10
    :goto_c
    if-eqz v7, :cond_11

    sget-object v7, LgV2;->b0:LgV2$a;

    move-object/from16 v25, v7

    goto :goto_d

    :cond_11
    move-object/from16 v25, v8

    :goto_d
    invoke-static {}, LQt0;->O()Z

    move-result v7

    if-eqz v7, :cond_12

    const/4 v7, -0x1

    const-string v8, "com.stripe.android.paymentsheet.ui.GooglePay (PaymentOptionsUI.kt:181)"

    invoke-static {v0, v3, v7, v8}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_12
    sget v11, Lcom/stripe/android/paymentsheet/R$drawable;->stripe_google_pay_mark:I

    sget v0, Lcom/stripe/android/paymentsheet/R$string;->google_pay:I

    const/4 v7, 0x0

    invoke-static {v0, v1, v7}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v16

    invoke-static {v0, v1, v7}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v17

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v0, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v7, 0x44faf204

    invoke-interface {v1, v7}, LEt0;->F(I)V

    invoke-interface {v1, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_13

    sget-object v7, LEt0;->a:LEt0$a;

    invoke-virtual {v7}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_14

    :cond_13
    new-instance v8, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$GooglePay$1$1;

    invoke-direct {v8, v4}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$GooglePay$1$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v1, v8}, LEt0;->z(Ljava/lang/Object;)V

    :cond_14
    invoke-interface {v1}, LEt0;->Q()V

    move-object/from16 v20, v8

    check-cast v20, Lkotlin/jvm/functions/Function0;

    and-int/lit8 v7, v3, 0xe

    or-int/lit16 v7, v7, 0x180

    shr-int/lit8 v8, v3, 0x3

    and-int/lit8 v8, v8, 0x70

    or-int/2addr v7, v8

    shl-int/lit8 v8, v3, 0x6

    and-int/lit16 v8, v8, 0x1c00

    or-int/2addr v7, v8

    const/high16 v8, 0x70000

    shl-int/lit8 v3, v3, 0x3

    and-int/2addr v3, v8

    or-int v22, v7, v3

    const/16 v23, 0x0

    const/16 v24, 0x1ac0

    move/from16 v7, p0

    move/from16 v8, p2

    move/from16 v10, p1

    move-object/from16 v12, v25

    move-object/from16 v15, v16

    move-object/from16 v16, v0

    move-object/from16 v21, v1

    invoke-static/range {v7 .. v24}, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt;->PaymentOptionUi-VPtddqc(FZZZILgV2;Lpm0;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-static {}, LQt0;->Y()V

    :cond_15
    move-object/from16 v8, v25

    :goto_e
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v9

    if-nez v9, :cond_16

    goto :goto_f

    :cond_16
    new-instance v10, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$GooglePay$2;

    move-object v0, v10

    move/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object v5, v8

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$GooglePay$2;-><init>(FZZLkotlin/jvm/functions/Function1;LgV2;II)V

    invoke-interface {v9, v10}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_f
    return-void
.end method

.method private static final Link-PBTpf3Q(FZZLkotlin/jvm/functions/Function1;LgV2;LEt0;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p3

    move/from16 v6, p6

    const v0, 0x7be1f4fe

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    and-int/lit8 v2, p7, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v6, 0x6

    move v3, v2

    move/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v6, 0xe

    if-nez v2, :cond_2

    move/from16 v2, p0

    invoke-interface {v1, v2}, LEt0;->p(F)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v6

    goto :goto_1

    :cond_2
    move/from16 v2, p0

    move v3, v6

    :goto_1
    and-int/lit8 v5, p7, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v6, 0x70

    if-nez v5, :cond_5

    move/from16 v5, p1

    invoke-interface {v1, v5}, LEt0;->o(Z)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    goto :goto_4

    :cond_5
    :goto_3
    move/from16 v5, p1

    :goto_4
    and-int/lit8 v7, p7, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v3, v3, 0x180

    move/from16 v15, p2

    goto :goto_6

    :cond_6
    and-int/lit16 v7, v6, 0x380

    move/from16 v15, p2

    if-nez v7, :cond_8

    invoke-interface {v1, v15}, LEt0;->o(Z)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_5

    :cond_7
    const/16 v7, 0x80

    :goto_5
    or-int/2addr v3, v7

    :cond_8
    :goto_6
    and-int/lit8 v7, p7, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v7, v6, 0x1c00

    if-nez v7, :cond_b

    invoke-interface {v1, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x800

    goto :goto_7

    :cond_a
    const/16 v7, 0x400

    :goto_7
    or-int/2addr v3, v7

    :cond_b
    :goto_8
    and-int/lit8 v7, p7, 0x10

    if-eqz v7, :cond_c

    or-int/lit16 v3, v3, 0x6000

    goto :goto_a

    :cond_c
    const v8, 0xe000

    and-int/2addr v8, v6

    if-nez v8, :cond_e

    move-object/from16 v8, p4

    invoke-interface {v1, v8}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    const/16 v9, 0x4000

    goto :goto_9

    :cond_d
    const/16 v9, 0x2000

    :goto_9
    or-int/2addr v3, v9

    goto :goto_b

    :cond_e
    :goto_a
    move-object/from16 v8, p4

    :goto_b
    const v9, 0xb6db

    and-int/2addr v9, v3

    const/16 v10, 0x2492

    if-ne v9, v10, :cond_10

    invoke-interface {v1}, LEt0;->b()Z

    move-result v9

    if-nez v9, :cond_f

    goto :goto_c

    :cond_f
    invoke-interface {v1}, LEt0;->k()V

    goto/16 :goto_f

    :cond_10
    :goto_c
    if-eqz v7, :cond_11

    sget-object v7, LgV2;->b0:LgV2$a;

    move-object/from16 v25, v7

    goto :goto_d

    :cond_11
    move-object/from16 v25, v8

    :goto_d
    invoke-static {}, LQt0;->O()Z

    move-result v7

    if-eqz v7, :cond_12

    const/4 v7, -0x1

    const-string v8, "com.stripe.android.paymentsheet.ui.Link (PaymentOptionsUI.kt:202)"

    invoke-static {v0, v3, v7, v8}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_12
    sget-object v0, LTM2;->a:LTM2;

    sget v7, LTM2;->b:I

    invoke-static {v0, v1, v7}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/StripeColors;->getComponent-0d7_KjU()J

    move-result-wide v7

    invoke-static {v7, v8}, Lpm0;->i(J)Lpm0;

    move-result-object v0

    const v9, 0x44faf204

    invoke-interface {v1, v9}, LEt0;->F(I)V

    invoke-interface {v1, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v10

    if-nez v0, :cond_13

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v10, v0, :cond_15

    :cond_13
    invoke-static {v7, v8}, Lcom/stripe/android/uicore/StripeThemeKt;->shouldUseDarkDynamicColor-8_81llA(J)Z

    move-result v0

    if-eqz v0, :cond_14

    sget-object v0, Lpm0;->b:Lpm0$a;

    invoke-virtual {v0}, Lpm0$a;->a()J

    move-result-wide v7

    goto :goto_e

    :cond_14
    sget-object v0, Lpm0;->b:Lpm0$a;

    invoke-virtual {v0}, Lpm0$a;->h()J

    move-result-wide v7

    :goto_e
    invoke-static {v7, v8}, Lpm0;->i(J)Lpm0;

    move-result-object v10

    invoke-interface {v1, v10}, LEt0;->z(Ljava/lang/Object;)V

    :cond_15
    invoke-interface {v1}, LEt0;->Q()V

    check-cast v10, Lpm0;

    invoke-virtual {v10}, Lpm0;->w()J

    move-result-wide v7

    sget v11, Lcom/stripe/android/paymentsheet/R$drawable;->stripe_link_mark:I

    sget v0, Lcom/stripe/android/paymentsheet/R$string;->link:I

    const/4 v10, 0x0

    invoke-static {v0, v1, v10}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v16

    invoke-static {v0, v1, v10}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v17

    const/4 v0, 0x0

    invoke-static {v7, v8}, Lpm0;->i(J)Lpm0;

    move-result-object v13

    const/4 v14, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-interface {v1, v9}, LEt0;->F(I)V

    invoke-interface {v1, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_16

    sget-object v7, LEt0;->a:LEt0$a;

    invoke-virtual {v7}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_17

    :cond_16
    new-instance v8, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$Link$1$1;

    invoke-direct {v8, v4}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$Link$1$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v1, v8}, LEt0;->z(Ljava/lang/Object;)V

    :cond_17
    invoke-interface {v1}, LEt0;->Q()V

    move-object/from16 v20, v8

    check-cast v20, Lkotlin/jvm/functions/Function0;

    and-int/lit8 v7, v3, 0xe

    or-int/lit16 v7, v7, 0x180

    shr-int/lit8 v8, v3, 0x3

    and-int/lit8 v8, v8, 0x70

    or-int/2addr v7, v8

    shl-int/lit8 v8, v3, 0x6

    and-int/lit16 v8, v8, 0x1c00

    or-int/2addr v7, v8

    const/high16 v8, 0x70000

    shl-int/lit8 v3, v3, 0x3

    and-int/2addr v3, v8

    or-int v22, v7, v3

    const/16 v23, 0x0

    const/16 v24, 0x1a80

    move/from16 v7, p0

    move/from16 v8, p2

    move v9, v0

    move/from16 v10, p1

    move-object/from16 v12, v25

    move-object/from16 v15, v16

    move-object/from16 v16, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v21

    move-object/from16 v21, v1

    invoke-static/range {v7 .. v24}, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt;->PaymentOptionUi-VPtddqc(FZZZILgV2;Lpm0;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, LQt0;->Y()V

    :cond_18
    move-object/from16 v8, v25

    :goto_f
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v9

    if-nez v9, :cond_19

    goto :goto_10

    :cond_19
    new-instance v10, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$Link$2;

    move-object v0, v10

    move/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object v5, v8

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$Link$2;-><init>(FZZLkotlin/jvm/functions/Function1;LgV2;II)V

    invoke-interface {v9, v10}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_10
    return-void
.end method

.method private static final PaymentOption-iWtaglI(Lcom/stripe/android/paymentsheet/PaymentOptionsItem;FZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LEt0;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            "FZZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v10, p10

    move/from16 v11, p11

    const v0, -0x6ab72e87

    move-object/from16 v2, p9

    invoke-interface {v2, v0}, LEt0;->u(I)LEt0;

    move-result-object v15

    and-int/lit8 v2, v11, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v10, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v10, 0xe

    if-nez v2, :cond_2

    invoke-interface {v15, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v10

    goto :goto_1

    :cond_2
    move v2, v10

    :goto_1
    and-int/lit8 v3, v11, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    move/from16 v14, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v10, 0x70

    move/from16 v14, p1

    if-nez v3, :cond_5

    invoke-interface {v15, v14}, LEt0;->p(F)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, v11, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v2, v2, 0x180

    move/from16 v13, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v3, v10, 0x380

    move/from16 v13, p2

    if-nez v3, :cond_8

    invoke-interface {v15, v13}, LEt0;->o(Z)Z

    move-result v3

    if-eqz v3, :cond_7

    const/16 v3, 0x100

    goto :goto_4

    :cond_7
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v2, v3

    :cond_8
    :goto_5
    and-int/lit8 v3, v11, 0x8

    if-eqz v3, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move/from16 v12, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v3, v10, 0x1c00

    move/from16 v12, p3

    if-nez v3, :cond_b

    invoke-interface {v15, v12}, LEt0;->o(Z)Z

    move-result v3

    if-eqz v3, :cond_a

    const/16 v3, 0x800

    goto :goto_6

    :cond_a
    const/16 v3, 0x400

    :goto_6
    or-int/2addr v2, v3

    :cond_b
    :goto_7
    and-int/lit8 v3, v11, 0x10

    const v4, 0xe000

    if-eqz v3, :cond_c

    or-int/lit16 v2, v2, 0x6000

    move/from16 v9, p4

    goto :goto_9

    :cond_c
    and-int v3, v10, v4

    move/from16 v9, p4

    if-nez v3, :cond_e

    invoke-interface {v15, v9}, LEt0;->o(Z)Z

    move-result v3

    if-eqz v3, :cond_d

    const/16 v3, 0x4000

    goto :goto_8

    :cond_d
    const/16 v3, 0x2000

    :goto_8
    or-int/2addr v2, v3

    :cond_e
    :goto_9
    and-int/lit8 v3, v11, 0x20

    const/high16 v5, 0x70000

    if-eqz v3, :cond_f

    const/high16 v3, 0x30000

    or-int/2addr v2, v3

    move-object/from16 v8, p5

    goto :goto_b

    :cond_f
    and-int v3, v10, v5

    move-object/from16 v8, p5

    if-nez v3, :cond_11

    invoke-interface {v15, v8}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    const/high16 v3, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v3, 0x10000

    :goto_a
    or-int/2addr v2, v3

    :cond_11
    :goto_b
    and-int/lit8 v3, v11, 0x40

    const/high16 v6, 0x380000

    if-eqz v3, :cond_12

    const/high16 v3, 0x180000

    or-int/2addr v2, v3

    move-object/from16 v7, p6

    goto :goto_d

    :cond_12
    and-int v3, v10, v6

    move-object/from16 v7, p6

    if-nez v3, :cond_14

    invoke-interface {v15, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    const/high16 v3, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v3, 0x80000

    :goto_c
    or-int/2addr v2, v3

    :cond_14
    :goto_d
    and-int/lit16 v3, v11, 0x80

    const/high16 v16, 0x1c00000

    if-eqz v3, :cond_15

    const/high16 v3, 0xc00000

    or-int/2addr v2, v3

    goto :goto_f

    :cond_15
    and-int v3, v10, v16

    if-nez v3, :cond_17

    move-object/from16 v3, p7

    invoke-interface {v15, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_16

    const/high16 v17, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v17, 0x400000

    :goto_e
    or-int v2, v2, v17

    goto :goto_10

    :cond_17
    :goto_f
    move-object/from16 v3, p7

    :goto_10
    and-int/lit16 v6, v11, 0x100

    if-eqz v6, :cond_18

    const/high16 v17, 0x6000000

    or-int v2, v2, v17

    move-object/from16 v5, p8

    goto :goto_12

    :cond_18
    const/high16 v17, 0xe000000

    and-int v17, v10, v17

    move-object/from16 v5, p8

    if-nez v17, :cond_1a

    invoke-interface {v15, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_19

    const/high16 v18, 0x4000000

    goto :goto_11

    :cond_19
    const/high16 v18, 0x2000000

    :goto_11
    or-int v2, v2, v18

    :cond_1a
    :goto_12
    const v18, 0xb6db6db

    and-int v4, v2, v18

    const v0, 0x2492492

    if-ne v4, v0, :cond_1c

    invoke-interface {v15}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_13

    :cond_1b
    invoke-interface {v15}, LEt0;->k()V

    move-object v9, v5

    move-object v2, v15

    goto/16 :goto_17

    :cond_1c
    :goto_13
    if-eqz v6, :cond_1d

    sget-object v0, LgV2;->b0:LgV2$a;

    goto :goto_14

    :cond_1d
    move-object v0, v5

    :goto_14
    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_1e

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.paymentsheet.ui.PaymentOption (PaymentOptionsUI.kt:101)"

    const v6, -0x6ab72e87

    invoke-static {v6, v2, v4, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1e
    instance-of v4, v1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;

    if-eqz v4, :cond_1f

    const v4, 0x4513c359

    invoke-interface {v15, v4}, LEt0;->F(I)V

    shr-int/lit8 v4, v2, 0x3

    and-int/lit8 v5, v4, 0xe

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v4, v5

    shr-int/lit8 v5, v2, 0x9

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v4, v5

    shr-int/lit8 v2, v2, 0xf

    and-int/lit16 v2, v2, 0x1c00

    or-int v16, v4, v2

    const/16 v17, 0x0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p5

    move-object v5, v0

    move-object v6, v15

    move/from16 v7, v16

    move/from16 v8, v17

    invoke-static/range {v2 .. v8}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->AddCard-AjpBEmI(FZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V

    invoke-interface {v15}, LEt0;->Q()V

    :goto_15
    move-object v2, v15

    goto/16 :goto_16

    :cond_1f
    instance-of v3, v1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;

    if-eqz v3, :cond_20

    const v3, 0x4513c453

    invoke-interface {v15, v3}, LEt0;->F(I)V

    shr-int/lit8 v3, v2, 0x3

    and-int/lit8 v4, v3, 0xe

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v3, v4

    shr-int/lit8 v4, v2, 0x6

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v3, v4

    shr-int/lit8 v4, v2, 0x9

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v3, v4

    shr-int/lit8 v2, v2, 0xc

    const v4, 0xe000

    and-int/2addr v2, v4

    or-int v8, v3, v2

    const/16 v16, 0x0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v5, p6

    move-object v6, v0

    move-object v7, v15

    move/from16 v9, v16

    invoke-static/range {v2 .. v9}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->GooglePay-PBTpf3Q(FZZLkotlin/jvm/functions/Function1;LgV2;LEt0;II)V

    invoke-interface {v15}, LEt0;->Q()V

    goto :goto_15

    :cond_20
    instance-of v3, v1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$Link;

    if-eqz v3, :cond_21

    const v3, 0x4513c56f

    invoke-interface {v15, v3}, LEt0;->F(I)V

    shr-int/lit8 v3, v2, 0x3

    and-int/lit8 v4, v3, 0xe

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v3, v4

    shr-int/lit8 v4, v2, 0x6

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v3, v4

    shr-int/lit8 v4, v2, 0x9

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v3, v4

    shr-int/lit8 v2, v2, 0xc

    const v4, 0xe000

    and-int/2addr v2, v4

    or-int v8, v3, v2

    const/4 v9, 0x0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v5, p6

    move-object v6, v0

    move-object v7, v15

    invoke-static/range {v2 .. v9}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->Link-PBTpf3Q(FZZLkotlin/jvm/functions/Function1;LgV2;LEt0;II)V

    invoke-interface {v15}, LEt0;->Q()V

    goto :goto_15

    :cond_21
    instance-of v3, v1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    if-eqz v3, :cond_22

    const v3, 0x4513c694

    invoke-interface {v15, v3}, LEt0;->F(I)V

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    sget v4, Lcom/stripe/android/model/PaymentMethod;->$stable:I

    and-int/lit8 v5, v2, 0x70

    or-int/2addr v4, v5

    and-int/lit16 v5, v2, 0x380

    or-int/2addr v4, v5

    and-int/lit16 v5, v2, 0x1c00

    or-int/2addr v4, v5

    const v5, 0xe000

    and-int/2addr v5, v2

    or-int/2addr v4, v5

    shr-int/lit8 v2, v2, 0x3

    const/high16 v5, 0x70000

    and-int/2addr v5, v2

    or-int/2addr v4, v5

    const/high16 v5, 0x380000

    and-int/2addr v5, v2

    or-int/2addr v4, v5

    and-int v2, v2, v16

    or-int v21, v4, v2

    const/16 v22, 0x0

    move-object v12, v3

    move/from16 v13, p1

    move/from16 v14, p2

    move-object v2, v15

    move/from16 v15, p3

    move/from16 v16, p4

    move-object/from16 v17, p6

    move-object/from16 v18, p7

    move-object/from16 v19, v0

    move-object/from16 v20, v2

    invoke-static/range {v12 .. v22}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->SavedPaymentMethod-Uww-Ezs(Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;FZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LEt0;II)V

    invoke-interface {v2}, LEt0;->Q()V

    goto :goto_16

    :cond_22
    move-object v2, v15

    const v3, 0x4513c814

    invoke-interface {v2, v3}, LEt0;->F(I)V

    invoke-interface {v2}, LEt0;->Q()V

    :goto_16
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_23

    invoke-static {}, LQt0;->Y()V

    :cond_23
    move-object v9, v0

    :goto_17
    invoke-interface {v2}, LEt0;->w()LWm5;

    move-result-object v12

    if-nez v12, :cond_24

    goto :goto_18

    :cond_24
    new-instance v13, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;

    move-object v0, v13

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOption$1;-><init>(Lcom/stripe/android/paymentsheet/PaymentOptionsItem;FZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;II)V

    invoke-interface {v12, v13}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_18
    return-void
.end method

.method public static final PaymentOptions(Lcom/stripe/android/paymentsheet/PaymentOptionsState;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LCo2;LEt0;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsState;",
            "ZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "LCo2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move/from16 v10, p10

    const-string v0, "state"

    move-object/from16 v11, p0

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAddCardPressed"

    move-object/from16 v12, p3

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemSelected"

    move-object/from16 v13, p4

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemRemoved"

    move-object/from16 v14, p5

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x1b6d591

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v15

    and-int/lit8 v1, v10, 0x40

    if-eqz v1, :cond_0

    sget-object v1, LgV2;->b0:LgV2$a;

    move-object v9, v1

    goto :goto_0

    :cond_0
    move-object/from16 v9, p6

    :goto_0
    and-int/lit16 v1, v10, 0x80

    if-eqz v1, :cond_1

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v2, v2, v15, v2, v1}, LDo2;->a(IILEt0;II)LCo2;

    move-result-object v1

    const v2, -0x1c00001

    and-int v2, p9, v2

    move-object/from16 v16, v1

    move v4, v2

    goto :goto_1

    :cond_1
    move-object/from16 v16, p7

    move/from16 v4, p9

    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.ui.PaymentOptions (PaymentOptionsUI.kt:53)"

    invoke-static {v0, v4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v8, 0x1

    invoke-static {v9, v0, v8, v1}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v0

    const/16 v17, 0x0

    const/16 v18, 0x0

    new-instance v7, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;

    move-object v1, v7

    move/from16 v2, p2

    move-object/from16 v3, v16

    move-object/from16 v5, p0

    move/from16 v6, p1

    move-object v10, v7

    move-object/from16 v7, p3

    move v11, v8

    move-object/from16 v8, p4

    move-object/from16 v19, v9

    move-object/from16 v9, p5

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;-><init>(ZLCo2;ILcom/stripe/android/paymentsheet/PaymentOptionsState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    const v1, 0x2257aa59

    invoke-static {v15, v1, v11, v10}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v4

    const/16 v6, 0xc00

    const/4 v7, 0x6

    move-object v1, v0

    move-object/from16 v2, v17

    move/from16 v3, v18

    move-object v5, v15

    invoke-static/range {v1 .. v7}, Lg10;->a(LgV2;LK9;ZLkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {v15}, LEt0;->w()LWm5;

    move-result-object v11

    if-nez v11, :cond_4

    goto :goto_2

    :cond_4
    new-instance v15, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$6;

    move-object v0, v15

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, v19

    move-object/from16 v8, v16

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$6;-><init>(Lcom/stripe/android/paymentsheet/PaymentOptionsState;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LCo2;II)V

    invoke-interface {v11, v15}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final PaymentOptions(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;II)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "viewModel"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x366b22fb

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LEt0;->u(I)LEt0;

    move-result-object v15

    and-int/lit8 v4, v2, 0x2

    if-eqz v4, :cond_0

    sget-object v4, LgV2;->b0:LgV2$a;

    move-object v14, v4

    goto :goto_0

    :cond_0
    move-object/from16 v14, p1

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.paymentsheet.ui.PaymentOptions (PaymentOptionsUI.kt:33)"

    invoke-static {v3, v1, v4, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getPaymentOptionsState()LtP5;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x1

    invoke-static {v3, v4, v15, v5, v6}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getEditing$paymentsheet_release()LtP5;

    move-result-object v7

    invoke-static {v7, v4, v15, v5, v6}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getProcessing()LtP5;

    move-result-object v8

    invoke-static {v8, v4, v15, v5, v6}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v4

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->PaymentOptions$lambda$0(LsP5;)Lcom/stripe/android/paymentsheet/PaymentOptionsState;

    move-result-object v3

    invoke-static {v7}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->PaymentOptions$lambda$1(LsP5;)Z

    move-result v6

    invoke-static {v4}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->PaymentOptions$lambda$2(LsP5;)Z

    move-result v7

    new-instance v8, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$1;

    invoke-direct {v8, v0}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$1;-><init>(Ljava/lang/Object;)V

    new-instance v9, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$2;

    invoke-direct {v9, v0}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$2;-><init>(Ljava/lang/Object;)V

    new-instance v10, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$3;

    invoke-direct {v10, v0}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$3;-><init>(Ljava/lang/Object;)V

    const/4 v11, 0x0

    shl-int/lit8 v4, v1, 0xf

    const/high16 v12, 0x380000

    and-int/2addr v4, v12

    or-int/lit8 v13, v4, 0x8

    const/16 v16, 0x80

    move-object v4, v3

    move v5, v6

    move v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v14

    move-object v12, v15

    move-object v3, v14

    move/from16 v14, v16

    invoke-static/range {v4 .. v14}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->PaymentOptions(Lcom/stripe/android/paymentsheet/PaymentOptionsState;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LCo2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {v15}, LEt0;->w()LWm5;

    move-result-object v4

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    new-instance v5, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$4;

    invoke-direct {v5, v0, v3, v1, v2}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$4;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;II)V

    invoke-interface {v4, v5}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method private static final PaymentOptions$lambda$0(LsP5;)Lcom/stripe/android/paymentsheet/PaymentOptionsState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsState;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsState;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentOptionsState;

    return-object p0
.end method

.method private static final PaymentOptions$lambda$1(LsP5;)Z
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

.method private static final PaymentOptions$lambda$2(LsP5;)Z
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

.method private static final SavedPaymentMethod-Uww-Ezs(Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;FZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LEt0;II)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;",
            "FZZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v9, p9

    move/from16 v10, p10

    const v0, 0x734cf779

    move-object/from16 v2, p8

    invoke-interface {v2, v0}, LEt0;->u(I)LEt0;

    move-result-object v2

    and-int/lit8 v3, v10, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v9, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v9, 0xe

    if-nez v3, :cond_2

    invoke-interface {v2, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v9

    goto :goto_1

    :cond_2
    move v3, v9

    :goto_1
    and-int/lit8 v4, v10, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v9, 0x70

    if-nez v4, :cond_5

    move/from16 v4, p1

    invoke-interface {v2, v4}, LEt0;->p(F)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    goto :goto_4

    :cond_5
    :goto_3
    move/from16 v4, p1

    :goto_4
    and-int/lit8 v5, v10, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v3, v3, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v5, v9, 0x380

    if-nez v5, :cond_8

    move/from16 v5, p2

    invoke-interface {v2, v5}, LEt0;->o(Z)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_5

    :cond_7
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v3, v8

    goto :goto_7

    :cond_8
    :goto_6
    move/from16 v5, p2

    :goto_7
    and-int/lit8 v8, v10, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v8, v9, 0x1c00

    if-nez v8, :cond_b

    move/from16 v8, p3

    invoke-interface {v2, v8}, LEt0;->o(Z)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_8

    :cond_a
    const/16 v11, 0x400

    :goto_8
    or-int/2addr v3, v11

    goto :goto_a

    :cond_b
    :goto_9
    move/from16 v8, p3

    :goto_a
    and-int/lit8 v11, v10, 0x10

    if-eqz v11, :cond_c

    or-int/lit16 v3, v3, 0x6000

    move/from16 v15, p4

    goto :goto_c

    :cond_c
    const v11, 0xe000

    and-int/2addr v11, v9

    move/from16 v15, p4

    if-nez v11, :cond_e

    invoke-interface {v2, v15}, LEt0;->o(Z)Z

    move-result v11

    if-eqz v11, :cond_d

    const/16 v11, 0x4000

    goto :goto_b

    :cond_d
    const/16 v11, 0x2000

    :goto_b
    or-int/2addr v3, v11

    :cond_e
    :goto_c
    and-int/lit8 v11, v10, 0x20

    const/high16 v12, 0x70000

    if-eqz v11, :cond_f

    const/high16 v11, 0x30000

    :goto_d
    or-int/2addr v3, v11

    goto :goto_e

    :cond_f
    and-int v11, v9, v12

    if-nez v11, :cond_11

    invoke-interface {v2, v6}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_10

    const/high16 v11, 0x20000

    goto :goto_d

    :cond_10
    const/high16 v11, 0x10000

    goto :goto_d

    :cond_11
    :goto_e
    and-int/lit8 v11, v10, 0x40

    if-eqz v11, :cond_12

    const/high16 v11, 0x180000

    :goto_f
    or-int/2addr v3, v11

    goto :goto_10

    :cond_12
    const/high16 v11, 0x380000

    and-int/2addr v11, v9

    if-nez v11, :cond_14

    invoke-interface {v2, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_13

    const/high16 v11, 0x100000

    goto :goto_f

    :cond_13
    const/high16 v11, 0x80000

    goto :goto_f

    :cond_14
    :goto_10
    and-int/lit16 v11, v10, 0x80

    if-eqz v11, :cond_15

    const/high16 v13, 0xc00000

    or-int/2addr v3, v13

    goto :goto_12

    :cond_15
    const/high16 v13, 0x1c00000

    and-int/2addr v13, v9

    if-nez v13, :cond_17

    move-object/from16 v13, p7

    invoke-interface {v2, v13}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_16

    const/high16 v14, 0x800000

    goto :goto_11

    :cond_16
    const/high16 v14, 0x400000

    :goto_11
    or-int/2addr v3, v14

    goto :goto_13

    :cond_17
    :goto_12
    move-object/from16 v13, p7

    :goto_13
    const v14, 0x16db6db

    and-int/2addr v14, v3

    const v12, 0x492492

    if-ne v14, v12, :cond_19

    invoke-interface {v2}, LEt0;->b()Z

    move-result v12

    if-nez v12, :cond_18

    goto :goto_14

    :cond_18
    invoke-interface {v2}, LEt0;->k()V

    goto/16 :goto_17

    :cond_19
    :goto_14
    if-eqz v11, :cond_1a

    sget-object v11, LgV2;->b0:LgV2$a;

    move-object/from16 v29, v11

    goto :goto_15

    :cond_1a
    move-object/from16 v29, v13

    :goto_15
    invoke-static {}, LQt0;->O()Z

    move-result v11

    if-eqz v11, :cond_1b

    const/4 v11, -0x1

    const-string v12, "com.stripe.android.paymentsheet.ui.SavedPaymentMethod (PaymentOptionsUI.kt:233)"

    invoke-static {v0, v3, v11, v12}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1b
    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v0

    invoke-interface {v2, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v11

    invoke-static {v11}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodsUiExtensionKt;->getLabelIcon(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/Integer;

    move-result-object v18

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v11

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    const-string v13, "context.resources"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11, v12}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodsUiExtensionKt;->getLabel(Lcom/stripe/android/model/PaymentMethod;Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object v19

    if-nez v19, :cond_1e

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-static {}, LQt0;->Y()V

    :cond_1c
    invoke-interface {v2}, LEt0;->w()LWm5;

    move-result-object v11

    if-nez v11, :cond_1d

    goto :goto_16

    :cond_1d
    new-instance v12, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$SavedPaymentMethod$labelText$1;

    move-object v0, v12

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, v29

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$SavedPaymentMethod$labelText$1;-><init>(Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;FZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;II)V

    invoke-interface {v11, v12}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_16
    return-void

    :cond_1e
    sget v11, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_remove_pm:I

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->getDisplayName()Ljava/lang/String;

    move-result-object v14

    const/16 v16, 0x0

    aput-object v14, v12, v16

    const/16 v14, 0x40

    invoke-static {v11, v12, v2, v14}, LfS5;->d(I[Ljava/lang/Object;LEt0;I)Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v11

    invoke-static {v11}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodsUiExtensionKt;->getSavedPaymentMethodIcon(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/Integer;

    move-result-object v11

    if-eqz v11, :cond_1f

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    move/from16 v16, v11

    :cond_1f
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    invoke-static {v11, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v11}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->getDescription(Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object v21

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->getRemoveDescription(Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object v23

    const/16 v17, 0x0

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$SavedPaymentMethod$1;

    move-object/from16 v22, v0

    invoke-direct {v0, v7, v1}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$SavedPaymentMethod$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$SavedPaymentMethod$2;

    move-object/from16 v24, v0

    invoke-direct {v0, v6, v1}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$SavedPaymentMethod$2;-><init>(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;)V

    shr-int/lit8 v0, v3, 0x3

    and-int/lit8 v11, v0, 0xe

    shr-int/lit8 v12, v3, 0x9

    and-int/lit8 v12, v12, 0x70

    or-int/2addr v11, v12

    and-int/lit16 v0, v0, 0x380

    or-int/2addr v0, v11

    shl-int/lit8 v11, v3, 0x3

    and-int/lit16 v11, v11, 0x1c00

    or-int/2addr v0, v11

    shr-int/lit8 v3, v3, 0x6

    const/high16 v11, 0x70000

    and-int/2addr v3, v11

    or-int v26, v0, v3

    const/16 v27, 0x0

    const/16 v28, 0x40

    move/from16 v11, p1

    move/from16 v12, p4

    move/from16 v13, p3

    move/from16 v14, p2

    move/from16 v15, v16

    move-object/from16 v16, v29

    move-object/from16 v25, v2

    invoke-static/range {v11 .. v28}, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt;->PaymentOptionUi-VPtddqc(FZZZILgV2;Lpm0;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-static {}, LQt0;->Y()V

    :cond_20
    move-object/from16 v13, v29

    :goto_17
    invoke-interface {v2}, LEt0;->w()LWm5;

    move-result-object v11

    if-nez v11, :cond_21

    goto :goto_18

    :cond_21
    new-instance v12, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$SavedPaymentMethod$3;

    move-object v0, v12

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object v8, v13

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$SavedPaymentMethod$3;-><init>(Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;FZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;II)V

    invoke-interface {v11, v12}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_18
    return-void
.end method

.method public static final synthetic access$AddCard-AjpBEmI(FZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->AddCard-AjpBEmI(FZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V

    return-void
.end method

.method public static final synthetic access$GooglePay-PBTpf3Q(FZZLkotlin/jvm/functions/Function1;LgV2;LEt0;II)V
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->GooglePay-PBTpf3Q(FZZLkotlin/jvm/functions/Function1;LgV2;LEt0;II)V

    return-void
.end method

.method public static final synthetic access$Link-PBTpf3Q(FZZLkotlin/jvm/functions/Function1;LgV2;LEt0;II)V
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->Link-PBTpf3Q(FZZLkotlin/jvm/functions/Function1;LgV2;LEt0;II)V

    return-void
.end method

.method public static final synthetic access$PaymentOption-iWtaglI(Lcom/stripe/android/paymentsheet/PaymentOptionsItem;FZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LEt0;II)V
    .locals 0

    invoke-static/range {p0 .. p11}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->PaymentOption-iWtaglI(Lcom/stripe/android/paymentsheet/PaymentOptionsItem;FZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LEt0;II)V

    return-void
.end method

.method public static final synthetic access$SavedPaymentMethod-Uww-Ezs(Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;FZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LEt0;II)V
    .locals 0

    invoke-static/range {p0 .. p10}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->SavedPaymentMethod-Uww-Ezs(Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;FZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LgV2;LEt0;II)V

    return-void
.end method

.method public static final rememberItemWidth-8Feqmps(FLEt0;I)F
    .locals 3

    const v0, 0x4e9b0b1c

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.ui.rememberItemWidth (PaymentOptionsUI.kt:92)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p1, p0}, LEt0;->p(F)Z

    move-result p2

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_1

    sget-object p2, LEt0;->a:LEt0$a;

    invoke-virtual {p2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v0, p2, :cond_2

    :cond_1
    const/16 p2, 0x11

    int-to-float p2, p2

    invoke-static {p2}, Lk61;->g(F)F

    move-result p2

    const/4 v0, 0x2

    int-to-float v0, v0

    mul-float/2addr p2, v0

    invoke-static {p2}, Lk61;->g(F)F

    move-result p2

    sub-float/2addr p0, p2

    invoke-static {p0}, Lk61;->g(F)F

    move-result p0

    const/16 p2, 0x64

    int-to-float p2, p2

    invoke-static {p2}, Lk61;->g(F)F

    move-result p2

    const/4 v1, 0x6

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    mul-float/2addr v1, v0

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    add-float/2addr p2, v1

    invoke-static {p2}, Lk61;->g(F)F

    move-result p2

    mul-float/2addr v0, p0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    div-float/2addr v0, p2

    float-to-int p2, v0

    int-to-float p2, p2

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p2, v0

    div-float/2addr p0, p2

    invoke-static {p0}, Lk61;->g(F)F

    move-result p0

    invoke-static {p0}, Lk61;->d(F)Lk61;

    move-result-object v0

    invoke-interface {p1, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Lk61;

    invoke-virtual {v0}, Lk61;->l()F

    move-result p0

    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p1}, LEt0;->Q()V

    return p0
.end method
