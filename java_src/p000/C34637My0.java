package p000;

import io.reactivex.AbstractC23437E;
import p000.InterfaceC41846gy0;
/* renamed from: My0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34637My0 implements InterfaceC49405tj1<C34403Ly0> {

    /* renamed from: a */
    public final Z94<InterfaceC34043Kk0> f23884a;

    /* renamed from: b */
    public final Z94<InterfaceC41846gy0.InterfaceC22520a> f23885b;

    /* renamed from: c */
    public final Z94<AbstractC23437E> f23886c;

    public C34637My0(Z94<InterfaceC34043Kk0> z94, Z94<InterfaceC41846gy0.InterfaceC22520a> z942, Z94<AbstractC23437E> z943) {
        this.f23884a = z94;
        this.f23885b = z942;
        this.f23886c = z943;
    }

    /* renamed from: a */
    public static C34637My0 m94541a(Z94<InterfaceC34043Kk0> z94, Z94<InterfaceC41846gy0.InterfaceC22520a> z942, Z94<AbstractC23437E> z943) {
        return new C34637My0(z94, z942, z943);
    }

    /* renamed from: c */
    public static C34403Ly0 m94539c(InterfaceC34043Kk0 interfaceC34043Kk0, InterfaceC41846gy0.InterfaceC22520a interfaceC22520a, AbstractC23437E abstractC23437E) {
        return new C34403Ly0(interfaceC34043Kk0, interfaceC22520a, abstractC23437E);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C34403Ly0 get() {
        return m94539c(this.f23884a.get(), this.f23885b.get(), this.f23886c.get());
    }
}
