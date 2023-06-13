package co.bird.android.model;

import android.bluetooth.BluetoothDevice;
import co.bird.android.model.BirdFlexBleScannedVehicle;
import co.bird.android.model.BleScannedVehicle;
import co.bird.android.model.VehicleConnection;
import co.bird.android.model.constant.EnergyMode;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\r\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b)\u0010*J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, m28432d2 = {"Lco/bird/android/model/BirdFlexBleScannedVehicle;", "Lco/bird/android/model/BleScannedVehicle;", "Lio/reactivex/Observable;", "Lco/bird/android/model/VehicleConnection;", "connect", "Lne5;", "rxBleDevice", "Lne5;", "Landroid/bluetooth/BluetoothDevice;", "device", "Landroid/bluetooth/BluetoothDevice;", "getDevice", "()Landroid/bluetooth/BluetoothDevice;", "", "version", "I", "getVersion", "()I", "battery", "getBattery", "distance", "getDistance", "Lco/bird/android/model/constant/EnergyMode;", "energyMode", "Lco/bird/android/model/constant/EnergyMode;", "getEnergyMode", "()Lco/bird/android/model/constant/EnergyMode;", "rssi", "Ljava/lang/Integer;", "getRssi", "()Ljava/lang/Integer;", "", "imei", "Ljava/lang/String;", "getImei", "()Ljava/lang/String;", "LCk5;", "scanRecord", "LCk5;", "getScanRecord", "()LCk5;", "<init>", "(Lne5;Landroid/bluetooth/BluetoothDevice;IIILco/bird/android/model/constant/EnergyMode;Ljava/lang/Integer;Ljava/lang/String;LCk5;)V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BirdFlexBleScannedVehicle implements BleScannedVehicle {
    private final int battery;
    private final BluetoothDevice device;
    private final int distance;
    private final EnergyMode energyMode;
    private final String imei;
    private final Integer rssi;
    private final InterfaceC45802ne5 rxBleDevice;
    private final InterfaceC32176Ck5 scanRecord;
    private final int version;

    public BirdFlexBleScannedVehicle(InterfaceC45802ne5 rxBleDevice, BluetoothDevice device, int i, int i2, int i3, EnergyMode energyMode, Integer num, String str, InterfaceC32176Ck5 scanRecord) {
        Intrinsics.checkNotNullParameter(rxBleDevice, "rxBleDevice");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(energyMode, "energyMode");
        Intrinsics.checkNotNullParameter(scanRecord, "scanRecord");
        this.rxBleDevice = rxBleDevice;
        this.device = device;
        this.version = i;
        this.battery = i2;
        this.distance = i3;
        this.energyMode = energyMode;
        this.rssi = num;
        this.imei = str;
        this.scanRecord = scanRecord;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VehicleConnection connect$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (VehicleConnection) tmp0.invoke(obj);
    }

    @Override // co.bird.android.model.BleScannedVehicle
    public Observable<VehicleConnection> connect() {
        Observable<InterfaceC44023ke5> mo17282c = this.rxBleDevice.mo17282c(false, BleScannedVehicle.Companion.getBLE_CONNECT_TIMEOUT());
        final BirdFlexBleScannedVehicle$connect$1 birdFlexBleScannedVehicle$connect$1 = new BirdFlexBleScannedVehicle$connect$1(this);
        Observable map = mo17282c.map(new InterfaceC23492o() { // from class: LL
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                VehicleConnection connect$lambda$0;
                connect$lambda$0 = BirdFlexBleScannedVehicle.connect$lambda$0(Function1.this, obj);
                return connect$lambda$0;
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

    @Override // co.bird.android.model.BleScannedVehicle
    public BlePayloadEncryptor payloadEncryptor() {
        return BleScannedVehicle.DefaultImpls.payloadEncryptor(this);
    }
}
