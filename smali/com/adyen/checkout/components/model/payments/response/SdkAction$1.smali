.class final Lcom/adyen/checkout/components/model/payments/response/SdkAction$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/adyen/checkout/core/model/ModelObject$Serializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adyen/checkout/components/model/payments/response/SdkAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
        "Lcom/adyen/checkout/components/model/payments/response/SdkAction;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private getSdkDataSerializer(Ljava/lang/String;)Lcom/adyen/checkout/core/model/ModelObject$Serializer;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "+",
            "Lcom/adyen/checkout/components/model/payments/response/SdkData;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_1

    const-string v0, "wechatpaySDK"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/adyen/checkout/components/model/payments/response/WeChatPaySdkData;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p1

    :cond_0
    new-instance v0, Lcom/adyen/checkout/core/exception/CheckoutException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sdkData not found for type paymentMethodType - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/adyen/checkout/core/exception/CheckoutException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p1, Lcom/adyen/checkout/core/exception/CheckoutException;

    const-string v0, "SdkAction cannot be parsed with null paymentMethodType."

    invoke-direct {p1, v0}, Lcom/adyen/checkout/core/exception/CheckoutException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/model/payments/response/SdkAction;
    .locals 3

    new-instance v0, Lcom/adyen/checkout/components/model/payments/response/SdkAction;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/payments/response/SdkAction;-><init>()V

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

    invoke-virtual {v0}, Lcom/adyen/checkout/components/model/payments/response/Action;->getPaymentMethodType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/adyen/checkout/components/model/payments/response/SdkAction$1;->getSdkDataSerializer(Ljava/lang/String;)Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    move-result-object v1

    const-string v2, "sdkData"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-static {p1, v1}, Lcom/adyen/checkout/core/model/ModelUtils;->deserializeOpt(Lorg/json/JSONObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lcom/adyen/checkout/core/model/ModelObject;

    move-result-object p1

    check-cast p1, Lcom/adyen/checkout/components/model/payments/response/SdkData;

    invoke-virtual {v0, p1}, Lcom/adyen/checkout/components/model/payments/response/SdkAction;->setSdkData(Lcom/adyen/checkout/components/model/payments/response/SdkData;)V

    return-object v0
.end method

.method public bridge synthetic deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/core/model/ModelObject;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/model/payments/response/SdkAction$1;->deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/model/payments/response/SdkAction;

    move-result-object p1

    return-object p1
.end method

.method public serialize(Lcom/adyen/checkout/components/model/payments/response/SdkAction;)Lorg/json/JSONObject;
    .locals 3

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

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/response/Action;->getPaymentMethodType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/adyen/checkout/components/model/payments/response/SdkAction$1;->getSdkDataSerializer(Ljava/lang/String;)Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/response/SdkAction;->getSdkData()Lcom/adyen/checkout/components/model/payments/response/SdkData;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v2, "sdkData"

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/response/SdkAction;->getSdkData()Lcom/adyen/checkout/components/model/payments/response/SdkData;

    move-result-object p1

    invoke-static {p1, v1}, Lcom/adyen/checkout/core/model/ModelUtils;->serializeOpt(Lcom/adyen/checkout/core/model/ModelObject;Lcom/adyen/checkout/core/model/ModelObject$Serializer;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/adyen/checkout/core/exception/ModelSerializationException;

    const-class v1, Lcom/adyen/checkout/components/model/payments/response/SdkAction;

    invoke-direct {v0, v1, p1}, Lcom/adyen/checkout/core/exception/ModelSerializationException;-><init>(Ljava/lang/Class;Lorg/json/JSONException;)V

    throw v0
.end method

.method public bridge synthetic serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;
    .locals 0

    check-cast p1, Lcom/adyen/checkout/components/model/payments/response/SdkAction;

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/model/payments/response/SdkAction$1;->serialize(Lcom/adyen/checkout/components/model/payments/response/SdkAction;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
