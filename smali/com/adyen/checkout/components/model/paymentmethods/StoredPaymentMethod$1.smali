.class final Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/adyen/checkout/core/model/ModelObject$Serializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
        "Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;",
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
.method public deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;
    .locals 2

    new-instance v0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;-><init>()V

    const-string v1, "type"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->setType(Ljava/lang/String;)V

    const-string v1, "name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->setName(Ljava/lang/String;)V

    const-string v1, "brand"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->setBrand(Ljava/lang/String;)V

    const-string v1, "expiryMonth"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->setExpiryMonth(Ljava/lang/String;)V

    const-string v1, "expiryYear"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->setExpiryYear(Ljava/lang/String;)V

    const-string v1, "holderName"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->setHolderName(Ljava/lang/String;)V

    const-string v1, "id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->setId(Ljava/lang/String;)V

    const-string v1, "lastFour"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->setLastFour(Ljava/lang/String;)V

    const-string v1, "shopperEmail"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->setShopperEmail(Ljava/lang/String;)V

    const-string v1, "supportedShopperInteractions"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    invoke-static {p1}, Lcom/adyen/checkout/core/model/JsonUtils;->parseOptStringList(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->setSupportedShopperInteractions(Ljava/util/List;)V

    :cond_0
    return-object v0
.end method

.method public bridge synthetic deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/core/model/ModelObject;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod$1;->deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;

    move-result-object p1

    return-object p1
.end method

.method public serialize(Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;)Lorg/json/JSONObject;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "type"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "name"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "brand"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->getBrand()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "expiryMonth"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->getExpiryMonth()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "expiryYear"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->getExpiryYear()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "holderName"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->getHolderName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "id"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "lastFour"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->getLastFour()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "shopperEmail"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->getShopperEmail()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "supportedShopperInteractions"

    new-instance v2, Lorg/json/JSONArray;

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->getSupportedShopperInteractions()Ljava/util/List;

    move-result-object p1

    invoke-direct {v2, p1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/adyen/checkout/core/exception/ModelSerializationException;

    const-class v1, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;

    invoke-direct {v0, v1, p1}, Lcom/adyen/checkout/core/exception/ModelSerializationException;-><init>(Ljava/lang/Class;Lorg/json/JSONException;)V

    throw v0
.end method

.method public bridge synthetic serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;
    .locals 0

    check-cast p1, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod$1;->serialize(Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
