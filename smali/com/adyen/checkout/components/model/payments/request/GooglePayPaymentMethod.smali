.class public Lcom/adyen/checkout/components/model/payments/request/GooglePayPaymentMethod;
.super Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;
.source "SourceFile"


# static fields
.field public static final CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Creator<",
            "Lcom/adyen/checkout/components/model/payments/request/GooglePayPaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private static final GOOGLE_PAY_CARD_NETWORK:Ljava/lang/String; = "googlePayCardNetwork"

.field private static final GOOGLE_PAY_TOKEN:Ljava/lang/String; = "googlePayToken"

.field public static final SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "Lcom/adyen/checkout/components/model/payments/request/GooglePayPaymentMethod;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private googlePayCardNetwork:Ljava/lang/String;

.field private googlePayToken:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/adyen/checkout/core/model/ModelObject$Creator;

    const-class v1, Lcom/adyen/checkout/components/model/payments/request/GooglePayPaymentMethod;

    invoke-direct {v0, v1}, Lcom/adyen/checkout/core/model/ModelObject$Creator;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/adyen/checkout/components/model/payments/request/GooglePayPaymentMethod;->CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;

    new-instance v0, Lcom/adyen/checkout/components/model/payments/request/GooglePayPaymentMethod$1;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/payments/request/GooglePayPaymentMethod$1;-><init>()V

    sput-object v0, Lcom/adyen/checkout/components/model/payments/request/GooglePayPaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;-><init>()V

    return-void
.end method


# virtual methods
.method public getGooglePayCardNetwork()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/GooglePayPaymentMethod;->googlePayCardNetwork:Ljava/lang/String;

    return-object v0
.end method

.method public getGooglePayToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/GooglePayPaymentMethod;->googlePayToken:Ljava/lang/String;

    return-object v0
.end method

.method public setGooglePayCardNetwork(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/GooglePayPaymentMethod;->googlePayCardNetwork:Ljava/lang/String;

    return-void
.end method

.method public setGooglePayToken(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/GooglePayPaymentMethod;->googlePayToken:Ljava/lang/String;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    sget-object p2, Lcom/adyen/checkout/components/model/payments/request/GooglePayPaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-interface {p2, p0}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/adyen/checkout/core/model/JsonUtils;->writeToParcel(Landroid/os/Parcel;Lorg/json/JSONObject;)V

    return-void
.end method
