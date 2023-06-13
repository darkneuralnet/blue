.class public Lcom/adyen/checkout/components/model/payments/response/VoucherAction;
.super Lcom/adyen/checkout/components/model/payments/response/Action;
.source "SourceFile"


# static fields
.field public static final ACTION_TYPE:Ljava/lang/String; = "voucher"

.field private static final ALTERNATIVE_REFERENCE:Ljava/lang/String; = "alternativeReference"

.field public static final CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Creator<",
            "Lcom/adyen/checkout/components/model/payments/response/VoucherAction;",
            ">;"
        }
    .end annotation
.end field

.field private static final EXPIRES_AT:Ljava/lang/String; = "expiresAt"

.field private static final INITIAL_AMOUNT:Ljava/lang/String; = "initialAmount"

.field private static final ISSUER:Ljava/lang/String; = "issuer"

.field private static final MERCHANT_NAME:Ljava/lang/String; = "merchantName"

.field private static final REFERENCE:Ljava/lang/String; = "reference"

.field public static final SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "Lcom/adyen/checkout/components/model/payments/response/VoucherAction;",
            ">;"
        }
    .end annotation
.end field

.field private static final SURCHARGE:Ljava/lang/String; = "surcharge"

.field private static final TOTAL_AMOUNT:Ljava/lang/String; = "totalAmount"


# instance fields
.field private alternativeReference:Ljava/lang/String;

.field private expiresAt:Ljava/lang/String;

.field private initialAmount:Lcom/adyen/checkout/components/model/payments/Amount;

.field private issuer:Ljava/lang/String;

.field private merchantName:Ljava/lang/String;

.field private reference:Ljava/lang/String;

.field private surcharge:Lcom/adyen/checkout/components/model/payments/Amount;

.field private totalAmount:Lcom/adyen/checkout/components/model/payments/Amount;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/adyen/checkout/core/model/ModelObject$Creator;

    const-class v1, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;

    invoke-direct {v0, v1}, Lcom/adyen/checkout/core/model/ModelObject$Creator;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;

    new-instance v0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction$1;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/payments/response/VoucherAction$1;-><init>()V

    sput-object v0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/adyen/checkout/components/model/payments/response/Action;-><init>()V

    return-void
.end method


# virtual methods
.method public getAlternativeReference()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->alternativeReference:Ljava/lang/String;

    return-object v0
.end method

.method public getExpiresAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->expiresAt:Ljava/lang/String;

    return-object v0
.end method

.method public getInitialAmount()Lcom/adyen/checkout/components/model/payments/Amount;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->initialAmount:Lcom/adyen/checkout/components/model/payments/Amount;

    return-object v0
.end method

.method public getIssuer()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->issuer:Ljava/lang/String;

    return-object v0
.end method

.method public getMerchantName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public getReference()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->reference:Ljava/lang/String;

    return-object v0
.end method

.method public getSurcharge()Lcom/adyen/checkout/components/model/payments/Amount;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->surcharge:Lcom/adyen/checkout/components/model/payments/Amount;

    return-object v0
.end method

.method public getTotalAmount()Lcom/adyen/checkout/components/model/payments/Amount;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->totalAmount:Lcom/adyen/checkout/components/model/payments/Amount;

    return-object v0
.end method

.method public setAlternativeReference(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->alternativeReference:Ljava/lang/String;

    return-void
.end method

.method public setExpiresAt(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->expiresAt:Ljava/lang/String;

    return-void
.end method

.method public setInitialAmount(Lcom/adyen/checkout/components/model/payments/Amount;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->initialAmount:Lcom/adyen/checkout/components/model/payments/Amount;

    return-void
.end method

.method public setIssuer(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->issuer:Ljava/lang/String;

    return-void
.end method

.method public setMerchantName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->merchantName:Ljava/lang/String;

    return-void
.end method

.method public setReference(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->reference:Ljava/lang/String;

    return-void
.end method

.method public setSurcharge(Lcom/adyen/checkout/components/model/payments/Amount;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->surcharge:Lcom/adyen/checkout/components/model/payments/Amount;

    return-void
.end method

.method public setTotalAmount(Lcom/adyen/checkout/components/model/payments/Amount;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->totalAmount:Lcom/adyen/checkout/components/model/payments/Amount;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    sget-object p2, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-interface {p2, p0}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/adyen/checkout/core/model/JsonUtils;->writeToParcel(Landroid/os/Parcel;Lorg/json/JSONObject;)V

    return-void
.end method
