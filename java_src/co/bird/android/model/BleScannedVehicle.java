package co.bird.android.model;

import android.bluetooth.BluetoothDevice;
import co.bird.android.model.BlePayloadEncryptor;
import co.bird.android.model.constant.EnergyMode;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \"2\u00020\u0001:\u0001\"J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m28432d2 = {"Lco/bird/android/model/BleScannedVehicle;", "", "Lio/reactivex/Observable;", "Lco/bird/android/model/VehicleConnection;", "connect", "Lco/bird/android/model/BlePayloadEncryptor;", "payloadEncryptor", "Landroid/bluetooth/BluetoothDevice;", "getDevice", "()Landroid/bluetooth/BluetoothDevice;", "device", "", "getVersion", "()I", "version", "getBattery", "battery", "getDistance", "distance", "Lco/bird/android/model/constant/EnergyMode;", "getEnergyMode", "()Lco/bird/android/model/constant/EnergyMode;", "energyMode", "getRssi", "()Ljava/lang/Integer;", "rssi", "", "getImei", "()Ljava/lang/String;", "imei", "LCk5;", "getScanRecord", "()LCk5;", "scanRecord", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface BleScannedVehicle {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m28432d2 = {"Lco/bird/android/model/BleScannedVehicle$Companion;", "", "LK46;", "BLE_CONNECT_TIMEOUT", "LK46;", "getBLE_CONNECT_TIMEOUT", "()LK46;", "<init>", "()V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final K46 BLE_CONNECT_TIMEOUT = new K46(10, TimeUnit.SECONDS);

        private Companion() {
        }

        public final K46 getBLE_CONNECT_TIMEOUT() {
            return BLE_CONNECT_TIMEOUT;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static BlePayloadEncryptor payloadEncryptor(BleScannedVehicle bleScannedVehicle) {
            return new BlePayloadEncryptor() { // from class: co.bird.android.model.BleScannedVehicle$payloadEncryptor$1
                @Override // co.bird.android.model.BlePayloadEncryptor
                public AbstractC23442F<byte[]> decrypt(byte[] bArr, String str) {
                    return BlePayloadEncryptor.DefaultImpls.decrypt(this, bArr, str);
                }

                @Override // co.bird.android.model.BlePayloadEncryptor
                public AbstractC23442F<byte[]> encrypt(byte[] bArr, String str) {
                    return BlePayloadEncryptor.DefaultImpls.encrypt(this, bArr, str);
                }
            };
        }
    }

    Observable<VehicleConnection> connect();

    int getBattery();

    BluetoothDevice getDevice();

    int getDistance();

    EnergyMode getEnergyMode();

    String getImei();

    Integer getRssi();

    InterfaceC32176Ck5 getScanRecord();

    int getVersion();

    BlePayloadEncryptor payloadEncryptor();
}
