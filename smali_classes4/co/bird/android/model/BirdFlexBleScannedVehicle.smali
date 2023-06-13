.class public final Lco/bird/android/model/BirdFlexBleScannedVehicle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/BleScannedVehicle;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008)\u0010*J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000f\u001a\u0004\u0008\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u000f\u001a\u0004\u0008\u0015\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(\u00a8\u0006+"
    }
    d2 = {
        "Lco/bird/android/model/BirdFlexBleScannedVehicle;",
        "Lco/bird/android/model/BleScannedVehicle;",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/VehicleConnection;",
        "connect",
        "Lne5;",
        "rxBleDevice",
        "Lne5;",
        "Landroid/bluetooth/BluetoothDevice;",
        "device",
        "Landroid/bluetooth/BluetoothDevice;",
        "getDevice",
        "()Landroid/bluetooth/BluetoothDevice;",
        "",
        "version",
        "I",
        "getVersion",
        "()I",
        "battery",
        "getBattery",
        "distance",
        "getDistance",
        "Lco/bird/android/model/constant/EnergyMode;",
        "energyMode",
        "Lco/bird/android/model/constant/EnergyMode;",
        "getEnergyMode",
        "()Lco/bird/android/model/constant/EnergyMode;",
        "rssi",
        "Ljava/lang/Integer;",
        "getRssi",
        "()Ljava/lang/Integer;",
        "",
        "imei",
        "Ljava/lang/String;",
        "getImei",
        "()Ljava/lang/String;",
        "LCk5;",
        "scanRecord",
        "LCk5;",
        "getScanRecord",
        "()LCk5;",
        "<init>",
        "(Lne5;Landroid/bluetooth/BluetoothDevice;IIILco/bird/android/model/constant/EnergyMode;Ljava/lang/Integer;Ljava/lang/String;LCk5;)V",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final battery:I

.field private final device:Landroid/bluetooth/BluetoothDevice;

.field private final distance:I

.field private final energyMode:Lco/bird/android/model/constant/EnergyMode;

.field private final imei:Ljava/lang/String;

.field private final rssi:Ljava/lang/Integer;

.field private final rxBleDevice:Lne5;

.field private final scanRecord:LCk5;

.field private final version:I


# direct methods
.method public constructor <init>(Lne5;Landroid/bluetooth/BluetoothDevice;IIILco/bird/android/model/constant/EnergyMode;Ljava/lang/Integer;Ljava/lang/String;LCk5;)V
    .locals 1

    const-string v0, "rxBleDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "device"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "energyMode"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scanRecord"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/BirdFlexBleScannedVehicle;->rxBleDevice:Lne5;

    iput-object p2, p0, Lco/bird/android/model/BirdFlexBleScannedVehicle;->device:Landroid/bluetooth/BluetoothDevice;

    iput p3, p0, Lco/bird/android/model/BirdFlexBleScannedVehicle;->version:I

    iput p4, p0, Lco/bird/android/model/BirdFlexBleScannedVehicle;->battery:I

    iput p5, p0, Lco/bird/android/model/BirdFlexBleScannedVehicle;->distance:I

    iput-object p6, p0, Lco/bird/android/model/BirdFlexBleScannedVehicle;->energyMode:Lco/bird/android/model/constant/EnergyMode;

    iput-object p7, p0, Lco/bird/android/model/BirdFlexBleScannedVehicle;->rssi:Ljava/lang/Integer;

    iput-object p8, p0, Lco/bird/android/model/BirdFlexBleScannedVehicle;->imei:Ljava/lang/String;

    iput-object p9, p0, Lco/bird/android/model/BirdFlexBleScannedVehicle;->scanRecord:LCk5;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/VehicleConnection;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/model/BirdFlexBleScannedVehicle;->connect$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/VehicleConnection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getRxBleDevice$p(Lco/bird/android/model/BirdFlexBleScannedVehicle;)Lne5;
    .locals 0

    iget-object p0, p0, Lco/bird/android/model/BirdFlexBleScannedVehicle;->rxBleDevice:Lne5;

    return-object p0
.end method

.method private static final connect$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/VehicleConnection;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/VehicleConnection;

    return-object p0
.end method


# virtual methods
.method public connect()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/VehicleConnection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/BirdFlexBleScannedVehicle;->rxBleDevice:Lne5;

    sget-object v1, Lco/bird/android/model/BleScannedVehicle;->Companion:Lco/bird/android/model/BleScannedVehicle$Companion;

    invoke-virtual {v1}, Lco/bird/android/model/BleScannedVehicle$Companion;->getBLE_CONNECT_TIMEOUT()LK46;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lne5;->c(ZLK46;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/BirdFlexBleScannedVehicle$connect$1;

    invoke-direct {v1, p0}, Lco/bird/android/model/BirdFlexBleScannedVehicle$connect$1;-><init>(Lco/bird/android/model/BirdFlexBleScannedVehicle;)V

    new-instance v2, LLL;

    invoke-direct {v2, v1}, LLL;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "override fun connect(): \u2026payloadEncryptor()) }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getBattery()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/BirdFlexBleScannedVehicle;->battery:I

    return v0
.end method

.method public getDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdFlexBleScannedVehicle;->device:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public getDistance()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/BirdFlexBleScannedVehicle;->distance:I

    return v0
.end method

.method public getEnergyMode()Lco/bird/android/model/constant/EnergyMode;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdFlexBleScannedVehicle;->energyMode:Lco/bird/android/model/constant/EnergyMode;

    return-object v0
.end method

.method public getImei()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdFlexBleScannedVehicle;->imei:Ljava/lang/String;

    return-object v0
.end method

.method public getRssi()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdFlexBleScannedVehicle;->rssi:Ljava/lang/Integer;

    return-object v0
.end method

.method public getScanRecord()LCk5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/BirdFlexBleScannedVehicle;->scanRecord:LCk5;

    return-object v0
.end method

.method public getVersion()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/BirdFlexBleScannedVehicle;->version:I

    return v0
.end method

.method public payloadEncryptor()Lco/bird/android/model/BlePayloadEncryptor;
    .locals 1

    invoke-static {p0}, Lco/bird/android/model/BleScannedVehicle$DefaultImpls;->payloadEncryptor(Lco/bird/android/model/BleScannedVehicle;)Lco/bird/android/model/BlePayloadEncryptor;

    move-result-object v0

    return-object v0
.end method
