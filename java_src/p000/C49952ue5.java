package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.polidea.rxandroidble2.exceptions.BleCharacteristicNotFoundException;
import io.reactivex.AbstractC23442F;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
/* renamed from: ue5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C49952ue5 {

    /* renamed from: a */
    public final List<BluetoothGattService> f112706a;

    /* renamed from: ue5$a */
    /* loaded from: classes6.dex */
    public class CallableC29274a implements Callable<BluetoothGattCharacteristic> {

        /* renamed from: b */
        public final /* synthetic */ UUID f112707b;

        public CallableC29274a(UUID uuid) {
            this.f112707b = uuid;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public BluetoothGattCharacteristic call() {
            for (BluetoothGattService bluetoothGattService : C49952ue5.this.f112706a) {
                BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(this.f112707b);
                if (characteristic != null) {
                    return characteristic;
                }
            }
            throw new BleCharacteristicNotFoundException(this.f112707b);
        }
    }

    public C49952ue5(List<BluetoothGattService> list) {
        this.f112706a = list;
    }

    /* renamed from: a */
    public List<BluetoothGattService> m9923a() {
        return this.f112706a;
    }

    /* renamed from: b */
    public AbstractC23442F<BluetoothGattCharacteristic> m9922b(UUID uuid) {
        return AbstractC23442F.m33161E(new CallableC29274a(uuid));
    }
}
