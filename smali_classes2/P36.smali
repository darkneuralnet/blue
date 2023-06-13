.class public LP36;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LG10;Lcom/braintreepayments/api/models/CardNonce;)V
    .locals 0

    invoke-static {p0, p1}, LP36;->c(LG10;Lcom/braintreepayments/api/models/CardNonce;)V

    return-void
.end method

.method public static b(LG10;Lcom/braintreepayments/api/models/ThreeDSecureLookup;Ljava/lang/String;)V
    .locals 4

    invoke-virtual {p1}, Lcom/braintreepayments/api/models/ThreeDSecureLookup;->a()Lcom/braintreepayments/api/models/CardNonce;

    move-result-object p1

    const-string v0, "three-d-secure.verification-flow.upgrade-payment-method.started"

    invoke-virtual {p0, v0}, LG10;->Ea(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/braintreepayments/api/models/PaymentMethodNonce;->c()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v2, "jwt"

    invoke-virtual {v1, v2, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "paymentMethodNonce"

    invoke-virtual {v1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {p0}, LG10;->ha()LK10;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "payment_methods/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/three_d_secure/authenticate_from_jwt"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lu56;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, LP36$a;

    invoke-direct {v2, p1, p0}, LP36$a;-><init>(Lcom/braintreepayments/api/models/CardNonce;LG10;)V

    invoke-virtual {p2, v0, v1, v2}, LK10;->e(Ljava/lang/String;Ljava/lang/String;LHN1;)V

    return-void
.end method

.method public static c(LG10;Lcom/braintreepayments/api/models/CardNonce;)V
    .locals 5

    invoke-virtual {p1}, Lcom/braintreepayments/api/models/CardNonce;->i()Lcom/braintreepayments/api/models/ThreeDSecureInfo;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/braintreepayments/api/models/ThreeDSecureInfo;->c()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "three-d-secure.verification-flow.liability-shifted.%b"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, LG10;->Ea(Ljava/lang/String;)V

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/braintreepayments/api/models/ThreeDSecureInfo;->b()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, v1, v4

    const-string v0, "three-d-secure.verification-flow.liability-shift-possible.%b"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LG10;->Ea(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LG10;->va(Lcom/braintreepayments/api/models/PaymentMethodNonce;)V

    return-void
.end method

.method public static d(LG10;ILandroid/content/Intent;)V
    .locals 4

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string p2, "auth_response"

    invoke-virtual {p1, p2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/braintreepayments/api/models/ThreeDSecureAuthenticationResponse;->a(Ljava/lang/String;)Lcom/braintreepayments/api/models/ThreeDSecureAuthenticationResponse;

    move-result-object p2

    invoke-virtual {p2}, Lcom/braintreepayments/api/models/ThreeDSecureAuthenticationResponse;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/braintreepayments/api/models/ThreeDSecureAuthenticationResponse;->b()Lcom/braintreepayments/api/models/CardNonce;

    move-result-object p1

    invoke-static {p0, p1}, LP36;->c(LG10;Lcom/braintreepayments/api/models/CardNonce;)V

    goto :goto_0

    :cond_1
    new-instance p2, Lcom/braintreepayments/api/exceptions/ErrorWithResponse;

    const/16 v0, 0x1a6

    invoke-direct {p2, v0, p1}, Lcom/braintreepayments/api/exceptions/ErrorWithResponse;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, p2}, LG10;->ya(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_2
    const-string p1, "com.braintreepayments.api.ThreeDSecureActivity.EXTRA_THREE_D_SECURE_LOOKUP"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/braintreepayments/api/models/ThreeDSecureLookup;

    const-string v0, "com.braintreepayments.api.ThreeDSecureActivity.EXTRA_VALIDATION_RESPONSE"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/cardinalcommerce/cardinalmobilesdk/models/ValidateResponse;

    const-string v1, "com.braintreepayments.api.ThreeDSecureActivity.EXTRA_JWT"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/cardinalcommerce/cardinalmobilesdk/models/ValidateResponse;->getActionCode()Lcom/cardinalcommerce/cardinalmobilesdk/models/CardinalActionCode;

    move-result-object v2

    invoke-virtual {v2}, Lcom/cardinalcommerce/cardinalmobilesdk/models/CardinalActionCode;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "three-d-secure.verification-flow.cardinal-sdk.action-code.%s"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, LG10;->Ea(Ljava/lang/String;)V

    sget-object v1, LP36$b;->a:[I

    invoke-virtual {v0}, Lcom/cardinalcommerce/cardinalmobilesdk/models/ValidateResponse;->getActionCode()Lcom/cardinalcommerce/cardinalmobilesdk/models/CardinalActionCode;

    move-result-object v2

    invoke-virtual {v2}, Lcom/cardinalcommerce/cardinalmobilesdk/models/CardinalActionCode;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/16 p1, 0x34af

    invoke-virtual {p0, p1}, LG10;->Aa(I)V

    const-string p1, "three-d-secure.verification-flow.canceled"

    invoke-virtual {p0, p1}, LG10;->Ea(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_1
    new-instance p1, Lcom/braintreepayments/api/exceptions/BraintreeException;

    invoke-virtual {v0}, Lcom/cardinalcommerce/cardinalmobilesdk/models/ValidateResponse;->getErrorDescription()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/braintreepayments/api/exceptions/BraintreeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LG10;->ya(Ljava/lang/Exception;)V

    const-string p1, "three-d-secure.verification-flow.failed"

    invoke-virtual {p0, p1}, LG10;->Ea(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_2
    invoke-static {p0, p1, p2}, LP36;->b(LG10;Lcom/braintreepayments/api/models/ThreeDSecureLookup;Ljava/lang/String;)V

    const-string p1, "three-d-secure.verification-flow.completed"

    invoke-virtual {p0, p1}, LG10;->Ea(Ljava/lang/String;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
