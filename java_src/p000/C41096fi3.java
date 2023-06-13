package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import io.reactivex.AbstractC23437E;
import java.util.concurrent.TimeUnit;
/* renamed from: fi3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C41096fi3 implements InterfaceC40503ei3 {

    /* renamed from: a */
    public final C50544ve5 f80477a;

    /* renamed from: b */
    public final BluetoothGatt f80478b;

    /* renamed from: c */
    public final C35332Px2 f80479c;

    /* renamed from: d */
    public final L46 f80480d;

    /* renamed from: e */
    public final AbstractC23437E f80481e;

    /* renamed from: f */
    public final AbstractC23437E f80482f;

    /* renamed from: g */
    public final Z94<C35982Sr4> f80483g;

    public C41096fi3(C50544ve5 c50544ve5, BluetoothGatt bluetoothGatt, C35332Px2 c35332Px2, L46 l46, AbstractC23437E abstractC23437E, AbstractC23437E abstractC23437E2, Z94<C35982Sr4> z94) {
        this.f80477a = c50544ve5;
        this.f80478b = bluetoothGatt;
        this.f80479c = c35332Px2;
        this.f80480d = l46;
        this.f80481e = abstractC23437E;
        this.f80482f = abstractC23437E2;
        this.f80483g = z94;
    }

    @Override // p000.InterfaceC40503ei3
    /* renamed from: a */
    public C52538z01 mo41009a(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        return new C52538z01(this.f80477a, this.f80478b, this.f80480d, 2, bluetoothGattDescriptor, bArr);
    }

    @Override // p000.InterfaceC40503ei3
    /* renamed from: b */
    public C37405Yt5 mo41008b(long j, TimeUnit timeUnit) {
        return new C37405Yt5(this.f80477a, this.f80478b, this.f80479c, new L46(j, timeUnit, this.f80482f));
    }

    @Override // p000.InterfaceC40503ei3
    /* renamed from: c */
    public C41093fi0 mo41007c(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return new C41093fi0(this.f80477a, this.f80478b, this.f80480d, bluetoothGattCharacteristic, bArr);
    }
}
