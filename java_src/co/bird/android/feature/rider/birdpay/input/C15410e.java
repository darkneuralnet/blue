package co.bird.android.feature.rider.birdpay.input;

import android.os.Handler;
import co.bird.android.feature.rider.birdpay.input.C15365d;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.rider.birdpay.input.e */
/* loaded from: classes3.dex */
public final class C15410e implements InterfaceC48812sj1<C15365d> {

    /* renamed from: a */
    public final Y94<C15365d.C15383a> f65011a;

    /* renamed from: b */
    public final Y94<InterfaceC12377bO> f65012b;

    /* renamed from: c */
    public final Y94<ScopeProvider> f65013c;

    /* renamed from: d */
    public final Y94<InterfaceC1880Ea> f65014d;

    /* renamed from: e */
    public final Y94<InterfaceC23227iO> f65015e;

    /* renamed from: f */
    public final Y94<InterfaceC49950ue3> f65016f;

    /* renamed from: g */
    public final Y94<InterfaceC52757zN3> f65017g;

    /* renamed from: h */
    public final Y94<V74> f65018h;

    /* renamed from: i */
    public final Y94<InterfaceC44647lh6> f65019i;

    /* renamed from: j */
    public final Y94<Handler> f65020j;

    /* renamed from: k */
    public final Y94<InterfaceC40099e13> f65021k;

    /* renamed from: l */
    public final Y94<C36207Tq4> f65022l;

    public C15410e(Y94<C15365d.C15383a> y94, Y94<InterfaceC12377bO> y942, Y94<ScopeProvider> y943, Y94<InterfaceC1880Ea> y944, Y94<InterfaceC23227iO> y945, Y94<InterfaceC49950ue3> y946, Y94<InterfaceC52757zN3> y947, Y94<V74> y948, Y94<InterfaceC44647lh6> y949, Y94<Handler> y9410, Y94<InterfaceC40099e13> y9411, Y94<C36207Tq4> y9412) {
        this.f65011a = y94;
        this.f65012b = y942;
        this.f65013c = y943;
        this.f65014d = y944;
        this.f65015e = y945;
        this.f65016f = y946;
        this.f65017g = y947;
        this.f65018h = y948;
        this.f65019i = y949;
        this.f65020j = y9410;
        this.f65021k = y9411;
        this.f65022l = y9412;
    }

    /* renamed from: a */
    public static C15410e m57166a(Y94<C15365d.C15383a> y94, Y94<InterfaceC12377bO> y942, Y94<ScopeProvider> y943, Y94<InterfaceC1880Ea> y944, Y94<InterfaceC23227iO> y945, Y94<InterfaceC49950ue3> y946, Y94<InterfaceC52757zN3> y947, Y94<V74> y948, Y94<InterfaceC44647lh6> y949, Y94<Handler> y9410, Y94<InterfaceC40099e13> y9411, Y94<C36207Tq4> y9412) {
        return new C15410e(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410, y9411, y9412);
    }

    /* renamed from: c */
    public static C15365d m57164c(C15365d.C15383a c15383a, InterfaceC12377bO interfaceC12377bO, ScopeProvider scopeProvider, InterfaceC1880Ea interfaceC1880Ea, InterfaceC23227iO interfaceC23227iO, InterfaceC49950ue3 interfaceC49950ue3, InterfaceC52757zN3 interfaceC52757zN3, V74 v74, InterfaceC44647lh6 interfaceC44647lh6, Handler handler, InterfaceC40099e13 interfaceC40099e13, C36207Tq4 c36207Tq4) {
        return new C15365d(c15383a, interfaceC12377bO, scopeProvider, interfaceC1880Ea, interfaceC23227iO, interfaceC49950ue3, interfaceC52757zN3, v74, interfaceC44647lh6, handler, interfaceC40099e13, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C15365d get() {
        return m57164c(this.f65011a.get(), this.f65012b.get(), this.f65013c.get(), this.f65014d.get(), this.f65015e.get(), this.f65016f.get(), this.f65017g.get(), this.f65018h.get(), this.f65019i.get(), this.f65020j.get(), this.f65021k.get(), this.f65022l.get());
    }
}
