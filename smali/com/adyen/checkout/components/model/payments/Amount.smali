.class public Lcom/adyen/checkout/components/model/payments/Amount;
.super Lcom/adyen/checkout/core/model/ModelObject;
.source "SourceFile"


# static fields
.field public static final CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Creator<",
            "Lcom/adyen/checkout/components/model/payments/Amount;",
            ">;"
        }
    .end annotation
.end field

.field private static final CURRENCY:Ljava/lang/String; = "currency"

.field public static final EMPTY:Lcom/adyen/checkout/components/model/payments/Amount;

.field private static final EMPTY_CURRENCY:Ljava/lang/String; = "NONE"

.field private static final EMPTY_VALUE:I = -0x1

.field public static final SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "Lcom/adyen/checkout/components/model/payments/Amount;",
            ">;"
        }
    .end annotation
.end field

.field private static final VALUE:Ljava/lang/String; = "value"


# instance fields
.field private currency:Ljava/lang/String;

.field private value:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/adyen/checkout/core/model/ModelObject$Creator;

    const-class v1, Lcom/adyen/checkout/components/model/payments/Amount;

    invoke-direct {v0, v1}, Lcom/adyen/checkout/core/model/ModelObject$Creator;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/adyen/checkout/components/model/payments/Amount;->CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;

    new-instance v0, Lcom/adyen/checkout/components/model/payments/Amount;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/payments/Amount;-><init>()V

    sput-object v0, Lcom/adyen/checkout/components/model/payments/Amount;->EMPTY:Lcom/adyen/checkout/components/model/payments/Amount;

    const-string v1, "NONE"

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/Amount;->setCurrency(Ljava/lang/String;)V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/adyen/checkout/components/model/payments/Amount;->setValue(I)V

    new-instance v0, Lcom/adyen/checkout/components/model/payments/Amount$1;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/payments/Amount$1;-><init>()V

    sput-object v0, Lcom/adyen/checkout/components/model/payments/Amount;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/adyen/checkout/core/model/ModelObject;-><init>()V

    return-void
.end method


# virtual methods
.method public getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/Amount;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()I
    .locals 1

    iget v0, p0, Lcom/adyen/checkout/components/model/payments/Amount;->value:I

    return v0
.end method

.method public isEmpty()Z
    .locals 2

    const-string v0, "NONE"

    iget-object v1, p0, Lcom/adyen/checkout/components/model/payments/Amount;->currency:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/adyen/checkout/components/model/payments/Amount;->value:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public setCurrency(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/Amount;->currency:Ljava/lang/String;

    return-void
.end method

.method public setValue(I)V
    .locals 0

    iput p1, p0, Lcom/adyen/checkout/components/model/payments/Amount;->value:I

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    sget-object p2, Lcom/adyen/checkout/components/model/payments/Amount;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-interface {p2, p0}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/adyen/checkout/core/model/JsonUtils;->writeToParcel(Landroid/os/Parcel;Lorg/json/JSONObject;)V

    return-void
.end method
