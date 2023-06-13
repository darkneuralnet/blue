package p000;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
/* renamed from: In1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33603In1 implements InterfaceC48812sj1<C51816xn1> {

    /* renamed from: a */
    public final Y94<C31722Am1> f16192a;

    /* renamed from: b */
    public final Y94<X94<C36486Uv4>> f16193b;

    /* renamed from: c */
    public final Y94<InterfaceC35934Sm1> f16194c;

    /* renamed from: d */
    public final Y94<X94<U96>> f16195d;

    /* renamed from: e */
    public final Y94<RemoteConfigManager> f16196e;

    /* renamed from: f */
    public final Y94<C32036Bv0> f16197f;

    /* renamed from: g */
    public final Y94<SessionManager> f16198g;

    public C33603In1(Y94<C31722Am1> y94, Y94<X94<C36486Uv4>> y942, Y94<InterfaceC35934Sm1> y943, Y94<X94<U96>> y944, Y94<RemoteConfigManager> y945, Y94<C32036Bv0> y946, Y94<SessionManager> y947) {
        this.f16192a = y94;
        this.f16193b = y942;
        this.f16194c = y943;
        this.f16195d = y944;
        this.f16196e = y945;
        this.f16197f = y946;
        this.f16198g = y947;
    }

    /* renamed from: a */
    public static C33603In1 m101720a(Y94<C31722Am1> y94, Y94<X94<C36486Uv4>> y942, Y94<InterfaceC35934Sm1> y943, Y94<X94<U96>> y944, Y94<RemoteConfigManager> y945, Y94<C32036Bv0> y946, Y94<SessionManager> y947) {
        return new C33603In1(y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static C51816xn1 m101718c(C31722Am1 c31722Am1, X94<C36486Uv4> x94, InterfaceC35934Sm1 interfaceC35934Sm1, X94<U96> x942, RemoteConfigManager remoteConfigManager, C32036Bv0 c32036Bv0, SessionManager sessionManager) {
        return new C51816xn1(c31722Am1, x94, interfaceC35934Sm1, x942, remoteConfigManager, c32036Bv0, sessionManager);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C51816xn1 get() {
        return m101718c(this.f16192a.get(), this.f16193b.get(), this.f16194c.get(), this.f16195d.get(), this.f16196e.get(), this.f16197f.get(), this.f16198g.get());
    }
}
