.class public abstract Lcom/adyen/checkout/components/model/payments/response/Action;
.super Lcom/adyen/checkout/core/model/ModelObject;
.source "SourceFile"


# static fields
.field public static final PAYMENT_DATA:Ljava/lang/String; = "paymentData"

.field public static final PAYMENT_METHOD_TYPE:Ljava/lang/String; = "paymentMethodType"

.field public static final SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "Lcom/adyen/checkout/components/model/payments/response/Action;",
            ">;"
        }
    .end annotation
.end field

.field public static final TYPE:Ljava/lang/String; = "type"


# instance fields
.field private paymentData:Ljava/lang/String;

.field private paymentMethodType:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/adyen/checkout/components/model/payments/response/Action$1;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/payments/response/Action$1;-><init>()V

    sput-object v0, Lcom/adyen/checkout/components/model/payments/response/Action;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/adyen/checkout/core/model/ModelObject;-><init>()V

    return-void
.end method

.method public static getChildSerializer(Ljava/lang/String;)Lcom/adyen/checkout/core/model/ModelObject$Serializer;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "+",
            "Lcom/adyen/checkout/components/model/payments/response/Action;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "threeDS2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x7

    goto :goto_0

    :sswitch_1
    const-string v0, "threeDS2Fingerprint"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x6

    goto :goto_0

    :sswitch_2
    const-string v0, "threeDS2Challenge"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x5

    goto :goto_0

    :sswitch_3
    const-string v0, "voucher"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_4
    const-string v0, "await"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_5
    const-string v0, "sdk"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_6
    const-string v0, "redirect"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_7
    const-string v0, "qrCode"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    new-instance v0, Lcom/adyen/checkout/core/exception/CheckoutException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Action type not found - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/adyen/checkout/core/exception/CheckoutException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object p0, Lcom/adyen/checkout/components/model/payments/response/Threeds2Action;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    :pswitch_1
    sget-object p0, Lcom/adyen/checkout/components/model/payments/response/Threeds2FingerprintAction;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    :pswitch_2
    sget-object p0, Lcom/adyen/checkout/components/model/payments/response/Threeds2ChallengeAction;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    :pswitch_3
    sget-object p0, Lcom/adyen/checkout/components/model/payments/response/VoucherAction;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    :pswitch_4
    sget-object p0, Lcom/adyen/checkout/components/model/payments/response/AwaitAction;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    :pswitch_5
    sget-object p0, Lcom/adyen/checkout/components/model/payments/response/SdkAction;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    :pswitch_6
    sget-object p0, Lcom/adyen/checkout/components/model/payments/response/RedirectAction;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    :pswitch_7
    sget-object p0, Lcom/adyen/checkout/components/model/payments/response/QrCodeAction;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x38c5c852 -> :sswitch_7
        -0x2e430824 -> :sswitch_6
        0x1bc3a -> :sswitch_5
        0x58e7956 -> :sswitch_4
        0x26288eae -> :sswitch_3
        0x3cdcbebe -> :sswitch_2
        0x4fb8007f -> :sswitch_1
        0x57d71725 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public getPaymentData()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/response/Action;->paymentData:Ljava/lang/String;

    return-object v0
.end method

.method public getPaymentMethodType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/response/Action;->paymentMethodType:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/response/Action;->type:Ljava/lang/String;

    return-object v0
.end method

.method public setPaymentData(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/response/Action;->paymentData:Ljava/lang/String;

    return-void
.end method

.method public setPaymentMethodType(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/response/Action;->paymentMethodType:Ljava/lang/String;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/response/Action;->type:Ljava/lang/String;

    return-void
.end method
