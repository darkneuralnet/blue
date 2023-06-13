.class public Lcom/adyen/checkout/components/model/payments/response/SdkAction;
.super Lcom/adyen/checkout/components/model/payments/response/Action;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<SdkDataT:",
        "Lcom/adyen/checkout/components/model/payments/response/SdkData;",
        ">",
        "Lcom/adyen/checkout/components/model/payments/response/Action;"
    }
.end annotation


# static fields
.field public static final ACTION_TYPE:Ljava/lang/String; = "sdk"

.field public static final CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Creator<",
            "Lcom/adyen/checkout/components/model/payments/response/SdkAction;",
            ">;"
        }
    .end annotation
.end field

.field private static final SDK_DATA:Ljava/lang/String; = "sdkData"

.field public static final SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "Lcom/adyen/checkout/components/model/payments/response/SdkAction;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private sdkData:Lcom/adyen/checkout/components/model/payments/response/SdkData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TSdkDataT;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/adyen/checkout/core/model/ModelObject$Creator;

    const-class v1, Lcom/adyen/checkout/components/model/payments/response/SdkAction;

    invoke-direct {v0, v1}, Lcom/adyen/checkout/core/model/ModelObject$Creator;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/adyen/checkout/components/model/payments/response/SdkAction;->CREATOR:Lcom/adyen/checkout/core/model/ModelObject$Creator;

    new-instance v0, Lcom/adyen/checkout/components/model/payments/response/SdkAction$1;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/payments/response/SdkAction$1;-><init>()V

    sput-object v0, Lcom/adyen/checkout/components/model/payments/response/SdkAction;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/adyen/checkout/components/model/payments/response/Action;-><init>()V

    return-void
.end method


# virtual methods
.method public getSdkData()Lcom/adyen/checkout/components/model/payments/response/SdkData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TSdkDataT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/response/SdkAction;->sdkData:Lcom/adyen/checkout/components/model/payments/response/SdkData;

    return-object v0
.end method

.method public setSdkData(Lcom/adyen/checkout/components/model/payments/response/SdkData;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TSdkDataT;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/response/SdkAction;->sdkData:Lcom/adyen/checkout/components/model/payments/response/SdkData;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    sget-object p2, Lcom/adyen/checkout/components/model/payments/response/SdkAction;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    invoke-interface {p2, p0}, Lcom/adyen/checkout/core/model/ModelObject$Serializer;->serialize(Lcom/adyen/checkout/core/model/ModelObject;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/adyen/checkout/core/model/JsonUtils;->writeToParcel(Landroid/os/Parcel;Lorg/json/JSONObject;)V

    return-void
.end method
