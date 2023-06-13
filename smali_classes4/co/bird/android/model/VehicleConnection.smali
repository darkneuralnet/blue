.class public interface abstract Lco/bird/android/model/VehicleConnection;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/VehicleConnection$Companion;,
        Lco/bird/android/model/VehicleConnection$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008f\u0018\u0000 G2\u00020\u0001:\u0001GJ\u0016\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0008\u0010\u0007\u001a\u00020\u0006H&J\u0008\u0010\u0008\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000cH&J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH&J\u0008\u0010\u0012\u001a\u00020\u0006H&J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00150\u00152\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0002H&J \u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u000cH&J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000cH\u0016J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\tH&J\u0008\u0010!\u001a\u00020\u0006H\u0016J\u0010\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\tH\u0016J\u0008\u0010%\u001a\u00020\u0006H\u0016J\u0008\u0010&\u001a\u00020\u0006H\u0016J\u0008\u0010\'\u001a\u00020\u0006H\u0016J\u0008\u0010(\u001a\u00020\u0006H\u0016J\u0008\u0010)\u001a\u00020\u0006H\u0016J\u0008\u0010*\u001a\u00020\u0006H\u0016J\u0008\u0010+\u001a\u00020\u0006H\u0016J\u0018\u0010/\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\t2\u0006\u0010.\u001a\u00020-H\u0016J\u0012\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u000c00*\u00020\tH\u0016J\u000c\u00101\u001a\u00020\u000c*\u000202H\u0016J \u00107\u001a\u00020\t2\u0006\u00103\u001a\u00020\t2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204H\u0002R\u0014\u0010;\u001a\u0002088&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00089\u0010:R\u0014\u0010?\u001a\u00020<8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010>R\u0014\u0010C\u001a\u00020@8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008A\u0010BR\u0016\u0010F\u001a\u0004\u0018\u00010\u000c8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010E\u00a8\u0006H"
    }
    d2 = {
        "Lco/bird/android/model/VehicleConnection;",
        "",
        "",
        "enabled",
        "Lio/reactivex/F;",
        "deepSleep",
        "Lio/reactivex/c;",
        "firmwareInquiry",
        "initiateChallenge",
        "",
        "command",
        "sendOTAUpdateCommand",
        "",
        "passcode",
        "sendPasscode",
        "Lco/bird/android/model/constant/VehicleSpeedMode;",
        "speedMode",
        "setSpeedMode",
        "softReset",
        "Lfd3;",
        "mode",
        "Lio/reactivex/Observable;",
        "subscribeToNotifications",
        "lightsOn",
        "toggleLights",
        "Lco/bird/android/model/LockKind;",
        "lockKind",
        "locking",
        "token",
        "unlock",
        "alarm",
        "byteArray",
        "writeRaw",
        "requestToken",
        "currentSessionToken",
        "",
        "setCurrentSessionToken",
        "refreshStatus",
        "resetTripOdometer",
        "resetTotalOdometer",
        "resetServiceIndicator",
        "queryDisplayFirmware",
        "queryECUFirmware",
        "queryBMSFirmware",
        "data",
        "Ljava/util/UUID;",
        "characteristicUuid",
        "writeData",
        "",
        "toHex",
        "",
        "src",
        "",
        "startIndex",
        "count",
        "subBytes",
        "Lke5;",
        "getRxBleConnection",
        "()Lke5;",
        "rxBleConnection",
        "Lne5;",
        "getRxBleDevice",
        "()Lne5;",
        "rxBleDevice",
        "Lco/bird/android/model/BlePayloadEncryptor;",
        "getBluetoothEncryptor",
        "()Lco/bird/android/model/BlePayloadEncryptor;",
        "bluetoothEncryptor",
        "getDeviceName",
        "()Ljava/lang/String;",
        "deviceName",
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
.field public static final BLE_MAX_DATA_LENGTH:I = 0x10

.field public static final BLE_WRITE_CHUNK_DELAY_MILLIS:J = 0x64L

.field public static final Companion:Lco/bird/android/model/VehicleConnection$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lco/bird/android/model/VehicleConnection$Companion;->$$INSTANCE:Lco/bird/android/model/VehicleConnection$Companion;

    sput-object v0, Lco/bird/android/model/VehicleConnection;->Companion:Lco/bird/android/model/VehicleConnection$Companion;

    return-void
.end method


# virtual methods
.method public abstract alarm(Ljava/lang/String;)Lio/reactivex/c;
.end method

.method public abstract deepSleep(Z)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/VehicleConnection;",
            ">;"
        }
    .end annotation
.end method

.method public abstract firmwareInquiry()Lio/reactivex/c;
.end method

.method public abstract getBluetoothEncryptor()Lco/bird/android/model/BlePayloadEncryptor;
.end method

.method public abstract getDeviceName()Ljava/lang/String;
.end method

.method public abstract getRxBleConnection()Lke5;
.end method

.method public abstract getRxBleDevice()Lne5;
.end method

.method public abstract initiateChallenge()Lio/reactivex/c;
.end method

.method public abstract queryBMSFirmware()Lio/reactivex/c;
.end method

.method public abstract queryDisplayFirmware()Lio/reactivex/c;
.end method

.method public abstract queryECUFirmware()Lio/reactivex/c;
.end method

.method public abstract refreshStatus()Lio/reactivex/c;
.end method

.method public abstract requestToken()Lio/reactivex/c;
.end method

.method public abstract resetServiceIndicator()Lio/reactivex/c;
.end method

.method public abstract resetTotalOdometer()Lio/reactivex/c;
.end method

.method public abstract resetTripOdometer()Lio/reactivex/c;
.end method

.method public abstract sendOTAUpdateCommand([B)Lio/reactivex/c;
.end method

.method public abstract sendPasscode(Ljava/lang/String;)Lio/reactivex/c;
.end method

.method public abstract setCurrentSessionToken([B)V
.end method

.method public abstract setSpeedMode(Lco/bird/android/model/constant/VehicleSpeedMode;)Lio/reactivex/c;
.end method

.method public abstract softReset()Lio/reactivex/c;
.end method

.method public abstract subscribeToNotifications(Lfd3;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfd3;",
            ")",
            "Lio/reactivex/Observable<",
            "Lio/reactivex/Observable<",
            "[B>;>;"
        }
    .end annotation
.end method

.method public abstract toHex(B)Ljava/lang/String;
.end method

.method public abstract toHex([B)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract toggleLights(Z)Lio/reactivex/c;
.end method

.method public abstract unlock(Lco/bird/android/model/LockKind;ZLjava/lang/String;)Lio/reactivex/c;
.end method

.method public abstract writeData([BLjava/util/UUID;)Lio/reactivex/c;
.end method

.method public abstract writeRaw([B)Lio/reactivex/c;
.end method
