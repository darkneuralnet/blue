.class public final Lco/bird/android/model/wire/configs/BeaconConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008 \u0008\u0086\u0008\u0018\u00002\u00020\u0001Bg\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003J\t\u0010%\u001a\u00020\u000cH\u00c6\u0003J\t\u0010&\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000cH\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003Jk\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010*\u001a\u00020\u00032\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\u0007H\u00d6\u0001J\t\u0010-\u001a\u00020\nH\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0013R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0013R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\u000f\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u001e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006."
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/BeaconConfig;",
        "",
        "enablePassiveBeaconScans",
        "",
        "enableBluetoothScanReporting",
        "enableIBeaconScanReporting",
        "ibeaconBatchSubmitPeriod",
        "",
        "monitoredIBeaconProximityUUIDs",
        "",
        "",
        "headlessScanPeriod",
        "",
        "headlessScanMode",
        "Lco/bird/android/model/wire/configs/HeadlessScanMode;",
        "headlessScanPeriodicInterval",
        "enableRecentIBeaconReporting",
        "(ZZZILjava/util/List;JLco/bird/android/model/wire/configs/HeadlessScanMode;JZ)V",
        "getEnableBluetoothScanReporting",
        "()Z",
        "getEnableIBeaconScanReporting",
        "getEnablePassiveBeaconScans",
        "getEnableRecentIBeaconReporting",
        "getHeadlessScanMode",
        "()Lco/bird/android/model/wire/configs/HeadlessScanMode;",
        "getHeadlessScanPeriod",
        "()J",
        "getHeadlessScanPeriodicInterval",
        "getIbeaconBatchSubmitPeriod",
        "()I",
        "getMonitoredIBeaconProximityUUIDs",
        "()Ljava/util/List;",
        "component1",
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
.field private final enableBluetoothScanReporting:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_bluetooth_scan_reporting"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_bluetooth_scan_reporting"
    .end annotation
.end field

.field private final enableIBeaconScanReporting:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_ibeacon_scan_reporting"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_ibeacon_scan_reporting"
    .end annotation
.end field

.field private final enablePassiveBeaconScans:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_passive_beacon_scans"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_passive_beacon_scans"
    .end annotation
.end field

.field private final enableRecentIBeaconReporting:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_recent_ibeacon_reporting"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_recent_ibeacon_reporting"
    .end annotation
.end field

.field private final headlessScanMode:Lco/bird/android/model/wire/configs/HeadlessScanMode;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "headless_scan_mode"
    .end annotation

    .annotation runtime Lft5;
        value = "headless_scan_mode"
    .end annotation
.end field

.field private final headlessScanPeriod:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "headless_scan_period"
    .end annotation

    .annotation runtime Lft5;
        value = "headless_scan_period"
    .end annotation
.end field

.field private final headlessScanPeriodicInterval:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "headless_scan_periodic_interval"
    .end annotation

    .annotation runtime Lft5;
        value = "headless_scan_periodic_interval"
    .end annotation
.end field

.field private final ibeaconBatchSubmitPeriod:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ibeacon_batch_submit_period"
    .end annotation

    .annotation runtime Lft5;
        value = "ibeacon_batch_submit_period"
    .end annotation
.end field

.field private final monitoredIBeaconProximityUUIDs:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "monitored_ibeacon_proximity_uuids"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "monitored_ibeacon_proximity_uuids"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 14

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x1ff

    const/4 v13, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lco/bird/android/model/wire/configs/BeaconConfig;-><init>(ZZZILjava/util/List;JLco/bird/android/model/wire/configs/HeadlessScanMode;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZZILjava/util/List;JLco/bird/android/model/wire/configs/HeadlessScanMode;JZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZI",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;J",
            "Lco/bird/android/model/wire/configs/HeadlessScanMode;",
            "JZ)V"
        }
    .end annotation

    const-string v0, "headlessScanMode"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enablePassiveBeaconScans:Z

    iput-boolean p2, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableBluetoothScanReporting:Z

    iput-boolean p3, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableIBeaconScanReporting:Z

    iput p4, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->ibeaconBatchSubmitPeriod:I

    iput-object p5, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->monitoredIBeaconProximityUUIDs:Ljava/util/List;

    iput-wide p6, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanPeriod:J

    iput-object p8, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanMode:Lco/bird/android/model/wire/configs/HeadlessScanMode;

    iput-wide p9, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanPeriodicInterval:J

    iput-boolean p11, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableRecentIBeaconReporting:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZZILjava/util/List;JLco/bird/android/model/wire/configs/HeadlessScanMode;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p12

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
    move v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    move v4, v2

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    const/16 v5, 0x1e

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    const/4 v6, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    const-wide/16 v7, 0xa

    goto :goto_5

    :cond_5
    move-wide/from16 v7, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    sget-object v9, Lco/bird/android/model/wire/configs/HeadlessScanMode;->NONE:Lco/bird/android/model/wire/configs/HeadlessScanMode;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    const-wide/16 v10, 0xe10

    goto :goto_7

    :cond_7
    move-wide/from16 v10, p9

    :goto_7
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_8

    goto :goto_8

    :cond_8
    move/from16 v2, p11

    :goto_8
    move-object p1, p0

    move p2, v1

    move p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move-object/from16 p6, v6

    move-wide/from16 p7, v7

    move-object/from16 p9, v9

    move-wide/from16 p10, v10

    move/from16 p12, v2

    invoke-direct/range {p1 .. p12}, Lco/bird/android/model/wire/configs/BeaconConfig;-><init>(ZZZILjava/util/List;JLco/bird/android/model/wire/configs/HeadlessScanMode;JZ)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/BeaconConfig;ZZZILjava/util/List;JLco/bird/android/model/wire/configs/HeadlessScanMode;JZILjava/lang/Object;)Lco/bird/android/model/wire/configs/BeaconConfig;
    .locals 12

    move-object v0, p0

    move/from16 v1, p12

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lco/bird/android/model/wire/configs/BeaconConfig;->enablePassiveBeaconScans:Z

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableBluetoothScanReporting:Z

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-boolean v4, v0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableIBeaconScanReporting:Z

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lco/bird/android/model/wire/configs/BeaconConfig;->ibeaconBatchSubmitPeriod:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/wire/configs/BeaconConfig;->monitoredIBeaconProximityUUIDs:Ljava/util/List;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-wide v7, v0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanPeriod:J

    goto :goto_5

    :cond_5
    move-wide/from16 v7, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanMode:Lco/bird/android/model/wire/configs/HeadlessScanMode;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-wide v10, v0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanPeriodicInterval:J

    goto :goto_7

    :cond_7
    move-wide/from16 v10, p9

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget-boolean v1, v0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableRecentIBeaconReporting:Z

    goto :goto_8

    :cond_8
    move/from16 v1, p11

    :goto_8
    move p1, v2

    move p2, v3

    move p3, v4

    move/from16 p4, v5

    move-object/from16 p5, v6

    move-wide/from16 p6, v7

    move-object/from16 p8, v9

    move-wide/from16 p9, v10

    move/from16 p11, v1

    invoke-virtual/range {p0 .. p11}, Lco/bird/android/model/wire/configs/BeaconConfig;->copy(ZZZILjava/util/List;JLco/bird/android/model/wire/configs/HeadlessScanMode;JZ)Lco/bird/android/model/wire/configs/BeaconConfig;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enablePassiveBeaconScans:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableBluetoothScanReporting:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableIBeaconScanReporting:Z

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->ibeaconBatchSubmitPeriod:I

    return v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->monitoredIBeaconProximityUUIDs:Ljava/util/List;

    return-object v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanPeriod:J

    return-wide v0
.end method

.method public final component7()Lco/bird/android/model/wire/configs/HeadlessScanMode;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanMode:Lco/bird/android/model/wire/configs/HeadlessScanMode;

    return-object v0
.end method

.method public final component8()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanPeriodicInterval:J

    return-wide v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableRecentIBeaconReporting:Z

    return v0
.end method

.method public final copy(ZZZILjava/util/List;JLco/bird/android/model/wire/configs/HeadlessScanMode;JZ)Lco/bird/android/model/wire/configs/BeaconConfig;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZI",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;J",
            "Lco/bird/android/model/wire/configs/HeadlessScanMode;",
            "JZ)",
            "Lco/bird/android/model/wire/configs/BeaconConfig;"
        }
    .end annotation

    const-string v0, "headlessScanMode"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/configs/BeaconConfig;

    move-object v1, v0

    move v2, p1

    move v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v10, p9

    move/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lco/bird/android/model/wire/configs/BeaconConfig;-><init>(ZZZILjava/util/List;JLco/bird/android/model/wire/configs/HeadlessScanMode;JZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/BeaconConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/BeaconConfig;

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enablePassiveBeaconScans:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/BeaconConfig;->enablePassiveBeaconScans:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableBluetoothScanReporting:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/BeaconConfig;->enableBluetoothScanReporting:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableIBeaconScanReporting:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/BeaconConfig;->enableIBeaconScanReporting:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->ibeaconBatchSubmitPeriod:I

    iget v3, p1, Lco/bird/android/model/wire/configs/BeaconConfig;->ibeaconBatchSubmitPeriod:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->monitoredIBeaconProximityUUIDs:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/BeaconConfig;->monitoredIBeaconProximityUUIDs:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanPeriod:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanPeriod:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanMode:Lco/bird/android/model/wire/configs/HeadlessScanMode;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanMode:Lco/bird/android/model/wire/configs/HeadlessScanMode;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanPeriodicInterval:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanPeriodicInterval:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableRecentIBeaconReporting:Z

    iget-boolean p1, p1, Lco/bird/android/model/wire/configs/BeaconConfig;->enableRecentIBeaconReporting:Z

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getEnableBluetoothScanReporting()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableBluetoothScanReporting:Z

    return v0
.end method

.method public final getEnableIBeaconScanReporting()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableIBeaconScanReporting:Z

    return v0
.end method

.method public final getEnablePassiveBeaconScans()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enablePassiveBeaconScans:Z

    return v0
.end method

.method public final getEnableRecentIBeaconReporting()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableRecentIBeaconReporting:Z

    return v0
.end method

.method public final getHeadlessScanMode()Lco/bird/android/model/wire/configs/HeadlessScanMode;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanMode:Lco/bird/android/model/wire/configs/HeadlessScanMode;

    return-object v0
.end method

.method public final getHeadlessScanPeriod()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanPeriod:J

    return-wide v0
.end method

.method public final getHeadlessScanPeriodicInterval()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanPeriodicInterval:J

    return-wide v0
.end method

.method public final getIbeaconBatchSubmitPeriod()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->ibeaconBatchSubmitPeriod:I

    return v0
.end method

.method public final getMonitoredIBeaconProximityUUIDs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->monitoredIBeaconProximityUUIDs:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enablePassiveBeaconScans:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableBluetoothScanReporting:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableIBeaconScanReporting:Z

    if-eqz v2, :cond_2

    move v2, v1

    :cond_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->ibeaconBatchSubmitPeriod:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->monitoredIBeaconProximityUUIDs:Ljava/util/List;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanPeriod:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanMode:Lco/bird/android/model/wire/configs/HeadlessScanMode;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanPeriodicInterval:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableRecentIBeaconReporting:Z

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    move v1, v2

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enablePassiveBeaconScans:Z

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableBluetoothScanReporting:Z

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableIBeaconScanReporting:Z

    iget v3, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->ibeaconBatchSubmitPeriod:I

    iget-object v4, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->monitoredIBeaconProximityUUIDs:Ljava/util/List;

    iget-wide v5, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanPeriod:J

    iget-object v7, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanMode:Lco/bird/android/model/wire/configs/HeadlessScanMode;

    iget-wide v8, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->headlessScanPeriodicInterval:J

    iget-boolean v10, p0, Lco/bird/android/model/wire/configs/BeaconConfig;->enableRecentIBeaconReporting:Z

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "BeaconConfig(enablePassiveBeaconScans="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableBluetoothScanReporting="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableIBeaconScanReporting="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", ibeaconBatchSubmitPeriod="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", monitoredIBeaconProximityUUIDs="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", headlessScanPeriod="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", headlessScanMode="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", headlessScanPeriodicInterval="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", enableRecentIBeaconReporting="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
