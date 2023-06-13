.class final Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1;->invoke(LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $paymentDetailsList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1;->$paymentDetailsList:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0xb

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v4, "com.stripe.android.link.ui.wallet.WalletBodyPreview.<anonymous>.<anonymous> (WalletScreen.kt:111)"

    const v5, 0x58591ef2

    invoke-static {v5, v1, v2, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;->Companion:Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod$Companion;->getAllTypes()Ljava/util/Set;

    move-result-object v5

    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1;->$paymentDetailsList:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    new-instance v11, Lcom/stripe/android/link/ui/ErrorMessage$Raw;

    const-string v1, "Something went wrong"

    invoke-direct {v11, v1}, Lcom/stripe/android/link/ui/ErrorMessage$Raw;-><init>(Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    iget-object v6, v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1;->$paymentDetailsList:Ljava/util/List;

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x7b0

    const/16 v17, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v17}, Lcom/stripe/android/link/ui/wallet/WalletUiState;-><init>(Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v13, "Pay $10.99"

    new-instance v14, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    new-instance v3, Lcom/stripe/android/uicore/elements/DateConfig;

    invoke-direct {v3}, Lcom/stripe/android/uicore/elements/DateConfig;-><init>()V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v2, v14

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/stripe/android/ui/core/elements/CvcController;

    const/16 v16, 0x0

    sget-object v3, Lcom/stripe/android/model/CardBrand;->Visa:Lcom/stripe/android/model/CardBrand;

    invoke-static {v3}, LVu1;->G(Ljava/lang/Object;)LEu1;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xd

    const/16 v21, 0x0

    move-object v15, v2

    invoke-direct/range {v15 .. v21}, Lcom/stripe/android/ui/core/elements/CvcController;-><init>(Lcom/stripe/android/ui/core/elements/CvcConfig;LEu1;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v16, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1$1;->INSTANCE:Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1$1;

    sget-object v17, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1$2;->INSTANCE:Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1$2;

    sget-object v18, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1$3;->INSTANCE:Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1$3;

    sget-object v19, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1$4;->INSTANCE:Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1$4;

    sget-object v20, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1$5;->INSTANCE:Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1$5;

    sget-object v21, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1$6;->INSTANCE:Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1$6;

    sget-object v22, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1$7;->INSTANCE:Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1$7;

    sget-object v23, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1$8;->INSTANCE:Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1$8;

    sget-object v24, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1$9;->INSTANCE:Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBodyPreview$1$1$9;

    sget v3, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->$stable:I

    shl-int/lit8 v3, v3, 0x6

    const v4, 0x36db6038

    or-int/2addr v3, v4

    sget v4, Lcom/stripe/android/ui/core/elements/CvcController;->$stable:I

    shl-int/lit8 v4, v4, 0x9

    or-int v26, v3, v4

    const/16 v27, 0x1b6

    move-object v12, v1

    move-object/from16 v25, p1

    invoke-static/range {v12 .. v27}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->WalletBody(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method
