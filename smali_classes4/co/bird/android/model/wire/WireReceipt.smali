.class public final Lco/bird/android/model/wire/WireReceipt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bg\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u0012\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0008\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\rH\u00c6\u0003J\u000f\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0008H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003Jp\u0010(\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00082\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010)J\t\u0010*\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010+\u001a\u00020,2\u0008\u0010-\u001a\u0004\u0018\u00010.H\u00d6\u0003J\t\u0010/\u001a\u00020\u000bH\u00d6\u0001J\t\u00100\u001a\u00020\rH\u00d6\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u000bH\u00d6\u0001R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\u0008\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u000c\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u001c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001e\u00a8\u00066"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireReceipt;",
        "Landroid/os/Parcelable;",
        "transaction",
        "Lco/bird/android/model/wire/WireRideTransaction;",
        "refillTransaction",
        "debitAmount",
        "",
        "coupons",
        "",
        "Lco/bird/android/model/wire/WireCoupon;",
        "balance",
        "",
        "currency",
        "",
        "debitTransactionLineItems",
        "Lco/bird/android/model/wire/WireRideTransactionItem;",
        "parkingIncentiveValue",
        "(Lco/bird/android/model/wire/WireRideTransaction;Lco/bird/android/model/wire/WireRideTransaction;JLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;J)V",
        "getBalance",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getCoupons",
        "()Ljava/util/List;",
        "getCurrency",
        "()Ljava/lang/String;",
        "getDebitAmount",
        "()J",
        "getDebitTransactionLineItems",
        "getParkingIncentiveValue",
        "getRefillTransaction",
        "()Lco/bird/android/model/wire/WireRideTransaction;",
        "getTransaction",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "(Lco/bird/android/model/wire/WireRideTransaction;Lco/bird/android/model/wire/WireRideTransaction;JLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;J)Lco/bird/android/model/wire/WireReceipt;",
        "describeContents",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "model-wire_release"
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/wire/WireReceipt;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final balance:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "balance"
    .end annotation

    .annotation runtime Lft5;
        value = "balance"
    .end annotation
.end field

.field private final coupons:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "coupons"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "coupons"
    .end annotation
.end field

.field private final currency:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "currency"
    .end annotation

    .annotation runtime Lft5;
        value = "currency"
    .end annotation
.end field

.field private final debitAmount:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "debit_amount"
    .end annotation

    .annotation runtime Lft5;
        value = "debit_amount"
    .end annotation
.end field

.field private final debitTransactionLineItems:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "debit_transaction_line_items"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireRideTransactionItem;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "debit_transaction_line_items"
    .end annotation
.end field

.field private final parkingIncentiveValue:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "parking_incentive_value"
    .end annotation

    .annotation runtime Lft5;
        value = "parking_incentive_value"
    .end annotation
.end field

.field private final refillTransaction:Lco/bird/android/model/wire/WireRideTransaction;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "refill_transaction"
    .end annotation

    .annotation runtime Lft5;
        value = "refill_transaction"
    .end annotation
.end field

.field private final transaction:Lco/bird/android/model/wire/WireRideTransaction;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "transaction"
    .end annotation

    .annotation runtime Lft5;
        value = "transaction"
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/wire/WireReceipt$Creator;

    invoke-direct {v0}, Lco/bird/android/model/wire/WireReceipt$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/wire/WireReceipt;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/16 v11, 0xff

    const/4 v12, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lco/bird/android/model/wire/WireReceipt;-><init>(Lco/bird/android/model/wire/WireRideTransaction;Lco/bird/android/model/wire/WireRideTransaction;JLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/wire/WireRideTransaction;Lco/bird/android/model/wire/WireRideTransaction;JLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireRideTransaction;",
            "Lco/bird/android/model/wire/WireRideTransaction;",
            "J",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireRideTransactionItem;",
            ">;J)V"
        }
    .end annotation

    const-string v0, "coupons"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currency"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "debitTransactionLineItems"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireReceipt;->transaction:Lco/bird/android/model/wire/WireRideTransaction;

    iput-object p2, p0, Lco/bird/android/model/wire/WireReceipt;->refillTransaction:Lco/bird/android/model/wire/WireRideTransaction;

    iput-wide p3, p0, Lco/bird/android/model/wire/WireReceipt;->debitAmount:J

    iput-object p5, p0, Lco/bird/android/model/wire/WireReceipt;->coupons:Ljava/util/List;

    iput-object p6, p0, Lco/bird/android/model/wire/WireReceipt;->balance:Ljava/lang/Integer;

    iput-object p7, p0, Lco/bird/android/model/wire/WireReceipt;->currency:Ljava/lang/String;

    iput-object p8, p0, Lco/bird/android/model/wire/WireReceipt;->debitTransactionLineItems:Ljava/util/List;

    iput-wide p9, p0, Lco/bird/android/model/wire/WireReceipt;->parkingIncentiveValue:J

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireRideTransaction;Lco/bird/android/model/wire/WireRideTransaction;JLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    const-wide/16 v5, 0x0

    if-eqz v4, :cond_2

    move-wide v7, v5

    goto :goto_2

    :cond_2
    move-wide v7, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    goto :goto_3

    :cond_3
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v9, v0, 0x10

    if-eqz v9, :cond_4

    goto :goto_4

    :cond_4
    move-object/from16 v2, p6

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    const-string v9, "usd"

    goto :goto_5

    :cond_5
    move-object/from16 v9, p7

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v10

    goto :goto_6

    :cond_6
    move-object/from16 v10, p8

    :goto_6
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_7

    goto :goto_7

    :cond_7
    move-wide/from16 v5, p9

    :goto_7
    move-object p1, p0

    move-object p2, v1

    move-object p3, v3

    move-wide p4, v7

    move-object/from16 p6, v4

    move-object/from16 p7, v2

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-wide/from16 p10, v5

    invoke-direct/range {p1 .. p11}, Lco/bird/android/model/wire/WireReceipt;-><init>(Lco/bird/android/model/wire/WireRideTransaction;Lco/bird/android/model/wire/WireRideTransaction;JLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;J)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireReceipt;Lco/bird/android/model/wire/WireRideTransaction;Lco/bird/android/model/wire/WireRideTransaction;JLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;JILjava/lang/Object;)Lco/bird/android/model/wire/WireReceipt;
    .locals 12

    move-object v0, p0

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/wire/WireReceipt;->transaction:Lco/bird/android/model/wire/WireRideTransaction;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/wire/WireReceipt;->refillTransaction:Lco/bird/android/model/wire/WireRideTransaction;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-wide v4, v0, Lco/bird/android/model/wire/WireReceipt;->debitAmount:J

    goto :goto_2

    :cond_2
    move-wide v4, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lco/bird/android/model/wire/WireReceipt;->coupons:Ljava/util/List;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lco/bird/android/model/wire/WireReceipt;->balance:Ljava/lang/Integer;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lco/bird/android/model/wire/WireReceipt;->currency:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lco/bird/android/model/wire/WireReceipt;->debitTransactionLineItems:Ljava/util/List;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-wide v10, v0, Lco/bird/android/model/wire/WireReceipt;->parkingIncentiveValue:J

    goto :goto_7

    :cond_7
    move-wide/from16 v10, p9

    :goto_7
    move-object p1, v2

    move-object p2, v3

    move-wide p3, v4

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-wide/from16 p9, v10

    invoke-virtual/range {p0 .. p10}, Lco/bird/android/model/wire/WireReceipt;->copy(Lco/bird/android/model/wire/WireRideTransaction;Lco/bird/android/model/wire/WireRideTransaction;JLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;J)Lco/bird/android/model/wire/WireReceipt;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/wire/WireRideTransaction;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->transaction:Lco/bird/android/model/wire/WireRideTransaction;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/wire/WireRideTransaction;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->refillTransaction:Lco/bird/android/model/wire/WireRideTransaction;

    return-object v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/WireReceipt;->debitAmount:J

    return-wide v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->coupons:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->balance:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireRideTransactionItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->debitTransactionLineItems:Ljava/util/List;

    return-object v0
.end method

.method public final component8()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/WireReceipt;->parkingIncentiveValue:J

    return-wide v0
.end method

.method public final copy(Lco/bird/android/model/wire/WireRideTransaction;Lco/bird/android/model/wire/WireRideTransaction;JLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;J)Lco/bird/android/model/wire/WireReceipt;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireRideTransaction;",
            "Lco/bird/android/model/wire/WireRideTransaction;",
            "J",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireRideTransactionItem;",
            ">;J)",
            "Lco/bird/android/model/wire/WireReceipt;"
        }
    .end annotation

    const-string v0, "coupons"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currency"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "debitTransactionLineItems"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireReceipt;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object/from16 v7, p6

    move-wide/from16 v10, p9

    invoke-direct/range {v1 .. v11}, Lco/bird/android/model/wire/WireReceipt;-><init>(Lco/bird/android/model/wire/WireRideTransaction;Lco/bird/android/model/wire/WireRideTransaction;JLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;J)V

    return-object v0
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
    instance-of v1, p1, Lco/bird/android/model/wire/WireReceipt;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireReceipt;

    iget-object v1, p0, Lco/bird/android/model/wire/WireReceipt;->transaction:Lco/bird/android/model/wire/WireRideTransaction;

    iget-object v3, p1, Lco/bird/android/model/wire/WireReceipt;->transaction:Lco/bird/android/model/wire/WireRideTransaction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireReceipt;->refillTransaction:Lco/bird/android/model/wire/WireRideTransaction;

    iget-object v3, p1, Lco/bird/android/model/wire/WireReceipt;->refillTransaction:Lco/bird/android/model/wire/WireRideTransaction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lco/bird/android/model/wire/WireReceipt;->debitAmount:J

    iget-wide v5, p1, Lco/bird/android/model/wire/WireReceipt;->debitAmount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/WireReceipt;->coupons:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/WireReceipt;->coupons:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/WireReceipt;->balance:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/wire/WireReceipt;->balance:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/wire/WireReceipt;->currency:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireReceipt;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/wire/WireReceipt;->debitTransactionLineItems:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/WireReceipt;->debitTransactionLineItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lco/bird/android/model/wire/WireReceipt;->parkingIncentiveValue:J

    iget-wide v5, p1, Lco/bird/android/model/wire/WireReceipt;->parkingIncentiveValue:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getBalance()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->balance:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getCoupons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->coupons:Ljava/util/List;

    return-object v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getDebitAmount()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/WireReceipt;->debitAmount:J

    return-wide v0
.end method

.method public final getDebitTransactionLineItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireRideTransactionItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->debitTransactionLineItems:Ljava/util/List;

    return-object v0
.end method

.method public final getParkingIncentiveValue()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/WireReceipt;->parkingIncentiveValue:J

    return-wide v0
.end method

.method public final getRefillTransaction()Lco/bird/android/model/wire/WireRideTransaction;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->refillTransaction:Lco/bird/android/model/wire/WireRideTransaction;

    return-object v0
.end method

.method public final getTransaction()Lco/bird/android/model/wire/WireRideTransaction;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->transaction:Lco/bird/android/model/wire/WireRideTransaction;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->transaction:Lco/bird/android/model/wire/WireRideTransaction;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRideTransaction;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/WireReceipt;->refillTransaction:Lco/bird/android/model/wire/WireRideTransaction;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lco/bird/android/model/wire/WireRideTransaction;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lco/bird/android/model/wire/WireReceipt;->debitAmount:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/WireReceipt;->coupons:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/WireReceipt;->balance:Ljava/lang/Integer;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireReceipt;->currency:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireReceipt;->debitTransactionLineItems:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/wire/WireReceipt;->parkingIncentiveValue:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->transaction:Lco/bird/android/model/wire/WireRideTransaction;

    iget-object v1, p0, Lco/bird/android/model/wire/WireReceipt;->refillTransaction:Lco/bird/android/model/wire/WireRideTransaction;

    iget-wide v2, p0, Lco/bird/android/model/wire/WireReceipt;->debitAmount:J

    iget-object v4, p0, Lco/bird/android/model/wire/WireReceipt;->coupons:Ljava/util/List;

    iget-object v5, p0, Lco/bird/android/model/wire/WireReceipt;->balance:Ljava/lang/Integer;

    iget-object v6, p0, Lco/bird/android/model/wire/WireReceipt;->currency:Ljava/lang/String;

    iget-object v7, p0, Lco/bird/android/model/wire/WireReceipt;->debitTransactionLineItems:Ljava/util/List;

    iget-wide v8, p0, Lco/bird/android/model/wire/WireReceipt;->parkingIncentiveValue:J

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "WireReceipt(transaction="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", refillTransaction="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", debitAmount="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", coupons="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", balance="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", currency="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", debitTransactionLineItems="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", parkingIncentiveValue="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->transaction:Lco/bird/android/model/wire/WireRideTransaction;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/WireRideTransaction;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->refillTransaction:Lco/bird/android/model/wire/WireRideTransaction;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/WireRideTransaction;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-wide v3, p0, Lco/bird/android/model/wire/WireReceipt;->debitAmount:J

    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->coupons:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireCoupon;

    invoke-virtual {v3, p1, p2}, Lco/bird/android/model/wire/WireCoupon;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->balance:Ljava/lang/Integer;

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_3
    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->currency:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireReceipt;->debitTransactionLineItems:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireRideTransactionItem;

    invoke-virtual {v1, p1, p2}, Lco/bird/android/model/wire/WireRideTransactionItem;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_4

    :cond_4
    iget-wide v0, p0, Lco/bird/android/model/wire/WireReceipt;->parkingIncentiveValue:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method
