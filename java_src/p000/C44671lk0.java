package p000;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import p000.InterfaceC41706gk0;
/* renamed from: lk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44671lk0 implements InterfaceC49405tj1<BluetoothManager> {

    /* renamed from: a */
    public final Z94<Context> f96648a;

    public C44671lk0(Z94<Context> z94) {
        this.f96648a = z94;
    }

    /* renamed from: a */
    public static C44671lk0 m26897a(Z94<Context> z94) {
        return new C44671lk0(z94);
    }

    /* renamed from: c */
    public static BluetoothManager m26895c(Context context) {
        return (BluetoothManager) C52272yZ3.m3257d(InterfaceC41706gk0.AbstractC22421c.m37856e(context));
    }

    @Override // p000.Z94
    /* renamed from: b */
    public BluetoothManager get() {
        return m26895c(this.f96648a.get());
    }
}
