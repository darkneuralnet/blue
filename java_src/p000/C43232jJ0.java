package p000;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
/* renamed from: jJ0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43232jJ0 implements InterfaceC52409yn1 {

    /* renamed from: a */
    public Y94<C31722Am1> f92505a;

    /* renamed from: b */
    public Y94<X94<C36486Uv4>> f92506b;

    /* renamed from: c */
    public Y94<InterfaceC35934Sm1> f92507c;

    /* renamed from: d */
    public Y94<X94<U96>> f92508d;

    /* renamed from: e */
    public Y94<RemoteConfigManager> f92509e;

    /* renamed from: f */
    public Y94<C32036Bv0> f92510f;

    /* renamed from: g */
    public Y94<SessionManager> f92511g;

    /* renamed from: h */
    public Y94<C51816xn1> f92512h;

    /* renamed from: jJ0$b */
    /* loaded from: classes6.dex */
    public static final class C24805b {

        /* renamed from: a */
        public C31731An1 f92513a;

        /* renamed from: a */
        public InterfaceC52409yn1 m30808a() {
            C51679xZ3.m5006a(this.f92513a, C31731An1.class);
            return new C43232jJ0(this.f92513a);
        }

        /* renamed from: b */
        public C24805b m30807b(C31731An1 c31731An1) {
            this.f92513a = (C31731An1) C51679xZ3.m5005b(c31731An1);
            return this;
        }

        private C24805b() {
        }
    }

    /* renamed from: b */
    public static C24805b m30810b() {
        return new C24805b();
    }

    @Override // p000.InterfaceC52409yn1
    /* renamed from: a */
    public C51816xn1 mo2588a() {
        return this.f92512h.get();
    }

    /* renamed from: c */
    public final void m30809c(C31731An1 c31731An1) {
        this.f92505a = C32199Cn1.m111694a(c31731An1);
        this.f92506b = C32667En1.m108364a(c31731An1);
        this.f92507c = C32433Dn1.m109951a(c31731An1);
        this.f92508d = C33369Hn1.m103433a(c31731An1);
        this.f92509e = C32901Fn1.m106473a(c31731An1);
        this.f92510f = C31965Bn1.m113492a(c31731An1);
        C33135Gn1 m104760a = C33135Gn1.m104760a(c31731An1);
        this.f92511g = m104760a;
        this.f92512h = V51.m80429b(C33603In1.m101720a(this.f92505a, this.f92506b, this.f92507c, this.f92508d, this.f92509e, this.f92510f, m104760a));
    }

    public C43232jJ0(C31731An1 c31731An1) {
        m30809c(c31731An1);
    }
}
