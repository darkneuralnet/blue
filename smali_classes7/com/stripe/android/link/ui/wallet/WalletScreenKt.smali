.class public final Lcom/stripe/android/link/ui/wallet/WalletScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001aL\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052+\u0010\u000b\u001a\'\u0012\u001d\u0012\u001b\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007j\u0004\u0018\u0001`\t\u00a2\u0006\u0002\u0008\n\u0012\u0004\u0012\u00020\u00000\u0007H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u00ea\u0001\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00000\u00072\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00000\u00072\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001a2\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001a2+\u0010\u000b\u001a\'\u0012\u001d\u0012\u001b\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007j\u0004\u0018\u0001`\t\u00a2\u0006\u0002\u0008\n\u0012\u0004\u0012\u00020\u00000\u0007H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010!\u001a1\u0010%\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00162\u0008\u0008\u0002\u0010$\u001a\u00020#H\u0001\u00a2\u0006\u0004\u0008%\u0010&\u001a-\u0010*\u001a\u00020\u00002\u0006\u0010\'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00162\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001aH\u0001\u00a2\u0006\u0004\u0008*\u0010+\u001a[\u0010.\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00000\u00072\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001a2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001aH\u0003\u00a2\u0006\u0004\u0008.\u0010/\u001a\u000c\u00100\u001a\u00020\u0010*\u00020\u0010H\u0002\u00a8\u00061"
    }
    d2 = {
        "",
        "WalletBodyPreview",
        "(LEt0;I)V",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "linkAccount",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "injector",
        "Lkotlin/Function1;",
        "LPm0;",
        "Lcom/stripe/android/link/ui/BottomSheetContent;",
        "Lkotlin/ExtensionFunctionType;",
        "showBottomSheetContent",
        "WalletBody",
        "(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;Lkotlin/jvm/functions/Function1;LEt0;I)V",
        "Lcom/stripe/android/link/ui/wallet/WalletUiState;",
        "uiState",
        "",
        "primaryButtonLabel",
        "Lcom/stripe/android/uicore/elements/TextFieldController;",
        "expiryDateController",
        "Lcom/stripe/android/ui/core/elements/CvcController;",
        "cvcController",
        "",
        "setExpanded",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "onItemSelected",
        "Lkotlin/Function0;",
        "onAddNewPaymentMethodClick",
        "onEditPaymentMethod",
        "onSetDefault",
        "onDeletePaymentMethod",
        "onPrimaryButtonClick",
        "onPayAnotherWayClick",
        "(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;II)V",
        "isCardExpired",
        "LgV2;",
        "modifier",
        "CardDetailsRecollectionForm",
        "(Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;ZLgV2;LEt0;II)V",
        "selectedPaymentMethod",
        "enabled",
        "onClick",
        "CollapsedPaymentDetails",
        "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLkotlin/jvm/functions/Function0;LEt0;I)V",
        "onMenuButtonClick",
        "onCollapse",
        "ExpandedPaymentDetails",
        "(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V",
        "replaceHyperlinks",
        "link_release"
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
        "SMAP\nWalletScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,545:1\n81#2,11:546\n68#3,5:557\n73#3:588\n77#3:593\n75#4:562\n76#4,11:564\n89#4:592\n75#4:629\n76#4,11:631\n89#4:661\n75#4:670\n76#4,11:672\n75#4:704\n76#4,11:706\n89#4:736\n75#4:747\n76#4,11:749\n89#4:779\n89#4:784\n76#5:563\n76#5:594\n76#5:614\n76#5:630\n76#5:671\n76#5:705\n76#5:748\n460#6,13:575\n473#6,3:589\n36#6:607\n460#6,13:642\n473#6,3:658\n460#6,13:683\n460#6,13:717\n473#6,3:733\n460#6,13:760\n473#6,3:776\n473#6,3:781\n1057#7,6:595\n1057#7,6:601\n1057#7,6:608\n1057#7,6:615\n154#8:621\n154#8:622\n154#8:656\n154#8:657\n154#8:663\n154#8:697\n154#8:731\n154#8:732\n154#8:740\n154#8:774\n154#8:775\n75#9,6:623\n81#9:655\n85#9:662\n75#9,6:698\n81#9:730\n85#9:737\n75#9,6:741\n81#9:773\n85#9:780\n74#10,6:664\n80#10:696\n84#10:785\n1855#11,2:738\n76#12:786\n76#12:787\n102#12,2:788\n76#12:790\n102#12,2:791\n*S KotlinDebug\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt\n*L\n144#1:546,11\n169#1:557,5\n169#1:588\n169#1:593\n169#1:562\n169#1:564,11\n169#1:592\n407#1:629\n407#1:631,11\n407#1:661\n459#1:670\n459#1:672,11\n473#1:704\n473#1:706,11\n473#1:736\n518#1:747\n518#1:749,11\n518#1:779\n459#1:784\n169#1:563\n182#1:594\n239#1:614\n407#1:630\n459#1:671\n473#1:705\n518#1:748\n169#1:575,13\n169#1:589,3\n222#1:607\n407#1:642,13\n407#1:658,3\n459#1:683,13\n473#1:717,13\n473#1:733,3\n518#1:760,13\n518#1:776,3\n459#1:781,3\n215#1:595,6\n218#1:601,6\n222#1:608,6\n354#1:615,6\n410#1:621\n412#1:622\n431#1:656\n440#1:657\n463#1:663\n475#1:697\n482#1:731\n491#1:732\n521#1:740\n528#1:774\n533#1:775\n407#1:623,6\n407#1:655\n407#1:662\n473#1:698,6\n473#1:730\n473#1:737\n518#1:741,6\n518#1:773\n518#1:780\n459#1:664,6\n459#1:696\n459#1:785\n502#1:738,2\n151#1:786\n215#1:787\n215#1:788,2\n218#1:790\n218#1:791,2\n*E\n"
    }
.end annotation


# direct methods
.method public static final CardDetailsRecollectionForm(Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;ZLgV2;LEt0;II)V
    .locals 8

    const-string v0, "expiryDateController"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cvcController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0xd8791ce

    invoke-interface {p4, v0}, LEt0;->u(I)LEt0;

    move-result-object p4

    and-int/lit8 v1, p6, 0x8

    if-eqz v1, :cond_0

    sget-object p3, LgV2;->b0:LgV2$a;

    :cond_0
    move-object v5, p3

    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p3, -0x1

    const-string v1, "com.stripe.android.link.ui.wallet.CardDetailsRecollectionForm (WalletScreen.kt:347)"

    invoke-static {v0, p5, p3, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    invoke-interface {p4, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p4, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p3, v0

    invoke-interface {p4}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_2

    sget-object p3, LEt0;->a:LEt0$a;

    invoke-virtual {p3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_4

    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->createListBuilder()Ljava/util/List;

    move-result-object p3

    if-eqz p2, :cond_3

    move-object v0, p3

    check-cast v0, Ljava/util/Collection;

    new-instance v1, Lcom/stripe/android/uicore/elements/SimpleTextElement;

    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v3, "date"

    invoke-virtual {v2, v3}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-direct {v1, v2, p0}, Lcom/stripe/android/uicore/elements/SimpleTextElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/TextFieldController;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_3
    move-object v0, p3

    check-cast v0, Ljava/util/Collection;

    new-instance v1, Lcom/stripe/android/ui/core/elements/CvcElement;

    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardCvc()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-direct {v1, v3, p1}, Lcom/stripe/android/ui/core/elements/CvcElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/CvcController;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->build(Ljava/util/List;)Ljava/util/List;

    move-result-object p3

    new-instance v0, Lcom/stripe/android/uicore/elements/RowElement;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "row_"

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/uicore/elements/RowController;

    invoke-direct {v2, p3}, Lcom/stripe/android/uicore/elements/RowController;-><init>(Ljava/util/List;)V

    invoke-direct {v0, v1, p3, v2}, Lcom/stripe/android/uicore/elements/RowElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;Lcom/stripe/android/uicore/elements/RowController;)V

    invoke-interface {p4, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    check-cast v0, Lcom/stripe/android/uicore/elements/RowElement;

    if-eqz p2, :cond_5

    sget p3, Lcom/stripe/android/link/R$string;->wallet_update_expired_card_error:I

    goto :goto_0

    :cond_5
    sget p3, Lcom/stripe/android/link/R$string;->wallet_recollect_cvc_error:I

    :goto_0
    new-instance v1, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$CardDetailsRecollectionForm$1;

    invoke-direct {v1, v5, p5, p3, v0}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$CardDetailsRecollectionForm$1;-><init>(LgV2;IILcom/stripe/android/uicore/elements/RowElement;)V

    const p3, -0x3f8ba86

    const/4 v0, 0x1

    invoke-static {p4, p3, v0, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object p3

    const/4 v0, 0x6

    invoke-static {p3, p4, v0}, Lcom/stripe/android/link/theme/ColorKt;->StripeThemeForLink(Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    invoke-interface {p4}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_7

    goto :goto_1

    :cond_7
    new-instance p4, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$CardDetailsRecollectionForm$2;

    move-object v1, p4

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$CardDetailsRecollectionForm$2;-><init>(Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;ZLgV2;II)V

    invoke-interface {p3, p4}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method public static final CollapsedPaymentDetails(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v8, p1

    move-object/from16 v9, p2

    move/from16 v10, p4

    const-string v1, "selectedPaymentMethod"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onClick"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, -0x1a32cd38

    move-object/from16 v2, p3

    invoke-interface {v2, v1}, LEt0;->u(I)LEt0;

    move-result-object v15

    and-int/lit8 v2, v10, 0xe

    if-nez v2, :cond_1

    invoke-interface {v15, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v10

    goto :goto_1

    :cond_1
    move v2, v10

    :goto_1
    and-int/lit8 v3, v10, 0x70

    if-nez v3, :cond_3

    invoke-interface {v15, v8}, LEt0;->o(Z)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v10, 0x380

    if-nez v3, :cond_5

    invoke-interface {v15, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v2, v3

    :cond_5
    move v13, v2

    and-int/lit16 v2, v13, 0x2db

    const/16 v3, 0x92

    if-ne v2, v3, :cond_7

    invoke-interface {v15}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LEt0;->k()V

    move-object v7, v15

    goto/16 :goto_6

    :cond_7
    :goto_4
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.ui.wallet.CollapsedPaymentDetails (WalletScreen.kt:401)"

    invoke-static {v1, v13, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_8
    sget-object v14, LgV2;->b0:LgV2$a;

    const/4 v1, 0x0

    const/4 v12, 0x1

    const/4 v11, 0x0

    invoke-static {v14, v1, v12, v11}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    const/16 v2, 0x40

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v1, v2}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v1

    int-to-float v2, v12

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    sget-object v7, LTM2;->a:LTM2;

    sget v6, LTM2;->b:I

    invoke-static {v7, v15, v6}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/theme/LinkColors;->getComponentBorder-0d7_KjU()J

    move-result-wide v3

    invoke-static {v7, v15, v6}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkShapes(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/link/theme/LinkShapes;->getLarge()Lbc5;

    move-result-object v5

    invoke-static {v1, v2, v3, v4, v5}, LdZ;->g(LgV2;FJLhy5;)LgV2;

    move-result-object v1

    invoke-static {v7, v15, v6}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkShapes(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/link/theme/LinkShapes;->getLarge()Lbc5;

    move-result-object v2

    invoke-static {v1, v2}, LQk0;->a(LgV2;Lhy5;)LgV2;

    move-result-object v1

    invoke-static {v7, v15, v6}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/link/theme/LinkColors;->getComponentBackground-0d7_KjU()J

    move-result-wide v2

    invoke-static {v7, v15, v6}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkShapes(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/link/theme/LinkShapes;->getLarge()Lbc5;

    move-result-object v4

    invoke-static {v1, v2, v3, v4}, Lbw;->c(LgV2;JLhy5;)LgV2;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v16, 0x6

    const/16 v17, 0x0

    move/from16 v2, p1

    move-object/from16 v5, p2

    move/from16 v35, v6

    move/from16 v6, v16

    move-object v8, v7

    move-object/from16 v7, v17

    invoke-static/range {v1 .. v7}, Lak0;->e(LgV2;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LgV2;

    move-result-object v1

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->h()LK9$c;

    move-result-object v2

    const v3, 0x2952b718

    invoke-interface {v15, v3}, LEt0;->F(I)V

    sget-object v3, Llo;->a:Llo;

    invoke-virtual {v3}, Llo;->f()Llo$d;

    move-result-object v3

    const/16 v4, 0x30

    invoke-static {v3, v2, v15, v4}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v2

    const v3, -0x4ee9b9da

    invoke-interface {v15, v3}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v3

    invoke-interface {v15, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {v15, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {v15, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v6, LBt0;->M:LBt0$a;

    invoke-virtual {v6}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface {v15}, LEt0;->v()Llm;

    move-result-object v11

    instance-of v11, v11, Llm;

    if-nez v11, :cond_9

    invoke-static {}, Lyt0;->c()V

    :cond_9
    invoke-interface {v15}, LEt0;->h()V

    invoke-interface {v15}, LEt0;->t()Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-interface {v15, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_5

    :cond_a
    invoke-interface {v15}, LEt0;->e()V

    :goto_5
    invoke-interface {v15}, LEt0;->L()V

    invoke-static {v15}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v7

    invoke-virtual {v6}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v11

    invoke-static {v7, v2, v11}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v7, v3, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v7, v4, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v7, v5, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v15}, LEt0;->q()V

    invoke-static {v15}, LMB5;->b(LEt0;)LEt0;

    move-result-object v2

    invoke-static {v2}, LMB5;->a(LEt0;)LMB5;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v2, v15, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {v15, v1}, LEt0;->F(I)V

    const v1, -0x286e2e7f

    invoke-interface {v15, v1}, LEt0;->F(I)V

    sget-object v1, Lad5;->a:Lad5;

    const v2, 0x3aa82fe4

    invoke-interface {v15, v2}, LEt0;->F(I)V

    sget v2, Lcom/stripe/android/link/R$string;->wallet_collapsed_payment:I

    invoke-static {v2, v15, v3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v11

    const/4 v2, 0x0

    invoke-static {}, Lcom/stripe/android/link/theme/ThemeKt;->getHorizontalPadding()F

    move-result v17

    const/16 v18, 0x0

    const/16 v4, 0x8

    int-to-float v4, v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v19

    const/16 v20, 0x0

    const/16 v21, 0xa

    const/16 v22, 0x0

    move-object/from16 v16, v14

    invoke-static/range {v16 .. v22}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v4

    move v5, v12

    move-object v12, v4

    move/from16 v4, v35

    invoke-static {v8, v15, v4}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/link/theme/LinkColors;->getDisabledText-0d7_KjU()J

    move-result-wide v6

    move/from16 v35, v13

    move-object/from16 v36, v14

    move-wide v13, v6

    const-wide/16 v6, 0x0

    move-object/from16 p3, v15

    move-wide v15, v6

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x30

    const/16 v33, 0x0

    const v34, 0xfff8

    move-object/from16 v31, p3

    invoke-static/range {v11 .. v34}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    sget v6, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->$stable:I

    shl-int/lit8 v6, v6, 0x3

    const/16 v7, 0x186

    or-int/2addr v6, v7

    shl-int/lit8 v7, v35, 0x3

    and-int/lit8 v7, v7, 0x70

    or-int/2addr v6, v7

    move-object/from16 v7, p3

    invoke-static {v1, v0, v5, v7, v6}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt;->PaymentDetails(LZc5;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLEt0;I)V

    sget v1, Lcom/stripe/android/link/R$drawable;->ic_link_chevron:I

    invoke-static {v1, v7, v3}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v11

    sget v1, Lcom/stripe/android/link/R$string;->wallet_expand_accessibility:I

    invoke-static {v1, v7, v3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v12

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v1, 0x16

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v19

    const/16 v20, 0x0

    const/16 v21, 0xb

    move-object/from16 v16, v36

    invoke-static/range {v16 .. v22}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v1

    sget-object v6, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$CollapsedPaymentDetails$1$1;->INSTANCE:Lcom/stripe/android/link/ui/wallet/WalletScreenKt$CollapsedPaymentDetails$1$1;

    invoke-static {v1, v3, v6, v5, v2}, Lfs5;->b(LgV2;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;

    move-result-object v13

    invoke-static {v8, v7, v4}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/link/theme/LinkColors;->getDisabledText-0d7_KjU()J

    move-result-wide v14

    const/16 v17, 0x8

    const/16 v18, 0x0

    move-object/from16 v16, v7

    invoke-static/range {v11 .. v18}, LDP1;->b(LnE3;Ljava/lang/String;LgV2;JLEt0;II)V

    invoke-interface {v7}, LEt0;->Q()V

    invoke-interface {v7}, LEt0;->Q()V

    invoke-interface {v7}, LEt0;->Q()V

    invoke-interface {v7}, LEt0;->f()V

    invoke-interface {v7}, LEt0;->Q()V

    invoke-interface {v7}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {}, LQt0;->Y()V

    :cond_b
    :goto_6
    invoke-interface {v7}, LEt0;->w()LWm5;

    move-result-object v1

    if-nez v1, :cond_c

    goto :goto_7

    :cond_c
    new-instance v2, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$CollapsedPaymentDetails$2;

    move/from16 v3, p1

    invoke-direct {v2, v0, v3, v9, v10}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$CollapsedPaymentDetails$2;-><init>(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLkotlin/jvm/functions/Function0;I)V

    invoke-interface {v1, v2}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_7
    return-void
.end method

.method private static final ExpandedPaymentDetails(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/wallet/WalletUiState;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;",
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

    const v0, 0x513119f2

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v14

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.wallet.ExpandedPaymentDetails (WalletScreen.kt:449)"

    move/from16 v15, p6

    invoke-static {v0, v15, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v15, p6

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getPrimaryButtonState()Lcom/stripe/android/link/ui/PrimaryButtonState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/PrimaryButtonState;->isBlocking()Z

    move-result v0

    const/4 v13, 0x1

    xor-int/2addr v0, v13

    sget-object v12, LgV2;->b0:LgV2$a;

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static {v12, v10, v13, v11}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    int-to-float v2, v13

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    sget-object v9, LTM2;->a:LTM2;

    sget v8, LTM2;->b:I

    invoke-static {v9, v14, v8}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/theme/LinkColors;->getComponentBorder-0d7_KjU()J

    move-result-wide v3

    invoke-static {v9, v14, v8}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkShapes(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/link/theme/LinkShapes;->getLarge()Lbc5;

    move-result-object v5

    invoke-static {v1, v2, v3, v4, v5}, LdZ;->g(LgV2;FJLhy5;)LgV2;

    move-result-object v1

    invoke-static {v9, v14, v8}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkShapes(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/link/theme/LinkShapes;->getLarge()Lbc5;

    move-result-object v2

    invoke-static {v1, v2}, LQk0;->a(LgV2;Lhy5;)LgV2;

    move-result-object v1

    invoke-static {v9, v14, v8}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/link/theme/LinkColors;->getComponentBackground-0d7_KjU()J

    move-result-wide v2

    invoke-static {v9, v14, v8}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkShapes(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/link/theme/LinkShapes;->getLarge()Lbc5;

    move-result-object v4

    invoke-static {v1, v2, v3, v4}, Lbw;->c(LgV2;JLhy5;)LgV2;

    move-result-object v1

    const v2, -0x1cd0f17e

    invoke-interface {v14, v2}, LEt0;->F(I)V

    sget-object v16, Llo;->a:Llo;

    invoke-virtual/range {v16 .. v16}, Llo;->g()Llo$l;

    move-result-object v2

    sget-object v17, LK9;->a:LK9$a;

    invoke-virtual/range {v17 .. v17}, LK9$a;->j()LK9$b;

    move-result-object v3

    const/4 v7, 0x0

    invoke-static {v2, v3, v14, v7}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v2

    const v6, -0x4ee9b9da

    invoke-interface {v14, v6}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v3

    invoke-interface {v14, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg01;

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

    sget-object v18, LBt0;->M:LBt0$a;

    invoke-virtual/range {v18 .. v18}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface {v14}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_1

    invoke-static {}, Lyt0;->c()V

    :cond_1
    invoke-interface {v14}, LEt0;->h()V

    invoke-interface {v14}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v14, v6}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_2
    invoke-interface {v14}, LEt0;->e()V

    :goto_1
    invoke-interface {v14}, LEt0;->L()V

    invoke-static {v14}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v6

    invoke-virtual/range {v18 .. v18}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v6, v2, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v18 .. v18}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, v3, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v18 .. v18}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, v4, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v18 .. v18}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, v5, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v14}, LEt0;->q()V

    invoke-static {v14}, LMB5;->b(LEt0;)LEt0;

    move-result-object v2

    invoke-static {v2}, LMB5;->a(LEt0;)LMB5;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v2, v14, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v10, 0x7ab4aae9

    invoke-interface {v14, v10}, LEt0;->F(I)V

    const v1, -0x455f09d5

    invoke-interface {v14, v1}, LEt0;->F(I)V

    sget-object v1, LQm0;->a:LQm0;

    const v1, -0x5af85c44

    invoke-interface {v14, v1}, LEt0;->F(I)V

    const/16 v1, 0x2c

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    invoke-static {v12, v1}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/16 v20, 0x0

    move v2, v0

    move-object/from16 v5, p4

    const v15, -0x4ee9b9da

    move/from16 p5, v7

    move-object/from16 v7, v20

    invoke-static/range {v1 .. v7}, Lak0;->e(LgV2;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LgV2;

    move-result-object v1

    invoke-virtual/range {v17 .. v17}, LK9$a;->h()LK9$c;

    move-result-object v2

    const v7, 0x2952b718

    invoke-interface {v14, v7}, LEt0;->F(I)V

    invoke-virtual/range {v16 .. v16}, Llo;->f()Llo$d;

    move-result-object v3

    const/16 v6, 0x30

    invoke-static {v3, v2, v14, v6}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v2

    invoke-interface {v14, v15}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v3

    invoke-interface {v14, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg01;

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

    invoke-virtual/range {v18 .. v18}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface {v14}, LEt0;->v()Llm;

    move-result-object v7

    instance-of v7, v7, Llm;

    if-nez v7, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface {v14}, LEt0;->h()V

    invoke-interface {v14}, LEt0;->t()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v14, v6}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_2

    :cond_4
    invoke-interface {v14}, LEt0;->e()V

    :goto_2
    invoke-interface {v14}, LEt0;->L()V

    invoke-static {v14}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v6

    invoke-virtual/range {v18 .. v18}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v2, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v18 .. v18}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, v3, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v18 .. v18}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, v4, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v18 .. v18}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, v5, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v14}, LEt0;->q()V

    invoke-static {v14}, LMB5;->b(LEt0;)LEt0;

    move-result-object v2

    invoke-static {v2}, LMB5;->a(LEt0;)LMB5;

    move-result-object v2

    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v2, v14, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v14, v10}, LEt0;->F(I)V

    const v7, -0x286e2e7f

    invoke-interface {v14, v7}, LEt0;->F(I)V

    sget-object v25, Lad5;->a:Lad5;

    const v1, 0x387ae4d8

    invoke-interface {v14, v1}, LEt0;->F(I)V

    sget v1, Lcom/stripe/android/link/R$string;->wallet_expanded_title:I

    move/from16 v6, p5

    invoke-static {v1, v14, v6}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/stripe/android/link/theme/ThemeKt;->getHorizontalPadding()F

    move-result v3

    const/16 v2, 0x14

    int-to-float v5, v2

    invoke-static {v5}, Lk61;->g(F)F

    move-result v4

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0xc

    const/16 v22, 0x0

    move-object v2, v12

    move/from16 v26, v5

    move/from16 v5, v18

    move/from16 v6, v20

    move/from16 v7, v21

    move v15, v8

    move-object/from16 v8, v22

    invoke-static/range {v2 .. v8}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v2

    invoke-virtual {v9, v14, v15}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v3

    invoke-virtual {v3}, LMm0;->g()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v16, 0x0

    move-object v5, v9

    move-object/from16 v9, v16

    const-wide/16 v16, 0x0

    move-object v6, v11

    move-wide/from16 v10, v16

    const/16 v16, 0x0

    move-object/from16 v27, v12

    move-object/from16 v12, v16

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-object v6, v14

    move v7, v15

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-virtual {v5, v6, v7}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, LGc6;->e()LG26;

    move-result-object v20

    const/16 v22, 0x30

    const/16 v23, 0x0

    const/16 v24, 0x7ff8

    move-object/from16 v21, v6

    move/from16 v28, v0

    move-object/from16 v29, v5

    move-object v0, v6

    move/from16 v30, v7

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v24}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object/from16 v1, v25

    move-object/from16 v2, v27

    invoke-static/range {v1 .. v6}, LZc5;->b(LZc5;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v1

    const/4 v10, 0x0

    invoke-static {v1, v0, v10}, LDN5;->a(LgV2;LEt0;I)V

    sget v1, Lcom/stripe/android/link/R$drawable;->ic_link_chevron:I

    invoke-static {v1, v0, v10}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v8

    sget v1, Lcom/stripe/android/link/R$string;->wallet_expand_accessibility:I

    invoke-static {v1, v0, v10}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v9

    const/4 v2, 0x0

    invoke-static/range {v26 .. v26}, Lk61;->g(F)F

    move-result v3

    const/16 v1, 0x16

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v4

    const/4 v5, 0x0

    const/16 v6, 0x9

    const/4 v7, 0x0

    move-object/from16 v1, v27

    invoke-static/range {v1 .. v7}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v1

    const/high16 v2, 0x43340000    # 180.0f

    invoke-static {v1, v2}, LSb5;->a(LgV2;F)LgV2;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$ExpandedPaymentDetails$1$1$1;->INSTANCE:Lcom/stripe/android/link/ui/wallet/WalletScreenKt$ExpandedPaymentDetails$1$1$1;

    const/4 v11, 0x0

    const/4 v12, 0x1

    invoke-static {v1, v10, v2, v12, v11}, Lfs5;->b(LgV2;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;

    move-result-object v3

    move-object/from16 v1, v29

    move/from16 v2, v30

    invoke-virtual {v1, v0, v2}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v1

    invoke-virtual {v1}, LMm0;->g()J

    move-result-wide v4

    const/16 v7, 0x8

    const/4 v13, 0x0

    move-object v1, v8

    move-object v2, v9

    move-object v6, v0

    move v8, v13

    invoke-static/range {v1 .. v8}, LDP1;->b(LnE3;Ljava/lang/String;LgV2;JLEt0;II)V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->f()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    const v1, -0xb8745d7

    invoke-interface {v0, v1}, LEt0;->F(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getPaymentDetailsList()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getSupportedTypes()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getSelectedItem()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_5
    move-object v2, v11

    :goto_4
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getPaymentMethodIdBeingUpdated()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    new-instance v6, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$ExpandedPaymentDetails$1$2$1;

    move-object/from16 v14, p1

    invoke-direct {v6, v14, v1}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$ExpandedPaymentDetails$1$2$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V

    new-instance v7, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$ExpandedPaymentDetails$1$2$2;

    move-object/from16 v15, p2

    invoke-direct {v7, v15, v1}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$ExpandedPaymentDetails$1$2$2;-><init>(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V

    sget v9, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->$stable:I

    move/from16 v2, v28

    move-object v8, v0

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt;->PaymentDetailsListItem(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V

    goto :goto_3

    :cond_6
    move-object/from16 v14, p1

    move-object/from16 v15, p2

    invoke-interface {v0}, LEt0;->Q()V

    sget-object v9, LgV2;->b0:LgV2$a;

    const/4 v1, 0x0

    invoke-static {v9, v1, v12, v11}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    const/16 v2, 0x3c

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v1, v2}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move/from16 v2, v28

    move-object/from16 v5, p3

    invoke-static/range {v1 .. v7}, Lak0;->e(LgV2;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LgV2;

    move-result-object v1

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->h()LK9$c;

    move-result-object v2

    const v3, 0x2952b718

    invoke-interface {v0, v3}, LEt0;->F(I)V

    sget-object v3, Llo;->a:Llo;

    invoke-virtual {v3}, Llo;->f()Llo$d;

    move-result-object v3

    const/16 v4, 0x30

    invoke-static {v3, v2, v0, v4}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v2

    const v3, -0x4ee9b9da

    invoke-interface {v0, v3}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v3

    invoke-interface {v0, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {v0, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {v0, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v6, LBt0;->M:LBt0$a;

    invoke-virtual {v6}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface {v0}, LEt0;->v()Llm;

    move-result-object v8

    instance-of v8, v8, Llm;

    if-nez v8, :cond_7

    invoke-static {}, Lyt0;->c()V

    :cond_7
    invoke-interface {v0}, LEt0;->h()V

    invoke-interface {v0}, LEt0;->t()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v0, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_5

    :cond_8
    invoke-interface {v0}, LEt0;->e()V

    :goto_5
    invoke-interface {v0}, LEt0;->L()V

    invoke-static {v0}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v7

    invoke-virtual {v6}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v7, v2, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v7, v3, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v7, v4, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v7, v5, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v0}, LEt0;->q()V

    invoke-static {v0}, LMB5;->b(LEt0;)LEt0;

    move-result-object v2

    invoke-static {v2}, LMB5;->a(LEt0;)LMB5;

    move-result-object v2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v2, v0, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {v0, v1}, LEt0;->F(I)V

    const v1, -0x286e2e7f

    invoke-interface {v0, v1}, LEt0;->F(I)V

    sget-object v1, Lad5;->a:Lad5;

    const v1, -0x6d5bf73f

    invoke-interface {v0, v1}, LEt0;->F(I)V

    sget v1, Lcom/stripe/android/link/R$drawable;->ic_link_add_green:I

    invoke-static {v1, v0, v10}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {}, Lcom/stripe/android/link/theme/ThemeKt;->getHorizontalPadding()F

    move-result v17

    const/16 v18, 0x0

    const/16 v3, 0xc

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v19

    const/16 v20, 0x0

    const/16 v21, 0xa

    const/16 v22, 0x0

    move-object/from16 v16, v9

    invoke-static/range {v16 .. v22}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v3

    sget-object v4, Lpm0;->b:Lpm0$a;

    invoke-virtual {v4}, Lpm0$a;->g()J

    move-result-wide v4

    const/16 v7, 0xdb8

    const/4 v8, 0x0

    move-object v6, v0

    invoke-static/range {v1 .. v8}, LDP1;->b(LnE3;Ljava/lang/String;LgV2;JLEt0;II)V

    sget v1, Lcom/stripe/android/link/R$string;->add_payment_method:I

    invoke-static {v1, v0, v10}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v1

    const/16 v17, 0x0

    invoke-static {}, Lcom/stripe/android/link/theme/ThemeKt;->getHorizontalPadding()F

    move-result v19

    const/4 v2, 0x4

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v20

    const/16 v21, 0x3

    invoke-static/range {v16 .. v22}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v2

    sget-object v13, LTM2;->a:LTM2;

    sget v12, LTM2;->b:I

    invoke-static {v13, v0, v12}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/theme/LinkColors;->getActionLabel-0d7_KjU()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/16 v16, 0x0

    move v5, v12

    move-object/from16 v12, v16

    const/4 v6, 0x0

    move-object v7, v13

    move-object v13, v6

    const-wide/16 v16, 0x0

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-virtual {v7, v0, v5}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v5

    invoke-virtual {v5}, LGc6;->e()LG26;

    move-result-object v20

    const/16 v22, 0x30

    const/16 v23, 0x0

    const/16 v24, 0x7ff8

    move-object/from16 v21, v0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v24}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->f()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->f()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, LQt0;->Y()V

    :cond_9
    invoke-interface {v0}, LEt0;->w()LWm5;

    move-result-object v0

    if-nez v0, :cond_a

    goto :goto_6

    :cond_a
    new-instance v1, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$ExpandedPaymentDetails$2;

    move-object v3, v1

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move/from16 v9, p6

    invoke-direct/range {v3 .. v9}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$ExpandedPaymentDetails$2;-><init>(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v0, v1}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_6
    return-void
.end method

.method public static final WalletBody(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/model/LinkAccount;",
            "Lcom/stripe/android/core/injection/NonFallbackInjector;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v15, p2

    move/from16 v14, p4

    const-string v2, "linkAccount"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "injector"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "showBottomSheetContent"

    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x1bc158a7

    move-object/from16 v3, p3

    invoke-interface {v3, v2}, LEt0;->u(I)LEt0;

    move-result-object v13

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.link.ui.wallet.WalletBody (WalletScreen.kt:138)"

    invoke-static {v2, v14, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    new-instance v6, Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;

    invoke-direct {v6, v0, v1}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;)V

    const v2, 0x671a9c9b

    invoke-interface {v13, v2}, LEt0;->F(I)V

    sget-object v2, Lpv2;->a:Lpv2;

    const/4 v11, 0x6

    invoke-virtual {v2, v13, v11}, Lpv2;->a(LEt0;I)LXr6;

    move-result-object v4

    if-eqz v4, :cond_8

    const/4 v5, 0x0

    instance-of v2, v4, Landroidx/lifecycle/e;

    if-eqz v2, :cond_1

    move-object v2, v4

    check-cast v2, Landroidx/lifecycle/e;

    invoke-interface {v2}, Landroidx/lifecycle/e;->getDefaultViewModelCreationExtras()LFE0;

    move-result-object v2

    const-string v3, "{\n        viewModelStore\u2026ModelCreationExtras\n    }"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    sget-object v2, LFE0$a;->b:LFE0$a;

    :goto_0
    move-object v7, v2

    const-class v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel;

    const v9, 0x9048

    const/4 v10, 0x0

    move-object v8, v13

    invoke-static/range {v3 .. v10}, LSr6;->b(Ljava/lang/Class;LXr6;Ljava/lang/String;Landroidx/lifecycle/u$b;LFE0;LEt0;II)LOr6;

    move-result-object v2

    invoke-interface {v13}, LEt0;->Q()V

    check-cast v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel;

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->getUiState()LtP5;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x1

    invoke-static {v3, v4, v13, v5, v6}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v3

    invoke-static {v3}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->WalletBody$lambda$0(LsP5;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getAlertMessage()Lcom/stripe/android/link/ui/ErrorMessage;

    move-result-object v7

    const v8, -0x6c1ae221

    invoke-interface {v13, v8}, LEt0;->F(I)V

    if-nez v7, :cond_2

    goto :goto_1

    :cond_2
    new-instance v8, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$1$1;

    invoke-direct {v8, v2}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$1$1;-><init>(Ljava/lang/Object;)V

    new-instance v9, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$1$2;

    invoke-direct {v9, v2}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$1$2;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;)V

    const v10, -0x5c097d7f

    invoke-static {v13, v10, v6, v9}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    new-instance v9, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$1$3;

    invoke-direct {v9, v7}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$1$3;-><init>(Lcom/stripe/android/link/ui/ErrorMessage;)V

    const v7, -0x422bbb03

    invoke-static {v13, v7, v6, v9}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v21

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const v29, 0x30030

    const/16 v30, 0x3dc

    move-object/from16 v16, v8

    move-object/from16 v28, v13

    invoke-static/range {v16 .. v30}, Llb;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;LgV2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lhy5;JJLD31;LEt0;II)V

    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_1
    invoke-interface {v13}, LEt0;->Q()V

    invoke-static {v3}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->WalletBody$lambda$0(LsP5;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getPaymentDetailsList()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_5

    const v2, -0x6c1adfea

    invoke-interface {v13, v2}, LEt0;->F(I)V

    sget-object v2, LgV2;->b0:LgV2$a;

    const/4 v3, 0x0

    invoke-static {v2, v3, v6, v4}, LBB5;->j(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v2

    invoke-static {v2, v3, v6, v4}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v2

    sget-object v3, LK9;->a:LK9$a;

    invoke-virtual {v3}, LK9$a;->e()LK9;

    move-result-object v3

    const v4, 0x2bb5b5d7

    invoke-interface {v13, v4}, LEt0;->F(I)V

    const/4 v4, 0x0

    invoke-static {v3, v4, v13, v11}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v3

    const v5, -0x4ee9b9da

    invoke-interface {v13, v5}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v5

    invoke-interface {v13, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v6

    invoke-interface {v13, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v7

    invoke-interface {v13, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LJq6;

    sget-object v8, LBt0;->M:LBt0$a;

    invoke-virtual {v8}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface {v13}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface {v13}, LEt0;->h()V

    invoke-interface {v13}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v13, v9}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_2

    :cond_4
    invoke-interface {v13}, LEt0;->e()V

    :goto_2
    invoke-interface {v13}, LEt0;->L()V

    invoke-static {v13}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v9

    invoke-virtual {v8}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v9, v3, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v5, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v6, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v7, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v13}, LEt0;->q()V

    invoke-static {v13}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v3, v13, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v2, 0x7ab4aae9

    invoke-interface {v13, v2}, LEt0;->F(I)V

    const v2, -0x7f65a980

    invoke-interface {v13, v2}, LEt0;->F(I)V

    sget-object v2, Lf10;->a:Lf10;

    const v2, 0x6758c6d8

    invoke-interface {v13, v2}, LEt0;->F(I)V

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x7

    move-object v7, v13

    invoke-static/range {v3 .. v9}, LK74;->b(LgV2;JFLEt0;II)V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->f()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    move-object/from16 v19, v13

    goto/16 :goto_3

    :cond_5
    const v4, -0x6c1adf00

    invoke-interface {v13, v4}, LEt0;->F(I)V

    invoke-static {v3}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->WalletBody$lambda$0(LsP5;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v3

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->getArgs()Lcom/stripe/android/link/LinkActivityContract$Args;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/link/LinkActivityContract$Args;->getStripeIntent$link_release()Lcom/stripe/android/model/StripeIntent;

    move-result-object v4

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v6

    invoke-interface {v13, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const-string v7, "LocalContext.current.resources"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v6}, Lcom/stripe/android/link/ui/PrimaryButtonKt;->completePaymentButtonLabel(Lcom/stripe/android/model/StripeIntent;Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->getExpiryDateController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v6

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->getCvcController()Lcom/stripe/android/ui/core/elements/CvcController;

    move-result-object v7

    new-instance v8, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$3;

    invoke-direct {v8, v2}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$3;-><init>(Ljava/lang/Object;)V

    new-instance v9, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$4;

    invoke-direct {v9, v2}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$4;-><init>(Ljava/lang/Object;)V

    new-instance v10, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$5;

    invoke-direct {v10, v2}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$5;-><init>(Ljava/lang/Object;)V

    new-instance v12, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$6;

    invoke-direct {v12, v2}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$6;-><init>(Ljava/lang/Object;)V

    new-instance v5, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$7;

    invoke-direct {v5, v2}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$7;-><init>(Ljava/lang/Object;)V

    new-instance v11, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$8;

    invoke-direct {v11, v2}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$8;-><init>(Ljava/lang/Object;)V

    move-object/from16 v17, v13

    new-instance v13, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$9;

    invoke-direct {v13, v2}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$9;-><init>(Ljava/lang/Object;)V

    new-instance v15, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$10;

    invoke-direct {v15, v2}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$10;-><init>(Ljava/lang/Object;)V

    sget v2, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->$stable:I

    const/16 v16, 0x6

    shl-int/lit8 v2, v2, 0x6

    const/16 v16, 0x8

    or-int/lit8 v2, v2, 0x8

    sget v16, Lcom/stripe/android/ui/core/elements/CvcController;->$stable:I

    shl-int/lit8 v16, v16, 0x9

    or-int v16, v2, v16

    and-int/lit16 v2, v14, 0x380

    move/from16 v18, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v6

    move-object/from16 v19, v5

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v10

    move-object v9, v12

    move-object/from16 v10, v19

    move-object v12, v13

    move-object/from16 v19, v17

    move-object v13, v15

    move v15, v14

    move-object/from16 v14, p2

    move-object/from16 v15, v19

    move/from16 v17, v18

    invoke-static/range {v2 .. v17}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->WalletBody(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-interface/range {v19 .. v19}, LEt0;->Q()V

    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    invoke-interface/range {v19 .. v19}, LEt0;->w()LWm5;

    move-result-object v2

    if-nez v2, :cond_7

    goto :goto_4

    :cond_7
    new-instance v3, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$11;

    move-object/from16 v4, p2

    move/from16 v5, p4

    invoke-direct {v3, v0, v1, v4, v5}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$11;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {v2, v3}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final WalletBody(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/wallet/WalletUiState;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            "Lcom/stripe/android/ui/core/elements/CvcController;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
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
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v15, p0

    move-object/from16 v14, p9

    const-string v0, "uiState"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButtonLabel"

    move-object/from16 v13, p1

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expiryDateController"

    move-object/from16 v12, p2

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cvcController"

    move-object/from16 v11, p3

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setExpanded"

    move-object/from16 v10, p4

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemSelected"

    move-object/from16 v9, p5

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAddNewPaymentMethodClick"

    move-object/from16 v8, p6

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEditPaymentMethod"

    move-object/from16 v7, p7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSetDefault"

    move-object/from16 v6, p8

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDeletePaymentMethod"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPrimaryButtonClick"

    move-object/from16 v5, p10

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPayAnotherWayClick"

    move-object/from16 v4, p11

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "showBottomSheetContent"

    move-object/from16 v3, p12

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x59befc18

    move-object/from16 v1, p13

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v2

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "com.stripe.android.link.ui.wallet.WalletBody (WalletScreen.kt:199)"

    move/from16 v13, p14

    move/from16 v12, p15

    invoke-static {v0, v13, v12, v1}, LQt0;->Z(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v13, p14

    move/from16 v12, p15

    :goto_0
    invoke-interface {v2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-ne v0, v3, :cond_1

    invoke-static {v5, v5, v4, v5}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v0

    invoke-interface {v2, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    move-object v3, v0

    check-cast v3, LEX2;

    invoke-interface {v2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v0, v4, :cond_2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v4, 0x2

    invoke-static {v0, v5, v4, v5}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v0

    invoke-interface {v2, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, LEX2;

    invoke-static {v3}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->WalletBody$lambda$4(LEX2;)Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v4

    const v5, -0x6c1ad80a

    invoke-interface {v2, v5}, LEt0;->F(I)V

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    const v5, 0x44faf204

    invoke-interface {v2, v5}, LEt0;->F(I)V

    invoke-interface {v2, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_4

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v6, v1, :cond_5

    :cond_4
    new-instance v6, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$12$1$1;

    const/4 v1, 0x0

    invoke-direct {v6, v0, v1}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$12$1$1;-><init>(LEX2;Lkotlin/coroutines/Continuation;)V

    invoke-interface {v2, v6}, LEt0;->z(Ljava/lang/Object;)V

    :cond_5
    invoke-interface {v2}, LEt0;->Q()V

    check-cast v6, Lkotlin/jvm/functions/Function2;

    sget v1, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->$stable:I

    or-int/lit8 v5, v1, 0x40

    invoke-static {v4, v6, v2, v5}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {v0}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->WalletBody$lambda$7(LEX2;)Z

    move-result v5

    new-instance v6, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$12$2;

    invoke-direct {v6, v14, v4, v0, v3}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$12$2;-><init>(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;LEX2;LEX2;)V

    invoke-static {v4, v5, v6, v2, v1}, Lcom/stripe/android/link/ui/wallet/ConfirmRemoveDialogKt;->ConfirmRemoveDialog(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLkotlin/jvm/functions/Function1;LEt0;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_1
    invoke-interface {v2}, LEt0;->Q()V

    invoke-static {}, Lhu0;->h()LU94;

    move-result-object v0

    invoke-interface {v2, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBv1;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isProcessing()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    new-instance v4, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$13;

    const/4 v5, 0x0

    invoke-direct {v4, v15, v0, v5}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$13;-><init>(Lcom/stripe/android/link/ui/wallet/WalletUiState;LBv1;Lkotlin/coroutines/Continuation;)V

    const/16 v0, 0x40

    invoke-static {v1, v4, v2, v0}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    new-instance v6, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;

    move-object v0, v6

    move-object/from16 v1, p0

    move-object v5, v2

    move-object/from16 v2, p1

    move-object/from16 v16, v3

    move-object/from16 v3, p10

    move/from16 v4, p14

    move-object/from16 v17, v5

    move/from16 v5, p15

    move-object/from16 v18, v6

    move-object/from16 v6, p11

    move-object/from16 v7, p5

    move-object/from16 v8, p4

    move-object/from16 v9, p12

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, v16

    move-object/from16 v13, p6

    move-object/from16 v14, p2

    move-object/from16 v15, p3

    invoke-direct/range {v0 .. v15}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;-><init>(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/lang/String;Lkotlin/jvm/functions/Function0;IILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEX2;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;)V

    const v0, -0x4343300f

    const/4 v1, 0x1

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    invoke-static {v2, v0, v1, v3}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v2, v1}, Lcom/stripe/android/link/ui/CommonKt;->ScrollableTopLevelColumn(Lkotlin/jvm/functions/Function3;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    invoke-interface {v2}, LEt0;->w()LWm5;

    move-result-object v15

    if-nez v15, :cond_7

    goto :goto_2

    :cond_7
    new-instance v14, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$15;

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

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v19, v14

    move/from16 v14, p14

    move-object/from16 v20, v15

    move/from16 v15, p15

    invoke-direct/range {v0 .. v15}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$15;-><init>(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;II)V

    move-object/from16 v1, v19

    move-object/from16 v0, v20

    invoke-interface {v0, v1}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method private static final WalletBody$lambda$0(LsP5;)Lcom/stripe/android/link/ui/wallet/WalletUiState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lcom/stripe/android/link/ui/wallet/WalletUiState;",
            ">;)",
            "Lcom/stripe/android/link/ui/wallet/WalletUiState;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    return-object p0
.end method

.method private static final WalletBody$lambda$4(LEX2;)Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            ">;)",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    return-object p0
.end method

.method private static final WalletBody$lambda$5(LEX2;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            ">;",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final WalletBody$lambda$7(LEX2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
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

.method private static final WalletBody$lambda$8(LEX2;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final WalletBodyPreview(LEt0;I)V
    .locals 26

    move/from16 v0, p1

    const v1, 0x77b0c7aa

    move-object/from16 v2, p0

    invoke-interface {v2, v1}, LEt0;->u(I)LEt0;

    move-result-object v2

    if-nez v0, :cond_1

    invoke-interface {v2}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v2}, LEt0;->k()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.link.ui.wallet.WalletBodyPreview (WalletScreen.kt:81)"

    invoke-static {v1, v0, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const/4 v1, 0x3

    new-array v1, v1, [Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    new-instance v14, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    const-string v4, "id1"

    const/4 v5, 0x0

    const/16 v6, 0x7ee

    const/16 v7, 0xc

    sget-object v8, Lcom/stripe/android/model/CardBrand;->Visa:Lcom/stripe/android/model/CardBrand;

    const-string v9, "4242"

    sget-object v10, Lcom/stripe/android/model/CvcCheck;->Fail:Lcom/stripe/android/model/CvcCheck;

    const/4 v11, 0x0

    const/16 v12, 0x80

    const/4 v13, 0x0

    move-object v3, v14

    invoke-direct/range {v3 .. v13}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;-><init>(Ljava/lang/String;ZIILcom/stripe/android/model/CardBrand;Ljava/lang/String;Lcom/stripe/android/model/CvcCheck;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    aput-object v14, v1, v3

    new-instance v4, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    const-string v16, "id2"

    const/16 v17, 0x0

    const/16 v18, 0x7e6

    const/16 v19, 0x1

    sget-object v20, Lcom/stripe/android/model/CardBrand;->MasterCard:Lcom/stripe/android/model/CardBrand;

    const-string v21, "4444"

    sget-object v22, Lcom/stripe/android/model/CvcCheck;->Pass:Lcom/stripe/android/model/CvcCheck;

    const/16 v23, 0x0

    const/16 v24, 0x80

    const/16 v25, 0x0

    move-object v15, v4

    invoke-direct/range {v15 .. v25}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;-><init>(Ljava/lang/String;ZIILcom/stripe/android/model/CardBrand;Ljava/lang/String;Lcom/stripe/android/model/CvcCheck;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x1

    aput-object v4, v1, v5

    new-instance v4, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    const-string v7, "id2"

    const/4 v8, 0x1

    const-string v9, "icon"

    const-string v10, "Stripe Bank With Long Name"

    const-string v11, "6789"

    move-object v6, v4

    invoke-direct/range {v6 .. v11}, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v6, 0x2

    aput-object v4, v1, v6

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v4, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1;

    invoke-direct {v4, v1}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1;-><init>(Ljava/util/List;)V

    const v1, -0x1e0a8152

    invoke-static {v2, v1, v5, v4}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v1

    const/16 v4, 0x30

    invoke-static {v3, v1, v2, v4, v5}, Lcom/stripe/android/link/theme/ThemeKt;->DefaultLinkTheme(ZLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    invoke-interface {v2}, LEt0;->w()LWm5;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    new-instance v2, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$2;

    invoke-direct {v2, v0}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$2;-><init>(I)V

    invoke-interface {v1, v2}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final synthetic access$ExpandedPaymentDetails(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->ExpandedPaymentDetails(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$WalletBody$lambda$5(LEX2;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->WalletBody$lambda$5(LEX2;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V

    return-void
.end method

.method public static final synthetic access$WalletBody$lambda$8(LEX2;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->WalletBody$lambda$8(LEX2;Z)V

    return-void
.end method

.method public static final synthetic access$WalletBodyPreview(LEt0;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->WalletBodyPreview(LEt0;I)V

    return-void
.end method

.method public static final synthetic access$replaceHyperlinks(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->replaceHyperlinks(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final replaceHyperlinks(Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    const-string v1, "<terms>"

    const-string v2, "<a href=\"https://stripe.com/legal/ach-payments/authorization\">"

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "</terms>"

    const-string v8, "</a>"

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
