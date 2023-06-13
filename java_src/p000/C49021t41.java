package p000;

import android.bluetooth.BluetoothManager;
import io.reactivex.AbstractC23437E;
/* renamed from: t41  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49021t41 implements InterfaceC49405tj1<C48428s41> {

    /* renamed from: a */
    public final Z94<C50544ve5> f109799a;

    /* renamed from: b */
    public final Z94<C25174kX> f109800b;

    /* renamed from: c */
    public final Z94<String> f109801c;

    /* renamed from: d */
    public final Z94<BluetoothManager> f109802d;

    /* renamed from: e */
    public final Z94<AbstractC23437E> f109803e;

    /* renamed from: f */
    public final Z94<L46> f109804f;

    /* renamed from: g */
    public final Z94<InterfaceC51925xy0> f109805g;

    public C49021t41(Z94<C50544ve5> z94, Z94<C25174kX> z942, Z94<String> z943, Z94<BluetoothManager> z944, Z94<AbstractC23437E> z945, Z94<L46> z946, Z94<InterfaceC51925xy0> z947) {
        this.f109799a = z94;
        this.f109800b = z942;
        this.f109801c = z943;
        this.f109802d = z944;
        this.f109803e = z945;
        this.f109804f = z946;
        this.f109805g = z947;
    }

    /* renamed from: a */
    public static C49021t41 m13156a(Z94<C50544ve5> z94, Z94<C25174kX> z942, Z94<String> z943, Z94<BluetoothManager> z944, Z94<AbstractC23437E> z945, Z94<L46> z946, Z94<InterfaceC51925xy0> z947) {
        return new C49021t41(z94, z942, z943, z944, z945, z946, z947);
    }

    /* renamed from: c */
    public static C48428s41 m13154c(C50544ve5 c50544ve5, C25174kX c25174kX, String str, BluetoothManager bluetoothManager, AbstractC23437E abstractC23437E, L46 l46, InterfaceC51925xy0 interfaceC51925xy0) {
        return new C48428s41(c50544ve5, c25174kX, str, bluetoothManager, abstractC23437E, l46, interfaceC51925xy0);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C48428s41 get() {
        return m13154c(this.f109799a.get(), this.f109800b.get(), this.f109801c.get(), this.f109802d.get(), this.f109803e.get(), this.f109804f.get(), this.f109805g.get());
    }
}
