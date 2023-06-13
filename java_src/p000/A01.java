package p000;

import android.bluetooth.BluetoothGattDescriptor;
import io.reactivex.AbstractC23461c;
/* renamed from: A01 */
/* loaded from: classes6.dex */
public class A01 {

    /* renamed from: a */
    public final InterfaceC47776qy0 f2a;

    /* renamed from: b */
    public final InterfaceC40503ei3 f3b;

    public A01(InterfaceC47776qy0 interfaceC47776qy0, InterfaceC40503ei3 interfaceC40503ei3) {
        this.f2a = interfaceC47776qy0;
        this.f3b = interfaceC40503ei3;
    }

    /* renamed from: a */
    public AbstractC23461c m116204a(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        return this.f2a.mo14979a(this.f3b.mo41009a(bluetoothGattDescriptor, bArr)).ignoreElements();
    }
}
