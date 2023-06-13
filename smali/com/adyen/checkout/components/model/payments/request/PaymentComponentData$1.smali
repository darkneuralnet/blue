.class final Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/adyen/checkout/core/model/ModelObject$Serializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
        "Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;",
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
.method public deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;
    .locals 3

    new-instance v0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;-><init>()V

    const-string v1, "paymentMethod"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    sget-object v2, Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-static {v1, v2}, Lcom/adyen/checkout/core/model/ModelUtils;->deserializeOpt(Lorg/json/JSONObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lcom/adyen/checkout/core/model/ModelObject;

    move-result-object v1

    check-cast v1, Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->setPaymentMethod(Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;)V

    const-string v1, "storePaymentMethod"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->setStorePaymentMethod(Z)V

    const-string v1, "shopperReference"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->setShopperReference(Ljava/lang/String;)V

    const-string v1, "amount"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    sget-object v2, Lcom/adyen/checkout/components/model/payments/Amount;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-static {v1, v2}, Lcom/adyen/checkout/core/model/ModelUtils;->deserializeOpt(Lorg/json/JSONObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lcom/adyen/checkout/core/model/ModelObject;

    move-result-object v1

    check-cast v1, Lcom/adyen/checkout/components/model/payments/Amount;

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->setAmount(Lcom/adyen/checkout/components/model/payments/Amount;)V

    const-string v1, "billingAddress"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    sget-object v2, Lcom/adyen/checkout/components/model/payments/request/Address;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-static {v1, v2}, Lcom/adyen/checkout/core/model/ModelUtils;->deserializeOpt(Lorg/json/JSONObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lcom/adyen/checkout/core/model/ModelObject;

    move-result-object v1

    check-cast v1, Lcom/adyen/checkout/components/model/payments/request/Address;

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->setBillingAddress(Lcom/adyen/checkout/components/model/payments/request/Address;)V

    const-string v1, "deliveryAddress"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1, v2}, Lcom/adyen/checkout/core/model/ModelUtils;->deserializeOpt(Lorg/json/JSONObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lcom/adyen/checkout/core/model/ModelObject;

    move-result-object v1

    check-cast v1, Lcom/adyen/checkout/components/model/payments/request/Address;

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->setDeliveryAddress(Lcom/adyen/checkout/components/model/payments/request/Address;)V

    const-string v1, "shopperName"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    sget-object v2, Lcom/adyen/checkout/components/model/payments/request/ShopperName;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-static {v1, v2}, Lcom/adyen/checkout/core/model/ModelUtils;->deserializeOpt(Lorg/json/JSONObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lcom/adyen/checkout/core/model/ModelObject;

    move-result-object v1

    check-cast v1, Lcom/adyen/checkout/components/model/payments/request/ShopperName;

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->setShopperName(Lcom/adyen/checkout/components/model/payments/request/ShopperName;)V

    const-string v1, "telephoneNumber"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->setTelephoneNumber(Ljava/lang/String;)V

    const-string v1, "shopperEmail"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->setShopperEmail(Ljava/lang/String;)V

    const-string v1, "dateOfBirth"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->setDateOfBirth(Ljava/lang/String;)V

    const-string v1, "socialSecurityNumber"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->setSocialSecurityNumber(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/core/model/ModelObject;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData$1;->deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;

    move-result-object p1

    return-object p1
.end method

.method public serialize(Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;)Lorg/json/JSONObject;
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "paymentMethod"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->getPaymentMethod()Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;

    move-result-object v2

    sget-object v3, Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-static {v2, v3}, Lcom/adyen/checkout/core/model/ModelUtils;->serializeOpt(Lcom/adyen/checkout/core/model/ModelObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "storePaymentMethod"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->isStorePaymentMethodEnable()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "shopperReference"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->getShopperReference()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "amount"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->getAmount()Lcom/adyen/checkout/components/model/payments/Amount;

    move-result-object v2

    sget-object v3, Lcom/adyen/checkout/components/model/payments/Amount;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-static {v2, v3}, Lcom/adyen/checkout/core/model/ModelUtils;->serializeOpt(Lcom/adyen/checkout/core/model/ModelObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "billingAddress"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->getBillingAddress()Lcom/adyen/checkout/components/model/payments/request/Address;

    move-result-object v2

    sget-object v3, Lcom/adyen/checkout/components/model/payments/request/Address;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-static {v2, v3}, Lcom/adyen/checkout/core/model/ModelUtils;->serializeOpt(Lcom/adyen/checkout/core/model/ModelObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "deliveryAddress"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->getDeliveryAddress()Lcom/adyen/checkout/components/model/payments/request/Address;

    move-result-object v2

    invoke-static {v2, v3}, Lcom/adyen/checkout/core/model/ModelUtils;->serializeOpt(Lcom/adyen/checkout/core/model/ModelObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "shopperName"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->getShopperName()Lcom/adyen/checkout/components/model/payments/request/ShopperName;

    move-result-object v2

    sget-object v3, Lcom/adyen/checkout/components/model/payments/request/ShopperName;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-static {v2, v3}, Lcom/adyen/checkout/core/model/ModelUtils;->serializeOpt(Lcom/adyen/checkout/core/model/ModelObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "telephoneNumber"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->getTelephoneNumber()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "shopperEmail"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->getShopperEmail()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "dateOfBirth"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->getDateOfBirth()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "socialSecurityNumber"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->getSocialSecurityNumber()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/adyen/checkout/core/exception/ModelSerializationException;

    const-class v1, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;

    invoke-direct {v0, v1, p1}, Lcom/adyen/checkout/core/exception/ModelSerializationException;-><init>(Ljava/lang/Class;Lorg/json/JSONException;)V

    throw v0
.end method

.method public bridge synthetic serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;
    .locals 0

    check-cast p1, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData$1;->serialize(Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
