.class final Lcom/adyen/checkout/components/model/payments/response/Action$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/adyen/checkout/core/model/ModelObject$Serializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adyen/checkout/components/model/payments/response/Action;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
        "Lcom/adyen/checkout/components/model/payments/response/Action;",
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
.method public deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/model/payments/response/Action;
    .locals 2

    const-string v0, "type"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/adyen/checkout/components/model/payments/response/Action;->getChildSerializer(Ljava/lang/String;)Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/core/model/ModelObject;

    move-result-object p1

    check-cast p1, Lcom/adyen/checkout/components/model/payments/response/Action;

    return-object p1

    :cond_0
    new-instance p1, Lcom/adyen/checkout/core/exception/CheckoutException;

    const-string v0, "Action type not found"

    invoke-direct {p1, v0}, Lcom/adyen/checkout/core/exception/CheckoutException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/core/model/ModelObject;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/model/payments/response/Action$1;->deserialize(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/model/payments/response/Action;

    move-result-object p1

    return-object p1
.end method

.method public serialize(Lcom/adyen/checkout/components/model/payments/response/Action;)Lorg/json/JSONObject;
    .locals 2

    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/payments/response/Action;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/adyen/checkout/components/model/payments/response/Action;->getChildSerializer(Ljava/lang/String;)Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/adyen/checkout/core/exception/CheckoutException;

    const-string v0, "Action type not found"

    invoke-direct {p1, v0}, Lcom/adyen/checkout/core/exception/CheckoutException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;
    .locals 0

    check-cast p1, Lcom/adyen/checkout/components/model/payments/response/Action;

    invoke-virtual {p0, p1}, Lcom/adyen/checkout/components/model/payments/response/Action$1;->serialize(Lcom/adyen/checkout/components/model/payments/response/Action;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
