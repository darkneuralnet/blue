package p000;

import android.bluetooth.BluetoothAdapter;
/* renamed from: ij */
/* loaded from: classes4.dex */
public final class C23330ij implements InterfaceC48812sj1<BluetoothAdapter> {

    /* renamed from: a */
    public final C22711hj f87787a;

    public C23330ij(C22711hj c22711hj) {
        this.f87787a = c22711hj;
    }

    /* renamed from: a */
    public static BluetoothAdapter m33535a(C22711hj c22711hj) {
        return c22711hj.m36007a();
    }

    /* renamed from: b */
    public static C23330ij m33534b(C22711hj c22711hj) {
        return new C23330ij(c22711hj);
    }

    @Override // p000.Y94
    /* renamed from: c */
    public BluetoothAdapter get() {
        return m33535a(this.f87787a);
    }
}
