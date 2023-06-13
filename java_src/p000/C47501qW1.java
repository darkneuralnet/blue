package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import com.polidea.rxandroidble2.internal.BleIllegalOperationException;
import io.reactivex.AbstractC23461c;
import io.reactivex.functions.InterfaceC23478a;
/* renamed from: qW1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47501qW1 {

    /* renamed from: a */
    public final AbstractC48686sW1 f105360a;

    /* renamed from: qW1$a */
    /* loaded from: classes6.dex */
    public class C27610a implements InterfaceC23478a {

        /* renamed from: b */
        public final /* synthetic */ BluetoothGattCharacteristic f105361b;

        /* renamed from: c */
        public final /* synthetic */ int f105362c;

        public C27610a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            this.f105361b = bluetoothGattCharacteristic;
            this.f105362c = i;
        }

        @Override // io.reactivex.functions.InterfaceC23478a
        public void run() {
            BleIllegalOperationException mo14121a;
            int properties = this.f105361b.getProperties();
            int i = this.f105362c;
            if ((properties & i) == 0 && (mo14121a = C47501qW1.this.f105360a.mo14121a(this.f105361b, i)) != null) {
                throw mo14121a;
            }
        }
    }

    public C47501qW1(AbstractC48686sW1 abstractC48686sW1) {
        this.f105360a = abstractC48686sW1;
    }

    /* renamed from: a */
    public AbstractC23461c m17478a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        return AbstractC23461c.m33079G(new C27610a(bluetoothGattCharacteristic, i));
    }
}
