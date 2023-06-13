.class final Lcom/adyen/checkout/components/model/paymentmethods/Configuration$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/adyen/checkout/core/model/ModelObject$Serializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adyen/checkout/components/model/paymentmethods/Configuration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
        "Lcom/adyen/checkout/components/model/paymentmethods/Configuration;",
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
.method public deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/model/paymentmethods/Configuration;
    .locals 3

    new-instance v0, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;-><init>()V

    const-string v1, "merchantId"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->setMerchantId(Ljava/lang/String;)V

    const-string v1, "gatewayMerchantId"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->setGatewayMerchantId(Ljava/lang/String;)V

    const-string v1, "intent"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->setIntent(Ljava/lang/String;)V

    const-string v1, "koreanAuthenticationRequired"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->setKoreanAuthenticationRequired(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/core/model/ModelObject;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/model/paymentmethods/Configuration$1;->deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/model/paymentmethods/Configuration;

    move-result-object p1

    return-object p1
.end method

.method public serialize(Lcom/adyen/checkout/components/model/paymentmethods/Configuration;)Lorg/json/JSONObject;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "merchantId"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->getMerchantId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "gatewayMerchantId"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->getGatewayMerchantId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "intent"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->getIntent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "koreanAuthenticationRequired"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->getKoreanAuthenticationRequired()Ljava/lang/String;

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

    check-cast p1, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/model/paymentmethods/Configuration$1;->serialize(Lcom/adyen/checkout/components/model/paymentmethods/Configuration;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
