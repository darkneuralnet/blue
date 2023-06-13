.class public final Lco/bird/android/model/Vehicle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/Vehicle$ConnectionState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008K\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001jB\u00bd\u0001\u0012\u0006\u0010\"\u001a\u00020\u000c\u0012\u0006\u0010#\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010$\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010%\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010&\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\'\u001a\u00020\u0013\u0012\u0008\u0008\u0002\u0010(\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010)\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u00102\u001a\u00020 \u00a2\u0006\u0004\u0008h\u0010iJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0008\u0010\u0008\u001a\u00020\u0007H\u0016J\u000f\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\t\u0010\r\u001a\u00020\u000cH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0013H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\nJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010!\u001a\u00020 H\u00c6\u0003J\u00ca\u0001\u00103\u001a\u00020\u00002\u0008\u0008\u0002\u0010\"\u001a\u00020\u000c2\u0008\u0008\u0002\u0010#\u001a\u00020\u000e2\u0008\u0008\u0002\u0010$\u001a\u00020\u00072\u0008\u0008\u0002\u0010%\u001a\u00020\u00072\u0008\u0008\u0002\u0010&\u001a\u00020\u00052\u0008\u0008\u0002\u0010\'\u001a\u00020\u00132\u0008\u0008\u0002\u0010(\u001a\u00020\u00052\u0008\u0008\u0002\u0010)\u001a\u00020\u00052\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u00102\u001a\u00020 H\u00c6\u0001\u00a2\u0006\u0004\u00083\u00104R\u0017\u0010\"\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u00105\u001a\u0004\u00086\u00107R\"\u0010#\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008#\u00108\u001a\u0004\u00089\u0010:\"\u0004\u0008;\u0010<R\"\u0010$\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008$\u0010=\u001a\u0004\u0008>\u0010?\"\u0004\u0008@\u0010AR\"\u0010%\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008%\u0010=\u001a\u0004\u0008B\u0010?\"\u0004\u0008C\u0010AR\"\u0010&\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008&\u0010D\u001a\u0004\u0008E\u0010F\"\u0004\u0008G\u0010HR\"\u0010\'\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\'\u0010I\u001a\u0004\u0008J\u0010K\"\u0004\u0008L\u0010MR\"\u0010(\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008(\u0010D\u001a\u0004\u0008N\u0010F\"\u0004\u0008O\u0010HR\"\u0010)\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008)\u0010D\u001a\u0004\u0008P\u0010F\"\u0004\u0008Q\u0010HR\u0019\u0010*\u001a\u0004\u0018\u00010\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u0010R\u001a\u0004\u0008S\u0010TR\u0019\u0010+\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010U\u001a\u0004\u0008V\u0010\nR\u0019\u0010,\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010W\u001a\u0004\u0008X\u0010YR\u0019\u0010-\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010W\u001a\u0004\u0008Z\u0010YR$\u0010.\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008.\u0010W\u001a\u0004\u0008[\u0010Y\"\u0004\u0008\\\u0010]R\u0019\u0010/\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008/\u0010W\u001a\u0004\u0008^\u0010YR$\u00100\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00080\u0010W\u001a\u0004\u0008_\u0010Y\"\u0004\u0008`\u0010]R$\u00101\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00081\u0010W\u001a\u0004\u0008a\u0010Y\"\u0004\u0008b\u0010]R\"\u00102\u001a\u00020 8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00082\u0010c\u001a\u0004\u0008d\u0010e\"\u0004\u0008f\u0010g\u00a8\u0006k"
    }
    d2 = {
        "Lco/bird/android/model/Vehicle;",
        "",
        "",
        "toString",
        "other",
        "",
        "equals",
        "",
        "hashCode",
        "getBatteryForTracking",
        "()Ljava/lang/Integer;",
        "getDistanceForTracking",
        "Landroid/bluetooth/BluetoothDevice;",
        "component1",
        "Lco/bird/android/model/wire/WireBird;",
        "component2",
        "component3",
        "component4",
        "component5",
        "Lco/bird/android/model/constant/EnergyMode;",
        "component6",
        "component7",
        "component8",
        "Lne5;",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "Lco/bird/android/model/persistence/VehicleVersion;",
        "component17",
        "device",
        "bird",
        "battery",
        "distance",
        "locked",
        "energyMode",
        "authenticated",
        "connected",
        "rxDevice",
        "rssi",
        "beaconHash",
        "proximityUUID",
        "imei",
        "serialNumber",
        "iccid",
        "fault",
        "vehicleVersion",
        "copy",
        "(Landroid/bluetooth/BluetoothDevice;Lco/bird/android/model/wire/WireBird;IIZLco/bird/android/model/constant/EnergyMode;ZZLne5;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/VehicleVersion;)Lco/bird/android/model/Vehicle;",
        "Landroid/bluetooth/BluetoothDevice;",
        "getDevice",
        "()Landroid/bluetooth/BluetoothDevice;",
        "Lco/bird/android/model/wire/WireBird;",
        "getBird",
        "()Lco/bird/android/model/wire/WireBird;",
        "setBird",
        "(Lco/bird/android/model/wire/WireBird;)V",
        "I",
        "getBattery",
        "()I",
        "setBattery",
        "(I)V",
        "getDistance",
        "setDistance",
        "Z",
        "getLocked",
        "()Z",
        "setLocked",
        "(Z)V",
        "Lco/bird/android/model/constant/EnergyMode;",
        "getEnergyMode",
        "()Lco/bird/android/model/constant/EnergyMode;",
        "setEnergyMode",
        "(Lco/bird/android/model/constant/EnergyMode;)V",
        "getAuthenticated",
        "setAuthenticated",
        "getConnected",
        "setConnected",
        "Lne5;",
        "getRxDevice",
        "()Lne5;",
        "Ljava/lang/Integer;",
        "getRssi",
        "Ljava/lang/String;",
        "getBeaconHash",
        "()Ljava/lang/String;",
        "getProximityUUID",
        "getImei",
        "setImei",
        "(Ljava/lang/String;)V",
        "getSerialNumber",
        "getIccid",
        "setIccid",
        "getFault",
        "setFault",
        "Lco/bird/android/model/persistence/VehicleVersion;",
        "getVehicleVersion",
        "()Lco/bird/android/model/persistence/VehicleVersion;",
        "setVehicleVersion",
        "(Lco/bird/android/model/persistence/VehicleVersion;)V",
        "<init>",
        "(Landroid/bluetooth/BluetoothDevice;Lco/bird/android/model/wire/WireBird;IIZLco/bird/android/model/constant/EnergyMode;ZZLne5;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/VehicleVersion;)V",
        "ConnectionState",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nVehicle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vehicle.kt\nco/bird/android/model/Vehicle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"
    }
.end annotation


# instance fields
.field private authenticated:Z

.field private battery:I

.field private final beaconHash:Ljava/lang/String;

.field private bird:Lco/bird/android/model/wire/WireBird;

.field private connected:Z

.field private final device:Landroid/bluetooth/BluetoothDevice;

.field private distance:I

.field private energyMode:Lco/bird/android/model/constant/EnergyMode;

.field private fault:Ljava/lang/String;

.field private iccid:Ljava/lang/String;

.field private imei:Ljava/lang/String;

.field private locked:Z

.field private final proximityUUID:Ljava/lang/String;

.field private final rssi:Ljava/lang/Integer;

.field private final rxDevice:Lne5;

.field private final serialNumber:Ljava/lang/String;

.field private vehicleVersion:Lco/bird/android/model/persistence/VehicleVersion;


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;Lco/bird/android/model/wire/WireBird;IIZLco/bird/android/model/constant/EnergyMode;ZZLne5;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/VehicleVersion;)V
    .locals 6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p6

    move-object/from16 v4, p17

    const-string v5, "device"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "bird"

    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "energyMode"

    invoke-static {p6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "vehicleVersion"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lco/bird/android/model/Vehicle;->device:Landroid/bluetooth/BluetoothDevice;

    iput-object v2, v0, Lco/bird/android/model/Vehicle;->bird:Lco/bird/android/model/wire/WireBird;

    move v1, p3

    iput v1, v0, Lco/bird/android/model/Vehicle;->battery:I

    move v1, p4

    iput v1, v0, Lco/bird/android/model/Vehicle;->distance:I

    move v1, p5

    iput-boolean v1, v0, Lco/bird/android/model/Vehicle;->locked:Z

    iput-object v3, v0, Lco/bird/android/model/Vehicle;->energyMode:Lco/bird/android/model/constant/EnergyMode;

    move v1, p7

    iput-boolean v1, v0, Lco/bird/android/model/Vehicle;->authenticated:Z

    move v1, p8

    iput-boolean v1, v0, Lco/bird/android/model/Vehicle;->connected:Z

    move-object v1, p9

    iput-object v1, v0, Lco/bird/android/model/Vehicle;->rxDevice:Lne5;

    move-object/from16 v1, p10

    iput-object v1, v0, Lco/bird/android/model/Vehicle;->rssi:Ljava/lang/Integer;

    move-object/from16 v1, p11

    iput-object v1, v0, Lco/bird/android/model/Vehicle;->beaconHash:Ljava/lang/String;

    move-object/from16 v1, p12

    iput-object v1, v0, Lco/bird/android/model/Vehicle;->proximityUUID:Ljava/lang/String;

    move-object/from16 v1, p13

    iput-object v1, v0, Lco/bird/android/model/Vehicle;->imei:Ljava/lang/String;

    move-object/from16 v1, p14

    iput-object v1, v0, Lco/bird/android/model/Vehicle;->serialNumber:Ljava/lang/String;

    move-object/from16 v1, p15

    iput-object v1, v0, Lco/bird/android/model/Vehicle;->iccid:Ljava/lang/String;

    move-object/from16 v1, p16

    iput-object v1, v0, Lco/bird/android/model/Vehicle;->fault:Ljava/lang/String;

    iput-object v4, v0, Lco/bird/android/model/Vehicle;->vehicleVersion:Lco/bird/android/model/persistence/VehicleVersion;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothDevice;Lco/bird/android/model/wire/WireBird;IIZLco/bird/android/model/constant/EnergyMode;ZZLne5;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/VehicleVersion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    move/from16 v0, p18

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v6, v2

    goto :goto_0

    :cond_0
    move/from16 v6, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    move v7, v2

    goto :goto_1

    :cond_1
    move/from16 v7, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    move v8, v1

    goto :goto_2

    :cond_2
    move/from16 v8, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    sget-object v1, Lco/bird/android/model/constant/EnergyMode;->NORMAL:Lco/bird/android/model/constant/EnergyMode;

    move-object v9, v1

    goto :goto_3

    :cond_3
    move-object/from16 v9, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move v10, v2

    goto :goto_4

    :cond_4
    move/from16 v10, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move v11, v2

    goto :goto_5

    :cond_5
    move/from16 v11, p8

    :goto_5
    and-int/lit16 v1, v0, 0x100

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    move-object v12, v2

    goto :goto_6

    :cond_6
    move-object/from16 v12, p9

    :goto_6
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_7

    move-object v13, v2

    goto :goto_7

    :cond_7
    move-object/from16 v13, p10

    :goto_7
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_8

    move-object v14, v2

    goto :goto_8

    :cond_8
    move-object/from16 v14, p11

    :goto_8
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_9

    move-object v15, v2

    goto :goto_9

    :cond_9
    move-object/from16 v15, p12

    :goto_9
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_a

    move-object/from16 v16, v2

    goto :goto_a

    :cond_a
    move-object/from16 v16, p13

    :goto_a
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_b

    move-object/from16 v17, v2

    goto :goto_b

    :cond_b
    move-object/from16 v17, p14

    :goto_b
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_c

    move-object/from16 v18, v2

    goto :goto_c

    :cond_c
    move-object/from16 v18, p15

    :goto_c
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move-object/from16 v19, v2

    goto :goto_d

    :cond_d
    move-object/from16 v19, p16

    :goto_d
    const/high16 v1, 0x10000

    and-int/2addr v0, v1

    if-eqz v0, :cond_e

    new-instance v0, Lco/bird/android/model/persistence/VehicleVersion;

    invoke-virtual/range {p2 .. p2}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x3e

    const/16 v22, 0x0

    move-object/from16 p3, v0

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move/from16 p7, v4

    move-object/from16 p8, v5

    move-object/from16 p9, v20

    move/from16 p10, v21

    move-object/from16 p11, v22

    invoke-direct/range {p3 .. p11}, Lco/bird/android/model/persistence/VehicleVersion;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v20, v0

    goto :goto_e

    :cond_e
    move-object/from16 v20, p17

    :goto_e
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    invoke-direct/range {v3 .. v20}, Lco/bird/android/model/Vehicle;-><init>(Landroid/bluetooth/BluetoothDevice;Lco/bird/android/model/wire/WireBird;IIZLco/bird/android/model/constant/EnergyMode;ZZLne5;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/VehicleVersion;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothDevice;Lco/bird/android/model/wire/WireBird;IIZLco/bird/android/model/constant/EnergyMode;ZZLne5;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/VehicleVersion;ILjava/lang/Object;)Lco/bird/android/model/Vehicle;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p18

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/Vehicle;->device:Landroid/bluetooth/BluetoothDevice;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/Vehicle;->bird:Lco/bird/android/model/wire/WireBird;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lco/bird/android/model/Vehicle;->battery:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lco/bird/android/model/Vehicle;->distance:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lco/bird/android/model/Vehicle;->locked:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/Vehicle;->energyMode:Lco/bird/android/model/constant/EnergyMode;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lco/bird/android/model/Vehicle;->authenticated:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lco/bird/android/model/Vehicle;->connected:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/bird/android/model/Vehicle;->rxDevice:Lne5;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lco/bird/android/model/Vehicle;->rssi:Ljava/lang/Integer;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lco/bird/android/model/Vehicle;->beaconHash:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lco/bird/android/model/Vehicle;->proximityUUID:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lco/bird/android/model/Vehicle;->imei:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lco/bird/android/model/Vehicle;->serialNumber:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lco/bird/android/model/Vehicle;->iccid:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-object/from16 p15, v15

    if-eqz v16, :cond_f

    iget-object v15, v0, Lco/bird/android/model/Vehicle;->fault:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v1, v1, v16

    if-eqz v1, :cond_10

    iget-object v1, v0, Lco/bird/android/model/Vehicle;->vehicleVersion:Lco/bird/android/model/persistence/VehicleVersion;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move/from16 p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move-object/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p16, v15

    move-object/from16 p17, v1

    invoke-virtual/range {p0 .. p17}, Lco/bird/android/model/Vehicle;->copy(Landroid/bluetooth/BluetoothDevice;Lco/bird/android/model/wire/WireBird;IIZLco/bird/android/model/constant/EnergyMode;ZZLne5;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/VehicleVersion;)Lco/bird/android/model/Vehicle;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->device:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public final component10()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->rssi:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->beaconHash:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->proximityUUID:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->imei:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->serialNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->iccid:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->fault:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Lco/bird/android/model/persistence/VehicleVersion;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->vehicleVersion:Lco/bird/android/model/persistence/VehicleVersion;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/wire/WireBird;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->bird:Lco/bird/android/model/wire/WireBird;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/Vehicle;->battery:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/Vehicle;->distance:I

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/Vehicle;->locked:Z

    return v0
.end method

.method public final component6()Lco/bird/android/model/constant/EnergyMode;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->energyMode:Lco/bird/android/model/constant/EnergyMode;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/Vehicle;->authenticated:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/Vehicle;->connected:Z

    return v0
.end method

.method public final component9()Lne5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->rxDevice:Lne5;

    return-object v0
.end method

.method public final copy(Landroid/bluetooth/BluetoothDevice;Lco/bird/android/model/wire/WireBird;IIZLco/bird/android/model/constant/EnergyMode;ZZLne5;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/VehicleVersion;)Lco/bird/android/model/Vehicle;
    .locals 20

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    const-string v0, "device"

    move-object/from16 v18, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bird"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "energyMode"

    move-object/from16 v1, p6

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vehicleVersion"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v19, Lco/bird/android/model/Vehicle;

    move-object/from16 v0, v19

    move-object/from16 v1, v18

    invoke-direct/range {v0 .. v17}, Lco/bird/android/model/Vehicle;-><init>(Landroid/bluetooth/BluetoothDevice;Lco/bird/android/model/wire/WireBird;IIZLco/bird/android/model/constant/EnergyMode;ZZLne5;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/VehicleVersion;)V

    return-object v19
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/Vehicle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lco/bird/android/model/Vehicle;->device:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    check-cast p1, Lco/bird/android/model/Vehicle;

    iget-object p1, p1, Lco/bird/android/model/Vehicle;->device:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getAuthenticated()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/Vehicle;->authenticated:Z

    return v0
.end method

.method public final getBattery()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/Vehicle;->battery:I

    return v0
.end method

.method public final getBatteryForTracking()Ljava/lang/Integer;
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->bird:Lco/bird/android/model/wire/WireBird;

    invoke-static {v0}, Lco/bird/android/model/wire/WireBirdKt;->isBdCompatible(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget v0, p0, Lco/bird/android/model/Vehicle;->battery:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-lez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    move-object v1, v0

    :cond_2
    :goto_1
    return-object v1
.end method

.method public final getBeaconHash()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->beaconHash:Ljava/lang/String;

    return-object v0
.end method

.method public final getBird()Lco/bird/android/model/wire/WireBird;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->bird:Lco/bird/android/model/wire/WireBird;

    return-object v0
.end method

.method public final getConnected()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/Vehicle;->connected:Z

    return v0
.end method

.method public final getDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->device:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public final getDistance()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/Vehicle;->distance:I

    return v0
.end method

.method public final getDistanceForTracking()Ljava/lang/Integer;
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->bird:Lco/bird/android/model/wire/WireBird;

    invoke-static {v0}, Lco/bird/android/model/wire/WireBirdKt;->isBdCompatible(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget v0, p0, Lco/bird/android/model/Vehicle;->distance:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-lez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    move-object v1, v0

    :cond_2
    :goto_1
    return-object v1
.end method

.method public final getEnergyMode()Lco/bird/android/model/constant/EnergyMode;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->energyMode:Lco/bird/android/model/constant/EnergyMode;

    return-object v0
.end method

.method public final getFault()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->fault:Ljava/lang/String;

    return-object v0
.end method

.method public final getIccid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->iccid:Ljava/lang/String;

    return-object v0
.end method

.method public final getImei()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->imei:Ljava/lang/String;

    return-object v0
.end method

.method public final getLocked()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/Vehicle;->locked:Z

    return v0
.end method

.method public final getProximityUUID()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->proximityUUID:Ljava/lang/String;

    return-object v0
.end method

.method public final getRssi()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->rssi:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getRxDevice()Lne5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->rxDevice:Lne5;

    return-object v0
.end method

.method public final getSerialNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->serialNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getVehicleVersion()Lco/bird/android/model/persistence/VehicleVersion;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->vehicleVersion:Lco/bird/android/model/persistence/VehicleVersion;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->device:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final setAuthenticated(Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/model/Vehicle;->authenticated:Z

    return-void
.end method

.method public final setBattery(I)V
    .locals 0

    iput p1, p0, Lco/bird/android/model/Vehicle;->battery:I

    return-void
.end method

.method public final setBird(Lco/bird/android/model/wire/WireBird;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/model/Vehicle;->bird:Lco/bird/android/model/wire/WireBird;

    return-void
.end method

.method public final setConnected(Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/model/Vehicle;->connected:Z

    return-void
.end method

.method public final setDistance(I)V
    .locals 0

    iput p1, p0, Lco/bird/android/model/Vehicle;->distance:I

    return-void
.end method

.method public final setEnergyMode(Lco/bird/android/model/constant/EnergyMode;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/model/Vehicle;->energyMode:Lco/bird/android/model/constant/EnergyMode;

    return-void
.end method

.method public final setFault(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/model/Vehicle;->fault:Ljava/lang/String;

    return-void
.end method

.method public final setIccid(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/model/Vehicle;->iccid:Ljava/lang/String;

    return-void
.end method

.method public final setImei(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/model/Vehicle;->imei:Ljava/lang/String;

    return-void
.end method

.method public final setLocked(Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/model/Vehicle;->locked:Z

    return-void
.end method

.method public final setVehicleVersion(Lco/bird/android/model/persistence/VehicleVersion;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/model/Vehicle;->vehicleVersion:Lco/bird/android/model/persistence/VehicleVersion;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lco/bird/android/model/Vehicle;->device:Landroid/bluetooth/BluetoothDevice;

    iget-object v1, p0, Lco/bird/android/model/Vehicle;->bird:Lco/bird/android/model/wire/WireBird;

    iget-object v2, p0, Lco/bird/android/model/Vehicle;->vehicleVersion:Lco/bird/android/model/persistence/VehicleVersion;

    iget v3, p0, Lco/bird/android/model/Vehicle;->battery:I

    iget v4, p0, Lco/bird/android/model/Vehicle;->distance:I

    iget-boolean v5, p0, Lco/bird/android/model/Vehicle;->locked:Z

    iget-object v6, p0, Lco/bird/android/model/Vehicle;->energyMode:Lco/bird/android/model/constant/EnergyMode;

    iget-boolean v7, p0, Lco/bird/android/model/Vehicle;->authenticated:Z

    iget-object v8, p0, Lco/bird/android/model/Vehicle;->imei:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Vehicle(device="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bird="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", versions="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", battery="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", distance="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", locked="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", energyMode="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", authenticated="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", imei="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
