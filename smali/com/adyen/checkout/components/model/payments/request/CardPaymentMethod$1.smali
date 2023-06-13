.class final Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/adyen/checkout/core/model/ModelObject$Serializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
        "Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;",
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
.method public deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;
    .locals 3

    new-instance v0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;-><init>()V

    const-string v1, "type"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;->setType(Ljava/lang/String;)V

    const-string v1, "encryptedCardNumber"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->setEncryptedCardNumber(Ljava/lang/String;)V

    const-string v1, "encryptedExpiryMonth"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->setEncryptedExpiryMonth(Ljava/lang/String;)V

    const-string v1, "encryptedExpiryYear"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->setEncryptedExpiryYear(Ljava/lang/String;)V

    const-string v1, "storedPaymentMethodId"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->setStoredPaymentMethodId(Ljava/lang/String;)V

    const-string v1, "encryptedSecurityCode"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->setEncryptedSecurityCode(Ljava/lang/String;)V

    const-string v1, "holderName"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->setHolderName(Ljava/lang/String;)V

    const-string v1, "encryptedPassword"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->setEncryptedPassword(Ljava/lang/String;)V

    const-string v1, "taxNumber"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->setTaxNumber(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/core/model/ModelObject;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod$1;->deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;

    move-result-object p1

    return-object p1
.end method

.method public serialize(Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;)Lorg/json/JSONObject;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "type"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "encryptedCardNumber"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->getEncryptedCardNumber()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "encryptedExpiryMonth"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->getEncryptedExpiryMonth()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "encryptedExpiryYear"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->getEncryptedExpiryYear()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "encryptedSecurityCode"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->getEncryptedSecurityCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "storedPaymentMethodId"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->getStoredPaymentMethodId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "holderName"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->getHolderName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "encryptedPassword"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->getEncryptedPassword()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "taxNumber"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->getTaxNumber()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/adyen/checkout/core/exception/ModelSerializationException;

    const-class v1, Lcom/adyen/checkout/components/model/payments/request/IdealPaymentMethod;

    invoke-direct {v0, v1, p1}, Lcom/adyen/checkout/core/exception/ModelSerializationException;-><init>(Ljava/lang/Class;Lorg/json/JSONException;)V

    throw v0
.end method

.method public bridge synthetic serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;
    .locals 0

    check-cast p1, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod$1;->serialize(Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
