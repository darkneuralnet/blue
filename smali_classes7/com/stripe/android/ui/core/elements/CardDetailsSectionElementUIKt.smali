.class public final Lcom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a7\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "enabled",
        "Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;",
        "controller",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "hiddenIdentifiers",
        "lastTextFieldIdentifier",
        "",
        "CardDetailsSectionElementUI",
        "(ZLcom/stripe/android/ui/core/elements/CardDetailsSectionController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V",
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
        "SMAP\nCardDetailsSectionElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardDetailsSectionElementUI.kt\ncom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,69:1\n79#2,2:70\n81#2:98\n85#2:103\n75#3:72\n76#3,11:74\n89#3:102\n76#4:73\n460#5,13:85\n473#5,3:99\n*S KotlinDebug\n*F\n+ 1 CardDetailsSectionElementUI.kt\ncom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt\n*L\n31#1:70,2\n31#1:98\n31#1:103\n31#1:72\n31#1:74,11\n31#1:102\n31#1:73\n31#1:85,13\n31#1:99,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final CardDetailsSectionElementUI(ZLcom/stripe/android/ui/core/elements/CardDetailsSectionController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v5, p5

    const-string v0, "controller"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hiddenIdentifiers"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x12bb3cd6

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, -0x1

    const-string v6, "com.stripe.android.ui.core.elements.CardDetailsSectionElementUI (CardDetailsSectionElementUI.kt:24)"

    invoke-static {v0, v5, v4, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, Llo;->a:Llo;

    invoke-virtual {v0}, Llo;->d()Llo$e;

    move-result-object v0

    sget-object v4, LK9;->a:LK9$a;

    invoke-virtual {v4}, LK9$a;->h()LK9$c;

    move-result-object v4

    sget-object v6, LgV2;->b0:LgV2$a;

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {v6, v7, v8, v9}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v7

    const v10, 0x2952b718

    invoke-interface {v1, v10}, LEt0;->F(I)V

    const/16 v10, 0x36

    invoke-static {v0, v4, v1, v10}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v0

    const v4, -0x4ee9b9da

    invoke-interface {v1, v4}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {v1, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

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

    sget-object v12, LBt0;->M:LBt0$a;

    invoke-virtual {v12}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    invoke-static {v7}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v7

    invoke-interface {v1}, LEt0;->v()Llm;

    move-result-object v14

    instance-of v14, v14, Llm;

    if-nez v14, :cond_1

    invoke-static {}, Lyt0;->c()V

    :cond_1
    invoke-interface {v1}, LEt0;->h()V

    invoke-interface {v1}, LEt0;->t()Z

    move-result v14

    if-eqz v14, :cond_2

    invoke-interface {v1, v13}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_2
    invoke-interface {v1}, LEt0;->e()V

    :goto_0
    invoke-interface {v1}, LEt0;->L()V

    invoke-static {v1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v13

    invoke-virtual {v12}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v14

    invoke-static {v13, v0, v14}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v12}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v13, v4, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v12}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v13, v10, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v12}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v13, v11, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v1}, LEt0;->q()V

    invoke-static {v1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v7, v0, v1, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v1, v0}, LEt0;->F(I)V

    const v0, -0x286e2e7f

    invoke-interface {v1, v0}, LEt0;->F(I)V

    sget-object v0, Lad5;->a:Lad5;

    const v0, -0x531279ba

    invoke-interface {v1, v0}, LEt0;->F(I)V

    sget v0, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_add_payment_method_card_information:I

    invoke-static {v0, v1, v4}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v0

    sget-object v7, Lcom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt$CardDetailsSectionElementUI$1$1;->INSTANCE:Lcom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt$CardDetailsSectionElementUI$1$1;

    invoke-static {v6, v8, v7}, Lfs5;->a(LgV2;ZLkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v6

    invoke-static {v0, v6, v1, v4, v4}, Lcom/stripe/android/uicore/elements/H6TextKt;->H6Text(Ljava/lang/String;LgV2;LEt0;II)V

    const v0, 0x330ee3a5

    invoke-interface {v1, v0}, LEt0;->F(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->isCardScanEnabled$payments_ui_core_release()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->isStripeCardScanAvailable$payments_ui_core_release()Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;->invoke()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt$CardDetailsSectionElementUI$1$2;

    invoke-direct {v0, v2}, Lcom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt$CardDetailsSectionElementUI$1$2;-><init>(Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;)V

    and-int/lit8 v4, v5, 0xe

    move/from16 v15, p0

    invoke-static {v15, v0, v1, v4}, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt;->ScanCardButtonUI(ZLkotlin/jvm/functions/Function1;LEt0;I)V

    goto :goto_1

    :cond_3
    move/from16 v15, p0

    :goto_1
    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->f()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    new-instance v7, Lcom/stripe/android/uicore/elements/SectionElement;

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v4, "credit_details"

    invoke-virtual {v0, v4}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->getCardDetailsElement$payments_ui_core_release()Lcom/stripe/android/ui/core/elements/CardDetailsElement;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    new-instance v6, Lcom/stripe/android/uicore/elements/SectionController;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->getCardDetailsElement$payments_ui_core_release()Lcom/stripe/android/ui/core/elements/CardDetailsElement;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->sectionFieldErrorController()Lcom/stripe/android/uicore/elements/SectionFieldErrorController;

    move-result-object v8

    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-direct {v6, v9, v8}, Lcom/stripe/android/uicore/elements/SectionController;-><init>(Ljava/lang/Integer;Ljava/util/List;)V

    invoke-direct {v7, v0, v4, v6}, Lcom/stripe/android/uicore/elements/SectionElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;Lcom/stripe/android/uicore/elements/SectionController;)V

    const/4 v10, 0x0

    const/4 v11, 0x0

    and-int/lit8 v0, v5, 0xe

    or-int/lit16 v0, v0, 0x200

    sget v4, Lcom/stripe/android/uicore/elements/SectionElement;->$stable:I

    shl-int/lit8 v4, v4, 0x3

    or-int/2addr v0, v4

    sget v4, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v4, v4, 0x9

    or-int/2addr v0, v4

    and-int/lit16 v4, v5, 0x1c00

    or-int v13, v0, v4

    const/16 v14, 0x30

    move/from16 v6, p0

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object v12, v1

    invoke-static/range {v6 .. v14}, Lcom/stripe/android/uicore/elements/SectionElementUIKt;->SectionElementUI-rgidl0k(ZLcom/stripe/android/uicore/elements/SectionElement;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v6

    if-nez v6, :cond_5

    goto :goto_2

    :cond_5
    new-instance v7, Lcom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt$CardDetailsSectionElementUI$2;

    move-object v0, v7

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt$CardDetailsSectionElementUI$2;-><init>(ZLcom/stripe/android/ui/core/elements/CardDetailsSectionController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    invoke-interface {v6, v7}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method
