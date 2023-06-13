.class public final Lcom/stripe/android/PaymentSessionData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0008\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004BY\u0008\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0006H\u00c2\u0003J\t\u0010 \u001a\u00020\u0006H\u00c2\u0003J\t\u0010!\u001a\u00020\tH\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J_\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0006H\u00c6\u0001J\t\u0010(\u001a\u00020)H\u00d6\u0001J\u0013\u0010*\u001a\u00020\u00062\u0008\u0010+\u001a\u0004\u0018\u00010,H\u00d6\u0003J\t\u0010-\u001a\u00020)H\u00d6\u0001J\t\u0010.\u001a\u00020/H\u00d6\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)H\u00d6\u0001R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0016\u00a8\u00065"
    }
    d2 = {
        "Lcom/stripe/android/PaymentSessionData;",
        "Landroid/os/Parcelable;",
        "config",
        "Lcom/stripe/android/PaymentSessionConfig;",
        "(Lcom/stripe/android/PaymentSessionConfig;)V",
        "isShippingInfoRequired",
        "",
        "isShippingMethodRequired",
        "cartTotal",
        "",
        "shippingTotal",
        "shippingInformation",
        "Lcom/stripe/android/model/ShippingInformation;",
        "shippingMethod",
        "Lcom/stripe/android/model/ShippingMethod;",
        "paymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "useGooglePay",
        "(ZZJJLcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/model/ShippingMethod;Lcom/stripe/android/model/PaymentMethod;Z)V",
        "getCartTotal",
        "()J",
        "isPaymentReadyToCharge",
        "()Z",
        "getPaymentMethod",
        "()Lcom/stripe/android/model/PaymentMethod;",
        "getShippingInformation",
        "()Lcom/stripe/android/model/ShippingInformation;",
        "getShippingMethod",
        "()Lcom/stripe/android/model/ShippingMethod;",
        "getShippingTotal",
        "getUseGooglePay",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "describeContents",
        "",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/PaymentSessionData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final cartTotal:J

.field private final isShippingInfoRequired:Z

.field private final isShippingMethodRequired:Z

.field private final paymentMethod:Lcom/stripe/android/model/PaymentMethod;

.field private final shippingInformation:Lcom/stripe/android/model/ShippingInformation;

.field private final shippingMethod:Lcom/stripe/android/model/ShippingMethod;

.field private final shippingTotal:J

.field private final useGooglePay:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/PaymentSessionData$Creator;

    invoke-direct {v0}, Lcom/stripe/android/PaymentSessionData$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/PaymentSessionData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/PaymentSessionConfig;)V
    .locals 14

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/stripe/android/PaymentSessionConfig;->isShippingInfoRequired()Z

    move-result v2

    invoke-virtual {p1}, Lcom/stripe/android/PaymentSessionConfig;->isShippingMethodRequired()Z

    move-result v3

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xfc

    const/4 v13, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v13}, Lcom/stripe/android/PaymentSessionData;-><init>(ZZJJLcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/model/ShippingMethod;Lcom/stripe/android/model/PaymentMethod;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZJJLcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/model/ShippingMethod;Lcom/stripe/android/model/PaymentMethod;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/stripe/android/PaymentSessionData;->isShippingInfoRequired:Z

    iput-boolean p2, p0, Lcom/stripe/android/PaymentSessionData;->isShippingMethodRequired:Z

    iput-wide p3, p0, Lcom/stripe/android/PaymentSessionData;->cartTotal:J

    iput-wide p5, p0, Lcom/stripe/android/PaymentSessionData;->shippingTotal:J

    iput-object p7, p0, Lcom/stripe/android/PaymentSessionData;->shippingInformation:Lcom/stripe/android/model/ShippingInformation;

    iput-object p8, p0, Lcom/stripe/android/PaymentSessionData;->shippingMethod:Lcom/stripe/android/model/ShippingMethod;

    iput-object p9, p0, Lcom/stripe/android/PaymentSessionData;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    iput-boolean p10, p0, Lcom/stripe/android/PaymentSessionData;->useGooglePay:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZJJLcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/model/ShippingMethod;Lcom/stripe/android/model/PaymentMethod;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x4

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_0

    move-wide v7, v2

    goto :goto_0

    :cond_0
    move-wide/from16 v7, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    move-wide v9, v2

    goto :goto_1

    :cond_1
    move-wide/from16 v9, p5

    :goto_1
    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v11, v2

    goto :goto_2

    :cond_2
    move-object/from16 v11, p7

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v12, v2

    goto :goto_3

    :cond_3
    move-object/from16 v12, p8

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move-object v13, v2

    goto :goto_4

    :cond_4
    move-object/from16 v13, p9

    :goto_4
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    move v14, v0

    goto :goto_5

    :cond_5
    move/from16 v14, p10

    :goto_5
    move-object v4, p0

    move/from16 v5, p1

    move/from16 v6, p2

    invoke-direct/range {v4 .. v14}, Lcom/stripe/android/PaymentSessionData;-><init>(ZZJJLcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/model/ShippingMethod;Lcom/stripe/android/model/PaymentMethod;Z)V

    return-void
.end method

.method private final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/PaymentSessionData;->isShippingInfoRequired:Z

    return v0
.end method

.method private final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/PaymentSessionData;->isShippingMethodRequired:Z

    return v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/PaymentSessionData;ZZJJLcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/model/ShippingMethod;Lcom/stripe/android/model/PaymentMethod;ZILjava/lang/Object;)Lcom/stripe/android/PaymentSessionData;
    .locals 11

    move-object v0, p0

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lcom/stripe/android/PaymentSessionData;->isShippingInfoRequired:Z

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lcom/stripe/android/PaymentSessionData;->isShippingMethodRequired:Z

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-wide v4, v0, Lcom/stripe/android/PaymentSessionData;->cartTotal:J

    goto :goto_2

    :cond_2
    move-wide v4, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-wide v6, v0, Lcom/stripe/android/PaymentSessionData;->shippingTotal:J

    goto :goto_3

    :cond_3
    move-wide/from16 v6, p5

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget-object v8, v0, Lcom/stripe/android/PaymentSessionData;->shippingInformation:Lcom/stripe/android/model/ShippingInformation;

    goto :goto_4

    :cond_4
    move-object/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget-object v9, v0, Lcom/stripe/android/PaymentSessionData;->shippingMethod:Lcom/stripe/android/model/ShippingMethod;

    goto :goto_5

    :cond_5
    move-object/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget-object v10, v0, Lcom/stripe/android/PaymentSessionData;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    goto :goto_6

    :cond_6
    move-object/from16 v10, p9

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-boolean v1, v0, Lcom/stripe/android/PaymentSessionData;->useGooglePay:Z

    goto :goto_7

    :cond_7
    move/from16 v1, p10

    :goto_7
    move p1, v2

    move p2, v3

    move-wide p3, v4

    move-wide/from16 p5, v6

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move/from16 p10, v1

    invoke-virtual/range {p0 .. p10}, Lcom/stripe/android/PaymentSessionData;->copy(ZZJJLcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/model/ShippingMethod;Lcom/stripe/android/model/PaymentMethod;Z)Lcom/stripe/android/PaymentSessionData;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/PaymentSessionData;->cartTotal:J

    return-wide v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/PaymentSessionData;->shippingTotal:J

    return-wide v0
.end method

.method public final component5()Lcom/stripe/android/model/ShippingInformation;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->shippingInformation:Lcom/stripe/android/model/ShippingInformation;

    return-object v0
.end method

.method public final component6()Lcom/stripe/android/model/ShippingMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->shippingMethod:Lcom/stripe/android/model/ShippingMethod;

    return-object v0
.end method

.method public final component7()Lcom/stripe/android/model/PaymentMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/PaymentSessionData;->useGooglePay:Z

    return v0
.end method

.method public final copy(ZZJJLcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/model/ShippingMethod;Lcom/stripe/android/model/PaymentMethod;Z)Lcom/stripe/android/PaymentSessionData;
    .locals 12

    new-instance v11, Lcom/stripe/android/PaymentSessionData;

    move-object v0, v11

    move v1, p1

    move v2, p2

    move-wide v3, p3

    move-wide/from16 v5, p5

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/PaymentSessionData;-><init>(ZZJJLcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/model/ShippingMethod;Lcom/stripe/android/model/PaymentMethod;Z)V

    return-object v11
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/PaymentSessionData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/PaymentSessionData;

    iget-boolean v1, p0, Lcom/stripe/android/PaymentSessionData;->isShippingInfoRequired:Z

    iget-boolean v3, p1, Lcom/stripe/android/PaymentSessionData;->isShippingInfoRequired:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/PaymentSessionData;->isShippingMethodRequired:Z

    iget-boolean v3, p1, Lcom/stripe/android/PaymentSessionData;->isShippingMethodRequired:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/stripe/android/PaymentSessionData;->cartTotal:J

    iget-wide v5, p1, Lcom/stripe/android/PaymentSessionData;->cartTotal:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/stripe/android/PaymentSessionData;->shippingTotal:J

    iget-wide v5, p1, Lcom/stripe/android/PaymentSessionData;->shippingTotal:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/PaymentSessionData;->shippingInformation:Lcom/stripe/android/model/ShippingInformation;

    iget-object v3, p1, Lcom/stripe/android/PaymentSessionData;->shippingInformation:Lcom/stripe/android/model/ShippingInformation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/PaymentSessionData;->shippingMethod:Lcom/stripe/android/model/ShippingMethod;

    iget-object v3, p1, Lcom/stripe/android/PaymentSessionData;->shippingMethod:Lcom/stripe/android/model/ShippingMethod;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/PaymentSessionData;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    iget-object v3, p1, Lcom/stripe/android/PaymentSessionData;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/stripe/android/PaymentSessionData;->useGooglePay:Z

    iget-boolean p1, p1, Lcom/stripe/android/PaymentSessionData;->useGooglePay:Z

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getCartTotal()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/PaymentSessionData;->cartTotal:J

    return-wide v0
.end method

.method public final getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    return-object v0
.end method

.method public final getShippingInformation()Lcom/stripe/android/model/ShippingInformation;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->shippingInformation:Lcom/stripe/android/model/ShippingInformation;

    return-object v0
.end method

.method public final getShippingMethod()Lcom/stripe/android/model/ShippingMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->shippingMethod:Lcom/stripe/android/model/ShippingMethod;

    return-object v0
.end method

.method public final getShippingTotal()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/PaymentSessionData;->shippingTotal:J

    return-wide v0
.end method

.method public final getUseGooglePay()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/PaymentSessionData;->useGooglePay:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lcom/stripe/android/PaymentSessionData;->isShippingInfoRequired:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/PaymentSessionData;->isShippingMethodRequired:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/stripe/android/PaymentSessionData;->cartTotal:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/stripe/android/PaymentSessionData;->shippingTotal:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/PaymentSessionData;->shippingInformation:Lcom/stripe/android/model/ShippingInformation;

    const/4 v3, 0x0

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Lcom/stripe/android/model/ShippingInformation;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/PaymentSessionData;->shippingMethod:Lcom/stripe/android/model/ShippingMethod;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Lcom/stripe/android/model/ShippingMethod;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/PaymentSessionData;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v2}, Lcom/stripe/android/model/PaymentMethod;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/PaymentSessionData;->useGooglePay:Z

    if-eqz v2, :cond_5

    goto :goto_3

    :cond_5
    move v1, v2

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public final isPaymentReadyToCharge()Z
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/stripe/android/PaymentSessionData;->useGooglePay:Z

    if-eqz v0, :cond_2

    :cond_0
    iget-boolean v0, p0, Lcom/stripe/android/PaymentSessionData;->isShippingInfoRequired:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->shippingInformation:Lcom/stripe/android/model/ShippingInformation;

    if-eqz v0, :cond_2

    :cond_1
    iget-boolean v0, p0, Lcom/stripe/android/PaymentSessionData;->isShippingMethodRequired:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->shippingMethod:Lcom/stripe/android/model/ShippingMethod;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-boolean v0, p0, Lcom/stripe/android/PaymentSessionData;->isShippingInfoRequired:Z

    iget-boolean v1, p0, Lcom/stripe/android/PaymentSessionData;->isShippingMethodRequired:Z

    iget-wide v2, p0, Lcom/stripe/android/PaymentSessionData;->cartTotal:J

    iget-wide v4, p0, Lcom/stripe/android/PaymentSessionData;->shippingTotal:J

    iget-object v6, p0, Lcom/stripe/android/PaymentSessionData;->shippingInformation:Lcom/stripe/android/model/ShippingInformation;

    iget-object v7, p0, Lcom/stripe/android/PaymentSessionData;->shippingMethod:Lcom/stripe/android/model/ShippingMethod;

    iget-object v8, p0, Lcom/stripe/android/PaymentSessionData;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    iget-boolean v9, p0, Lcom/stripe/android/PaymentSessionData;->useGooglePay:Z

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "PaymentSessionData(isShippingInfoRequired="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isShippingMethodRequired="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", cartTotal="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", shippingTotal="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", shippingInformation="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shippingMethod="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", paymentMethod="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", useGooglePay="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/PaymentSessionData;->isShippingInfoRequired:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/PaymentSessionData;->isShippingMethodRequired:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lcom/stripe/android/PaymentSessionData;->cartTotal:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lcom/stripe/android/PaymentSessionData;->shippingTotal:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->shippingInformation:Lcom/stripe/android/model/ShippingInformation;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/ShippingInformation;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->shippingMethod:Lcom/stripe/android/model/ShippingMethod;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/ShippingMethod;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/PaymentMethod;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-boolean p2, p0, Lcom/stripe/android/PaymentSessionData;->useGooglePay:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
