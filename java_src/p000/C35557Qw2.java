package p000;
/* renamed from: Qw2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35557Qw2 implements InterfaceC34855Nw2 {

    /* renamed from: a */
    public final C51765xi0 f31244a;

    /* renamed from: b */
    public final C31919Bi0 f31245b;

    /* renamed from: c */
    public final boolean f31246c;

    /* renamed from: d */
    public final int f31247d;

    /* renamed from: e */
    public final int f31248e;

    public C35557Qw2(C51765xi0 c51765xi0, C31919Bi0 c31919Bi0, int i, int i2, boolean z) {
        this.f31244a = c51765xi0;
        this.f31245b = c31919Bi0;
        this.f31247d = i;
        this.f31248e = i2;
        this.f31246c = z;
    }

    @Override // p000.InterfaceC34855Nw2
    /* renamed from: a */
    public boolean mo84592a() {
        return this.f31245b.m113662a();
    }

    @Override // p000.InterfaceC34855Nw2
    /* renamed from: b */
    public boolean mo84591b() {
        return !m87568c() || this.f31244a.m4861a();
    }

    /* renamed from: c */
    public final boolean m87568c() {
        return !this.f31246c && (this.f31248e >= 29 || this.f31247d >= 23);
    }
}
