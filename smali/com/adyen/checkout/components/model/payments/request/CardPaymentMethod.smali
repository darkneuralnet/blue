.class public final Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;
.super Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;
.source "SourceFile"


# static fields
.field public static final CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Creator<",
            "Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private static final ENCRYPTED_CARD_NUMBER:Ljava/lang/String; = "encryptedCardNumber"

.field private static final ENCRYPTED_EXPIRY_MONTH:Ljava/lang/String; = "encryptedExpiryMonth"

.field private static final ENCRYPTED_EXPIRY_YEAR:Ljava/lang/String; = "encryptedExpiryYear"

.field private static final ENCRYPTED_PASSWORD:Ljava/lang/String; = "encryptedPassword"

.field private static final ENCRYPTED_SECURITY_CODE:Ljava/lang/String; = "encryptedSecurityCode"

.field private static final HOLDER_NAME:Ljava/lang/String; = "holderName"

.field public static final PAYMENT_METHOD_TYPE:Ljava/lang/String; = "scheme"

.field public static final SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private static final STORED_PAYMENT_METHOD_ID:Ljava/lang/String; = "storedPaymentMethodId"

.field private static final TAX_NUMBER:Ljava/lang/String; = "taxNumber"


# instance fields
.field private encryptedCardNumber:Ljava/lang/String;

.field private encryptedExpiryMonth:Ljava/lang/String;

.field private encryptedExpiryYear:Ljava/lang/String;

.field private encryptedPassword:Ljava/lang/String;

.field private encryptedSecurityCode:Ljava/lang/String;

.field private holderName:Ljava/lang/String;

.field private storedPaymentMethodId:Ljava/lang/String;

.field private taxNumber:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/adyen/checkout/core/model/ModelObject$Creator;

    const-class v1, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;

    invoke-direct {v0, v1}, Lcom/adyen/checkout/core/model/ModelObject$Creator;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;

    new-instance v0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod$1;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod$1;-><init>()V

    sput-object v0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;-><init>()V

    return-void
.end method


# virtual methods
.method public getEncryptedCardNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->encryptedCardNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getEncryptedExpiryMonth()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->encryptedExpiryMonth:Ljava/lang/String;

    return-object v0
.end method

.method public getEncryptedExpiryYear()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->encryptedExpiryYear:Ljava/lang/String;

    return-object v0
.end method

.method public getEncryptedPassword()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->encryptedPassword:Ljava/lang/String;

    return-object v0
.end method

.method public getEncryptedSecurityCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->encryptedSecurityCode:Ljava/lang/String;

    return-object v0
.end method

.method public getHolderName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->holderName:Ljava/lang/String;

    return-object v0
.end method

.method public getStoredPaymentMethodId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->storedPaymentMethodId:Ljava/lang/String;

    return-object v0
.end method

.method public getTaxNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->taxNumber:Ljava/lang/String;

    return-object v0
.end method

.method public setEncryptedCardNumber(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->encryptedCardNumber:Ljava/lang/String;

    return-void
.end method

.method public setEncryptedExpiryMonth(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->encryptedExpiryMonth:Ljava/lang/String;

    return-void
.end method

.method public setEncryptedExpiryYear(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->encryptedExpiryYear:Ljava/lang/String;

    return-void
.end method

.method public setEncryptedPassword(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->encryptedPassword:Ljava/lang/String;

    return-void
.end method

.method public setEncryptedSecurityCode(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->encryptedSecurityCode:Ljava/lang/String;

    return-void
.end method

.method public setHolderName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->holderName:Ljava/lang/String;

    return-void
.end method

.method public setStoredPaymentMethodId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->storedPaymentMethodId:Ljava/lang/String;

    return-void
.end method

.method public setTaxNumber(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->taxNumber:Ljava/lang/String;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    sget-object p2, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-interface {p2, p0}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/adyen/checkout/core/model/JsonUtils;->writeToParcel(Landroid/os/Parcel;Lorg/json/JSONObject;)V

    return-void
.end method
