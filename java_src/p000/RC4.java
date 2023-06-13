package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: RC4 */
/* loaded from: classes3.dex */
public final class RC4 implements InterfaceC48812sj1<QC4> {

    /* renamed from: a */
    public final Y94<ScopeProvider> f31641a;

    /* renamed from: b */
    public final Y94<SC4> f31642b;

    /* renamed from: c */
    public final Y94<InterfaceC40099e13> f31643c;

    /* renamed from: d */
    public final Y94<InterfaceC52659zC4> f31644d;

    public RC4(Y94<ScopeProvider> y94, Y94<SC4> y942, Y94<InterfaceC40099e13> y943, Y94<InterfaceC52659zC4> y944) {
        this.f31641a = y94;
        this.f31642b = y942;
        this.f31643c = y943;
        this.f31644d = y944;
    }

    /* renamed from: a */
    public static RC4 m87201a(Y94<ScopeProvider> y94, Y94<SC4> y942, Y94<InterfaceC40099e13> y943, Y94<InterfaceC52659zC4> y944) {
        return new RC4(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static QC4 m87199c(ScopeProvider scopeProvider, SC4 sc4, InterfaceC40099e13 interfaceC40099e13, InterfaceC52659zC4 interfaceC52659zC4) {
        return new QC4(scopeProvider, sc4, interfaceC40099e13, interfaceC52659zC4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public QC4 get() {
        return m87199c(this.f31641a.get(), this.f31642b.get(), this.f31643c.get(), this.f31644d.get());
    }
}
