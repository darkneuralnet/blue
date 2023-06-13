.class final Lcom/adyen/checkout/components/model/payments/response/VoucherAction$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/adyen/checkout/core/model/ModelObject$Serializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adyen/checkout/components/model/payments/response/VoucherAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
        "Lcom/adyen/checkout/components/model/payments/response/VoucherAction;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/model/payments/response/VoucherAction;
    .locals 3

    new-instance v0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;-><init>()V

    const-string v1, "type"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/response/Action;->setType(Ljava/lang/String;)V

    const-string v1, "paymentData"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/response/Action;->setPaymentData(Ljava/lang/String;)V

    const-string v1, "paymentMethodType"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/response/Action;->setPaymentMethodType(Ljava/lang/String;)V

    const-string v1, "surcharge"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    sget-object v2, Lcom/adyen/checkout/components/model/payments/Amount;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-static {v1, v2}, Lcom/adyen/checkout/core/model/ModelUtils;->deserializeOpt(Lorg/json/JSONObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lcom/adyen/checkout/core/model/ModelObject;

    move-result-object v1

    check-cast v1, Lcom/adyen/checkout/components/model/payments/Amount;

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->setSurcharge(Lcom/adyen/checkout/components/model/payments/Amount;)V

    const-string v1, "initialAmount"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1, v2}, Lcom/adyen/checkout/core/model/ModelUtils;->deserializeOpt(Lorg/json/JSONObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lcom/adyen/checkout/core/model/ModelObject;

    move-result-object v1

    check-cast v1, Lcom/adyen/checkout/components/model/payments/Amount;

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->setInitialAmount(Lcom/adyen/checkout/components/model/payments/Amount;)V

    const-string v1, "totalAmount"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1, v2}, Lcom/adyen/checkout/core/model/ModelUtils;->deserializeOpt(Lorg/json/JSONObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lcom/adyen/checkout/core/model/ModelObject;

    move-result-object v1

    check-cast v1, Lcom/adyen/checkout/components/model/payments/Amount;

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->setTotalAmount(Lcom/adyen/checkout/components/model/payments/Amount;)V

    const-string v1, "issuer"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->setIssuer(Ljava/lang/String;)V

    const-string v1, "expiresAt"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->setExpiresAt(Ljava/lang/String;)V

    const-string v1, "reference"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->setReference(Ljava/lang/String;)V

    const-string v1, "alternativeReference"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->setAlternativeReference(Ljava/lang/String;)V

    const-string v1, "merchantName"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->setMerchantName(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/core/model/ModelObject;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction$1;->deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/model/payments/response/VoucherAction;

    move-result-object p1

    return-object p1
.end method

.method public serialize(Lcom/adyen/checkout/components/model/payments/response/VoucherAction;)Lorg/json/JSONObject;
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "type"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/response/Action;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "paymentData"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/response/Action;->getPaymentData()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "paymentMethodType"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/response/Action;->getPaymentMethodType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "surcharge"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->getSurcharge()Lcom/adyen/checkout/components/model/payments/Amount;

    move-result-object v2

    sget-object v3, Lcom/adyen/checkout/components/model/payments/Amount;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-static {v2, v3}, Lcom/adyen/checkout/core/model/ModelUtils;->serializeOpt(Lcom/adyen/checkout/core/model/ModelObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "initialAmount"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->getInitialAmount()Lcom/adyen/checkout/components/model/payments/Amount;

    move-result-object v2

    invoke-static {v2, v3}, Lcom/adyen/checkout/core/model/ModelUtils;->serializeOpt(Lcom/adyen/checkout/core/model/ModelObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "totalAmount"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->getTotalAmount()Lcom/adyen/checkout/components/model/payments/Amount;

    move-result-object v2

    invoke-static {v2, v3}, Lcom/adyen/checkout/core/model/ModelUtils;->serializeOpt(Lcom/adyen/checkout/core/model/ModelObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "issuer"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->getIssuer()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "expiresAt"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->getExpiresAt()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "reference"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->getReference()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "alternativeReference"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->getAlternativeReference()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "merchantName"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->getMerchantName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/adyen/checkout/core/exception/ModelSerializationException;

    const-class v1, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;

    invoke-direct {v0, v1, p1}, Lcom/adyen/checkout/core/exception/ModelSerializationException;-><init>(Ljava/lang/Class;Lorg/json/JSONException;)V

    throw v0
.end method

.method public bridge synthetic serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;
    .locals 0

    check-cast p1, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction$1;->serialize(Lcom/adyen/checkout/components/model/payments/response/VoucherAction;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
