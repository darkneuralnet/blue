package p000;

import android.os.Handler;
import co.bird.android.feature.payment.preload.p013v2.options.PreloadV2OptionsActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: p14  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46623p14 implements InterfaceC48812sj1<C44844m14> {

    /* renamed from: a */
    public final Y94<InterfaceC44647lh6> f102953a;

    /* renamed from: b */
    public final Y94<InterfaceC46820pM3> f102954b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f102955c;

    /* renamed from: d */
    public final Y94<VM3> f102956d;

    /* renamed from: e */
    public final Y94<Handler> f102957e;

    /* renamed from: f */
    public final Y94<DL3> f102958f;

    /* renamed from: g */
    public final Y94<PreloadV2OptionsActivity> f102959g;

    /* renamed from: h */
    public final Y94<InterfaceC40099e13> f102960h;

    /* renamed from: i */
    public final Y94<ScopeProvider> f102961i;

    /* renamed from: j */
    public final Y94<C22454gl> f102962j;

    public C46623p14(Y94<InterfaceC44647lh6> y94, Y94<InterfaceC46820pM3> y942, Y94<InterfaceC1880Ea> y943, Y94<VM3> y944, Y94<Handler> y945, Y94<DL3> y946, Y94<PreloadV2OptionsActivity> y947, Y94<InterfaceC40099e13> y948, Y94<ScopeProvider> y949, Y94<C22454gl> y9410) {
        this.f102953a = y94;
        this.f102954b = y942;
        this.f102955c = y943;
        this.f102956d = y944;
        this.f102957e = y945;
        this.f102958f = y946;
        this.f102959g = y947;
        this.f102960h = y948;
        this.f102961i = y949;
        this.f102962j = y9410;
    }

    /* renamed from: a */
    public static C46623p14 m20145a(Y94<InterfaceC44647lh6> y94, Y94<InterfaceC46820pM3> y942, Y94<InterfaceC1880Ea> y943, Y94<VM3> y944, Y94<Handler> y945, Y94<DL3> y946, Y94<PreloadV2OptionsActivity> y947, Y94<InterfaceC40099e13> y948, Y94<ScopeProvider> y949, Y94<C22454gl> y9410) {
        return new C46623p14(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410);
    }

    /* renamed from: c */
    public static C44844m14 m20143c(InterfaceC44647lh6 interfaceC44647lh6, InterfaceC46820pM3 interfaceC46820pM3, InterfaceC1880Ea interfaceC1880Ea, VM3 vm3, Handler handler, DL3 dl3, PreloadV2OptionsActivity preloadV2OptionsActivity, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider, C22454gl c22454gl) {
        return new C44844m14(interfaceC44647lh6, interfaceC46820pM3, interfaceC1880Ea, vm3, handler, dl3, preloadV2OptionsActivity, interfaceC40099e13, scopeProvider, c22454gl);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C44844m14 get() {
        return m20143c(this.f102953a.get(), this.f102954b.get(), this.f102955c.get(), this.f102956d.get(), this.f102957e.get(), this.f102958f.get(), this.f102959g.get(), this.f102960h.get(), this.f102961i.get(), this.f102962j.get());
    }
}
