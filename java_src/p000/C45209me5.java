package p000;

import android.bluetooth.BluetoothGatt;
import io.reactivex.AbstractC23437E;
/* renamed from: me5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45209me5 implements InterfaceC49405tj1<C44616le5> {

    /* renamed from: a */
    public final Z94<InterfaceC47776qy0> f98497a;

    /* renamed from: b */
    public final Z94<C50544ve5> f98498b;

    /* renamed from: c */
    public final Z94<BluetoothGatt> f98499c;

    /* renamed from: d */
    public final Z94<C36001St5> f98500d;

    /* renamed from: e */
    public final Z94<C38034aa3> f98501e;

    /* renamed from: f */
    public final Z94<InterfaceC46316oW2> f98502f;

    /* renamed from: g */
    public final Z94<A01> f98503g;

    /* renamed from: h */
    public final Z94<InterfaceC40503ei3> f98504h;

    /* renamed from: i */
    public final Z94<Object> f98505i;

    /* renamed from: j */
    public final Z94<AbstractC23437E> f98506j;

    /* renamed from: k */
    public final Z94<C47501qW1> f98507k;

    public C45209me5(Z94<InterfaceC47776qy0> z94, Z94<C50544ve5> z942, Z94<BluetoothGatt> z943, Z94<C36001St5> z944, Z94<C38034aa3> z945, Z94<InterfaceC46316oW2> z946, Z94<A01> z947, Z94<InterfaceC40503ei3> z948, Z94<Object> z949, Z94<AbstractC23437E> z9410, Z94<C47501qW1> z9411) {
        this.f98497a = z94;
        this.f98498b = z942;
        this.f98499c = z943;
        this.f98500d = z944;
        this.f98501e = z945;
        this.f98502f = z946;
        this.f98503g = z947;
        this.f98504h = z948;
        this.f98505i = z949;
        this.f98506j = z9410;
        this.f98507k = z9411;
    }

    /* renamed from: a */
    public static C45209me5 m25236a(Z94<InterfaceC47776qy0> z94, Z94<C50544ve5> z942, Z94<BluetoothGatt> z943, Z94<C36001St5> z944, Z94<C38034aa3> z945, Z94<InterfaceC46316oW2> z946, Z94<A01> z947, Z94<InterfaceC40503ei3> z948, Z94<Object> z949, Z94<AbstractC23437E> z9410, Z94<C47501qW1> z9411) {
        return new C45209me5(z94, z942, z943, z944, z945, z946, z947, z948, z949, z9410, z9411);
    }

    /* renamed from: c */
    public static C44616le5 m25234c(InterfaceC47776qy0 interfaceC47776qy0, C50544ve5 c50544ve5, BluetoothGatt bluetoothGatt, Object obj, Object obj2, Object obj3, Object obj4, InterfaceC40503ei3 interfaceC40503ei3, Z94<Object> z94, AbstractC23437E abstractC23437E, C47501qW1 c47501qW1) {
        return new C44616le5(interfaceC47776qy0, c50544ve5, bluetoothGatt, (C36001St5) obj, (C38034aa3) obj2, (InterfaceC46316oW2) obj3, (A01) obj4, interfaceC40503ei3, z94, abstractC23437E, c47501qW1);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C44616le5 get() {
        return m25234c(this.f98497a.get(), this.f98498b.get(), this.f98499c.get(), this.f98500d.get(), this.f98501e.get(), this.f98502f.get(), this.f98503g.get(), this.f98504h.get(), this.f98505i, this.f98506j.get(), this.f98507k.get());
    }
}
