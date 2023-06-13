.class public final Lco/bird/api/request/IBeaconScan;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\\\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0002\u0010&J\u0013\u0010\'\u001a\u00020(2\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020\u0005H\u00d6\u0001J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\u0008\u0011\u0010\u0012R\u0018\u0010\u000c\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\u0008\u001d\u0010\u0019\u00a8\u0006,"
    }
    d2 = {
        "Lco/bird/api/request/IBeaconScan;",
        "",
        "proximityUUID",
        "",
        "beaconHash",
        "",
        "scannedAt",
        "Lorg/joda/time/DateTime;",
        "txPower",
        "",
        "rssi",
        "estimatedDistance",
        "location",
        "Lco/bird/android/model/wire/WireLocation;",
        "(Ljava/lang/String;ILorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lco/bird/android/model/wire/WireLocation;)V",
        "getBeaconHash",
        "()I",
        "getEstimatedDistance",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getLocation",
        "()Lco/bird/android/model/wire/WireLocation;",
        "getProximityUUID",
        "()Ljava/lang/String;",
        "getRssi",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getScannedAt",
        "()Lorg/joda/time/DateTime;",
        "getTxPower",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "(Ljava/lang/String;ILorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lco/bird/android/model/wire/WireLocation;)Lco/bird/api/request/IBeaconScan;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "co.bird.android.api"
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
.field private final beaconHash:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "beacon_hash"
    .end annotation

    .annotation runtime Lft5;
        value = "beacon_hash"
    .end annotation
.end field

.field private final estimatedDistance:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "estimated_distance"
    .end annotation

    .annotation runtime Lft5;
        value = "estimated_distance"
    .end annotation
.end field

.field private final location:Lco/bird/android/model/wire/WireLocation;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "location"
    .end annotation

    .annotation runtime Lft5;
        value = "location"
    .end annotation
.end field

.field private final proximityUUID:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "proximity_uuid"
    .end annotation

    .annotation runtime Lft5;
        value = "proximity_uuid"
    .end annotation
.end field

.field private final rssi:Ljava/lang/Long;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "rssi"
    .end annotation

    .annotation runtime Lft5;
        value = "rssi"
    .end annotation
.end field

.field private final scannedAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "scanned_at"
    .end annotation

    .annotation runtime Lft5;
        value = "scanned_at"
    .end annotation
.end field

.field private final txPower:Ljava/lang/Long;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "tx_power"
    .end annotation

    .annotation runtime Lft5;
        value = "tx_power"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;ILorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lco/bird/android/model/wire/WireLocation;)V
    .locals 1

    const-string v0, "proximityUUID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scannedAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/request/IBeaconScan;->proximityUUID:Ljava/lang/String;

    iput p2, p0, Lco/bird/api/request/IBeaconScan;->beaconHash:I

    iput-object p3, p0, Lco/bird/api/request/IBeaconScan;->scannedAt:Lorg/joda/time/DateTime;

    iput-object p4, p0, Lco/bird/api/request/IBeaconScan;->txPower:Ljava/lang/Long;

    iput-object p5, p0, Lco/bird/api/request/IBeaconScan;->rssi:Ljava/lang/Long;

    iput-object p6, p0, Lco/bird/api/request/IBeaconScan;->estimatedDistance:Ljava/lang/Integer;

    iput-object p7, p0, Lco/bird/api/request/IBeaconScan;->location:Lco/bird/android/model/wire/WireLocation;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lco/bird/android/model/wire/WireLocation;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    const-string v1, "now()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object v5, p3

    :goto_0
    and-int/lit8 v0, p8, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object v6, p4

    :goto_1
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_2

    move-object v7, v1

    goto :goto_2

    :cond_2
    move-object v7, p5

    :goto_2
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_3

    move-object v8, v1

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_4

    move-object v9, v1

    goto :goto_4

    :cond_4
    move-object/from16 v9, p7

    :goto_4
    move-object v2, p0

    move-object v3, p1

    move v4, p2

    invoke-direct/range {v2 .. v9}, Lco/bird/api/request/IBeaconScan;-><init>(Ljava/lang/String;ILorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lco/bird/android/model/wire/WireLocation;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/request/IBeaconScan;Ljava/lang/String;ILorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lco/bird/android/model/wire/WireLocation;ILjava/lang/Object;)Lco/bird/api/request/IBeaconScan;
    .locals 5

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lco/bird/api/request/IBeaconScan;->proximityUUID:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lco/bird/api/request/IBeaconScan;->beaconHash:I

    :cond_1
    move p9, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/api/request/IBeaconScan;->scannedAt:Lorg/joda/time/DateTime;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/api/request/IBeaconScan;->txPower:Ljava/lang/Long;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/api/request/IBeaconScan;->rssi:Ljava/lang/Long;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p8, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lco/bird/api/request/IBeaconScan;->estimatedDistance:Ljava/lang/Integer;

    :cond_5
    move-object v3, p6

    and-int/lit8 p2, p8, 0x40

    if-eqz p2, :cond_6

    iget-object p7, p0, Lco/bird/api/request/IBeaconScan;->location:Lco/bird/android/model/wire/WireLocation;

    :cond_6
    move-object v4, p7

    move-object p2, p0

    move-object p3, p1

    move p4, p9

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move-object p8, v3

    move-object p9, v4

    invoke-virtual/range {p2 .. p9}, Lco/bird/api/request/IBeaconScan;->copy(Ljava/lang/String;ILorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lco/bird/android/model/wire/WireLocation;)Lco/bird/api/request/IBeaconScan;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/IBeaconScan;->proximityUUID:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lco/bird/api/request/IBeaconScan;->beaconHash:I

    return v0
.end method

.method public final component3()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/IBeaconScan;->scannedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component4()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/IBeaconScan;->txPower:Ljava/lang/Long;

    return-object v0
.end method

.method public final component5()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/IBeaconScan;->rssi:Ljava/lang/Long;

    return-object v0
.end method

.method public final component6()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/IBeaconScan;->estimatedDistance:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component7()Lco/bird/android/model/wire/WireLocation;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/IBeaconScan;->location:Lco/bird/android/model/wire/WireLocation;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lco/bird/android/model/wire/WireLocation;)Lco/bird/api/request/IBeaconScan;
    .locals 9

    const-string v0, "proximityUUID"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scannedAt"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/request/IBeaconScan;

    move-object v1, v0

    move v3, p2

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lco/bird/api/request/IBeaconScan;-><init>(Ljava/lang/String;ILorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lco/bird/android/model/wire/WireLocation;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/request/IBeaconScan;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/request/IBeaconScan;

    iget-object v1, p0, Lco/bird/api/request/IBeaconScan;->proximityUUID:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/IBeaconScan;->proximityUUID:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lco/bird/api/request/IBeaconScan;->beaconHash:I

    iget v3, p1, Lco/bird/api/request/IBeaconScan;->beaconHash:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/request/IBeaconScan;->scannedAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/api/request/IBeaconScan;->scannedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/api/request/IBeaconScan;->txPower:Ljava/lang/Long;

    iget-object v3, p1, Lco/bird/api/request/IBeaconScan;->txPower:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/api/request/IBeaconScan;->rssi:Ljava/lang/Long;

    iget-object v3, p1, Lco/bird/api/request/IBeaconScan;->rssi:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/api/request/IBeaconScan;->estimatedDistance:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/api/request/IBeaconScan;->estimatedDistance:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/api/request/IBeaconScan;->location:Lco/bird/android/model/wire/WireLocation;

    iget-object p1, p1, Lco/bird/api/request/IBeaconScan;->location:Lco/bird/android/model/wire/WireLocation;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getBeaconHash()I
    .locals 1

    iget v0, p0, Lco/bird/api/request/IBeaconScan;->beaconHash:I

    return v0
.end method

.method public final getEstimatedDistance()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/IBeaconScan;->estimatedDistance:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getLocation()Lco/bird/android/model/wire/WireLocation;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/IBeaconScan;->location:Lco/bird/android/model/wire/WireLocation;

    return-object v0
.end method

.method public final getProximityUUID()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/IBeaconScan;->proximityUUID:Ljava/lang/String;

    return-object v0
.end method

.method public final getRssi()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/IBeaconScan;->rssi:Ljava/lang/Long;

    return-object v0
.end method

.method public final getScannedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/IBeaconScan;->scannedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getTxPower()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/IBeaconScan;->txPower:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/request/IBeaconScan;->proximityUUID:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/api/request/IBeaconScan;->beaconHash:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/IBeaconScan;->scannedAt:Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/IBeaconScan;->txPower:Ljava/lang/Long;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/IBeaconScan;->rssi:Ljava/lang/Long;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/IBeaconScan;->estimatedDistance:Ljava/lang/Integer;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/IBeaconScan;->location:Lco/bird/android/model/wire/WireLocation;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireLocation;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lco/bird/api/request/IBeaconScan;->proximityUUID:Ljava/lang/String;

    iget v1, p0, Lco/bird/api/request/IBeaconScan;->beaconHash:I

    iget-object v2, p0, Lco/bird/api/request/IBeaconScan;->scannedAt:Lorg/joda/time/DateTime;

    iget-object v3, p0, Lco/bird/api/request/IBeaconScan;->txPower:Ljava/lang/Long;

    iget-object v4, p0, Lco/bird/api/request/IBeaconScan;->rssi:Ljava/lang/Long;

    iget-object v5, p0, Lco/bird/api/request/IBeaconScan;->estimatedDistance:Ljava/lang/Integer;

    iget-object v6, p0, Lco/bird/api/request/IBeaconScan;->location:Lco/bird/android/model/wire/WireLocation;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "IBeaconScan(proximityUUID="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", beaconHash="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", scannedAt="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", txPower="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rssi="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", estimatedDistance="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", location="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
