.class public final Lco/bird/android/model/wire/WireRidePrice;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0019\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001BM\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JQ\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010!\u001a\u00020\u000bH\u00d6\u0001J\u0018\u0010\"\u001a\u00020\u00082\u0008\u0010#\u001a\u0004\u0018\u00010\u00002\u0006\u0010$\u001a\u00020\u0008J\u0013\u0010\"\u001a\u00020\u00082\u0008\u0010#\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000bH\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000fR\u0018\u0010\u000c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006-"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireRidePrice;",
        "Landroid/os/Parcelable;",
        "currency",
        "",
        "basePrice",
        "",
        "minutePrice",
        "salesTax",
        "",
        "minimumPrice",
        "includedMinutes",
        "",
        "overwriteString",
        "(Ljava/lang/String;JJZJILjava/lang/String;)V",
        "getBasePrice",
        "()J",
        "getCurrency",
        "()Ljava/lang/String;",
        "getIncludedMinutes",
        "()I",
        "getMinimumPrice",
        "getMinutePrice",
        "getOverwriteString",
        "getSalesTax",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "describeContents",
        "equals",
        "other",
        "ignoreCurrency",
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
            "Lco/bird/android/model/wire/WireRidePrice;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final basePrice:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "base_price"
    .end annotation

    .annotation runtime Lft5;
        value = "base_price"
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

.field private final includedMinutes:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "included_minutes"
    .end annotation

    .annotation runtime Lft5;
        value = "included_minutes"
    .end annotation
.end field

.field private final minimumPrice:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "minimum_ride_price"
    .end annotation

    .annotation runtime Lft5;
        value = "minimum_ride_price"
    .end annotation
.end field

.field private final minutePrice:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "minute_price"
    .end annotation

    .annotation runtime Lft5;
        value = "minute_price"
    .end annotation
.end field

.field private final overwriteString:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "localized_dynamic_price_string"
    .end annotation

    .annotation runtime Lft5;
        value = "localized_dynamic_price_string"
    .end annotation
.end field

.field private final salesTax:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "sales_tax"
    .end annotation

    .annotation runtime Lft5;
        value = "sales_tax"
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/wire/WireRidePrice$Creator;

    invoke-direct {v0}, Lco/bird/android/model/wire/WireRidePrice$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/wire/WireRidePrice;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x7f

    const/4 v12, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lco/bird/android/model/wire/WireRidePrice;-><init>(Ljava/lang/String;JJZJILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JJZJILjava/lang/String;)V
    .locals 1

    const-string v0, "currency"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireRidePrice;->currency:Ljava/lang/String;

    iput-wide p2, p0, Lco/bird/android/model/wire/WireRidePrice;->basePrice:J

    iput-wide p4, p0, Lco/bird/android/model/wire/WireRidePrice;->minutePrice:J

    iput-boolean p6, p0, Lco/bird/android/model/wire/WireRidePrice;->salesTax:Z

    iput-wide p7, p0, Lco/bird/android/model/wire/WireRidePrice;->minimumPrice:J

    iput p9, p0, Lco/bird/android/model/wire/WireRidePrice;->includedMinutes:I

    iput-object p10, p0, Lco/bird/android/model/wire/WireRidePrice;->overwriteString:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JJZJILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p11, 0x1

    if-eqz v0, :cond_0

    const-string v0, "usd"

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    and-int/lit8 v1, p11, 0x2

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_1

    move-wide v4, v2

    goto :goto_1

    :cond_1
    move-wide v4, p2

    :goto_1
    and-int/lit8 v1, p11, 0x4

    if-eqz v1, :cond_2

    move-wide v6, v2

    goto :goto_2

    :cond_2
    move-wide v6, p4

    :goto_2
    and-int/lit8 v1, p11, 0x8

    const/4 v8, 0x0

    if-eqz v1, :cond_3

    move v1, v8

    goto :goto_3

    :cond_3
    move/from16 v1, p6

    :goto_3
    and-int/lit8 v9, p11, 0x10

    if-eqz v9, :cond_4

    goto :goto_4

    :cond_4
    move-wide/from16 v2, p7

    :goto_4
    and-int/lit8 v9, p11, 0x20

    if-eqz v9, :cond_5

    goto :goto_5

    :cond_5
    move/from16 v8, p9

    :goto_5
    and-int/lit8 v9, p11, 0x40

    if-eqz v9, :cond_6

    const/4 v9, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v9, p10

    :goto_6
    move-object p1, p0

    move-object p2, v0

    move-wide p3, v4

    move-wide p5, v6

    move/from16 p7, v1

    move-wide/from16 p8, v2

    move/from16 p10, v8

    move-object/from16 p11, v9

    invoke-direct/range {p1 .. p11}, Lco/bird/android/model/wire/WireRidePrice;-><init>(Ljava/lang/String;JJZJILjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireRidePrice;Ljava/lang/String;JJZJILjava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/wire/WireRidePrice;
    .locals 11

    move-object v0, p0

    and-int/lit8 v1, p11, 0x1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lco/bird/android/model/wire/WireRidePrice;->currency:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, p11, 0x2

    if-eqz v2, :cond_1

    iget-wide v2, v0, Lco/bird/android/model/wire/WireRidePrice;->basePrice:J

    goto :goto_1

    :cond_1
    move-wide v2, p2

    :goto_1
    and-int/lit8 v4, p11, 0x4

    if-eqz v4, :cond_2

    iget-wide v4, v0, Lco/bird/android/model/wire/WireRidePrice;->minutePrice:J

    goto :goto_2

    :cond_2
    move-wide v4, p4

    :goto_2
    and-int/lit8 v6, p11, 0x8

    if-eqz v6, :cond_3

    iget-boolean v6, v0, Lco/bird/android/model/wire/WireRidePrice;->salesTax:Z

    goto :goto_3

    :cond_3
    move/from16 v6, p6

    :goto_3
    and-int/lit8 v7, p11, 0x10

    if-eqz v7, :cond_4

    iget-wide v7, v0, Lco/bird/android/model/wire/WireRidePrice;->minimumPrice:J

    goto :goto_4

    :cond_4
    move-wide/from16 v7, p7

    :goto_4
    and-int/lit8 v9, p11, 0x20

    if-eqz v9, :cond_5

    iget v9, v0, Lco/bird/android/model/wire/WireRidePrice;->includedMinutes:I

    goto :goto_5

    :cond_5
    move/from16 v9, p9

    :goto_5
    and-int/lit8 v10, p11, 0x40

    if-eqz v10, :cond_6

    iget-object v10, v0, Lco/bird/android/model/wire/WireRidePrice;->overwriteString:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v10, p10

    :goto_6
    move-object p1, v1

    move-wide p2, v2

    move-wide p4, v4

    move/from16 p6, v6

    move-wide/from16 p7, v7

    move/from16 p9, v9

    move-object/from16 p10, v10

    invoke-virtual/range {p0 .. p10}, Lco/bird/android/model/wire/WireRidePrice;->copy(Ljava/lang/String;JJZJILjava/lang/String;)Lco/bird/android/model/wire/WireRidePrice;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRidePrice;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/WireRidePrice;->basePrice:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/WireRidePrice;->minutePrice:J

    return-wide v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireRidePrice;->salesTax:Z

    return v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/WireRidePrice;->minimumPrice:J

    return-wide v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireRidePrice;->includedMinutes:I

    return v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRidePrice;->overwriteString:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;JJZJILjava/lang/String;)Lco/bird/android/model/wire/WireRidePrice;
    .locals 12

    const-string v0, "currency"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireRidePrice;

    move-object v1, v0

    move-wide v3, p2

    move-wide/from16 v5, p4

    move/from16 v7, p6

    move-wide/from16 v8, p7

    move/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lco/bird/android/model/wire/WireRidePrice;-><init>(Ljava/lang/String;JJZJILjava/lang/String;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Lco/bird/android/model/wire/WireRidePrice;Z)Z
    .locals 13

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-eqz p2, :cond_1

    const-string v1, ""

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x7e

    const/4 v12, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v12}, Lco/bird/android/model/wire/WireRidePrice;->copy$default(Lco/bird/android/model/wire/WireRidePrice;Ljava/lang/String;JJZJILjava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/wire/WireRidePrice;

    move-result-object p2

    const-string v1, ""

    move-object v0, p1

    invoke-static/range {v0 .. v12}, Lco/bird/android/model/wire/WireRidePrice;->copy$default(Lco/bird/android/model/wire/WireRidePrice;Ljava/lang/String;JJZJILjava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/wire/WireRidePrice;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireRidePrice;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireRidePrice;

    iget-object v1, p0, Lco/bird/android/model/wire/WireRidePrice;->currency:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRidePrice;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/bird/android/model/wire/WireRidePrice;->basePrice:J

    iget-wide v5, p1, Lco/bird/android/model/wire/WireRidePrice;->basePrice:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lco/bird/android/model/wire/WireRidePrice;->minutePrice:J

    iget-wide v5, p1, Lco/bird/android/model/wire/WireRidePrice;->minutePrice:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/bird/android/model/wire/WireRidePrice;->salesTax:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/WireRidePrice;->salesTax:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lco/bird/android/model/wire/WireRidePrice;->minimumPrice:J

    iget-wide v5, p1, Lco/bird/android/model/wire/WireRidePrice;->minimumPrice:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lco/bird/android/model/wire/WireRidePrice;->includedMinutes:I

    iget v3, p1, Lco/bird/android/model/wire/WireRidePrice;->includedMinutes:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/wire/WireRidePrice;->overwriteString:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/wire/WireRidePrice;->overwriteString:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getBasePrice()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/WireRidePrice;->basePrice:J

    return-wide v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRidePrice;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getIncludedMinutes()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireRidePrice;->includedMinutes:I

    return v0
.end method

.method public final getMinimumPrice()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/WireRidePrice;->minimumPrice:J

    return-wide v0
.end method

.method public final getMinutePrice()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/WireRidePrice;->minutePrice:J

    return-wide v0
.end method

.method public final getOverwriteString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRidePrice;->overwriteString:Ljava/lang/String;

    return-object v0
.end method

.method public final getSalesTax()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/WireRidePrice;->salesTax:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/WireRidePrice;->currency:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/wire/WireRidePrice;->basePrice:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/wire/WireRidePrice;->minutePrice:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/WireRidePrice;->salesTax:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/wire/WireRidePrice;->minimumPrice:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/WireRidePrice;->includedMinutes:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRidePrice;->overwriteString:Ljava/lang/String;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lco/bird/android/model/wire/WireRidePrice;->currency:Ljava/lang/String;

    iget-wide v1, p0, Lco/bird/android/model/wire/WireRidePrice;->basePrice:J

    iget-wide v3, p0, Lco/bird/android/model/wire/WireRidePrice;->minutePrice:J

    iget-boolean v5, p0, Lco/bird/android/model/wire/WireRidePrice;->salesTax:Z

    iget-wide v6, p0, Lco/bird/android/model/wire/WireRidePrice;->minimumPrice:J

    iget v8, p0, Lco/bird/android/model/wire/WireRidePrice;->includedMinutes:I

    iget-object v9, p0, Lco/bird/android/model/wire/WireRidePrice;->overwriteString:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "WireRidePrice(currency="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", basePrice="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", minutePrice="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", salesTax="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", minimumPrice="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", includedMinutes="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", overwriteString="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/model/wire/WireRidePrice;->currency:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lco/bird/android/model/wire/WireRidePrice;->basePrice:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lco/bird/android/model/wire/WireRidePrice;->minutePrice:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-boolean p2, p0, Lco/bird/android/model/wire/WireRidePrice;->salesTax:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lco/bird/android/model/wire/WireRidePrice;->minimumPrice:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget p2, p0, Lco/bird/android/model/wire/WireRidePrice;->includedMinutes:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lco/bird/android/model/wire/WireRidePrice;->overwriteString:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
