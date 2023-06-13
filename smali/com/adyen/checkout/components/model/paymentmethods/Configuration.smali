.class public Lcom/adyen/checkout/components/model/paymentmethods/Configuration;
.super Lcom/adyen/checkout/core/model/ModelObject;
.source "SourceFile"


# static fields
.field public static final CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Creator<",
            "Lcom/adyen/checkout/components/model/paymentmethods/Configuration;",
            ">;"
        }
    .end annotation
.end field

.field private static final GATEWAY_MERCHANT_ID:Ljava/lang/String; = "gatewayMerchantId"

.field private static final INTENT:Ljava/lang/String; = "intent"

.field private static final KOREAN_AUTHENTICATION_REQUIRED:Ljava/lang/String; = "koreanAuthenticationRequired"

.field private static final MERCHANT_ID:Ljava/lang/String; = "merchantId"

.field public static final SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "Lcom/adyen/checkout/components/model/paymentmethods/Configuration;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private gatewayMerchantId:Ljava/lang/String;

.field private intent:Ljava/lang/String;

.field private koreanAuthenticationRequired:Ljava/lang/String;

.field private merchantId:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/adyen/checkout/core/model/ModelObject$Creator;

    const-class v1, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;

    invoke-direct {v0, v1}, Lcom/adyen/checkout/core/model/ModelObject$Creator;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;

    new-instance v0, Lcom/adyen/checkout/components/model/paymentmethods/Configuration$1;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/paymentmethods/Configuration$1;-><init>()V

    sput-object v0, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/adyen/checkout/core/model/ModelObject;-><init>()V

    return-void
.end method


# virtual methods
.method public getGatewayMerchantId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->gatewayMerchantId:Ljava/lang/String;

    return-object v0
.end method

.method public getIntent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->intent:Ljava/lang/String;

    return-object v0
.end method

.method public getKoreanAuthenticationRequired()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->koreanAuthenticationRequired:Ljava/lang/String;

    return-object v0
.end method

.method public getMerchantId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->merchantId:Ljava/lang/String;

    return-object v0
.end method

.method public setGatewayMerchantId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->gatewayMerchantId:Ljava/lang/String;

    return-void
.end method

.method public setIntent(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->intent:Ljava/lang/String;

    return-void
.end method

.method public setKoreanAuthenticationRequired(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->koreanAuthenticationRequired:Ljava/lang/String;

    return-void
.end method

.method public setMerchantId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->merchantId:Ljava/lang/String;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    sget-object p2, Lcom/adyen/checkout/components/model/paymentmethods/Configuration;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-interface {p2, p0}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/adyen/checkout/core/model/JsonUtils;->writeToParcel(Landroid/os/Parcel;Lorg/json/JSONObject;)V

    return-void
.end method
