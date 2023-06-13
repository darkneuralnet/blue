.class public interface abstract Lco/bird/android/model/BleScannedVehicle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/BleScannedVehicle$Companion;,
        Lco/bird/android/model/BleScannedVehicle$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u0000 \"2\u00020\u0001:\u0001\"J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0008\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\u00078&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00138&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006#"
    }
    d2 = {
        "Lco/bird/android/model/BleScannedVehicle;",
        "",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/VehicleConnection;",
        "connect",
        "Lco/bird/android/model/BlePayloadEncryptor;",
        "payloadEncryptor",
        "Landroid/bluetooth/BluetoothDevice;",
        "getDevice",
        "()Landroid/bluetooth/BluetoothDevice;",
        "device",
        "",
        "getVersion",
        "()I",
        "version",
        "getBattery",
        "battery",
        "getDistance",
        "distance",
        "Lco/bird/android/model/constant/EnergyMode;",
        "getEnergyMode",
        "()Lco/bird/android/model/constant/EnergyMode;",
        "energyMode",
        "getRssi",
        "()Ljava/lang/Integer;",
        "rssi",
        "",
        "getImei",
        "()Ljava/lang/String;",
        "imei",
        "LCk5;",
        "getScanRecord",
        "()LCk5;",
        "scanRecord",
        "Companion",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lco/bird/android/model/BleScannedVehicle$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lco/bird/android/model/BleScannedVehicle$Companion;->$$INSTANCE:Lco/bird/android/model/BleScannedVehicle$Companion;

    sput-object v0, Lco/bird/android/model/BleScannedVehicle;->Companion:Lco/bird/android/model/BleScannedVehicle$Companion;

    return-void
.end method


# virtual methods
.method public abstract connect()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/VehicleConnection;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getBattery()I
.end method

.method public abstract getDevice()Landroid/bluetooth/BluetoothDevice;
.end method

.method public abstract getDistance()I
.end method

.method public abstract getEnergyMode()Lco/bird/android/model/constant/EnergyMode;
.end method

.method public abstract getImei()Ljava/lang/String;
.end method

.method public abstract getRssi()Ljava/lang/Integer;
.end method

.method public abstract getScanRecord()LCk5;
.end method

.method public abstract getVersion()I
.end method

.method public abstract payloadEncryptor()Lco/bird/android/model/BlePayloadEncryptor;
.end method
