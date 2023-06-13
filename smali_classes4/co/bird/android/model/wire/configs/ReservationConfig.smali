.class public final Lco/bird/android/model/wire/configs/ReservationConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\'\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bs\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0006H\u00c6\u0003J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0006H\u00c6\u0003J\t\u0010&\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\'\u001a\u00020\nH\u00c6\u0003J\t\u0010(\u001a\u00020\nH\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003Jw\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010-\u001a\u00020\u00032\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\u0006H\u00d6\u0001J\t\u00100\u001a\u00020\u0008H\u00d6\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u000c\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0013R\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001dR\u0016\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001d\u00a8\u00061"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/ReservationConfig;",
        "",
        "enableRideReservation",
        "",
        "enableReserveIntroNewUsers",
        "maximumReservationDurationMinutes",
        "",
        "currency",
        "",
        "basePrice",
        "",
        "minutePrice",
        "enableReservePromoOnBadScan",
        "enableReservePromoOnCancelledRide",
        "enableReservePromoOnLowBatteryCancelledRide",
        "reservePromoOfferDuration",
        "reservePromoReservationDuration",
        "(ZZILjava/lang/String;JJZZZII)V",
        "getBasePrice",
        "()J",
        "getCurrency",
        "()Ljava/lang/String;",
        "getEnableReserveIntroNewUsers",
        "()Z",
        "getEnableReservePromoOnBadScan",
        "getEnableReservePromoOnCancelledRide",
        "getEnableReservePromoOnLowBatteryCancelledRide",
        "getEnableRideReservation",
        "getMaximumReservationDurationMinutes",
        "()I",
        "getMinutePrice",
        "getReservePromoOfferDuration",
        "getReservePromoReservationDuration",
        "component1",
        "component10",
        "component11",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
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

.field private final enableReserveIntroNewUsers:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_reserve_intro_new_users"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_reserve_intro_new_users"
    .end annotation
.end field

.field private final enableReservePromoOnBadScan:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_reserve_promo_on_bad_scan"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_reserve_promo_on_bad_scan"
    .end annotation
.end field

.field private final enableReservePromoOnCancelledRide:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_reserve_promo_on_cancelled_ride"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_reserve_promo_on_cancelled_ride"
    .end annotation
.end field

.field private final enableReservePromoOnLowBatteryCancelledRide:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_reserve_promo_on_low_battery_cancelled_ride"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_reserve_promo_on_low_battery_cancelled_ride"
    .end annotation
.end field

.field private final enableRideReservation:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_ride_reservation"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_ride_reservation"
    .end annotation
.end field

.field private final maximumReservationDurationMinutes:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "maximum_reservation_duration_minutes"
    .end annotation

    .annotation runtime Lft5;
        value = "maximum_reservation_duration_minutes"
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

.field private final reservePromoOfferDuration:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "reserve_promo_offer_duration"
    .end annotation

    .annotation runtime Lft5;
        value = "reserve_promo_offer_duration"
    .end annotation
.end field

.field private final reservePromoReservationDuration:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "reserve_promo_reservation_duration"
    .end annotation

    .annotation runtime Lft5;
        value = "reserve_promo_reservation_duration"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 16

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0x7ff

    const/4 v15, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v15}, Lco/bird/android/model/wire/configs/ReservationConfig;-><init>(ZZILjava/lang/String;JJZZZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZILjava/lang/String;JJZZZII)V
    .locals 1

    const-string v0, "currency"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableRideReservation:Z

    iput-boolean p2, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReserveIntroNewUsers:Z

    iput p3, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->maximumReservationDurationMinutes:I

    iput-object p4, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->currency:Ljava/lang/String;

    iput-wide p5, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->basePrice:J

    iput-wide p7, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->minutePrice:J

    iput-boolean p9, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnBadScan:Z

    iput-boolean p10, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnCancelledRide:Z

    iput-boolean p11, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnLowBatteryCancelledRide:Z

    iput p12, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->reservePromoOfferDuration:I

    iput p13, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->reservePromoReservationDuration:I

    return-void
.end method

.method public synthetic constructor <init>(ZZILjava/lang/String;JJZZZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const/16 v4, 0x1e

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    const-string v5, "usd"

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    const-wide/16 v6, 0x64

    goto :goto_4

    :cond_4
    move-wide/from16 v6, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    const-wide/16 v8, 0xf

    goto :goto_5

    :cond_5
    move-wide/from16 v8, p7

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    move v10, v2

    goto :goto_6

    :cond_6
    move/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    move v11, v2

    goto :goto_7

    :cond_7
    move/from16 v11, p10

    :goto_7
    and-int/lit16 v12, v0, 0x100

    if-eqz v12, :cond_8

    goto :goto_8

    :cond_8
    move/from16 v2, p11

    :goto_8
    and-int/lit16 v12, v0, 0x200

    const/16 v13, 0x384

    if-eqz v12, :cond_9

    move v12, v13

    goto :goto_9

    :cond_9
    move/from16 v12, p12

    :goto_9
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_a

    goto :goto_a

    :cond_a
    move/from16 v13, p13

    :goto_a
    move-object p1, p0

    move/from16 p2, v1

    move/from16 p3, v3

    move/from16 p4, v4

    move-object/from16 p5, v5

    move-wide/from16 p6, v6

    move-wide/from16 p8, v8

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v2

    move/from16 p13, v12

    move/from16 p14, v13

    invoke-direct/range {p1 .. p14}, Lco/bird/android/model/wire/configs/ReservationConfig;-><init>(ZZILjava/lang/String;JJZZZII)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/ReservationConfig;ZZILjava/lang/String;JJZZZIIILjava/lang/Object;)Lco/bird/android/model/wire/configs/ReservationConfig;
    .locals 14

    move-object v0, p0

    move/from16 v1, p14

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableRideReservation:Z

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReserveIntroNewUsers:Z

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lco/bird/android/model/wire/configs/ReservationConfig;->maximumReservationDurationMinutes:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/wire/configs/ReservationConfig;->currency:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-wide v6, v0, Lco/bird/android/model/wire/configs/ReservationConfig;->basePrice:J

    goto :goto_4

    :cond_4
    move-wide/from16 v6, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-wide v8, v0, Lco/bird/android/model/wire/configs/ReservationConfig;->minutePrice:J

    goto :goto_5

    :cond_5
    move-wide/from16 v8, p7

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget-boolean v10, v0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnBadScan:Z

    goto :goto_6

    :cond_6
    move/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_7

    iget-boolean v11, v0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnCancelledRide:Z

    goto :goto_7

    :cond_7
    move/from16 v11, p10

    :goto_7
    and-int/lit16 v12, v1, 0x100

    if-eqz v12, :cond_8

    iget-boolean v12, v0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnLowBatteryCancelledRide:Z

    goto :goto_8

    :cond_8
    move/from16 v12, p11

    :goto_8
    and-int/lit16 v13, v1, 0x200

    if-eqz v13, :cond_9

    iget v13, v0, Lco/bird/android/model/wire/configs/ReservationConfig;->reservePromoOfferDuration:I

    goto :goto_9

    :cond_9
    move/from16 v13, p12

    :goto_9
    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_a

    iget v1, v0, Lco/bird/android/model/wire/configs/ReservationConfig;->reservePromoReservationDuration:I

    goto :goto_a

    :cond_a
    move/from16 v1, p13

    :goto_a
    move p1, v2

    move/from16 p2, v3

    move/from16 p3, v4

    move-object/from16 p4, v5

    move-wide/from16 p5, v6

    move-wide/from16 p7, v8

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v1

    invoke-virtual/range {p0 .. p13}, Lco/bird/android/model/wire/configs/ReservationConfig;->copy(ZZILjava/lang/String;JJZZZII)Lco/bird/android/model/wire/configs/ReservationConfig;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableRideReservation:Z

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->reservePromoOfferDuration:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->reservePromoReservationDuration:I

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReserveIntroNewUsers:Z

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->maximumReservationDurationMinutes:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->basePrice:J

    return-wide v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->minutePrice:J

    return-wide v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnBadScan:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnCancelledRide:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnLowBatteryCancelledRide:Z

    return v0
.end method

.method public final copy(ZZILjava/lang/String;JJZZZII)Lco/bird/android/model/wire/configs/ReservationConfig;
    .locals 15

    const-string v0, "currency"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/configs/ReservationConfig;

    move-object v1, v0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lco/bird/android/model/wire/configs/ReservationConfig;-><init>(ZZILjava/lang/String;JJZZZII)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/ReservationConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/ReservationConfig;

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableRideReservation:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/ReservationConfig;->enableRideReservation:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReserveIntroNewUsers:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReserveIntroNewUsers:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->maximumReservationDurationMinutes:I

    iget v3, p1, Lco/bird/android/model/wire/configs/ReservationConfig;->maximumReservationDurationMinutes:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->currency:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/ReservationConfig;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->basePrice:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/ReservationConfig;->basePrice:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->minutePrice:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/ReservationConfig;->minutePrice:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnBadScan:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnBadScan:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnCancelledRide:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnCancelledRide:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnLowBatteryCancelledRide:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnLowBatteryCancelledRide:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->reservePromoOfferDuration:I

    iget v3, p1, Lco/bird/android/model/wire/configs/ReservationConfig;->reservePromoOfferDuration:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->reservePromoReservationDuration:I

    iget p1, p1, Lco/bird/android/model/wire/configs/ReservationConfig;->reservePromoReservationDuration:I

    if-eq v1, p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getBasePrice()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->basePrice:J

    return-wide v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getEnableReserveIntroNewUsers()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReserveIntroNewUsers:Z

    return v0
.end method

.method public final getEnableReservePromoOnBadScan()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnBadScan:Z

    return v0
.end method

.method public final getEnableReservePromoOnCancelledRide()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnCancelledRide:Z

    return v0
.end method

.method public final getEnableReservePromoOnLowBatteryCancelledRide()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnLowBatteryCancelledRide:Z

    return v0
.end method

.method public final getEnableRideReservation()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableRideReservation:Z

    return v0
.end method

.method public final getMaximumReservationDurationMinutes()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->maximumReservationDurationMinutes:I

    return v0
.end method

.method public final getMinutePrice()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->minutePrice:J

    return-wide v0
.end method

.method public final getReservePromoOfferDuration()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->reservePromoOfferDuration:I

    return v0
.end method

.method public final getReservePromoReservationDuration()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->reservePromoReservationDuration:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableRideReservation:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReserveIntroNewUsers:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->maximumReservationDurationMinutes:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->currency:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->basePrice:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->minutePrice:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnBadScan:Z

    if-eqz v2, :cond_2

    move v2, v1

    :cond_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnCancelledRide:Z

    if-eqz v2, :cond_3

    move v2, v1

    :cond_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnLowBatteryCancelledRide:Z

    if-eqz v2, :cond_4

    goto :goto_0

    :cond_4
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->reservePromoOfferDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->reservePromoReservationDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableRideReservation:Z

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReserveIntroNewUsers:Z

    iget v2, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->maximumReservationDurationMinutes:I

    iget-object v3, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->currency:Ljava/lang/String;

    iget-wide v4, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->basePrice:J

    iget-wide v6, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->minutePrice:J

    iget-boolean v8, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnBadScan:Z

    iget-boolean v9, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnCancelledRide:Z

    iget-boolean v10, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->enableReservePromoOnLowBatteryCancelledRide:Z

    iget v11, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->reservePromoOfferDuration:I

    iget v12, p0, Lco/bird/android/model/wire/configs/ReservationConfig;->reservePromoReservationDuration:I

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "ReservationConfig(enableRideReservation="

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableReserveIntroNewUsers="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", maximumReservationDurationMinutes="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", currency="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", basePrice="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", minutePrice="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", enableReservePromoOnBadScan="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableReservePromoOnCancelledRide="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableReservePromoOnLowBatteryCancelledRide="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", reservePromoOfferDuration="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", reservePromoReservationDuration="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
