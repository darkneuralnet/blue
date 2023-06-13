.class public LsL3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LG10;ILandroid/content/Intent;)V
    .locals 4

    invoke-static {p0}, LtL3;->a(LG10;)Lcom/braintreepayments/api/models/PayPalAccountNonce;

    move-result-object v0

    const/4 v1, -0x1

    const/16 v2, 0x351d

    const-string v3, "paypal-two-factor.browser-switch.canceled"

    if-ne p1, v1, :cond_4

    if-eqz p2, :cond_4

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string p2, "paypal-two-factor.browser-switch.failed"

    if-eqz p1, :cond_3

    const-string v1, "success"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v0, "cancel"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p2}, LG10;->Ea(Ljava/lang/String;)V

    new-instance p2, Lcom/braintreepayments/api/exceptions/BraintreeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Host path unknown: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/braintreepayments/api/exceptions/BraintreeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, LG10;->ya(Ljava/lang/Exception;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v3}, LG10;->Ea(Ljava/lang/String;)V

    invoke-virtual {p0, v2}, LG10;->Aa(I)V

    goto :goto_1

    :cond_2
    const-string p1, "paypal-two-factor.browser-switch.succeeded"

    invoke-virtual {p0, p1}, LG10;->Ea(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LG10;->va(Lcom/braintreepayments/api/models/PaymentMethodNonce;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, p2}, LG10;->Ea(Ljava/lang/String;)V

    new-instance p1, Lcom/braintreepayments/api/exceptions/BraintreeException;

    const-string p2, "Host missing from browser switch response."

    invoke-direct {p1, p2}, Lcom/braintreepayments/api/exceptions/BraintreeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LG10;->ya(Ljava/lang/Exception;)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0, v3}, LG10;->Ea(Ljava/lang/String;)V

    invoke-virtual {p0, v2}, LG10;->Aa(I)V

    :goto_1
    return-void
.end method
