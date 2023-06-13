.class public final LJE0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "Lio/card/payment/CreditCard;",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "a",
        "app_birdRelease"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lio/card/payment/CreditCard;)Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 18

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/model/CardParams;

    iget-object v3, v0, Lio/card/payment/CreditCard;->cardNumber:Ljava/lang/String;

    const-string v2, "cardNumber"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget v4, v0, Lio/card/payment/CreditCard;->expiryMonth:I

    iget v5, v0, Lio/card/payment/CreditCard;->expiryYear:I

    iget-object v6, v0, Lio/card/payment/CreditCard;->cvv:Ljava/lang/String;

    iget-object v7, v0, Lio/card/payment/CreditCard;->cardholderName:Ljava/lang/String;

    new-instance v17, Lcom/stripe/android/model/Address;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    iget-object v13, v0, Lio/card/payment/CreditCard;->postalCode:Ljava/lang/String;

    const/4 v14, 0x0

    const/16 v15, 0x2f

    const/16 v16, 0x0

    move-object/from16 v8, v17

    invoke-direct/range {v8 .. v16}, Lcom/stripe/android/model/Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v11, 0xc0

    move-object v2, v1

    invoke-direct/range {v2 .. v12}, Lcom/stripe/android/model/CardParams;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v0, Lcom/stripe/android/model/PaymentMethodCreateParams;->Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;

    invoke-virtual {v0, v1}, Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;->createCard(Lcom/stripe/android/model/CardParams;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v0

    return-object v0
.end method
