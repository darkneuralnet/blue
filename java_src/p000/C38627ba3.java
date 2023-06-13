package p000;

import android.bluetooth.BluetoothGatt;
/* renamed from: ba3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38627ba3 implements InterfaceC49405tj1<C38034aa3> {

    /* renamed from: a */
    public final Z94<byte[]> f57717a;

    /* renamed from: b */
    public final Z94<byte[]> f57718b;

    /* renamed from: c */
    public final Z94<byte[]> f57719c;

    /* renamed from: d */
    public final Z94<BluetoothGatt> f57720d;

    /* renamed from: e */
    public final Z94<C50544ve5> f57721e;

    /* renamed from: f */
    public final Z94<A01> f57722f;

    public C38627ba3(Z94<byte[]> z94, Z94<byte[]> z942, Z94<byte[]> z943, Z94<BluetoothGatt> z944, Z94<C50544ve5> z945, Z94<A01> z946) {
        this.f57717a = z94;
        this.f57718b = z942;
        this.f57719c = z943;
        this.f57720d = z944;
        this.f57721e = z945;
        this.f57722f = z946;
    }

    /* renamed from: a */
    public static C38627ba3 m64345a(Z94<byte[]> z94, Z94<byte[]> z942, Z94<byte[]> z943, Z94<BluetoothGatt> z944, Z94<C50544ve5> z945, Z94<A01> z946) {
        return new C38627ba3(z94, z942, z943, z944, z945, z946);
    }

    /* renamed from: c */
    public static C38034aa3 m64343c(byte[] bArr, byte[] bArr2, byte[] bArr3, BluetoothGatt bluetoothGatt, C50544ve5 c50544ve5, Object obj) {
        return new C38034aa3(bArr, bArr2, bArr3, bluetoothGatt, c50544ve5, (A01) obj);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C38034aa3 get() {
        return m64343c(this.f57717a.get(), this.f57718b.get(), this.f57719c.get(), this.f57720d.get(), this.f57721e.get(), this.f57722f.get());
    }
}
