.class public Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;
.super Lcom/adyen/checkout/core/model/ModelObject;
.source "SourceFile"


# static fields
.field private static final BRAND:Ljava/lang/String; = "brand"

.field private static final BRANDS:Ljava/lang/String; = "brands"

.field private static final CONFIGURATION:Ljava/lang/String; = "configuration"

.field public static final CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Creator<",
            "Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private static final DETAILS:Ljava/lang/String; = "details"

.field private static final FUNDING_SOURCE:Ljava/lang/String; = "fundingSource"

.field private static final ISSUERS:Ljava/lang/String; = "issuers"

.field private static final NAME:Ljava/lang/String; = "name"

.field public static final SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private static final TYPE:Ljava/lang/String; = "type"


# instance fields
.field private brand:Ljava/lang/String;

.field private brands:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private configuration:Lcom/adyen/checkout/components/model/paymentmethods/Configuration;

.field private details:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/adyen/checkout/components/model/paymentmethods/InputDetail;",
            ">;"
        }
    .end annotation
.end field

.field private fundingSource:Ljava/lang/String;

.field private issuers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/adyen/checkout/components/model/paymentmethods/Issuer;",
            ">;"
        }
    .end annotation
.end field

.field private name:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/adyen/checkout/core/model/ModelObject$Creator;

    const-class v1, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;

    invoke-direct {v0, v1}, Lcom/adyen/checkout/core/model/ModelObject$Creator;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;

    new-instance v0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod$1;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod$1;-><init>()V

    sput-object v0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/adyen/checkout/core/model/ModelObject;-><init>()V

    return-void
.end method


# virtual methods
.method public getBrand()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->brand:Ljava/lang/String;

    return-object v0
.end method

.method public getBrands()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->brands:Ljava/util/List;

    return-object v0
.end method

.method public getConfiguration()Lcom/adyen/checkout/components/model/paymentmethods/Configuration;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->configuration:Lcom/adyen/checkout/components/model/paymentmethods/Configuration;

    return-object v0
.end method

.method public getDetails()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/adyen/checkout/components/model/paymentmethods/InputDetail;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->details:Ljava/util/List;

    return-object v0
.end method

.method public getFundingSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->fundingSource:Ljava/lang/String;

    return-object v0
.end method

.method public getIssuers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/adyen/checkout/components/model/paymentmethods/Issuer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->issuers:Ljava/util/List;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->type:Ljava/lang/String;

    return-object v0
.end method

.method public setBrand(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->brand:Ljava/lang/String;

    return-void
.end method

.method public setBrands(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->brands:Ljava/util/List;

    return-void
.end method

.method public setConfiguration(Lcom/adyen/checkout/components/model/paymentmethods/Configuration;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->configuration:Lcom/adyen/checkout/components/model/paymentmethods/Configuration;

    return-void
.end method

.method public setDetails(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/adyen/checkout/components/model/paymentmethods/InputDetail;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->details:Ljava/util/List;

    return-void
.end method

.method public setFundingSource(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->fundingSource:Ljava/lang/String;

    return-void
.end method

.method public setIssuers(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/adyen/checkout/components/model/paymentmethods/Issuer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->issuers:Ljava/util/List;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->name:Ljava/lang/String;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->type:Ljava/lang/String;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    sget-object p2, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-interface {p2, p0}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/adyen/checkout/core/model/JsonUtils;->writeToParcel(Landroid/os/Parcel;Lorg/json/JSONObject;)V

    return-void
.end method
