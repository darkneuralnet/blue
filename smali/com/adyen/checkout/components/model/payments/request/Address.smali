.class public Lcom/adyen/checkout/components/model/payments/request/Address;
.super Lcom/adyen/checkout/core/model/ModelObject;
.source "SourceFile"


# static fields
.field public static final ADDRESS_COUNTRY_NULL_PLACEHOLDER:Ljava/lang/String; = "ZZ"

.field public static final ADDRESS_NULL_PLACEHOLDER:Ljava/lang/String; = "null"

.field private static final CITY:Ljava/lang/String; = "city"

.field private static final COUNTRY:Ljava/lang/String; = "country"

.field public static final CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Creator<",
            "Lcom/adyen/checkout/components/model/payments/request/Address;",
            ">;"
        }
    .end annotation
.end field

.field private static final HOUSE_NUMBER_OR_NAME:Ljava/lang/String; = "houseNumberOrName"

.field private static final POSTAL_CODE:Ljava/lang/String; = "postalCode"

.field public static final SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "Lcom/adyen/checkout/components/model/payments/request/Address;",
            ">;"
        }
    .end annotation
.end field

.field private static final STATE_OR_PROVINCE:Ljava/lang/String; = "stateOrProvince"

.field private static final STREET:Ljava/lang/String; = "street"


# instance fields
.field private city:Ljava/lang/String;

.field private country:Ljava/lang/String;

.field private houseNumberOrName:Ljava/lang/String;

.field private postalCode:Ljava/lang/String;

.field private stateOrProvince:Ljava/lang/String;

.field private street:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/adyen/checkout/core/model/ModelObject$Creator;

    const-class v1, Lcom/adyen/checkout/components/model/payments/request/Address;

    invoke-direct {v0, v1}, Lcom/adyen/checkout/core/model/ModelObject$Creator;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/adyen/checkout/components/model/payments/request/Address;->CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;

    new-instance v0, Lcom/adyen/checkout/components/model/payments/request/Address$1;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/payments/request/Address$1;-><init>()V

    sput-object v0, Lcom/adyen/checkout/components/model/payments/request/Address;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/adyen/checkout/core/model/ModelObject;-><init>()V

    return-void
.end method


# virtual methods
.method public getCity()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/Address;->city:Ljava/lang/String;

    return-object v0
.end method

.method public getCountry()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/Address;->country:Ljava/lang/String;

    return-object v0
.end method

.method public getHouseNumberOrName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/Address;->houseNumberOrName:Ljava/lang/String;

    return-object v0
.end method

.method public getPostalCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/Address;->postalCode:Ljava/lang/String;

    return-object v0
.end method

.method public getStateOrProvince()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/Address;->stateOrProvince:Ljava/lang/String;

    return-object v0
.end method

.method public getStreet()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/Address;->street:Ljava/lang/String;

    return-object v0
.end method

.method public setCity(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/Address;->city:Ljava/lang/String;

    return-void
.end method

.method public setCountry(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/Address;->country:Ljava/lang/String;

    return-void
.end method

.method public setHouseNumberOrName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/Address;->houseNumberOrName:Ljava/lang/String;

    return-void
.end method

.method public setPostalCode(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/Address;->postalCode:Ljava/lang/String;

    return-void
.end method

.method public setStateOrProvince(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/Address;->stateOrProvince:Ljava/lang/String;

    return-void
.end method

.method public setStreet(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/Address;->street:Ljava/lang/String;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    sget-object p2, Lcom/adyen/checkout/components/model/payments/request/Address;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-interface {p2, p0}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/adyen/checkout/core/model/JsonUtils;->writeToParcel(Landroid/os/Parcel;Lorg/json/JSONObject;)V

    return-void
.end method
