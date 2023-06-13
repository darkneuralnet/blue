package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: YA6 */
/* loaded from: classes3.dex */
public final class YA6 implements InterfaceC48812sj1<XA6> {

    /* renamed from: a */
    public final Y94<ZA6> f44743a;

    /* renamed from: b */
    public final Y94<ScopeProvider> f44744b;

    /* renamed from: c */
    public final Y94<InterfaceC40099e13> f44745c;

    /* renamed from: d */
    public final Y94<XY3> f44746d;

    /* renamed from: e */
    public final Y94<C43038iy6> f44747e;

    /* renamed from: f */
    public final Y94<C51174wi2> f44748f;

    public YA6(Y94<ZA6> y94, Y94<ScopeProvider> y942, Y94<InterfaceC40099e13> y943, Y94<XY3> y944, Y94<C43038iy6> y945, Y94<C51174wi2> y946) {
        this.f44743a = y94;
        this.f44744b = y942;
        this.f44745c = y943;
        this.f44746d = y944;
        this.f44747e = y945;
        this.f44748f = y946;
    }

    /* renamed from: a */
    public static YA6 m75476a(Y94<ZA6> y94, Y94<ScopeProvider> y942, Y94<InterfaceC40099e13> y943, Y94<XY3> y944, Y94<C43038iy6> y945, Y94<C51174wi2> y946) {
        return new YA6(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static XA6 m75474c(ZA6 za6, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13, XY3 xy3, C43038iy6 c43038iy6, C51174wi2 c51174wi2) {
        return new XA6(za6, scopeProvider, interfaceC40099e13, xy3, c43038iy6, c51174wi2);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public XA6 get() {
        return m75474c(this.f44743a.get(), this.f44744b.get(), this.f44745c.get(), this.f44746d.get(), this.f44747e.get(), this.f44748f.get());
    }
}
