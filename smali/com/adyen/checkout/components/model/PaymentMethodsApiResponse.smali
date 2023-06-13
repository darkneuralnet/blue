.class public final Lcom/adyen/checkout/components/model/PaymentMethodsApiResponse;
.super Lcom/adyen/checkout/core/model/ModelObject;
.source "SourceFile"


# static fields
.field public static final CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Creator<",
            "Lcom/adyen/checkout/components/model/PaymentMethodsApiResponse;",
            ">;"
        }
    .end annotation
.end field

.field private static final PAYMENT_METHODS:Ljava/lang/String; = "paymentMethods"

.field public static final SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "Lcom/adyen/checkout/components/model/PaymentMethodsApiResponse;",
            ">;"
        }
    .end annotation
.end field

.field private static final STORED_PAYMENT_METHODS:Ljava/lang/String; = "storedPaymentMethods"


# instance fields
.field private paymentMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private storedPaymentMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/adyen/checkout/core/model/ModelObject$Creator;

    const-class v1, Lcom/adyen/checkout/components/model/PaymentMethodsApiResponse;

    invoke-direct {v0, v1}, Lcom/adyen/checkout/core/model/ModelObject$Creator;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/adyen/checkout/components/model/PaymentMethodsApiResponse;->CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;

    new-instance v0, Lcom/adyen/checkout/components/model/PaymentMethodsApiResponse$1;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/PaymentMethodsApiResponse$1;-><init>()V

    sput-object v0, Lcom/adyen/checkout/components/model/PaymentMethodsApiResponse;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/adyen/checkout/core/model/ModelObject;-><init>()V

    return-void
.end method


# virtual methods
.method public getPaymentMethods()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/adyen/checkout/components/model/PaymentMethodsApiResponse;->paymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public getStoredPaymentMethods()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/adyen/checkout/components/model/PaymentMethodsApiResponse;->storedPaymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public setPaymentMethods(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/adyen/checkout/components/model/PaymentMethodsApiResponse;->paymentMethods:Ljava/util/List;

    return-void
.end method

.method public setStoredPaymentMethods(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/adyen/checkout/components/model/PaymentMethodsApiResponse;->storedPaymentMethods:Ljava/util/List;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    sget-object p2, Lcom/adyen/checkout/components/model/PaymentMethodsApiResponse;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-interface {p2, p0}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/adyen/checkout/core/model/JsonUtils;->writeToParcel(Landroid/os/Parcel;Lorg/json/JSONObject;)V

    return-void
.end method
