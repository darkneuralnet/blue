.class public final Lco/bird/android/model/BirdPaymentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/BirdPaymentKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a&\u0010\u0003\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0004*\u0002H\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u0002H\u00040\u0006H\u0086\u0004\u00a2\u0006\u0002\u0010\u0007\u001a\n\u0010\u0008\u001a\u00020\t*\u00020\n\u001a\u0014\u0010\u0008\u001a\u00020\t*\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u001a\u000c\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "isGooglePay",
        "",
        "Lcom/stripe/android/model/Card;",
        "isOneOf",
        "T",
        "items",
        "",
        "(Ljava/lang/Object;Ljava/util/List;)Z",
        "toBirdPayment",
        "Lco/bird/android/model/BirdPayment;",
        "Lco/bird/android/model/constant/PaymentMethodDetails;",
        "Lcom/stripe/android/model/PaymentMethod;",
        "methodType",
        "Lco/bird/android/model/constant/PaymentMethod;",
        "toBirdPaymentMethodType",
        "Lcom/stripe/android/model/PaymentMethod$Type;",
        "model_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBirdPayment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPayment.kt\nco/bird/android/model/BirdPaymentKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1747#2,3:104\n*S KotlinDebug\n*F\n+ 1 BirdPayment.kt\nco/bird/android/model/BirdPaymentKt\n*L\n58#1:104,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final isGooglePay(Lcom/stripe/android/model/Card;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/model/Card;->getTokenizationMethod()Lcom/stripe/android/model/TokenizationMethod;

    move-result-object p0

    sget-object v0, Lcom/stripe/android/model/TokenizationMethod;->GooglePay:Lcom/stripe/android/model/TokenizationMethod;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isOneOf(Ljava/lang/Object;Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/util/List<",
            "+TT;>;)Z"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_2
    :goto_0
    return v1
.end method

.method public static final toBirdPayment(Lco/bird/android/model/constant/PaymentMethodDetails;)Lco/bird/android/model/BirdPayment;
    .locals 16

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/BirdPayment;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/constant/PaymentMethodDetails;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/constant/PaymentMethodDetails;->getBrand()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/constant/PaymentMethodDetails;->getDefault()Z

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/constant/PaymentMethodDetails;->getGatewayKind()Lco/bird/android/model/constant/PaymentGatewayKind;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/constant/PaymentMethodDetails;->getLastCardNumbers()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/constant/PaymentMethodDetails;->getExpMonth()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/constant/PaymentMethodDetails;->getExpYear()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/constant/PaymentMethodDetails;->getEmail()Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/constant/PaymentMethodDetails;->getType()Lco/bird/android/model/constant/PaymentMethod;

    move-result-object v13

    const/16 v14, 0x180

    const/4 v15, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v15}, Lco/bird/android/model/BirdPayment;-><init>(Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Card;Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/PaymentMethod;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final toBirdPayment(Lcom/stripe/android/model/PaymentMethod;Lco/bird/android/model/constant/PaymentMethod;)Lco/bird/android/model/BirdPayment;
    .locals 16

    move-object/from16 v9, p0

    const-string v0, "<this>"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v9, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    move-object v1, v0

    sget-object v4, Lco/bird/android/model/constant/PaymentGatewayKind;->STRIPE:Lco/bird/android/model/constant/PaymentGatewayKind;

    iget-object v0, v9, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v3, v0, Lcom/stripe/android/model/PaymentMethod$Card;->last4:Ljava/lang/String;

    move-object v5, v3

    goto :goto_0

    :cond_1
    move-object v5, v2

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod$Card;->expiryMonth:Ljava/lang/Integer;

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    iget-object v0, v9, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod$Card;->expiryYear:Ljava/lang/Integer;

    goto :goto_2

    :cond_3
    move-object v0, v2

    :goto_2
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    if-nez p1, :cond_6

    iget-object v0, v9, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-eqz v0, :cond_4

    invoke-static {v0}, Lco/bird/android/model/BirdPaymentKt;->toBirdPaymentMethodType(Lcom/stripe/android/model/PaymentMethod$Type;)Lco/bird/android/model/constant/PaymentMethod;

    move-result-object v0

    goto :goto_3

    :cond_4
    move-object v0, v2

    :goto_3
    if-nez v0, :cond_5

    sget-object v0, Lco/bird/android/model/constant/PaymentMethod;->UNKNOWN:Lco/bird/android/model/constant/PaymentMethod;

    :cond_5
    move-object v12, v0

    goto :goto_4

    :cond_6
    move-object/from16 v12, p1

    :goto_4
    new-instance v15, Lco/bird/android/model/BirdPayment;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v13, 0x686

    const/4 v14, 0x0

    move-object v0, v15

    move-object/from16 v9, p0

    invoke-direct/range {v0 .. v14}, Lco/bird/android/model/BirdPayment;-><init>(Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Card;Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/PaymentMethod;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v15
.end method

.method public static final toBirdPaymentMethodType(Lcom/stripe/android/model/PaymentMethod$Type;)Lco/bird/android/model/constant/PaymentMethod;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lco/bird/android/model/BirdPaymentKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    packed-switch p0, :pswitch_data_0

    sget-object p0, Lco/bird/android/model/constant/PaymentMethod;->UNKNOWN:Lco/bird/android/model/constant/PaymentMethod;

    goto :goto_1

    :pswitch_0
    sget-object p0, Lco/bird/android/model/constant/PaymentMethod;->SOFORT:Lco/bird/android/model/constant/PaymentMethod;

    goto :goto_1

    :pswitch_1
    sget-object p0, Lco/bird/android/model/constant/PaymentMethod;->P24:Lco/bird/android/model/constant/PaymentMethod;

    goto :goto_1

    :pswitch_2
    sget-object p0, Lco/bird/android/model/constant/PaymentMethod;->IDEAL:Lco/bird/android/model/constant/PaymentMethod;

    goto :goto_1

    :pswitch_3
    sget-object p0, Lco/bird/android/model/constant/PaymentMethod;->GIROPAY:Lco/bird/android/model/constant/PaymentMethod;

    goto :goto_1

    :pswitch_4
    sget-object p0, Lco/bird/android/model/constant/PaymentMethod;->FPX:Lco/bird/android/model/constant/PaymentMethod;

    goto :goto_1

    :pswitch_5
    sget-object p0, Lco/bird/android/model/constant/PaymentMethod;->EPS:Lco/bird/android/model/constant/PaymentMethod;

    goto :goto_1

    :pswitch_6
    sget-object p0, Lco/bird/android/model/constant/PaymentMethod;->PAYPAL:Lco/bird/android/model/constant/PaymentMethod;

    goto :goto_1

    :pswitch_7
    sget-object p0, Lco/bird/android/model/constant/PaymentMethod;->CARD:Lco/bird/android/model/constant/PaymentMethod;

    goto :goto_1

    :pswitch_8
    sget-object p0, Lco/bird/android/model/constant/PaymentMethod;->BANCONTACT:Lco/bird/android/model/constant/PaymentMethod;

    :goto_1
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
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
