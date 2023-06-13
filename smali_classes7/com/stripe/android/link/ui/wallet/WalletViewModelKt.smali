.class public final Lcom/stripe/android/link/ui/wallet/WalletViewModelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "toPaymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "Lcom/stripe/android/link/ui/wallet/WalletUiState;",
        "link_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic access$toPaymentMethodCreateParams(Lcom/stripe/android/link/ui/wallet/WalletUiState;)Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/ui/wallet/WalletViewModelKt;->toPaymentMethodCreateParams(Lcom/stripe/android/link/ui/wallet/WalletUiState;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p0

    return-object p0
.end method

.method private static final toPaymentMethodCreateParams(Lcom/stripe/android/link/ui/wallet/WalletUiState;)Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 3

    invoke-virtual {p0}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getExpiryDateInput()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/CardDetailsElementKt;->createExpiryDateFormFieldValues(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/util/Map;

    move-result-object p0

    sget-object v0, Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter;->Companion:Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion;

    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion;->transformToPaymentMethodCreateParams(Ljava/util/Map;Ljava/lang/String;Z)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p0

    return-object p0
.end method
