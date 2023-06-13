.class public abstract Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;
.super Lcom/adyen/checkout/core/model/ModelObject;
.source "SourceFile"


# static fields
.field public static final SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;",
            ">;"
        }
    .end annotation
.end field

.field public static final TYPE:Ljava/lang/String; = "type"


# instance fields
.field private type:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails$1;

    invoke-direct {v0}, Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails$1;-><init>()V

    sput-object v0, Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/adyen/checkout/core/model/ModelObject;-><init>()V

    return-void
.end method

.method public static getChildSerializer(Ljava/lang/String;)Lcom/adyen/checkout/core/model/ModelObject$Serializer;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/adyen/checkout/core/model/ModelObject$Serializer<",
            "+",
            "Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;",
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
    const-string v0, "openbanking_UK"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v1, 0xd

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "sepadirectdebit"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v1, 0xc

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "googlepay"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v1, 0xb

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "paywithgoogle"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v1, 0xa

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "molpay_ebanking_VN"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v1, 0x9

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "molpay_ebanking_TH"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v1, 0x8

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "mbway"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x7

    goto :goto_0

    :sswitch_7
    const-string v0, "ideal"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v1, 0x6

    goto :goto_0

    :sswitch_8
    const-string v0, "blik"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v1, 0x5

    goto :goto_0

    :sswitch_9
    const-string v0, "eps"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_0

    :cond_9
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_a
    const-string v0, "entercash"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto :goto_0

    :cond_a
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_b
    const-string v0, "scheme"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto :goto_0

    :cond_b
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_c
    const-string v0, "dotpay"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto :goto_0

    :cond_c
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_d
    const-string v0, "molpay_ebanking_fpx_MY"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto :goto_0

    :cond_d
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    sget-object p0, Lcom/adyen/checkout/components/model/payments/request/GenericPaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    :pswitch_0
    sget-object p0, Lcom/adyen/checkout/components/model/payments/request/OpenBankingPaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    :pswitch_1
    sget-object p0, Lcom/adyen/checkout/components/model/payments/request/SepaPaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    :pswitch_2
    sget-object p0, Lcom/adyen/checkout/components/model/payments/request/GooglePayPaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    :pswitch_3
    sget-object p0, Lcom/adyen/checkout/components/model/payments/request/MBWayPaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    :pswitch_4
    sget-object p0, Lcom/adyen/checkout/components/model/payments/request/IdealPaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    :pswitch_5
    sget-object p0, Lcom/adyen/checkout/components/model/payments/request/BlikPaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    :pswitch_6
    sget-object p0, Lcom/adyen/checkout/components/model/payments/request/EPSPaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    :pswitch_7
    sget-object p0, Lcom/adyen/checkout/components/model/payments/request/EntercashPaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    :pswitch_8
    sget-object p0, Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    :pswitch_9
    sget-object p0, Lcom/adyen/checkout/components/model/payments/request/DotpayPaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    :pswitch_a
    sget-object p0, Lcom/adyen/checkout/components/model/payments/request/MolpayPaymentMethod;->SERIALIZER:Lcom/adyen/checkout/core/model/ModelObject$Serializer;

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x622fe466 -> :sswitch_d
        -0x4f08c541 -> :sswitch_c
        -0x361eca5b -> :sswitch_b
        -0x331da9f5 -> :sswitch_a
        0x18928 -> :sswitch_9
        0x2e2eec -> :sswitch_8
        0x5f6a055 -> :sswitch_7
        0x62e593a -> :sswitch_6
        0x39dd99f1 -> :sswitch_5
        0x39dd9a35 -> :sswitch_4
        0x4793e127 -> :sswitch_3
        0x57e37bcf -> :sswitch_2
        0x5c24cb00 -> :sswitch_1
        0x764aef19 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_a
        :pswitch_a
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;->type:Ljava/lang/String;

    return-object v0
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;->type:Ljava/lang/String;

    return-void
.end method
