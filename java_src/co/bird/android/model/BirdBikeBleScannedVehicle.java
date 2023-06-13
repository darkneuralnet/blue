package co.bird.android.model;

import android.bluetooth.BluetoothDevice;
import co.bird.android.model.BirdBikeBleScannedVehicle;
import co.bird.android.model.VehicleConnection;
import co.bird.android.model.constant.EnergyMode;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b1\u00102J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100¨\u00063"}, m28432d2 = {"Lco/bird/android/model/BirdBikeBleScannedVehicle;", "Lco/bird/android/model/BleScannedVehicle;", "Lio/reactivex/Observable;", "Lco/bird/android/model/VehicleConnection;", "connect", "Lco/bird/android/model/BlePayloadEncryptor;", "payloadEncryptor", "Lco/bird/android/model/HJPayloadEncryptor;", "Lco/bird/android/model/HJPayloadEncryptor;", "Lne5;", "rxBleDevice", "Lne5;", "Landroid/bluetooth/BluetoothDevice;", "device", "Landroid/bluetooth/BluetoothDevice;", "getDevice", "()Landroid/bluetooth/BluetoothDevice;", "", "version", "I", "getVersion", "()I", "battery", "getBattery", "distance", "getDistance", "Lco/bird/android/model/constant/EnergyMode;", "energyMode", "Lco/bird/android/model/constant/EnergyMode;", "getEnergyMode", "()Lco/bird/android/model/constant/EnergyMode;", "rssi", "Ljava/lang/Integer;", "getRssi", "()Ljava/lang/Integer;", "", "imei", "Ljava/lang/String;", "getImei", "()Ljava/lang/String;", "LCk5;", "scanRecord", "LCk5;", "getScanRecord", "()LCk5;", "", "isEMEABike", "Z", "()Z", "<init>", "(Lco/bird/android/model/HJPayloadEncryptor;Lne5;Landroid/bluetooth/BluetoothDevice;IIILco/bird/android/model/constant/EnergyMode;Ljava/lang/Integer;Ljava/lang/String;LCk5;Z)V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BirdBikeBleScannedVehicle implements BleScannedVehicle {
    private final int battery;
    private final BluetoothDevice device;
    private final int distance;
    private final EnergyMode energyMode;
    private final String imei;
    private final boolean isEMEABike;
    private final HJPayloadEncryptor payloadEncryptor;
    private final Integer rssi;
    private final InterfaceC45802ne5 rxBleDevice;
    private final InterfaceC32176Ck5 scanRecord;
    private final int version;

    public BirdBikeBleScannedVehicle(HJPayloadEncryptor payloadEncryptor, InterfaceC45802ne5 rxBleDevice, BluetoothDevice device, int i, int i2, int i3, EnergyMode energyMode, Integer num, String str, InterfaceC32176Ck5 scanRecord, boolean z) {
        Intrinsics.checkNotNullParameter(payloadEncryptor, "payloadEncryptor");
        Intrinsics.checkNotNullParameter(rxBleDevice, "rxBleDevice");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(energyMode, "energyMode");
        Intrinsics.checkNotNullParameter(scanRecord, "scanRecord");
        this.payloadEncryptor = payloadEncryptor;
        this.rxBleDevice = rxBleDevice;
        this.device = device;
        this.version = i;
        this.battery = i2;
        this.distance = i3;
        this.energyMode = energyMode;
        this.rssi = num;
        this.imei = str;
        this.scanRecord = scanRecord;
        this.isEMEABike = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connect$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23434B connect$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VehicleConnection connect$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (VehicleConnection) tmp0.invoke(obj);
    }

    @Override // co.bird.android.model.BleScannedVehicle
    public Observable<VehicleConnection> connect() {
        Observable<InterfaceC44023ke5> mo17282c = this.rxBleDevice.mo17282c(false, BleScannedVehicle.Companion.getBLE_CONNECT_TIMEOUT());
        final BirdBikeBleScannedVehicle$connect$1 birdBikeBleScannedVehicle$connect$1 = BirdBikeBleScannedVehicle$connect$1.INSTANCE;
        Observable<InterfaceC44023ke5> doOnNext = mo17282c.doOnNext(new InterfaceC23484g() { // from class: cJ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BirdBikeBleScannedVehicle.connect$lambda$0(Function1.this, obj);
            }
        });
        final BirdBikeBleScannedVehicle$connect$2 birdBikeBleScannedVehicle$connect$2 = new BirdBikeBleScannedVehicle$connect$2(this);
        Observable<R> flatMap = doOnNext.flatMap(new InterfaceC23492o() { // from class: dJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B connect$lambda$1;
                connect$lambda$1 = BirdBikeBleScannedVehicle.connect$lambda$1(Function1.this, obj);
                return connect$lambda$1;
            }
        });
        final BirdBikeBleScannedVehicle$connect$3 birdBikeBleScannedVehicle$connect$3 = new BirdBikeBleScannedVehicle$connect$3(this);
        Observable<VehicleConnection> map = flatMap.map(new InterfaceC23492o() { // from class: eJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                VehicleConnection connect$lambda$2;
                connect$lambda$2 = BirdBikeBleScannedVehicle.connect$lambda$2(Function1.this, obj);
                return connect$lambda$2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun connect(): …payloadEncryptor()) }\n  }");
        return map;
    }

    @Override // co.bird.android.model.BleScannedVehicle
    public int getBattery() {
        return this.battery;
    }

    @Override // co.bird.android.model.BleScannedVehicle
    public BluetoothDevice getDevice() {
        return this.device;
    }

    @Override // co.bird.android.model.BleScannedVehicle
    public int getDistance() {
        return this.distance;
    }

    @Override // co.bird.android.model.BleScannedVehicle
    public EnergyMode getEnergyMode() {
        return this.energyMode;
    }

    @Override // co.bird.android.model.BleScannedVehicle
    public String getImei() {
        return this.imei;
    }

    @Override // co.bird.android.model.BleScannedVehicle
    public Integer getRssi() {
        return this.rssi;
    }

    @Override // co.bird.android.model.BleScannedVehicle
    public InterfaceC32176Ck5 getScanRecord() {
        return this.scanRecord;
    }

    @Override // co.bird.android.model.BleScannedVehicle
    public int getVersion() {
        return this.version;
    }

    public final boolean isEMEABike() {
        return this.isEMEABike;
    }

    @Override // co.bird.android.model.BleScannedVehicle
    public BlePayloadEncryptor payloadEncryptor() {
        return this.payloadEncryptor;
    }
}
