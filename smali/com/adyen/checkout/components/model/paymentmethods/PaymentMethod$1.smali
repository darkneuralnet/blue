.class final Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/adyen/checkout/core/model/ModelObject$Serializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
        "Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;",
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
.method public deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;
    .locals 3

    new-instance v0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;-><init>()V

    const-string v1, "type"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->setType(Ljava/lang/String;)V

    const-string v1, "name"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->setName(Ljava/lang/String;)V

    const-string v1, "brands"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-static {v1}, Lcom/adyen/checkout/core/model/JsonUtils;->parseOptStringList(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->setBrands(Ljava/util/List;)V

    const-string v1, "brand"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->setBrand(Ljava/lang/String;)V

    const-string v1, "fundingSource"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->setFundingSource(Ljava/lang/String;)V

    const-string v1, "issuers"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    sget-object v2, Lcom/adyen/checkout/components/model/paymentmethods/Issuer;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-static {v1, v2}, Lcom/adyen/checkout/core/model/ModelUtils;->deserializeOptList(Lorg/json/JSONArray;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->setIssuers(Ljava/util/List;)V

    const-string v1, "configuration"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    sget-object v2, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-static {v1, v2}, Lcom/adyen/checkout/core/model/ModelUtils;->deserializeOpt(Lorg/json/JSONObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lcom/adyen/checkout/core/model/ModelObject;

    move-result-object v1

    check-cast v1, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->setConfiguration(Lcom/adyen/checkout/components/model/paymentmethods/Configuration;)V

    const-string v1, "details"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    sget-object v1, Lcom/adyen/checkout/components/model/paymentmethods/InputDetail;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-static {p1, v1}, Lcom/adyen/checkout/core/model/ModelUtils;->deserializeOptList(Lorg/json/JSONArray;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->setDetails(Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/core/model/ModelObject;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod$1;->deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;

    move-result-object p1

    return-object p1
.end method

.method public serialize(Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;)Lorg/json/JSONObject;
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "type"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "name"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "brands"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->getBrands()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/adyen/checkout/core/model/JsonUtils;->serializeOptStringList(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "brand"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->getBrand()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "fundingSource"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->getFundingSource()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "issuers"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->getIssuers()Ljava/util/List;

    move-result-object v2

    sget-object v3, Lcom/adyen/checkout/components/model/paymentmethods/Issuer;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-static {v2, v3}, Lcom/adyen/checkout/core/model/ModelUtils;->serializeOptList(Ljava/util/List;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "configuration"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->getConfiguration()Lcom/adyen/checkout/components/model/paymentmethods/Configuration;

    move-result-object v2

    sget-object v3, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-static {v2, v3}, Lcom/adyen/checkout/core/model/ModelUtils;->serializeOpt(Lcom/adyen/checkout/core/model/ModelObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "details"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->getDetails()Ljava/util/List;

    move-result-object p1

    sget-object v2, Lcom/adyen/checkout/components/model/paymentmethods/InputDetail;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-static {p1, v2}, Lcom/adyen/checkout/core/model/ModelUtils;->serializeOptList(Ljava/util/List;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lorg/json/JSONArray;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/adyen/checkout/core/exception/ModelSerializationException;

    const-class v1, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;

    invoke-direct {v0, v1, p1}, Lcom/adyen/checkout/core/exception/ModelSerializationException;-><init>(Ljava/lang/Class;Lorg/json/JSONException;)V

    throw v0
.end method

.method public bridge synthetic serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;
    .locals 0

    check-cast p1, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod$1;->serialize(Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
