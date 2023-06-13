package co.bird.android.feature.rider.birdpay.confirmation;

import co.bird.android.feature.rider.birdpay.confirmation.C15347e;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.rider.birdpay.confirmation.f */
/* loaded from: classes3.dex */
public final class C15359f implements InterfaceC48812sj1<C15347e> {

    /* renamed from: a */
    public final Y94<C15347e.C15349b> f64924a;

    /* renamed from: b */
    public final Y94<InterfaceC39094cM3> f64925b;

    /* renamed from: c */
    public final Y94<ScopeProvider> f64926c;

    /* renamed from: d */
    public final Y94<InterfaceC1880Ea> f64927d;

    /* renamed from: e */
    public final Y94<InterfaceC23227iO> f64928e;

    /* renamed from: f */
    public final Y94<C22454gl> f64929f;

    /* renamed from: g */
    public final Y94<InterfaceC40099e13> f64930g;

    /* renamed from: h */
    public final Y94<C36207Tq4> f64931h;

    public C15359f(Y94<C15347e.C15349b> y94, Y94<InterfaceC39094cM3> y942, Y94<ScopeProvider> y943, Y94<InterfaceC1880Ea> y944, Y94<InterfaceC23227iO> y945, Y94<C22454gl> y946, Y94<InterfaceC40099e13> y947, Y94<C36207Tq4> y948) {
        this.f64924a = y94;
        this.f64925b = y942;
        this.f64926c = y943;
        this.f64927d = y944;
        this.f64928e = y945;
        this.f64929f = y946;
        this.f64930g = y947;
        this.f64931h = y948;
    }

    /* renamed from: a */
    public static C15359f m57315a(Y94<C15347e.C15349b> y94, Y94<InterfaceC39094cM3> y942, Y94<ScopeProvider> y943, Y94<InterfaceC1880Ea> y944, Y94<InterfaceC23227iO> y945, Y94<C22454gl> y946, Y94<InterfaceC40099e13> y947, Y94<C36207Tq4> y948) {
        return new C15359f(y94, y942, y943, y944, y945, y946, y947, y948);
    }

    /* renamed from: c */
    public static C15347e m57313c(C15347e.C15349b c15349b, InterfaceC39094cM3 interfaceC39094cM3, ScopeProvider scopeProvider, InterfaceC1880Ea interfaceC1880Ea, InterfaceC23227iO interfaceC23227iO, C22454gl c22454gl, InterfaceC40099e13 interfaceC40099e13, C36207Tq4 c36207Tq4) {
        return new C15347e(c15349b, interfaceC39094cM3, scopeProvider, interfaceC1880Ea, interfaceC23227iO, c22454gl, interfaceC40099e13, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C15347e get() {
        return m57313c(this.f64924a.get(), this.f64925b.get(), this.f64926c.get(), this.f64927d.get(), this.f64928e.get(), this.f64929f.get(), this.f64930g.get(), this.f64931h.get());
    }
}
