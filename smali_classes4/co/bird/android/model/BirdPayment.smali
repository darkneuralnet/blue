.class public final Lco/bird/android/model/BirdPayment;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008/\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\t\u0010-\u001a\u00020\u0014H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0098\u0001\u00106\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014H\u00c6\u0001\u00a2\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u00062\u0008\u00109\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010:\u001a\u00020\u0012H\u00d6\u0001J\u0006\u0010;\u001a\u00020\u0006J\u0006\u0010<\u001a\u00020\u0006J\u0006\u0010=\u001a\u00020\u0006J\u0006\u0010>\u001a\u00020\u0006J\u0006\u0010?\u001a\u00020\u0006J\u0006\u0010@\u001a\u00020\u0006J\u0008\u0010A\u001a\u00020\u0003H\u0016J\u0008\u0010B\u001a\u0004\u0018\u00010\u0003R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\u0008\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u0017R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)\u00a8\u0006C"
    }
    d2 = {
        "Lco/bird/android/model/BirdPayment;",
        "",
        "id",
        "",
        "brand",
        "defaultPaymentMethod",
        "",
        "gatewayKind",
        "Lco/bird/android/model/constant/PaymentGatewayKind;",
        "lastCardNumbers",
        "expiryMonth",
        "expiryYear",
        "stripeCard",
        "Lcom/stripe/android/model/Card;",
        "stripePaymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "paypalEmail",
        "paymentMethodVersion",
        "",
        "methodType",
        "Lco/bird/android/model/constant/PaymentMethod;",
        "(Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Card;Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/PaymentMethod;)V",
        "getBrand",
        "()Ljava/lang/String;",
        "getDefaultPaymentMethod",
        "()Z",
        "getExpiryMonth",
        "getExpiryYear",
        "getGatewayKind",
        "()Lco/bird/android/model/constant/PaymentGatewayKind;",
        "getId",
        "getLastCardNumbers",
        "getMethodType",
        "()Lco/bird/android/model/constant/PaymentMethod;",
        "getPaymentMethodVersion",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getPaypalEmail",
        "getStripeCard",
        "()Lcom/stripe/android/model/Card;",
        "getStripePaymentMethod",
        "()Lcom/stripe/android/model/PaymentMethod;",
        "component1",
        "component10",
        "component11",
        "component12",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Card;Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/PaymentMethod;)Lco/bird/android/model/BirdPayment;",
        "equals",
        "other",
        "hashCode",
        "isAdyen",
        "isEmpty",
        "isGooglePay",
        "isPaypal",
        "isStripeCard",
        "isStripePaymentMethod",
        "toString",
        "vendor",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final brand:Ljava/lang/String;

.field private final defaultPaymentMethod:Z

.field private final expiryMonth:Ljava/lang/String;

.field private final expiryYear:Ljava/lang/String;

.field private final gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

.field private final id:Ljava/lang/String;

.field private final lastCardNumbers:Ljava/lang/String;

.field private final methodType:Lco/bird/android/model/constant/PaymentMethod;

.field private final paymentMethodVersion:Ljava/lang/Integer;

.field private final paypalEmail:Ljava/lang/String;

.field private final stripeCard:Lcom/stripe/android/model/Card;

.field private final stripePaymentMethod:Lcom/stripe/android/model/PaymentMethod;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Card;Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/PaymentMethod;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "methodType"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/BirdPayment;->id:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/BirdPayment;->brand:Ljava/lang/String;

    iput-boolean p3, p0, Lco/bird/android/model/BirdPayment;->defaultPaymentMethod:Z

    iput-object p4, p0, Lco/bird/android/model/BirdPayment;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    iput-object p5, p0, Lco/bird/android/model/BirdPayment;->lastCardNumbers:Ljava/lang/String;

    iput-object p6, p0, Lco/bird/android/model/BirdPayment;->expiryMonth:Ljava/lang/String;

    iput-object p7, p0, Lco/bird/android/model/BirdPayment;->expiryYear:Ljava/lang/String;

    iput-object p8, p0, Lco/bird/android/model/BirdPayment;->stripeCard:Lcom/stripe/android/model/Card;

    iput-object p9, p0, Lco/bird/android/model/BirdPayment;->stripePaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    iput-object p10, p0, Lco/bird/android/model/BirdPayment;->paypalEmail:Ljava/lang/String;

    iput-object p11, p0, Lco/bird/android/model/BirdPayment;->paymentMethodVersion:Ljava/lang/Integer;

    iput-object p12, p0, Lco/bird/android/model/BirdPayment;->methodType:Lco/bird/android/model/constant/PaymentMethod;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Card;Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/PaymentMethod;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "randomUUID().toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v5, v2

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    move v6, v1

    goto :goto_2

    :cond_2
    move/from16 v6, p3

    :goto_2
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    move-object v7, v2

    goto :goto_3

    :cond_3
    move-object/from16 v7, p4

    :goto_3
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_4

    move-object v8, v2

    goto :goto_4

    :cond_4
    move-object/from16 v8, p5

    :goto_4
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_5

    move-object v9, v2

    goto :goto_5

    :cond_5
    move-object/from16 v9, p6

    :goto_5
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_6

    move-object v10, v2

    goto :goto_6

    :cond_6
    move-object/from16 v10, p7

    :goto_6
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_7

    move-object v11, v2

    goto :goto_7

    :cond_7
    move-object/from16 v11, p8

    :goto_7
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_8

    move-object v12, v2

    goto :goto_8

    :cond_8
    move-object/from16 v12, p9

    :goto_8
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_9

    move-object v13, v2

    goto :goto_9

    :cond_9
    move-object/from16 v13, p10

    :goto_9
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_a

    move-object v14, v2

    goto :goto_a

    :cond_a
    move-object/from16 v14, p11

    :goto_a
    move-object/from16 v3, p0

    move-object/from16 v15, p12

    invoke-direct/range {v3 .. v15}, Lco/bird/android/model/BirdPayment;-><init>(Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Card;Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/PaymentMethod;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/BirdPayment;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Card;Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/PaymentMethod;ILjava/lang/Object;)Lco/bird/android/model/BirdPayment;
    .locals 13

    move-object v0, p0

    move/from16 v1, p13

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/BirdPayment;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/BirdPayment;->brand:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-boolean v4, v0, Lco/bird/android/model/BirdPayment;->defaultPaymentMethod:Z

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/BirdPayment;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/BirdPayment;->lastCardNumbers:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/BirdPayment;->expiryMonth:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/BirdPayment;->expiryYear:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/BirdPayment;->stripeCard:Lcom/stripe/android/model/Card;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/bird/android/model/BirdPayment;->stripePaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lco/bird/android/model/BirdPayment;->paypalEmail:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lco/bird/android/model/BirdPayment;->paymentMethodVersion:Ljava/lang/Integer;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_b

    iget-object v1, v0, Lco/bird/android/model/BirdPayment;->methodType:Lco/bird/android/model/constant/PaymentMethod;

    goto :goto_b

    :cond_b
    move-object/from16 v1, p12

    :goto_b
    move-object p1, v2

    move-object p2, v3

    move/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v1

    invoke-virtual/range {p0 .. p12}, Lco/bird/android/model/BirdPayment;->copy(Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Card;Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/PaymentMethod;)Lco/bird/android/model/BirdPayment;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->paypalEmail:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->paymentMethodVersion:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component12()Lco/bird/android/model/constant/PaymentMethod;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->methodType:Lco/bird/android/model/constant/PaymentMethod;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->brand:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/BirdPayment;->defaultPaymentMethod:Z

    return v0
.end method

.method public final component4()Lco/bird/android/model/constant/PaymentGatewayKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->lastCardNumbers:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->expiryMonth:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->expiryYear:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/stripe/android/model/Card;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->stripeCard:Lcom/stripe/android/model/Card;

    return-object v0
.end method

.method public final component9()Lcom/stripe/android/model/PaymentMethod;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->stripePaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Card;Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/PaymentMethod;)Lco/bird/android/model/BirdPayment;
    .locals 14

    const-string v0, "id"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "methodType"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/BirdPayment;

    move-object v1, v0

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v13}, Lco/bird/android/model/BirdPayment;-><init>(Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Card;Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/PaymentMethod;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/BirdPayment;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/BirdPayment;

    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/BirdPayment;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->brand:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/BirdPayment;->brand:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lco/bird/android/model/BirdPayment;->defaultPaymentMethod:Z

    iget-boolean v3, p1, Lco/bird/android/model/BirdPayment;->defaultPaymentMethod:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    iget-object v3, p1, Lco/bird/android/model/BirdPayment;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->lastCardNumbers:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/BirdPayment;->lastCardNumbers:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->expiryMonth:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/BirdPayment;->expiryMonth:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->expiryYear:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/BirdPayment;->expiryYear:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->stripeCard:Lcom/stripe/android/model/Card;

    iget-object v3, p1, Lco/bird/android/model/BirdPayment;->stripeCard:Lcom/stripe/android/model/Card;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->stripePaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    iget-object v3, p1, Lco/bird/android/model/BirdPayment;->stripePaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->paypalEmail:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/BirdPayment;->paypalEmail:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->paymentMethodVersion:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/BirdPayment;->paymentMethodVersion:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->methodType:Lco/bird/android/model/constant/PaymentMethod;

    iget-object p1, p1, Lco/bird/android/model/BirdPayment;->methodType:Lco/bird/android/model/constant/PaymentMethod;

    if-eq v1, p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getBrand()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->brand:Ljava/lang/String;

    return-object v0
.end method

.method public final getDefaultPaymentMethod()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/BirdPayment;->defaultPaymentMethod:Z

    return v0
.end method

.method public final getExpiryMonth()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->expiryMonth:Ljava/lang/String;

    return-object v0
.end method

.method public final getExpiryYear()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->expiryYear:Ljava/lang/String;

    return-object v0
.end method

.method public final getGatewayKind()Lco/bird/android/model/constant/PaymentGatewayKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastCardNumbers()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->lastCardNumbers:Ljava/lang/String;

    return-object v0
.end method

.method public final getMethodType()Lco/bird/android/model/constant/PaymentMethod;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->methodType:Lco/bird/android/model/constant/PaymentMethod;

    return-object v0
.end method

.method public final getPaymentMethodVersion()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->paymentMethodVersion:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getPaypalEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->paypalEmail:Ljava/lang/String;

    return-object v0
.end method

.method public final getStripeCard()Lcom/stripe/android/model/Card;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->stripeCard:Lcom/stripe/android/model/Card;

    return-object v0
.end method

.method public final getStripePaymentMethod()Lcom/stripe/android/model/PaymentMethod;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->stripePaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->brand:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/BirdPayment;->defaultPaymentMethod:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->lastCardNumbers:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->expiryMonth:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->expiryYear:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_4

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->stripeCard:Lcom/stripe/android/model/Card;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_5

    :cond_6
    invoke-virtual {v1}, Lcom/stripe/android/model/Card;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->stripePaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentMethod;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->paypalEmail:Ljava/lang/String;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_7

    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->paymentMethodVersion:Ljava/lang/Integer;

    if-nez v1, :cond_9

    goto :goto_8

    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/BirdPayment;->methodType:Lco/bird/android/model/constant/PaymentMethod;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isAdyen()Z
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    sget-object v1, Lco/bird/android/model/constant/PaymentGatewayKind;->ADYEN:Lco/bird/android/model/constant/PaymentGatewayKind;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isEmpty()Z
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->stripeCard:Lcom/stripe/android/model/Card;

    if-nez v0, :cond_0

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->stripePaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    if-nez v0, :cond_0

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->paypalEmail:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    sget-object v1, Lco/bird/android/model/constant/PaymentGatewayKind;->ADYEN:Lco/bird/android/model/constant/PaymentGatewayKind;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isGooglePay()Z
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->stripeCard:Lcom/stripe/android/model/Card;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lco/bird/android/model/BirdPaymentKt;->isGooglePay(Lcom/stripe/android/model/Card;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->stripePaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod$Card;->wallet:Lcom/stripe/android/model/wallets/Wallet;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    instance-of v0, v0, Lcom/stripe/android/model/wallets/Wallet$GooglePayWallet;

    if-eqz v0, :cond_3

    :cond_2
    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public final isPaypal()Z
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->paypalEmail:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->gatewayKind:Lco/bird/android/model/constant/PaymentGatewayKind;

    sget-object v1, Lco/bird/android/model/constant/PaymentGatewayKind;->BRAINTREE:Lco/bird/android/model/constant/PaymentGatewayKind;

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

.method public final isStripeCard()Z
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->stripeCard:Lcom/stripe/android/model/Card;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isStripePaymentMethod()Z
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->stripePaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/model/BirdPayment;->isGooglePay()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "google_pay"

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/BirdPayment;->isPaypal()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "pay_pal"

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/model/BirdPayment;->isStripeCard()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lco/bird/android/model/BirdPayment;->stripeCard:Lcom/stripe/android/model/Card;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/model/Card;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/model/CardBrand;->getCode()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    :cond_2
    const-string v0, "credit_card"

    goto :goto_0

    :cond_3
    const-string v0, "none"

    :cond_4
    :goto_0
    return-object v0
.end method

.method public final vendor()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/model/BirdPayment;->isStripeCard()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lco/bird/android/model/BirdPayment;->isStripePaymentMethod()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lco/bird/android/model/BirdPayment;->isGooglePay()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/BirdPayment;->isPaypal()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "braintree"

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const-string v0, "stripe"

    :goto_1
    return-object v0
.end method
