package co.bird.android.app.feature.main;

import android.content.Context;
import android.os.Handler;
import co.bird.android.app.feature.main.MainActivity;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.app.feature.main.a */
/* loaded from: classes2.dex */
public final class C13776a {

    /* renamed from: co.bird.android.app.feature.main.a$a */
    /* loaded from: classes2.dex */
    public static final class C13777a implements MainActivity.InterfaceC13773a.InterfaceC13774a {
        @Override // co.bird.android.app.feature.main.MainActivity.InterfaceC13773a.InterfaceC13774a
        /* renamed from: a */
        public MainActivity.InterfaceC13773a mo60559a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, DQ3 dq3, ScopeProvider scopeProvider) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(dq3);
            C51679xZ3.m5005b(scopeProvider);
            return new C13778b(interfaceC44393lG2, baseActivity, dq3, scopeProvider);
        }

        private C13777a() {
        }
    }

    /* renamed from: co.bird.android.app.feature.main.a$b */
    /* loaded from: classes2.dex */
    public static final class C13778b implements MainActivity.InterfaceC13773a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f61567a;

        /* renamed from: b */
        public final C13778b f61568b;

        /* renamed from: c */
        public Y94<InterfaceC40001dr4> f61569c;

        /* renamed from: d */
        public Y94<C22454gl> f61570d;

        /* renamed from: e */
        public Y94<Context> f61571e;

        /* renamed from: f */
        public Y94<InterfaceC44647lh6> f61572f;

        /* renamed from: g */
        public Y94<InterfaceC35660Rh6> f61573g;

        /* renamed from: h */
        public Y94<InterfaceC22767hq> f61574h;

        /* renamed from: i */
        public Y94<InterfaceC47153pv0> f61575i;

        /* renamed from: j */
        public Y94<InterfaceC1880Ea> f61576j;

        /* renamed from: k */
        public Y94<C36207Tq4> f61577k;

        /* renamed from: l */
        public Y94<InterfaceC0650Bc> f61578l;

        /* renamed from: m */
        public Y94<InterfaceC37961aS2> f61579m;

        /* renamed from: n */
        public Y94<NV0> f61580n;

        /* renamed from: o */
        public Y94<InterfaceC43034iy2> f61581o;

        /* renamed from: p */
        public Y94<ScopeProvider> f61582p;

        /* renamed from: q */
        public Y94<InterfaceC40099e13> f61583q;

        /* renamed from: r */
        public Y94<BaseActivity> f61584r;

        /* renamed from: s */
        public Y94<C39659dH2> f61585s;

        /* renamed from: t */
        public Y94<InterfaceC38455bH2> f61586t;

        /* renamed from: u */
        public Y94<DQ3> f61587u;

        /* renamed from: v */
        public Y94<C40069dy2> f61588v;

        /* renamed from: w */
        public Y94<InterfaceC39059cI4> f61589w;

        /* renamed from: x */
        public Y94<ZC6> f61590x;

        /* renamed from: y */
        public Y94<LG2> f61591y;

        /* renamed from: z */
        public Y94<InterfaceC49136tG2> f61592z;

        /* renamed from: co.bird.android.app.feature.main.a$b$a */
        /* loaded from: classes2.dex */
        public static final class C13779a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61593a;

            public C13779a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61593a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f61593a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.app.feature.main.a$b$b */
        /* loaded from: classes2.dex */
        public static final class C13780b implements Y94<InterfaceC0650Bc> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61594a;

            public C13780b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61594a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC0650Bc get() {
                return (InterfaceC0650Bc) C51679xZ3.m5003d(this.f61594a.mo27572K0());
            }
        }

        /* renamed from: co.bird.android.app.feature.main.a$b$c */
        /* loaded from: classes2.dex */
        public static final class C13781c implements Y94<C22454gl> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61595a;

            public C13781c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61595a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C22454gl get() {
                return (C22454gl) C51679xZ3.m5003d(this.f61595a.mo27479r());
            }
        }

        /* renamed from: co.bird.android.app.feature.main.a$b$d */
        /* loaded from: classes2.dex */
        public static final class C13782d implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61596a;

            public C13782d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61596a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f61596a.mo27552R1());
            }
        }

        /* renamed from: co.bird.android.app.feature.main.a$b$e */
        /* loaded from: classes2.dex */
        public static final class C13783e implements Y94<InterfaceC22767hq> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61597a;

            public C13783e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61597a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC22767hq get() {
                return (InterfaceC22767hq) C51679xZ3.m5003d(this.f61597a.mo27540W1());
            }
        }

        /* renamed from: co.bird.android.app.feature.main.a$b$f */
        /* loaded from: classes2.dex */
        public static final class C13784f implements Y94<InterfaceC47153pv0> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61598a;

            public C13784f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61598a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC47153pv0 get() {
                return (InterfaceC47153pv0) C51679xZ3.m5003d(this.f61598a.mo27464v2());
            }
        }

        /* renamed from: co.bird.android.app.feature.main.a$b$g */
        /* loaded from: classes2.dex */
        public static final class C13785g implements Y94<NV0> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61599a;

            public C13785g(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61599a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public NV0 get() {
                return (NV0) C51679xZ3.m5003d(this.f61599a.mo27491m3());
            }
        }

        /* renamed from: co.bird.android.app.feature.main.a$b$h */
        /* loaded from: classes2.dex */
        public static final class C13786h implements Y94<InterfaceC43034iy2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61600a;

            public C13786h(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61600a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC43034iy2 get() {
                return (InterfaceC43034iy2) C51679xZ3.m5003d(this.f61600a.mo27554Q2());
            }
        }

        /* renamed from: co.bird.android.app.feature.main.a$b$i */
        /* loaded from: classes2.dex */
        public static final class C13787i implements Y94<InterfaceC37961aS2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61601a;

            public C13787i(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61601a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC37961aS2 get() {
                return (InterfaceC37961aS2) C51679xZ3.m5003d(this.f61601a.mo27550S1());
            }
        }

        /* renamed from: co.bird.android.app.feature.main.a$b$j */
        /* loaded from: classes2.dex */
        public static final class C13788j implements Y94<InterfaceC39059cI4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61602a;

            public C13788j(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61602a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC39059cI4 get() {
                return (InterfaceC39059cI4) C51679xZ3.m5003d(this.f61602a.mo27489n2());
            }
        }

        /* renamed from: co.bird.android.app.feature.main.a$b$k */
        /* loaded from: classes2.dex */
        public static final class C13789k implements Y94<InterfaceC35660Rh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61603a;

            public C13789k(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61603a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC35660Rh6 get() {
                return (InterfaceC35660Rh6) C51679xZ3.m5003d(this.f61603a.mo27500k1());
            }
        }

        /* renamed from: co.bird.android.app.feature.main.a$b$l */
        /* loaded from: classes2.dex */
        public static final class C13790l implements Y94<ZC6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61604a;

            public C13790l(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61604a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public ZC6 get() {
                return (ZC6) C51679xZ3.m5003d(this.f61604a.mo27520c1());
            }
        }

        /* renamed from: co.bird.android.app.feature.main.a$b$m */
        /* loaded from: classes2.dex */
        public static final class C13791m implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61605a;

            public C13791m(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61605a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f61605a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.app.feature.main.a$b$n */
        /* loaded from: classes2.dex */
        public static final class C13792n implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61606a;

            public C13792n(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61606a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f61606a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.app.feature.main.a$b$o */
        /* loaded from: classes2.dex */
        public static final class C13793o implements Y94<InterfaceC40001dr4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61607a;

            public C13793o(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61607a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40001dr4 get() {
                return (InterfaceC40001dr4) C51679xZ3.m5003d(this.f61607a.mo27482q());
            }
        }

        /* renamed from: co.bird.android.app.feature.main.a$b$p */
        /* loaded from: classes2.dex */
        public static final class C13794p implements Y94<InterfaceC44647lh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61608a;

            public C13794p(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61608a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44647lh6 get() {
                return (InterfaceC44647lh6) C51679xZ3.m5003d(this.f61608a.mo27459x1());
            }
        }

        @Override // co.bird.android.app.feature.main.MainActivity.InterfaceC13773a
        /* renamed from: a */
        public void mo60558a(MainActivity mainActivity) {
            m60556c(mainActivity);
        }

        /* renamed from: b */
        public final void m60557b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, DQ3 dq3, ScopeProvider scopeProvider) {
            this.f61569c = new C13793o(interfaceC44393lG2);
            this.f61570d = new C13781c(interfaceC44393lG2);
            this.f61571e = new C13782d(interfaceC44393lG2);
            this.f61572f = new C13794p(interfaceC44393lG2);
            this.f61573g = new C13789k(interfaceC44393lG2);
            this.f61574h = new C13783e(interfaceC44393lG2);
            this.f61575i = new C13784f(interfaceC44393lG2);
            this.f61576j = new C13779a(interfaceC44393lG2);
            this.f61577k = new C13792n(interfaceC44393lG2);
            this.f61578l = new C13780b(interfaceC44393lG2);
            this.f61579m = new C13787i(interfaceC44393lG2);
            this.f61580n = new C13785g(interfaceC44393lG2);
            this.f61581o = new C13786h(interfaceC44393lG2);
            this.f61582p = C39546d52.m44621a(scopeProvider);
            this.f61583q = new C13791m(interfaceC44393lG2);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(baseActivity);
            this.f61584r = m44621a;
            C40251eH2 m43058a = C40251eH2.m43058a(m44621a);
            this.f61585s = m43058a;
            this.f61586t = V51.m80429b(m43058a);
            this.f61587u = C39546d52.m44621a(dq3);
            this.f61588v = C42441hy2.m35438a(this.f61576j, this.f61571e, this.f61583q, this.f61570d);
            this.f61589w = new C13788j(interfaceC44393lG2);
            C13790l c13790l = new C13790l(interfaceC44393lG2);
            this.f61590x = c13790l;
            WG2 m78651a = WG2.m78651a(this.f61569c, this.f61570d, this.f61571e, this.f61572f, this.f61573g, this.f61574h, this.f61575i, this.f61576j, this.f61577k, this.f61578l, this.f61579m, this.f61580n, this.f61581o, this.f61582p, this.f61583q, this.f61586t, this.f61587u, this.f61588v, this.f61589w, c13790l);
            this.f61591y = m78651a;
            this.f61592z = V51.m80429b(m78651a);
        }

        /* renamed from: c */
        public final MainActivity m60556c(MainActivity mainActivity) {
            C5135Ly.m96068n(mainActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f61567a.mo27461w2()));
            C5135Ly.m96066p(mainActivity, (C36207Tq4) C51679xZ3.m5003d(this.f61567a.mo27595B1()));
            C5135Ly.m96071k(mainActivity, (Handler) C51679xZ3.m5003d(this.f61567a.mo27535X2()));
            C5135Ly.m96067o(mainActivity, (C22454gl) C51679xZ3.m5003d(this.f61567a.mo27479r()));
            C5135Ly.m96080b(mainActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f61567a.mo27519d0()));
            C5135Ly.m96075g(mainActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f61567a.mo27453z2()));
            C5135Ly.m96064r(mainActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f61567a.mo27459x1()));
            C5135Ly.m96081a(mainActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f61567a.mo27474s()));
            C5135Ly.m96073i(mainActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f61567a.mo27558P0()));
            C5135Ly.m96074h(mainActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f61567a.mo27598A0()));
            C5135Ly.m96077e(mainActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f61567a.mo27507i0()));
            C5135Ly.m96070l(mainActivity, (FO2) C51679xZ3.m5003d(this.f61567a.mo27456y2()));
            C5135Ly.m96065q(mainActivity, (YR4) C51679xZ3.m5003d(this.f61567a.mo27525b0()));
            C5135Ly.m96079c(mainActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f61567a.mo27460x()));
            C5135Ly.m96078d(mainActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f61567a.mo27517d3()));
            C5135Ly.m96072j(mainActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f61567a.mo27482q()));
            C5135Ly.m96076f(mainActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f61567a.mo27483p3()));
            C39650dG2.m44463c(mainActivity, this.f61592z.get());
            C39650dG2.m44465a(mainActivity, (NV0) C51679xZ3.m5003d(this.f61567a.mo27491m3()));
            return mainActivity;
        }

        public C13778b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, DQ3 dq3, ScopeProvider scopeProvider) {
            this.f61568b = this;
            this.f61567a = interfaceC44393lG2;
            m60557b(interfaceC44393lG2, baseActivity, dq3, scopeProvider);
        }
    }

    private C13776a() {
    }

    /* renamed from: a */
    public static MainActivity.InterfaceC13773a.InterfaceC13774a m60560a() {
        return new C13777a();
    }
}
