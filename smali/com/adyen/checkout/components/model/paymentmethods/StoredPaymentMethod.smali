.class public Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;
.super Lcom/adyen/checkout/core/model/ModelObject;
.source "SourceFile"


# static fields
.field private static final BRAND:Ljava/lang/String; = "brand"

.field public static final CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Creator<",
            "Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private static final ECOMMERCE:Ljava/lang/String; = "Ecommerce"

.field private static final EXPIRY_MONTH:Ljava/lang/String; = "expiryMonth"

.field private static final EXPIRY_YEAR:Ljava/lang/String; = "expiryYear"

.field private static final HOLDER_NAME:Ljava/lang/String; = "holderName"

.field private static final ID:Ljava/lang/String; = "id"

.field private static final LAST_FOUR:Ljava/lang/String; = "lastFour"

.field private static final NAME:Ljava/lang/String; = "name"

.field public static final SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private static final SHOPPER_EMAIL:Ljava/lang/String; = "shopperEmail"

.field private static final SUPPORTED_SHOPPER_INTERACTIONS:Ljava/lang/String; = "supportedShopperInteractions"

.field private static final TYPE:Ljava/lang/String; = "type"


# instance fields
.field private brand:Ljava/lang/String;

.field private expiryMonth:Ljava/lang/String;

.field private expiryYear:Ljava/lang/String;

.field private holderName:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private lastFour:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private shopperEmail:Ljava/lang/String;

.field private supportedShopperInteractions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private type:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/adyen/checkout/core/model/ModelObject$Creator;

    const-class v1, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;

    invoke-direct {v0, v1}, Lcom/adyen/checkout/core/model/ModelObject$Creator;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;

    new-instance v0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod$1;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod$1;-><init>()V

    sput-object v0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/adyen/checkout/core/model/ModelObject;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->supportedShopperInteractions:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getBrand()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->brand:Ljava/lang/String;

    return-object v0
.end method

.method public getExpiryMonth()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->expiryMonth:Ljava/lang/String;

    return-object v0
.end method

.method public getExpiryYear()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->expiryYear:Ljava/lang/String;

    return-object v0
.end method

.method public getHolderName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->holderName:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getLastFour()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->lastFour:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getShopperEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->shopperEmail:Ljava/lang/String;

    return-object v0
.end method

.method public getSupportedShopperInteractions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->supportedShopperInteractions:Ljava/util/List;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->type:Ljava/lang/String;

    return-object v0
.end method

.method public isEcommerce()Z
    .locals 2

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->supportedShopperInteractions:Ljava/util/List;

    const-string v1, "Ecommerce"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public setBrand(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->brand:Ljava/lang/String;

    return-void
.end method

.method public setExpiryMonth(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->expiryMonth:Ljava/lang/String;

    return-void
.end method

.method public setExpiryYear(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->expiryYear:Ljava/lang/String;

    return-void
.end method

.method public setHolderName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->holderName:Ljava/lang/String;

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->id:Ljava/lang/String;

    return-void
.end method

.method public setLastFour(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->lastFour:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->name:Ljava/lang/String;

    return-void
.end method

.method public setShopperEmail(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->shopperEmail:Ljava/lang/String;

    return-void
.end method

.method public setSupportedShopperInteractions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->supportedShopperInteractions:Ljava/util/List;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->type:Ljava/lang/String;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    sget-object p2, Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-interface {p2, p0}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/adyen/checkout/core/model/JsonUtils;->writeToParcel(Landroid/os/Parcel;Lorg/json/JSONObject;)V

    return-void
.end method
