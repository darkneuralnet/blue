.class public final Lcom/stripe/android/model/ConsumerPaymentDetails$Card;
.super Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/ConsumerPaymentDetails;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Card"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/ConsumerPaymentDetails$Card$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 52\u00020\u0001:\u00015BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\nH\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\rH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J[\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001J\t\u0010*\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010+\u001a\u00020\u00052\u0008\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020\u0007H\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0007H\u00d6\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u001c\u00a8\u00066"
    }
    d2 = {
        "Lcom/stripe/android/model/ConsumerPaymentDetails$Card;",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "id",
        "",
        "isDefault",
        "",
        "expiryYear",
        "",
        "expiryMonth",
        "brand",
        "Lcom/stripe/android/model/CardBrand;",
        "last4",
        "cvcCheck",
        "Lcom/stripe/android/model/CvcCheck;",
        "billingAddress",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;",
        "(Ljava/lang/String;ZIILcom/stripe/android/model/CardBrand;Ljava/lang/String;Lcom/stripe/android/model/CvcCheck;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;)V",
        "getBillingAddress",
        "()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;",
        "getBrand",
        "()Lcom/stripe/android/model/CardBrand;",
        "getCvcCheck",
        "()Lcom/stripe/android/model/CvcCheck;",
        "getExpiryMonth",
        "()I",
        "getExpiryYear",
        "getId",
        "()Ljava/lang/String;",
        "()Z",
        "isExpired",
        "getLast4",
        "requiresCardDetailsRecollection",
        "getRequiresCardDetailsRecollection",
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
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "Companion",
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
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$Card;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/model/ConsumerPaymentDetails$Card$Companion;

.field public static final type:Ljava/lang/String; = "card"


# instance fields
.field private final billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

.field private final brand:Lcom/stripe/android/model/CardBrand;

.field private final cvcCheck:Lcom/stripe/android/model/CvcCheck;

.field private final expiryMonth:I

.field private final expiryYear:I

.field private final id:Ljava/lang/String;

.field private final isDefault:Z

.field private final last4:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->Companion:Lcom/stripe/android/model/ConsumerPaymentDetails$Card$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->$stable:I

    new-instance v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZIILcom/stripe/android/model/CardBrand;Ljava/lang/String;Lcom/stripe/android/model/CvcCheck;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;)V
    .locals 2

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brand"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "last4"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cvcCheck"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "card"

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;-><init>(Ljava/lang/String;ZLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->id:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isDefault:Z

    iput p3, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    iput p4, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    iput-object p5, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->brand:Lcom/stripe/android/model/CardBrand;

    iput-object p6, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->last4:Ljava/lang/String;

    iput-object p7, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    iput-object p8, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZIILcom/stripe/android/model/CardBrand;Ljava/lang/String;Lcom/stripe/android/model/CvcCheck;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p9

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v9, v0

    goto :goto_0

    :cond_0
    move-object/from16 v9, p8

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;-><init>(Ljava/lang/String;ZIILcom/stripe/android/model/CardBrand;Ljava/lang/String;Lcom/stripe/android/model/CvcCheck;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/ConsumerPaymentDetails$Card;Ljava/lang/String;ZIILcom/stripe/android/model/CardBrand;Ljava/lang/String;Lcom/stripe/android/model/CvcCheck;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;ILjava/lang/Object;)Lcom/stripe/android/model/ConsumerPaymentDetails$Card;
    .locals 9

    move-object v0, p0

    move/from16 v1, p9

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isDefault()Z

    move-result v3

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->brand:Lcom/stripe/android/model/CardBrand;

    goto :goto_4

    :cond_4
    move-object v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->last4:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-object v1, v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    goto :goto_7

    :cond_7
    move-object/from16 v1, p8

    :goto_7
    move-object p1, v2

    move p2, v3

    move p3, v4

    move p4, v5

    move-object p5, v6

    move-object p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v1

    invoke-virtual/range {p0 .. p8}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->copy(Ljava/lang/String;ZIILcom/stripe/android/model/CardBrand;Ljava/lang/String;Lcom/stripe/android/model/CvcCheck;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;)Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isDefault()Z

    move-result v0

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    return v0
.end method

.method public final component5()Lcom/stripe/android/model/CardBrand;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->brand:Lcom/stripe/android/model/CardBrand;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->last4:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/stripe/android/model/CvcCheck;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    return-object v0
.end method

.method public final component8()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ZIILcom/stripe/android/model/CardBrand;Ljava/lang/String;Lcom/stripe/android/model/CvcCheck;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;)Lcom/stripe/android/model/ConsumerPaymentDetails$Card;
    .locals 10

    const-string v0, "id"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brand"

    move-object v6, p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "last4"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cvcCheck"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    move-object v1, v0

    move v3, p2

    move v4, p3

    move v5, p4

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;-><init>(Ljava/lang/String;ZIILcom/stripe/android/model/CardBrand;Ljava/lang/String;Lcom/stripe/android/model/CvcCheck;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isDefault()Z

    move-result v1

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isDefault()Z

    move-result v3

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    iget v3, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    iget v3, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->brand:Lcom/stripe/android/model/CardBrand;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->brand:Lcom/stripe/android/model/CardBrand;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->last4:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->last4:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    iget-object p1, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getBillingAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    return-object v0
.end method

.method public final getBrand()Lcom/stripe/android/model/CardBrand;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->brand:Lcom/stripe/android/model/CardBrand;

    return-object v0
.end method

.method public final getCvcCheck()Lcom/stripe/android/model/CvcCheck;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    return-object v0
.end method

.method public final getExpiryMonth()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    return v0
.end method

.method public final getExpiryYear()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLast4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->last4:Ljava/lang/String;

    return-object v0
.end method

.method public final getRequiresCardDetailsRecollection()Z
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isExpired()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    invoke-virtual {v0}, Lcom/stripe/android/model/CvcCheck;->getRequiresRecollection()Z

    move-result v0

    if-eqz v0, :cond_0

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

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isDefault()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->brand:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->last4:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public isDefault()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isDefault:Z

    return v0
.end method

.method public final isExpired()Z
    .locals 2

    iget v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    iget v1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    invoke-static {v0, v1}, Lcom/stripe/android/view/DateUtils;->isExpiryDataValid(II)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isDefault()Z

    move-result v1

    iget v2, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    iget v3, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    iget-object v4, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->brand:Lcom/stripe/android/model/CardBrand;

    iget-object v5, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->last4:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    iget-object v7, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Card(id="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isDefault="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", expiryYear="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", expiryMonth="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", brand="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", last4="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", cvcCheck="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", billingAddress="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isDefault:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryYear:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->expiryMonth:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->brand:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->last4:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->cvcCheck:Lcom/stripe/android/model/CvcCheck;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    if-nez v0, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    return-void
.end method
