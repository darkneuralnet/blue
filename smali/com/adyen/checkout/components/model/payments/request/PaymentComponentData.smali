.class public Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;
.super Lcom/adyen/checkout/core/model/ModelObject;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<PaymentMethodDetailsT:",
        "Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;",
        ">",
        "Lcom/adyen/checkout/core/model/ModelObject;"
    }
.end annotation


# static fields
.field private static final AMOUNT:Ljava/lang/String; = "amount"

.field private static final BILLING_ADDRESS:Ljava/lang/String; = "billingAddress"

.field public static final CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Creator<",
            "Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;",
            ">;"
        }
    .end annotation
.end field

.field private static final DATE_OF_BIRTH:Ljava/lang/String; = "dateOfBirth"

.field private static final DELIVERY_ADDRESS:Ljava/lang/String; = "deliveryAddress"

.field private static final PAYMENT_METHOD:Ljava/lang/String; = "paymentMethod"

.field public static final SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;",
            ">;"
        }
    .end annotation
.end field

.field private static final SHOPPER_EMAIL:Ljava/lang/String; = "shopperEmail"

.field private static final SHOPPER_NAME:Ljava/lang/String; = "shopperName"

.field private static final SHOPPER_REFERENCE:Ljava/lang/String; = "shopperReference"

.field private static final SOCIAL_SECURITY_NUMBER:Ljava/lang/String; = "socialSecurityNumber"

.field private static final STORE_PAYMENT_METHOD:Ljava/lang/String; = "storePaymentMethod"

.field private static final TELEPHONE_NUMBER:Ljava/lang/String; = "telephoneNumber"


# instance fields
.field private amount:Lcom/adyen/checkout/components/model/payments/Amount;

.field private billingAddress:Lcom/adyen/checkout/components/model/payments/request/Address;

.field private dateOfBirth:Ljava/lang/String;

.field private deliveryAddress:Lcom/adyen/checkout/components/model/payments/request/Address;

.field private paymentMethod:Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TPaymentMethodDetailsT;"
        }
    .end annotation
.end field

.field private shopperEmail:Ljava/lang/String;

.field private shopperName:Lcom/adyen/checkout/components/model/payments/request/ShopperName;

.field private shopperReference:Ljava/lang/String;

.field private socialSecurityNumber:Ljava/lang/String;

.field private storePaymentMethod:Z

.field private telephoneNumber:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/adyen/checkout/core/model/ModelObject$Creator;

    const-class v1, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;

    invoke-direct {v0, v1}, Lcom/adyen/checkout/core/model/ModelObject$Creator;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;

    new-instance v0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData$1;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData$1;-><init>()V

    sput-object v0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/adyen/checkout/core/model/ModelObject;-><init>()V

    return-void
.end method


# virtual methods
.method public getAmount()Lcom/adyen/checkout/components/model/payments/Amount;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->amount:Lcom/adyen/checkout/components/model/payments/Amount;

    return-object v0
.end method

.method public getBillingAddress()Lcom/adyen/checkout/components/model/payments/request/Address;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->billingAddress:Lcom/adyen/checkout/components/model/payments/request/Address;

    return-object v0
.end method

.method public getDateOfBirth()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->dateOfBirth:Ljava/lang/String;

    return-object v0
.end method

.method public getDeliveryAddress()Lcom/adyen/checkout/components/model/payments/request/Address;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->deliveryAddress:Lcom/adyen/checkout/components/model/payments/request/Address;

    return-object v0
.end method

.method public getPaymentMethod()Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TPaymentMethodDetailsT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->paymentMethod:Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;

    return-object v0
.end method

.method public getShopperEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->shopperEmail:Ljava/lang/String;

    return-object v0
.end method

.method public getShopperName()Lcom/adyen/checkout/components/model/payments/request/ShopperName;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->shopperName:Lcom/adyen/checkout/components/model/payments/request/ShopperName;

    return-object v0
.end method

.method public getShopperReference()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->shopperReference:Ljava/lang/String;

    return-object v0
.end method

.method public getSocialSecurityNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->socialSecurityNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getTelephoneNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->telephoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public isStorePaymentMethodEnable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->storePaymentMethod:Z

    return v0
.end method

.method public setAmount(Lcom/adyen/checkout/components/model/payments/Amount;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->amount:Lcom/adyen/checkout/components/model/payments/Amount;

    return-void
.end method

.method public setBillingAddress(Lcom/adyen/checkout/components/model/payments/request/Address;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->billingAddress:Lcom/adyen/checkout/components/model/payments/request/Address;

    return-void
.end method

.method public setDateOfBirth(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->dateOfBirth:Ljava/lang/String;

    return-void
.end method

.method public setDeliveryAddress(Lcom/adyen/checkout/components/model/payments/request/Address;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->deliveryAddress:Lcom/adyen/checkout/components/model/payments/request/Address;

    return-void
.end method

.method public setPaymentMethod(Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TPaymentMethodDetailsT;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->paymentMethod:Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;

    return-void
.end method

.method public setShopperEmail(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->shopperEmail:Ljava/lang/String;

    return-void
.end method

.method public setShopperName(Lcom/adyen/checkout/components/model/payments/request/ShopperName;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->shopperName:Lcom/adyen/checkout/components/model/payments/request/ShopperName;

    return-void
.end method

.method public setShopperReference(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->shopperReference:Ljava/lang/String;

    return-void
.end method

.method public setSocialSecurityNumber(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->socialSecurityNumber:Ljava/lang/String;

    return-void
.end method

.method public setStorePaymentMethod(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->storePaymentMethod:Z

    return-void
.end method

.method public setTelephoneNumber(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->telephoneNumber:Ljava/lang/String;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    sget-object p2, Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-interface {p2, p0}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/adyen/checkout/core/model/JsonUtils;->writeToParcel(Landroid/os/Parcel;Lorg/json/JSONObject;)V

    return-void
.end method
