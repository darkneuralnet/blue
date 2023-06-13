package p000;

import android.bluetooth.BluetoothGatt;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: kX */
/* loaded from: classes6.dex */
public class C25174kX {

    /* renamed from: a */
    public final AtomicReference<BluetoothGatt> f94469a = new AtomicReference<>();

    /* renamed from: a */
    public BluetoothGatt m28871a() {
        return this.f94469a.get();
    }

    /* renamed from: b */
    public void m28870b(BluetoothGatt bluetoothGatt) {
        C42482i24.m35337a(this.f94469a, null, bluetoothGatt);
    }
}
